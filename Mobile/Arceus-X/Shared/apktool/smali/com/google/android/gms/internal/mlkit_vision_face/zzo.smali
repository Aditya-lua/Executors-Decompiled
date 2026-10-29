.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    invoke-static {p1}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_4

    invoke-static {p1}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v5

    invoke-static {v5}, Lo9/a;->n(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    const/4 v7, 0x4

    if-eq v6, v7, :cond_0

    invoke-static {p1, v5}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v5}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-static {p1, v5}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v4

    goto :goto_0

    :cond_2
    invoke-static {p1, v5}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v3

    goto :goto_0

    :cond_3
    invoke-static {p1, v5}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v1

    goto :goto_0

    :cond_4
    invoke-static {p1, v0}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;

    invoke-direct {p1, v1, v3, v4, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;-><init>(IFFI)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/internal/mlkit_vision_face/zzn;

    return-object p1
.end method
