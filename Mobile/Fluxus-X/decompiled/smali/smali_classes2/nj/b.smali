.class public Lnj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnj/h0;


# instance fields
.field public a:Lcom/android/billingclient/api/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j(Lw7/k;)Ljava/lang/Long;
    .locals 4

    invoke-virtual {p0}, Lw7/k;->a()Lw7/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lw7/k;->a()Lw7/a;

    move-result-object v0

    invoke-virtual {v0}, Lw7/a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lw7/k;->a()Lw7/a;

    move-result-object p0

    invoke-virtual {p0}, Lw7/a;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsing obfuscatedProfileId failed: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-object v1
.end method

.method public static k(Lw7/k;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lw7/k;->e()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/a;->d()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/d;
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/android/billingclient/api/f;Lw7/j;)V
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/a;->g(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public d(Lw7/b;Lw7/c;)V
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/a;->a(Lw7/b;Lw7/c;)V

    return-void
.end method

.method public e(Lcom/android/billingclient/api/a;)V
    .locals 0

    iput-object p1, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    return-void
.end method

.method public f(Lw7/o;Lw7/l;)V
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/a;->h(Lw7/o;Lw7/l;)V

    return-void
.end method

.method public g(Lw7/e;Lw7/f;)V
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/a;->b(Lw7/e;Lw7/f;)V

    return-void
.end method

.method public h(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/a;->e(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object p1

    return-object p1
.end method

.method public i(Lw7/d;)V
    .locals 1

    iget-object v0, p0, Lnj/b;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/a;->i(Lw7/d;)V

    return-void
.end method
