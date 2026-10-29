.class public final Lpd/k;
.super Lqd/b$a;
.source "SourceFile"


# instance fields
.field public final a:Lib/d;

.field public final b:Lsb/k;

.field public final synthetic c:Lpd/l;


# direct methods
.method public constructor <init>(Lpd/l;Lsb/k;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lpd/k;->c:Lpd/l;

    invoke-direct {p0}, Lqd/b$a;-><init>()V

    new-instance p1, Lib/d;

    const-string v0, "OnCheckAgeSignalsCallback"

    invoke-direct {p1, v0}, Lib/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lpd/k;->a:Lib/d;

    iput-object p2, p0, Lpd/k;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lpd/k;->c:Lpd/l;

    iget-object v0, v0, Lpd/l;->b:Lib/o;

    iget-object v1, p0, Lpd/k;->b:Lsb/k;

    invoke-virtual {v0, v1}, Lib/o;->u(Lsb/k;)V

    const-string v0, "error.code"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lpd/k;->a:Lib/d;

    const-string v3, "onError(%d)"

    invoke-virtual {v2, v3, v0}, Lib/d;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lpd/a;

    invoke-direct {v0, p1}, Lpd/a;-><init>(I)V

    invoke-virtual {v1, v0}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final O(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lpd/k;->c:Lpd/l;

    iget-object v0, v0, Lpd/l;->b:Lib/o;

    iget-object v1, p0, Lpd/k;->b:Lsb/k;

    invoke-virtual {v0, v1}, Lib/o;->u(Lsb/k;)V

    iget-object v0, p0, Lpd/k;->a:Lib/d;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onCompleteCheckAgeSignals"

    invoke-virtual {v0, v3, v2}, Lib/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-static {p1}, Lpd/e;->g(Landroid/os/Bundle;)Lpd/e;

    move-result-object p1

    invoke-virtual {v1, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
