.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzox;
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

    invoke-static {v0}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, v2

    move-object v7, v3

    move-object v15, v7

    move-object/from16 v16, v15

    move v8, v4

    move v9, v8

    move v10, v9

    move v11, v10

    move v12, v11

    move v13, v12

    move v14, v13

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
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_face/zzos;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_0

    :pswitch_1
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_face/zzpc;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v15, v2

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v14, v2

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v13, v2

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v12, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v11, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v10, v2

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v9, v2

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Lo9/a;->s(Landroid/os/Parcel;I)F

    move-result v2

    move v8, v2

    goto :goto_0

    :pswitch_9
    sget-object v3, Landroid/graphics/Rect;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lo9/a;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    move-object v7, v2

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Lo9/a;->w(Landroid/os/Parcel;I)I

    move-result v2

    move v6, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;

    invoke-direct/range {v5 .. v16}, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;-><init>(ILandroid/graphics/Rect;FFFFFFFLjava/util/List;Ljava/util/List;)V

    return-object v5

    :pswitch_data_0
    .packed-switch 0x1
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

    new-array p1, p1, [Lcom/google/android/gms/internal/mlkit_vision_face/zzow;

    return-object p1
.end method
