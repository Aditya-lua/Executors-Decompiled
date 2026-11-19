.class public Lo7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Ljava/lang/String;

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

.field public final c:Ln7/f;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/o;Ln7/f;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Ln7/f;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/b;->b:Ln7/o;

    iput-object p3, p0, Lo7/b;->c:Ln7/f;

    iput-boolean p4, p0, Lo7/b;->d:Z

    iput-boolean p5, p0, Lo7/b;->e:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/f;

    invoke-direct {p2, p1, p3, p0}, Li7/f;-><init>(Lg7/h0;Lp7/b;Lo7/b;)V

    return-object p2
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ln7/o;
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

    iget-object v0, p0, Lo7/b;->b:Ln7/o;

    return-object v0
.end method

.method public d()Ln7/f;
    .locals 1

    iget-object v0, p0, Lo7/b;->c:Ln7/f;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lo7/b;->e:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lo7/b;->d:Z

    return v0
.end method
