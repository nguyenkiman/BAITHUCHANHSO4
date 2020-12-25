package com.example.baithuchanhso4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> productArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productArrayList = new ArrayList<>();
        Product product1 = new Product();
        product1.setName("Cafe Đá Xay-Lạnh");
        product1.setPrice(59000);
        product1.setImage(R.drawable.coffeedaxay);
        ArrayList<Size> sizes1 = new ArrayList<>();
        sizes1.add(new Size("Nhỏ",0));
        sizes1.add(new Size("Vừa",6000));
        product1.setSizeArrayList(sizes1);
        product1.setDescription("Một phiên bản upgrade từ ly cà phê sữa quen thuộc, nhưng lại tỉnh táo và tưới mát" +
                "hơn bở lớp đã xay đi kèm. Nhấp 1 ngụm là thấy đã, ngụm thứ hai thêm tỉnh táo và cứ thế lôi" +
                "cuối bạn đến giọt cuối cùng");
        productArrayList.add(product1);

        Product product2 = new Product();
        product2.setName("Americano Đá");
        product2.setPrice(40000);
        product2.setImage(R.drawable.americanoda);
        ArrayList<Size> sizes2 = new ArrayList<>();
        sizes2.add(new Size("Nhỏ",0));
        sizes2.add(new Size("Vừa",5000));
        product2.setSizeArrayList(sizes2);
        ArrayList<Topping> toppings2 = new ArrayList<>();
        toppings2.add(new Topping("Expresso(1shot)",10000));
        product2.setToppingArrayList(toppings2);
        product2.setDescription("Americano được pha chế bằng cách thêm nước vào một hoặc hai shot Expressp" +
                " để pha loãng độ đặc của cà phê, từ đó mang lại hương vị nhẹ nhàng, không gắt mạnh và vẫn thơm" +
                " nồng nàn.");
        productArrayList.add(product2);

        Product product3 = new Product();
        product3.setName("Cappuchino Nóng");
        product3.setPrice(50000);
        product3.setImage(R.drawable.cappuchino);
        ArrayList<Size> sizes3 = new ArrayList<>();
        sizes3.add(new Size("Nhỏ",0));
        sizes3.add(new Size("Vừa",5000));
        product3.setSizeArrayList(sizes3);
        ArrayList<Topping> toppings3 = new ArrayList<>();
        toppings3.add(new Topping("Expresso(1shot)",10000));
        product3.setToppingArrayList(toppings3);
        product3.setDescription("Cappuchino được gọi vui là thức uống một phần ba - 1/3 Expresso, 1/3 Sữa nóng, 1/3 Foam");
        productArrayList.add(product3);

        Product product4 = new Product();
        product4.setName("Cafe Sữa Nóng");
        product4.setPrice(35000);
        product4.setSizeArrayList(sizes1);
        product4.setDescription("Cà phê phin kết hợp cùng sữa đặc là một sáng tạo đầy tự hào của người Việt, được xem món uống thương hiệu của Việt Nam");
        product4.setImage(R.drawable.coffeesua);

        Product product5 = new Product();
        product5.setName("Cafe Đen Đá");
        product5.setPrice(32000);
        ArrayList<Size> sizes5 = new ArrayList<>();
        sizes5.add(new Size("Nhỏ",0));
        sizes5.add(new Size("Vừa",3000));
        sizes5.add(new Size("Lớn",6000));
        product5.setSizeArrayList(sizes5);
        product5.setDescription("Một tách cà phê đen thơm ngào ngạt, phảng phất mù cacao là món quá tự thưởng tuyệt vời" +
                "nhất cho những ai mê đắm tinh chất nguyên bản của cà phê. Một tách cà phê trầm lắm, thi vị giữa dòng đời" +
                "vồn vã.");
        product5.setImage(R.drawable.coffeedaxay);

        Product product6 = new Product();
        product6.setName("Cold Brew Truyền Thống");
        product6.setPrice(45000);
        ArrayList<Size> sizes6 = new ArrayList<>();
        sizes6.add(new Size("Vừa",0));
        sizes6.add(new Size("Lớn",5000));
        product6.setSizeArrayList(sizes6);
        product6.setDescription("Nguyên bản và tươi mới với hương gỗ thông, hạt dẻ, nốt sô cô la đặc trưng, hương khói nhẹ của hạt Arabia Cầu Đất");
        product6.setImage(R.drawable.coffeedenda);

        Product product7 = new Product();
        product7.setName("OOlong Hạt Sen - Đá");
        product7.setPrice(59000);
        ArrayList<Size> sizes7 = new ArrayList<>();
        sizes7.add(new Size("Nhỏ",0));
        sizes7.add(new Size("Vừa",7000));
        sizes7.add(new Size("Lớn",14000));
        product7.setSizeArrayList(sizes7);
        ArrayList<Topping> toppings7 = new ArrayList<>();
        toppings7.add(new Topping("Extra foam",10000));
        toppings7.add(new Topping("Sen ngâm",10000));
        product2.setToppingArrayList(toppings2);
        product7.setDescription("Trà OOlong và hạt Sen đều là những thành phần tốt cho sức khỏe với công" +
                " dụng thanh lọc cơ thể, giải nhiệt và làm đẹp. Trà OOlong Sen An nhiên có vị thành mát của " +
                "trà và sen, vị ngọt dịu");
        product7.setImage(R.drawable.olonghatsen);

        Product product8 = new Product();
        product8.setName("Trà Sữa Khoai Môn");
        product8.setPrice(42000);
        ArrayList<Size> sizes8 = new ArrayList<>();
        sizes8.add(new Size("Nhỏ",0));
        sizes8.add(new Size("Vừa",3000));
        sizes8.add(new Size("Lớn",10000));
        product8.setSizeArrayList(sizes8);
        ArrayList<Topping> toppings8 = new ArrayList<>();
        toppings8.add(new Topping("Trân châu trắng",10000));
        toppings8.add(new Topping("Khoai môn",10000));
        product8.setToppingArrayList(toppings2);
        product8.setDescription("Vị khoai môn thơm ngon quyện cùng nền trà lài hỏa hạng - tạo nên ly Trà Sữa huyền thoại" +
                " ngọt bùi đầy cân bằng. Có sẵn khoai môn thiệt mềm mềm cho từng ngụm thiệt đã");
        product8.setImage(R.drawable.trasuakhoaimon);

        productArrayList.add(product4);
        productArrayList.add(product5);
        productArrayList.add(product6);
        productArrayList.add(product7);
        productArrayList.add(product8);


        RecyclerView recyclerView = findViewById(R.id.productrecylerview);
        ProductAdapter productAdapter = new ProductAdapter(productArrayList,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(productAdapter);
    }
}