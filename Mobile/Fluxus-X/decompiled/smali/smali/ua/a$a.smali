.class public abstract Lua/a$a;
.super Lhb/b;
.source "SourceFile"

# interfaces
.implements Lua/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks"

    invoke-direct {p0, v0}, Lhb/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .param p2    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/a;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->Q(Lcom/google/android/gms/common/api/Status;Lta/a;)V

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/s;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->C0(Lcom/google/android/gms/common/api/Status;Lta/s;)V

    goto/16 :goto_0

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/u;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/u;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->f1(Lcom/google/android/gms/common/api/Status;Lta/u;)V

    goto/16 :goto_0

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/c0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->e2(Lcom/google/android/gms/common/api/Status;Lta/c0;)V

    goto/16 :goto_0

    :pswitch_4
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/e;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->M1(Lcom/google/android/gms/common/api/Status;Lta/e;)V

    goto/16 :goto_0

    :pswitch_5
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/q0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->e0(Lcom/google/android/gms/common/api/Status;Lta/q0;)V

    goto/16 :goto_0

    :pswitch_6
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/c;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->B(Lcom/google/android/gms/common/api/Status;Lta/c;)V

    goto/16 :goto_0

    :pswitch_7
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/i0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/i0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->b0(Lcom/google/android/gms/common/api/Status;Lta/i0;)V

    goto/16 :goto_0

    :pswitch_8
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/i;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/i;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->I1(Lcom/google/android/gms/common/api/Status;Lta/i;)V

    goto/16 :goto_0

    :pswitch_9
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/m;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/m;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->b1(Lcom/google/android/gms/common/api/Status;Lta/m;)V

    goto :goto_0

    :pswitch_a
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/k0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/k0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->Q0(Lcom/google/android/gms/common/api/Status;Lta/k0;)V

    goto :goto_0

    :pswitch_b
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/g0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->R0(Lcom/google/android/gms/common/api/Status;Lta/g0;)V

    goto :goto_0

    :pswitch_c
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/g;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->c2(Lcom/google/android/gms/common/api/Status;Lta/g;)V

    goto :goto_0

    :pswitch_d
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/m0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/m0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->f0(Lcom/google/android/gms/common/api/Status;Lta/m0;)V

    goto :goto_0

    :pswitch_e
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lta/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lhb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lta/e0;

    invoke-virtual {p0, p2}, Lhb/b;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lua/a;->K0(Lcom/google/android/gms/common/api/Status;Lta/e0;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
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
