.class public Ldl/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldl/h;->n(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ldl/h;


# direct methods
.method public constructor <init>(Ldl/h;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldl/h$b;->b:Ldl/h;

    iput-object p2, p0, Ldl/h$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const-string v0, "Verifying cookies."

    const-string v1, "rbx.platform"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    iget-object v3, p0, Ldl/h$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ldl/h;->h(Ldl/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {v2}, Ldl/h;->c(Ldl/h;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {v2, v0}, Ldl/h;->f(Ldl/h;Ljava/lang/String;)V

    iget-object v2, p0, Ldl/h$b;->b:Ldl/h;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ldl/h;->g(Ldl/h;Z)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "verifyCookies: recorded initial jar baseline (present="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "), not notifying."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {}, Ldl/j;->e()Ldl/j;

    move-result-object v2

    iget-object v3, p0, Ldl/h$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ldl/j;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ldl/h;->h(Ldl/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    iget-object v2, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {v2}, Ldl/h;->a(Ldl/h;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers."

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {v1, v0}, Ldl/h;->f(Ldl/h;Ljava/lang/String;)V

    iget-object v0, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {v0}, Ldl/h;->b(Ldl/h;)Lcl/c;

    move-result-object v0

    invoke-interface {v0}, Lcl/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Ldl/h$b;->b:Ldl/h;

    invoke-static {v1}, Ldl/h;->d(Ldl/h;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    return-void
.end method
