.class public final Lpd/j;
.super Lib/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lpd/d;

.field public final synthetic d:Lpd/l;


# direct methods
.method public constructor <init>(Lpd/l;Lsb/k;Lsb/k;Lpd/d;)V
    .locals 0

    iput-object p3, p0, Lpd/j;->b:Lsb/k;

    iput-object p4, p0, Lpd/j;->c:Lpd/d;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lpd/j;->d:Lpd/l;

    invoke-direct {p0, p2}, Lib/e;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 1

    instance-of v0, p1, Lib/p;

    if-eqz v0, :cond_0

    new-instance p1, Lpd/a;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lpd/a;-><init>(I)V

    invoke-super {p0, p1}, Lib/e;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lib/e;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lpd/j;->d:Lpd/l;

    iget-object v1, v0, Lpd/l;->b:Lib/o;

    invoke-virtual {v1}, Lib/o;->e()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lqd/a;

    invoke-static {v0}, Lpd/l;->a(Lpd/l;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "playcore.version.code"

    const/4 v5, 0x3

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v4, Lpd/k;

    iget-object v5, p0, Lpd/j;->b:Lsb/k;

    invoke-direct {v4, v0, v5}, Lpd/k;-><init>(Lpd/l;Lsb/k;)V

    invoke-interface {v1, v2, v3, v4}, Lqd/a;->y1(Ljava/lang/String;Landroid/os/Bundle;Lqd/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lpd/j;->c:Lpd/d;

    invoke-static {}, Lpd/l;->c()Lib/d;

    move-result-object v2

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "checkAgeSignals(%s)"

    invoke-virtual {v2, v0, v3, v1}, Lib/d;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lpd/j;->b:Lsb/k;

    new-instance v1, Lpd/a;

    const/16 v2, -0x64

    invoke-direct {v1, v2}, Lpd/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
