.class public Lb3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/b$a$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Landroidx/core/graphics/Insets;

.field public d:Z

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:F

.field public g:F

.field public h:F

.field public i:Lb3/b$a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lb3/b$a;->a:I

    iput v0, p0, Lb3/b$a;->b:I

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    iput-object v0, p0, Lb3/b$a;->c:Landroidx/core/graphics/Insets;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb3/b$a;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lb3/b$a;->e:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    iput v0, p0, Lb3/b$a;->f:F

    iput v0, p0, Lb3/b$a;->g:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lb3/b$a;->h:F

    return-void
.end method

.method public static synthetic a(Lb3/b$a;Landroidx/core/graphics/Insets;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->w(Landroidx/core/graphics/Insets;)V

    return-void
.end method

.method public static synthetic b(Lb3/b$a;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->A(I)V

    return-void
.end method

.method public static synthetic c(Lb3/b$a;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->v(I)V

    return-void
.end method

.method public static synthetic d(Lb3/b$a;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->z(Z)V

    return-void
.end method

.method public static synthetic e(Lb3/b$a;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->s(F)V

    return-void
.end method

.method public static synthetic f(Lb3/b$a;)I
    .locals 0

    iget p0, p0, Lb3/b$a;->a:I

    return p0
.end method

.method public static synthetic g(Lb3/b$a;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->x(F)V

    return-void
.end method

.method public static synthetic h(Lb3/b$a;)I
    .locals 0

    iget p0, p0, Lb3/b$a;->b:I

    return p0
.end method

.method public static synthetic i(Lb3/b$a;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->y(F)V

    return-void
.end method

.method public static synthetic j(Lb3/b$a;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/b$a;->u(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 1

    iget v0, p0, Lb3/b$a;->a:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lb3/b$a;->a:I

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->e(I)V

    :cond_0
    return-void
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lb3/b$a;->h:F

    return v0
.end method

.method public l()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lb3/b$a;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lb3/b$a;->b:I

    return v0
.end method

.method public n()Landroidx/core/graphics/Insets;
    .locals 1

    iget-object v0, p0, Lb3/b$a;->c:Landroidx/core/graphics/Insets;

    return-object v0
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lb3/b$a;->f:F

    return v0
.end method

.method public p()F
    .locals 1

    iget v0, p0, Lb3/b$a;->g:F

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lb3/b$a;->a:I

    return v0
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lb3/b$a;->d:Z

    return v0
.end method

.method public final s(F)V
    .locals 1

    iget v0, p0, Lb3/b$a;->h:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lb3/b$a;->h:F

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->d(F)V

    :cond_0
    return-void
.end method

.method public t(Lb3/b$a$a;)V
    .locals 1

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lb3/b$a;->i:Lb3/b$a$a;

    return-void
.end method

.method public final u(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iput-object p1, p0, Lb3/b$a;->e:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->h(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public final v(I)V
    .locals 1

    iget v0, p0, Lb3/b$a;->b:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lb3/b$a;->b:I

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->a(I)V

    :cond_0
    return-void
.end method

.method public final w(Landroidx/core/graphics/Insets;)V
    .locals 1

    iget-object v0, p0, Lb3/b$a;->c:Landroidx/core/graphics/Insets;

    invoke-virtual {v0, p1}, Landroidx/core/graphics/Insets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lb3/b$a;->c:Landroidx/core/graphics/Insets;

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->c(Landroidx/core/graphics/Insets;)V

    :cond_0
    return-void
.end method

.method public final x(F)V
    .locals 1

    iget v0, p0, Lb3/b$a;->f:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lb3/b$a;->f:F

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->f(F)V

    :cond_0
    return-void
.end method

.method public final y(F)V
    .locals 1

    iget v0, p0, Lb3/b$a;->g:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lb3/b$a;->g:F

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->g(F)V

    :cond_0
    return-void
.end method

.method public final z(Z)V
    .locals 1

    iget-boolean v0, p0, Lb3/b$a;->d:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb3/b$a;->d:Z

    iget-object v0, p0, Lb3/b$a;->i:Lb3/b$a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lb3/b$a$a;->b(Z)V

    :cond_0
    return-void
.end method
