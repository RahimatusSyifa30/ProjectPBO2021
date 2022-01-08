package Controller07276;
import Entity07276.RecordEntity;

public interface RecordControllerInterface {
    public void InsertRecord(String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan);
    public void UpdateRedord(int index, String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan); 
    public void DeleteRecord(int index);
    public String ViewDataRecord();
}
