.class public final Lxd/q;
.super Lxd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lxd/r;


# direct methods
.method public constructor <init>(Lxd/r;)V
    .locals 0

    iput-object p1, p0, Lxd/q;->b:Lxd/r;

    invoke-direct {p0}, Lxd/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lxd/q;->b:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->r(Lxd/t;)V

    iget-object v0, p0, Lxd/q;->b:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lxd/t;->m(Lxd/t;Landroid/os/IInterface;)V

    iget-object v0, p0, Lxd/q;->b:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lxd/t;->l(Lxd/t;Z)V

    return-void
.end method
