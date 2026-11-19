.class public Ln7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Ln7/e;

.field public final b:Ln7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ln7/g;

.field public final d:Ln7/b;

.field public final e:Ln7/d;

.field public final f:Ln7/b;

.field public final g:Ln7/b;

.field public final h:Ln7/b;

.field public final i:Ln7/b;

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
    invoke-direct/range {v0 .. v9}, Ln7/n;-><init>(Ln7/e;Ln7/o;Ln7/g;Ln7/b;Ln7/d;Ln7/b;Ln7/b;Ln7/b;Ln7/b;)V

    return-void
.end method

.method public constructor <init>(Ln7/e;Ln7/o;Ln7/g;Ln7/b;Ln7/d;Ln7/b;Ln7/b;Ln7/b;Ln7/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/e;",
            "Ln7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Ln7/g;",
            "Ln7/b;",
            "Ln7/d;",
            "Ln7/b;",
            "Ln7/b;",
            "Ln7/b;",
            "Ln7/b;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Ln7/n;->j:Z

    .line 4
    iput-object p1, p0, Ln7/n;->a:Ln7/e;

    .line 5
    iput-object p2, p0, Ln7/n;->b:Ln7/o;

    .line 6
    iput-object p3, p0, Ln7/n;->c:Ln7/g;

    .line 7
    iput-object p4, p0, Ln7/n;->d:Ln7/b;

    .line 8
    iput-object p5, p0, Ln7/n;->e:Ln7/d;

    .line 9
    iput-object p6, p0, Ln7/n;->h:Ln7/b;

    .line 10
    iput-object p7, p0, Ln7/n;->i:Ln7/b;

    .line 11
    iput-object p8, p0, Ln7/n;->f:Ln7/b;

    .line 12
    iput-object p9, p0, Ln7/n;->g:Ln7/b;

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lj7/p;
    .locals 1

    new-instance v0, Lj7/p;

    invoke-direct {v0, p0}, Lj7/p;-><init>(Ln7/n;)V

    return-object v0
.end method

.method public c()Ln7/e;
    .locals 1

    iget-object v0, p0, Ln7/n;->a:Ln7/e;

    return-object v0
.end method

.method public d()Ln7/b;
    .locals 1

    iget-object v0, p0, Ln7/n;->i:Ln7/b;

    return-object v0
.end method

.method public e()Ln7/d;
    .locals 1

    iget-object v0, p0, Ln7/n;->e:Ln7/d;

    return-object v0
.end method

.method public f()Ln7/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln7/n;->b:Ln7/o;

    return-object v0
.end method

.method public g()Ln7/b;
    .locals 1

    iget-object v0, p0, Ln7/n;->d:Ln7/b;

    return-object v0
.end method

.method public h()Ln7/g;
    .locals 1

    iget-object v0, p0, Ln7/n;->c:Ln7/g;

    return-object v0
.end method

.method public i()Ln7/b;
    .locals 1

    iget-object v0, p0, Ln7/n;->f:Ln7/b;

    return-object v0
.end method

.method public j()Ln7/b;
    .locals 1

    iget-object v0, p0, Ln7/n;->g:Ln7/b;

    return-object v0
.end method

.method public k()Ln7/b;
    .locals 1

    iget-object v0, p0, Ln7/n;->h:Ln7/b;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Ln7/n;->j:Z

    return v0
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, Ln7/n;->j:Z

    return-void
.end method
