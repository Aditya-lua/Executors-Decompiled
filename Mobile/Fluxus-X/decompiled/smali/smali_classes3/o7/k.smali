.class public Lo7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/k$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lo7/k$a;

.field public final c:Ln7/b;

.field public final d:Ln7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ln7/b;

.field public final f:Ln7/b;

.field public final g:Ln7/b;

.field public final h:Ln7/b;

.field public final i:Ln7/b;

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo7/k$a;Ln7/b;Ln7/o;Ln7/b;Ln7/b;Ln7/b;Ln7/b;Ln7/b;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lo7/k$a;",
            "Ln7/b;",
            "Ln7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Ln7/b;",
            "Ln7/b;",
            "Ln7/b;",
            "Ln7/b;",
            "Ln7/b;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/k;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/k;->b:Lo7/k$a;

    iput-object p3, p0, Lo7/k;->c:Ln7/b;

    iput-object p4, p0, Lo7/k;->d:Ln7/o;

    iput-object p5, p0, Lo7/k;->e:Ln7/b;

    iput-object p6, p0, Lo7/k;->f:Ln7/b;

    iput-object p7, p0, Lo7/k;->g:Ln7/b;

    iput-object p8, p0, Lo7/k;->h:Ln7/b;

    iput-object p9, p0, Lo7/k;->i:Ln7/b;

    iput-boolean p10, p0, Lo7/k;->j:Z

    iput-boolean p11, p0, Lo7/k;->k:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/n;

    invoke-direct {p2, p1, p3, p0}, Li7/n;-><init>(Lg7/h0;Lp7/b;Lo7/k;)V

    return-object p2
.end method

.method public b()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/k;->f:Ln7/b;

    return-object v0
.end method

.method public c()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/k;->h:Ln7/b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/k;->g:Ln7/b;

    return-object v0
.end method

.method public f()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/k;->i:Ln7/b;

    return-object v0
.end method

.method public g()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/k;->c:Ln7/b;

    return-object v0
.end method

.method public h()Ln7/o;
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

    iget-object v0, p0, Lo7/k;->d:Ln7/o;

    return-object v0
.end method

.method public i()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/k;->e:Ln7/b;

    return-object v0
.end method

.method public j()Lo7/k$a;
    .locals 1

    iget-object v0, p0, Lo7/k;->b:Lo7/k$a;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lo7/k;->j:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lo7/k;->k:Z

    return v0
.end method
