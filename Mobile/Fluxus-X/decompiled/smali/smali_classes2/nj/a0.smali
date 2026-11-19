.class public Lnj/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnj/a0$e;
    }
.end annotation


# static fields
.field public static volatile q:Lnj/a0;


# instance fields
.field public a:Lnj/h0;

.field public final b:Lnj/n;

.field public final c:Lmi/f;

.field public d:Lmj/o;

.field public final e:Lnj/b0;

.field public f:Lnj/a0$e;

.field public g:Lnj/a0$e;

.field public h:Lnj/a0$e;

.field public final i:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/e;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/e;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lw7/k;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lnj/f0;

.field public n:Lnj/a;

.field public o:Z

.field public final p:Lcom/roblox/client/purchase/a$f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lnj/a0$e;->a:Lnj/a0$e;

    iput-object v0, p0, Lnj/a0;->f:Lnj/a0$e;

    iput-object v0, p0, Lnj/a0;->g:Lnj/a0$e;

    iput-object v0, p0, Lnj/a0;->h:Lnj/a0$e;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/a0;->i:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/a0;->j:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/a0;->l:Ljava/util/Hashtable;

    sget-object v0, Lnj/a;->g:Lnj/a;

    iput-object v0, p0, Lnj/a0;->n:Lnj/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnj/a0;->o:Z

    new-instance v0, Lnj/a0$c;

    invoke-direct {v0, p0}, Lnj/a0$c;-><init>(Lnj/a0;)V

    iput-object v0, p0, Lnj/a0;->p:Lcom/roblox/client/purchase/a$f;

    new-instance v0, Lnj/f0;

    invoke-direct {v0}, Lnj/f0;-><init>()V

    iput-object v0, p0, Lnj/a0;->m:Lnj/f0;

    new-instance v0, Lnj/b;

    invoke-direct {v0}, Lnj/b;-><init>()V

    iput-object v0, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v0, Lnj/n;

    invoke-direct {v0}, Lnj/n;-><init>()V

    iput-object v0, p0, Lnj/a0;->b:Lnj/n;

    new-instance v0, Lmi/h;

    invoke-direct {v0}, Lmi/h;-><init>()V

    iput-object v0, p0, Lnj/a0;->c:Lmi/f;

    invoke-virtual {p0}, Lnj/a0;->N()Lw7/m;

    move-result-object v0

    invoke-static {p1}, Lcom/android/billingclient/api/a;->f(Landroid/content/Context;)Lcom/android/billingclient/api/a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/a$a;->c(Lw7/m;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    invoke-static {}, Lw7/i;->c()Lw7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/i$a;->b()Lw7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/i$a;->c()Lw7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/i$a;->a()Lw7/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/a$a;->b(Lw7/i;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/a$a;->a()Lcom/android/billingclient/api/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnj/a0;->w0(Lcom/android/billingclient/api/a;)V

    new-instance v0, Lnj/b0;

    invoke-direct {v0, p1}, Lnj/b0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnj/a0;->e:Lnj/b0;

    return-void
.end method

.method public static bridge synthetic A(Lnj/a0;)Lnj/a;
    .locals 0

    iget-object p0, p0, Lnj/a0;->n:Lnj/a;

    return-object p0
.end method

.method public static bridge synthetic B(Lnj/a0;)Lnj/h0;
    .locals 0

    iget-object p0, p0, Lnj/a0;->a:Lnj/h0;

    return-object p0
.end method

.method public static bridge synthetic C(Lnj/a0;)Lnj/n;
    .locals 0

    iget-object p0, p0, Lnj/a0;->b:Lnj/n;

    return-object p0
.end method

.method public static bridge synthetic D(Lnj/a0;Lnj/a0$e;)V
    .locals 0

    iput-object p1, p0, Lnj/a0;->f:Lnj/a0$e;

    return-void
.end method

.method public static bridge synthetic E(Lnj/a0;Lnj/a;)V
    .locals 0

    iput-object p1, p0, Lnj/a0;->n:Lnj/a;

    return-void
.end method

.method public static bridge synthetic F(Lnj/a0;)V
    .locals 0

    invoke-direct {p0}, Lnj/a0;->T()V

    return-void
.end method

.method public static bridge synthetic G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method private H(Lw7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 3

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to acknowledge purchase. Product ID is null. Purchase: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->g()Z

    move-result p2

    invoke-virtual {p1, p2}, Lnj/n;->d(Z)V

    return-void

    :cond_0
    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Attempted to acknowledge an acknowledged purchase."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lnj/e$b;->k:Lnj/e$b;

    invoke-static {p2}, Lnj/n0;->b(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)Lnj/m0;

    move-result-object p2

    invoke-direct {p0, p1, v0, p2}, Lnj/a0;->J(Lw7/k;Lnj/e$b;Lnj/m0;)V

    return-void

    :cond_2
    :goto_0
    const-string v2, "Acknowledging Purchase"

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lnj/t;

    invoke-direct {v1, p0, p1, v0, p2}, Lnj/t;-><init>(Lnj/a0;Lw7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    invoke-direct {p0, p1, v1}, Lnj/a0;->I(Lw7/k;Lw7/c;)V

    return-void
.end method

.method private I(Lw7/k;Lw7/c;)V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Start acknowledging Purchase"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lw7/b;->b()Lw7/b$a;

    move-result-object v0

    invoke-virtual {p1}, Lw7/k;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw7/b$a;->b(Ljava/lang/String;)Lw7/b$a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/b$a;->a()Lw7/b;

    move-result-object p1

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    invoke-interface {v0, p1, p2}, Lnj/h0;->d(Lw7/b;Lw7/c;)V

    return-void
.end method

.method private J(Lw7/k;Lnj/e$b;Lnj/m0;)V
    .locals 4

    const-string v0, "Acknowledged Purchase"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lnj/e0;->o(Lw7/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {v0, p3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lnj/a0;->o0(Ljava/lang/String;Lnj/e$b;)V

    return-void

    :cond_0
    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to complete acknowledge purchase. Product ID is null. Purchase: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->g()Z

    move-result p2

    invoke-virtual {p1, p2}, Lnj/n;->c(Z)V

    return-void

    :cond_1
    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v2

    iget-object v3, p0, Lnj/a0;->e:Lnj/b0;

    invoke-virtual {v3, v0}, Lnj/b0;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v2, :cond_4

    if-eqz v3, :cond_2

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string p3, "Play-Points-Not-Show-Confirmation-Screen"

    invoke-virtual {p2, p3}, Lnj/n;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lnj/a0;->b:Lnj/n;

    const-string v3, "Play-Points-Show-Confirmation-Screen"

    invoke-virtual {v2, v3}, Lnj/n;->f(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {p0, p2, v2}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v3

    if-nez v3, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to complete acknowledge purchase for a play point product. ProductDetails is null. Purchase: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->builder()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->g(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->e(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->i(I)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-virtual {v3}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {v3}, Lnj/j0;->c(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {v3}, Lnj/j0;->f(Lcom/android/billingclient/api/e;)F

    move-result v1

    invoke-virtual {p2, v1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->f(F)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {v3}, Lnj/j0;->b(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {p3}, Lnj/n0;->a(Lnj/m0;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->a()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOOAPPurchaseFinished(Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;)V

    iget-object p2, p0, Lnj/a0;->e:Lnj/b0;

    invoke-virtual {p2, v0}, Lnj/b0;->a(Ljava/lang/String;)V

    :cond_4
    :goto_0
    invoke-direct {p0, p1}, Lnj/a0;->M(Lw7/k;)V

    return-void
.end method

.method private M(Lw7/k;)V
    .locals 4

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to consume purchase. Product ID is null. Purchase: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->u0()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0}, Lnj/e0;->l(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    const-string v0, "Play-Points-Not-Consume-Purchase"

    invoke-virtual {p1, v0}, Lnj/n;->f(Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    const-string v2, "Consuming Purchase"

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lw7/e;->b()Lw7/e$a;

    move-result-object v1

    invoke-virtual {p1}, Lw7/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw7/e$a;->b(Ljava/lang/String;)Lw7/e$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/e$a;->a()Lw7/e;

    move-result-object v1

    iget-object v2, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v3, Lnj/w;

    invoke-direct {v3, p0, v0, p1}, Lnj/w;-><init>(Lnj/a0;Ljava/lang/String;Lw7/k;)V

    invoke-interface {v2, v1, v3}, Lnj/h0;->g(Lw7/e;Lw7/f;)V

    return-void
.end method

.method public static R(Landroid/content/Context;)Lnj/a0;
    .locals 2

    sget-object v0, Lnj/a0;->q:Lnj/a0;

    if-nez v0, :cond_1

    const-class v0, Lnj/a0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnj/a0;->q:Lnj/a0;

    if-nez v1, :cond_0

    new-instance v1, Lnj/a0;

    invoke-direct {v1, p0}, Lnj/a0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lnj/a0;->q:Lnj/a0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lnj/a0;->q:Lnj/a0;

    return-object p0
.end method

.method private S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lnj/a0;->j:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e;

    return-object p1

    :cond_1
    iget-object p2, p0, Lnj/a0;->i:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e;

    return-object p1
.end method

.method private T()V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Do Google Purchase GrantPending"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/a0;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object v0

    const-string v1, "inapp"

    invoke-virtual {v0, v1}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lw7/o$a;->a()Lw7/o;

    move-result-object v0

    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object v1

    const-string v2, "subs"

    invoke-virtual {v1, v2}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/o$a;->a()Lw7/o;

    move-result-object v1

    iget-object v2, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v3, Lnj/o;

    invoke-direct {v3, p0}, Lnj/o;-><init>(Lnj/a0;)V

    invoke-interface {v2, v0, v3}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v2, Lnj/r;

    invoke-direct {v2, p0}, Lnj/r;-><init>(Lnj/a0;)V

    invoke-interface {v0, v1, v2}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    return-void
.end method

.method private U(Lw7/k;I)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Acknowledge error, response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", skipping client side acknowledge purchase."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string v1, "Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore"

    invoke-virtual {p2, v1}, Lnj/n;->f(Ljava/lang/String;)V

    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lnj/e0;->o(Lw7/k;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, v3, p1}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, Lnj/j0;->i(Lcom/android/billingclient/api/e;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lnj/a0;->b:Lnj/n;

    invoke-static {p2, p1}, Lnj/e0;->g(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {p2, p1}, Lnj/e0;->i(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, p1}, Lnj/e0;->h(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Lnj/n;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid product details for productId "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". ProductDetails: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p1}, Lnj/j0;->j(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    sget-object p1, Lnj/e$b;->a:Lnj/e$b;

    invoke-direct {p0, v3, p1}, Lnj/a0;->o0(Ljava/lang/String;Lnj/e$b;)V

    return-void
.end method

.method public static synthetic o(Lnj/a0;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/a0;->f0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method private o0(Ljava/lang/String;Lnj/e$b;)V
    .locals 9

    sget-object v0, Lnj/a0$d;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->g()Z

    move-result v2

    invoke-virtual {v0, v2}, Lnj/n;->y(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->g()Z

    move-result v2

    invoke-virtual {v0, v2}, Lnj/n;->w(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->g()Z

    move-result v2

    invoke-virtual {v0, v2}, Lnj/n;->x(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->g()Z

    move-result v2

    invoke-virtual {v0, v2}, Lnj/n;->z(Z)V

    :goto_0
    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lnj/e0;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    instance-of v2, v0, Lei/s0;

    if-eqz v2, :cond_8

    move-object v3, v0

    check-cast v3, Lei/s0;

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    sget-object v2, Lnj/a;->g:Lnj/a;

    if-eq v0, v2, :cond_7

    invoke-virtual {v0}, Lnj/a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->b()Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v8, v0

    goto :goto_2

    :cond_3
    const-string v0, ""

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lnj/a0;->l:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    sget-object v0, Lnj/e$b;->a:Lnj/e$b;

    if-ne p2, v0, :cond_4

    move v4, v1

    goto :goto_3

    :cond_4
    move v4, v2

    :goto_3
    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->d()J

    move-result-wide v5

    iget-object p2, p0, Lnj/a0;->l:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v7, p2

    check-cast v7, Ljava/lang/String;

    invoke-interface/range {v3 .. v8}, Lei/s0;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    sget-object v0, Lnj/e$b;->a:Lnj/e$b;

    if-ne p2, v0, :cond_6

    move v4, v1

    goto :goto_4

    :cond_6
    move v4, v2

    :goto_4
    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->d()J

    move-result-wide v5

    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {v3 .. v8}, Lei/s0;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    const-string p2, "rbx.purchaseflow"

    const-string v0, "CurrentPurchaseContext is empty. Unable to notify purchase finished with userId and productId."

    invoke-static {p2, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->g()Z

    move-result v0

    invoke-virtual {p2, v0}, Lnj/n;->j(Z)V

    goto :goto_5

    :cond_8
    new-instance v1, Lnj/e;

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v3}, Lnj/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p2, v2, v3}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lmj/o;->e(Lmj/p;)V

    :cond_9
    :goto_5
    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lnj/e0;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lnj/a0;->u0()V

    :cond_a
    return-void
.end method

.method public static synthetic p(Lnj/a0;Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/a0;->k0(Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method

.method private p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V
    .locals 2

    if-nez p3, :cond_0

    const-string p3, ""

    :cond_0
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->j()Lmj/n;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lnj/a0;->o0(Ljava/lang/String;Lnj/e$b;)V

    return-void
.end method

.method public static synthetic q(Lnj/a0;Ljava/lang/String;Lw7/k;Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnj/a0;->c0(Ljava/lang/String;Lw7/k;Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic r(Lnj/a0;Lnj/c;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/a0;->m0(Lnj/c;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s(Lnj/a0;Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/a0;->g0(Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic t(Lnj/a0;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/a0;->e0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic u(Lnj/a0;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/a0;->l0(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method private u0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lnj/a0;->d:Lmj/o;

    sget-object v0, Lnj/a;->g:Lnj/a;

    iput-object v0, p0, Lnj/a0;->n:Lnj/a;

    return-void
.end method

.method public static synthetic v(Lnj/a0;Ljava/util/List;Ljava/util/function/Consumer;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnj/a0;->i0(Ljava/util/List;Ljava/util/function/Consumer;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method

.method public static synthetic w(Lnj/a0;Lw7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;Lcom/android/billingclient/api/d;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnj/a0;->b0(Lw7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method public static synthetic x(Lnj/a0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/a0;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic y(Lnj/a0;Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/a0;->j0(Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method

.method public static synthetic z(Lnj/a0;Lw7/k;Lmj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/a0;->d0(Lw7/k;Lmj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void
.end method


# virtual methods
.method public K(JZ)V
    .locals 7

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->g()Z

    move-result v4

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->h()Z

    move-result v5

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->b()Ljava/lang/String;

    move-result-object v6

    move-wide v2, p1

    invoke-virtual/range {v0 .. v6}, Lnj/a;->a(Ljava/lang/String;JZZLjava/lang/String;)Lnj/a;

    move-result-object p1

    iput-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p0, p3}, Lnj/a0;->L(Z)V

    return-void
.end method

.method public L(Z)V
    .locals 7

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->d()J

    move-result-wide v2

    iget-object v4, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v4}, Lnj/a;->g()Z

    move-result v4

    iget-object v5, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v5}, Lnj/a;->h()Z

    move-result v5

    iget-object v6, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v6}, Lnj/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lnj/a;->a(Ljava/lang/String;JZZLjava/lang/String;)Lnj/a;

    move-result-object v0

    iput-object v0, p0, Lnj/a0;->n:Lnj/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "attemptGrantPendingPurchases userId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isAppResume:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/a0;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "attemptGrantPendingPurchases failed: purchasing is not setup"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Lnj/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "attemptGrantPendingPurchases failed: purchase already pending"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-eqz p1, :cond_2

    invoke-direct {p0}, Lnj/a0;->T()V

    return-void

    :cond_2
    invoke-virtual {p0}, Lnj/a0;->X()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Found cached pending purchase. Count = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lnj/a0;->T()V

    return-void

    :cond_3
    iget-boolean p1, p0, Lnj/a0;->o:Z

    if-nez p1, :cond_4

    invoke-direct {p0}, Lnj/a0;->T()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lnj/a0;->o:Z

    :cond_4
    return-void
.end method

.method public final N()Lw7/m;
    .locals 1

    new-instance v0, Lnj/a0$b;

    invoke-direct {v0, p0}, Lnj/a0$b;-><init>(Lnj/a0;)V

    return-object v0
.end method

.method public final O(Lw7/k;)Lmj/r$c;
    .locals 1

    new-instance v0, Lnj/s;

    invoke-direct {v0, p0, p1}, Lnj/s;-><init>(Lnj/a0;Lw7/k;)V

    return-object v0
.end method

.method public final P(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmj/o;->c()V

    :cond_0
    new-instance v1, Lcom/roblox/client/purchase/a;

    iget-object v0, p0, Lnj/a0;->c:Lmi/f;

    invoke-direct {v1, v0}, Lcom/roblox/client/purchase/a;-><init>(Lmi/f;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, p2

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p2, 0x0

    goto :goto_0

    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "doPrePurchaseValidation sending paymentSessionId: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->g()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, Lbh/a1;->c1()Ljava/lang/String;

    move-result-object v2

    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object p2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p2}, Lnj/a;->g()Z

    move-result v6

    iget-object v7, p0, Lnj/a0;->p:Lcom/roblox/client/purchase/a$f;

    move-object v4, p1

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/purchase/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V

    return-void

    :cond_3
    move-object v4, p1

    invoke-static {}, Lbh/a1;->c1()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->g()Z

    move-result v6

    iget-object v7, p0, Lnj/a0;->p:Lcom/roblox/client/purchase/a$f;

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/purchase/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V

    return-void
.end method

.method public Q(Landroid/app/Activity;Lpj/b;Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lpj/b;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmj/o;->d()V

    :cond_0
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->j()Lmj/n;

    move-result-object v1

    const-string v2, "PurchaseStarted."

    invoke-virtual {v0, v1, v2}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->h()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-static {v2, v1}, Lnj/j0;->i(Lcom/android/billingclient/api/e;Z)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v3}, Lnj/a;->h()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->d4()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v2, p4}, Lnj/a0;->v0(Lcom/android/billingclient/api/e;Ljava/util/List;)Ljava/lang/String;

    move-result-object p4

    if-nez p4, :cond_3

    sget-object p1, Lnj/e$b;->v:Lnj/e$b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "No matching or base plan offer available for subscription product: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {v2}, Lnj/j0;->d(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object p4

    :cond_3
    invoke-static {}, Lcom/android/billingclient/api/c$b;->b()Lcom/android/billingclient/api/c$b$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/c$b$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c$b$a;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/android/billingclient/api/c$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$b$a;

    move-result-object p4

    invoke-virtual {p4}, Lcom/android/billingclient/api/c$b$a;->a()Lcom/android/billingclient/api/c$b;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/android/billingclient/api/c$b;->b()Lcom/android/billingclient/api/c$b$a;

    move-result-object p4

    invoke-virtual {p4, v2}, Lcom/android/billingclient/api/c$b$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c$b$a;

    move-result-object p4

    invoke-virtual {p4}, Lcom/android/billingclient/api/c$b$a;->a()Lcom/android/billingclient/api/c$b;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p4, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p4}, Lnj/a;->f()Z

    move-result p4

    if-eqz p4, :cond_5

    iget-object p4, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p4}, Lnj/a;->e()Ljava/lang/String;

    move-result-object p4

    goto :goto_1

    :cond_5
    const-string p4, ""

    :goto_1
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lpj/b;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lpj/b;->d()Ljava/lang/String;

    move-result-object p4

    :cond_6
    invoke-static {}, Lcom/android/billingclient/api/c;->b()Lcom/android/billingclient/api/c$a;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/android/billingclient/api/c$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    move-result-object p4

    invoke-virtual {p4, v1}, Lcom/android/billingclient/api/c$a;->d(Ljava/util/List;)Lcom/android/billingclient/api/c$a;

    move-result-object p4

    if-eqz p3, :cond_7

    invoke-virtual {p4, p3}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string p3, "Android-Purchase-Initiated-With-Charge-Request-Id"

    invoke-virtual {p2, p3}, Lnj/n;->f(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lpj/b;->a()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_8

    invoke-virtual {p2}, Lpj/b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string p3, "Android-Purchase-Initiated-With-Checkout-Session-Id"

    invoke-virtual {p2, p3}, Lnj/n;->f(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    const-string p2, "rbx.purchaseflow"

    const-string p3, "Both chargeRequestId and checkoutSessionId is null."

    invoke-static {p2, p3}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string p3, "Android-Purchase-Initiated-Without-Obfuscated-Profile-Id"

    invoke-virtual {p2, p3}, Lnj/n;->f(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p4}, Lcom/android/billingclient/api/c$a;->a()Lcom/android/billingclient/api/c;

    move-result-object p2

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p3

    if-nez p3, :cond_9

    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, p3}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    :cond_9
    iget-object p3, p0, Lnj/a0;->a:Lnj/h0;

    invoke-interface {p3, p1, p2}, Lnj/h0;->h(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->c()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->s:Lnj/e$b;

    const-string p3, "BillingClient.launchBillingFlow failed"

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :cond_a
    return-void

    :cond_b
    :goto_3
    sget-object p1, Lnj/e$b;->v:Lnj/e$b;

    invoke-static {v2, v1}, Lnj/j0;->j(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public V(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/k;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/Hashtable;

    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw7/k;

    invoke-static {v3}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed in handling purchases. Product ID is null. Purchase: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rbx.purchaseflow"

    invoke-static {v4, v3}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lnj/e0;->o(Lw7/k;)Z

    move-result v5

    invoke-direct {p0, v4, v5}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {p0, v3}, Lnj/a0;->W(Lw7/k;)V

    goto :goto_0

    :cond_2
    if-eqz v5, :cond_3

    new-instance v5, Lnj/i0;

    const-string v6, "subs"

    invoke-direct {v5, v4, v6}, Lnj/i0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v5, Lnj/i0;

    const-string v6, "inapp"

    invoke-direct {v5, v4, v6}, Lnj/i0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    new-instance p1, Lnj/u;

    invoke-direct {p1, p0, v2}, Lnj/u;-><init>(Lnj/a0;Ljava/util/Map;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0, v0, p1}, Lnj/a0;->r0(Ljava/util/List;Ljava/util/function/Consumer;)V

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0, v1, p1}, Lnj/a0;->r0(Ljava/util/List;Ljava/util/function/Consumer;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final W(Lw7/k;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Handle single purchase. Product id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Order id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw7/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". isAcknowledged: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lw7/k;->f()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->p()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->B()V

    :goto_0
    invoke-virtual {p1}, Lw7/k;->f()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {v2, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed in handling single purchase. Product ID is null. Purchase: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p1}, Lw7/k;->a()Lw7/a;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed in handling single purchase. accountIdentifiers is null. Purchase: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-virtual {v0}, Lw7/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lw7/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->f()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_6
    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {p1}, Lnj/n;->g()V

    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->f()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {p1}, Lnj/n;->h()V

    return-void

    :cond_7
    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {p1}, Lnj/n;->i()V

    :cond_8
    :goto_1
    return-void

    :cond_9
    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnj/a0;->y0(Lw7/k;Ljava/lang/String;)V

    return-void
.end method

.method public X()Z
    .locals 1

    iget-object v0, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public Y()Z
    .locals 1

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public Z()Z
    .locals 3

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnj/a0;->f:Lnj/a0$e;

    sget-object v2, Lnj/a0$e;->c:Lnj/a0$e;

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, Lnj/h0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public a0()Z
    .locals 1

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lnj/a0;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;)Z
    .locals 9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide v3, p4

    move-object v5, p6

    invoke-virtual/range {v0 .. v8}, Lnj/a0;->x0(Ljava/lang/String;Landroid/app/Activity;JLmj/o;ZLjava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final synthetic b0(Lw7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;Lcom/android/billingclient/api/d;)V
    .locals 8

    invoke-virtual {p4}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-object v4, p0, Lnj/a0;->b:Lnj/n;

    iget-object v5, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v5}, Lnj/a;->j()Lmj/n;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OnAcknowledgePurchaseResponse. Success: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, ". Message: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, "."

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v4, v5, p4}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    invoke-static {p1}, Lnj/b;->j(Lw7/k;)Ljava/lang/Long;

    move-result-object p4

    if-eqz p4, :cond_1

    move v1, v2

    :cond_1
    if-eqz v1, :cond_2

    iget-object p4, p0, Lnj/a0;->b:Lnj/n;

    const-string v2, "Android-Purchase-Completed-With-Checkout-Session-Id"

    invoke-virtual {p4, v2}, Lnj/n;->f(Ljava/lang/String;)V

    :cond_2
    if-eqz v3, :cond_4

    if-eqz p2, :cond_3

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string p4, "Play-Points-Ack-Purchase-Succeed"

    invoke-virtual {p2, p4}, Lnj/n;->f(Ljava/lang/String;)V

    :cond_3
    sget-object p2, Lnj/e$b;->a:Lnj/e$b;

    invoke-static {p3}, Lnj/n0;->b(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)Lnj/m0;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->J(Lw7/k;Lnj/e$b;Lnj/m0;)V

    return-void

    :cond_4
    if-eqz p2, :cond_5

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string p3, "Play-Points-Ack-Purchase-Fail"

    invoke-virtual {p2, p3}, Lnj/n;->f(Ljava/lang/String;)V

    :cond_5
    const-string p2, "rbx.purchaseflow"

    const-string p3, "Failed to acknowledge Purchase"

    invoke-static {p2, p3}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    iget-object p3, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p2, p3}, Lnj/n;->d(Z)V

    if-eqz v1, :cond_6

    invoke-direct {p0, p1, v0}, Lnj/a0;->U(Lw7/k;I)V

    :cond_6
    return-void
.end method

.method public c(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Lf4/v;Lmj/o;Ljava/lang/Runnable;)V
    .locals 9
    .param p4    # Lf4/v;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p2, :cond_0

    if-eqz p6, :cond_1

    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UriObject: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "recurring"

    invoke-static {p2, v1}, Lok/e0;->a(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v0, "paymentSessionId"

    invoke-static {p2, v0}, Lok/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v2, p0

    move-object v4, p1

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v2 .. v8}, Lnj/a0;->l(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;ZLjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p6, :cond_1

    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void
.end method

.method public final synthetic c0(Ljava/lang/String;Lw7/k;Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p3}, Lcom/android/billingclient/api/d;->c()I

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    move p4, v0

    :goto_0
    iget-object v1, p0, Lnj/a0;->b:Lnj/n;

    iget-object v2, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v2}, Lnj/a;->j()Lmj/n;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OnConsumeResponse. Success: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ". Message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "."

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, v2, p3}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    const-string p3, "rbx.purchaseflow"

    if-eqz p4, :cond_3

    invoke-static {p1}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p0, Lnj/a0;->b:Lnj/n;

    const-string v1, "Play-Points-Consume-Purchase-Succeed"

    invoke-virtual {p4, v1}, Lnj/n;->f(Ljava/lang/String;)V

    :cond_1
    sget-object p4, Lnj/e$b;->a:Lnj/e$b;

    invoke-direct {p0, p1, p4}, Lnj/a0;->o0(Ljava/lang/String;Lnj/e$b;)V

    invoke-direct {p0, p1, v0}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-static {p4, v0}, Lnj/j0;->i(Lcom/android/billingclient/api/e;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lnj/a0;->b:Lnj/n;

    invoke-static {p4, v0}, Lnj/e0;->g(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {p4, v0}, Lnj/e0;->i(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {p4, v0}, Lnj/e0;->h(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v6

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lnj/n;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_1

    :cond_2
    move-object v3, p1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid product details for productId "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". ProductDetails: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4, v0}, Lnj/j0;->j(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {p2}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    move-object v3, p1

    invoke-static {v3}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    const-string p4, "Play-Points-Consume-Purchase-Fail"

    invoke-virtual {p1, p4}, Lnj/n;->f(Ljava/lang/String;)V

    :cond_4
    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object p4, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p4}, Lnj/a;->g()Z

    move-result p4

    invoke-virtual {p1, p4}, Lnj/n;->e(Z)V

    invoke-static {p2}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->i:Lnj/e$b;

    const-string p4, "OnAcknowledgePurchaseResponse failure"

    invoke-direct {p0, p1, p2, p4}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :goto_2
    const-string p1, "End consume flow."

    invoke-static {p3, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLmj/o;)Z
    .locals 12

    move-object/from16 v0, p4

    new-instance v1, Lnj/c;

    invoke-direct {v1, v0}, Lnj/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lnj/c;->b()Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "rbx.purchaseflow"

    if-nez v2, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchase request is invalid. Raw payload: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_0
    invoke-virtual {v1}, Lnj/c;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    const-string v2, "subscriptions"

    invoke-interface {v0, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Google Billing Client does not support subscription purchases."

    invoke-static {v4, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_1
    invoke-virtual {v1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "The provider product id is null."

    invoke-static {v4, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_2
    new-instance v5, Lnj/a;

    invoke-virtual {v1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object v6

    const/4 v0, 0x1

    xor-int/lit8 v9, p6, 0x1

    invoke-virtual {v1}, Lnj/c;->c()Z

    move-result v10

    const/4 v11, 0x0

    move-wide v7, p1

    invoke-direct/range {v5 .. v11}, Lnj/a;-><init>(Ljava/lang/String;JZZLjava/lang/String;)V

    iput-object v5, p0, Lnj/a0;->n:Lnj/a;

    move-object/from16 p1, p7

    iput-object p1, p0, Lnj/a0;->d:Lmj/o;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Initiated purchase. Params: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/a0;->a0()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchasing is not enabled. Params: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_3
    invoke-virtual {v1}, Lnj/c;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lnj/a0;->l:Ljava/util/Hashtable;

    invoke-virtual {v1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, Lnj/i0;

    invoke-virtual {v1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1}, Lnj/c;->g()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, p3, v2}, Lnj/i0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lnj/z;

    move-object/from16 p3, p5

    invoke-direct {p2, p0, v1, p3}, Lnj/z;-><init>(Lnj/a0;Lnj/c;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, p2}, Lnj/a0;->r0(Ljava/util/List;Ljava/util/function/Consumer;)V

    return v0
.end method

.method public final synthetic d0(Lw7/k;Lmj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 6

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->j()Lmj/n;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VerifyPurchase. Response="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ". ReceiptId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw7/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmj/o;->d()V

    :cond_0
    sget-object v0, Lmj/r$b;->a:Lmj/r$b;

    if-eq p2, v0, :cond_1

    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->A()V

    :cond_1
    sget-object v0, Lnj/a0$d;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p3, 0x2

    if-eq p2, p3, :cond_3

    const/4 p3, 0x3

    if-eq p2, p3, :cond_2

    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    iget-object p3, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p2, p3}, Lnj/n;->E(Z)V

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->w:Lnj/e$b;

    const-string p3, "launchVerifyPurchaseReceipt unknown error"

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    iget-object p3, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p2, p3}, Lnj/n;->C(Z)V

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->q:Lnj/e$b;

    const-string p3, "launchVerifyPurchaseReceipt empty response"

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    iget-object p3, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p2, p3}, Lnj/n;->D(Z)V

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->p:Lnj/e$b;

    const-string p3, "launchVerifyPurchaseReceipt error"

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lnj/e0;->o(Lw7/k;)Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p2, "Receipt Verification Successful for Subscription"

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_5

    invoke-static {v1}, Lnj/e0;->n(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p2

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v2

    invoke-virtual {v2}, Lnk/c;->f()I

    move-result v2

    invoke-static {v1}, Lmj/p;->e(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p2, v2}, Lnk/c;->t(I)V

    :cond_5
    invoke-static {p1}, Lnj/e0;->o(Lw7/k;)Z

    move-result p2

    invoke-direct {p0, v1, p2}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2, p2}, Lnj/j0;->i(Lcom/android/billingclient/api/e;Z)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    move-object v3, v2

    invoke-static {v3, p2}, Lnj/e0;->g(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    invoke-static {v4, p2}, Lnj/e0;->i(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, p2}, Lnj/e0;->h(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lnj/n;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    :cond_6
    move-object v4, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid product details for productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". ProductDetails: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, p2}, Lnj/j0;->j(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_0
    invoke-direct {p0, p1, p3}, Lnj/a0;->H(Lw7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final synthetic e0(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->j()Lmj/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "QueryInAppPurchases. ItemsCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Items: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lnj/l0;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lnj/a0;->V(Ljava/util/List;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed QueryPurchases. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/q;->d(Ljava/lang/String;)I

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;Z)Z
    .locals 9

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->j()J

    move-result-wide v3

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v8}, Lnj/a0;->x0(Ljava/lang/String;Landroid/app/Activity;JLmj/o;ZLjava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final synthetic f0(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->j()Lmj/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "QuerySubsPurchases. ItemsCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Items: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lnj/l0;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lnj/a0;->V(Ljava/util/List;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed QueryPurchases. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/q;->d(Ljava/lang/String;)I

    return-void
.end method

.method public g(Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic g0(Ljava/util/Map;Ljava/util/List;)V
    .locals 4

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/e;

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_1

    const-string v0, "Null product details in list"

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot find purchase associated with product details. ProductId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/k;

    invoke-virtual {p0, v0}, Lnj/a0;->W(Lw7/k;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public h(Ljava/lang/String;JJ)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic h0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [J

    const/16 v1, 0x1f4

    invoke-virtual {p0, v0, v1, p1, p2}, Lnj/a0;->q0([JILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic i0(Ljava/util/List;Ljava/util/function/Consumer;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 4

    invoke-virtual {p4}, Lw7/n;->a()Ljava/util/List;

    move-result-object p4

    invoke-virtual {p3}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_3

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Returned no ProductDetails for Products: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/e;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "subs"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnj/a0;->j:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lnj/a0;->i:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "queryProductDetails Success. Products: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed queryProductDetails. Products: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", BillingResult: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-interface {p2, p4}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic j0(Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 3

    invoke-virtual {p3}, Lw7/n;->a()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Returned INAPP ProductDetails. Count = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/android/billingclient/api/e;

    iget-object v0, p0, Lnj/a0;->i:Ljava/util/Hashtable;

    invoke-virtual {p3}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "queryInAppProduct Success. Count = "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lnj/a0;->i:Ljava/util/Hashtable;

    invoke-virtual {p3}, Ljava/util/Hashtable;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lnj/a0$e;->c:Lnj/a0$e;

    iput-object p2, p0, Lnj/a0;->g:Lnj/a0$e;

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed queryInAppProduct. BillingResult: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lnj/a0$e;->a:Lnj/a0$e;

    iput-object p2, p0, Lnj/a0;->g:Lnj/a0$e;

    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method

.method public k(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final synthetic k0(Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 3

    invoke-virtual {p3}, Lw7/n;->a()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Returned SUBS ProductDetails. Count = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/android/billingclient/api/e;

    iget-object v0, p0, Lnj/a0;->j:Ljava/util/Hashtable;

    invoke-virtual {p3}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "querySubsProduct Success. Count = "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lnj/a0;->j:Ljava/util/Hashtable;

    invoke-virtual {p3}, Ljava/util/Hashtable;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lnj/a0$e;->c:Lnj/a0$e;

    iput-object p2, p0, Lnj/a0;->h:Lnj/a0$e;

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed querySubsProduct. BillingResult: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lnj/a0$e;->a:Lnj/a0$e;

    iput-object p2, p0, Lnj/a0;->h:Lnj/a0$e;

    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;ZLjava/lang/String;)Z
    .locals 9

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "startInAppPurchase productId: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isSubscriptionPurchase: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paymentSessionId: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->j()J

    move-result-wide v3

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v8}, Lnj/a0;->x0(Ljava/lang/String;Landroid/app/Activity;JLmj/o;ZLjava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final synthetic l0(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lnj/a0;->S(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p2}, Lnj/j0;->i(Lcom/android/billingclient/api/e;Z)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->h()Z

    move-result p1

    invoke-static {v0, p1}, Lnj/e0;->i(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lnj/a0;->P(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    sget-object p3, Lnj/e$b;->v:Lnj/e$b;

    invoke-static {v0, p2}, Lnj/j0;->j(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p3, p2}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public m(Ljava/lang/String;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic m0(Lnj/c;Landroid/app/Activity;Ljava/util/List;)V
    .locals 3

    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/android/billingclient/api/e;

    invoke-virtual {p1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnj/c;->c()Z

    move-result v1

    if-eqz p3, :cond_2

    invoke-static {p3, v1}, Lnj/j0;->i(Lcom/android/billingclient/api/e;Z)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lnj/c;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lnj/c;->d()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0, p3, p1}, Lnj/a0;->Q(Landroid/app/Activity;Lpj/b;Ljava/lang/String;Ljava/util/List;)V

    return-void

    :cond_2
    :goto_0
    sget-object p1, Lnj/e$b;->v:Lnj/e$b;

    invoke-static {p3, v1}, Lnj/j0;->j(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->v:Lnj/e$b;

    const-string p3, "Product details not found"

    invoke-direct {p0, p1, p2, p3}, Lnj/a0;->p0(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public n(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final n0(Lw7/k;)V
    .locals 6

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lw7/k;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    const-string v1, "rbx.purchaseflow"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lnj/e0;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "launchVerifyPurchaseReceipt onPurchaseVerificationStart"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/a0;->d:Lmj/o;

    invoke-interface {v0}, Lmj/o;->b()V

    :cond_0
    const-string v0, ", "

    if-eqz v3, :cond_2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Start launchVerifyPurchaseReceipt: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/a0;->m:Lnj/f0;

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->g()Z

    move-result v4

    new-instance v5, Lnj/v;

    invoke-direct {v5, p0}, Lnj/v;-><init>(Lnj/a0;)V

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lnj/f0;->a(Lw7/k;Ljava/lang/String;Ljava/lang/String;ZLnj/f0$b;)V

    return-void

    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "launchVerifyPurchaseReceipt failed. Invalid parameters: "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public q0([JILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Verify Purchase callback. response code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " grantedAssetIds = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0xc8

    if-eq p2, v0, :cond_3

    const/16 v0, 0x1f4

    if-eq p2, v0, :cond_2

    const/16 v0, 0x190

    if-eq p2, v0, :cond_1

    const/16 v0, 0x191

    if-eq p2, v0, :cond_0

    const-string p2, "Unknown"

    invoke-static {v1, p2}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lmj/r$b;->e:Lmj/r$b;

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->o()V

    goto :goto_0

    :cond_0
    const-string p2, "Unauthorized to make request."

    invoke-static {v1, p2}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lmj/r$b;->c:Lmj/r$b;

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->m()V

    goto :goto_0

    :cond_1
    const-string p2, "Service was unable to validate receiptId."

    invoke-static {v1, p2}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lmj/r$b;->b:Lmj/r$b;

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->l()V

    goto :goto_0

    :cond_2
    const-string p2, "Server error"

    invoke-static {v1, p2}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lmj/r$b;->b:Lmj/r$b;

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->n()V

    goto :goto_0

    :cond_3
    const-string p2, "Verification success"

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p2, Lmj/r$b;->a:Lmj/r$b;

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {v0}, Lnj/n;->k()V

    :goto_0
    new-instance v0, Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    invoke-static {p1}, Lpj/a;->b([J)Lcom/roblox/client/purchase/model/ProviderPayload;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;-><init>(Lcom/roblox/client/purchase/model/ProviderPayload;)V

    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    move-object p3, p4

    :goto_1
    iget-object p1, p0, Lnj/a0;->k:Ljava/util/Hashtable;

    invoke-virtual {p1, p3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw7/k;

    const-string p4, "Verify Purchase callback. purchaseKey: "

    if-eqz p1, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", purchase: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw7/k;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lnj/a0;->O(Lw7/k;)Lmj/r$c;

    move-result-object p1

    invoke-interface {p1, p2, v0}, Lmj/r$c;->a(Lmj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "not found."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    invoke-virtual {p1}, Lnj/n;->A()V

    return-void
.end method

.method public final r0(Ljava/util/List;Ljava/util/function/Consumer;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnj/i0;",
            ">;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/e;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    const-string v1, "fff"

    invoke-interface {v0, v1}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "rbx.purchaseflow"

    const-string v0, "ProductDetails feature is not supported."

    invoke-static {p1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->g()Z

    move-result v0

    invoke-virtual {p1, v0}, Lnj/n;->t(Z)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/i0;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    invoke-virtual {v2}, Lnj/i0;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    invoke-virtual {v2}, Lnj/i0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    iget-object v1, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v2, Lnj/x;

    invoke-direct {v2, p0, p1, p2}, Lnj/x;-><init>(Lnj/a0;Ljava/util/List;Ljava/util/function/Consumer;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public final s0(Ljava/lang/Runnable;)V
    .locals 5

    const-string v0, "Attempt queryInAppProduct"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    const-string v2, "fff"

    invoke-interface {v0, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "ProductDetails feature is not supported."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    iget-object v0, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v0}, Lnj/a;->g()Z

    move-result v0

    invoke-virtual {p1, v0}, Lnj/n;->t(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lnj/a0;->g:Lnj/a0$e;

    sget-object v2, Lnj/a0$e;->c:Lnj/a0$e;

    if-ne v0, v2, :cond_2

    const-string v0, "queryInAppProduct is setup already"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void

    :cond_2
    sget-object v2, Lnj/a0$e;->a:Lnj/a0$e;

    if-eq v0, v2, :cond_3

    const-string p1, "queryInAppProduct is pending"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {}, Lnj/e0;->e()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    const-string v4, "inapp"

    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sget-object v3, Lnj/a0$e;->b:Lnj/a0$e;

    iput-object v3, p0, Lnj/a0;->g:Lnj/a0$e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Querying INAPP ProductDetails. Count = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v2, Lnj/q;

    invoke-direct {v2, p0, p1}, Lnj/q;-><init>(Lnj/a0;Ljava/lang/Runnable;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public final t0(Ljava/lang/Runnable;)V
    .locals 5

    const-string v0, "Attempt querySubsProduct"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    const-string v2, "subscriptions"

    invoke-interface {v0, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Google Billing Client does not support subscription purchases."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    const-string v2, "fff"

    invoke-interface {v0, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ProductDetails feature is not supported."

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/a0;->b:Lnj/n;

    iget-object v1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {v1}, Lnj/a;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Lnj/n;->t(Z)V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_1
    iget-object v0, p0, Lnj/a0;->h:Lnj/a0$e;

    sget-object v2, Lnj/a0$e;->c:Lnj/a0$e;

    if-ne v0, v2, :cond_3

    const-string v0, "querySubsProduct is setup already"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void

    :cond_3
    sget-object v2, Lnj/a0$e;->a:Lnj/a0$e;

    if-eq v0, v2, :cond_4

    const-string p1, "querySubsProduct is pending"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-static {}, Lnj/e0;->f()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    const-string v4, "subs"

    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sget-object v3, Lnj/a0$e;->b:Lnj/a0$e;

    iput-object v3, p0, Lnj/a0;->h:Lnj/a0$e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Querying SUBS ProductDetails. Count = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v2, Lnj/p;

    invoke-direct {v2, p0, p1}, Lnj/p;-><init>(Lnj/a0;Ljava/lang/Runnable;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public final v0(Lcom/android/billingclient/api/e;Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/e;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1, p2}, Lnj/j0;->h(Lcom/android/billingclient/api/e;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    iget-object p2, p0, Lnj/a0;->b:Lnj/n;

    const-string v1, "Android-Subscription-Offer-Id-Not-Found"

    invoke-virtual {p2, v1}, Lnj/n;->f(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->D0()Z

    move-result p2

    if-eqz p2, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1}, Lnj/j0;->a(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    iget-object p1, p0, Lnj/a0;->b:Lnj/n;

    const-string p2, "Android-Subscription-Offer-No-Base-Plan-Available"

    invoke-virtual {p1, p2}, Lnj/n;->f(Ljava/lang/String;)V

    return-object v0
.end method

.method public w0(Lcom/android/billingclient/api/a;)V
    .locals 3

    iget-object v0, p0, Lnj/a0;->f:Lnj/a0$e;

    sget-object v1, Lnj/a0$e;->c:Lnj/a0$e;

    const-string v2, "rbx.purchaseflow"

    if-ne v0, v1, :cond_0

    const-string p1, "Google Billing Client for payments protocol is already setup"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v1, Lnj/a0$e;->b:Lnj/a0$e;

    if-ne v0, v1, :cond_1

    const-string p1, "Google Billing Client for payments protocol is already connecting"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lnj/a0;->a:Lnj/h0;

    invoke-interface {v0, p1}, Lnj/h0;->e(Lcom/android/billingclient/api/a;)V

    iput-object v1, p0, Lnj/a0;->f:Lnj/a0$e;

    const-string p1, "Connecting Google Billing\'s Client for payments protocol"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0;->a:Lnj/h0;

    new-instance v0, Lnj/a0$a;

    invoke-direct {v0, p0}, Lnj/a0$a;-><init>(Lnj/a0;)V

    invoke-interface {p1, v0}, Lnj/h0;->i(Lw7/d;)V

    return-void
.end method

.method public final x0(Ljava/lang/String;Landroid/app/Activity;JLmj/o;ZLjava/lang/String;Z)Z
    .locals 8

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "startPurchase productId: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isSubscriptionPurchase: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isInApp: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v5, p8

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", userId: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const-string p1, "Purchase product id is null."

    invoke-static {v0, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    :cond_0
    new-instance v1, Lnj/a;

    invoke-static {p1}, Lnj/e0;->n(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    move-object v2, p1

    move-wide v3, p3

    invoke-direct/range {v1 .. v7}, Lnj/a;-><init>(Ljava/lang/String;JZZLjava/lang/String;)V

    iput-object v1, p0, Lnj/a0;->n:Lnj/a;

    iput-object p5, p0, Lnj/a0;->d:Lmj/o;

    invoke-virtual {p0}, Lnj/a0;->a0()Z

    move-result p3

    if-eqz p3, :cond_1

    return p2

    :cond_1
    new-instance p2, Lnj/y;

    invoke-direct {p2, p0, p1, p6, p7}, Lnj/y;-><init>(Lnj/a0;Ljava/lang/String;ZLjava/lang/String;)V

    iget-object p1, p0, Lnj/a0;->n:Lnj/a;

    invoke-virtual {p1}, Lnj/a;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p2}, Lnj/a0;->t0(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p2}, Lnj/a0;->s0(Ljava/lang/Runnable;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final y0(Lw7/k;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to verify purchase. Product ID is null. Purchase: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.purchaseflow"

    invoke-static {p2, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lnj/a0;->e:Lnj/b0;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p2}, Lnj/b0;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p2, Lnj/e$b;->k:Lnj/e$b;

    new-instance v0, Lnj/m0;

    invoke-direct {v0}, Lnj/m0;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lnj/a0;->J(Lw7/k;Lnj/e$b;Lnj/m0;)V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lnj/a0;->n0(Lw7/k;)V

    return-void
.end method
