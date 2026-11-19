.class public Lnj/m$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnj/m;->C0(Lw7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lw7/k;

.field public final synthetic c:Lnj/m;


# direct methods
.method public constructor <init>(Lnj/m;Ljava/lang/String;Lw7/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lnj/m$n;->c:Lnj/m;

    iput-object p2, p0, Lnj/m$n;->a:Ljava/lang/String;

    iput-object p3, p0, Lnj/m$n;->b:Lw7/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    iget-object v1, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {v1}, Lnj/m;->B(Lnj/m;)Ldj/g;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OnConsumeResponse. Success: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ". Message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ldj/g;->l(Ljava/lang/String;)V

    const-string p1, "rbx.purchaseflow"

    if-eqz p2, :cond_3

    iget-object p2, p0, Lnj/m$n;->a:Ljava/lang/String;

    invoke-static {p2}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {p2}, Lnj/m;->B(Lnj/m;)Ldj/g;

    move-result-object p2

    const-string v1, "Play-Points-Consume-Purchase-Succeed"

    invoke-virtual {p2, v1}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_1
    iget-object p2, p0, Lnj/m$n;->c:Lnj/m;

    iget-object v1, p0, Lnj/m$n;->a:Ljava/lang/String;

    sget-object v2, Lnj/e$b;->a:Lnj/e$b;

    invoke-static {p2, v1, v2}, Lnj/m;->b0(Lnj/m;Ljava/lang/String;Lnj/e$b;)V

    iget-object p2, p0, Lnj/m$n;->c:Lnj/m;

    iget-object v1, p0, Lnj/m$n;->a:Ljava/lang/String;

    invoke-static {p2, v1, v0}, Lnj/m;->Q(Lnj/m;Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p2

    iget-object v1, p0, Lnj/m$n;->c:Lnj/m;

    iget-object v2, p0, Lnj/m$n;->a:Ljava/lang/String;

    invoke-static {v1, v2, p2, v0, v0}, Lnj/m;->a0(Lnj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {v1}, Lnj/m;->B(Lnj/m;)Ldj/g;

    move-result-object v2

    iget-object v3, p0, Lnj/m$n;->a:Ljava/lang/String;

    invoke-static {p2, v0}, Lnj/m;->K0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {v1, p2, v0}, Lnj/m;->R(Lnj/m;Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, v0}, Lnj/m;->L0(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Ldj/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to find skuDetails: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnj/m$n;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object p2, p0, Lnj/m$n;->b:Lw7/k;

    invoke-static {p2}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {v0}, Lnj/m;->v(Lnj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {v0}, Lnj/m;->v(Lnj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object p2, p0, Lnj/m$n;->a:Ljava/lang/String;

    invoke-static {p2}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {p2}, Lnj/m;->B(Lnj/m;)Ldj/g;

    move-result-object p2

    const-string v0, "Play-Points-Consume-Purchase-Fail"

    invoke-virtual {p2, v0}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_4
    iget-object p2, p0, Lnj/m$n;->c:Lnj/m;

    invoke-static {p2}, Lnj/m;->h0(Lnj/m;)V

    iget-object p2, p0, Lnj/m$n;->c:Lnj/m;

    iget-object v0, p0, Lnj/m$n;->b:Lw7/k;

    invoke-virtual {p2, v0}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lnj/e$b;->i:Lnj/e$b;

    const-string v2, "OnAcknowledgePurchaseResponse failure"

    invoke-static {p2, v0, v1, v2}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :cond_5
    :goto_2
    const-string p2, "End consume flow."

    invoke-static {p1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
