.class public abstract Ly3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly3/b$r;,
        Ly3/b$q;,
        Ly3/b$p;,
        Ly3/b$s;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ly3/b<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ly3/a$b;"
    }
.end annotation


# static fields
.field public static final m:Ly3/b$s;

.field public static final n:Ly3/b$s;

.field public static final o:Ly3/b$s;

.field public static final p:Ly3/b$s;

.field public static final q:Ly3/b$s;

.field public static final r:Ly3/b$s;

.field public static final s:Ly3/b$s;

.field public static final t:Ly3/b$s;

.field public static final u:Ly3/b$s;

.field public static final v:Ly3/b$s;

.field public static final w:Ly3/b$s;

.field public static final x:Ly3/b$s;

.field public static final y:Ly3/b$s;

.field public static final z:Ly3/b$s;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ly3/c;

.field public f:Z

.field public g:F

.field public h:F

.field public i:J

.field public j:F

.field public final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ly3/b$q;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ly3/b$r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly3/b$g;

    const-string v1, "translationX"

    invoke-direct {v0, v1}, Ly3/b$g;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->m:Ly3/b$s;

    new-instance v0, Ly3/b$h;

    const-string v1, "translationY"

    invoke-direct {v0, v1}, Ly3/b$h;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->n:Ly3/b$s;

    new-instance v0, Ly3/b$i;

    const-string v1, "translationZ"

    invoke-direct {v0, v1}, Ly3/b$i;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->o:Ly3/b$s;

    new-instance v0, Ly3/b$j;

    const-string v1, "scaleX"

    invoke-direct {v0, v1}, Ly3/b$j;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->p:Ly3/b$s;

    new-instance v0, Ly3/b$k;

    const-string v1, "scaleY"

    invoke-direct {v0, v1}, Ly3/b$k;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->q:Ly3/b$s;

    new-instance v0, Ly3/b$l;

    const-string v1, "rotation"

    invoke-direct {v0, v1}, Ly3/b$l;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->r:Ly3/b$s;

    new-instance v0, Ly3/b$m;

    const-string v1, "rotationX"

    invoke-direct {v0, v1}, Ly3/b$m;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->s:Ly3/b$s;

    new-instance v0, Ly3/b$n;

    const-string v1, "rotationY"

    invoke-direct {v0, v1}, Ly3/b$n;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->t:Ly3/b$s;

    new-instance v0, Ly3/b$o;

    const-string v1, "x"

    invoke-direct {v0, v1}, Ly3/b$o;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->u:Ly3/b$s;

    new-instance v0, Ly3/b$a;

    const-string v1, "y"

    invoke-direct {v0, v1}, Ly3/b$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->v:Ly3/b$s;

    new-instance v0, Ly3/b$b;

    const-string v1, "z"

    invoke-direct {v0, v1}, Ly3/b$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->w:Ly3/b$s;

    new-instance v0, Ly3/b$c;

    const-string v1, "alpha"

    invoke-direct {v0, v1}, Ly3/b$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->x:Ly3/b$s;

    new-instance v0, Ly3/b$d;

    const-string v1, "scrollX"

    invoke-direct {v0, v1}, Ly3/b$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->y:Ly3/b$s;

    new-instance v0, Ly3/b$e;

    const-string v1, "scrollY"

    invoke-direct {v0, v1}, Ly3/b$e;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/b;->z:Ly3/b$s;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ly3/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Ly3/c<",
            "TK;>;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Ly3/b;->a:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 16
    iput v0, p0, Ly3/b;->b:F

    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Ly3/b;->c:Z

    .line 18
    iput-boolean v1, p0, Ly3/b;->f:Z

    .line 19
    iput v0, p0, Ly3/b;->g:F

    neg-float v0, v0

    .line 20
    iput v0, p0, Ly3/b;->h:F

    const-wide/16 v0, 0x0

    .line 21
    iput-wide v0, p0, Ly3/b;->i:J

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly3/b;->k:Ljava/util/ArrayList;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    .line 24
    iput-object p1, p0, Ly3/b;->d:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Ly3/b;->e:Ly3/c;

    .line 26
    sget-object p1, Ly3/b;->r:Ly3/b$s;

    if-eq p2, p1, :cond_4

    sget-object p1, Ly3/b;->s:Ly3/b$s;

    if-eq p2, p1, :cond_4

    sget-object p1, Ly3/b;->t:Ly3/b$s;

    if-ne p2, p1, :cond_0

    goto :goto_1

    .line 27
    :cond_0
    sget-object p1, Ly3/b;->x:Ly3/b$s;

    const/high16 v0, 0x3b800000    # 0.00390625f

    if-ne p2, p1, :cond_1

    .line 28
    iput v0, p0, Ly3/b;->j:F

    return-void

    .line 29
    :cond_1
    sget-object p1, Ly3/b;->p:Ly3/b$s;

    if-eq p2, p1, :cond_3

    sget-object p1, Ly3/b;->q:Ly3/b$s;

    if-ne p2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 30
    iput p1, p0, Ly3/b;->j:F

    return-void

    .line 31
    :cond_3
    :goto_0
    iput v0, p0, Ly3/b;->j:F

    return-void

    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 32
    iput p1, p0, Ly3/b;->j:F

    return-void
.end method

.method public constructor <init>(Ly3/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ly3/b;->a:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    iput v0, p0, Ly3/b;->b:F

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Ly3/b;->c:Z

    .line 5
    iput-boolean v1, p0, Ly3/b;->f:Z

    .line 6
    iput v0, p0, Ly3/b;->g:F

    neg-float v0, v0

    .line 7
    iput v0, p0, Ly3/b;->h:F

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Ly3/b;->i:J

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly3/b;->k:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Ly3/b;->d:Ljava/lang/Object;

    .line 12
    new-instance v0, Ly3/b$f;

    const-string v1, "FloatValueHolder"

    invoke-direct {v0, p0, v1, p1}, Ly3/b$f;-><init>(Ly3/b;Ljava/lang/String;Ly3/d;)V

    iput-object v0, p0, Ly3/b;->e:Ly3/c;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    iput p1, p0, Ly3/b;->j:F

    return-void
.end method

.method public static h(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/ArrayList<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 4

    iget-wide v0, p0, Ly3/b;->i:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-wide p1, p0, Ly3/b;->i:J

    iget p1, p0, Ly3/b;->b:F

    invoke-virtual {p0, p1}, Ly3/b;->l(F)V

    return v3

    :cond_0
    sub-long v0, p1, v0

    iput-wide p1, p0, Ly3/b;->i:J

    invoke-virtual {p0, v0, v1}, Ly3/b;->r(J)Z

    move-result p1

    iget p2, p0, Ly3/b;->b:F

    iget v0, p0, Ly3/b;->g:F

    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iput p2, p0, Ly3/b;->b:F

    iget v0, p0, Ly3/b;->h:F

    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Ly3/b;->b:F

    invoke-virtual {p0, p2}, Ly3/b;->l(F)V

    if-eqz p1, :cond_1

    invoke-virtual {p0, v3}, Ly3/b;->d(Z)V

    :cond_1
    return p1
.end method

.method public b(Ly3/b$q;)Ly3/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/b$q;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Ly3/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly3/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public c(Ly3/b$r;)Ly3/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/b$r;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0}, Ly3/b;->g()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Error: Update listeners must be added beforethe animation."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Z)V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly3/b;->f:Z

    invoke-static {}, Ly3/a;->d()Ly3/a;

    move-result-object v1

    invoke-virtual {v1, p0}, Ly3/a;->g(Ly3/a$b;)V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ly3/b;->i:J

    iput-boolean v0, p0, Ly3/b;->c:Z

    :goto_0
    iget-object v1, p0, Ly3/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ly3/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ly3/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/b$q;

    iget v2, p0, Ly3/b;->b:F

    iget v3, p0, Ly3/b;->a:F

    invoke-interface {v1, p0, p1, v2, v3}, Ly3/b$q;->a(Ly3/b;ZFF)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ly3/b;->k:Ljava/util/ArrayList;

    invoke-static {p1}, Ly3/b;->h(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final e()F
    .locals 2

    iget-object v0, p0, Ly3/b;->e:Ly3/c;

    iget-object v1, p0, Ly3/b;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ly3/c;->a(Ljava/lang/Object;)F

    move-result v0

    return v0
.end method

.method public f()F
    .locals 2

    iget v0, p0, Ly3/b;->j:F

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Ly3/b;->f:Z

    return v0
.end method

.method public i(F)Ly3/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iput p1, p0, Ly3/b;->g:F

    return-object p0
.end method

.method public j(F)Ly3/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iput p1, p0, Ly3/b;->h:F

    return-object p0
.end method

.method public k(F)Ly3/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Ly3/b;->j:F

    const/high16 v0, 0x3f400000    # 0.75f

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Ly3/b;->o(F)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Minimum visible change must be positive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l(F)V
    .locals 3

    iget-object v0, p0, Ly3/b;->e:Ly3/c;

    iget-object v1, p0, Ly3/b;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ly3/c;->b(Ljava/lang/Object;F)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly3/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/b$r;

    iget v1, p0, Ly3/b;->b:F

    iget v2, p0, Ly3/b;->a:F

    invoke-interface {v0, p0, v1, v2}, Ly3/b$r;->e(Ly3/b;FF)V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ly3/b;->l:Ljava/util/ArrayList;

    invoke-static {p1}, Ly3/b;->h(Ljava/util/ArrayList;)V

    return-void
.end method

.method public m(F)Ly3/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iput p1, p0, Ly3/b;->b:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly3/b;->c:Z

    return-object p0
.end method

.method public n(F)Ly3/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iput p1, p0, Ly3/b;->a:F

    return-object p0
.end method

.method public abstract o(F)V
.end method

.method public p()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ly3/b;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ly3/b;->q()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Animations may only be started on the main thread"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()V
    .locals 3

    iget-boolean v0, p0, Ly3/b;->f:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/b;->f:Z

    iget-boolean v0, p0, Ly3/b;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ly3/b;->e()F

    move-result v0

    iput v0, p0, Ly3/b;->b:F

    :cond_0
    iget v0, p0, Ly3/b;->b:F

    iget v1, p0, Ly3/b;->g:F

    cmpl-float v1, v0, v1

    if-gtz v1, :cond_1

    iget v1, p0, Ly3/b;->h:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Ly3/a;->d()Ly3/a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p0, v1, v2}, Ly3/a;->a(Ly3/a$b;J)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Starting value need to be in between min value and max value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public abstract r(J)Z
.end method
