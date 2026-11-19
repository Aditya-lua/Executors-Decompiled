package com.withpersona.sdk2.inquiry.tracking.network;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.tracking.model.b;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import jn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequestJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;)V", "Lhn/m$b;", "options", "Lhn/m$b;", "stringAdapter", "Lhn/h;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EncryptedTrackingEventsRequestJsonAdapter extends h<EncryptedTrackingEventsRequest> {

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public EncryptedTrackingEventsRequestJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("key_version", "encrypted_key", "event");
        bVarA.getClass();
        this.options = bVarA;
        this.stringAdapter = b.a(wVar, String.class, "keyVersion");
    }

    @NotNull
    public String toString() {
        return com.withpersona.sdk2.inquiry.tracking.model.a.a("GeneratedJsonAdapter(EncryptedTrackingEventsRequest)", 52);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public EncryptedTrackingEventsRequest fromJson(@NotNull m reader) {
        reader.getClass();
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.x("keyVersion", "key_version", reader);
                }
            } else if (I == 1) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw c.x("encryptedKey", "encrypted_key", reader);
                }
            } else if (I == 2 && (strFromJson3 = this.stringAdapter.fromJson(reader)) == null) {
                throw c.x("event", "event", reader);
            }
        }
        reader.d();
        if (strFromJson == null) {
            throw c.o("keyVersion", "key_version", reader);
        }
        if (strFromJson2 == null) {
            throw c.o("encryptedKey", "encrypted_key", reader);
        }
        if (strFromJson3 != null) {
            return new EncryptedTrackingEventsRequest(strFromJson, strFromJson2, strFromJson3);
        }
        throw c.o("event", "event", reader);
    }

    @Override // hn.h
    public void toJson(@NotNull t writer, @Nullable EncryptedTrackingEventsRequest value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("key_version");
        this.stringAdapter.toJson(writer, value_.getKeyVersion());
        writer.o("encrypted_key");
        this.stringAdapter.toJson(writer, value_.getEncryptedKey());
        writer.o("event");
        this.stringAdapter.toJson(writer, value_.getEvent());
        writer.g();
    }
}
