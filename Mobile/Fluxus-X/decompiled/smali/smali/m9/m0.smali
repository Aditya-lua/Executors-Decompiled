.class public final Lm9/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lk9/b;

.field public final synthetic b:Lm9/n0;


# direct methods
.method public constructor <init>(Lm9/n0;Lk9/b;)V
    .locals 0

    iput-object p1, p0, Lm9/m0;->b:Lm9/n0;

    iput-object p2, p0, Lm9/m0;->a:Lk9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lm9/m0;->b:Lm9/n0;

    iget-object v1, v0, Lm9/n0;->f:Lm9/f;

    invoke-static {v1}, Lm9/f;->B(Lm9/f;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lm9/n0;->f(Lm9/n0;)Lm9/b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lm9/m0;->a:Lk9/b;

    invoke-virtual {v1}, Lk9/b;->F3()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lm9/m0;->b:Lm9/n0;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lm9/n0;->g(Lm9/n0;Z)V

    iget-object v1, p0, Lm9/m0;->b:Lm9/n0;

    invoke-static {v1}, Lm9/n0;->e(Lm9/n0;)Ll9/a$f;

    move-result-object v1

    invoke-interface {v1}, Ll9/a$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lm9/m0;->b:Lm9/n0;

    invoke-static {v0}, Lm9/n0;->h(Lm9/n0;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lm9/m0;->b:Lm9/n0;

    invoke-static {v1}, Lm9/n0;->e(Lm9/n0;)Ll9/a$f;

    move-result-object v3

    invoke-static {v1}, Lm9/n0;->e(Lm9/n0;)Ll9/a$f;

    move-result-object v1

    invoke-interface {v1}, Ll9/a$f;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Ll9/a$f;->getRemoteService(Lo9/l;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lm9/m0;->b:Lm9/n0;

    invoke-static {v1}, Lm9/n0;->e(Lm9/n0;)Ll9/a$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, Ll9/a$f;->disconnect(Ljava/lang/String;)V

    new-instance v1, Lk9/b;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lk9/b;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lm9/j0;->F(Lk9/b;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Lm9/m0;->a:Lk9/b;

    invoke-virtual {v0, v1, v2}, Lm9/j0;->F(Lk9/b;Ljava/lang/Exception;)V

    return-void
.end method
