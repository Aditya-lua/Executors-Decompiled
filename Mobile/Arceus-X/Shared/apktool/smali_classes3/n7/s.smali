.class public Ln7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/s$a;,
        Ln7/s$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lm7/b;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lm7/a;

.field public final e:Lm7/d;

.field public final f:Lm7/b;

.field public final g:Ln7/s$a;

.field public final h:Ln7/s$b;

.field public final i:F

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm7/b;Ljava/util/List;Lm7/a;Lm7/d;Lm7/b;Ln7/s$a;Ln7/s$b;FZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/b;",
            "Ljava/util/List<",
            "Lm7/b;",
            ">;",
            "Lm7/a;",
            "Lm7/d;",
            "Lm7/b;",
            "Ln7/s$a;",
            "Ln7/s$b;",
            "FZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/s;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/s;->b:Lm7/b;

    iput-object p3, p0, Ln7/s;->c:Ljava/util/List;

    iput-object p4, p0, Ln7/s;->d:Lm7/a;

    iput-object p5, p0, Ln7/s;->e:Lm7/d;

    iput-object p6, p0, Ln7/s;->f:Lm7/b;

    iput-object p7, p0, Ln7/s;->g:Ln7/s$a;

    iput-object p8, p0, Ln7/s;->h:Ln7/s$b;

    iput p9, p0, Ln7/s;->i:F

    iput-boolean p10, p0, Ln7/s;->j:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/t;

    invoke-direct {p2, p1, p3, p0}, Lh7/t;-><init>(Lf7/h0;Lo7/b;Ln7/s;)V

    return-object p2
.end method

.method public b()Ln7/s$a;
    .locals 1

    iget-object v0, p0, Ln7/s;->g:Ln7/s$a;

    return-object v0
.end method

.method public c()Lm7/a;
    .locals 1

    iget-object v0, p0, Ln7/s;->d:Lm7/a;

    return-object v0
.end method

.method public d()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/s;->b:Lm7/b;

    return-object v0
.end method

.method public e()Ln7/s$b;
    .locals 1

    iget-object v0, p0, Ln7/s;->h:Ln7/s$b;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm7/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln7/s;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Ln7/s;->i:F

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/s;->a:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lm7/d;
    .locals 1

    iget-object v0, p0, Ln7/s;->e:Lm7/d;

    return-object v0
.end method

.method public j()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/s;->f:Lm7/b;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Ln7/s;->j:Z

    return v0
.end method
