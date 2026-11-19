.class public Lnj/m$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnj/m;


# direct methods
.method public constructor <init>(Lnj/m;)V
    .locals 0

    iput-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/d;",
            "Ljava/util/List<",
            "Lw7/k;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v0}, Lnj/m;->w(Lnj/m;)Lnj/h0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->t3()Z

    move-result v0

    const-string v1, "User cancelled"

    const-string v2, "onPurchasesUpdated failed"

    const/4 v3, 0x7

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->V()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lnj/e$b;->s:Lnj/e$b;

    invoke-static {p1, p2, v1, v2}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->p0(Lnj/m;)V

    :goto_0
    new-instance p1, Lnj/e;

    sget-object p2, Lnj/e$b;->s:Lnj/e$b;

    iget-object v1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v1}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, p2, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->q()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->D(Lnj/m;)J

    move-result-wide v1

    iget-object p2, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p2}, Lnj/m;->E(Lnj/m;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, v2, p2, v5}, Lnj/m;->m1(JLjava/lang/String;Z)V

    goto/16 :goto_5

    :cond_3
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->S(Lnj/m;)V

    goto/16 :goto_5

    :cond_4
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->V()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lnj/e$b;->j:Lnj/e$b;

    invoke-static {p1, p2, v2, v1}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->o0(Lnj/m;)V

    :goto_1
    new-instance p1, Lnj/e;

    sget-object p2, Lnj/e$b;->j:Lnj/e$b;

    iget-object v1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v1}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, p2, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    goto/16 :goto_5

    :cond_6
    if-eqz p2, :cond_b

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v1, v5

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/k;

    invoke-virtual {v0}, Lw7/k;->f()I

    move-result v2

    iget-object v3, p0, Lnj/m$k;->a:Lnj/m;

    invoke-virtual {v3, v0}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "rbx.purchaseflow"

    if-eqz v2, :cond_8

    const/4 v7, 0x2

    if-eq v2, v7, :cond_7

    move v1, v4

    goto :goto_3

    :cond_7
    iget-object v2, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v2}, Lnj/m;->i0(Lnj/m;)V

    const-string v2, "PaymentsProtocol: Pending purchase!"

    invoke-static {v6, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_8
    iget-object v2, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v2}, Lnj/m;->r0(Lnj/m;)V

    const-string v2, "PaymentsProtocol: unspecified state!"

    invoke-static {v6, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    if-eqz v1, :cond_a

    invoke-virtual {v0}, Lw7/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lw7/k;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->h2()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v2, v0}, Lnj/m;->P(Lnj/m;Lw7/k;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_9
    invoke-virtual {v0}, Lw7/k;->a()Lw7/a;

    move-result-object v2

    invoke-virtual {v2}, Lw7/a;->a()Ljava/lang/String;

    move-result-object v2

    :goto_4
    iget-object v6, p0, Lnj/m$k;->a:Lnj/m;

    invoke-virtual {v6, v0}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeFinishPaymentsProtocolPurchase(Ljava/lang/String;ILjava/lang/String;)V

    :cond_a
    move-object v0, v3

    goto :goto_2

    :cond_b
    :goto_5
    move v1, v5

    :cond_c
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1, v0}, Lnj/m;->Y(Lnj/m;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_f

    if-nez v1, :cond_e

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->u1()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->D(Lnj/m;)J

    move-result-wide p1

    iget-object v0, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v0}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v5, p1, p2, v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinishedV2(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_d
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->D(Lnj/m;)J

    move-result-wide p1

    iget-object v0, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {v0}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, p1, p2, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinished(ZJLjava/lang/String;)V

    :cond_e
    :goto_6
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->f0(Lnj/m;)V

    :cond_f
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1, v5}, Lnj/m;->F(Lnj/m;Z)V

    return-void

    :cond_10
    if-eqz p1, :cond_13

    if-eq p1, v4, :cond_12

    if-eq p1, v3, :cond_11

    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lnj/e$b;->s:Lnj/e$b;

    invoke-static {p1, p2, v0, v2}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_11
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->S(Lnj/m;)V

    return-void

    :cond_12
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->z(Lnj/m;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lnj/e$b;->j:Lnj/e$b;

    invoke-static {p1, p2, v0, v1}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_13
    iget-object p1, p0, Lnj/m$k;->a:Lnj/m;

    invoke-static {p1, p2, v5}, Lnj/m;->V(Lnj/m;Ljava/util/List;Z)V

    return-void
.end method
