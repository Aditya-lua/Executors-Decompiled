.class public Ln7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/g;

.field public final c:Lm7/c;

.field public final d:Lm7/d;

.field public final e:Lm7/f;

.field public final f:Lm7/f;

.field public final g:Lm7/b;

.field public final h:Ln7/s$a;

.field public final i:Ln7/s$b;

.field public final j:F

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lm7/b;

.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/g;Lm7/c;Lm7/d;Lm7/f;Lm7/f;Lm7/b;Ln7/s$a;Ln7/s$b;FLjava/util/List;Lm7/b;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/g;",
            "Lm7/c;",
            "Lm7/d;",
            "Lm7/f;",
            "Lm7/f;",
            "Lm7/b;",
            "Ln7/s$a;",
            "Ln7/s$b;",
            "F",
            "Ljava/util/List<",
            "Lm7/b;",
            ">;",
            "Lm7/b;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/f;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/f;->b:Ln7/g;

    iput-object p3, p0, Ln7/f;->c:Lm7/c;

    iput-object p4, p0, Ln7/f;->d:Lm7/d;

    iput-object p5, p0, Ln7/f;->e:Lm7/f;

    iput-object p6, p0, Ln7/f;->f:Lm7/f;

    iput-object p7, p0, Ln7/f;->g:Lm7/b;

    iput-object p8, p0, Ln7/f;->h:Ln7/s$a;

    iput-object p9, p0, Ln7/f;->i:Ln7/s$b;

    iput p10, p0, Ln7/f;->j:F

    iput-object p11, p0, Ln7/f;->k:Ljava/util/List;

    iput-object p12, p0, Ln7/f;->l:Lm7/b;

    iput-boolean p13, p0, Ln7/f;->m:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/i;

    invoke-direct {p2, p1, p3, p0}, Lh7/i;-><init>(Lf7/h0;Lo7/b;Ln7/f;)V

    return-object p2
.end method

.method public b()Ln7/s$a;
    .locals 1

    iget-object v0, p0, Ln7/f;->h:Ln7/s$a;

    return-object v0
.end method

.method public c()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/f;->l:Lm7/b;

    return-object v0
.end method

.method public d()Lm7/f;
    .locals 1

    iget-object v0, p0, Ln7/f;->f:Lm7/f;

    return-object v0
.end method

.method public e()Lm7/c;
    .locals 1

    iget-object v0, p0, Ln7/f;->c:Lm7/c;

    return-object v0
.end method

.method public f()Ln7/g;
    .locals 1

    iget-object v0, p0, Ln7/f;->b:Ln7/g;

    return-object v0
.end method

.method public g()Ln7/s$b;
    .locals 1

    iget-object v0, p0, Ln7/f;->i:Ln7/s$b;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm7/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln7/f;->k:Ljava/util/List;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Ln7/f;->j:F

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lm7/d;
    .locals 1

    iget-object v0, p0, Ln7/f;->d:Lm7/d;

    return-object v0
.end method

.method public l()Lm7/f;
    .locals 1

    iget-object v0, p0, Ln7/f;->e:Lm7/f;

    return-object v0
.end method

.method public m()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/f;->g:Lm7/b;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Ln7/f;->m:Z

    return v0
.end method
