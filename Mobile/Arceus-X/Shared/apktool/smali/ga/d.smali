.class public abstract Lga/d;
.super Lfb/q;
.source "SourceFile"

# interfaces
.implements Lga/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-direct {p0, v0}, Lfb/q;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    const/16 p4, 0x1771

    if-eq p1, p4, :cond_7

    const/16 p4, 0x1772

    if-eq p1, p4, :cond_6

    const/16 p4, 0x2eeb

    if-eq p1, p4, :cond_5

    const/16 p4, 0x2eec

    if-eq p1, p4, :cond_4

    const/16 p4, 0x32c9

    if-eq p1, p4, :cond_3

    const/16 p4, 0x32ca

    if-eq p1, p4, :cond_2

    const/16 p4, 0x4a39

    if-eq p1, p4, :cond_1

    const/16 p4, 0x4a3a

    if-eq p1, p4, :cond_0

    packed-switch p1, :pswitch_data_0

    sparse-switch p1, :sswitch_data_0

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    packed-switch p1, :pswitch_data_3

    packed-switch p1, :pswitch_data_4

    const/4 p1, 0x0

    return p1

    :pswitch_0
    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    sget-object p1, Lcom/google/android/gms/drive/Contents;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    move-object v3, p4

    check-cast v3, Lcom/google/android/gms/drive/Contents;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/drive/Contents;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/google/android/gms/drive/Contents;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lga/e;->R1(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/Contents;)V

    goto/16 :goto_0

    :pswitch_1
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_2
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_3
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_4
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_5
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_6
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_7
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->G(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_8
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    sget-object p4, Lcom/google/android/gms/drive/Contents;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/drive/Contents;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lga/e;->Q1(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/drive/Contents;)V

    goto/16 :goto_0

    :pswitch_9
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_a
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_b
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_c
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_d
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_e
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_f
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_10
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_11
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_12
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_13
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_14
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_15
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_16
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_17
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_18
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->O1(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :sswitch_0
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4, v1}, Lga/e;->U1(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_0

    :sswitch_1
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lcom/google/android/gms/games/internal/player/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/games/internal/player/zze;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_3
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_4
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lga/e;->U0(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_5
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_6
    move-object v0, p0

    invoke-static {p2}, Lfb/k0;->a(Landroid/os/Parcel;)Z

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_7
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_8
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_9
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_a
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_b
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_c
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_d
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_e
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_f
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_10
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_11
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_12
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_13
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_14
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_15
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_16
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_17
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_18
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_19
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_1a
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_1b
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_1c
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->n(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :sswitch_1d
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_1e
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->k2(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :sswitch_1f
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_20
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_21
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_22
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_23
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_24
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_25
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_26
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_27
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->a(Landroid/os/Parcel;)Z

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_28
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_29
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/games/multiplayer/realtime/zzb;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/zzb;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2a
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2b
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2c
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2d
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2e
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_2f
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_30
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_31
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_32
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_33
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_34
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_35
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_36
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_37
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_38
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :sswitch_39
    move-object v0, p0

    invoke-interface {p0}, Lga/e;->e()V

    goto/16 :goto_0

    :pswitch_19
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_1a
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_1b
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :pswitch_1c
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->X0(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_1d
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->K0(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_1e
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->k1(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_1f
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p4, p1}, Lga/e;->a0(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_20
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->r0(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_21
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lga/e;->J1(ILjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_22
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->z0(Lcom/google/android/gms/common/data/DataHolder;)V

    goto/16 :goto_0

    :pswitch_23
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto/16 :goto_0

    :cond_0
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->a(Landroid/os/Parcel;)Z

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto :goto_0

    :cond_1
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lcom/google/android/gms/games/video/VideoCapabilities;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/games/video/VideoCapabilities;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto :goto_0

    :cond_2
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto :goto_0

    :cond_3
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto :goto_0

    :cond_4
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lga/e;->T0(ILjava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v0, p0

    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lga/e;->F0(Lcom/google/android/gms/common/data/DataHolder;)V

    goto :goto_0

    :cond_6
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    goto :goto_0

    :cond_7
    move-object v0, p0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1389
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x1398 -> :sswitch_39
        0x1399 -> :sswitch_38
        0x139a -> :sswitch_37
        0x139b -> :sswitch_36
        0x139c -> :sswitch_35
        0x139d -> :sswitch_34
        0x139e -> :sswitch_33
        0x139f -> :sswitch_32
        0x13a0 -> :sswitch_31
        0x13a1 -> :sswitch_30
        0x13a2 -> :sswitch_2f
        0x13a3 -> :sswitch_2e
        0x13a4 -> :sswitch_2d
        0x13a5 -> :sswitch_2c
        0x13a6 -> :sswitch_2b
        0x13a7 -> :sswitch_2a
        0x13a8 -> :sswitch_29
        0x13a9 -> :sswitch_28
        0x13aa -> :sswitch_27
        0x13ab -> :sswitch_26
        0x13ac -> :sswitch_25
        0x13ad -> :sswitch_24
        0x13ae -> :sswitch_23
        0x13af -> :sswitch_22
        0x13b0 -> :sswitch_21
        0x2329 -> :sswitch_20
        0x2af9 -> :sswitch_1f
        0x2ee1 -> :sswitch_1e
        0x36b1 -> :sswitch_1d
        0x3a99 -> :sswitch_1c
        0x426a -> :sswitch_1b
        0x4a40 -> :sswitch_1a
        0x4a41 -> :sswitch_19
        0x4a42 -> :sswitch_18
        0x4e21 -> :sswitch_17
        0x4e22 -> :sswitch_16
        0x4e23 -> :sswitch_15
        0x4e24 -> :sswitch_14
        0x4e25 -> :sswitch_13
        0x4e26 -> :sswitch_12
        0x4e27 -> :sswitch_11
        0x4e28 -> :sswitch_10
        0x4e29 -> :sswitch_f
        0x4e2c -> :sswitch_e
        0x4e33 -> :sswitch_d
        0x4e34 -> :sswitch_c
        0x59d9 -> :sswitch_b
        0x59da -> :sswitch_a
        0x59db -> :sswitch_9
        0x59dc -> :sswitch_8
        0x59dd -> :sswitch_7
        0x5dc2 -> :sswitch_6
        0x61aa -> :sswitch_5
        0x61ab -> :sswitch_4
        0x61ac -> :sswitch_3
        0x61ad -> :sswitch_2
        0x61ae -> :sswitch_1
        0x61af -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x1f41
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2711
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2ee4
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2eee
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
