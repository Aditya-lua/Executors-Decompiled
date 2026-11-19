.class public final Lob/j0;
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

.method public static a(Lob/i0;Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lob/i0;->f:Ljava/lang/String;

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget-object v2, p0, Lob/i0;->g:Lob/g0;

    invoke-static {p1, v0, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget-object v0, p0, Lob/i0;->h:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x5

    iget-wide v2, p0, Lob/i0;->i:J

    invoke-static {p1, p2, v2, v3}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v1}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    invoke-static {p1}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-wide v8, v1

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_4

    invoke-static {p1}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lp9/b;->n(I)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    invoke-static {p1, v1}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Lp9/b;->y(Landroid/os/Parcel;I)J

    move-result-wide v1

    move-wide v8, v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lp9/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_2
    sget-object v2, Lob/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lob/g0;

    move-object v6, v1

    goto :goto_0

    :cond_3
    invoke-static {p1, v1}, Lp9/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_4
    invoke-static {p1, v0}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lob/i0;

    invoke-direct/range {v4 .. v9}, Lob/i0;-><init>(Ljava/lang/String;Lob/g0;Ljava/lang/String;J)V

    return-object v4
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lob/i0;

    return-object p1
.end method
