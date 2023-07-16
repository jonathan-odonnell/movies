package dev.movies.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    
}
