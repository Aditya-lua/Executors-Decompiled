package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent_InquiryPermissionEventJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;)V", "Lum/m$b;", "options", "Lum/m$b;", "stringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "nullablePermissionTrackingEventDataAdapter", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEvent_InquiryPermissionEventJsonAdapter extends AbstractC11873h<TrackingEvent.InquiryPermissionEvent> {

    @NotNull
    private final AbstractC11873h<PermissionTrackingEventData> nullablePermissionTrackingEventDataAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public TrackingEvent_InquiryPermissionEventJsonAdapter(@NotNull C11888w c11888w) {
        c11888w.getClass();
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("id", "data", "created_at");
        bVarM44343a.getClass();
        this.options = bVarM44343a;
        this.stringAdapter = AbstractC4112b.m20956a(c11888w, String.class, "id");
        this.nullablePermissionTrackingEventDataAdapter = AbstractC4112b.m20956a(c11888w, PermissionTrackingEventData.class, "data");
    }

    @NotNull
    public String toString() {
        return AbstractC4111a.m20955a("GeneratedJsonAdapter(TrackingEvent.InquiryPermissionEvent)", 58);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public TrackingEvent.InquiryPermissionEvent fromJson(@NotNull AbstractC11878m reader) {
        reader.getClass();
        reader.mo44325b();
        String strFromJson = null;
        String strFromJson2 = null;
        PermissionTrackingEventData permissionTrackingEventDataFromJson = null;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw C12494c.m46811x("id", "id", reader);
                }
            } else if (iMo44316F == 1) {
                permissionTrackingEventDataFromJson = this.nullablePermissionTrackingEventDataAdapter.fromJson(reader);
            } else if (iMo44316F == 2 && (strFromJson2 = this.stringAdapter.fromJson(reader)) == null) {
                throw C12494c.m46811x("createdAt", "created_at", reader);
            }
        }
        reader.mo44327d();
        if (strFromJson == null) {
            throw C12494c.m46802o("id", "id", reader);
        }
        if (strFromJson2 != null) {
            return new TrackingEvent.InquiryPermissionEvent(strFromJson, permissionTrackingEventDataFromJson, strFromJson2);
        }
        throw C12494c.m46802o("createdAt", "created_at", reader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable TrackingEvent.InquiryPermissionEvent value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo44380n("data");
        this.nullablePermissionTrackingEventDataAdapter.toJson(writer, value_.getData());
        writer.mo44380n("created_at");
        this.stringAdapter.toJson(writer, value_.getCreatedAt());
        writer.mo44378g();
    }
}
