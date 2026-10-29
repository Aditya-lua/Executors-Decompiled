.class public final Lj9/d0;
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
    .locals 11

    invoke-static {p1}, Lo9/a;->D(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v5, v1

    move v6, v5

    move v8, v6

    move v9, v8

    move v10, v9

    move-object v4, v2

    move-object v7, v4

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Lo9/a;->u(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lo9/a;->n(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    invoke-static {p1, v1}, Lo9/a;->C(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1, v1}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_0

    :pswitch_2
    invoke-static {p1, v1}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_0

    :pswitch_3
    invoke-static {p1, v1}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v8

    goto :goto_0

    :pswitch_4
    invoke-static {p1, v1}, Lo9/a;->v(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v7

    goto :goto_0

    :pswitch_5
    invoke-static {p1, v1}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v6

    goto :goto_0

    :pswitch_6
    invoke-static {p1, v1}, Lo9/a;->o(Landroid/os/Parcel;I)Z

    move-result v5

    goto :goto_0

    :pswitch_7
    invoke-static {p1, v1}, Lo9/a;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lo9/a;->m(Landroid/os/Parcel;I)V

    new-instance v3, Lcom/google/android/gms/common/zzp;

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/common/zzp;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/common/zzp;

    return-object p1
.end method
