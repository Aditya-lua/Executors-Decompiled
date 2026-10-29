.class public Lfj/m$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/m;->x0(Lv7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv7/k;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

.field public final synthetic d:Lfj/m;


# direct methods
.method public constructor <init>(Lfj/m;Lv7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfj/m$m;->d:Lfj/m;

    iput-object p2, p0, Lfj/m$m;->a:Lv7/k;

    iput-boolean p3, p0, Lfj/m$m;->b:Z

    iput-object p4, p0, Lfj/m$m;->c:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;)V
    .locals 7

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-object v4, p0, Lfj/m$m;->d:Lfj/m;

    invoke-static {v4}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OnAcknowledgePurchaseResponse. Success: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ". Message: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lvi/g;->l(Ljava/lang/String;)V

    iget-object p1, p0, Lfj/m$m;->a:Lv7/k;

    invoke-static {p1}, Lfj/b;->i(Lv7/k;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    if-eqz v1, :cond_2

    iget-object p1, p0, Lfj/m$m;->d:Lfj/m;

    invoke-static {p1}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object p1

    const-string v2, "Android-Purchase-Completed-With-Checkout-Session-Id"

    invoke-virtual {p1, v2}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_2
    if-eqz v3, :cond_4

    iget-boolean p1, p0, Lfj/m$m;->b:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lfj/m$m;->d:Lfj/m;

    invoke-static {p1}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object p1

    const-string v0, "Play-Points-Ack-Purchase-Succeed"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lfj/m$m;->d:Lfj/m;

    iget-object v0, p0, Lfj/m$m;->a:Lv7/k;

    sget-object v1, Lfj/e$b;->a:Lfj/e$b;

    iget-object v2, p0, Lfj/m$m;->c:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    invoke-static {v2}, Lfj/n0;->b(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)Lfj/m0;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lfj/m;->L(Lfj/m;Lv7/k;Lfj/e$b;Lfj/m0;)V

    return-void

    :cond_4
    iget-boolean p1, p0, Lfj/m$m;->b:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lfj/m$m;->d:Lfj/m;

    invoke-static {p1}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object p1

    const-string v2, "Play-Points-Ack-Purchase-Fail"

    invoke-virtual {p1, v2}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_5
    const-string p1, "rbx.purchaseflow"

    const-string v2, "Failed to acknowledge Purchase"

    invoke-static {p1, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/m$m;->d:Lfj/m;

    invoke-static {p1}, Lfj/m;->g0(Lfj/m;)V

    if-eqz v1, :cond_6

    iget-object p1, p0, Lfj/m$m;->d:Lfj/m;

    iget-object v1, p0, Lfj/m$m;->a:Lv7/k;

    invoke-static {p1, v1, v0}, Lfj/m;->T(Lfj/m;Lv7/k;I)V

    :cond_6
    return-void
.end method
