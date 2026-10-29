package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import jt.h;
import jt.l;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.f;
import um.g;
import um.i;
import um.m;
import um.t;
import um.w;
import um.z;
import wr.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0018R#\u0010)\u001a\u0004\u0018\u00010\"8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Landroid/os/Parcelable;", "", "rule", "<init>", "(Ljava/lang/String;)V", "", "", "formValues", "thisComponentValue", "uiStateValues", "", "getValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRule", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "parsedRules$delegate", "Ljt/h;", "getParsedRules", "()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "getParsedRules$annotations", "()V", "parsedRules", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = false)
public final /* data */ class JsonLogicBoolean implements Parcelable {

    /* JADX INFO: renamed from: parsedRules$delegate, reason: from kotlin metadata */
    @NotNull
    private final h parsedRules;

    @NotNull
    private final String rule;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<JsonLogicBoolean> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends um.h<JsonLogicBoolean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // um.h
        @z
        public void toJson(@NotNull t writer, @Nullable JsonLogicBoolean value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // um.h
        @NotNull
        @f
        public JsonLogicBoolean fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return new JsonLogicBoolean(reader.q().F2().P());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JsonLogicBoolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JsonLogicBoolean(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean[] newArray(int i10) {
            return new JsonLogicBoolean[i10];
        }
    }

    public JsonLogicBoolean(@NotNull String rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.rule = rule;
        this.parsedRules = jt.i.b(new Function0() { // from class: com.withpersona.sdk2.inquiry.network.dto.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonLogicBoolean.parsedRules_delegate$lambda$1(this.f12179a);
            }
        });
    }

    public static /* synthetic */ JsonLogicBoolean copy$default(JsonLogicBoolean jsonLogicBoolean, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jsonLogicBoolean.rule;
        }
        return jsonLogicBoolean.copy(str);
    }

    private final ParsedRules getParsedRules() {
        return (ParsedRules) this.parsedRules.getValue();
    }

    @g(ignore = true)
    private static /* synthetic */ void getParsedRules$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Boolean getValue$default(JsonLogicBoolean jsonLogicBoolean, Map map, Object obj, Map map2, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            map2 = k0.j();
        }
        return jsonLogicBoolean.getValue(map, obj, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedRules parsedRules_delegate$lambda$1(JsonLogicBoolean jsonLogicBoolean) {
        Object objFromJson = new w.b().d().c(Object.class).nullSafe().lenient().fromJson(jsonLogicBoolean.rule);
        if (!(objFromJson instanceof Map)) {
            if (objFromJson instanceof Boolean) {
                return new ParsedRules.PrimitiveRule(objFromJson);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) objFromJson).entrySet()) {
            Object key = entry.getKey();
            Pair pairA = key instanceof String ? s.a(key, entry.getValue()) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return new ParsedRules.ComplexRules(k0.t(arrayList));
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    @NotNull
    public final JsonLogicBoolean copy(@NotNull String rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        return new JsonLogicBoolean(rule);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonLogicBoolean) && Intrinsics.c(this.rule, ((JsonLogicBoolean) other).rule);
    }

    @NotNull
    public final String getRule() {
        return this.rule;
    }

    @Nullable
    public final Boolean getValue(@NotNull Map<String, ? extends Object> formValues, @Nullable Object thisComponentValue, @NotNull Map<String, ? extends Object> uiStateValues) {
        Intrinsics.checkNotNullParameter(formValues, "formValues");
        Intrinsics.checkNotNullParameter(uiStateValues, "uiStateValues");
        ParsedRules parsedRules = getParsedRules();
        if (parsedRules == null) {
            return null;
        }
        if (!(parsedRules instanceof ParsedRules.ComplexRules)) {
            if (!(parsedRules instanceof ParsedRules.PrimitiveRule)) {
                throw new l();
            }
            ParsedRules.PrimitiveRule primitiveRule = (ParsedRules.PrimitiveRule) parsedRules;
            if (primitiveRule.getValue() instanceof Boolean) {
                return (Boolean) primitiveRule.getValue();
            }
            return null;
        }
        k kVarA = JsonLogicBooleanKt.getJsonLogicEngine().a(((ParsedRules.ComplexRules) parsedRules).getExpression(), k0.m(s.a("form", formValues), s.a("value", thisComponentValue), s.a("meta", uiStateValues)));
        if (kVarA instanceof k.Success) {
            Object value = ((k.Success) kVarA).getValue();
            if (value instanceof Boolean) {
                return (Boolean) value;
            }
            return null;
        }
        if (Intrinsics.c(kVarA, k.a.c.f34549a) || Intrinsics.c(kVarA, k.a.C0635a.f34547a) || Intrinsics.c(kVarA, k.a.b.f34548a)) {
            return null;
        }
        throw new l();
    }

    public int hashCode() {
        return this.rule.hashCode();
    }

    @NotNull
    public String toString() {
        return "JsonLogicBoolean(rule=" + this.rule + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rule);
    }
}
