.class public Lyd/k;
.super Lzd/g;
.source "SourceFile"


# instance fields
.field public final a:Lzd/i;

.field public final b:Ltb/k;

.field public final synthetic c:Lyd/m;


# direct methods
.method public constructor <init>(Lyd/m;Lzd/i;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lyd/k;->c:Lyd/m;

    invoke-direct {p0}, Lzd/g;-><init>()V

    iput-object p2, p0, Lyd/k;->a:Lzd/i;

    iput-object p3, p0, Lyd/k;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public l(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lyd/k;->c:Lyd/m;

    iget-object p1, p1, Lyd/m;->a:Lzd/t;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lyd/k;->b:Ltb/k;

    invoke-virtual {p1, v0}, Lzd/t;->u(Ltb/k;)V

    :cond_0
    iget-object p1, p0, Lyd/k;->a:Lzd/i;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetLaunchReviewFlowInfo"

    invoke-virtual {p1, v1, v0}, Lzd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
