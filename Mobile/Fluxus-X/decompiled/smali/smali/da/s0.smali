.class public final Lda/s0;
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
    .locals 17

    move-object/from16 v0, p1

    invoke-static {v0}, Lp9/b;->D(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

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
    sget-object v3, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/os/ResultReceiver;

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Lp9/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v15

    goto :goto_0

    :pswitch_2
    sget-object v3, Lda/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lda/d;

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lp9/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v13

    goto :goto_0

    :pswitch_4
    sget-object v3, Lda/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lda/a0;

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lp9/b;->x(Landroid/os/Parcel;I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_0

    :pswitch_6
    sget-object v3, Lda/k;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lda/k;

    goto :goto_0

    :pswitch_7
    sget-object v3, Lda/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v9

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Lp9/b;->r(Landroid/os/Parcel;I)Ljava/lang/Double;

    move-result-object v8

    goto :goto_0

    :pswitch_9
    sget-object v3, Lda/t;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v7

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Lp9/b;->c(Landroid/os/Parcel;I)[B

    move-result-object v6

    goto :goto_0

    :pswitch_b
    sget-object v3, Lda/w;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lda/w;

    goto :goto_0

    :pswitch_c
    sget-object v3, Lda/u;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lp9/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lda/u;

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lp9/b;->m(Landroid/os/Parcel;I)V

    new-instance v3, Lda/r;

    invoke-direct/range {v3 .. v16}, Lda/r;-><init>(Lda/u;Lda/w;[BLjava/util/List;Ljava/lang/Double;Ljava/util/List;Lda/k;Ljava/lang/Integer;Lda/a0;Ljava/lang/String;Lda/d;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
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

    new-array p1, p1, [Lda/r;

    return-object p1
.end method
