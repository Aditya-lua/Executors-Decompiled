.class public Ln7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/k$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/k$a;

.field public final c:Lm7/b;

.field public final d:Lm7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lm7/b;

.field public final f:Lm7/b;

.field public final g:Lm7/b;

.field public final h:Lm7/b;

.field public final i:Lm7/b;

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/k$a;Lm7/b;Lm7/o;Lm7/b;Lm7/b;Lm7/b;Lm7/b;Lm7/b;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/k$a;",
            "Lm7/b;",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lm7/b;",
            "Lm7/b;",
            "Lm7/b;",
            "Lm7/b;",
            "Lm7/b;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/k;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/k;->b:Ln7/k$a;

    iput-object p3, p0, Ln7/k;->c:Lm7/b;

    iput-object p4, p0, Ln7/k;->d:Lm7/o;

    iput-object p5, p0, Ln7/k;->e:Lm7/b;

    iput-object p6, p0, Ln7/k;->f:Lm7/b;

    iput-object p7, p0, Ln7/k;->g:Lm7/b;

    iput-object p8, p0, Ln7/k;->h:Lm7/b;

    iput-object p9, p0, Ln7/k;->i:Lm7/b;

    iput-boolean p10, p0, Ln7/k;->j:Z

    iput-boolean p11, p0, Ln7/k;->k:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/n;

    invoke-direct {p2, p1, p3, p0}, Lh7/n;-><init>(Lf7/h0;Lo7/b;Ln7/k;)V

    return-object p2
.end method

.method public b()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/k;->f:Lm7/b;

    return-object v0
.end method

.method public c()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/k;->h:Lm7/b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/k;->g:Lm7/b;

    return-object v0
.end method

.method public f()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/k;->i:Lm7/b;

    return-object v0
.end method

.method public g()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/k;->c:Lm7/b;

    return-object v0
.end method

.method public h()Lm7/o;
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

    iget-object v0, p0, Ln7/k;->d:Lm7/o;

    return-object v0
.end method

.method public i()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/k;->e:Lm7/b;

    return-object v0
.end method

.method public j()Ln7/k$a;
    .locals 1

    iget-object v0, p0, Ln7/k;->b:Ln7/k$a;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Ln7/k;->j:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Ln7/k;->k:Z

    return v0
.end method
