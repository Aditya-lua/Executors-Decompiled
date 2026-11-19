.class public final Lrd/k;
.super Lsd/b$a;
.source "SourceFile"


# instance fields
.field public final a:Ljb/d;

.field public final b:Ltb/k;

.field public final synthetic c:Lrd/l;


# direct methods
.method public constructor <init>(Lrd/l;Ltb/k;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lrd/k;->c:Lrd/l;

    invoke-direct {p0}, Lsd/b$a;-><init>()V

    new-instance p1, Ljb/d;

    const-string v0, "OnCheckAgeSignalsCallback"

    invoke-direct {p1, v0}, Ljb/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lrd/k;->a:Ljb/d;

    iput-object p2, p0, Lrd/k;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final L0(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lrd/k;->c:Lrd/l;

    iget-object v0, v0, Lrd/l;->b:Ljb/o;

    iget-object v1, p0, Lrd/k;->b:Ltb/k;

    invoke-virtual {v0, v1}, Ljb/o;->u(Ltb/k;)V

    const-string v0, "error.code"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lrd/k;->a:Ljb/d;

    const-string v3, "onError(%d)"

    invoke-virtual {v2, v3, v0}, Ljb/d;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lrd/a;

    invoke-direct {v0, p1}, Lrd/a;-><init>(I)V

    invoke-virtual {v1, v0}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final P(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lrd/k;->c:Lrd/l;

    iget-object v0, v0, Lrd/l;->b:Ljb/o;

    iget-object v1, p0, Lrd/k;->b:Ltb/k;

    invoke-virtual {v0, v1}, Ljb/o;->u(Ltb/k;)V

    iget-object v0, p0, Lrd/k;->a:Ljb/d;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onCompleteCheckAgeSignals"

    invoke-virtual {v0, v3, v2}, Ljb/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-static {p1}, Lrd/e;->g(Landroid/os/Bundle;)Lrd/e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
