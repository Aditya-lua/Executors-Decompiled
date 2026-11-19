.class public final Ll9/w;
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

.method public static final a(Landroid/os/Parcel;)Ll9/c;
    .locals 6

    invoke-static {p0}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_2

    invoke-static {p0}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v3

    invoke-static {v3}, Lp9/b;->n(I)I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    invoke-static {p0, v3}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, v3}, Lp9/b;->o(Landroid/os/Parcel;I)Z

    move-result v1

    goto :goto_0

    :cond_1
    sget-object v2, Ll9/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v3, v2}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Ll9/f;

    goto :goto_0

    :cond_2
    invoke-static {p0, v0}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance p0, Ll9/c;

    invoke-direct {p0, v2, v1}, Ll9/c;-><init>(Ll9/f;Z)V

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Ll9/w;->a(Landroid/os/Parcel;)Ll9/c;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Ll9/c;

    return-object p1
.end method
