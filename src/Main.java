public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "23", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd hyundaiAd = new VehicleAd("Hyundai", "71", new CarType(), new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, hyundaiAd});
        adsService.filterByVehicleTypeByFuel(new PetrolType());

        System.out.println();

        adsService.filterByVehicleTypeByPurpose(new TruckType());
    }
}