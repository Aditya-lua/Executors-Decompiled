package com.withpersona.sdk2.inquiry.ui.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "", "", "id", "addressStreet1", "addressStreet2", "addressCity", "addressSubdivision", "addressPostalCode", "addressCountryCode", "addressBusinessName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "e", "c", "f", "d", "g", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class LocationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @g(name = "address_street_1")
    @Nullable
    public final String addressStreet1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @g(name = "address_street_2")
    @Nullable
    public final String addressStreet2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @g(name = "address_city")
    @Nullable
    public final String addressCity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @g(name = "address_subdivision")
    @Nullable
    public final String addressSubdivision;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @g(name = "address_postal_code")
    @Nullable
    public final String addressPostalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @g(name = "address_country_code")
    @Nullable
    public final String addressCountryCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @g(name = "address_business_name")
    @Nullable
    public final String addressBusinessName;

    public LocationData(@NotNull String id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.addressStreet1 = str;
        this.addressStreet2 = str2;
        this.addressCity = str3;
        this.addressSubdivision = str4;
        this.addressPostalCode = str5;
        this.addressCountryCode = str6;
        this.addressBusinessName = str7;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddressBusinessName() {
        return this.addressBusinessName;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressCity() {
        return this.addressCity;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddressCountryCode() {
        return this.addressCountryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAddressPostalCode() {
        return this.addressPostalCode;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAddressStreet1() {
        return this.addressStreet1;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAddressStreet2() {
        return this.addressStreet2;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAddressSubdivision() {
        return this.addressSubdivision;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public /* synthetic */ LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8);
    }
}
