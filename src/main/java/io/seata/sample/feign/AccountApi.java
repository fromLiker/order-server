//package io.seata.sample.feign;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * @author Liker
// */
//@FeignClient(value = "account-server")
//public interface AccountApi {
//
//    /**
//     * a扣减账户余额
//     * @param userId 用户id
//     * @param money 金额
//     * @return
//     */
//    @RequestMapping("/account/decrease")
//    String decrease(@RequestParam("userid") Integer userid, @RequestParam("money") Integer money);
//}
