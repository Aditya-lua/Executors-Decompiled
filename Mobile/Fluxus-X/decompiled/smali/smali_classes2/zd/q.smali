.class public final Lzd/q;
.super Lzd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lzd/r;


# direct methods
.method public constructor <init>(Lzd/r;)V
    .locals 0

    iput-object p1, p0, Lzd/q;->b:Lzd/r;

    invoke-direct {p0}, Lzd/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lzd/q;->b:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    invoke-static {v0}, Lzd/t;->r(Lzd/t;)V

    iget-object v0, p0, Lzd/q;->b:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lzd/t;->m(Lzd/t;Landroid/os/IInterface;)V

    iget-object v0, p0, Lzd/q;->b:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lzd/t;->l(Lzd/t;Z)V

    return-void
.end method
