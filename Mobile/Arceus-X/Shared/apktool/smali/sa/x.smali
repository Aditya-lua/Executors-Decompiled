.class public final Lsa/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p0

    invoke-static {p1, p0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;
    .locals 2
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lo9/a;->n(I)I

    invoke-static {p1, v1}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;

    invoke-direct {p1}, Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;-><init>()V

    return-object p1
.end method

.method public b(I)[Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-array p1, p1, [Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;

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

    invoke-virtual {p0, p1}, Lsa/x;->a(Landroid/os/Parcel;)Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lsa/x;->b(I)[Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;

    move-result-object p1

    return-object p1
.end method
