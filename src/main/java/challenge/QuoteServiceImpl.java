package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		List<Quote> quoteList = this.repository.findAll();
		return  quoteList.get(new Random().nextInt(quoteList.size()));
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> quotesByActor = this.repository.getByActor(actor);
		return quotesByActor.get(new Random().nextInt(quotesByActor.size()));
	}


}
