.class public Lo7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Lo7/g;

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Ln7/c;

.field public final d:Ln7/d;

.field public final e:Ln7/f;

.field public final f:Ln7/f;

.field public final g:Ljava/lang/String;

.field public final h:Ln7/b;

.field public final i:Ln7/b;

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo7/g;Landroid/graphics/Path$FillType;Ln7/c;Ln7/d;Ln7/f;Ln7/f;Ln7/b;Ln7/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lo7/e;->a:Lo7/g;

    iput-object p3, p0, Lo7/e;->b:Landroid/graphics/Path$FillType;

    iput-object p4, p0, Lo7/e;->c:Ln7/c;

    iput-object p5, p0, Lo7/e;->d:Ln7/d;

    iput-object p6, p0, Lo7/e;->e:Ln7/f;

    iput-object p7, p0, Lo7/e;->f:Ln7/f;

    iput-object p1, p0, Lo7/e;->g:Ljava/lang/String;

    iput-object p8, p0, Lo7/e;->h:Ln7/b;

    iput-object p9, p0, Lo7/e;->i:Ln7/b;

    iput-boolean p10, p0, Lo7/e;->j:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 1

    new-instance v0, Li7/h;

    invoke-direct {v0, p1, p2, p3, p0}, Li7/h;-><init>(Lg7/h0;Lg7/i;Lp7/b;Lo7/e;)V

    return-object v0
.end method

.method public b()Ln7/f;
    .locals 1

    iget-object v0, p0, Lo7/e;->f:Ln7/f;

    return-object v0
.end method

.method public c()Landroid/graphics/Path$FillType;
    .locals 1

    iget-object v0, p0, Lo7/e;->b:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method public d()Ln7/c;
    .locals 1

    iget-object v0, p0, Lo7/e;->c:Ln7/c;

    return-object v0
.end method

.method public e()Lo7/g;
    .locals 1

    iget-object v0, p0, Lo7/e;->a:Lo7/g;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ln7/d;
    .locals 1

    iget-object v0, p0, Lo7/e;->d:Ln7/d;

    return-object v0
.end method

.method public h()Ln7/f;
    .locals 1

    iget-object v0, p0, Lo7/e;->e:Ln7/f;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lo7/e;->j:Z

    return v0
.end method
