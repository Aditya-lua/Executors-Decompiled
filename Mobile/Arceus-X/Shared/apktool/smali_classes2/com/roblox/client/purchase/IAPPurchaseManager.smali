.class public Lcom/roblox/client/purchase/IAPPurchaseManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/purchase/IAPPurchaseManager$f;
    }
.end annotation


# static fields
.field public static h:Lej/a; = null

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

.field public d:Lej/a;

.field public e:Landroid/os/Handler;

.field public f:Lwh/r0;

.field public g:Lwh/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lej/a;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    const-string v0, ""

    iput-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$f;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    iput-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$f;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    iput-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->g:Lwh/r0;

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    iput-boolean p2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    sput-object p1, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    sput-boolean p2, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->e:Landroid/os/Handler;

    return-void
.end method

.method public static D(Landroid/content/Context;Z)V
    .locals 9

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    const-string v1, ", userId = "

    const-string v2, "tryGrantPendingPurchases: username = "

    const-wide/16 v3, 0x0

    const-string v5, "rbx.purchaseflow"

    if-eqz v0, :cond_4

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v6

    invoke-virtual {v6}, Lfk/c;->j()J

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

    invoke-static {v5, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->H1()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "PaymentsProtocol: tryGrantPendingPurchases"

    invoke-static {v5, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    cmp-long v0, v6, v3

    if-lez v0, :cond_0

    invoke-static {p0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object p0

    invoke-virtual {p0, v6, v7, p1}, Lfj/a0;->K(JZ)V

    return-void

    :cond_0
    invoke-static {p0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object p0

    invoke-virtual {p0, p1}, Lfj/a0;->L(Z)V

    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->m3()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object p0

    invoke-virtual {p0, v6, v7, v0, p1}, Lfj/m;->m1(JLjava/lang/String;Z)V

    return-void

    :cond_2
    cmp-long v1, v6, v3

    if-lez v1, :cond_3

    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object p0

    invoke-virtual {p0, v6, v7, v0, p1}, Lfj/m;->A0(JLjava/lang/String;Z)V

    return-void

    :cond_3
    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object p0

    invoke-virtual {p0, v0, p1}, Lfj/m;->B0(Ljava/lang/String;Z)V

    return-void

    :cond_4
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->j()J

    move-result-wide v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->I5()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_6

    cmp-long p1, v6, v3

    if-lez p1, :cond_5

    invoke-static {p0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    throw v0

    :cond_5
    invoke-static {p0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    throw v0

    :cond_6
    invoke-static {p0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    throw v0

    :cond_7
    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->v()V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->w()V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->u()V

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

    sget v1, Lsg/q0;->P:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    :cond_1
    const-string v0, "rbx.purchaseflow"

    if-eqz p0, :cond_2

    const-string p0, "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show."

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_2
    const-string p0, "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide."

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->j:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static bridge synthetic e(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lej/a;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/roblox/client/purchase/IAPPurchaseManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    return p0
.end method

.method public static bridge synthetic g(Lcom/roblox/client/purchase/IAPPurchaseManager;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->m(Ljava/lang/String;)V

    return-void
.end method

.method public static getPlatformPaymentMethod()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GooglePlayStore"

    return-object v0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->I5()Z

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

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GooglePlayStore"

    return-object v0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->I5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MilkyWayStore"

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public static bridge synthetic h(Lcom/roblox/client/purchase/IAPPurchaseManager;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->n(I)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/roblox/client/purchase/IAPPurchaseManager;ZJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->t(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static invokeStore(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocol: invokeStore attempt."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-static {v7}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->j()J

    move-result-wide v3

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v5

    move-object v2, p0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lej/g;->a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Z

    goto :goto_3

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_2

    :cond_2
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->j()J

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->k()Ljava/lang/String;

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

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lgk/t;->g()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_0

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    new-instance v1, Lhj/b;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v1, p1, p3, p2}, Lhj/b;-><init>(Ljava/lang/Long;Ljava/lang/String;Lcom/roblox/client/purchase/a$d;)V

    invoke-virtual {v0, p0, v1, p2, p2}, Lfj/a0;->Q(Landroid/app/Activity;Lhj/b;Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic j()Lej/a;
    .locals 1

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    return-object v0
.end method

.method public static bridge synthetic k()Z
    .locals 1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    return v0
.end method

.method public static bridge synthetic l(Ljava/lang/CharSequence;Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->p(Ljava/lang/CharSequence;Landroid/app/Activity;)V

    return-void
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

.method public static p(Ljava/lang/CharSequence;Landroid/app/Activity;)V
    .locals 9

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object v1

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v0, Lsg/q0;->W:I

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

    new-instance v3, Lhk/c;

    const/4 v5, 0x0

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lhk/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p1, 0x1

    new-array v0, p1, [Lhk/a;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    invoke-static {v2, p0, v0}, Lhk/b;->b(Landroid/widget/TextView;Ljava/lang/String;[Lhk/a;)V

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

.method public static paymentsProtocolConcludeTransaction(Ljava/lang/String;JJ)Z
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string p3, "rbx.purchaseflow"

    const-string p4, "PaymentsProtocol: paymentsProtocolConcludeTransaction attempt."

    invoke-static {p3, p4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lgk/t;->g()Z

    move-result p3

    if-eqz p3, :cond_1

    sget-boolean p3, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p3, :cond_0

    sget-object p3, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p3}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object p3

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p3}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object p3

    :goto_0
    invoke-static {p3}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p3

    invoke-virtual {p3}, Lfk/c;->j()J

    move-result-wide v4

    move-object v1, p0

    move-wide v2, p1

    invoke-interface/range {v0 .. v5}, Lej/g;->g(Ljava/lang/String;JJ)Z

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->j()J

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

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H2()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-interface {v0, p0}, Lej/g;->m(I)V

    return-void

    :cond_2
    invoke-static {}, Lgk/t;->i()Z

    move-result p0

    if-eqz p0, :cond_4

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_3

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

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

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lfj/a0;->q0([JILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static paymentsProtocolPurchaseFinished(Lej/k;)V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lej/k;->c(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/roblox/client/purchase/IAPPurchaseManager$e;

    invoke-direct {v3, p0, v1, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager$e;-><init>(Lej/k;Ljava/lang/CharSequence;Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static paymentsProtocolSetProgressBarDisplay(Z)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->j5()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt."

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-nez v0, :cond_1

    const-string v0, "PaymentsProtocol: initializing mPaymentsProtocolActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    :cond_1
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->k:Landroid/app/Activity;

    if-eqz v0, :cond_2

    new-instance v1, Lej/b;

    invoke-direct {v1, p0}, Lej/b;-><init>(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
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

.method public static setCheckoutSessionId(Ljava/lang/String;)Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-interface {v0, p0}, Lej/g;->l(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->I5()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-boolean p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->i:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->h:Lej/a;

    invoke-interface {p0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    const/4 p0, 0x0

    throw p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public A(JLjava/lang/String;Ljava/lang/String;)V
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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string p4, "Luobu purchasing not enabled"

    invoke-static {v1, p4}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p4

    invoke-interface {p4}, Lth/i;->I5()Z

    move-result p4

    if-eqz p4, :cond_2

    new-instance p4, Lcom/roblox/client/purchase/IAPPurchaseManager$c;

    invoke-direct {p4, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$c;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    return-void

    :cond_2
    invoke-static {v8}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    const/4 p1, 0x0

    throw p1

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H1()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "PaymentsProtocolV2: promptNativePurchaseWithPayload."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v8}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v3

    const/4 v9, 0x1

    iget-object v10, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p4

    invoke-interface/range {v3 .. v10}, Lej/g;->d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLej/j;)Z

    move-result p4

    if-nez p4, :cond_7

    new-instance p4, Lej/c;

    invoke-direct {p4, p0}, Lej/c;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    return-void

    :cond_4
    move-object v6, p3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->m3()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "PaymentsProtocol: promptNativePurchaseWithPayload."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v8}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v3

    invoke-interface {v3, v2}, Lej/g;->k(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->U()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    invoke-interface {v3, v0}, Lej/g;->b(Lwh/r0;)V

    :cond_5
    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    const-string v0, ""

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v7

    move-object v9, p4

    move-object v4, v6

    move-wide v5, p1

    invoke-interface/range {v3 .. v9}, Lej/g;->f(Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Ljava/lang/String;)Z

    return-void

    :cond_6
    invoke-static {v8}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v3

    const/4 v9, 0x1

    iget-object v10, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p4

    invoke-interface/range {v3 .. v10}, Lej/g;->d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLej/j;)Z

    move-result p4

    if-nez p4, :cond_7

    new-instance p4, Lcom/roblox/client/purchase/IAPPurchaseManager$d;

    invoke-direct {p4, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$d;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v2, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    :cond_7
    return-void
.end method

.method public B(JLjava/lang/String;Ljava/lang/String;)V
    .locals 8

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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    iput-object p3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0, v1}, Lsg/y;->j(Landroid/app/Activity;)Lgj/a;

    move-result-object v0

    iget-object v5, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v3, p1

    move-object v2, p3

    invoke-virtual/range {v0 .. v5}, Lgj/a;->a(Landroid/app/Activity;Ljava/lang/String;JLej/j;)V

    return-void

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->I5()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    throw v2

    :cond_3
    invoke-static {v0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    throw v2

    :cond_4
    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    :goto_3
    move-object v3, v0

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H1()Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_6

    const-string v0, "PaymentsProtocolV2: promptNativePurchase."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v3}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    iget-object v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v4, p1

    move-object v2, p3

    invoke-interface/range {v0 .. v6}, Lej/g;->n(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lej/d;

    invoke-direct {v0, p0}, Lej/d;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v7, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    return-void

    :cond_6
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->m3()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v3}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-interface {v0, v2}, Lej/g;->j(Ljava/lang/String;)Z

    invoke-interface {v0, v7}, Lej/g;->k(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->U()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    invoke-interface {v0, v2}, Lej/g;->b(Lwh/r0;)V

    :cond_7
    invoke-static {v7}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->L1()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    const-string v2, ""

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    :goto_5
    invoke-interface {v0, p3}, Lej/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    return-void

    :cond_9
    invoke-static {v3}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    iget-object v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v4, p1

    move-object v2, p3

    invoke-interface/range {v0 .. v6}, Lej/g;->n(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$b;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v7, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    :cond_a
    return-void
.end method

.method public C(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    iput-object p3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->b:Ljava/lang/String;

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0, v1}, Lsg/y;->j(Landroid/app/Activity;)Lgj/a;

    move-result-object v0

    iget-object v5, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v3, p1

    move-object v2, p3

    invoke-virtual/range {v0 .. v5}, Lgj/a;->a(Landroid/app/Activity;Ljava/lang/String;JLej/j;)V

    return-void

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->I5()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    throw v2

    :cond_3
    invoke-static {v0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    throw v2

    :cond_4
    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    :goto_3
    move-object v3, v0

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H1()Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_6

    const-string v0, "PaymentsProtocolV2: promptNativePurchase."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v3}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    iget-object v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v4, p1

    move-object v2, p3

    move-object v1, p4

    invoke-interface/range {v0 .. v6}, Lej/g;->n(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lej/e;

    invoke-direct {v0, p0}, Lej/e;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v7, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    return-void

    :cond_6
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->m3()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {v3}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-interface {v0, v2}, Lej/g;->j(Ljava/lang/String;)Z

    invoke-interface {v0, v7}, Lej/g;->k(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->U()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    invoke-interface {v0, v2}, Lej/g;->b(Lwh/r0;)V

    :cond_7
    invoke-static {v7}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->L1()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {p5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    const-string v2, ""

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    :goto_5
    invoke-interface {v0, p3}, Lej/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    return-void

    :cond_9
    invoke-static {v3}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    iget-object v6, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->f:Lwh/r0;

    move-wide v4, p1

    move-object v2, p3

    move-object v1, p4

    invoke-interface/range {v0 .. v6}, Lej/g;->n(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/IAPPurchaseManager$a;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v7, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->s(ZJLjava/lang/String;)V

    :cond_a
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0, p1}, Lej/a;->W(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V

    return-void
.end method

.method public final n(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0, p1}, Lej/a;->U(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->U(I)V

    return-void
.end method

.method public o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p1, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->p(Ljava/lang/CharSequence;Landroid/app/Activity;)V

    return-void
.end method

.method public r(I)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->d:Lej/a;

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final s(ZJLjava/lang/String;)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->t(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final t(ZJLjava/lang/String;Ljava/lang/String;)V
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

    invoke-static {v3, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-wide v4, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->a:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    const-string p1, "AppShellFragment.inAppPurchaseFinished: userId == 0."

    invoke-static {v3, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

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

    invoke-static {v3, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->q1()Z

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

.method public final synthetic u()V
    .locals 1

    sget v0, Lsg/q0;->q1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->n(I)V

    return-void
.end method

.method public final synthetic v()V
    .locals 1

    sget v0, Lsg/q0;->q1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->n(I)V

    return-void
.end method

.method public final synthetic w()V
    .locals 1

    sget v0, Lsg/q0;->q1:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->n(I)V

    return-void
.end method

.method public x(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public y(JLjava/lang/String;)V
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->B(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public z(JLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->C(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
