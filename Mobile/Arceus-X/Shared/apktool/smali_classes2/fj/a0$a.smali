.class public Lfj/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/a0;->w0(Lcom/android/billingclient/api/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfj/a0;


# direct methods
.method public constructor <init>(Lfj/a0;)V
    .locals 0

    iput-object p1, p0, Lfj/a0$a;->a:Lfj/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_0

    const-string p1, "Google Billing Client for payments protocol is setup"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/a0$a;->a:Lfj/a0;

    sget-object v0, Lfj/a0$e;->c:Lfj/a0$e;

    invoke-static {p1, v0}, Lfj/a0;->D(Lfj/a0;Lfj/a0$e;)V

    return-void

    :cond_0
    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Google Billing Client unavailable (Play Store blocked). BillingResult: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/a0$a;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    const-string v0, "Android-Billing-Unavailable-Store-Blocked"

    invoke-virtual {p1, v0}, Lfj/n;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "Google Billing Client for payments protocol is not setup"

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p0, Lfj/a0$a;->a:Lfj/a0;

    sget-object v0, Lfj/a0$e;->a:Lfj/a0$e;

    invoke-static {p1, v0}, Lfj/a0;->D(Lfj/a0;Lfj/a0$e;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Google Billing Client for payments protocol disconnected"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lfj/a0$a;->a:Lfj/a0;

    sget-object v1, Lfj/a0$e;->a:Lfj/a0$e;

    invoke-static {v0, v1}, Lfj/a0;->D(Lfj/a0;Lfj/a0$e;)V

    return-void
.end method
