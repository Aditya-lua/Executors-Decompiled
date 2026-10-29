package com.withpersona.sdk2.inquiry.p057ui.network;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p390qp.EnumC10687a;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Landroid/os/Parcelable;", "<init>", "()V", "Adapter", "ComponentString", "ComponentStringList", "ComponentBoolean", "ComponentNumber", "Address", "ESignature", "GovernmentIdNfcScan", "JpMyNumberNfcScanParams", "InternationalDbParams", "PhoneNumberSnaParams", "FileUpload", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class ComponentParam implements Parcelable {

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Adapter extends AbstractC11873h<ComponentParam> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Adapter f17777a = new Adapter();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$Adapter$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C4161a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f17778a;

            static {
                int[] iArr = new int[EnumC10687a.values().length];
                try {
                    iArr[EnumC10687a.NotRequested.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC10687a.NotSupported.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC10687a.Failed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC10687a.Success.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f17778a = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p471um.AbstractC11873h
        @Nullable
        @InterfaceC11871f
        public ComponentParam fromJson(@NotNull AbstractC11878m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        @InterfaceC11891z
        public void toJson(@NotNull AbstractC11885t writer, @Nullable ComponentParam value) {
            String str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value instanceof ComponentString) {
                writer.mo44367M(((ComponentString) value).getValue());
                return;
            }
            if (value instanceof ComponentStringList) {
                writer.mo44371a();
                Iterator<String> it = ((ComponentStringList) value).m21552a().iterator();
                while (it.hasNext()) {
                    writer.mo44367M(it.next());
                }
                writer.mo44375e();
                return;
            }
            if (value instanceof Address) {
                writer.mo44374c();
                Address address = (Address) value;
                String street1 = address.getStreet1();
                if (street1 != null) {
                    writer.mo44380n("street_1");
                    writer.mo44367M(street1);
                }
                String street2 = address.getStreet2();
                if (street2 != null) {
                    writer.mo44380n("street_2");
                    writer.mo44367M(street2);
                }
                String city = address.getCity();
                if (city != null) {
                    writer.mo44380n("city");
                    writer.mo44367M(city);
                }
                String subdivision = address.getSubdivision();
                if (subdivision != null) {
                    writer.mo44380n("subdivision");
                    writer.mo44367M(subdivision);
                }
                String postalCode = address.getPostalCode();
                if (postalCode != null) {
                    writer.mo44380n("postal_code");
                    writer.mo44367M(postalCode);
                }
                writer.mo44378g();
                return;
            }
            if (value instanceof ComponentBoolean) {
                writer.mo44368U(((ComponentBoolean) value).getValue());
                return;
            }
            if (value instanceof ComponentNumber) {
                writer.mo44367M(new BigDecimal(((ComponentNumber) value).getValue().doubleValue()).toPlainString());
                return;
            }
            if (value instanceof ESignature) {
                writer.mo44367M(((ESignature) value).getSignatureImageString());
                return;
            }
            if (value instanceof GovernmentIdNfcScan) {
                writer.mo44374c();
                GovernmentIdNfcScan governmentIdNfcScan = (GovernmentIdNfcScan) value;
                EnumC10687a chipAuthenticationStatus = governmentIdNfcScan.getChipAuthenticationStatus();
                if (chipAuthenticationStatus != null) {
                    writer.mo44380n("caFlag");
                    int i10 = C4161a.f17778a[chipAuthenticationStatus.ordinal()];
                    if (i10 == 1) {
                        str = "notRequested";
                    } else if (i10 == 2) {
                        str = "notSupported";
                    } else if (i10 == 3) {
                        str = "failed";
                    } else {
                        if (i10 != 4) {
                            throw new C7345l();
                        }
                        str = "success";
                    }
                    writer.mo44367M(str);
                }
                String dg1 = governmentIdNfcScan.getDg1();
                if (dg1 != null) {
                    writer.mo44380n("dg1");
                    writer.mo44367M(dg1);
                }
                String dg2 = governmentIdNfcScan.getDg2();
                if (dg2 != null) {
                    writer.mo44380n("dg2");
                    writer.mo44367M(dg2);
                }
                String sod = governmentIdNfcScan.getSod();
                if (sod != null) {
                    writer.mo44380n("sod");
                    writer.mo44367M(sod);
                }
                writer.mo44378g();
                return;
            }
            if (value instanceof JpMyNumberNfcScanParams) {
                writer.mo44374c();
                Map<String, String> mapM21573a = ((JpMyNumberNfcScanParams) value).m21573a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : mapM21573a.entrySet()) {
                    if (entry.getValue().length() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : C7688j0.m31793i(linkedHashMap).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    String str3 = (String) entry2.getValue();
                    writer.mo44380n(str2);
                    writer.mo44367M(str3);
                }
                writer.mo44378g();
                return;
            }
            if (value instanceof InternationalDbParams) {
                writer.mo44374c();
                InternationalDbParams internationalDbParams = (InternationalDbParams) value;
                String country = internationalDbParams.getCountry();
                if (country != null) {
                    writer.mo44380n("idb_country");
                    writer.mo44367M(country);
                }
                String type = internationalDbParams.getType();
                if (type != null) {
                    writer.mo44380n("idb_type");
                    writer.mo44367M(type);
                }
                String value2 = internationalDbParams.getValue();
                if (value2 != null) {
                    writer.mo44380n("idb_value");
                    writer.mo44367M(value2);
                }
                writer.mo44378g();
                return;
            }
            if (value instanceof PhoneNumberSnaParams) {
                writer.mo44374c();
                PhoneNumberSnaParams phoneNumberSnaParams = (PhoneNumberSnaParams) value;
                String code = phoneNumberSnaParams.getCode();
                if (code != null) {
                    writer.mo44380n("code");
                    writer.mo44367M(code);
                }
                String errorName = phoneNumberSnaParams.getErrorName();
                if (errorName != null) {
                    writer.mo44380n("error");
                    writer.mo44374c();
                    writer.mo44380n("name");
                    writer.mo44367M(errorName);
                    writer.mo44380n("message");
                    String errorMessage = phoneNumberSnaParams.getErrorMessage();
                    writer.mo44367M(errorMessage != null ? errorMessage : "");
                    writer.mo44378g();
                }
                writer.mo44378g();
                return;
            }
            if (!(value instanceof FileUpload)) {
                if (value != null) {
                    throw new C7345l();
                }
                Unit unit = Unit.f29331a;
                return;
            }
            FileUpload fileUpload = (FileUpload) value;
            if (fileUpload.getHasPrefill() && fileUpload.m21559f().isEmpty()) {
                writer.mo44367M("USE PREVIOUS FILE");
                return;
            }
            if (fileUpload.m21559f().isEmpty()) {
                writer.mo44371a();
                writer.mo44367M("");
                writer.mo44375e();
                return;
            }
            writer.mo44371a();
            for (Uri uri : fileUpload.m21559f()) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(lastPathSegment, "toString(...)");
                }
                writer.mo44367M(lastPathSegment);
            }
            writer.mo44375e();
        }
    }

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "street1", "street2", "city", "subdivision", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "i", "c", "d", "j", "e", "f", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Address extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new C4162a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String street1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String street2;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String city;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final String subdivision;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final String postalCode;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$Address$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4162a implements Parcelable.Creator<Address> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Address createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Address[] newArray(int i10) {
                return new Address[i10];
            }
        }

        public Address(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
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

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class ComponentBoolean extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentBoolean> CREATOR = new C4163a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean value;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$ComponentBoolean$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4163a implements Parcelable.Creator<ComponentBoolean> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ComponentBoolean createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentBoolean(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ComponentBoolean[] newArray(int i10) {
                return new ComponentBoolean[i10];
            }
        }

        public ComponentBoolean(boolean z10) {
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

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Ljava/lang/Number;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Number;", "()Ljava/lang/Number;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class ComponentNumber extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentNumber> CREATOR = new C4164a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Number value;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$ComponentNumber$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4164a implements Parcelable.Creator<ComponentNumber> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ComponentNumber createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentNumber((Number) parcel.readSerializable());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ComponentNumber[] newArray(int i10) {
                return new ComponentNumber[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentNumber(@NotNull Number value) {
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

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class ComponentString extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentString> CREATOR = new C4165a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String value;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$ComponentString$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4165a implements Parcelable.Creator<ComponentString> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ComponentString createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentString(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ComponentString[] newArray(int i10) {
                return new ComponentString[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentString(@NotNull String value) {
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

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "", "value", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class ComponentStringList extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentStringList> CREATOR = new C4166a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<String> value;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$ComponentStringList$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4166a implements Parcelable.Creator<ComponentStringList> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ComponentStringList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentStringList(parcel.createStringArrayList());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ComponentStringList[] newArray(int i10) {
                return new ComponentStringList[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentStringList(@NotNull List<String> value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m21552a() {
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

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "signatureImageString", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class ESignature extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ESignature> CREATOR = new C4167a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String signatureImageString;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$ESignature$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4167a implements Parcelable.Creator<ESignature> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ESignature createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ESignature(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ESignature[] newArray(int i10) {
                return new ESignature[i10];
            }
        }

        public ESignature(@Nullable String str) {
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

    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "Landroid/net/Uri;", "uris", "", "hasPrefill", "<init>", "(Ljava/util/List;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Z", "()Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class FileUpload extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<FileUpload> CREATOR = new C4168a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<Uri> uris;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean hasPrefill;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$FileUpload$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4168a implements Parcelable.Creator<FileUpload> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FileUpload createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(FileUpload.class.getClassLoader()));
                }
                return new FileUpload(arrayList, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FileUpload[] newArray(int i10) {
                return new FileUpload[i10];
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FileUpload(@NotNull List<? extends Uri> uris, boolean z10) {
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
        /* JADX INFO: renamed from: f */
        public final List<Uri> m21559f() {
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

    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "dg1", "dg2", "sod", "Lqp/a;", "chipAuthenticationStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqp/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "g", "c", "i", "d", "Lqp/a;", "()Lqp/a;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class GovernmentIdNfcScan extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new C4169a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String dg1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String dg2;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String sod;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final EnumC10687a chipAuthenticationStatus;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$GovernmentIdNfcScan$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4169a implements Parcelable.Creator<GovernmentIdNfcScan> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdNfcScan createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdNfcScan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EnumC10687a.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdNfcScan[] newArray(int i10) {
                return new GovernmentIdNfcScan[i10];
            }
        }

        public GovernmentIdNfcScan(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable EnumC10687a enumC10687a) {
            super(null);
            this.dg1 = str;
            this.dg2 = str2;
            this.sod = str3;
            this.chipAuthenticationStatus = enumC10687a;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC10687a getChipAuthenticationStatus() {
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
            EnumC10687a enumC10687a = this.chipAuthenticationStatus;
            if (enumC10687a == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(enumC10687a.name());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "country", Payload.TYPE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "f", "c", "g", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class InternationalDbParams extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<InternationalDbParams> CREATOR = new C4170a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String country;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String value;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$InternationalDbParams$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4170a implements Parcelable.Creator<InternationalDbParams> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InternationalDbParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternationalDbParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InternationalDbParams[] newArray(int i10) {
                return new InternationalDbParams[i10];
            }
        }

        public InternationalDbParams(@Nullable String str, @Nullable String str2, @Nullable String str3) {
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

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "", "value", "<init>", "(Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class JpMyNumberNfcScanParams extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<JpMyNumberNfcScanParams> CREATOR = new C4171a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> value;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$JpMyNumberNfcScanParams$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4171a implements Parcelable.Creator<JpMyNumberNfcScanParams> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JpMyNumberNfcScanParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new JpMyNumberNfcScanParams(linkedHashMap);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final JpMyNumberNfcScanParams[] newArray(int i10) {
                return new JpMyNumberNfcScanParams[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JpMyNumberNfcScanParams(@NotNull Map<String, String> value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, String> m21573a() {
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

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "code", "errorName", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "g", "c", "f", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class PhoneNumberSnaParams extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberSnaParams> CREATOR = new C4172a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String errorName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String errorMessage;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.ComponentParam$PhoneNumberSnaParams$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4172a implements Parcelable.Creator<PhoneNumberSnaParams> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PhoneNumberSnaParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneNumberSnaParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PhoneNumberSnaParams[] newArray(int i10) {
                return new PhoneNumberSnaParams[i10];
            }
        }

        public PhoneNumberSnaParams(@Nullable String str, @Nullable String str2, @Nullable String str3) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.network.ComponentParam.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ComponentParam(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ComponentParam() {
    }
}
