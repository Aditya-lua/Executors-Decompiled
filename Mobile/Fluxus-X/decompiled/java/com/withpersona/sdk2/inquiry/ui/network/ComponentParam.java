package com.withpersona.sdk2.inquiry.ui.network;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import hn.m;
import hn.t;
import hn.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Unit;
import p001kotlin.collections.j0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@p001kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Landroid/os/Parcelable;", "<init>", "()V", "Adapter", "d", "e", "b", "c", "a", "f", "h", "j", "i", "k", "g", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$c;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$d;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$e;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$f;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$g;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$i;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$j;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$k;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ComponentParam implements Parcelable {

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "()V", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lhn/t;", "writer", "value", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Adapter extends hn.h<ComponentParam> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final Adapter f11413a = new Adapter();

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11414a;

            static {
                int[] iArr = new int[eq.a.values().length];
                try {
                    iArr[eq.a.NotRequested.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[eq.a.NotSupported.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[eq.a.Failed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[eq.a.Success.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f11414a = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // hn.h
        @hn.f
        @Nullable
        public ComponentParam fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return null;
        }

        @Override // hn.h
        @z
        public void toJson(@NotNull t writer, @Nullable ComponentParam value) {
            String str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value instanceof d) {
                writer.Q(((d) value).getValue());
                return;
            }
            if (value instanceof e) {
                writer.a();
                Iterator<String> it = ((e) value).a().iterator();
                while (it.hasNext()) {
                    writer.Q(it.next());
                }
                writer.e();
                return;
            }
            if (value instanceof a) {
                writer.c();
                a aVar = (a) value;
                String street1 = aVar.getStreet1();
                if (street1 != null) {
                    writer.o("street_1");
                    writer.Q(street1);
                }
                String street2 = aVar.getStreet2();
                if (street2 != null) {
                    writer.o("street_2");
                    writer.Q(street2);
                }
                String city = aVar.getCity();
                if (city != null) {
                    writer.o("city");
                    writer.Q(city);
                }
                String subdivision = aVar.getSubdivision();
                if (subdivision != null) {
                    writer.o("subdivision");
                    writer.Q(subdivision);
                }
                String postalCode = aVar.getPostalCode();
                if (postalCode != null) {
                    writer.o("postal_code");
                    writer.Q(postalCode);
                }
                writer.g();
                return;
            }
            if (value instanceof b) {
                writer.T(((b) value).getValue());
                return;
            }
            if (value instanceof c) {
                writer.Q(new BigDecimal(((c) value).getValue().doubleValue()).toPlainString());
                return;
            }
            if (value instanceof f) {
                writer.Q(((f) value).getSignatureImageString());
                return;
            }
            if (value instanceof h) {
                writer.c();
                h hVar = (h) value;
                eq.a chipAuthenticationStatus = hVar.getChipAuthenticationStatus();
                if (chipAuthenticationStatus != null) {
                    writer.o("caFlag");
                    int i10 = a.f11414a[chipAuthenticationStatus.ordinal()];
                    if (i10 == 1) {
                        str = "notRequested";
                    } else if (i10 == 2) {
                        str = "notSupported";
                    } else if (i10 == 3) {
                        str = "failed";
                    } else {
                        if (i10 != 4) {
                            throw new l();
                        }
                        str = "success";
                    }
                    writer.Q(str);
                }
                String dg1 = hVar.getDg1();
                if (dg1 != null) {
                    writer.o("dg1");
                    writer.Q(dg1);
                }
                String dg2 = hVar.getDg2();
                if (dg2 != null) {
                    writer.o("dg2");
                    writer.Q(dg2);
                }
                String sod = hVar.getSod();
                if (sod != null) {
                    writer.o("sod");
                    writer.Q(sod);
                }
                writer.g();
                return;
            }
            if (value instanceof j) {
                writer.c();
                Map<String, String> mapA = ((j) value).a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    if (entry.getValue().length() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : j0.i(linkedHashMap).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    String str3 = (String) entry2.getValue();
                    writer.o(str2);
                    writer.Q(str3);
                }
                writer.g();
                return;
            }
            if (value instanceof i) {
                writer.c();
                i iVar = (i) value;
                String country = iVar.getCountry();
                if (country != null) {
                    writer.o("idb_country");
                    writer.Q(country);
                }
                String type = iVar.getType();
                if (type != null) {
                    writer.o("idb_type");
                    writer.Q(type);
                }
                String value2 = iVar.getValue();
                if (value2 != null) {
                    writer.o("idb_value");
                    writer.Q(value2);
                }
                writer.g();
                return;
            }
            boolean z10 = value instanceof k;
            String str4 = BuildConfig.FLAVOR;
            if (z10) {
                writer.c();
                k kVar = (k) value;
                String code = kVar.getCode();
                if (code != null) {
                    writer.o("code");
                    writer.Q(code);
                }
                String errorName = kVar.getErrorName();
                if (errorName != null) {
                    writer.o("error");
                    writer.c();
                    writer.o("name");
                    writer.Q(errorName);
                    writer.o("message");
                    String errorMessage = kVar.getErrorMessage();
                    if (errorMessage != null) {
                        str4 = errorMessage;
                    }
                    writer.Q(str4);
                    writer.g();
                }
                writer.g();
                return;
            }
            if (!(value instanceof g)) {
                if (value != null) {
                    throw new l();
                }
                Unit unit = Unit.f21506a;
                return;
            }
            g gVar = (g) value;
            if (gVar.getHasPrefill() && gVar.f().isEmpty()) {
                writer.Q("USE PREVIOUS FILE");
                return;
            }
            if (gVar.f().isEmpty()) {
                writer.a();
                writer.Q(BuildConfig.FLAVOR);
                writer.e();
                return;
            }
            writer.a();
            for (Uri uri : gVar.f()) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(lastPathSegment, "toString(...)");
                }
                writer.Q(lastPathSegment);
            }
            writer.e();
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "street1", "street2", "city", "subdivision", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "i", "c", "d", "j", "e", "f", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0195a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String street1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String street2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String city;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String subdivision;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String postalCode;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$a$a, reason: collision with other inner class name */
        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0195a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            super(null);
            this.street1 = str;
            this.street2 = str2;
            this.city = str3;
            this.subdivision = str4;
            this.postalCode = str5;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getStreet1() {
            return this.street1;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getStreet2() {
            return this.street2;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSubdivision() {
            return this.subdivision;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.street1);
            dest.writeString(this.street2);
            dest.writeString(this.city);
            dest.writeString(this.subdivision);
            dest.writeString(this.postalCode);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "value", "<init>", "(Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean value;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(boolean z10) {
            super(null);
            this.value = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.value ? 1 : 0);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$c;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/Number;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Number;", "()Ljava/lang/Number;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Number value;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c((Number) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Number value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Number getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.value);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$d;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$e;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "<init>", "(Ljava/util/List;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> value;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new e(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull List<String> value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final List<String> a() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.value);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$f;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "signatureImageString", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String signatureImageString;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(@Nullable String str) {
            super(null);
            this.signatureImageString = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSignatureImageString() {
            return this.signatureImageString;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.signatureImageString);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$g;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "Landroid/net/Uri;", "uris", BuildConfig.FLAVOR, "hasPrefill", "<init>", "(Ljava/util/List;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Uri> uris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean hasPrefill;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(g.class.getClassLoader()));
                }
                return new g(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(@NotNull List<? extends Uri> uris, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(uris, "uris");
            this.uris = uris;
            this.hasPrefill = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasPrefill() {
            return this.hasPrefill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final List<Uri> f() {
            return this.uris;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Uri> list = this.uris;
            dest.writeInt(list.size());
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.hasPrefill ? 1 : 0);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "dg1", "dg2", "sod", "Leq/a;", "chipAuthenticationStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leq/a;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "g", "c", "i", "d", "Leq/a;", "()Leq/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String dg1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String dg2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String sod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final eq.a chipAuthenticationStatus;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : eq.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable eq.a aVar) {
            super(null);
            this.dg1 = str;
            this.dg2 = str2;
            this.sod = str3;
            this.chipAuthenticationStatus = aVar;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final eq.a getChipAuthenticationStatus() {
            return this.chipAuthenticationStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDg1() {
            return this.dg1;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDg2() {
            return this.dg2;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSod() {
            return this.sod;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.dg1);
            dest.writeString(this.dg2);
            dest.writeString(this.sod);
            eq.a aVar = this.chipAuthenticationStatus;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$i;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "country", Payload.TYPE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "f", "c", "g", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String country;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new i(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            super(null);
            this.country = str;
            this.type = str2;
            this.value = str3;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.country);
            dest.writeString(this.type);
            dest.writeString(this.value);
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$j;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "<init>", "(Ljava/util/Map;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, String> value;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new j(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i10) {
                return new j[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@NotNull Map<String, String> value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final Map<String, String> a() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<String, String> map = this.value;
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$k;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "code", "errorName", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "g", "c", "f", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String errorName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String errorMessage;

        @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            super(null);
            this.code = str;
            this.errorName = str2;
            this.errorMessage = str3;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getErrorName() {
            return this.errorName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            dest.writeString(this.errorName);
            dest.writeString(this.errorMessage);
        }
    }

    public /* synthetic */ ComponentParam(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ComponentParam() {
    }
}
