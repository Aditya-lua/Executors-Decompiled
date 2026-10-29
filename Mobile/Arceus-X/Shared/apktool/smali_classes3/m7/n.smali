.class public Lm7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# instance fields
.field public final a:Lm7/e;

.field public final b:Lm7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lm7/g;

.field public final d:Lm7/b;

.field public final e:Lm7/d;

.field public final f:Lm7/b;

.field public final g:Lm7/b;

.field public final h:Lm7/b;

.field public final i:Lm7/b;

.field public j:Z


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v9}, Lm7/n;-><init>(Lm7/e;Lm7/o;Lm7/g;Lm7/b;Lm7/d;Lm7/b;Lm7/b;Lm7/b;Lm7/b;)V

    return-void
.end method

.method public constructor <init>(Lm7/e;Lm7/o;Lm7/g;Lm7/b;Lm7/d;Lm7/b;Lm7/b;Lm7/b;Lm7/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/e;",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lm7/g;",
            "Lm7/b;",
            "Lm7/d;",
            "Lm7/b;",
            "Lm7/b;",
            "Lm7/b;",
            "Lm7/b;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lm7/n;->j:Z

    .line 4
    iput-object p1, p0, Lm7/n;->a:Lm7/e;

    .line 5
    iput-object p2, p0, Lm7/n;->b:Lm7/o;

    .line 6
    iput-object p3, p0, Lm7/n;->c:Lm7/g;

    .line 7
    iput-object p4, p0, Lm7/n;->d:Lm7/b;

    .line 8
    iput-object p5, p0, Lm7/n;->e:Lm7/d;

    .line 9
    iput-object p6, p0, Lm7/n;->h:Lm7/b;

    .line 10
    iput-object p7, p0, Lm7/n;->i:Lm7/b;

    .line 11
    iput-object p8, p0, Lm7/n;->f:Lm7/b;

    .line 12
    iput-object p9, p0, Lm7/n;->g:Lm7/b;

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Li7/p;
    .locals 1

    new-instance v0, Li7/p;

    invoke-direct {v0, p0}, Li7/p;-><init>(Lm7/n;)V

    return-object v0
.end method

.method public c()Lm7/e;
    .locals 1

    iget-object v0, p0, Lm7/n;->a:Lm7/e;

    return-object v0
.end method

.method public d()Lm7/b;
    .locals 1

    iget-object v0, p0, Lm7/n;->i:Lm7/b;

    return-object v0
.end method

.method public e()Lm7/d;
    .locals 1

    iget-object v0, p0, Lm7/n;->e:Lm7/d;

    return-object v0
.end method

.method public f()Lm7/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm7/n;->b:Lm7/o;

    return-object v0
.end method

.method public g()Lm7/b;
    .locals 1

    iget-object v0, p0, Lm7/n;->d:Lm7/b;

    return-object v0
.end method

.method public h()Lm7/g;
    .locals 1

    iget-object v0, p0, Lm7/n;->c:Lm7/g;

    return-object v0
.end method

.method public i()Lm7/b;
    .locals 1

    iget-object v0, p0, Lm7/n;->f:Lm7/b;

    return-object v0
.end method

.method public j()Lm7/b;
    .locals 1

    iget-object v0, p0, Lm7/n;->g:Lm7/b;

    return-object v0
.end method

.method public k()Lm7/b;
    .locals 1

    iget-object v0, p0, Lm7/n;->h:Lm7/b;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lm7/n;->j:Z

    return v0
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, Lm7/n;->j:Z

    return-void
.end method
