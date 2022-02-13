package task18.filter;

import sportswear.footwear.Footwear;

import java.util.Collection;

public interface Filter {

 default void searchByVendorCode(Collection<Footwear> footwearArrayList, String vendorCode) {
        for (Footwear footwear : footwearArrayList) {
            if (vendorCode.equals(footwear.getVendorCode()))
                System.out.println(footwear);
        }
    }

  default void searchBySize(Collection<Footwear> footwearArrayList, int size) {
        for (Footwear footwear : footwearArrayList) {
            if (size == footwear.getSize())
                System.out.println(footwear);
        }
    }

   default void searchByBrand(Collection<Footwear> footwearArrayList, String brand) {
        for (Footwear footwear : footwearArrayList) {
            if (brand.equals(footwear.getBrand()))
                System.out.println(footwear);
        }
    }

   default void searchByPrice(Collection<Footwear> footwearArrayList, int price) {
        for (Footwear footwear : footwearArrayList) {
            if (price == footwear.getPrice())
                System.out.println(footwear);
        }
    }

   default void searchByGender(Collection<Footwear> footwearArrayList, String gender) {
        for (Footwear footwear : footwearArrayList) {
            if (gender.equals(footwear.getGender()))
                System.out.println(footwear);
        }
    }

   default void searchByColor(Collection<Footwear> footwearArrayList, String color) {
        for (Footwear footwear : footwearArrayList) {
            if (color.equals(footwear.getColor()))
                System.out.println(footwear);
        }
    }

 default void searchByModel(Collection<Footwear> footwearArrayList, String model) {
        for (Footwear footwear : footwearArrayList) {
            if (model.equals(footwear.getModel()))
                System.out.println(footwear);
        }
    }


}

