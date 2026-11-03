package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import o9.b;
import r9.i;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f5899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f5900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f5902k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5903a;
        public final long b;

        public a(long j10, long j11) {
            m.o(j11);
            this.f5903a = j10;
            this.b = j11;
        }
    }

    public ModuleInstallStatusUpdate(int i10, int i11, Long l10, Long l11, int i12) {
        this.f5897f = i10;
        this.f5898g = i11;
        this.f5899h = l10;
        this.f5900i = l11;
        this.f5901j = i12;
        this.f5902k = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int v3() {
        return this.f5901j;
    }

    public int w3() {
        return this.f5898g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, x3());
        b.n(parcel, 2, w3());
        b.s(parcel, 3, this.f5899h, false);
        b.s(parcel, 4, this.f5900i, false);
        b.n(parcel, 5, v3());
        b.b(parcel, iA);
    }

    public int x3() {
        return this.f5897f;
    }
}
