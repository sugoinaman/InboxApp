package com.example.inboxapp.folders;


import com.datastax.driver.mapping.annotations.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@Getter
@Setter
@Table(name = "folders_by_user")
public class Folder {


    @PrimaryKeyColumn(name = "userid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String userId;

    @PrimaryKeyColumn(name = "label", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    private String label;
    //we wanted our labels in one node, for some reason.

    @CassandraType(type = CassandraType.Name.TEXT)
    private String color;


}
