//package io.seata.sample.feign;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * @author Liker
// */
//@FeignClient(value = "storage-server")
//public interface StorageApi {
//
//    /**
//     * a扣减库存
//     * @param productId
//     * @param count
//     * @return
//     */
//    @GetMapping(value = "/storage/decrease")
//    String decrease(@RequestParam("productid") Integer productid, @RequestParam("countnum") Integer countnum);
//    
//}
