.class public Lo7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Z

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Ljava/lang/String;

.field public final d:Ln7/a;

.field public final e:Ln7/d;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Ln7/a;Ln7/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/p;->c:Ljava/lang/String;

    iput-boolean p2, p0, Lo7/p;->a:Z

    iput-object p3, p0, Lo7/p;->b:Landroid/graphics/Path$FillType;

    iput-object p4, p0, Lo7/p;->d:Ln7/a;

    iput-object p5, p0, Lo7/p;->e:Ln7/d;

    iput-boolean p6, p0, Lo7/p;->f:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/g;

    invoke-direct {p2, p1, p3, p0}, Li7/g;-><init>(Lg7/h0;Lp7/b;Lo7/p;)V

    return-object p2
.end method

.method public b()Ln7/a;
    .locals 1

    iget-object v0, p0, Lo7/p;->d:Ln7/a;

    return-object v0
.end method

.method public c()Landroid/graphics/Path$FillType;
    .locals 1

    iget-object v0, p0, Lo7/p;->b:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/p;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ln7/d;
    .locals 1

    iget-object v0, p0, Lo7/p;->e:Ln7/d;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lo7/p;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShapeFill{color=, fillEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lo7/p;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
