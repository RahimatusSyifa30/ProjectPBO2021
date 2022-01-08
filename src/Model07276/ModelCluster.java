package Model07276;
import java.util.ArrayList;
import java.util.List;
import Entity07276.ClusterEntity;

public class ModelCluster {
    List<ClusterEntity> clusters = new ArrayList<ClusterEntity>();

public void setClusters(List<ClusterEntity >clusters) {
        this.clusters = clusters;
}
public List<ClusterEntity>getClusters(){
    return clusters;
}
}
