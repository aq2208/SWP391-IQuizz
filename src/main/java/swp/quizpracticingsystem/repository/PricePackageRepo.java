package swp.quizpracticingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swp.quizpracticingsystem.model.PricePackage;

import java.util.List;

@Repository
public interface PricePackageRepo extends JpaRepository<PricePackage, Integer> {
    @Override
    public List<PricePackage> findAll();

}