package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent_InquirySelfiePoseDetectEventJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;)V", "Lum/m$b;", "options", "Lum/m$b;", "stringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "nullableSelfiePoseDetectEventDataAdapter", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingEvent_InquirySelfiePoseDetectEventJsonAdapter extends h<TrackingEvent.InquirySelfiePoseDetectEvent> {

    @NotNull
    private final h<SelfiePoseDetectEventData> nullableSelfiePoseDetectEventDataAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public TrackingEvent_InquirySelfiePoseDetectEventJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("id", "data", "created_at");
        bVarA.getClass();
        this.options = bVarA;
        this.stringAdapter = b.a(wVar, String.class, "id");
        this.nullableSelfiePoseDetectEventDataAdapter = b.a(wVar, SelfiePoseDetectEventData.class, "data");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(TrackingEvent.InquirySelfiePoseDetectEvent)", 64);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public TrackingEvent.InquirySelfiePoseDetectEvent fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        SelfiePoseDetectEventData selfiePoseDetectEventDataFromJson = null;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.x("id", "id", reader);
                }
            } else if (iF == 1) {
                selfiePoseDetectEventDataFromJson = this.nullableSelfiePoseDetectEventDataAdapter.fromJson(reader);
            } else if (iF == 2 && (strFromJson2 = this.stringAdapter.fromJson(reader)) == null) {
                throw c.x("createdAt", "created_at", reader);
            }
        }
        reader.d();
        if (strFromJson == null) {
            throw c.o("id", "id", reader);
        }
        if (strFromJson2 != null) {
            return new TrackingEvent.InquirySelfiePoseDetectEvent(strFromJson, selfiePoseDetectEventDataFromJson, strFromJson2);
        }
        throw c.o("createdAt", "created_at", reader);
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable TrackingEvent.InquirySelfiePoseDetectEvent value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.n("data");
        this.nullableSelfiePoseDetectEventDataAdapter.toJson(writer, value_.getData());
        writer.n("created_at");
        this.stringAdapter.toJson(writer, value_.getCreatedAt());
        writer.g();
    }
}
