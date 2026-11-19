.class public final Lda/q1;
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

    invoke-static {p1}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    move v4, v2

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_2

    invoke-static {p1}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v5

    invoke-static {v5}, Lp9/b;->n(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    invoke-static {p1, v5}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v5}, Lp9/b;->c(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {p1, v5}, Lp9/b;->o(Landroid/os/Parcel;I)Z

    move-result v4

    goto :goto_0

    :cond_2
    invoke-static {p1, v0}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lda/p1;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    array-length v0, v3

    invoke-static {v3, v2, v0}, Lfb/m3;->m([BII)Lfb/m3;

    move-result-object v1

    :goto_1
    invoke-direct {p1, v4, v1}, Lda/p1;-><init>(ZLfb/m3;)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lda/p1;

    return-object p1
.end method
