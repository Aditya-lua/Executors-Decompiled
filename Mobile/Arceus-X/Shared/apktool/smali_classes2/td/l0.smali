.class public final Ltd/l0;
.super Ltd/i0;
.source "SourceFile"


# instance fields
.field public final c:Lee/t0;

.field public final synthetic d:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;Lsb/k;)V
    .locals 0

    iput-object p1, p0, Ltd/l0;->d:Ltd/n0;

    invoke-direct {p0, p1, p2}, Ltd/i0;-><init>(Ltd/n0;Lsb/k;)V

    new-instance p1, Lee/t0;

    const-string p2, "OnWarmUpIntegrityTokenCallback"

    invoke-direct {p1, p2}, Lee/t0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ltd/l0;->c:Lee/t0;

    return-void
.end method


# virtual methods
.method public final B1(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Ltd/i0;->B1(Landroid/os/Bundle;)V

    iget-object v0, p0, Ltd/l0;->c:Lee/t0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onWarmUpExpressIntegrityToken"

    invoke-virtual {v0, v2, v1}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ltd/l0;->d:Ltd/n0;

    invoke-static {v0}, Ltd/n0;->f(Ltd/n0;)Ltd/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Ltd/d1;->a(Landroid/os/Bundle;)Lk9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltd/i0;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object v0, p0, Ltd/i0;->a:Lsb/k;

    const-string v1, "warm.up.sid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
