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
    public final int f5824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f5826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f5827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f5829k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5830a;
        public final long b;

        public a(long j10, long j11) {
            m.o(j11);
            this.f5830a = j10;
            this.b = j11;
        }
    }

    public ModuleInstallStatusUpdate(int i10, int i11, Long l10, Long l11, int i12) {
        this.f5824f = i10;
        this.f5825g = i11;
        this.f5826h = l10;
        this.f5827i = l11;
        this.f5828j = i12;
        this.f5829k = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int v3() {
        return this.f5828j;
    }

    public int w3() {
        return this.f5825g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, x3());
        b.n(parcel, 2, w3());
        b.s(parcel, 3, this.f5826h, false);
        b.s(parcel, 4, this.f5827i, false);
        b.n(parcel, 5, v3());
        b.b(parcel, iA);
    }

    public int x3() {
        return this.f5824f;
    }
}
