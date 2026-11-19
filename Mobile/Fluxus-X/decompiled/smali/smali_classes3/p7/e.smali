.class public Lp7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp7/e$a;,
        Lp7/e$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo7/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lg7/i;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Lp7/e$a;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo7/i;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ln7/n;

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:F

.field public final n:F

.field public final o:F

.field public final p:F

.field public final q:Ln7/j;

.field public final r:Ln7/k;

.field public final s:Ln7/b;

.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu7/a<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public final u:Lp7/e$b;

.field public final v:Z

.field public final w:Lo7/a;

.field public final x:Lr7/j;

.field public final y:Lo7/h;


# direct methods
.method public constructor <init>(Ljava/util/List;Lg7/i;Ljava/lang/String;JLp7/e$a;JLjava/lang/String;Ljava/util/List;Ln7/n;IIIFFFFLn7/j;Ln7/k;Ljava/util/List;Lp7/e$b;Ln7/b;ZLo7/a;Lr7/j;Lo7/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo7/c;",
            ">;",
            "Lg7/i;",
            "Ljava/lang/String;",
            "J",
            "Lp7/e$a;",
            "J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lo7/i;",
            ">;",
            "Ln7/n;",
            "IIIFFFF",
            "Ln7/j;",
            "Ln7/k;",
            "Ljava/util/List<",
            "Lu7/a<",
            "Ljava/lang/Float;",
            ">;>;",
            "Lp7/e$b;",
            "Ln7/b;",
            "Z",
            "Lo7/a;",
            "Lr7/j;",
            "Lo7/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp7/e;->a:Ljava/util/List;

    iput-object p2, p0, Lp7/e;->b:Lg7/i;

    iput-object p3, p0, Lp7/e;->c:Ljava/lang/String;

    iput-wide p4, p0, Lp7/e;->d:J

    iput-object p6, p0, Lp7/e;->e:Lp7/e$a;

    iput-wide p7, p0, Lp7/e;->f:J

    iput-object p9, p0, Lp7/e;->g:Ljava/lang/String;

    iput-object p10, p0, Lp7/e;->h:Ljava/util/List;

    iput-object p11, p0, Lp7/e;->i:Ln7/n;

    iput p12, p0, Lp7/e;->j:I

    iput p13, p0, Lp7/e;->k:I

    iput p14, p0, Lp7/e;->l:I

    iput p15, p0, Lp7/e;->m:F

    move/from16 p1, p16

    iput p1, p0, Lp7/e;->n:F

    move/from16 p1, p17

    iput p1, p0, Lp7/e;->o:F

    move/from16 p1, p18

    iput p1, p0, Lp7/e;->p:F

    move-object/from16 p1, p19

    iput-object p1, p0, Lp7/e;->q:Ln7/j;

    move-object/from16 p1, p20

    iput-object p1, p0, Lp7/e;->r:Ln7/k;

    move-object/from16 p1, p21

    iput-object p1, p0, Lp7/e;->t:Ljava/util/List;

    move-object/from16 p1, p22

    iput-object p1, p0, Lp7/e;->u:Lp7/e$b;

    move-object/from16 p1, p23

    iput-object p1, p0, Lp7/e;->s:Ln7/b;

    move/from16 p1, p24

    iput-boolean p1, p0, Lp7/e;->v:Z

    move-object/from16 p1, p25

    iput-object p1, p0, Lp7/e;->w:Lo7/a;

    move-object/from16 p1, p26

    iput-object p1, p0, Lp7/e;->x:Lr7/j;

    move-object/from16 p1, p27

    iput-object p1, p0, Lp7/e;->y:Lo7/h;

    return-void
.end method


# virtual methods
.method public a()Lo7/h;
    .locals 1

    iget-object v0, p0, Lp7/e;->y:Lo7/h;

    return-object v0
.end method

.method public b()Lo7/a;
    .locals 1

    iget-object v0, p0, Lp7/e;->w:Lo7/a;

    return-object v0
.end method

.method public c()Lg7/i;
    .locals 1

    iget-object v0, p0, Lp7/e;->b:Lg7/i;

    return-object v0
.end method

.method public d()Lr7/j;
    .locals 1

    iget-object v0, p0, Lp7/e;->x:Lr7/j;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lp7/e;->d:J

    return-wide v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu7/a<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lp7/e;->t:Ljava/util/List;

    return-object v0
.end method

.method public g()Lp7/e$a;
    .locals 1

    iget-object v0, p0, Lp7/e;->e:Lp7/e$a;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo7/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp7/e;->h:Ljava/util/List;

    return-object v0
.end method

.method public i()Lp7/e$b;
    .locals 1

    iget-object v0, p0, Lp7/e;->u:Lp7/e$b;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp7/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lp7/e;->f:J

    return-wide v0
.end method

.method public l()F
    .locals 1

    iget v0, p0, Lp7/e;->p:F

    return v0
.end method

.method public m()F
    .locals 1

    iget v0, p0, Lp7/e;->o:F

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp7/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo7/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp7/e;->a:Ljava/util/List;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lp7/e;->l:I

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lp7/e;->k:I

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lp7/e;->j:I

    return v0
.end method

.method public s()F
    .locals 2

    iget v0, p0, Lp7/e;->n:F

    iget-object v1, p0, Lp7/e;->b:Lg7/i;

    invoke-virtual {v1}, Lg7/i;->e()F

    move-result v1

    div-float/2addr v0, v1

    return v0
.end method

.method public t()Ln7/j;
    .locals 1

    iget-object v0, p0, Lp7/e;->q:Ln7/j;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lp7/e;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ln7/k;
    .locals 1

    iget-object v0, p0, Lp7/e;->r:Ln7/k;

    return-object v0
.end method

.method public v()Ln7/b;
    .locals 1

    iget-object v0, p0, Lp7/e;->s:Ln7/b;

    return-object v0
.end method

.method public w()F
    .locals 1

    iget v0, p0, Lp7/e;->m:F

    return v0
.end method

.method public x()Ln7/n;
    .locals 1

    iget-object v0, p0, Lp7/e;->i:Ln7/n;

    return-object v0
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, Lp7/e;->v:Z

    return v0
.end method

.method public z(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp7/e;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lp7/e;->b:Lg7/i;

    invoke-virtual {p0}, Lp7/e;->k()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lg7/i;->t(J)Lp7/e;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "\t\tParents: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lp7/e;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lp7/e;->b:Lg7/i;

    invoke-virtual {v2}, Lp7/e;->k()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lg7/i;->t(J)Lp7/e;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_0

    const-string v3, "->"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lp7/e;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lp7/e;->b:Lg7/i;

    invoke-virtual {v2}, Lp7/e;->k()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lg7/i;->t(J)Lp7/e;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lp7/e;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tMasks: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp7/e;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {p0}, Lp7/e;->r()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lp7/e;->q()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tBackground: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0}, Lp7/e;->r()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lp7/e;->q()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Lp7/e;->p()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%dx%d %X\n"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v2, p0, Lp7/e;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tShapes:\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lp7/e;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\t\t"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
