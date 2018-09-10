package pl.movie.rental.model;

import com.mysema.query.types.path.*;

import java.util.ArrayList;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

public class QMovie extends EntityPathBase<Movie> {

    public QMovie( String variable) {
        super(Movie.class, forVariable(variable));
    }
    public static final QMovie movie = new QMovie("movie");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath title = createString("title");

    public final StringPath code = createString("code");

    public final StringPath country = createString("country");

    public final StringPath genre = createString("genre");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final ListPath<Movie, QMovie> rentPeriodList = createList("rentPeriodList", Movie.class, QMovie.class, PathInits.DEFAULT);
}
