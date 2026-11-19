.class public abstract Lob/n5;
.super Lcom/google/android/gms/internal/measurement/p0;
.source "SourceFile"

# interfaces
.implements Lob/o5;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.measurement.internal.IUploadBatchesCallback"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/p0;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    sget-object p1, Lob/ee;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/q0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lob/ee;

    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/q0;->f(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lob/o5;->H1(Lob/ee;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
