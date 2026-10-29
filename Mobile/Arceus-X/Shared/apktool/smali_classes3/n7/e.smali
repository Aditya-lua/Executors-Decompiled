.class public Ln7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# instance fields
.field public final a:Ln7/g;

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Lm7/c;

.field public final d:Lm7/d;

.field public final e:Lm7/f;

.field public final f:Lm7/f;

.field public final g:Ljava/lang/String;

.field public final h:Lm7/b;

.field public final i:Lm7/b;

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/g;Landroid/graphics/Path$FillType;Lm7/c;Lm7/d;Lm7/f;Lm7/f;Lm7/b;Lm7/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln7/e;->a:Ln7/g;

    iput-object p3, p0, Ln7/e;->b:Landroid/graphics/Path$FillType;

    iput-object p4, p0, Ln7/e;->c:Lm7/c;

    iput-object p5, p0, Ln7/e;->d:Lm7/d;

    iput-object p6, p0, Ln7/e;->e:Lm7/f;

    iput-object p7, p0, Ln7/e;->f:Lm7/f;

    iput-object p1, p0, Ln7/e;->g:Ljava/lang/String;

    iput-object p8, p0, Ln7/e;->h:Lm7/b;

    iput-object p9, p0, Ln7/e;->i:Lm7/b;

    iput-boolean p10, p0, Ln7/e;->j:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 1

    new-instance v0, Lh7/h;

    invoke-direct {v0, p1, p2, p3, p0}, Lh7/h;-><init>(Lf7/h0;Lf7/i;Lo7/b;Ln7/e;)V

    return-object v0
.end method

.method public b()Lm7/f;
    .locals 1

    iget-object v0, p0, Ln7/e;->f:Lm7/f;

    return-object v0
.end method

.method public c()Landroid/graphics/Path$FillType;
    .locals 1

    iget-object v0, p0, Ln7/e;->b:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method public d()Lm7/c;
    .locals 1

    iget-object v0, p0, Ln7/e;->c:Lm7/c;

    return-object v0
.end method

.method public e()Ln7/g;
    .locals 1

    iget-object v0, p0, Ln7/e;->a:Ln7/g;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lm7/d;
    .locals 1

    iget-object v0, p0, Ln7/e;->d:Lm7/d;

    return-object v0
.end method

.method public h()Lm7/f;
    .locals 1

    iget-object v0, p0, Ln7/e;->e:Lm7/f;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Ln7/e;->j:Z

    return v0
.end method
