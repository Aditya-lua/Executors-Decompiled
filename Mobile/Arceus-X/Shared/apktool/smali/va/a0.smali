.class public final Lva/a0;
.super Lva/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"

    invoke-direct {p0, p1, v0}, Lva/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final u2(Lva/c0;[Lcom/google/android/gms/internal/appindex/zzk;)V
    .locals 1

    invoke-virtual {p0}, Lva/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lva/x;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p2, p1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lva/a;->t2(ILandroid/os/Parcel;)V

    return-void
.end method
