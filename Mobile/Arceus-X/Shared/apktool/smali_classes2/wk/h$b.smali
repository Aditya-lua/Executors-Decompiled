.class public Lwk/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwk/h;->k(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lwk/h;


# direct methods
.method public constructor <init>(Lwk/h;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lwk/h$b;->b:Lwk/h;

    iput-object p2, p0, Lwk/h$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "Verifying cookies."

    const-string v1, "rbx.platform"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwk/h$b;->b:Lwk/h;

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    iget-object v3, p0, Lwk/h$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lwk/h;->f(Lwk/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwk/h$b;->b:Lwk/h;

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v2

    iget-object v3, p0, Lwk/h$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lwk/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lwk/h;->f(Lwk/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Lwk/h$b;->b:Lwk/h;

    invoke-static {v2}, Lwk/h;->a(Lwk/h;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers."

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lwk/h$b;->b:Lwk/h;

    invoke-static {v1, v0}, Lwk/h;->e(Lwk/h;Ljava/lang/String;)V

    iget-object v0, p0, Lwk/h$b;->b:Lwk/h;

    invoke-static {v0}, Lwk/h;->b(Lwk/h;)Lvk/c;

    move-result-object v0

    invoke-interface {v0}, Lvk/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lwk/h$b;->b:Lwk/h;

    invoke-static {v1}, Lwk/h;->c(Lwk/h;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
