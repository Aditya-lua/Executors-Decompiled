.class public Lvi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lvi/g;


# instance fields
.field public final a:Lgk/c0;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:J

.field public c:Lej/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, Lgk/d0;

    invoke-direct {v0}, Lgk/d0;-><init>()V

    invoke-direct {p0, v0}, Lvi/g;-><init>(Lgk/c0;)V

    return-void
.end method

.method public constructor <init>(Lgk/c0;)V
    .locals 0
    .param p1    # Lgk/c0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvi/g;->a:Lgk/c0;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "sessionCheck"

    invoke-static {p0, v0}, Lsg/t0;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b()Lvi/g;
    .locals 2

    sget-object v0, Lvi/g;->d:Lvi/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lvi/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lvi/g;->d:Lvi/g;

    if-nez v1, :cond_1

    new-instance v1, Lvi/g;

    invoke-direct {v1}, Lvi/g;-><init>()V

    sput-object v1, Lvi/g;->d:Lvi/g;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lvi/g;->d:Lvi/g;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static c(Z)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const-string p0, "Quest-ROBLOXPlayer-Session-Inferred-Crash"

    return-object p0

    :cond_0
    const-string p0, "Quest-ROBLOXPlayer-Session-Inferred-Success"

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    const-string p0, "Android-ROBLOXPlayer-Session-Inferred-Crash"

    return-object p0

    :cond_2
    const-string p0, "Android-ROBLOXPlayer-Session-Inferred-Success"

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\\."

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    aget-object p0, p0, v0

    goto :goto_0

    :cond_0
    const-string p0, "Unknown"

    :goto_0
    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Quest-AppStartup-Version-"

    goto :goto_1

    :cond_1
    invoke-static {}, Lgk/t;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Amazon-AppStartup-Version-"

    goto :goto_1

    :cond_2
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Galaxy-AppStartup-Version-"

    goto :goto_1

    :cond_3
    const-string v0, "Android-AppStartup-Version-"

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Quest-AppStartup-Version-Total"

    return-object v0

    :cond_0
    invoke-static {}, Lgk/t;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Amazon-AppStartup-Version-Total"

    return-object v0

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Galaxy-AppStartup-Version-Total"

    return-object v0

    :cond_2
    const-string v0, "Android-AppStartup-Version-Total"

    return-object v0
.end method

.method public static h(Ljava/lang/String;I)V
    .locals 3

    new-instance v0, Lei/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lsg/a1;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Lsg/a1;->v(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lei/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lei/r;->c()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Request"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Request"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public B()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-200"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-200"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public C()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-400"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-400"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public D()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-401"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-401"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public E()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-403"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-403"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public F()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-404"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-404"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public G()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-429"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-429"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public H()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-500"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-500"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public I()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-503"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-503"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public J()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-Unknown"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-Unknown"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public K()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Verify-Request"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Verify-Request"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public L()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Verify-Response-200"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Verify-Response-200"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public M()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Verify-Response-400"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Verify-Response-400"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public N()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Verify-Response-401"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Verify-Response-401"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public O()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Verify-Response-500"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Verify-Response-500"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public P()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Verify-Response-Unknown"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Verify-Response-Unknown"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public Q(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Android-Payments-PaymentsProtocolUseQueryPurchases-Subs"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PaymentsProtocolUseQueryPurchases-InApp"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public R()V
    .locals 1

    const-string v0, "Android-Payments-Pending-Purchase"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public S(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckBalanceError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckBalanceError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckBalanceError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckBalanceError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public T(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckError-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PrecheckError-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PrecheckError-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PrecheckError-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PrecheckError-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PrecheckError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public U(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckProductDetailsNotSupported-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckProductDetailsNotSupported-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public V(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckRetry-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PrecheckRetry-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PrecheckRetry-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PrecheckRetry-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PrecheckRetry-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PrecheckRetry-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public W(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckUnknownError-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PrecheckUnknownError-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PrecheckUnknownError-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PrecheckUnknownError-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkYWay-Payments-PrecheckUnknownError-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PrecheckUnknownError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public X(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PurchaseAlreadyAcknowledged-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PurchaseAlreadyAcknowledged-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public Y(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseCancelled-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PurchaseCancelled-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PurchaseCancelled-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PurchaseCancelled-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PurchaseCancelled-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PurchaseCancelled-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public Z(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseFailed-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PurchaseFailed-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PurchaseFailed-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PurchaseFailed-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PurchaseFailed-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PurchaseFailed-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public a0(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseFlooded-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PurchaseFlooded-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PurchaseFlooded-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PurchaseFlooded-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PurchaseFlooded-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PurchaseFlooded-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public b0(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseSuccess-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-PurchaseSuccess-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-PurchaseSuccess-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-PurchaseSuccess-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-PurchaseSuccess-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-PurchaseSuccess-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public c0()V
    .locals 1

    const-string v0, "Android-Payments-Unacknowledged-Purchase-Failure"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public d0()V
    .locals 1

    const-string v0, "Android-Payments-Unknown-State-Purchase"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public e0(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-VerificationEmptyError-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-VerificationEmptyError-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-VerificationEmptyError-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-VerificationEmptyError-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-VerificationEmptyError-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-VerificationEmptyError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public f()V
    .locals 1

    invoke-static {}, Lgk/t;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Mobile-DownloadCount-Amazon"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Mobile-DownloadCount-Galaxy"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "Mobile-DownloadCount-Android"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public f0(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-VerificationError-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-VerificationError-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-VerificationError-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-VerificationError-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-VerificationError-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-VerificationError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public g()V
    .locals 1

    invoke-static {}, Lvi/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-static {}, Lsg/a1;->d1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lvi/g;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public g0(ZZ)V
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-VerificationUnknownError-InApp"

    goto :goto_0

    :cond_0
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "MilkyWay-Payments-VerificationUnknownError-InApp"

    goto :goto_0

    :cond_1
    const-string p1, "Android-Payments-VerificationUnknownError-InApp"

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    const-string p1, "Amazon-Payments-VerificationUnknownError-InGame"

    goto :goto_0

    :cond_3
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "MilkyWay-Payments-VerificationUnknownError-InGame"

    goto :goto_0

    :cond_4
    const-string p1, "Android-Payments-VerificationUnknownError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public h0(Lej/h;)V
    .locals 0

    iput-object p1, p0, Lvi/g;->c:Lej/h;

    return-void
.end method

.method public i(Z)V
    .locals 3

    new-instance v0, Lli/a;

    const-string v1, "Android-RobloxPlayer-SessionReport-Inferred"

    invoke-direct {v0, v1}, Lli/a;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string v1, "Crash"

    goto :goto_0

    :cond_0
    const-string v1, "Success"

    :goto_0
    const-string v2, "Session"

    invoke-virtual {v0, v2, v1}, Lli/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object v0

    invoke-virtual {v0}, Lli/a;->g()Ljh/c;

    invoke-static {p1}, Lvi/g;->c(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public i0()V
    .locals 8

    iget-object v0, p0, Lvi/g;->a:Lgk/c0;

    invoke-interface {v0}, Lgk/c0;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lvi/g;->b:J

    sub-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v2, v2, v6

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x36ee80

    cmp-long v2, v4, v2

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lvi/g;->g()V

    iput-wide v0, p0, Lvi/g;->b:J

    return-void
.end method

.method public j(Landroid/content/Context;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/d;->c(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public k(Landroid/content/Context;J)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lvi/d;->e(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 3

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lvi/g;->c:Lej/h;

    if-eqz v0, :cond_0

    iget v1, v0, Lej/h;->d:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lej/h;->d:I

    new-instance v0, Lli/a;

    const-string v1, "Android-PurchaseFlow"

    invoke-direct {v0, v1}, Lli/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lli/a;->m(Z)Lli/a;

    move-result-object v0

    iget-object v1, p0, Lvi/g;->c:Lej/h;

    iget-object v1, v1, Lej/h;->a:Ljava/lang/String;

    const-string v2, "Username"

    invoke-virtual {v0, v2, v1}, Lli/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object v0

    iget-object v1, p0, Lvi/g;->c:Lej/h;

    iget-boolean v1, v1, Lej/h;->c:Z

    const-string v2, "InAppPurchase"

    invoke-virtual {v0, v2, v1}, Lli/a;->e(Ljava/lang/String;Z)Lli/a;

    move-result-object v0

    iget-object v1, p0, Lvi/g;->c:Lej/h;

    iget-object v1, v1, Lej/h;->b:Ljava/lang/String;

    const-string v2, "ProductId"

    invoke-virtual {v0, v2, v1}, Lli/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lvi/g;->c:Lej/h;

    iget v2, v2, Lej/h;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Message"

    invoke-virtual {v0, v1, p1}, Lli/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object p1

    invoke-static {}, Lsg/u;->g()Lsg/u;

    move-result-object v0

    invoke-virtual {v0}, Lsg/u;->h()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "Rooted"

    invoke-virtual {p1, v1, v0}, Lli/a;->f(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object p1

    invoke-virtual {p1}, Lli/a;->g()Ljh/c;

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 8

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v1

    invoke-static {}, Lgk/t;->f()Z

    move-result v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v7}, Lvi/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public n(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Android-Payments-AcknowledgeCompleteError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-AcknowledgeCompleteError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public o(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Android-Payments-AcknowledgeError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-AcknowledgeError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public p(Z)V
    .locals 0

    if-eqz p1, :cond_1

    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "MilkyWay-Payments-ConsumeError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-ConsumeError-InApp"

    goto :goto_0

    :cond_1
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "MilkyWay-Payments-ConsumeError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-ConsumeError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lvi/g;->h(Ljava/lang/String;I)V

    return-void
.end method

.method public r(Ljava/lang/String;J)V
    .locals 3

    new-instance v0, Lei/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lsg/a1;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2, p3}, Lsg/a1;->x(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lei/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lei/r;->c()V

    invoke-virtual {p0, p1, p2, p3}, Lvi/g;->s(Ljava/lang/String;J)V

    return-void
.end method

.method public s(Ljava/lang/String;J)V
    .locals 1

    const-string v0, "Mobile"

    long-to-double p2, p2

    invoke-static {v0, p1, p2, p3}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReportToDiagByCountryCode(Ljava/lang/String;Ljava/lang/String;D)V

    return-void
.end method

.method public t()V
    .locals 1

    const-string v0, "Android-Payments-Incorrect-User-Purchase"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public u()V
    .locals 1

    const-string v0, "Android-Payments-Incorrect-User-Purchase-Userid-Invalid"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public v()V
    .locals 1

    const-string v0, "Android-Payments-Incorrect-User-Purchase-Userid-Mismatch"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public w()V
    .locals 1

    const-string v0, "Android-Payments-Incorrect-User-Purchase-Username-Mismatch"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public x()V
    .locals 1

    const-string v0, "Android-Payments-Incorrect-User-Purchase-Username-Null"

    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public y(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public z()V
    .locals 1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MilkyWay-Payments-Api-V1-Precheck-Response-Payload-Parse-Error"

    goto :goto_0

    :cond_0
    const-string v0, "Android-Payments-Api-V1-Precheck-Response-Payload-Parse-Error"

    :goto_0
    invoke-virtual {p0, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method
