.class public Lwd/f;
.super Lxd/g;
.source "SourceFile"


# instance fields
.field public final a:Lxd/i;

.field public final b:Lsb/k;

.field public final synthetic c:Lwd/g;


# direct methods
.method public constructor <init>(Lwd/g;Lxd/i;Lsb/k;)V
    .locals 0

    iput-object p1, p0, Lwd/f;->c:Lwd/g;

    invoke-direct {p0}, Lxd/g;-><init>()V

    iput-object p2, p0, Lwd/f;->a:Lxd/i;

    iput-object p3, p0, Lwd/f;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public l(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lwd/f;->c:Lwd/g;

    iget-object p1, p1, Lwd/g;->a:Lxd/t;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lwd/f;->b:Lsb/k;

    invoke-virtual {p1, v0}, Lxd/t;->u(Lsb/k;)V

    :cond_0
    iget-object p1, p0, Lwd/f;->a:Lxd/i;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetLaunchReviewFlowInfo"

    invoke-virtual {p1, v1, v0}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
