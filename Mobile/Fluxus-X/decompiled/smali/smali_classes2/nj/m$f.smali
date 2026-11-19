.class public Lnj/m$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnj/m;->U1(Lcom/android/billingclient/api/a;)V
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

    iput-object p1, p0, Lnj/m$f;->a:Lnj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    const-string v0, "rbx.purchaseflow"

    if-nez p1, :cond_0

    const-string p1, "Google Billing Client is setup"

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/m$f;->a:Lnj/m;

    sget-object v0, Lnj/m$o;->c:Lnj/m$o;

    invoke-static {p1, v0}, Lnj/m;->G(Lnj/m;Lnj/m$o;)V

    goto :goto_0

    :cond_0
    const-string p1, "Google Billing Client is not setup"

    invoke-static {v0, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/m$f;->a:Lnj/m;

    sget-object v0, Lnj/m$o;->a:Lnj/m$o;

    invoke-static {p1, v0}, Lnj/m;->G(Lnj/m;Lnj/m$o;)V

    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->t3()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnj/m$f;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->w(Lnj/m;)Lnj/h0;

    move-result-object p1

    const-string v0, "fff"

    invoke-interface {p1, v0}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lnj/m$f;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->w(Lnj/m;)Lnj/h0;

    move-result-object p1

    const-string v0, "subscriptions"

    invoke-interface {p1, v0}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lnj/m$f;->a:Lnj/m;

    invoke-static {p1, v0}, Lnj/m;->e0(Lnj/m;Lnj/m$r;)V

    :cond_1
    iget-object p1, p0, Lnj/m$f;->a:Lnj/m;

    invoke-static {p1, v0}, Lnj/m;->d0(Lnj/m;Lnj/m$r;)V

    :cond_2
    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Google Billing Client disconnected"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/m$f;->a:Lnj/m;

    sget-object v1, Lnj/m$o;->a:Lnj/m$o;

    invoke-static {v0, v1}, Lnj/m;->G(Lnj/m;Lnj/m$o;)V

    return-void
.end method
