.class public Lda/l;
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
.method public a(Landroid/os/Parcel;)Lcom/google/android/gms/games/GameEntity;
    .locals 31

    move-object/from16 v0, p1

    invoke-static {v0}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v14, v2

    move v15, v14

    move/from16 v17, v15

    move/from16 v18, v17

    move/from16 v19, v18

    move/from16 v20, v19

    move/from16 v21, v20

    move/from16 v25, v21

    move/from16 v26, v25

    move/from16 v27, v26

    move/from16 v29, v27

    move/from16 v30, v29

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object/from16 v16, v13

    move-object/from16 v22, v16

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v28, v24

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_1

    invoke-static {v0}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lo9/a;->n(I)I

    move-result v3

    const/16 v4, 0x1c

    if-eq v3, v4, :cond_0

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v29

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v28

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v27

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v26

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v25

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v24

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v23

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v22

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v21

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v20

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v19

    goto :goto_0

    :pswitch_b
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v18

    goto :goto_0

    :pswitch_c
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v17

    goto :goto_0

    :pswitch_d
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v16

    goto :goto_0

    :pswitch_e
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v15

    goto :goto_0

    :pswitch_f
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v14

    goto :goto_0

    :pswitch_10
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/net/Uri;

    goto :goto_0

    :pswitch_11
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/net/Uri;

    goto :goto_0

    :pswitch_12
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/net/Uri;

    goto/16 :goto_0

    :pswitch_13
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_0

    :pswitch_14
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_0

    :pswitch_15
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_0

    :pswitch_16
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    :pswitch_17
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    :pswitch_18
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    :cond_0
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v30

    goto/16 :goto_0

    :cond_1
    invoke-static {v0, v1}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lcom/google/android/gms/games/GameEntity;

    invoke-direct/range {v4 .. v30}, Lcom/google/android/gms/games/GameEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;ZZLjava/lang/String;IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZ)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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

    new-array p1, p1, [Lcom/google/android/gms/games/GameEntity;

    return-object p1
.end method
