package step02;

public class Main {

    public static void main(String[] args) throws Exception {
        LottoShop lottoShop = new LottoShop();
        Lottos lottos = lottoShop.buyLotto(InputView.inputMoney(), new RandomNumberRule());
        ResultView.showBuyLottoResult(lottos);

        LottoWinner lottoWinner = new LottoWinner(new InputNumberRule(InputView.inputLastWinnerNumber()));
        ResultView.showLottoWinnerResult();

    }
}
