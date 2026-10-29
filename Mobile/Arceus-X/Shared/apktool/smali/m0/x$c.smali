.class public abstract Lm0/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public a:Ln0/u;

.field public b:Ln0/u;

.field public c:Ln0/u1;

.field public d:Ln0/u1;

.field public e:Ln0/u1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm0/x$c$a;

    invoke-direct {v0, p0}, Lm0/x$c$a;-><init>(Lm0/x$c;)V

    iput-object v0, p0, Lm0/x$c;->a:Ln0/u;

    const/4 v0, 0x0

    iput-object v0, p0, Lm0/x$c;->e:Ln0/u1;

    return-void
.end method

.method public static n(Landroid/util/Size;ILjava/util/List;ZLg0/m1;Lm0/k0;)Lm0/x$c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Lg0/m1;",
            "Lm0/k0;",
            ")",
            "Lm0/x$c;"
        }
    .end annotation

    new-instance v0, Lm0/b;

    new-instance v7, Lx0/u;

    invoke-direct {v7}, Lx0/u;-><init>()V

    new-instance v8, Lx0/u;

    invoke-direct {v8}, Lx0/u;-><init>()V

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v8}, Lm0/b;-><init>(Landroid/util/Size;ILjava/util/List;ZLg0/m1;Lm0/k0;Lx0/u;Lx0/u;)V

    return-object v0
.end method


# virtual methods
.method public a()Ln0/u;
    .locals 1

    iget-object v0, p0, Lm0/x$c;->a:Ln0/u;

    return-object v0
.end method

.method public abstract b()Lx0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/u<",
            "Lm0/b1$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Lg0/m1;
.end method

.method public abstract d()I
.end method

.method public abstract e()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Lm0/k0;
.end method

.method public g()Ln0/u1;
    .locals 1

    iget-object v0, p0, Lm0/x$c;->e:Ln0/u1;

    return-object v0
.end method

.method public abstract h()Lx0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/u<",
            "Lm0/v0;",
            ">;"
        }
    .end annotation
.end method

.method public i()Ln0/u;
    .locals 1

    iget-object v0, p0, Lm0/x$c;->b:Ln0/u;

    return-object v0
.end method

.method public j()Ln0/u1;
    .locals 1

    iget-object v0, p0, Lm0/x$c;->d:Ln0/u1;

    return-object v0
.end method

.method public abstract k()Landroid/util/Size;
.end method

.method public l()Ln0/u1;
    .locals 1

    iget-object v0, p0, Lm0/x$c;->c:Ln0/u1;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public abstract m()Z
.end method

.method public o(Ln0/u;)V
    .locals 0

    iput-object p1, p0, Lm0/x$c;->a:Ln0/u;

    return-void
.end method

.method public p(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 1

    new-instance v0, Ln0/k2;

    invoke-direct {v0, p1, p2, p3}, Ln0/k2;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, Lm0/x$c;->e:Ln0/u1;

    return-void
.end method

.method public q(Ln0/u;)V
    .locals 0

    iput-object p1, p0, Lm0/x$c;->b:Ln0/u;

    return-void
.end method

.method public r(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Lm0/x$c;->d:Ln0/u1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The secondary surface is already set."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    new-instance v0, Ln0/k2;

    invoke-virtual {p0}, Lm0/x$c;->k()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0}, Lm0/x$c;->d()I

    move-result v2

    invoke-direct {v0, p1, v1, v2}, Ln0/k2;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, Lm0/x$c;->d:Ln0/u1;

    return-void
.end method

.method public s(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Lm0/x$c;->c:Ln0/u1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The surface is already set."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    new-instance v0, Ln0/k2;

    invoke-virtual {p0}, Lm0/x$c;->k()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0}, Lm0/x$c;->d()I

    move-result v2

    invoke-direct {v0, p1, v1, v2}, Ln0/k2;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, Lm0/x$c;->c:Ln0/u1;

    return-void
.end method
