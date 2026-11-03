package com.withpersona.sdk2.inquiry.ui.network;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import sm.f;
import sm.m;
import sm.t;
import sm.z;
import vu.e;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/JsonObjectAdapter;", "", "<init>", "()V", "Lsm/t;", "writer", "Lorg/json/JSONObject;", "value", "", "toJson", "(Lsm/t;Lorg/json/JSONObject;)V", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lorg/json/JSONObject;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JsonObjectAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final JsonObjectAdapter f14031a = new JsonObjectAdapter();

    @f
    @Nullable
    public final JSONObject fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object objA = reader.A();
        Map map = objA instanceof Map ? (Map) objA : null;
        if (map == null) {
            return null;
        }
        try {
            return new JSONObject(map);
        } catch (JSONException unused) {
            return null;
        }
    }

    @z
    public final void toJson(@NotNull t writer, @Nullable JSONObject value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            e eVar = new e();
            String string = value.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            writer.P(eVar.y0(string));
        }
    }
}
