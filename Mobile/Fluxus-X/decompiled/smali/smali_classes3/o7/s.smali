.class public Lo7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/s$a;,
        Lo7/s$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/b;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ln7/a;

.field public final e:Ln7/d;

.field public final f:Ln7/b;

.field public final g:Lo7/s$a;

.field public final h:Lo7/s$b;

.field public final i:F

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/b;Ljava/util/List;Ln7/a;Ln7/d;Ln7/b;Lo7/s$a;Lo7/s$b;FZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/b;",
            "Ljava/util/List<",
            "Ln7/b;",
            ">;",
            "Ln7/a;",
            "Ln7/d;",
            "Ln7/b;",
            "Lo7/s$a;",
            "Lo7/s$b;",
            "FZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/s;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/s;->b:Ln7/b;

    iput-object p3, p0, Lo7/s;->c:Ljava/util/List;

    iput-object p4, p0, Lo7/s;->d:Ln7/a;

    iput-object p5, p0, Lo7/s;->e:Ln7/d;

    iput-object p6, p0, Lo7/s;->f:Ln7/b;

    iput-object p7, p0, Lo7/s;->g:Lo7/s$a;

    iput-object p8, p0, Lo7/s;->h:Lo7/s$b;

    iput p9, p0, Lo7/s;->i:F

    iput-boolean p10, p0, Lo7/s;->j:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/t;

    invoke-direct {p2, p1, p3, p0}, Li7/t;-><init>(Lg7/h0;Lp7/b;Lo7/s;)V

    return-object p2
.end method

.method public b()Lo7/s$a;
    .locals 1

    iget-object v0, p0, Lo7/s;->g:Lo7/s$a;

    return-object v0
.end method

.method public c()Ln7/a;
    .locals 1

    iget-object v0, p0, Lo7/s;->d:Ln7/a;

    return-object v0
.end method

.method public d()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/s;->b:Ln7/b;

    return-object v0
.end method

.method public e()Lo7/s$b;
    .locals 1

    iget-object v0, p0, Lo7/s;->h:Lo7/s$b;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln7/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo7/s;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lo7/s;->i:F

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/s;->a:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ln7/d;
    .locals 1

    iget-object v0, p0, Lo7/s;->e:Ln7/d;

    return-object v0
.end method

.method public j()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/s;->f:Ln7/b;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lo7/s;->j:Z

    return v0
.end method
