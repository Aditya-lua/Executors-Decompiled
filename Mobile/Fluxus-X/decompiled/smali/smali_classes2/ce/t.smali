.class public final Lce/t;
.super Lde/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ltb/k;

.field public final synthetic d:Lce/a0;


# direct methods
.method public constructor <init>(Lce/a0;Ltb/k;Ljava/util/List;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lce/t;->d:Lce/a0;

    iput-object p3, p0, Lce/t;->b:Ljava/util/List;

    iput-object p4, p0, Lce/t;->c:Ltb/k;

    invoke-direct {p0, p2}, Lde/r1;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lce/t;->d:Lce/a0;

    iget-object v0, v0, Lce/a0;->b:Lde/g;

    invoke-virtual {v0}, Lde/g;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lce/t;->d:Lce/a0;

    invoke-static {v1}, Lce/a0;->g(Lce/a0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lce/t;->b:Ljava/util/List;

    invoke-static {v2}, Lce/a0;->i(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {}, Lce/a0;->a()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Lce/w;

    iget-object v5, p0, Lce/t;->d:Lce/a0;

    iget-object v6, p0, Lce/t;->c:Ltb/k;

    invoke-direct {v4, v5, v6}, Lce/w;-><init>(Lce/a0;Ltb/k;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lde/k0;->V0(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lde/m0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lce/a0;->f()Lde/q1;

    move-result-object v1

    iget-object v2, p0, Lce/t;->b:Ljava/util/List;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "deferredUninstall(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lde/q1;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lce/t;->c:Ltb/k;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
