.class public final Ll9/x;
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
    .locals 9

    invoke-static {p1}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move v5, v1

    move v3, v2

    move v4, v3

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v0, :cond_4

    invoke-static {p1}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v6

    invoke-static {v6}, Lp9/b;->n(I)I

    move-result v7

    if-eq v7, v1, :cond_3

    const/4 v8, 0x2

    if-eq v7, v8, :cond_2

    const/4 v8, 0x3

    if-eq v7, v8, :cond_1

    const/4 v8, 0x4

    if-eq v7, v8, :cond_0

    invoke-static {p1, v6}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v6}, Lp9/b;->o(Landroid/os/Parcel;I)Z

    move-result v5

    goto :goto_0

    :cond_1
    invoke-static {p1, v6}, Lp9/b;->w(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_0

    :cond_2
    invoke-static {p1, v6}, Lp9/b;->w(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_0

    :cond_3
    invoke-static {p1, v6}, Lp9/b;->w(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    :cond_4
    invoke-static {p1, v0}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Ll9/f;

    invoke-direct {p1, v2, v3, v4, v5}, Ll9/f;-><init>(IIIZ)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Ll9/f;

    return-object p1
.end method
