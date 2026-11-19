.class public final Lta/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lta/i0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lta/i0;Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p0

    invoke-static {p1, p0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lta/i0;
    .locals 2
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lp9/b;->n(I)I

    invoke-static {p1, v1}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lta/i0;

    invoke-direct {p1}, Lta/i0;-><init>()V

    return-object p1
.end method

.method public b(I)[Lta/i0;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-array p1, p1, [Lta/i0;

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

    invoke-virtual {p0, p1}, Lta/j0;->a(Landroid/os/Parcel;)Lta/i0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lta/j0;->b(I)[Lta/i0;

    move-result-object p1

    return-object p1
.end method
