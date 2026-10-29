package com.withpersona.sdk2.inquiry.p057ui.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11891z;
import p560xu.C12924e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/JsonObjectAdapter;", "", "<init>", "()V", "Lum/t;", "writer", "Lorg/json/JSONObject;", "value", "", "toJson", "(Lum/t;Lorg/json/JSONObject;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lorg/json/JSONObject;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class JsonObjectAdapter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final JsonObjectAdapter f17802a = new JsonObjectAdapter();

    @Nullable
    @InterfaceC11871f
    public final JSONObject fromJson(@NotNull AbstractC11878m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object objM44315B = reader.m44315B();
        Map map = objM44315B instanceof Map ? (Map) objM44315B : null;
        if (map == null) {
            return null;
        }
        try {
            return new JSONObject(map);
        } catch (JSONException unused) {
            return null;
        }
    }

    @InterfaceC11891z
    public final void toJson(@NotNull AbstractC11885t writer, @Nullable JSONObject value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            C12924e c12924e = new C12924e();
            String string = value.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            writer.m44395P(c12924e.mo47992C0(string));
        }
    }
}
