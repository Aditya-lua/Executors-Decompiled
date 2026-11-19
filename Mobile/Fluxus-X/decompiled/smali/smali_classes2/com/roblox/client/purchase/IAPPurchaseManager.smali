.class public Lcom/roblox/client/purchase/IAPPurchaseManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/purchase/IAPPurchaseManager$f;,
        Lcom/roblox/client/purchase/IAPPurchaseManager$g;
    }
.end annotation


# static fields
.field public static h:Lmj/a; = null

.field public static i:Z = false

.field public static j:Landroid/app/ProgressDialog; = null

.field public static k:Landroid/app/Activity; = null

.field public static l:Ljava/lang/String; = "buyRobuxPage"

.field public static m:Ljava/lang/String; = "buyUpsell"

.field public static n:Ljava/lang/String; = "buyDevSub"


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public final c:Z

.field public d:Lmj/a;

.field public e:Landroid/os/Handler;

.field public f:Lei/s0;

.field public g:Lei/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmj/a;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    const-string v0, ""

    iput-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$f;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    iput-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$f;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    iput-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->g:Lei/s0;

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    iput-boolean p2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    sput-object p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    sput-boolean p2, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->e:Landroid/os/Handler;

    return-void
.end method

.method public static M(Landroid/content/Context;Z)V
    .locals 9

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    const-string v1, ", userId = "

    const-string v2, "tryGrantPendingPurchases: username = "

    const-wide/16 v3, 0x0

    const-string v5, "rbx.purchaseflow"

    if-eqz v0, :cond_4

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v6

    invoke-virtual {v6}, Lnk/c;->j()J

    move-result-wide v6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->L1()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "PaymentsProtocol: tryGrantPendingPurchases"

    invoke-static {v5, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    cmp-long v0, v6, v3

    if-lez v0, :cond_0

    invoke-static {p0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object p0

    invoke-virtual {p0, v6, v7, p1}, Lnj/a0;->K(JZ)V

    return-void

    :cond_0
    invoke-static {p0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnj/a0;->L(Z)V

    return-void

    :cond_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->t3()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->q()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object p0

    invoke-virtual {p0, v6, v7, v0, p1}, Lnj/m;->m1(JLjava/lang/String;Z)V

    return-void

    :cond_2
    cmp-long v1, v6, v3

    if-lez v1, :cond_3

    invoke-static {p0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object p0

    invoke-virtual {p0, v6, v7, v0, p1}, Lnj/m;->A0(JLjava/lang/String;Z)V

    return-void

    :cond_3
    invoke-static {p0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object p0

    invoke-virtual {p0, v0, p1}, Lnj/m;->B0(Ljava/lang/String;Z)V

    return-void

    :cond_4
    invoke-static {}, Lok/t;->i()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->j()J

    move-result-wide v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->L5()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_6

    cmp-long p1, v6, v3

    if-lez p1, :cond_5

    invoke-static {p0}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    throw v0

    :cond_5
    invoke-static {p0}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    throw v0

    :cond_6
    invoke-static {p0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    throw v0

    :cond_7
    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->z()V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->D()V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->B()V

    return-void
.end method

.method public static synthetic d(Z)V
    .locals 3

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    if-nez v0, :cond_1

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    sget v1, Lbh/q0;->P:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    :cond_1
    const-string v0, "rbx.purchaseflow"

    if-eqz p0, :cond_2

    const-string p0, "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show."

    invoke-static {v0, p0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_2
    const-string p0, "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide."

    invoke-static {v0, p0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic e(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->A()V

    return-void
.end method

.method public static synthetic f(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->y()V

    return-void
.end method

.method public static synthetic g(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->C()V

    return-void
.end method

.method public static getPlatformPaymentMethod()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GooglePlayStore"

    return-object v0

    :cond_0
    invoke-static {}, Lok/t;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MilkyWayStore"

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public static getPlatformPaymentProviderType()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GooglePlayStore"

    return-object v0

    :cond_0
    invoke-static {}, Lok/t;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MilkyWayStore"

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public static bridge synthetic h(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lmj/a;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lei/s0;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    return-object p0
.end method

.method public static invokeStore(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocol: invokeStore attempt."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-static {v7}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->j()J

    move-result-wide v3

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v5

    move-object v2, p0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lmj/k;->a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Z

    goto :goto_3

    :cond_1
    invoke-static {}, Lok/t;->i()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_2

    :cond_2
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p0

    invoke-virtual {p0}, Lnk/c;->j()J

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p0

    invoke-virtual {p0}, Lnk/c;->k()Ljava/lang/String;

    const/4 p0, 0x0

    throw p0

    :cond_3
    :goto_3
    const/4 p0, 0x0

    return p0
.end method

.method public static invokeStoreV2(Ljava/lang/String;JLjava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PaymentsProtocolV2: invokeStoreV2 attempt:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lok/t;->g()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_0

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v0

    new-instance v1, Lpj/b;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v1, p1, p3, p2}, Lpj/b;-><init>(Ljava/lang/Long;Ljava/lang/String;Lcom/roblox/client/purchase/a$d;)V

    invoke-virtual {v0, p0, v1, p2, p2}, Lnj/a0;->Q(Landroid/app/Activity;Lpj/b;Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic j(Lcom/roblox/client/purchase/IAPPurchaseManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    return p0
.end method

.method public static bridge synthetic k(Lcom/roblox/client/purchase/IAPPurchaseManager;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->q(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/roblox/client/purchase/IAPPurchaseManager;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/roblox/client/purchase/IAPPurchaseManager;ZJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic n()Lmj/a;
    .locals 1

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    return-object v0
.end method

.method public static native nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V
.end method

.method public static native nativeBeginPaymentsProtocolPurchaseV2(Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public static native nativeFinishPaymentsProtocolPurchase(Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public static native nativeFinishPaymentsProtocolPurchaseV2(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;)V
.end method

.method public static native nativeInvokeStore(Ljava/lang/String;JLjava/lang/String;)V
.end method

.method public static native nativePerformSubscriptionPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetMetricsPurchaseType(Ljava/lang/String;)V
.end method

.method public static native nativeSetPaymentSessionId(Ljava/lang/String;)V
.end method

.method public static native nativeSetPaymentsProtocolIsInApp(Z)V
.end method

.method public static native nativeSetProviderCurrencyCode(Ljava/lang/String;)V
.end method

.method public static native nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeSetUserId(J)V
.end method

.method public static bridge synthetic o()Z
    .locals 1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    return v0
.end method

.method public static bridge synthetic p(Ljava/lang/CharSequence;Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->t(Ljava/lang/CharSequence;Landroid/app/Activity;)V

    return-void
.end method

.method public static paymentsProtocolConcludeTransaction(Ljava/lang/String;JJ)Z
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string p3, "rbx.purchaseflow"

    const-string p4, "PaymentsProtocol: paymentsProtocolConcludeTransaction attempt."

    invoke-static {p3, p4}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lok/t;->g()Z

    move-result p3

    if-eqz p3, :cond_1

    sget-boolean p3, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p3, :cond_0

    sget-object p3, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p3}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p3

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p3}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p3

    :goto_0
    invoke-static {p3}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p3

    invoke-virtual {p3}, Lnk/c;->j()J

    move-result-wide v4

    move-object v1, p0

    move-wide v2, p1

    invoke-interface/range {v0 .. v5}, Lmj/k;->h(Ljava/lang/String;JJ)Z

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-static {}, Lok/t;->i()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p0

    invoke-virtual {p0}, Lnk/c;->j()J

    const/4 p0, 0x0

    throw p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static paymentsProtocolHandlePreparePaymentErrorCode(I)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->O2()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v0

    invoke-interface {v0, p0}, Lmj/k;->n(I)V

    return-void

    :cond_2
    invoke-static {}, Lok/t;->i()Z

    move-result p0

    if-eqz p0, :cond_4

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_3

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    const/4 p0, 0x0

    throw p0

    :cond_4
    :goto_2
    return-void
.end method

.method public static paymentsProtocolProcessPaymentCallback([JILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocolV2: paymentsProtocolProcessPaymentCallback attempt."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lnj/a0;->q0([JILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static paymentsProtocolPurchaseFinished(Lmj/p;)V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lmj/p;->c(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/roblox/client/purchase/IAPPurchaseManager$e;

    invoke-direct {v3, p0, v1, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager$e;-><init>(Lmj/p;Ljava/lang/CharSequence;Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static paymentsProtocolSetProgressBarDisplay(Z)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->p5()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt."

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-nez v0, :cond_1

    const-string v0, "PaymentsProtocol: initializing mPaymentsProtocolActivity"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    :cond_1
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-eqz v0, :cond_2

    new-instance v1, Lmj/b;

    invoke-direct {v1, p0}, Lmj/b;-><init>(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static setCheckoutSessionId(Ljava/lang/String;)Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v0

    invoke-interface {v0, p0}, Lmj/k;->m(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Lok/t;->i()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p0

    invoke-interface {p0}, Lbi/i;->L5()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lmj/a;

    invoke-interface {p0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    const/4 p0, 0x0

    throw p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static t(Ljava/lang/CharSequence;Landroid/app/Activity;)V
    .locals 9

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object v1

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v0, Lbh/q0;->W:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int v8, v7, v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v3, Lpk/c;

    const/4 v5, 0x0

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lpk/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p1, 0x1

    new-array v0, p1, [Lpk/a;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    invoke-static {v2, p0, v0}, Lpk/b;->b(Landroid/widget/TextView;Ljava/lang/String;[Lpk/a;)V

    const/high16 p0, 0x41a00000    # 20.0f

    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p0, 0x0

    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v5, 0x96

    const/16 v6, 0x64

    const/16 v3, 0x96

    const/16 v4, 0x64

    invoke-virtual/range {v1 .. v6}, Landroidx/appcompat/app/a;->w(Landroid/view/View;IIII)V

    invoke-virtual {v1, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :try_start_0
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setCancelable(Z)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic A()V
    .locals 1

    sget v0, Lbh/q0;->F1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method

.method public final synthetic B()V
    .locals 1

    sget v0, Lbh/q0;->A1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method

.method public final synthetic C()V
    .locals 1

    sget v0, Lbh/q0;->F1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method

.method public final synthetic D()V
    .locals 1

    sget v0, Lbh/q0;->A1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method

.method public E(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public F(JLjava/lang/String;)V
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->J(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public G(JLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->K(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public H(JLjava/lang/String;Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;)V
    .locals 8

    invoke-virtual {p4}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->paymentSessionId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v5, v0

    invoke-virtual {p4}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->purchaseType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p4}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->isInApp()Z

    move-result v7

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/purchase/IAPPurchaseManager;->L(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public I(JLjava/lang/String;Ljava/lang/String;)V
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "promptNativePurchaseWithPayload: userId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", roblox-native-productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    invoke-static {}, Lok/t;->j()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string p4, "Luobu purchasing not enabled"

    invoke-static {v1, p4}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-static {}, Lok/t;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p4

    invoke-interface {p4}, Lbi/i;->L5()Z

    move-result p4

    if-eqz p4, :cond_2

    new-instance p4, Lcom/roblox/client/purchase/IAPPurchaseManager$c;

    invoke-direct {p4, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$c;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_2
    invoke-static {v8}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    const/4 p1, 0x0

    throw p1

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L1()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "PaymentsProtocolV2: promptNativePurchaseWithPayload."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v8}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v3

    const/4 v9, 0x1

    iget-object v10, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p4

    invoke-interface/range {v3 .. v10}, Lmj/k;->d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLmj/o;)Z

    move-result p4

    if-nez p4, :cond_7

    new-instance p4, Lmj/g;

    invoke-direct {p4, p0}, Lmj/g;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_4
    move-object v6, p3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->t3()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "PaymentsProtocol: promptNativePurchaseWithPayload."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v8}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v3

    invoke-interface {v3, v2}, Lmj/k;->k(Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->V()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    invoke-interface {v3, v0}, Lmj/k;->j(Lei/s0;)V

    :cond_5
    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    const-string v0, ""

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v7

    move-object v9, p4

    move-object v4, v6

    move-wide v5, p1

    invoke-interface/range {v3 .. v9}, Lmj/k;->g(Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Ljava/lang/String;)Z

    return-void

    :cond_6
    invoke-static {v8}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v3

    const/4 v9, 0x1

    iget-object v10, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p4

    invoke-interface/range {v3 .. v10}, Lmj/k;->d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLmj/o;)Z

    move-result p4

    if-nez p4, :cond_7

    new-instance p4, Lcom/roblox/client/purchase/IAPPurchaseManager$d;

    invoke-direct {p4, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$d;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    :cond_7
    return-void
.end method

.method public J(JLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    sget-object v5, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->L(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public K(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "promptNativePurchase: player = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    iput-object p3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    invoke-static {}, Lok/t;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbh/y;->j(Landroid/app/Activity;)Loj/a;

    move-result-object v0

    iget-object v5, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-wide v3, p1

    move-object v2, p3

    invoke-virtual/range {v0 .. v5}, Loj/a;->b(Landroid/app/Activity;Ljava/lang/String;JLmj/o;)V

    return-void

    :cond_1
    invoke-static {}, Lok/t;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->L5()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    throw v2

    :cond_3
    invoke-static {v0}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    throw v2

    :cond_4
    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    :goto_3
    move-object v3, v0

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L1()Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_6

    const-string v0, "PaymentsProtocolV2: promptNativePurchase."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v3}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v0

    iget-object v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-wide v4, p1

    move-object v2, p3

    move-object v1, p4

    invoke-interface/range {v0 .. v6}, Lmj/k;->b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lmj/h;

    invoke-direct {v0, p0}, Lmj/h;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v7, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_6
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->t3()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v3}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v0

    invoke-interface {v0, v2}, Lmj/k;->i(Ljava/lang/String;)Z

    invoke-interface {v0, v7}, Lmj/k;->k(Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->V()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    invoke-interface {v0, v2}, Lmj/k;->j(Lei/s0;)V

    :cond_7
    invoke-static {v7}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->P1()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {p5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    const-string v2, ""

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    :goto_5
    invoke-interface {v0, p3}, Lmj/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    return-void

    :cond_9
    invoke-static {v3}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v0

    iget-object v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-wide v4, p1

    move-object v2, p3

    move-object v1, p4

    invoke-interface/range {v0 .. v6}, Lmj/k;->b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$a;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v7, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    :cond_a
    return-void
.end method

.method public final L(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "promptNativePurchase: userId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    iput-object p3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    invoke-static {}, Lok/t;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean p4, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {p4}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p4

    :goto_0
    move-object v1, p4

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {p4}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p4

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result p4

    if-nez p4, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p4

    invoke-interface {p4}, Lbi/i;->E4()Z

    move-result p4

    if-eqz p4, :cond_1

    if-eqz p6, :cond_1

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p4

    invoke-virtual {p4, v1}, Lbh/y;->j(Landroid/app/Activity;)Loj/a;

    move-result-object p4

    new-instance v2, Lcom/roblox/client/purchase/IAPPurchaseManager$g;

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, Lcom/roblox/client/purchase/IAPPurchaseManager$g;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;JLjava/lang/String;Ljava/lang/String;)V

    move-object p1, v3

    move-object v4, v6

    invoke-virtual {p4, v1, v4, v2}, Loj/a;->a(Landroid/app/Activity;Ljava/lang/String;Lmj/o;)V

    return-void

    :cond_1
    move-wide v6, p1

    move-object v4, p3

    move-object p1, p0

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p2

    invoke-virtual {p2, v1}, Lbh/y;->j(Landroid/app/Activity;)Loj/a;

    move-result-object v0

    iget-object v5, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-object v2, v4

    move-wide v3, v6

    invoke-virtual/range {v0 .. v5}, Loj/a;->b(Landroid/app/Activity;Ljava/lang/String;JLmj/o;)V

    return-void

    :cond_2
    move-object p1, p0

    goto/16 :goto_9

    :cond_3
    move-wide v6, p1

    move-object v4, p3

    move-object v8, p5

    move-object p1, p0

    invoke-static {}, Lok/t;->i()Z

    move-result p2

    const/4 p3, 0x0

    const/4 p5, 0x0

    if-eqz p2, :cond_7

    iget-boolean p2, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz p2, :cond_4

    iget-object p2, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {p2}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p2

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {p2}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p2

    :goto_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p4

    invoke-interface {p4}, Lbi/i;->L5()Z

    move-result p4

    if-nez p4, :cond_6

    invoke-static {p2}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->E4()Z

    move-result p2

    if-eqz p2, :cond_5

    if-eqz p6, :cond_5

    new-instance p2, Lmj/c;

    invoke-direct {p2, p0}, Lmj/c;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p5, v6, v7, v4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_5
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    throw p3

    :cond_6
    sget-object p4, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {p2}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    throw p3

    :cond_7
    iget-boolean p2, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz p2, :cond_8

    iget-object p2, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {p2}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object p2

    :goto_3
    move-object v5, p2

    goto :goto_4

    :cond_8
    iget-object p2, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {p2}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object p2

    goto :goto_3

    :goto_4
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->L1()Z

    move-result p2

    if-eqz p2, :cond_9

    const-string p2, "PaymentsProtocolV2: promptNativePurchase."

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v5}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v2

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    iget-object v8, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    invoke-interface/range {v2 .. v8}, Lmj/k;->b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;)Z

    move-result p2

    if-nez p2, :cond_12

    new-instance p2, Lmj/d;

    invoke-direct {p2, p0}, Lmj/d;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p5, v6, v7, v4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_9
    move-object p2, v5

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->t3()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->E4()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {v8}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    :goto_5
    invoke-static {p2}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object p2

    invoke-interface {p2, p3}, Lmj/k;->i(Ljava/lang/String;)Z

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p3

    invoke-interface {p3}, Lbi/i;->E4()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-interface {p2, p6}, Lmj/k;->k(Z)V

    goto :goto_6

    :cond_b
    invoke-interface {p2, p5}, Lmj/k;->k(Z)V

    :goto_6
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p3

    invoke-interface {p3}, Lbi/i;->V()Z

    move-result p3

    if-eqz p3, :cond_c

    iget-object p3, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    invoke-interface {p2, p3}, Lmj/k;->j(Lei/s0;)V

    :cond_c
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p3

    invoke-interface {p3}, Lbi/i;->E4()Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-static {p6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    goto :goto_7

    :cond_d
    invoke-static {p5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    :goto_7
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p3

    invoke-interface {p3}, Lbi/i;->P1()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-static {p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    goto :goto_8

    :cond_e
    const-string p3, ""

    invoke-static {p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    :goto_8
    invoke-interface {p2, v4}, Lmj/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    return-void

    :cond_f
    invoke-static {p2}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p3

    invoke-interface {p3}, Lbi/i;->E4()Z

    move-result p3

    if-eqz p3, :cond_11

    if-eqz p6, :cond_11

    if-nez v2, :cond_10

    new-instance p2, Lmj/e;

    invoke-direct {p2, p0}, Lmj/e;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p5, v6, v7, v4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_10
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p3

    invoke-virtual {p3}, Lnk/c;->k()Ljava/lang/String;

    move-result-object p3

    new-instance v3, Lcom/roblox/client/purchase/IAPPurchaseManager$g;

    move-wide v5, v6

    move-object v7, v4

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/roblox/client/purchase/IAPPurchaseManager$g;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;JLjava/lang/String;Ljava/lang/String;)V

    move-wide v0, v5

    move-object v4, v7

    const/4 v7, 0x0

    move-object v5, p2

    move-object v8, p4

    move-object v6, v3

    move-object v3, p3

    invoke-interface/range {v2 .. v8}, Lmj/k;->l(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;ZLjava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_12

    new-instance p2, Lmj/f;

    invoke-direct {p2, p0}, Lmj/f;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p5, v0, v1, v4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    return-void

    :cond_11
    move-object v5, p2

    move-wide v0, v6

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    iget-object v8, p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lei/s0;

    move-wide v6, v0

    invoke-interface/range {v2 .. v8}, Lmj/k;->b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;)Z

    move-result p2

    if-nez p2, :cond_12

    new-instance p2, Lcom/roblox/client/purchase/IAPPurchaseManager$b;

    invoke-direct {p2, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$b;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p5, v6, v7, v4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w(ZJLjava/lang/String;)V

    :cond_12
    :goto_9
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0, p1}, Lmj/a;->V(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->V(Ljava/lang/String;)V

    return-void
.end method

.method public final r(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0, p1}, Lmj/a;->T(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->T(I)V

    return-void
.end method

.method public s(Ljava/lang/CharSequence;)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p1, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->t(Ljava/lang/CharSequence;Landroid/app/Activity;)V

    return-void
.end method

.method public v(I)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lmj/a;

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final w(ZJLjava/lang/String;)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final x(ZJLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In-App purchase finished: success = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", player="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", productId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", checkoutSessionId="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "rbx.purchaseflow"

    invoke-static {v3, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-wide v4, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    const-string p1, "AppShellFragment.inAppPurchaseFinished: userId == 0."

    invoke-static {v3, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Native call. Success="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", checkoutSessionId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->u1()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_2

    if-eqz p5, :cond_1

    goto :goto_0

    :cond_1
    move-object p5, v1

    :goto_0
    invoke-static {p1, p2, p3, p4, p5}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinishedV2(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {p1, p2, p3, p4}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinished(ZJLjava/lang/String;)V

    :goto_1
    iput-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    iput-wide v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    return-void
.end method

.method public final synthetic y()V
    .locals 1

    sget v0, Lbh/q0;->A1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method

.method public final synthetic z()V
    .locals 1

    sget v0, Lbh/q0;->A1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)V

    return-void
.end method
