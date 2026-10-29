.class public Lda/r;
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
.method public a(Landroid/os/Parcel;)Lcom/google/android/gms/games/PlayerEntity;
    .locals 37

    move-object/from16 v0, p1

    invoke-static {v0}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    const-wide/16 v6, 0x0

    move-object v9, v2

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v18, v12

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v25, v22

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v33, v30

    move-object/from16 v34, v33

    move-object/from16 v36, v34

    move v15, v3

    move/from16 v23, v15

    move/from16 v24, v23

    move/from16 v35, v24

    move-wide/from16 v31, v4

    move-wide v13, v6

    move-wide/from16 v16, v13

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static {v0}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lo9/a;->n(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    invoke-static {v0, v2}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v36, v2

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v2

    move/from16 v35, v2

    goto :goto_0

    :pswitch_3
    sget-object v3, Lcom/google/android/gms/games/zza;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/games/zza;

    move-object/from16 v34, v2

    goto :goto_0

    :pswitch_4
    sget-object v3, Lcom/google/android/gms/games/zzo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/games/zzo;

    move-object/from16 v33, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lo9/a;->y(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v31, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v30, v2

    goto :goto_0

    :pswitch_7
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    move-object/from16 v29, v2

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v2

    goto :goto_0

    :pswitch_9
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    move-object/from16 v27, v2

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    goto :goto_0

    :pswitch_b
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    goto :goto_0

    :pswitch_c
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v2

    move/from16 v24, v2

    goto :goto_0

    :pswitch_d
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v2

    move/from16 v23, v2

    goto :goto_0

    :pswitch_e
    sget-object v3, Lcom/google/android/gms/games/PlayerLevelInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/games/PlayerLevelInfo;

    move-object/from16 v22, v2

    goto/16 :goto_0

    :pswitch_f
    sget-object v3, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    move-object/from16 v21, v2

    goto/16 :goto_0

    :pswitch_10
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v2

    goto/16 :goto_0

    :pswitch_11
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v2

    goto/16 :goto_0

    :pswitch_12
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v2

    goto/16 :goto_0

    :pswitch_13
    invoke-static {v0, v2}, Lo9/a;->y(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v16, v2

    goto/16 :goto_0

    :pswitch_14
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v2

    move v15, v2

    goto/16 :goto_0

    :pswitch_15
    invoke-static {v0, v2}, Lo9/a;->y(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v13, v2

    goto/16 :goto_0

    :pswitch_16
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    move-object v12, v2

    goto/16 :goto_0

    :pswitch_17
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    move-object v11, v2

    goto/16 :goto_0

    :pswitch_18
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    goto/16 :goto_0

    :pswitch_19
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    goto/16 :goto_0

    :cond_0
    invoke-static {v0, v1}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance v8, Lcom/google/android/gms/games/PlayerEntity;

    invoke-direct/range {v8 .. v36}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Lcom/google/android/gms/games/PlayerLevelInfo;ZZLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLcom/google/android/gms/games/zzo;Lcom/google/android/gms/games/zza;ZLjava/lang/String;)V

    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/games/PlayerEntity;

    return-object p1
.end method
