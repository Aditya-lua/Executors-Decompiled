.class public final Lwd/e;
.super Lxd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lwd/g;


# direct methods
.method public constructor <init>(Lwd/g;Lsb/k;Lsb/k;)V
    .locals 0

    iput-object p3, p0, Lwd/e;->b:Lsb/k;

    iput-object p1, p0, Lwd/e;->c:Lwd/g;

    invoke-direct {p0, p2}, Lxd/j;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    const-string v0, "unity"

    const-string v1, "native"

    :try_start_0
    iget-object v2, p0, Lwd/e;->c:Lwd/g;

    iget-object v2, v2, Lwd/g;->a:Lxd/t;

    invoke-virtual {v2}, Lxd/t;->e()Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lxd/f;

    iget-object v3, p0, Lwd/e;->c:Lwd/g;

    invoke-static {v3}, Lwd/g;->c(Lwd/g;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lwd/h;->a()Ljava/util/Map;

    move-result-object v5

    const-string v6, "playcore_version_code"

    const-string v7, "java"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v4, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {v5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "playcore_native_version"

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v6, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "playcore_unity_version"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    new-instance v0, Lcom/google/android/play/core/review/c;

    iget-object v1, p0, Lwd/e;->c:Lwd/g;

    iget-object v5, p0, Lwd/e;->b:Lsb/k;

    invoke-static {v1}, Lwd/g;->c(Lwd/g;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v1, v5, v6}, Lcom/google/android/play/core/review/c;-><init>(Lwd/g;Lsb/k;Ljava/lang/String;)V

    invoke-interface {v2, v3, v4, v0}, Lxd/f;->r1(Ljava/lang/String;Landroid/os/Bundle;Lxd/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lwd/e;->c:Lwd/g;

    invoke-static {}, Lwd/g;->b()Lxd/i;

    move-result-object v2

    invoke-static {v1}, Lwd/g;->c(Lwd/g;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "error requesting in-app review for %s"

    invoke-virtual {v2, v0, v3, v1}, Lxd/i;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lwd/e;->b:Lsb/k;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
