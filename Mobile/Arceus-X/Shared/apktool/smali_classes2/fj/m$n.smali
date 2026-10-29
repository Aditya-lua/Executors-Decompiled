.class public Lfj/m$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/m;->C0(Lv7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lv7/k;

.field public final synthetic c:Lfj/m;


# direct methods
.method public constructor <init>(Lfj/m;Ljava/lang/String;Lv7/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfj/m$n;->c:Lfj/m;

    iput-object p2, p0, Lfj/m$n;->a:Ljava/lang/String;

    iput-object p3, p0, Lfj/m$n;->b:Lv7/k;

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
    iget-object v1, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {v1}, Lfj/m;->B(Lfj/m;)Lvi/g;

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

    invoke-virtual {v1, p1}, Lvi/g;->l(Ljava/lang/String;)V

    const-string p1, "rbx.purchaseflow"

    if-eqz p2, :cond_3

    iget-object p2, p0, Lfj/m$n;->a:Ljava/lang/String;

    invoke-static {p2}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {p2}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object p2

    const-string v1, "Play-Points-Consume-Purchase-Succeed"

    invoke-virtual {p2, v1}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_1
    iget-object p2, p0, Lfj/m$n;->c:Lfj/m;

    iget-object v1, p0, Lfj/m$n;->a:Ljava/lang/String;

    sget-object v2, Lfj/e$b;->a:Lfj/e$b;

    invoke-static {p2, v1, v2}, Lfj/m;->b0(Lfj/m;Ljava/lang/String;Lfj/e$b;)V

    iget-object p2, p0, Lfj/m$n;->c:Lfj/m;

    iget-object v1, p0, Lfj/m$n;->a:Ljava/lang/String;

    invoke-static {p2, v1, v0}, Lfj/m;->Q(Lfj/m;Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p2

    iget-object v1, p0, Lfj/m$n;->c:Lfj/m;

    iget-object v2, p0, Lfj/m$n;->a:Ljava/lang/String;

    invoke-static {v1, v2, p2, v0, v0}, Lfj/m;->a0(Lfj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {v1}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object v2

    iget-object v3, p0, Lfj/m$n;->a:Ljava/lang/String;

    invoke-static {p2, v0}, Lfj/m;->K0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {v1, p2, v0}, Lfj/m;->R(Lfj/m;Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, v0}, Lfj/m;->L0(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Lvi/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to find skuDetails: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfj/m$n;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object p2, p0, Lfj/m$n;->b:Lv7/k;

    invoke-static {p2}, Lfj/j0;->e(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {v0}, Lfj/m;->v(Lfj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {v0}, Lfj/m;->v(Lfj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object p2, p0, Lfj/m$n;->a:Ljava/lang/String;

    invoke-static {p2}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {p2}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object p2

    const-string v0, "Play-Points-Consume-Purchase-Fail"

    invoke-virtual {p2, v0}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_4
    iget-object p2, p0, Lfj/m$n;->c:Lfj/m;

    invoke-static {p2}, Lfj/m;->h0(Lfj/m;)V

    iget-object p2, p0, Lfj/m$n;->c:Lfj/m;

    iget-object v0, p0, Lfj/m$n;->b:Lv7/k;

    invoke-virtual {p2, v0}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lfj/e$b;->i:Lfj/e$b;

    const-string v2, "OnAcknowledgePurchaseResponse failure"

    invoke-static {p2, v0, v1, v2}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    :cond_5
    :goto_2
    const-string p2, "End consume flow."

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
