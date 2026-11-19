.class public Lx7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/g$w;,
        Lx7/g$x;,
        Lx7/g$c0;,
        Lx7/g$s;,
        Lx7/g$f1;,
        Lx7/g$o;,
        Lx7/g$y;,
        Lx7/g$e;,
        Lx7/g$q0;,
        Lx7/g$m0;,
        Lx7/g$d0;,
        Lx7/g$j;,
        Lx7/g$r;,
        Lx7/g$t0;,
        Lx7/g$s0;,
        Lx7/g$z0;,
        Lx7/g$u0;,
        Lx7/g$c1;,
        Lx7/g$v0;,
        Lx7/g$w0;,
        Lx7/g$a1;,
        Lx7/g$y0;,
        Lx7/g$x0;,
        Lx7/g$b1;,
        Lx7/g$a0;,
        Lx7/g$z;,
        Lx7/g$q;,
        Lx7/g$i;,
        Lx7/g$d;,
        Lx7/g$b0;,
        Lx7/g$v;,
        Lx7/g$e1;,
        Lx7/g$l;,
        Lx7/g$h;,
        Lx7/g$t;,
        Lx7/g$m;,
        Lx7/g$f0;,
        Lx7/g$r0;,
        Lx7/g$p0;,
        Lx7/g$n;,
        Lx7/g$h0;,
        Lx7/g$j0;,
        Lx7/g$i0;,
        Lx7/g$g0;,
        Lx7/g$k0;,
        Lx7/g$l0;,
        Lx7/g$n0;,
        Lx7/g$c;,
        Lx7/g$p;,
        Lx7/g$u;,
        Lx7/g$g;,
        Lx7/g$f;,
        Lx7/g$o0;,
        Lx7/g$e0;,
        Lx7/g$b;,
        Lx7/g$k;,
        Lx7/g$d1;
    }
.end annotation


# static fields
.field public static g:Z = true


# instance fields
.field public a:Lx7/g$f0;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:F

.field public e:Lx7/b$r;

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx7/g$l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    const-string v0, ""

    iput-object v0, p0, Lx7/g;->b:Ljava/lang/String;

    iput-object v0, p0, Lx7/g;->c:Ljava/lang/String;

    const/high16 v0, 0x42c00000    # 96.0f

    iput v0, p0, Lx7/g;->d:F

    new-instance v0, Lx7/b$r;

    invoke-direct {v0}, Lx7/b$r;-><init>()V

    iput-object v0, p0, Lx7/g;->e:Lx7/b$r;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx7/g;->f:Ljava/util/Map;

    return-void
.end method

.method public static k()Lx7/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static l(Ljava/io/InputStream;)Lx7/g;
    .locals 2

    new-instance v0, Lx7/k;

    invoke-direct {v0}, Lx7/k;-><init>()V

    sget-boolean v1, Lx7/g;->g:Z

    invoke-virtual {v0, p0, v1}, Lx7/k;->z(Ljava/io/InputStream;Z)Lx7/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lx7/b$r;)V
    .locals 1

    iget-object v0, p0, Lx7/g;->e:Lx7/b$r;

    invoke-virtual {v0, p1}, Lx7/b$r;->b(Lx7/b$r;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lx7/g;->e:Lx7/b$r;

    sget-object v1, Lx7/b$u;->b:Lx7/b$u;

    invoke-virtual {v0, v1}, Lx7/b$r;->e(Lx7/b$u;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v1, "\\\""

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "\'"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v1, "\\\'"

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    const-string v0, "\\\n"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\A"

    const-string v1, "\n"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx7/b$p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/g;->e:Lx7/b$r;

    invoke-virtual {v0}, Lx7/b$r;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e(F)Lx7/g$b;
    .locals 7

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    iget-object v1, v0, Lx7/g$f0;->s:Lx7/g$p;

    iget-object v0, v0, Lx7/g$f0;->t:Lx7/g$p;

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lx7/g$p;->l()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v1, Lx7/g$p;->b:Lx7/g$d1;

    sget-object v4, Lx7/g$d1;->i:Lx7/g$d1;

    if-eq v3, v4, :cond_5

    sget-object v5, Lx7/g$d1;->b:Lx7/g$d1;

    if-eq v3, v5, :cond_5

    sget-object v6, Lx7/g$d1;->c:Lx7/g$d1;

    if-ne v3, v6, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v1, p1}, Lx7/g$p;->b(F)F

    move-result v1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lx7/g$p;->l()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, Lx7/g$p;->b:Lx7/g$d1;

    if-eq v3, v4, :cond_2

    if-eq v3, v5, :cond_2

    if-ne v3, v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Lx7/g$p;->b(F)F

    move-result p1

    goto :goto_1

    :cond_2
    :goto_0
    new-instance p1, Lx7/g$b;

    invoke-direct {p1, v2, v2, v2, v2}, Lx7/g$b;-><init>(FFFF)V

    return-object p1

    :cond_3
    iget-object p1, p0, Lx7/g;->a:Lx7/g$f0;

    iget-object p1, p1, Lx7/g$r0;->p:Lx7/g$b;

    if-eqz p1, :cond_4

    iget v0, p1, Lx7/g$b;->d:F

    mul-float/2addr v0, v1

    iget p1, p1, Lx7/g$b;->c:F

    div-float p1, v0, p1

    goto :goto_1

    :cond_4
    move p1, v1

    :goto_1
    new-instance v0, Lx7/g$b;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Lx7/g$b;-><init>(FFFF)V

    return-object v0

    :cond_5
    :goto_2
    new-instance p1, Lx7/g$b;

    invoke-direct {p1, v2, v2, v2, v2}, Lx7/g$b;-><init>(FFFF)V

    return-object p1
.end method

.method public f()F
    .locals 2

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    if-eqz v0, :cond_0

    iget v0, p0, Lx7/g;->d:F

    invoke-virtual {p0, v0}, Lx7/g;->e(F)Lx7/g$b;

    move-result-object v0

    iget v0, v0, Lx7/g$b;->d:F

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lx7/g$r0;->p:Lx7/g$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lx7/g$b;->d()Landroid/graphics/RectF;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()F
    .locals 2

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    if-eqz v0, :cond_0

    iget v0, p0, Lx7/g;->d:F

    invoke-virtual {p0, v0}, Lx7/g;->e(F)Lx7/g$b;

    move-result-object v0

    iget v0, v0, Lx7/g$b;->c:F

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Ljava/lang/String;)Lx7/g$l0;
    .locals 2

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    iget-object v0, v0, Lx7/g$l0;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lx7/g;->a:Lx7/g$f0;

    return-object p1

    :cond_1
    iget-object v0, p0, Lx7/g;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lx7/g;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/g$l0;

    return-object p1

    :cond_2
    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    invoke-virtual {p0, v0, p1}, Lx7/g;->j(Lx7/g$j0;Ljava/lang/String;)Lx7/g$l0;

    move-result-object v0

    iget-object v1, p0, Lx7/g;->f:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final j(Lx7/g$j0;Ljava/lang/String;)Lx7/g$l0;
    .locals 3

    move-object v0, p1

    check-cast v0, Lx7/g$l0;

    iget-object v1, v0, Lx7/g$l0;->c:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Lx7/g$j0;->getChildren()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/g$n0;

    instance-of v1, v0, Lx7/g$l0;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v0

    check-cast v1, Lx7/g$l0;

    iget-object v2, v1, Lx7/g$l0;->c:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v1

    :cond_3
    instance-of v1, v0, Lx7/g$j0;

    if-eqz v1, :cond_1

    check-cast v0, Lx7/g$j0;

    invoke-virtual {p0, v0, p2}, Lx7/g;->j(Lx7/g$j0;Ljava/lang/String;)Lx7/g$l0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public m()Lx7/g$f0;
    .locals 1

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lx7/g;->e:Lx7/b$r;

    invoke-virtual {v0}, Lx7/b$r;->d()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public o(Landroid/graphics/Canvas;Lx7/f;)V
    .locals 3

    if-nez p2, :cond_0

    new-instance p2, Lx7/f;

    invoke-direct {p2}, Lx7/f;-><init>()V

    :cond_0
    invoke-virtual {p2}, Lx7/f;->g()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v2, v0, v1}, Lx7/f;->h(FFFF)Lx7/f;

    :cond_1
    new-instance v0, Lx7/h;

    iget v1, p0, Lx7/g;->d:F

    invoke-direct {v0, p1, v1}, Lx7/h;-><init>(Landroid/graphics/Canvas;F)V

    invoke-virtual {v0, p0, p2}, Lx7/h;->G0(Lx7/g;Lx7/f;)V

    return-void
.end method

.method public p(Ljava/lang/String;)Lx7/g$n0;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lx7/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    const-string v1, "#"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx7/g;->i(Ljava/lang/String;)Lx7/g$l0;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lx7/g;->c:Ljava/lang/String;

    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lx7/k;->o0(Ljava/lang/String;)Lx7/g$p;

    move-result-object p1

    iput-object p1, v0, Lx7/g$f0;->t:Lx7/g$p;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SVG document is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(FFFF)V
    .locals 2

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    if-eqz v0, :cond_0

    new-instance v1, Lx7/g$b;

    invoke-direct {v1, p1, p2, p3, p4}, Lx7/g$b;-><init>(FFFF)V

    iput-object v1, v0, Lx7/g$r0;->p:Lx7/g$b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SVG document is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lx7/g;->a:Lx7/g$f0;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lx7/k;->o0(Ljava/lang/String;)Lx7/g$p;

    move-result-object p1

    iput-object p1, v0, Lx7/g$f0;->s:Lx7/g$p;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SVG document is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public u(Lx7/g$f0;)V
    .locals 0

    iput-object p1, p0, Lx7/g;->a:Lx7/g$f0;

    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lx7/g;->b:Ljava/lang/String;

    return-void
.end method
