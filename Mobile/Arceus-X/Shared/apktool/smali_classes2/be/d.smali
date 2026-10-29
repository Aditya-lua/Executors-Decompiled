.class public final Lbe/d;
.super Lbe/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lbe/f;


# direct methods
.method public constructor <init>(Lbe/f;)V
    .locals 0

    iput-object p1, p0, Lbe/d;->b:Lbe/f;

    invoke-direct {p0}, Lbe/r1;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lbe/d;->b:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->r(Lbe/g;)V

    iget-object v0, p0, Lbe/d;->b:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbe/g;->m(Lbe/g;Landroid/os/IInterface;)V

    iget-object v0, p0, Lbe/d;->b:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbe/g;->l(Lbe/g;Z)V

    return-void
.end method
