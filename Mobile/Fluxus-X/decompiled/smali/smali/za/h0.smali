.class public final Lza/h0;
.super Lza/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.identity.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lza/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lza/z;La9/a;)V
    .locals 1

    invoke-virtual {p0}, Lza/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lza/t;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lza/t;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lza/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u2(Lza/c0;La9/d;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lza/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lza/t;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lza/t;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lza/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final v2(Lza/e0;La9/e;)V
    .locals 1

    invoke-virtual {p0}, Lza/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lza/t;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lza/t;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lza/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w2(Lm9/g;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lza/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lza/t;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lza/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
