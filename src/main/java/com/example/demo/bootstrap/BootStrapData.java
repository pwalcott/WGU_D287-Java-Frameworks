package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long partCount = partRepository.count();
        long productCount = productRepository.count();

        if (partCount == 0 && productCount == 0) {
            // Code to add sample inventory
            OutsourcedPart Lens = new OutsourcedPart();
            Lens.setCompanyName("Flashmart");
            Lens.setName("Lens");
            Lens.setInv(25);
            Lens.setPrice(99.99);
            Lens.setMinimum(5);
            Lens.setMaximum(50);
            Lens.setId(1000L);

            OutsourcedPart Battery1000 = new OutsourcedPart();
            Battery1000.setCompanyName("Flashmart");
            Battery1000.setName("Battery");
            Battery1000.setInv(40);
            Battery1000.setPrice(199.99);
            Battery1000.setMinimum(3);
            Battery1000.setMaximum(75);
            Battery1000.setId(2000L);

            OutsourcedPart SdCard = new OutsourcedPart();
            SdCard.setCompanyName("Flashmart");
            SdCard.setName("SD Card");
            SdCard.setInv(15);
            SdCard.setPrice(99.99);
            SdCard.setMinimum(10);
            SdCard.setMaximum(200);
            SdCard.setId(3000L);

            OutsourcedPart Tripod1000 = new OutsourcedPart();
            Tripod1000.setCompanyName("Flashmart");
            Tripod1000.setName("Tripod");
            Tripod1000.setInv(20);
            Tripod1000.setPrice(29.99);
            Tripod1000.setMinimum(5);
            Tripod1000.setMaximum(25);
            Tripod1000.setId(4000L);

            OutsourcedPart CamBag1000 = new OutsourcedPart();
            CamBag1000.setCompanyName("Flashmart");
            CamBag1000.setName("Camera Bag");
            CamBag1000.setInv(10);
            CamBag1000.setPrice(19.99);
            CamBag1000.setMinimum(2);
            CamBag1000.setMaximum(10);
            CamBag1000.setId(5000L);

            outsourcedPartRepository.save(Lens);
            outsourcedPartRepository.save(Battery1000);
            outsourcedPartRepository.save(SdCard);
            outsourcedPartRepository.save(Tripod1000);
            outsourcedPartRepository.save(CamBag1000);

            Product PointandShootCamera = new Product("Point and Shoot Camera", 99.99, 15);
            Product ActionCamera = new Product("Action Camera", 199.99, 10);
            Product MirrorlessCamera = new Product("Mirrorless Camera", 299.99, 20);
            Product DSLR = new Product("Digital Single Lens Reflex (DSLR) Camera", 399.99, 5);
            Product CompactSystemCamera = new Product("Compact System Camera", 499.99, 3);

            productRepository.save(PointandShootCamera);
            productRepository.save(ActionCamera);
            productRepository.save(MirrorlessCamera);
            productRepository.save(DSLR);
            productRepository.save(CompactSystemCamera);
        } else {
            System.out.println("Sample inventory is already loaded. Skipping addition.");
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products: " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts: " + partRepository.count());
        System.out.println(partRepository.findAll());
    }
}