.class public final Lda/k0;
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
    .locals 5

    invoke-static {p1}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_1

    invoke-static {p1}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lp9/b;->n(I)I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_0

    invoke-static {p1, v2}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v2}, Lp9/b;->o(Landroid/os/Parcel;I)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lda/j0;

    invoke-direct {p1, v1}, Lda/j0;-><init>(Z)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lda/j0;

    return-object p1
.end method
