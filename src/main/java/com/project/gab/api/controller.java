// package com.project.gab.api;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.project.gab.service.CustomerService;

// @RestController
// @RequestMapping("/api")
// public class controller {
//     @Autowired
// 	private CustomerService customerService;



//     @GetMapping
//     public ResponseEntity<String> he(){
//         return ResponseEntity.ok(" hello");
//     }

 
// 	@PostMapping("/customer")
// 	public void createCustomer(@RequestBody Customer customer) {
// 		customerService.createCustomer(customer);
// 		accountController.createAccount(customer.getAcctID(), 0, "Active");
// 	}

// 	@GetMapping("/customer/{acctID}")
// 	public Customer getCustomerInfo(@PathVariable int acctID) {
// 		return customerService.getCustomerInfo(acctID);
// 	}

// 	@DeleteMapping("/customer/{acctID}")
// 	public void deleteCustomer(@PathVariable int acctID) {
// 		customerService.deleteCustomer(acctID);
// 	}


// }


// // import java.net.URI;
// // import java.util.List;

// // import org.springframework.http.ResponseEntity;
// // import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.PostMapping;
// // import org.springframework.web.bind.annotation.RequestBody;
// // import org.springframework.web.bind.annotation.RequestMapping;
// // import org.springframework.web.bind.annotation.RestController;
// // import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// // import com.project.gab.entity.Customer;
// // import com.project.gab.entity.Role;
// // import com.project.gab.service.CustomerService;

// // import lombok.Data;
// // import lombok.RequiredArgsConstructor;

// // @RestController
// // @RequestMapping("/api")
// // @RequiredArgsConstructor
// // public class controller {

// //     private final CustomerService customerService;

// //     @GetMapping("/users")
// //     public ResponseEntity<List<Customer>>getCustomers(){
// //         return ResponseEntity.ok().body(customerService.getCustomers());
// //     }

// //     @PostMapping("/user/save")
// //     public ResponseEntity<Customer>saveCustomer(@RequestBody Customer customer){
// //         URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
// //         return ResponseEntity.created(uri).body(customerService.saveCustomer(customer));
// //     }

// //     @PostMapping("/role/save")
// //     public ResponseEntity<Role>saveRole(@RequestBody Role role){
// //         URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
// //         return ResponseEntity.created(uri).body(customerService.saveRole(role));
// //     }

// //     @PostMapping("/role/addtouser")
// //     public ResponseEntity<Role>addRoleToCustomer(@RequestBody RoleToCustomerForm form){
// //         customerService.addRoleToCustomer(form.getUsername(), form.getRoleName());
// //         return ResponseEntity.ok().build();
// //     }

    
    
// // }
// // @Data
// // class RoleToCustomerForm{
// //     private String username;
// //     private String roleName;
// // }
