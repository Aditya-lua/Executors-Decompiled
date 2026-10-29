.class public final Lsa/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;Landroid/os/Parcel;I)V
    .locals 1

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;->v3()Z

    move-result p0

    invoke-static {p1, v0, p0}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;
    .locals 5
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_1

    invoke-static {p1}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lo9/a;->n(I)I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_0

    invoke-static {p1, v2}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;

    invoke-direct {p1, v1}, Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;-><init>(Z)V

    return-object p1
.end method

.method public b(I)[Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-array p1, p1, [Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lsa/d;->a(Landroid/os/Parcel;)Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lsa/d;->b(I)[Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;

    move-result-object p1

    return-object p1
.end method
