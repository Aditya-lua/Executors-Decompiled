.class public Ln7/l;
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

.field public final c:Lm7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lm7/b;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm7/o;Lm7/o;Lm7/b;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lm7/b;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/l;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/l;->b:Lm7/o;

    iput-object p3, p0, Ln7/l;->c:Lm7/o;

    iput-object p4, p0, Ln7/l;->d:Lm7/b;

    iput-boolean p5, p0, Ln7/l;->e:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/o;

    invoke-direct {p2, p1, p3, p0}, Lh7/o;-><init>(Lf7/h0;Lo7/b;Ln7/l;)V

    return-object p2
.end method

.method public b()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/l;->d:Lm7/b;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lm7/o;
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

    iget-object v0, p0, Ln7/l;->b:Lm7/o;

    return-object v0
.end method

.method public e()Lm7/o;
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

    iget-object v0, p0, Ln7/l;->c:Lm7/o;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ln7/l;->e:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RectangleShape{position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln7/l;->b:Lm7/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln7/l;->c:Lm7/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
