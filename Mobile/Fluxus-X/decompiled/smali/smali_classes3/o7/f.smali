.class public Lo7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lo7/g;

.field public final c:Ln7/c;

.field public final d:Ln7/d;

.field public final e:Ln7/f;

.field public final f:Ln7/f;

.field public final g:Ln7/b;

.field public final h:Lo7/s$a;

.field public final i:Lo7/s$b;

.field public final j:F

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ln7/b;

.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo7/g;Ln7/c;Ln7/d;Ln7/f;Ln7/f;Ln7/b;Lo7/s$a;Lo7/s$b;FLjava/util/List;Ln7/b;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lo7/g;",
            "Ln7/c;",
            "Ln7/d;",
            "Ln7/f;",
            "Ln7/f;",
            "Ln7/b;",
            "Lo7/s$a;",
            "Lo7/s$b;",
            "F",
            "Ljava/util/List<",
            "Ln7/b;",
            ">;",
            "Ln7/b;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/f;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/f;->b:Lo7/g;

    iput-object p3, p0, Lo7/f;->c:Ln7/c;

    iput-object p4, p0, Lo7/f;->d:Ln7/d;

    iput-object p5, p0, Lo7/f;->e:Ln7/f;

    iput-object p6, p0, Lo7/f;->f:Ln7/f;

    iput-object p7, p0, Lo7/f;->g:Ln7/b;

    iput-object p8, p0, Lo7/f;->h:Lo7/s$a;

    iput-object p9, p0, Lo7/f;->i:Lo7/s$b;

    iput p10, p0, Lo7/f;->j:F

    iput-object p11, p0, Lo7/f;->k:Ljava/util/List;

    iput-object p12, p0, Lo7/f;->l:Ln7/b;

    iput-boolean p13, p0, Lo7/f;->m:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/i;

    invoke-direct {p2, p1, p3, p0}, Li7/i;-><init>(Lg7/h0;Lp7/b;Lo7/f;)V

    return-object p2
.end method

.method public b()Lo7/s$a;
    .locals 1

    iget-object v0, p0, Lo7/f;->h:Lo7/s$a;

    return-object v0
.end method

.method public c()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/f;->l:Ln7/b;

    return-object v0
.end method

.method public d()Ln7/f;
    .locals 1

    iget-object v0, p0, Lo7/f;->f:Ln7/f;

    return-object v0
.end method

.method public e()Ln7/c;
    .locals 1

    iget-object v0, p0, Lo7/f;->c:Ln7/c;

    return-object v0
.end method

.method public f()Lo7/g;
    .locals 1

    iget-object v0, p0, Lo7/f;->b:Lo7/g;

    return-object v0
.end method

.method public g()Lo7/s$b;
    .locals 1

    iget-object v0, p0, Lo7/f;->i:Lo7/s$b;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln7/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo7/f;->k:Ljava/util/List;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lo7/f;->j:F

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ln7/d;
    .locals 1

    iget-object v0, p0, Lo7/f;->d:Ln7/d;

    return-object v0
.end method

.method public l()Ln7/f;
    .locals 1

    iget-object v0, p0, Lo7/f;->e:Ln7/f;

    return-object v0
.end method

.method public m()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/f;->g:Ln7/b;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lo7/f;->m:Z

    return v0
.end method
