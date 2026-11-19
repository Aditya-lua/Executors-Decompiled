.class public final Ls0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/i1;


# instance fields
.field public final a:Ln0/e0;


# direct methods
.method public constructor <init>(Ln0/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/c;->a:Ln0/e0;

    return-void
.end method


# virtual methods
.method public a(Lp0/i$b;)V
    .locals 1

    iget-object v0, p0, Ls0/c;->a:Ln0/e0;

    invoke-interface {v0, p1}, Ln0/e0;->a(Lp0/i$b;)V

    return-void
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Ls0/c;->a:Ln0/e0;

    invoke-interface {v0}, Ln0/e0;->b()Ln0/d0;

    move-result-object v0

    invoke-virtual {v0}, Ln0/d0;->b()I

    move-result v0

    return v0
.end method

.method public c()Ln0/z3;
    .locals 1

    iget-object v0, p0, Ls0/c;->a:Ln0/e0;

    invoke-interface {v0}, Ln0/e0;->c()Ln0/z3;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroid/graphics/Matrix;
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    return-object v0
.end method

.method public f()Ln0/e0;
    .locals 1

    iget-object v0, p0, Ls0/c;->a:Ln0/e0;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-object v0, p0, Ls0/c;->a:Ln0/e0;

    invoke-interface {v0}, Ln0/e0;->getTimestamp()J

    move-result-wide v0

    return-wide v0
.end method
