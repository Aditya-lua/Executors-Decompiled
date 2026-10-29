.class public final Lja/d;
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
    .locals 21

    move-object/from16 v0, p1

    invoke-static {v0}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v2

    move-object v6, v5

    move-object v10, v6

    move-object/from16 v19, v10

    move-object/from16 v20, v19

    move v7, v3

    move v8, v7

    move v9, v8

    move v11, v9

    move v12, v11

    move v13, v12

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    move/from16 v18, v17

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static {v0}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lo9/a;->n(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {v0, v2}, Lo9/a;->p(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    move-result-object v20

    goto :goto_0

    :pswitch_1
    sget-object v3, Lcom/google/android/gms/games/internal/player/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lcom/google/android/gms/games/internal/player/zzh;

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v18

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v17

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v16

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v15

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v14

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v13

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v12

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v11

    goto :goto_0

    :pswitch_a
    sget-object v3, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    goto :goto_0

    :pswitch_b
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_0

    :pswitch_c
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v8

    goto :goto_0

    :pswitch_d
    invoke-static {v0, v2}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_0

    :pswitch_e
    invoke-static {v0, v2}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :pswitch_f
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/google/android/gms/common/api/Status;

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;

    invoke-direct/range {v4 .. v20}, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;ZZZLcom/google/android/gms/games/internal/player/StockProfileImageEntity;ZZIZZIIZLcom/google/android/gms/games/internal/player/zzh;Ljava/lang/Boolean;)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

    new-array p1, p1, [Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;

    return-object p1
.end method
