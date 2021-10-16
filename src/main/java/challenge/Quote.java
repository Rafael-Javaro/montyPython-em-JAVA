package challenge;

import javax.persistence.*;

@Entity(name= "scripts")
public class Quote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "actor")
	private String actor;

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Column(name = "detail")
	private String quote;

	public String getQuote() {
		return this.quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}

/*Na coluna detail estão as frases que devem ser apresentadas pela API. Na coluna actor, consta o nome do ator.*/

/*"id" INTEGER PRIMARY KEY,
  "episode" INTEGER,
  "episode_name" TEXT,
  "segment" TEXT,
  "type" TEXT,
  "actor" TEXT,
  "character" TEXT,
  "detail" TEXT,
  "record_date" TIMESTAMP,
  "series" TEXT,
  "transmission_date" TIMESTAMP*/