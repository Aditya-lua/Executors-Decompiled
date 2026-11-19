.class public final Lrd/j;
.super Ljb/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ltb/k;

.field public final synthetic c:Lrd/d;

.field public final synthetic d:Lrd/l;


# direct methods
.method public constructor <init>(Lrd/l;Ltb/k;Ltb/k;Lrd/d;)V
    .locals 0

    iput-object p3, p0, Lrd/j;->b:Ltb/k;

    iput-object p4, p0, Lrd/j;->c:Lrd/d;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lrd/j;->d:Lrd/l;

    invoke-direct {p0, p2}, Ljb/e;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 1

    instance-of v0, p1, Ljb/p;

    if-eqz v0, :cond_0

    new-instance p1, Lrd/a;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lrd/a;-><init>(I)V

    invoke-super {p0, p1}, Ljb/e;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Ljb/e;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lrd/j;->d:Lrd/l;

    iget-object v1, v0, Lrd/l;->b:Ljb/o;

    invoke-virtual {v1}, Ljb/o;->e()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lsd/a;

    invoke-static {v0}, Lrd/l;->a(Lrd/l;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "playcore.version.code"

    const/4 v5, 0x3

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v4, Lrd/k;

    iget-object v5, p0, Lrd/j;->b:Ltb/k;

    invoke-direct {v4, v0, v5}, Lrd/k;-><init>(Lrd/l;Ltb/k;)V

    invoke-interface {v1, v2, v3, v4}, Lsd/a;->R1(Ljava/lang/String;Landroid/os/Bundle;Lsd/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lrd/j;->c:Lrd/d;

    invoke-static {}, Lrd/l;->c()Ljb/d;

    move-result-object v2

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "checkAgeSignals(%s)"

    invoke-virtual {v2, v0, v3, v1}, Ljb/d;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lrd/j;->b:Ltb/k;

    new-instance v1, Lrd/a;

    const/16 v2, -0x64

    invoke-direct {v1, v2}, Lrd/a;-><init>(I)V

    invoke-virtual {v0, v1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
