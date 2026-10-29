.class public final Ltd/l;
.super Lee/r0;
.source "SourceFile"


# instance fields
.field public final a:Lee/t0;

.field public final b:Lsb/k;

.field public final synthetic c:Ltd/m;


# direct methods
.method public constructor <init>(Ltd/m;Lsb/k;)V
    .locals 1

    iput-object p1, p0, Ltd/l;->c:Ltd/m;

    invoke-direct {p0}, Lee/r0;-><init>()V

    new-instance p1, Lee/t0;

    const-string v0, "OnRequestIntegrityTokenCallback"

    invoke-direct {p1, v0}, Lee/t0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ltd/l;->a:Lee/t0;

    iput-object p2, p0, Ltd/l;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final d(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Ltd/l;->c:Ltd/m;

    iget-object v0, v0, Ltd/m;->f:Lee/f;

    iget-object v1, p0, Ltd/l;->b:Lsb/k;

    invoke-virtual {v0, v1}, Lee/f;->v(Lsb/k;)V

    iget-object v0, p0, Ltd/l;->a:Lee/t0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestIntegrityToken"

    invoke-virtual {v0, v2, v1}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ltd/l;->c:Ltd/m;

    invoke-static {v0}, Ltd/m;->c(Ltd/m;)Ltd/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Ltd/d1;->a(Landroid/os/Bundle;)Lk9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltd/l;->b:Lsb/k;

    invoke-virtual {p1, v0}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    const-string v0, "token"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Ltd/l;->b:Lsb/k;

    new-instance v0, Ltd/a;

    const/16 v1, -0x64

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_1
    const-string v1, "request.token.sid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    iget-object p1, p0, Ltd/l;->c:Ltd/m;

    new-instance v3, Ltd/k;

    invoke-static {p1}, Ltd/m;->e(Ltd/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p0, p1, v1, v2}, Ltd/k;-><init>(Ltd/l;Ljava/lang/String;J)V

    iget-object p1, p0, Ltd/l;->b:Lsb/k;

    new-instance v1, Ltd/d;

    invoke-direct {v1}, Ltd/d;-><init>()V

    invoke-virtual {v1, v0}, Ltd/r;->b(Ljava/lang/String;)Ltd/r;

    invoke-virtual {v1, v3}, Ltd/r;->a(Ltd/r1;)Ltd/r;

    invoke-virtual {v1}, Ltd/r;->c()Ltd/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
