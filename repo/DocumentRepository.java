package in.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nit.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

	@Query(" select doc.docId, doc.docName from in.nit.model.Document doc ")
	List<Object[]> findIdAndName();
}
