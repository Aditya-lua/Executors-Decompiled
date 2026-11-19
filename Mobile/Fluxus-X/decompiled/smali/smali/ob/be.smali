.class public final Lob/be;
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
    .locals 16

    move-object/from16 v0, p1

    invoke-static {v0}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v9, v2

    move-object v10, v9

    move-object v11, v10

    move-object v15, v11

    move-wide v7, v3

    move-wide v13, v7

    move v12, v5

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static {v0}, Lp9/b;->u(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lp9/b;->n(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Lp9/b;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {v0, v2}, Lp9/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Lp9/b;->y(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v13, v2

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Lp9/b;->w(Landroid/os/Parcel;I)I

    move-result v2

    move v12, v2

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lp9/b;->b(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v2

    move-object v11, v2

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Lp9/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lp9/b;->c(Landroid/os/Parcel;I)[B

    move-result-object v2

    move-object v9, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Lp9/b;->y(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v7, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance v6, Lob/ae;

    invoke-direct/range {v6 .. v15}, Lob/ae;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lob/ae;

    return-object p1
.end method
