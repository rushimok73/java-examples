package designPatterns.adapter;

public class NewServiceAdapter extends ExistingService {
    NewService newService;

    public NewServiceAdapter(NewService s) {
        this.newService = s;
    }
    @Override
    public void serviceFunction() {
        newService.newServiceFunction();
    }
}
