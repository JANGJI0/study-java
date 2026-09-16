package poly.ex.pay1;

import static2.DecoData;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("newPay")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
