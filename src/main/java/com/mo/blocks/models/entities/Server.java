package com.mo.blocks.models.entities;

import com.mo.blocks.contants.ActiveFlag;
import com.mo.blocks.contants.EnableFlag;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="BLOCK_SERVER_TB")
@EntityListeners(value={AuditingEntityListener.class})
@Data
public class Server {

    @Id
    @Column(name = "server_sq")
    public Integer serverSequence;

    @Column(name = "protocol")
    public Byte protocol;

    @Column(name = "host")
    public String host;

    @Column(name = "port")
    public String port;

    @Column(name = "prefix")
    public String prefix;

    // CommonArea

    @Column(name = "disp_ord")
    public Integer displayOrder;

    @Column(name = "disp_nm")
    public String displayName;

    @Column(name = "`desc`")
    public String desc;

    @Column(name = "active_fl", nullable = false)
    public Byte activeFlag = ActiveFlag.Y.getValue();

    @Column(name = "enable_fl", nullable = false)
    public Byte enableFlag = EnableFlag.Y.getValue();

    @CreatedDate
    @Column(name = "created_dt", nullable = false, updatable = false)
    public LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "updated_dt")
    public LocalDateTime updatedDate;

    @CreatedBy
    @Column(name = "writer", nullable = false, updatable = false)
    public String writer;

    @LastModifiedBy
    @Column(name = "editor")
    public String editor;

}
