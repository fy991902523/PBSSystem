package pbs.base.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.pojo.vo.PageQuery;
import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;
import pbs.base.process.result.DataGridResultInfo;
import pbs.base.service.BikeService;

@Controller
@RequestMapping("/bike")
public class BikeAction {
	
	@Autowired
	private BikeService bikeService;
	
	int start = 0;

	@RequestMapping("/querybike")
	public String queryBike(Model model)throws Exception{
		
		return "/base/bike/querybike";
	}
	
	@RequestMapping("/querybike_result")
	public @ResponseBody DataGridResultInfo queryBike_result(
			PbsBikeInfoQueryVo pbsBikeInfoQueryVo,
			int page,//页码
			int rows//每页显示个数
			)throws Exception{

		//非空校验
		pbsBikeInfoQueryVo = pbsBikeInfoQueryVo!=null?pbsBikeInfoQueryVo:new PbsBikeInfoQueryVo();
		int total = bikeService.findPbsBikeInfoCount(pbsBikeInfoQueryVo);
		
		PageQuery pageQuery = new PageQuery();
		pageQuery.handle(page,rows);
		pbsBikeInfoQueryVo.setPageQuery(pageQuery);
		List<PbsBikeInfoCustom> list = bikeService.findPbsBikeInfoList(pbsBikeInfoQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	//添加用户页面
	@RequestMapping("/addbike")
	public String addBike(Model model)throws Exception{
		
		return "/base/bike/addbike";
	}
	
	//添加用户提交
	@RequestMapping("/addbikesubmit")
	public @ResponseBody Map<String,Object> addBikeSubmit(PbsBikeInfoQueryVo pbsBikeInfoQueryVo)throws Exception{
		
		String message = "操作成功!!";
		int type=0;//成功
		try {
			bikeService.insertPbsBikeInfo(pbsBikeInfoQueryVo.getPbsBikeInfoCustom());
		} catch (Exception e) {
			e.printStackTrace();
			message = e.getMessage();
			type=1;//失败
		}
		
		Map<String, Object> result_map = new HashMap<String, Object>();
		result_map.put("type", type);
		result_map.put("message", message);
		
		return result_map;
	}
}
