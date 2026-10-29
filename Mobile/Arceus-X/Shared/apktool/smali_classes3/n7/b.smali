.class public Ln7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# instance fields
.field public final a:Ljava/lang/String;

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

.field public final c:Lm7/f;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm7/o;Lm7/f;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lm7/f;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/b;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/b;->b:Lm7/o;

    iput-object p3, p0, Ln7/b;->c:Lm7/f;

    iput-boolean p4, p0, Ln7/b;->d:Z

    iput-boolean p5, p0, Ln7/b;->e:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/f;

    invoke-direct {p2, p1, p3, p0}, Lh7/f;-><init>(Lf7/h0;Lo7/b;Ln7/b;)V

    return-object p2
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lm7/o;
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

    iget-object v0, p0, Ln7/b;->b:Lm7/o;

    return-object v0
.end method

.method public d()Lm7/f;
    .locals 1

    iget-object v0, p0, Ln7/b;->c:Lm7/f;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ln7/b;->e:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ln7/b;->d:Z

    return v0
.end method
