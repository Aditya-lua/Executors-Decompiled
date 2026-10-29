.class public final Ll9/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/ConnectionResult;

.field public final synthetic b:Ll9/n0;


# direct methods
.method public constructor <init>(Ll9/n0;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p1, p0, Ll9/m0;->b:Ll9/n0;

    iput-object p2, p0, Ll9/m0;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Ll9/m0;->b:Ll9/n0;

    iget-object v1, v0, Ll9/n0;->f:Ll9/f;

    invoke-static {v1}, Ll9/f;->B(Ll9/f;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Ll9/n0;->f(Ll9/n0;)Ll9/b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/j0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ll9/m0;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->A3()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll9/m0;->b:Ll9/n0;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Ll9/n0;->g(Ll9/n0;Z)V

    iget-object v1, p0, Ll9/m0;->b:Ll9/n0;

    invoke-static {v1}, Ll9/n0;->e(Ll9/n0;)Lk9/a$f;

    move-result-object v1

    invoke-interface {v1}, Lk9/a$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Ll9/m0;->b:Ll9/n0;

    invoke-static {v0}, Ll9/n0;->h(Ll9/n0;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Ll9/m0;->b:Ll9/n0;

    invoke-static {v1}, Ll9/n0;->e(Ll9/n0;)Lk9/a$f;

    move-result-object v3

    invoke-static {v1}, Ll9/n0;->e(Ll9/n0;)Lk9/a$f;

    move-result-object v1

    invoke-interface {v1}, Lk9/a$f;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Lk9/a$f;->getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Ll9/m0;->b:Ll9/n0;

    invoke-static {v1}, Ll9/n0;->e(Ll9/n0;)Lk9/a$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, Lk9/a$f;->disconnect(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Ll9/m0;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v1, v2}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void
.end method
