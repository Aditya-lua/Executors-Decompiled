.class public Lc2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/e$b;
    }
.end annotation


# static fields
.field public static K0:F = 0.5f


# instance fields
.field public A:I

.field public A0:I

.field public B:F

.field public B0:Z

.field public C:I

.field public C0:Z

.field public D:I

.field public D0:[F

.field public E:F

.field public E0:[Lc2/e;

.field public F:I

.field public F0:[Lc2/e;

.field public G:F

.field public G0:Lc2/e;

.field public H:[I

.field public H0:Lc2/e;

.field public I:F

.field public I0:I

.field public J:Z

.field public J0:I

.field public K:Z

.field public L:Z

.field public M:I

.field public N:I

.field public O:Lc2/d;

.field public P:Lc2/d;

.field public Q:Lc2/d;

.field public R:Lc2/d;

.field public S:Lc2/d;

.field public T:Lc2/d;

.field public U:Lc2/d;

.field public V:Lc2/d;

.field public W:[Lc2/d;

.field public X:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc2/d;",
            ">;"
        }
    .end annotation
.end field

.field public Y:[Z

.field public Z:[Lc2/e$b;

.field public a:Z

.field public a0:Lc2/e;

.field public b:[Ld2/p;

.field public b0:I

.field public c:Ld2/c;

.field public c0:I

.field public d:Ld2/c;

.field public d0:F

.field public e:Ld2/l;

.field public e0:I

.field public f:Ld2/n;

.field public f0:I

.field public g:[Z

.field public g0:I

.field public h:Z

.field public h0:I

.field public i:Z

.field public i0:I

.field public j:Z

.field public j0:I

.field public k:Z

.field public k0:I

.field public l:I

.field public l0:I

.field public m:I

.field public m0:I

.field public n:Lb2/a;

.field public n0:I

.field public o:Ljava/lang/String;

.field public o0:F

.field public p:Z

.field public p0:F

.field public q:Z

.field public q0:Ljava/lang/Object;

.field public r:Z

.field public r0:I

.field public s:Z

.field public s0:I

.field public t:I

.field public t0:Z

.field public u:I

.field public u0:Ljava/lang/String;

.field public v:I

.field public v0:Ljava/lang/String;

.field public w:I

.field public w0:Z

.field public x:I

.field public x0:Z

.field public y:[I

.field public y0:Z

.field public z:I

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc2/e;->a:Z

    const/4 v1, 0x2

    new-array v2, v1, [Ld2/p;

    iput-object v2, p0, Lc2/e;->b:[Ld2/p;

    const/4 v2, 0x0

    iput-object v2, p0, Lc2/e;->e:Ld2/l;

    iput-object v2, p0, Lc2/e;->f:Ld2/n;

    new-array v3, v1, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Lc2/e;->g:[Z

    iput-boolean v0, p0, Lc2/e;->h:Z

    const/4 v3, 0x1

    iput-boolean v3, p0, Lc2/e;->i:Z

    iput-boolean v0, p0, Lc2/e;->j:Z

    iput-boolean v3, p0, Lc2/e;->k:Z

    const/4 v3, -0x1

    iput v3, p0, Lc2/e;->l:I

    iput v3, p0, Lc2/e;->m:I

    new-instance v4, Lb2/a;

    invoke-direct {v4, p0}, Lb2/a;-><init>(Lc2/e;)V

    iput-object v4, p0, Lc2/e;->n:Lb2/a;

    iput-boolean v0, p0, Lc2/e;->p:Z

    iput-boolean v0, p0, Lc2/e;->q:Z

    iput-boolean v0, p0, Lc2/e;->r:Z

    iput-boolean v0, p0, Lc2/e;->s:Z

    iput v3, p0, Lc2/e;->t:I

    iput v3, p0, Lc2/e;->u:I

    iput v0, p0, Lc2/e;->v:I

    iput v0, p0, Lc2/e;->w:I

    iput v0, p0, Lc2/e;->x:I

    new-array v4, v1, [I

    iput-object v4, p0, Lc2/e;->y:[I

    iput v0, p0, Lc2/e;->z:I

    iput v0, p0, Lc2/e;->A:I

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, Lc2/e;->B:F

    iput v0, p0, Lc2/e;->C:I

    iput v0, p0, Lc2/e;->D:I

    iput v4, p0, Lc2/e;->E:F

    iput v3, p0, Lc2/e;->F:I

    iput v4, p0, Lc2/e;->G:F

    const v4, 0x7fffffff

    filled-new-array {v4, v4}, [I

    move-result-object v4

    iput-object v4, p0, Lc2/e;->H:[I

    const/high16 v4, 0x7fc00000    # Float.NaN

    iput v4, p0, Lc2/e;->I:F

    iput-boolean v0, p0, Lc2/e;->J:Z

    iput-boolean v0, p0, Lc2/e;->L:Z

    iput v0, p0, Lc2/e;->M:I

    iput v0, p0, Lc2/e;->N:I

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->b:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->O:Lc2/d;

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->c:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->P:Lc2/d;

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->d:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->Q:Lc2/d;

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->e:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->R:Lc2/d;

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->f:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->S:Lc2/d;

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->h:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->T:Lc2/d;

    new-instance v4, Lc2/d;

    sget-object v5, Lc2/d$a;->i:Lc2/d$a;

    invoke-direct {v4, p0, v5}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v4, p0, Lc2/e;->U:Lc2/d;

    new-instance v11, Lc2/d;

    sget-object v4, Lc2/d$a;->g:Lc2/d$a;

    invoke-direct {v11, p0, v4}, Lc2/d;-><init>(Lc2/e;Lc2/d$a;)V

    iput-object v11, p0, Lc2/e;->V:Lc2/d;

    iget-object v6, p0, Lc2/e;->O:Lc2/d;

    iget-object v7, p0, Lc2/e;->Q:Lc2/d;

    iget-object v8, p0, Lc2/e;->P:Lc2/d;

    iget-object v9, p0, Lc2/e;->R:Lc2/d;

    iget-object v10, p0, Lc2/e;->S:Lc2/d;

    filled-new-array/range {v6 .. v11}, [Lc2/d;

    move-result-object v4

    iput-object v4, p0, Lc2/e;->W:[Lc2/d;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lc2/e;->X:Ljava/util/ArrayList;

    new-array v4, v1, [Z

    iput-object v4, p0, Lc2/e;->Y:[Z

    sget-object v4, Lc2/e$b;->a:Lc2/e$b;

    filled-new-array {v4, v4}, [Lc2/e$b;

    move-result-object v4

    iput-object v4, p0, Lc2/e;->Z:[Lc2/e$b;

    iput-object v2, p0, Lc2/e;->a0:Lc2/e;

    iput v0, p0, Lc2/e;->b0:I

    iput v0, p0, Lc2/e;->c0:I

    const/4 v4, 0x0

    iput v4, p0, Lc2/e;->d0:F

    iput v3, p0, Lc2/e;->e0:I

    iput v0, p0, Lc2/e;->f0:I

    iput v0, p0, Lc2/e;->g0:I

    iput v0, p0, Lc2/e;->h0:I

    iput v0, p0, Lc2/e;->i0:I

    iput v0, p0, Lc2/e;->j0:I

    iput v0, p0, Lc2/e;->k0:I

    iput v0, p0, Lc2/e;->l0:I

    sget v4, Lc2/e;->K0:F

    iput v4, p0, Lc2/e;->o0:F

    iput v4, p0, Lc2/e;->p0:F

    iput v0, p0, Lc2/e;->r0:I

    iput v0, p0, Lc2/e;->s0:I

    iput-boolean v0, p0, Lc2/e;->t0:Z

    iput-object v2, p0, Lc2/e;->u0:Ljava/lang/String;

    iput-object v2, p0, Lc2/e;->v0:Ljava/lang/String;

    iput-boolean v0, p0, Lc2/e;->y0:Z

    iput v0, p0, Lc2/e;->z0:I

    iput v0, p0, Lc2/e;->A0:I

    new-array v0, v1, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lc2/e;->D0:[F

    filled-new-array {v2, v2}, [Lc2/e;

    move-result-object v0

    iput-object v0, p0, Lc2/e;->E0:[Lc2/e;

    filled-new-array {v2, v2}, [Lc2/e;

    move-result-object v0

    iput-object v0, p0, Lc2/e;->F0:[Lc2/e;

    iput-object v2, p0, Lc2/e;->G0:Lc2/e;

    iput-object v2, p0, Lc2/e;->H0:Lc2/e;

    iput v3, p0, Lc2/e;->I0:I

    iput v3, p0, Lc2/e;->J0:I

    invoke-virtual {p0}, Lc2/e;->d()V

    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method


# virtual methods
.method public A()Lc2/e$b;
    .locals 2

    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final A0(Ljava/lang/StringBuilder;Ljava/lang/String;FI)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :  ["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "],\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public B()I
    .locals 2

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    if-eqz v0, :cond_0

    iget v0, v0, Lc2/d;->g:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lc2/e;->Q:Lc2/d;

    if-eqz v1, :cond_1

    iget v1, v1, Lc2/d;->g:I

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public B0(I)V
    .locals 0

    iput p1, p0, Lc2/e;->l0:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lc2/e;->J:Z

    return-void
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lc2/e;->M:I

    return v0
.end method

.method public C0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lc2/e;->q0:Ljava/lang/Object;

    return-void
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lc2/e;->N:I

    return v0
.end method

.method public D0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc2/e;->u0:Ljava/lang/String;

    return-void
.end method

.method public E(I)I
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc2/e;->W()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lc2/e;->x()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public E0(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2c

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-lez v2, :cond_3

    add-int/lit8 v6, v1, -0x1

    if-ge v2, v6, :cond_3

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "H"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_0
    add-int/2addr v2, v4

    move v5, v3

    move v3, v2

    :cond_3
    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_5

    sub-int/2addr v1, v4

    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/2addr v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v2, v1, v0

    if-lez v2, :cond_6

    cmpl-float v2, p1, v0

    if-lez v2, :cond_6

    if-ne v5, v4, :cond_4

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Lc2/e;->d0:F

    iput v5, p0, Lc2/e;->e0:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Lc2/e;->d0:F

    return-void
.end method

.method public F()I
    .locals 2

    iget-object v0, p0, Lc2/e;->H:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public F0(I)V
    .locals 3

    iget-boolean v0, p0, Lc2/e;->J:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lc2/e;->l0:I

    sub-int v0, p1, v0

    iget v1, p0, Lc2/e;->c0:I

    add-int/2addr v1, v0

    iput v0, p0, Lc2/e;->g0:I

    iget-object v2, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v2, v0}, Lc2/d;->t(I)V

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0, v1}, Lc2/d;->t(I)V

    iget-object v0, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->t(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc2/e;->q:Z

    return-void
.end method

.method public G()I
    .locals 2

    iget-object v0, p0, Lc2/e;->H:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public G0(II)V
    .locals 1

    iget-boolean v0, p0, Lc2/e;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->t(I)V

    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v0, p2}, Lc2/d;->t(I)V

    iput p1, p0, Lc2/e;->f0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lc2/e;->b0:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc2/e;->p:Z

    return-void
.end method

.method public H()I
    .locals 1

    iget v0, p0, Lc2/e;->n0:I

    return v0
.end method

.method public H0(I)V
    .locals 1

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->t(I)V

    iput p1, p0, Lc2/e;->f0:I

    return-void
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lc2/e;->m0:I

    return v0
.end method

.method public I0(I)V
    .locals 1

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->t(I)V

    iput p1, p0, Lc2/e;->g0:I

    return-void
.end method

.method public J(I)Lc2/e;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    iget-object v0, p1, Lc2/d;->f:Lc2/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lc2/d;->d:Lc2/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    iget-object v0, p1, Lc2/d;->f:Lc2/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lc2/d;->d:Lc2/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public J0(II)V
    .locals 1

    iget-boolean v0, p0, Lc2/e;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->t(I)V

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0, p2}, Lc2/d;->t(I)V

    iput p1, p0, Lc2/e;->g0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lc2/e;->c0:I

    iget-boolean p2, p0, Lc2/e;->J:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lc2/e;->S:Lc2/d;

    iget v0, p0, Lc2/e;->l0:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Lc2/d;->t(I)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lc2/e;->q:Z

    return-void
.end method

.method public K()Lc2/e;
    .locals 1

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    return-object v0
.end method

.method public K0(IIII)V
    .locals 2

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    iput p1, p0, Lc2/e;->f0:I

    iput p2, p0, Lc2/e;->g0:I

    iget p1, p0, Lc2/e;->s0:I

    const/16 p2, 0x8

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lc2/e;->b0:I

    iput v0, p0, Lc2/e;->c0:I

    return-void

    :cond_0
    iget-object p1, p0, Lc2/e;->Z:[Lc2/e$b;

    aget-object p2, p1, v0

    sget-object v0, Lc2/e$b;->a:Lc2/e$b;

    if-ne p2, v0, :cond_1

    iget v1, p0, Lc2/e;->b0:I

    if-ge p3, v1, :cond_1

    move p3, v1

    :cond_1
    const/4 v1, 0x1

    aget-object p1, p1, v1

    if-ne p1, v0, :cond_2

    iget p1, p0, Lc2/e;->c0:I

    if-ge p4, p1, :cond_2

    move p4, p1

    :cond_2
    iput p3, p0, Lc2/e;->b0:I

    iput p4, p0, Lc2/e;->c0:I

    iget p1, p0, Lc2/e;->n0:I

    if-ge p4, p1, :cond_3

    iput p1, p0, Lc2/e;->c0:I

    :cond_3
    iget p1, p0, Lc2/e;->m0:I

    if-ge p3, p1, :cond_4

    iput p1, p0, Lc2/e;->b0:I

    :cond_4
    iget p1, p0, Lc2/e;->A:I

    if-lez p1, :cond_5

    sget-object v0, Lc2/e$b;->c:Lc2/e$b;

    if-ne p2, v0, :cond_5

    iget p2, p0, Lc2/e;->b0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lc2/e;->b0:I

    :cond_5
    iget p1, p0, Lc2/e;->D:I

    if-lez p1, :cond_6

    iget-object p2, p0, Lc2/e;->Z:[Lc2/e$b;

    aget-object p2, p2, v1

    sget-object v0, Lc2/e$b;->c:Lc2/e$b;

    if-ne p2, v0, :cond_6

    iget p2, p0, Lc2/e;->c0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lc2/e;->c0:I

    :cond_6
    iget p1, p0, Lc2/e;->b0:I

    if-eq p3, p1, :cond_7

    iput p1, p0, Lc2/e;->l:I

    :cond_7
    iget p1, p0, Lc2/e;->c0:I

    if-eq p4, p1, :cond_8

    iput p1, p0, Lc2/e;->m:I

    :cond_8
    return-void
.end method

.method public L(I)Lc2/e;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    iget-object v0, p1, Lc2/d;->f:Lc2/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lc2/d;->d:Lc2/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    iget-object v0, p1, Lc2/d;->f:Lc2/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lc2/d;->d:Lc2/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public L0(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/e;->J:Z

    return-void
.end method

.method public M()I
    .locals 2

    invoke-virtual {p0}, Lc2/e;->X()I

    move-result v0

    iget v1, p0, Lc2/e;->b0:I

    add-int/2addr v0, v1

    return v0
.end method

.method public M0(I)V
    .locals 1

    iput p1, p0, Lc2/e;->c0:I

    iget v0, p0, Lc2/e;->n0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lc2/e;->c0:I

    :cond_0
    return-void
.end method

.method public N(I)Ld2/p;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lc2/e;->e:Ld2/l;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lc2/e;->f:Ld2/n;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public N0(F)V
    .locals 0

    iput p1, p0, Lc2/e;->o0:F

    return-void
.end method

.method public O(Ljava/lang/StringBuilder;)V
    .locals 13

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc2/e;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":{\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    actualWidth:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lc2/e;->b0:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "    actualHeight:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lc2/e;->c0:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "    actualLeft:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lc2/e;->f0:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "    actualTop:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lc2/e;->g0:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "left"

    iget-object v3, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    const-string v2, "top"

    iget-object v3, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    const-string v2, "right"

    iget-object v3, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    const-string v2, "bottom"

    iget-object v3, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    const-string v2, "baseline"

    iget-object v3, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    const-string v2, "centerX"

    iget-object v3, p0, Lc2/e;->T:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    const-string v2, "centerY"

    iget-object v3, p0, Lc2/e;->U:Lc2/d;

    invoke-virtual {p0, p1, v2, v3}, Lc2/e;->Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V

    iget v3, p0, Lc2/e;->b0:I

    iget v4, p0, Lc2/e;->m0:I

    iget-object v2, p0, Lc2/e;->H:[I

    const/4 v12, 0x0

    aget v5, v2, v12

    iget v6, p0, Lc2/e;->l:I

    iget v7, p0, Lc2/e;->z:I

    iget v8, p0, Lc2/e;->w:I

    iget v9, p0, Lc2/e;->B:F

    iget-object v2, p0, Lc2/e;->Z:[Lc2/e$b;

    aget-object v10, v2, v12

    iget-object v2, p0, Lc2/e;->D0:[F

    aget v11, v2, v12

    const-string v2, "    width"

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v11}, Lc2/e;->P(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFLc2/e$b;F)V

    iget v3, p0, Lc2/e;->c0:I

    iget v4, p0, Lc2/e;->n0:I

    iget-object v1, p0, Lc2/e;->H:[I

    const/4 v2, 0x1

    aget v5, v1, v2

    iget v6, p0, Lc2/e;->m:I

    iget v7, p0, Lc2/e;->C:I

    iget v8, p0, Lc2/e;->x:I

    iget v9, p0, Lc2/e;->E:F

    iget-object v1, p0, Lc2/e;->Z:[Lc2/e$b;

    aget-object v10, v1, v2

    iget-object v1, p0, Lc2/e;->D0:[F

    aget v11, v1, v2

    const-string v2, "    height"

    move-object v1, p1

    invoke-virtual/range {v0 .. v11}, Lc2/e;->P(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFLc2/e$b;F)V

    iget v2, p0, Lc2/e;->d0:F

    iget v3, p0, Lc2/e;->e0:I

    const-string v4, "    dimensionRatio"

    invoke-virtual {p0, p1, v4, v2, v3}, Lc2/e;->A0(Ljava/lang/StringBuilder;Ljava/lang/String;FI)V

    iget v2, p0, Lc2/e;->o0:F

    sget v3, Lc2/e;->K0:F

    const-string v4, "    horizontalBias"

    invoke-virtual {p0, p1, v4, v2, v3}, Lc2/e;->x0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    iget v2, p0, Lc2/e;->p0:F

    sget v3, Lc2/e;->K0:F

    const-string v4, "    verticalBias"

    invoke-virtual {p0, p1, v4, v2, v3}, Lc2/e;->x0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string v2, "    horizontalChainStyle"

    iget v3, p0, Lc2/e;->z0:I

    invoke-virtual {p0, p1, v2, v3, v12}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string v2, "    verticalChainStyle"

    iget v3, p0, Lc2/e;->A0:I

    invoke-virtual {p0, p1, v2, v3, v12}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string v2, "  }"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public O0(I)V
    .locals 0

    iput p1, p0, Lc2/e;->z0:I

    return-void
.end method

.method public final P(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFLc2/e$b;F)V
    .locals 0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :  {\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object p6, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {p6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p6

    const-string p10, "      behavior"

    invoke-virtual {p0, p1, p10, p2, p6}, Lc2/e;->z0(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "      size"

    const/4 p6, 0x0

    invoke-virtual {p0, p1, p2, p3, p6}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      min"

    invoke-virtual {p0, p1, p2, p4, p6}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      max"

    const p3, 0x7fffffff

    invoke-virtual {p0, p1, p2, p5, p3}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      matchMin"

    invoke-virtual {p0, p1, p2, p7, p6}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      matchDef"

    invoke-virtual {p0, p1, p2, p8, p6}, Lc2/e;->y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      matchPercent"

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, p2, p9, p3}, Lc2/e;->x0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string p2, "    },\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public P0(II)V
    .locals 0

    iput p1, p0, Lc2/e;->f0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lc2/e;->b0:I

    iget p1, p0, Lc2/e;->m0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lc2/e;->b0:I

    :cond_0
    return-void
.end method

.method public final Q(Ljava/lang/StringBuilder;Ljava/lang/String;Lc2/d;)V
    .locals 2

    iget-object v0, p3, Lc2/d;->f:Lc2/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "    "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " : [ \'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p3, Lc2/d;->f:Lc2/d;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p3, Lc2/d;->h:I

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_1

    iget p2, p3, Lc2/d;->g:I

    if-eqz p2, :cond_2

    :cond_1
    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p3, Lc2/d;->g:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p3, Lc2/d;->h:I

    if-eq v1, v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p3, Lc2/d;->h:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string p2, " ] ,\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public Q0(Lc2/e$b;)V
    .locals 2

    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public R()F
    .locals 1

    iget v0, p0, Lc2/e;->p0:F

    return v0
.end method

.method public R0(IIIF)V
    .locals 0

    iput p1, p0, Lc2/e;->w:I

    iput p2, p0, Lc2/e;->z:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lc2/e;->A:I

    iput p4, p0, Lc2/e;->B:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lc2/e;->w:I

    :cond_1
    return-void
.end method

.method public S()I
    .locals 1

    iget v0, p0, Lc2/e;->A0:I

    return v0
.end method

.method public S0(F)V
    .locals 2

    iget-object v0, p0, Lc2/e;->D0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public T()Lc2/e$b;
    .locals 2

    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public T0(IZ)V
    .locals 1

    iget-object v0, p0, Lc2/e;->Y:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public U()I
    .locals 2

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    iget v0, v0, Lc2/d;->g:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lc2/e;->Q:Lc2/d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc2/e;->R:Lc2/d;

    iget v1, v1, Lc2/d;->g:I

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public U0(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/e;->K:Z

    return-void
.end method

.method public V()I
    .locals 1

    iget v0, p0, Lc2/e;->s0:I

    return v0
.end method

.method public V0(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/e;->L:Z

    return-void
.end method

.method public W()I
    .locals 2

    iget v0, p0, Lc2/e;->s0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lc2/e;->b0:I

    return v0
.end method

.method public W0(II)V
    .locals 0

    iput p1, p0, Lc2/e;->M:I

    iput p2, p0, Lc2/e;->N:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lc2/e;->Z0(Z)V

    return-void
.end method

.method public X()I
    .locals 2

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lc2/f;

    if-eqz v1, :cond_0

    check-cast v0, Lc2/f;

    iget v0, v0, Lc2/f;->S0:I

    iget v1, p0, Lc2/e;->f0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lc2/e;->f0:I

    return v0
.end method

.method public X0(I)V
    .locals 2

    iget-object v0, p0, Lc2/e;->H:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public Y()I
    .locals 2

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lc2/f;

    if-eqz v1, :cond_0

    check-cast v0, Lc2/f;

    iget v0, v0, Lc2/f;->T0:I

    iget v1, p0, Lc2/e;->g0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lc2/e;->g0:I

    return v0
.end method

.method public Y0(I)V
    .locals 2

    iget-object v0, p0, Lc2/e;->H:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public Z()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->J:Z

    return v0
.end method

.method public Z0(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/e;->i:Z

    return-void
.end method

.method public a0(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_3

    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-object v3, p0, Lc2/e;->Q:Lc2/d;

    iget-object v3, v3, Lc2/d;->f:Lc2/d;

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    if-eqz p1, :cond_4

    move p1, v2

    goto :goto_2

    :cond_4
    move p1, v1

    :goto_2
    iget-object v3, p0, Lc2/e;->R:Lc2/d;

    iget-object v3, v3, Lc2/d;->f:Lc2/d;

    if-eqz v3, :cond_5

    move v3, v2

    goto :goto_3

    :cond_5
    move v3, v1

    :goto_3
    add-int/2addr p1, v3

    iget-object v3, p0, Lc2/e;->S:Lc2/d;

    iget-object v3, v3, Lc2/d;->f:Lc2/d;

    if-eqz v3, :cond_6

    move v3, v2

    goto :goto_4

    :cond_6
    move v3, v1

    :goto_4
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_7

    return v2

    :cond_7
    return v1
.end method

.method public a1(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lc2/e;->n0:I

    return-void

    :cond_0
    iput p1, p0, Lc2/e;->n0:I

    return-void
.end method

.method public b0()Z
    .locals 4

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lc2/e;->X:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc2/d;

    invoke-virtual {v3}, Lc2/d;->m()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public b1(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lc2/e;->m0:I

    return-void

    :cond_0
    iput p1, p0, Lc2/e;->m0:I

    return-void
.end method

.method public c0()Z
    .locals 2

    iget v0, p0, Lc2/e;->l:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lc2/e;->m:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public c1(II)V
    .locals 0

    iput p1, p0, Lc2/e;->f0:I

    iput p2, p0, Lc2/e;->g0:I

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->T:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->U:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->V:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d0(II)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lc2/d;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lc2/d;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->e()I

    move-result p1

    iget-object v2, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v2}, Lc2/d;->f()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lc2/e;->O:Lc2/d;

    iget-object v2, v2, Lc2/d;->f:Lc2/d;

    invoke-virtual {v2}, Lc2/d;->e()I

    move-result v2

    iget-object v3, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v3}, Lc2/d;->f()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_0

    return v0

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lc2/d;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lc2/d;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->e()I

    move-result p1

    iget-object v2, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v2}, Lc2/d;->f()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Lc2/e;->P:Lc2/d;

    iget-object v2, v2, Lc2/d;->f:Lc2/d;

    invoke-virtual {v2}, Lc2/d;->e()I

    move-result v2

    iget-object v3, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v3}, Lc2/d;->f()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public d1(Lc2/e;)V
    .locals 0

    iput-object p1, p0, Lc2/e;->a0:Lc2/e;

    return-void
.end method

.method public e(Lc2/f;Lz1/d;Ljava/util/HashSet;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc2/f;",
            "Lz1/d;",
            "Ljava/util/HashSet<",
            "Lc2/e;",
            ">;IZ)V"
        }
    .end annotation

    if-eqz p5, :cond_1

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {p1, p2, p0}, Lc2/k;->a(Lc2/f;Lz1/d;Lc2/e;)V

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 v0, 0x40

    invoke-virtual {p1, v0}, Lc2/f;->V1(I)Z

    move-result v0

    invoke-virtual {p0, p2, v0}, Lc2/e;->g(Lz1/d;Z)V

    :cond_1
    if-nez p4, :cond_3

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->d()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/d;

    iget-object v0, v0, Lc2/d;->d:Lc2/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e(Lc2/f;Lz1/d;Ljava/util/HashSet;IZ)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->d()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/d;

    iget-object v0, v0, Lc2/d;->d:Lc2/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e(Lc2/f;Lz1/d;Ljava/util/HashSet;IZ)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->d()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/d;

    iget-object v0, v0, Lc2/d;->d:Lc2/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e(Lc2/f;Lz1/d;Ljava/util/HashSet;IZ)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->d()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/d;

    iget-object v0, v0, Lc2/d;->d:Lc2/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e(Lc2/f;Lz1/d;Ljava/util/HashSet;IZ)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->d()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/d;

    iget-object v0, v0, Lc2/d;->d:Lc2/e;

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e(Lc2/f;Lz1/d;Ljava/util/HashSet;IZ)V

    goto :goto_4

    :cond_6
    :goto_5
    return-void
.end method

.method public e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V
    .locals 0

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p4, p5, p3}, Lc2/d;->b(Lc2/d;IIZ)Z

    return-void
.end method

.method public e1(F)V
    .locals 0

    iput p1, p0, Lc2/e;->p0:F

    return-void
.end method

.method public f()Z
    .locals 1

    instance-of v0, p0, Lc2/l;

    if-nez v0, :cond_1

    instance-of v0, p0, Lc2/h;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final f0(I)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lc2/e;->W:[Lc2/d;

    aget-object v1, v0, p1

    iget-object v2, v1, Lc2/d;->f:Lc2/d;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lc2/d;->f:Lc2/d;

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    iget-object v0, p1, Lc2/d;->f:Lc2/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc2/d;->f:Lc2/d;

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f1(I)V
    .locals 0

    iput p1, p0, Lc2/e;->A0:I

    return-void
.end method

.method public g(Lz1/d;Z)V
    .locals 50

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v1, v2}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    iget-object v3, v0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v1, v3}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v3

    iget-object v4, v0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v4

    iget-object v5, v0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v5}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v5

    iget-object v6, v0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v1, v6}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v6

    iget-object v7, v0, Lc2/e;->a0:Lc2/e;

    const/4 v8, 0x2

    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v7, :cond_2

    if-eqz v7, :cond_0

    iget-object v12, v7, Lc2/e;->Z:[Lc2/e$b;

    aget-object v12, v12, v11

    sget-object v13, Lc2/e$b;->b:Lc2/e$b;

    if-ne v12, v13, :cond_0

    move v12, v10

    goto :goto_0

    :cond_0
    move v12, v11

    :goto_0
    if-eqz v7, :cond_1

    iget-object v7, v7, Lc2/e;->Z:[Lc2/e$b;

    aget-object v7, v7, v10

    sget-object v13, Lc2/e$b;->b:Lc2/e$b;

    if-ne v7, v13, :cond_1

    move v7, v10

    goto :goto_1

    :cond_1
    move v7, v11

    :goto_1
    iget v13, v0, Lc2/e;->v:I

    if-eq v13, v10, :cond_4

    if-eq v13, v8, :cond_3

    if-eq v13, v9, :cond_2

    goto :goto_2

    :cond_2
    move v7, v11

    move v12, v7

    goto :goto_2

    :cond_3
    move v12, v11

    goto :goto_2

    :cond_4
    move v7, v11

    :goto_2
    iget v13, v0, Lc2/e;->s0:I

    const/16 v14, 0x8

    if-ne v13, v14, :cond_5

    iget-boolean v13, v0, Lc2/e;->t0:Z

    if-nez v13, :cond_5

    invoke-virtual {v0}, Lc2/e;->b0()Z

    move-result v13

    if-nez v13, :cond_5

    iget-object v13, v0, Lc2/e;->Y:[Z

    aget-boolean v15, v13, v11

    if-nez v15, :cond_5

    aget-boolean v13, v13, v10

    if-nez v13, :cond_5

    return-void

    :cond_5
    iget-boolean v13, v0, Lc2/e;->p:Z

    const/4 v15, 0x5

    if-nez v13, :cond_6

    iget-boolean v8, v0, Lc2/e;->q:Z

    if-eqz v8, :cond_c

    :cond_6
    if-eqz v13, :cond_8

    iget v8, v0, Lc2/e;->f0:I

    invoke-virtual {v1, v2, v8}, Lz1/d;->f(Lz1/i;I)V

    iget v8, v0, Lc2/e;->f0:I

    iget v13, v0, Lc2/e;->b0:I

    add-int/2addr v8, v13

    invoke-virtual {v1, v3, v8}, Lz1/d;->f(Lz1/i;I)V

    if-eqz v12, :cond_8

    iget-object v8, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v8, :cond_8

    iget-boolean v13, v0, Lc2/e;->k:Z

    if-eqz v13, :cond_7

    check-cast v8, Lc2/f;

    iget-object v13, v0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v8, v13}, Lc2/f;->A1(Lc2/d;)V

    iget-object v13, v0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v8, v13}, Lc2/f;->z1(Lc2/d;)V

    goto :goto_3

    :cond_7
    iget-object v8, v8, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v1, v8}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v8

    invoke-virtual {v1, v8, v3, v11, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_8
    :goto_3
    iget-boolean v8, v0, Lc2/e;->q:Z

    if-eqz v8, :cond_b

    iget v8, v0, Lc2/e;->g0:I

    invoke-virtual {v1, v4, v8}, Lz1/d;->f(Lz1/i;I)V

    iget v8, v0, Lc2/e;->g0:I

    iget v13, v0, Lc2/e;->c0:I

    add-int/2addr v8, v13

    invoke-virtual {v1, v5, v8}, Lz1/d;->f(Lz1/i;I)V

    iget-object v8, v0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v8}, Lc2/d;->m()Z

    move-result v8

    if-eqz v8, :cond_9

    iget v8, v0, Lc2/e;->g0:I

    iget v13, v0, Lc2/e;->l0:I

    add-int/2addr v8, v13

    invoke-virtual {v1, v6, v8}, Lz1/d;->f(Lz1/i;I)V

    :cond_9
    if-eqz v7, :cond_b

    iget-object v8, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v8, :cond_b

    iget-boolean v13, v0, Lc2/e;->k:Z

    if-eqz v13, :cond_a

    check-cast v8, Lc2/f;

    iget-object v13, v0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v8, v13}, Lc2/f;->F1(Lc2/d;)V

    iget-object v13, v0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v8, v13}, Lc2/f;->E1(Lc2/d;)V

    goto :goto_4

    :cond_a
    iget-object v8, v8, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v8}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v8

    invoke-virtual {v1, v8, v5, v11, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_b
    :goto_4
    iget-boolean v8, v0, Lc2/e;->p:Z

    if-eqz v8, :cond_c

    iget-boolean v8, v0, Lc2/e;->q:Z

    if-eqz v8, :cond_c

    iput-boolean v11, v0, Lc2/e;->p:Z

    iput-boolean v11, v0, Lc2/e;->q:Z

    return-void

    :cond_c
    sget-boolean v8, Lz1/d;->s:Z

    if-eqz p2, :cond_f

    iget-object v8, v0, Lc2/e;->e:Ld2/l;

    if-eqz v8, :cond_f

    iget-object v13, v0, Lc2/e;->f:Ld2/n;

    if-eqz v13, :cond_f

    iget-object v15, v8, Ld2/p;->h:Ld2/f;

    iget-boolean v9, v15, Ld2/f;->j:Z

    if-eqz v9, :cond_f

    iget-object v8, v8, Ld2/p;->i:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-eqz v8, :cond_f

    iget-object v8, v13, Ld2/p;->h:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-eqz v8, :cond_f

    iget-object v8, v13, Ld2/p;->i:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-eqz v8, :cond_f

    iget v8, v15, Ld2/f;->g:I

    invoke-virtual {v1, v2, v8}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->e:Ld2/l;

    iget-object v2, v2, Ld2/p;->i:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    invoke-virtual {v1, v3, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->f:Ld2/n;

    iget-object v2, v2, Ld2/p;->h:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    invoke-virtual {v1, v4, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->f:Ld2/n;

    iget-object v2, v2, Ld2/p;->i:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    invoke-virtual {v1, v5, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->f:Ld2/n;

    iget-object v2, v2, Ld2/n;->k:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    invoke-virtual {v1, v6, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v2, :cond_e

    if-eqz v12, :cond_d

    iget-object v2, v0, Lc2/e;->g:[Z

    aget-boolean v2, v2, v11

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lc2/e;->i0()Z

    move-result v2

    if-nez v2, :cond_d

    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    iget-object v2, v2, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v1, v2}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    invoke-virtual {v1, v2, v3, v11, v14}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_d
    if-eqz v7, :cond_e

    iget-object v2, v0, Lc2/e;->g:[Z

    aget-boolean v2, v2, v10

    if-eqz v2, :cond_e

    invoke-virtual {v0}, Lc2/e;->k0()Z

    move-result v2

    if-nez v2, :cond_e

    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    iget-object v2, v2, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v2}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    invoke-virtual {v1, v2, v5, v11, v14}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_e
    iput-boolean v11, v0, Lc2/e;->p:Z

    iput-boolean v11, v0, Lc2/e;->q:Z

    return-void

    :cond_f
    iget-object v8, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v8, :cond_14

    invoke-virtual {v0, v11}, Lc2/e;->f0(I)Z

    move-result v8

    if-eqz v8, :cond_10

    iget-object v8, v0, Lc2/e;->a0:Lc2/e;

    check-cast v8, Lc2/f;

    invoke-virtual {v8, v0, v11}, Lc2/f;->w1(Lc2/e;I)V

    move v8, v10

    goto :goto_5

    :cond_10
    invoke-virtual {v0}, Lc2/e;->i0()Z

    move-result v8

    :goto_5
    invoke-virtual {v0, v10}, Lc2/e;->f0(I)Z

    move-result v9

    if-eqz v9, :cond_11

    iget-object v9, v0, Lc2/e;->a0:Lc2/e;

    check-cast v9, Lc2/f;

    invoke-virtual {v9, v0, v10}, Lc2/f;->w1(Lc2/e;I)V

    move v9, v10

    goto :goto_6

    :cond_11
    invoke-virtual {v0}, Lc2/e;->k0()Z

    move-result v9

    :goto_6
    if-nez v8, :cond_12

    if-eqz v12, :cond_12

    iget v13, v0, Lc2/e;->s0:I

    if-eq v13, v14, :cond_12

    iget-object v13, v0, Lc2/e;->O:Lc2/d;

    iget-object v13, v13, Lc2/d;->f:Lc2/d;

    if-nez v13, :cond_12

    iget-object v13, v0, Lc2/e;->Q:Lc2/d;

    iget-object v13, v13, Lc2/d;->f:Lc2/d;

    if-nez v13, :cond_12

    iget-object v13, v0, Lc2/e;->a0:Lc2/e;

    iget-object v13, v13, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v1, v13}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v13

    invoke-virtual {v1, v13, v3, v11, v10}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_12
    if-nez v9, :cond_13

    if-eqz v7, :cond_13

    iget v13, v0, Lc2/e;->s0:I

    if-eq v13, v14, :cond_13

    iget-object v13, v0, Lc2/e;->P:Lc2/d;

    iget-object v13, v13, Lc2/d;->f:Lc2/d;

    if-nez v13, :cond_13

    iget-object v13, v0, Lc2/e;->R:Lc2/d;

    iget-object v13, v13, Lc2/d;->f:Lc2/d;

    if-nez v13, :cond_13

    iget-object v13, v0, Lc2/e;->S:Lc2/d;

    if-nez v13, :cond_13

    iget-object v13, v0, Lc2/e;->a0:Lc2/e;

    iget-object v13, v13, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v13}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v13

    invoke-virtual {v1, v13, v5, v11, v10}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_13
    move/from16 v19, v8

    move/from16 v20, v9

    goto :goto_7

    :cond_14
    move/from16 v19, v11

    move/from16 v20, v19

    :goto_7
    iget v8, v0, Lc2/e;->b0:I

    iget v9, v0, Lc2/e;->m0:I

    if-ge v8, v9, :cond_15

    goto :goto_8

    :cond_15
    move v9, v8

    :goto_8
    iget v13, v0, Lc2/e;->c0:I

    iget v15, v0, Lc2/e;->n0:I

    if-ge v13, v15, :cond_16

    :goto_9
    move/from16 v21, v10

    goto :goto_a

    :cond_16
    move v15, v13

    goto :goto_9

    :goto_a
    iget-object v10, v0, Lc2/e;->Z:[Lc2/e$b;

    move/from16 v22, v11

    aget-object v11, v10, v22

    sget-object v14, Lc2/e$b;->c:Lc2/e$b;

    move-object/from16 v24, v4

    if-eq v11, v14, :cond_17

    move/from16 v4, v21

    goto :goto_b

    :cond_17
    move/from16 v4, v22

    :goto_b
    aget-object v10, v10, v21

    move-object/from16 v25, v5

    if-eq v10, v14, :cond_18

    move/from16 v5, v21

    :goto_c
    move-object/from16 v26, v6

    goto :goto_d

    :cond_18
    move/from16 v5, v22

    goto :goto_c

    :goto_d
    iget v6, v0, Lc2/e;->e0:I

    iput v6, v0, Lc2/e;->F:I

    move/from16 v27, v9

    iget v9, v0, Lc2/e;->d0:F

    iput v9, v0, Lc2/e;->G:F

    move/from16 v28, v9

    iget v9, v0, Lc2/e;->w:I

    move/from16 v29, v9

    iget v9, v0, Lc2/e;->x:I

    const/16 v30, 0x0

    cmpl-float v30, v28, v30

    move/from16 v31, v9

    if-lez v30, :cond_22

    iget v9, v0, Lc2/e;->s0:I

    move/from16 v32, v15

    const/16 v15, 0x8

    if-eq v9, v15, :cond_21

    if-ne v11, v14, :cond_19

    if-nez v29, :cond_19

    const/4 v9, 0x3

    goto :goto_e

    :cond_19
    move/from16 v9, v29

    :goto_e
    if-ne v10, v14, :cond_1a

    if-nez v31, :cond_1a

    const/4 v15, 0x3

    goto :goto_f

    :cond_1a
    move/from16 v15, v31

    :goto_f
    if-ne v11, v14, :cond_1b

    if-ne v10, v14, :cond_1b

    move-object/from16 v33, v3

    const/4 v3, 0x3

    if-ne v9, v3, :cond_1c

    if-ne v15, v3, :cond_1c

    invoke-virtual {v0, v12, v7, v4, v5}, Lc2/e;->p1(ZZZZ)V

    goto :goto_12

    :cond_1b
    move-object/from16 v33, v3

    const/4 v3, 0x3

    :cond_1c
    const/4 v4, 0x4

    if-ne v11, v14, :cond_1e

    if-ne v9, v3, :cond_1e

    move/from16 v5, v22

    iput v5, v0, Lc2/e;->F:I

    int-to-float v3, v13

    mul-float v3, v3, v28

    float-to-int v3, v3

    move/from16 v27, v3

    if-eq v10, v14, :cond_1d

    move v9, v4

    move/from16 v23, v15

    :goto_10
    const/4 v3, 0x0

    :goto_11
    const/16 v15, 0x8

    goto :goto_15

    :cond_1d
    move/from16 v23, v15

    move/from16 v3, v21

    goto :goto_11

    :cond_1e
    if-ne v10, v14, :cond_20

    if-ne v15, v3, :cond_20

    move/from16 v3, v21

    iput v3, v0, Lc2/e;->F:I

    const/4 v3, -0x1

    if-ne v6, v3, :cond_1f

    const/high16 v3, 0x3f800000    # 1.0f

    div-float v3, v3, v28

    iput v3, v0, Lc2/e;->G:F

    :cond_1f
    iget v3, v0, Lc2/e;->G:F

    int-to-float v5, v8

    mul-float/2addr v3, v5

    float-to-int v3, v3

    move/from16 v32, v3

    if-eq v11, v14, :cond_20

    move/from16 v23, v4

    goto :goto_10

    :cond_20
    :goto_12
    move/from16 v23, v15

    const/4 v3, 0x1

    goto :goto_11

    :cond_21
    :goto_13
    move-object/from16 v33, v3

    goto :goto_14

    :cond_22
    move/from16 v32, v15

    goto :goto_13

    :goto_14
    move/from16 v9, v29

    move/from16 v23, v31

    goto :goto_10

    :goto_15
    iget-object v4, v0, Lc2/e;->y:[I

    const/16 v22, 0x0

    aput v9, v4, v22

    const/16 v21, 0x1

    aput v23, v4, v21

    iput-boolean v3, v0, Lc2/e;->h:Z

    if-eqz v3, :cond_24

    iget v4, v0, Lc2/e;->F:I

    const/4 v5, -0x1

    if-eqz v4, :cond_23

    if-ne v4, v5, :cond_25

    :cond_23
    const/16 v17, 0x1

    :goto_16
    const/4 v4, 0x5

    goto :goto_17

    :cond_24
    const/4 v5, -0x1

    :cond_25
    const/16 v17, 0x0

    goto :goto_16

    :goto_17
    if-eqz v3, :cond_27

    iget v6, v0, Lc2/e;->F:I

    const/4 v8, 0x1

    if-eq v6, v8, :cond_26

    if-ne v6, v5, :cond_27

    :cond_26
    const/16 v28, 0x1

    goto :goto_18

    :cond_27
    const/16 v28, 0x0

    :goto_18
    iget-object v5, v0, Lc2/e;->Z:[Lc2/e$b;

    const/16 v22, 0x0

    aget-object v5, v5, v22

    sget-object v6, Lc2/e$b;->b:Lc2/e$b;

    if-ne v5, v6, :cond_28

    instance-of v5, v0, Lc2/f;

    if-eqz v5, :cond_28

    const/4 v5, 0x1

    goto :goto_19

    :cond_28
    const/4 v5, 0x0

    :goto_19
    if-eqz v5, :cond_29

    const/4 v13, 0x0

    goto :goto_1a

    :cond_29
    move/from16 v13, v27

    :goto_1a
    iget-object v8, v0, Lc2/e;->V:Lc2/d;

    invoke-virtual {v8}, Lc2/d;->o()Z

    move-result v8

    const/16 v21, 0x1

    xor-int/lit8 v27, v8, 0x1

    iget-object v8, v0, Lc2/e;->Y:[Z

    const/16 v22, 0x0

    aget-boolean v10, v8, v22

    aget-boolean v29, v8, v21

    iget v8, v0, Lc2/e;->t:I

    const/16 v30, 0x0

    const/4 v11, 0x2

    if-eq v8, v11, :cond_2d

    iget-boolean v8, v0, Lc2/e;->p:Z

    if-nez v8, :cond_2d

    if-eqz p2, :cond_2a

    iget-object v8, v0, Lc2/e;->e:Ld2/l;

    if-eqz v8, :cond_2a

    iget-object v4, v8, Ld2/p;->h:Ld2/f;

    iget-boolean v11, v4, Ld2/f;->j:Z

    if-eqz v11, :cond_2a

    iget-object v8, v8, Ld2/p;->i:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-nez v8, :cond_2b

    :cond_2a
    move-object/from16 v8, v33

    goto :goto_1c

    :cond_2b
    if-eqz p2, :cond_2d

    iget v4, v4, Ld2/f;->g:I

    invoke-virtual {v1, v2, v4}, Lz1/d;->f(Lz1/i;I)V

    iget-object v4, v0, Lc2/e;->e:Ld2/l;

    iget-object v4, v4, Ld2/p;->i:Ld2/f;

    iget v4, v4, Ld2/f;->g:I

    move-object/from16 v8, v33

    invoke-virtual {v1, v8, v4}, Lz1/d;->f(Lz1/i;I)V

    iget-object v4, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v4, :cond_2c

    if-eqz v12, :cond_2c

    iget-object v4, v0, Lc2/e;->g:[Z

    const/4 v5, 0x0

    aget-boolean v4, v4, v5

    if-eqz v4, :cond_2c

    invoke-virtual {v0}, Lc2/e;->i0()Z

    move-result v4

    if-nez v4, :cond_2c

    iget-object v4, v0, Lc2/e;->a0:Lc2/e;

    iget-object v4, v4, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v4

    invoke-virtual {v1, v4, v8, v5, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_2c
    move-object/from16 v43, v2

    move/from16 v36, v3

    move-object/from16 v49, v6

    move v4, v7

    move-object/from16 v33, v8

    :goto_1b
    move/from16 v22, v9

    move v3, v12

    move-object/from16 v48, v14

    move-object/from16 v45, v24

    move-object/from16 v46, v25

    move-object/from16 v47, v26

    goto/16 :goto_20

    :cond_2d
    move-object/from16 v43, v2

    move/from16 v36, v3

    move-object/from16 v49, v6

    move v4, v7

    goto :goto_1b

    :goto_1c
    iget-object v4, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v4, :cond_2e

    iget-object v4, v4, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v4

    goto :goto_1d

    :cond_2e
    move-object/from16 v4, v30

    :goto_1d
    iget-object v11, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v11, :cond_2f

    iget-object v11, v11, Lc2/e;->O:Lc2/d;

    invoke-virtual {v1, v11}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v11

    goto :goto_1e

    :cond_2f
    move-object/from16 v11, v30

    :goto_1e
    iget-object v15, v0, Lc2/e;->g:[Z

    const/16 v22, 0x0

    aget-boolean v15, v15, v22

    iget-object v1, v0, Lc2/e;->Z:[Lc2/e$b;

    move-object/from16 v33, v8

    aget-object v8, v1, v22

    move/from16 v21, v10

    const/16 v34, 0x1

    iget-object v10, v0, Lc2/e;->O:Lc2/d;

    move-object/from16 v35, v6

    move-object v6, v11

    iget-object v11, v0, Lc2/e;->Q:Lc2/d;

    move/from16 v36, v3

    move v3, v12

    iget v12, v0, Lc2/e;->f0:I

    move-object/from16 v37, v1

    iget v1, v0, Lc2/e;->m0:I

    move/from16 v38, v1

    iget-object v1, v0, Lc2/e;->H:[I

    aget v1, v1, v22

    move/from16 v39, v1

    iget v1, v0, Lc2/e;->o0:F

    move/from16 v40, v1

    aget-object v1, v37, v34

    if-ne v1, v14, :cond_30

    move/from16 v18, v34

    goto :goto_1f

    :cond_30
    move/from16 v18, v22

    :goto_1f
    iget v1, v0, Lc2/e;->z:I

    move/from16 v41, v1

    iget v1, v0, Lc2/e;->A:I

    move/from16 v42, v1

    iget v1, v0, Lc2/e;->B:F

    move-object/from16 v43, v2

    const/4 v2, 0x1

    move/from16 v16, v7

    move-object v7, v4

    move/from16 v4, v16

    move/from16 v22, v9

    move-object/from16 v48, v14

    move-object/from16 v45, v24

    move-object/from16 v46, v25

    move-object/from16 v47, v26

    move-object/from16 v49, v35

    move/from16 v14, v38

    move/from16 v16, v40

    move/from16 v24, v41

    move/from16 v25, v42

    move/from16 v26, v1

    move v9, v5

    move v5, v15

    move/from16 v15, v39

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v27}, Lc2/e;->i(Lz1/d;ZZZZLz1/i;Lz1/i;Lc2/e$b;ZLc2/d;Lc2/d;IIIIFZZZZZIIIIFZ)V

    :goto_20
    if-eqz p2, :cond_33

    iget-object v2, v0, Lc2/e;->f:Ld2/n;

    if-eqz v2, :cond_33

    iget-object v5, v2, Ld2/p;->h:Ld2/f;

    iget-boolean v6, v5, Ld2/f;->j:Z

    if-eqz v6, :cond_33

    iget-object v2, v2, Ld2/p;->i:Ld2/f;

    iget-boolean v2, v2, Ld2/f;->j:Z

    if-eqz v2, :cond_33

    iget v2, v5, Ld2/f;->g:I

    move-object/from16 v5, v45

    invoke-virtual {v1, v5, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->f:Ld2/n;

    iget-object v2, v2, Ld2/p;->i:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    move-object/from16 v6, v46

    invoke-virtual {v1, v6, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->f:Ld2/n;

    iget-object v2, v2, Ld2/n;->k:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    move-object/from16 v7, v47

    invoke-virtual {v1, v7, v2}, Lz1/d;->f(Lz1/i;I)V

    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v2, :cond_32

    if-nez v20, :cond_32

    if-eqz v4, :cond_32

    iget-object v8, v0, Lc2/e;->g:[Z

    const/16 v21, 0x1

    aget-boolean v8, v8, v21

    if-eqz v8, :cond_31

    iget-object v2, v2, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v2}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    const/4 v8, 0x0

    const/16 v15, 0x8

    invoke-virtual {v1, v2, v6, v8, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    goto :goto_21

    :cond_31
    const/4 v8, 0x0

    const/16 v15, 0x8

    goto :goto_21

    :cond_32
    const/4 v8, 0x0

    const/16 v15, 0x8

    const/16 v21, 0x1

    :goto_21
    move v10, v8

    goto :goto_22

    :cond_33
    move-object/from16 v5, v45

    move-object/from16 v6, v46

    move-object/from16 v7, v47

    const/4 v8, 0x0

    const/16 v15, 0x8

    const/16 v21, 0x1

    move/from16 v10, v21

    :goto_22
    iget v2, v0, Lc2/e;->u:I

    const/4 v11, 0x2

    if-ne v2, v11, :cond_34

    move v11, v8

    goto :goto_23

    :cond_34
    move v11, v10

    :goto_23
    if-eqz v11, :cond_3f

    iget-boolean v2, v0, Lc2/e;->q:Z

    if-nez v2, :cond_3f

    iget-object v2, v0, Lc2/e;->Z:[Lc2/e$b;

    aget-object v2, v2, v21

    move-object/from16 v9, v49

    if-ne v2, v9, :cond_35

    instance-of v2, v0, Lc2/f;

    if-eqz v2, :cond_35

    move/from16 v9, v21

    goto :goto_24

    :cond_35
    move v9, v8

    :goto_24
    if-eqz v9, :cond_36

    move v13, v8

    goto :goto_25

    :cond_36
    move/from16 v13, v32

    :goto_25
    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v2, :cond_37

    iget-object v2, v2, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v2}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    goto :goto_26

    :cond_37
    move-object/from16 v2, v30

    :goto_26
    iget-object v10, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v10, :cond_38

    iget-object v10, v10, Lc2/e;->P:Lc2/d;

    invoke-virtual {v1, v10}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v30

    :cond_38
    iget v10, v0, Lc2/e;->l0:I

    if-gtz v10, :cond_39

    iget v10, v0, Lc2/e;->s0:I

    if-ne v10, v15, :cond_3d

    :cond_39
    iget-object v10, v0, Lc2/e;->S:Lc2/d;

    iget-object v11, v10, Lc2/d;->f:Lc2/d;

    if-eqz v11, :cond_3b

    invoke-virtual {v0}, Lc2/e;->p()I

    move-result v10

    invoke-virtual {v1, v7, v5, v10, v15}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object v10, v0, Lc2/e;->S:Lc2/d;

    iget-object v10, v10, Lc2/d;->f:Lc2/d;

    invoke-virtual {v1, v10}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v10

    iget-object v11, v0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v11}, Lc2/d;->f()I

    move-result v11

    invoke-virtual {v1, v7, v10, v11, v15}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    if-eqz v4, :cond_3a

    iget-object v7, v0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v1, v7}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v7

    const/4 v10, 0x5

    invoke-virtual {v1, v2, v7, v8, v10}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_3a
    move/from16 v27, v8

    goto :goto_27

    :cond_3b
    iget v11, v0, Lc2/e;->s0:I

    if-ne v11, v15, :cond_3c

    invoke-virtual {v10}, Lc2/d;->f()I

    move-result v10

    invoke-virtual {v1, v7, v5, v10, v15}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    goto :goto_27

    :cond_3c
    invoke-virtual {v0}, Lc2/e;->p()I

    move-result v10

    invoke-virtual {v1, v7, v5, v10, v15}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    :cond_3d
    :goto_27
    iget-object v7, v0, Lc2/e;->g:[Z

    aget-boolean v7, v7, v21

    iget-object v10, v0, Lc2/e;->Z:[Lc2/e$b;

    move/from16 v44, v8

    aget-object v8, v10, v21

    move-object v11, v10

    iget-object v10, v0, Lc2/e;->P:Lc2/d;

    move-object v12, v11

    iget-object v11, v0, Lc2/e;->R:Lc2/d;

    move-object v14, v12

    iget v12, v0, Lc2/e;->g0:I

    move-object v15, v14

    iget v14, v0, Lc2/e;->n0:I

    iget-object v1, v0, Lc2/e;->H:[I

    aget v1, v1, v21

    move/from16 p2, v1

    iget v1, v0, Lc2/e;->p0:F

    aget-object v15, v15, v44

    move/from16 v16, v1

    move-object/from16 v1, v48

    if-ne v15, v1, :cond_3e

    move/from16 v18, v21

    goto :goto_28

    :cond_3e
    move/from16 v18, v44

    :goto_28
    iget v1, v0, Lc2/e;->C:I

    iget v15, v0, Lc2/e;->D:I

    move/from16 v24, v1

    iget v1, v0, Lc2/e;->E:F

    move-object/from16 v45, v5

    move v5, v7

    move-object v7, v2

    const/4 v2, 0x0

    move/from16 v17, v4

    move v4, v3

    move/from16 v3, v17

    move/from16 v17, v20

    move/from16 v20, v19

    move/from16 v19, v17

    move/from16 v17, v23

    move/from16 v23, v22

    move/from16 v22, v17

    move/from16 v26, v1

    move-object/from16 v46, v6

    move/from16 v25, v15

    move/from16 v17, v28

    move/from16 v21, v29

    move-object/from16 v6, v30

    move-object/from16 v1, p1

    move/from16 v15, p2

    invoke-virtual/range {v0 .. v27}, Lc2/e;->i(Lz1/d;ZZZZLz1/i;Lz1/i;Lc2/e$b;ZLc2/d;Lc2/d;IIIIFZZZZZIIIIFZ)V

    move-object v7, v0

    goto :goto_29

    :cond_3f
    move-object v7, v0

    move-object/from16 v45, v5

    move-object/from16 v46, v6

    :goto_29
    if-eqz v36, :cond_40

    iget v0, v7, Lc2/e;->F:I

    const/16 v6, 0x8

    const/4 v3, 0x1

    if-ne v0, v3, :cond_41

    iget v5, v7, Lc2/e;->G:F

    move-object/from16 v0, p1

    move-object/from16 v3, v33

    move-object/from16 v4, v43

    move-object/from16 v2, v45

    move-object/from16 v1, v46

    invoke-virtual/range {v0 .. v6}, Lz1/d;->k(Lz1/i;Lz1/i;Lz1/i;Lz1/i;FI)V

    :cond_40
    move-object/from16 v1, p1

    goto :goto_2a

    :cond_41
    iget v5, v7, Lc2/e;->G:F

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    move-object/from16 v2, v43

    move-object/from16 v4, v45

    move-object/from16 v3, v46

    invoke-virtual/range {v0 .. v6}, Lz1/d;->k(Lz1/i;Lz1/i;Lz1/i;Lz1/i;FI)V

    move-object v1, v0

    :goto_2a
    iget-object v0, v7, Lc2/e;->V:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->o()Z

    move-result v0

    if-eqz v0, :cond_42

    iget-object v0, v7, Lc2/e;->V:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->j()Lc2/d;

    move-result-object v0

    invoke-virtual {v0}, Lc2/d;->h()Lc2/e;

    move-result-object v0

    iget v2, v7, Lc2/e;->I:F

    const/high16 v3, 0x42b40000    # 90.0f

    add-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    double-to-float v2, v2

    iget-object v3, v7, Lc2/e;->V:Lc2/d;

    invoke-virtual {v3}, Lc2/d;->f()I

    move-result v3

    invoke-virtual {v1, v7, v0, v2, v3}, Lz1/d;->b(Lc2/e;Lc2/e;FI)V

    :cond_42
    const/4 v5, 0x0

    iput-boolean v5, v7, Lc2/e;->p:Z

    iput-boolean v5, v7, Lc2/e;->q:Z

    return-void
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->r:Z

    return v0
.end method

.method public g1(II)V
    .locals 0

    iput p1, p0, Lc2/e;->g0:I

    sub-int/2addr p2, p1

    iput p2, p0, Lc2/e;->c0:I

    iget p1, p0, Lc2/e;->n0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lc2/e;->c0:I

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 2

    iget v0, p0, Lc2/e;->s0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h0(I)Z
    .locals 1

    iget-object v0, p0, Lc2/e;->Y:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public h1(Lc2/e$b;)V
    .locals 2

    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public final i(Lz1/d;ZZZZLz1/i;Lz1/i;Lc2/e$b;ZLc2/d;Lc2/d;IIIIFZZZZZIIIIFZ)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p6

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p14

    move/from16 v2, p15

    move/from16 v4, p24

    move/from16 v5, p25

    invoke-virtual {v1, v12}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v6

    invoke-virtual {v1, v13}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v7

    invoke-virtual {v12}, Lc2/d;->j()Lc2/d;

    move-result-object v8

    invoke-virtual {v1, v8}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v15

    invoke-virtual {v13}, Lc2/d;->j()Lc2/d;

    move-result-object v8

    invoke-virtual {v1, v8}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v8

    invoke-static {}, Lz1/d;->x()Lz1/e;

    invoke-virtual {v12}, Lc2/d;->o()Z

    move-result v16

    invoke-virtual {v13}, Lc2/d;->o()Z

    move-result v17

    iget-object v9, v0, Lc2/e;->V:Lc2/d;

    invoke-virtual {v9}, Lc2/d;->o()Z

    move-result v18

    if-eqz v17, :cond_0

    add-int/lit8 v9, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v9, v16

    :goto_0
    if-eqz v18, :cond_1

    add-int/lit8 v9, v9, 0x1

    :cond_1
    if-eqz p17, :cond_2

    const/4 v11, 0x3

    :goto_1
    move-object/from16 v19, v8

    goto :goto_2

    :cond_2
    move/from16 v11, p22

    goto :goto_1

    :goto_2
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    const/4 v3, 0x1

    if-eqz v8, :cond_3

    if-eq v8, v3, :cond_3

    const/4 v3, 0x2

    if-eq v8, v3, :cond_4

    :cond_3
    const/4 v8, 0x0

    goto :goto_3

    :cond_4
    const/4 v3, 0x4

    if-eq v11, v3, :cond_3

    const/4 v8, 0x1

    :goto_3
    iget v3, v0, Lc2/e;->l:I

    const/4 v13, -0x1

    if-eq v3, v13, :cond_5

    if-eqz p2, :cond_5

    iput v13, v0, Lc2/e;->l:I

    move/from16 p13, v3

    const/4 v8, 0x0

    :cond_5
    iget v3, v0, Lc2/e;->m:I

    if-eq v3, v13, :cond_6

    if-nez p2, :cond_6

    iput v13, v0, Lc2/e;->m:I

    const/4 v8, 0x0

    goto :goto_4

    :cond_6
    move/from16 v3, p13

    :goto_4
    iget v13, v0, Lc2/e;->s0:I

    move/from16 p13, v3

    const/16 v3, 0x8

    if-ne v13, v3, :cond_7

    const/4 v8, 0x0

    const/4 v13, 0x0

    goto :goto_5

    :cond_7
    move v13, v8

    move/from16 v8, p13

    :goto_5
    if-eqz p27, :cond_a

    if-nez v16, :cond_9

    if-nez v17, :cond_9

    if-nez v18, :cond_9

    move/from16 v3, p12

    invoke-virtual {v1, v6, v3}, Lz1/d;->f(Lz1/i;I)V

    :cond_8
    move/from16 v23, v13

    const/16 v13, 0x8

    goto :goto_6

    :cond_9
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    invoke-virtual {v12}, Lc2/d;->f()I

    move-result v3

    move/from16 v23, v13

    const/16 v13, 0x8

    invoke-virtual {v1, v6, v15, v3, v13}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    goto :goto_6

    :cond_a
    move/from16 v23, v13

    move v13, v3

    :goto_6
    if-nez v23, :cond_e

    if-eqz p9, :cond_c

    const/4 v3, 0x3

    const/4 v13, 0x0

    invoke-virtual {v1, v7, v6, v13, v3}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    const/16 v13, 0x8

    if-lez v14, :cond_b

    invoke-virtual {v1, v7, v6, v14, v13}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_b
    const v3, 0x7fffffff

    if-ge v2, v3, :cond_d

    invoke-virtual {v1, v7, v6, v2, v13}, Lz1/d;->j(Lz1/i;Lz1/i;II)V

    goto :goto_7

    :cond_c
    invoke-virtual {v1, v7, v6, v8, v13}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    :cond_d
    :goto_7
    move v3, v5

    move-object v5, v7

    move v2, v9

    move-object/from16 v13, v19

    move/from16 v24, v23

    move/from16 v19, p5

    move/from16 v23, v4

    goto/16 :goto_10

    :cond_e
    const/4 v3, 0x2

    if-eq v9, v3, :cond_11

    if-nez p17, :cond_11

    const/4 v2, 0x1

    if-eq v11, v2, :cond_f

    if-nez v11, :cond_11

    :cond_f
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v5, :cond_10

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_10
    const/16 v13, 0x8

    invoke-virtual {v1, v7, v6, v2, v13}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    move/from16 v23, v4

    move v3, v5

    move-object v5, v7

    move v2, v9

    move-object/from16 v13, v19

    const/16 v24, 0x0

    move/from16 v19, p5

    goto/16 :goto_10

    :cond_11
    const/4 v2, -0x2

    if-ne v4, v2, :cond_12

    move v3, v8

    goto :goto_8

    :cond_12
    move v3, v4

    :goto_8
    if-ne v5, v2, :cond_13

    move v2, v8

    goto :goto_9

    :cond_13
    move v2, v5

    :goto_9
    if-lez v8, :cond_14

    const/4 v4, 0x1

    if-eq v11, v4, :cond_14

    const/4 v8, 0x0

    :cond_14
    const/16 v13, 0x8

    if-lez v3, :cond_15

    invoke-virtual {v1, v7, v6, v3, v13}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_15
    const/4 v4, 0x1

    if-lez v2, :cond_17

    if-eqz p3, :cond_16

    if-ne v11, v4, :cond_16

    goto :goto_a

    :cond_16
    invoke-virtual {v1, v7, v6, v2, v13}, Lz1/d;->j(Lz1/i;Lz1/i;II)V

    :goto_a
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    move-result v8

    :cond_17
    if-ne v11, v4, :cond_1a

    if-eqz p3, :cond_18

    invoke-virtual {v1, v7, v6, v8, v13}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    goto :goto_b

    :cond_18
    if-eqz p19, :cond_19

    const/4 v4, 0x5

    invoke-virtual {v1, v7, v6, v8, v4}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    invoke-virtual {v1, v7, v6, v8, v13}, Lz1/d;->j(Lz1/i;Lz1/i;II)V

    goto :goto_b

    :cond_19
    const/4 v4, 0x5

    invoke-virtual {v1, v7, v6, v8, v4}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    invoke-virtual {v1, v7, v6, v8, v13}, Lz1/d;->j(Lz1/i;Lz1/i;II)V

    :goto_b
    move-object v5, v7

    move-object/from16 v13, v19

    move/from16 v24, v23

    move/from16 v19, p5

    move/from16 v23, v3

    move v3, v2

    move v2, v9

    goto/16 :goto_10

    :cond_1a
    const/4 v4, 0x2

    if-ne v11, v4, :cond_1e

    invoke-virtual {v12}, Lc2/d;->k()Lc2/d$a;

    move-result-object v4

    sget-object v5, Lc2/d$a;->c:Lc2/d$a;

    if-eq v4, v5, :cond_1c

    invoke-virtual {v12}, Lc2/d;->k()Lc2/d$a;

    move-result-object v4

    sget-object v8, Lc2/d$a;->e:Lc2/d$a;

    if-ne v4, v8, :cond_1b

    goto :goto_d

    :cond_1b
    iget-object v4, v0, Lc2/e;->a0:Lc2/e;

    sget-object v5, Lc2/d$a;->b:Lc2/d$a;

    invoke-virtual {v4, v5}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v4

    iget-object v5, v0, Lc2/e;->a0:Lc2/e;

    sget-object v8, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {v5, v8}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v5

    invoke-virtual {v1, v5}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v5

    :goto_c
    move-object v8, v4

    goto :goto_e

    :cond_1c
    :goto_d
    iget-object v4, v0, Lc2/e;->a0:Lc2/e;

    invoke-virtual {v4, v5}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v4

    iget-object v5, v0, Lc2/e;->a0:Lc2/e;

    sget-object v8, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {v5, v8}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v5

    invoke-virtual {v1, v5}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v5

    goto :goto_c

    :goto_e
    invoke-virtual {v1}, Lz1/d;->r()Lz1/b;

    move-result-object v4

    move-object/from16 p9, v7

    move-object v7, v5

    move-object/from16 v5, p9

    move/from16 p9, v2

    move v2, v9

    move-object/from16 v13, v19

    move/from16 v9, p26

    invoke-virtual/range {v4 .. v9}, Lz1/b;->k(Lz1/i;Lz1/i;Lz1/i;Lz1/i;F)Lz1/b;

    move-result-object v4

    invoke-virtual {v1, v4}, Lz1/d;->d(Lz1/b;)V

    if-eqz p3, :cond_1d

    const/16 v23, 0x0

    :cond_1d
    move/from16 v19, p5

    move/from16 v24, v23

    :goto_f
    move/from16 v23, v3

    move/from16 v3, p9

    goto :goto_10

    :cond_1e
    move/from16 p9, v2

    move-object v5, v7

    move v2, v9

    move-object/from16 v13, v19

    move/from16 v24, v23

    const/16 v19, 0x1

    goto :goto_f

    :goto_10
    if-eqz p27, :cond_59

    if-eqz p19, :cond_1f

    move-object/from16 v11, p7

    const/4 v9, 0x2

    const/16 v15, 0x8

    const/16 v26, 0x1

    goto/16 :goto_31

    :cond_1f
    if-nez v16, :cond_21

    if-nez v17, :cond_21

    if-nez v18, :cond_21

    :cond_20
    :goto_11
    move-object v2, v13

    const/4 v4, 0x5

    goto/16 :goto_2d

    :cond_21
    if-eqz v16, :cond_23

    if-nez v17, :cond_23

    iget-object v2, v12, Lc2/d;->f:Lc2/d;

    iget-object v2, v2, Lc2/d;->d:Lc2/e;

    if-eqz p3, :cond_22

    instance-of v2, v2, Lc2/a;

    if-eqz v2, :cond_22

    const/16 v3, 0x8

    goto :goto_12

    :cond_22
    const/4 v3, 0x5

    :goto_12
    move/from16 v18, p3

    move-object v2, v13

    goto/16 :goto_2e

    :cond_23
    if-nez v16, :cond_26

    if-eqz v17, :cond_26

    invoke-virtual/range {p11 .. p11}, Lc2/d;->f()I

    move-result v2

    neg-int v2, v2

    const/16 v3, 0x8

    invoke-virtual {v1, v5, v13, v2, v3}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    if-eqz p3, :cond_20

    iget-boolean v2, v0, Lc2/e;->j:Z

    if-eqz v2, :cond_25

    iget-boolean v2, v6, Lz1/i;->g:Z

    if-eqz v2, :cond_25

    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v2, :cond_25

    check-cast v2, Lc2/f;

    if-eqz p2, :cond_24

    invoke-virtual {v2, v12}, Lc2/f;->A1(Lc2/d;)V

    goto :goto_11

    :cond_24
    invoke-virtual {v2, v12}, Lc2/f;->F1(Lc2/d;)V

    goto :goto_11

    :cond_25
    const/4 v2, 0x0

    const/4 v4, 0x5

    invoke-virtual {v1, v6, v10, v2, v4}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    move-object v2, v13

    goto/16 :goto_2d

    :cond_26
    if-eqz v16, :cond_20

    if-eqz v17, :cond_20

    iget-object v2, v12, Lc2/d;->f:Lc2/d;

    iget-object v2, v2, Lc2/d;->d:Lc2/e;

    move-object/from16 v4, p11

    iget-object v7, v4, Lc2/d;->f:Lc2/d;

    iget-object v7, v7, Lc2/d;->d:Lc2/e;

    invoke-virtual {v0}, Lc2/e;->K()Lc2/e;

    move-result-object v8

    const/16 v16, 0x6

    if-eqz v24, :cond_3b

    if-nez v11, :cond_2b

    if-nez v3, :cond_28

    if-nez v23, :cond_28

    iget-boolean v3, v15, Lz1/i;->g:Z

    if-eqz v3, :cond_27

    iget-boolean v3, v13, Lz1/i;->g:Z

    if-eqz v3, :cond_27

    invoke-virtual {v12}, Lc2/d;->f()I

    move-result v2

    const/16 v9, 0x8

    invoke-virtual {v1, v6, v15, v2, v9}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    invoke-virtual {v4}, Lc2/d;->f()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v1, v5, v13, v2, v9}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    return-void

    :cond_27
    const/16 v9, 0x8

    move v3, v9

    move/from16 v17, v3

    const/16 v18, 0x0

    const/16 v22, 0x1

    const/16 v25, 0x0

    goto :goto_13

    :cond_28
    const/16 v9, 0x8

    const/4 v3, 0x5

    const/16 v17, 0x5

    const/16 v18, 0x1

    const/16 v22, 0x0

    const/16 v25, 0x1

    :goto_13
    instance-of v9, v2, Lc2/a;

    if-nez v9, :cond_2a

    instance-of v9, v7, Lc2/a;

    if-eqz v9, :cond_29

    goto :goto_16

    :cond_29
    move-object v9, v13

    move-object v13, v6

    move-object v6, v9

    move/from16 v20, v17

    move/from16 v26, v18

    move/from16 v27, v22

    const/4 v9, 0x1

    const/16 v17, 0x5

    :goto_14
    move/from16 v22, v3

    move-object v3, v15

    move/from16 v18, v16

    :goto_15
    move-object/from16 v15, p7

    goto/16 :goto_23

    :cond_2a
    :goto_16
    move-object v9, v13

    move-object v13, v6

    move-object v6, v9

    move/from16 v26, v18

    move/from16 v27, v22

    const/4 v9, 0x1

    const/16 v17, 0x5

    const/16 v20, 0x4

    goto :goto_14

    :cond_2b
    const/4 v9, 0x2

    if-ne v11, v9, :cond_2e

    instance-of v3, v2, Lc2/a;

    if-nez v3, :cond_2d

    instance-of v3, v7, Lc2/a;

    if-eqz v3, :cond_2c

    goto :goto_1a

    :cond_2c
    move-object v3, v13

    move-object v13, v6

    move-object v6, v3

    move-object v3, v15

    move/from16 v18, v16

    const/4 v9, 0x1

    const/16 v17, 0x5

    const/16 v20, 0x5

    :goto_17
    const/16 v22, 0x5

    :goto_18
    const/16 v25, 0x1

    const/16 v26, 0x1

    :goto_19
    const/16 v27, 0x0

    goto :goto_15

    :cond_2d
    :goto_1a
    move-object v3, v13

    move-object v13, v6

    move-object v6, v3

    move-object v3, v15

    move/from16 v18, v16

    const/4 v9, 0x1

    const/16 v17, 0x5

    const/16 v20, 0x4

    goto :goto_17

    :cond_2e
    const/4 v9, 0x1

    if-ne v11, v9, :cond_2f

    move-object v3, v13

    move-object v13, v6

    move-object v6, v3

    move-object v3, v15

    move/from16 v18, v16

    const/4 v9, 0x1

    const/16 v17, 0x5

    const/16 v20, 0x4

    const/16 v22, 0x8

    goto :goto_18

    :cond_2f
    const/4 v9, 0x3

    if-ne v11, v9, :cond_3a

    iget v9, v0, Lc2/e;->F:I

    const/4 v1, -0x1

    if-ne v9, v1, :cond_32

    if-eqz p20, :cond_31

    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move-object v3, v15

    const/4 v9, 0x1

    const/16 v17, 0x5

    if-eqz p3, :cond_30

    const/16 v18, 0x5

    :goto_1b
    const/16 v20, 0x5

    const/16 v22, 0x8

    const/16 v25, 0x1

    const/16 v26, 0x1

    const/16 v27, 0x1

    goto :goto_15

    :cond_30
    const/16 v18, 0x4

    goto :goto_1b

    :cond_31
    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move-object v3, v15

    const/4 v9, 0x1

    const/16 v17, 0x5

    const/16 v18, 0x8

    goto :goto_1b

    :cond_32
    if-eqz p17, :cond_35

    move/from16 v1, p23

    const/4 v9, 0x2

    if-eq v1, v9, :cond_34

    const/4 v9, 0x1

    if-ne v1, v9, :cond_33

    goto :goto_1c

    :cond_33
    const/16 v1, 0x8

    const/4 v3, 0x5

    goto :goto_1d

    :cond_34
    const/4 v9, 0x1

    :goto_1c
    const/4 v1, 0x5

    const/4 v3, 0x4

    :goto_1d
    move-object/from16 v17, v13

    move-object v13, v6

    move-object/from16 v6, v17

    move/from16 v22, v1

    move/from16 v20, v3

    move/from16 v25, v9

    move/from16 v26, v25

    move/from16 v27, v26

    move-object v3, v15

    move/from16 v18, v16

    const/16 v17, 0x5

    :goto_1e
    move-object/from16 v1, p1

    goto/16 :goto_15

    :cond_35
    const/4 v9, 0x1

    if-lez v3, :cond_36

    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move/from16 v25, v9

    move/from16 v26, v25

    move/from16 v27, v26

    move-object v3, v15

    move/from16 v18, v16

    const/16 v17, 0x5

    const/16 v20, 0x5

    :goto_1f
    const/16 v22, 0x5

    goto/16 :goto_15

    :cond_36
    if-nez v3, :cond_39

    if-nez v23, :cond_39

    if-nez p20, :cond_37

    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move/from16 v25, v9

    move/from16 v26, v25

    move/from16 v27, v26

    move-object v3, v15

    move/from16 v18, v16

    const/16 v17, 0x5

    const/16 v20, 0x8

    goto :goto_1f

    :cond_37
    if-eq v2, v8, :cond_38

    if-eq v7, v8, :cond_38

    const/4 v1, 0x4

    goto :goto_20

    :cond_38
    const/4 v1, 0x5

    :goto_20
    move-object v3, v13

    move-object v13, v6

    move-object v6, v3

    move/from16 v22, v1

    move/from16 v25, v9

    move/from16 v26, v25

    move/from16 v27, v26

    move-object v3, v15

    move/from16 v18, v16

    const/16 v17, 0x5

    const/16 v20, 0x4

    goto :goto_1e

    :cond_39
    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move/from16 v25, v9

    move/from16 v26, v25

    move/from16 v27, v26

    move-object v3, v15

    move/from16 v18, v16

    const/16 v17, 0x5

    const/16 v20, 0x4

    goto :goto_1f

    :cond_3a
    const/4 v9, 0x1

    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move-object v3, v15

    move/from16 v18, v16

    const/16 v17, 0x5

    const/16 v20, 0x4

    const/16 v22, 0x5

    const/16 v25, 0x0

    const/16 v26, 0x0

    goto/16 :goto_19

    :cond_3b
    const/4 v9, 0x1

    iget-boolean v1, v15, Lz1/i;->g:Z

    if-eqz v1, :cond_3d

    iget-boolean v1, v13, Lz1/i;->g:Z

    if-eqz v1, :cond_3d

    invoke-virtual {v12}, Lc2/d;->f()I

    move-result v1

    invoke-virtual {v4}, Lc2/d;->f()I

    move-result v2

    const/16 v3, 0x8

    move-object/from16 p17, p1

    move/from16 p21, p16

    move/from16 p20, v1

    move/from16 p24, v2

    move/from16 p25, v3

    move-object/from16 p23, v5

    move-object/from16 p18, v6

    move-object/from16 p22, v13

    move-object/from16 p19, v15

    invoke-virtual/range {p17 .. p25}, Lz1/d;->c(Lz1/i;Lz1/i;IFLz1/i;Lz1/i;II)V

    move-object/from16 v1, p17

    move-object/from16 v6, p22

    if-eqz p3, :cond_5e

    if-eqz v19, :cond_5e

    iget-object v2, v4, Lc2/d;->f:Lc2/d;

    if-eqz v2, :cond_3c

    invoke-virtual {v4}, Lc2/d;->f()I

    move-result v13

    :goto_21
    move-object/from16 v15, p7

    goto :goto_22

    :cond_3c
    const/4 v13, 0x0

    goto :goto_21

    :goto_22
    if-eq v6, v15, :cond_5e

    const/4 v3, 0x5

    invoke-virtual {v1, v15, v5, v13, v3}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    return-void

    :cond_3d
    move-object v1, v13

    move-object v13, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move-object v3, v15

    const/16 v17, 0x5

    move-object/from16 v15, p7

    move/from16 v25, v9

    move/from16 v26, v25

    move/from16 v18, v16

    move/from16 v22, v17

    const/16 v20, 0x4

    const/16 v27, 0x0

    :goto_23
    if-eqz v25, :cond_3e

    if-ne v3, v6, :cond_3e

    if-eq v2, v8, :cond_3e

    const/16 v25, 0x0

    const/16 v28, 0x0

    goto :goto_24

    :cond_3e
    move/from16 v28, v9

    :goto_24
    if-eqz v26, :cond_40

    if-nez v24, :cond_3f

    if-nez p18, :cond_3f

    if-nez p20, :cond_3f

    if-ne v3, v10, :cond_3f

    if-ne v6, v15, :cond_3f

    move/from16 v26, v9

    const/16 v9, 0x8

    const/16 v18, 0x0

    const/16 v22, 0x8

    const/16 v28, 0x0

    goto :goto_25

    :cond_3f
    move/from16 v26, v9

    move/from16 v9, v18

    move/from16 v18, p3

    :goto_25
    invoke-virtual {v12}, Lc2/d;->f()I

    move-result v4

    move-object/from16 v29, v8

    invoke-virtual/range {p11 .. p11}, Lc2/d;->f()I

    move-result v8

    move-object v12, v13

    move-object v13, v2

    move-object v2, v12

    move-object v12, v7

    move-object/from16 v14, v29

    const/16 v15, 0x8

    move-object v7, v5

    move/from16 v5, p16

    invoke-virtual/range {v1 .. v9}, Lz1/d;->c(Lz1/i;Lz1/i;IFLz1/i;Lz1/i;II)V

    move-object v5, v6

    move-object v6, v2

    move-object v2, v5

    move-object v5, v7

    goto :goto_26

    :cond_40
    move-object v12, v13

    move-object v13, v2

    move-object v2, v6

    move-object v6, v12

    move-object v12, v7

    move-object v14, v8

    move/from16 v26, v9

    const/16 v15, 0x8

    move/from16 v18, p3

    :goto_26
    iget v4, v0, Lc2/e;->s0:I

    if-ne v4, v15, :cond_41

    invoke-virtual/range {p11 .. p11}, Lc2/d;->m()Z

    move-result v4

    if-nez v4, :cond_41

    goto/16 :goto_35

    :cond_41
    if-eqz v25, :cond_44

    if-eqz v18, :cond_43

    if-eq v3, v2, :cond_43

    if-nez v24, :cond_43

    instance-of v4, v13, Lc2/a;

    if-nez v4, :cond_42

    instance-of v4, v12, Lc2/a;

    if-eqz v4, :cond_43

    :cond_42
    move/from16 v4, v16

    goto :goto_27

    :cond_43
    move/from16 v4, v22

    :goto_27
    invoke-virtual/range {p10 .. p10}, Lc2/d;->f()I

    move-result v7

    invoke-virtual {v1, v6, v3, v7, v4}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    invoke-virtual/range {p11 .. p11}, Lc2/d;->f()I

    move-result v7

    neg-int v7, v7

    invoke-virtual {v1, v5, v2, v7, v4}, Lz1/d;->j(Lz1/i;Lz1/i;II)V

    move/from16 v22, v4

    :cond_44
    if-eqz v18, :cond_45

    if-eqz p21, :cond_45

    instance-of v4, v13, Lc2/a;

    if-nez v4, :cond_45

    instance-of v4, v12, Lc2/a;

    if-nez v4, :cond_45

    if-eq v12, v14, :cond_45

    move/from16 v4, v16

    move v7, v4

    goto :goto_28

    :cond_45
    move/from16 v4, v20

    move/from16 v7, v22

    move/from16 v26, v28

    :goto_28
    if-eqz v26, :cond_51

    if-eqz v27, :cond_4e

    if-eqz p20, :cond_46

    if-eqz p4, :cond_4e

    :cond_46
    if-eq v13, v14, :cond_48

    if-ne v12, v14, :cond_47

    goto :goto_29

    :cond_47
    move/from16 v16, v4

    :cond_48
    :goto_29
    instance-of v8, v13, Lc2/h;

    if-nez v8, :cond_49

    instance-of v8, v12, Lc2/h;

    if-eqz v8, :cond_4a

    :cond_49
    const/16 v16, 0x5

    :cond_4a
    instance-of v8, v13, Lc2/a;

    if-nez v8, :cond_4b

    instance-of v8, v12, Lc2/a;

    if-eqz v8, :cond_4c

    :cond_4b
    const/16 v16, 0x5

    :cond_4c
    if-eqz p20, :cond_4d

    const/4 v8, 0x5

    goto :goto_2a

    :cond_4d
    move/from16 v8, v16

    :goto_2a
    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_4e
    if-eqz v18, :cond_50

    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-eqz p17, :cond_50

    if-nez p20, :cond_50

    if-eq v13, v14, :cond_4f

    if-ne v12, v14, :cond_50

    :cond_4f
    const/4 v4, 0x4

    :cond_50
    invoke-virtual/range {p10 .. p10}, Lc2/d;->f()I

    move-result v7

    invoke-virtual {v1, v6, v3, v7, v4}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    invoke-virtual/range {p11 .. p11}, Lc2/d;->f()I

    move-result v7

    neg-int v7, v7

    invoke-virtual {v1, v5, v2, v7, v4}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    :cond_51
    if-eqz v18, :cond_53

    if-ne v10, v3, :cond_52

    invoke-virtual/range {p10 .. p10}, Lc2/d;->f()I

    move-result v4

    goto :goto_2b

    :cond_52
    const/4 v4, 0x0

    :goto_2b
    if-eq v3, v10, :cond_53

    const/4 v3, 0x5

    invoke-virtual {v1, v6, v10, v4, v3}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_53
    if-eqz v18, :cond_54

    if-eqz v24, :cond_54

    if-nez p14, :cond_54

    if-nez v23, :cond_54

    if-eqz v24, :cond_55

    const/4 v9, 0x3

    if-ne v11, v9, :cond_55

    const/4 v13, 0x0

    invoke-virtual {v1, v5, v6, v13, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_54
    const/4 v4, 0x5

    goto :goto_2c

    :cond_55
    const/4 v13, 0x0

    const/4 v4, 0x5

    invoke-virtual {v1, v5, v6, v13, v4}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :goto_2c
    move v3, v4

    goto :goto_2e

    :goto_2d
    move/from16 v18, p3

    goto :goto_2c

    :goto_2e
    if-eqz v18, :cond_5e

    if-eqz v19, :cond_5e

    move-object/from16 v4, p11

    iget-object v6, v4, Lc2/d;->f:Lc2/d;

    if-eqz v6, :cond_56

    invoke-virtual {v4}, Lc2/d;->f()I

    move-result v13

    :goto_2f
    move-object/from16 v11, p7

    goto :goto_30

    :cond_56
    const/4 v13, 0x0

    goto :goto_2f

    :goto_30
    if-eq v2, v11, :cond_5e

    iget-boolean v2, v0, Lc2/e;->j:Z

    if-eqz v2, :cond_58

    iget-boolean v2, v5, Lz1/i;->g:Z

    if-eqz v2, :cond_58

    iget-object v2, v0, Lc2/e;->a0:Lc2/e;

    if-eqz v2, :cond_58

    check-cast v2, Lc2/f;

    if-eqz p2, :cond_57

    invoke-virtual {v2, v4}, Lc2/f;->z1(Lc2/d;)V

    return-void

    :cond_57
    invoke-virtual {v2, v4}, Lc2/f;->E1(Lc2/d;)V

    return-void

    :cond_58
    invoke-virtual {v1, v11, v5, v13, v3}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    return-void

    :cond_59
    move-object/from16 v11, p7

    const/16 v15, 0x8

    const/16 v26, 0x1

    const/4 v9, 0x2

    :goto_31
    if-ge v2, v9, :cond_5e

    if-eqz p3, :cond_5e

    if-eqz v19, :cond_5e

    const/4 v13, 0x0

    invoke-virtual {v1, v6, v10, v13, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    if-nez p2, :cond_5b

    iget-object v2, v0, Lc2/e;->S:Lc2/d;

    iget-object v2, v2, Lc2/d;->f:Lc2/d;

    if-nez v2, :cond_5a

    goto :goto_32

    :cond_5a
    const/4 v3, 0x0

    goto :goto_33

    :cond_5b
    :goto_32
    move/from16 v3, v26

    :goto_33
    if-nez p2, :cond_5d

    iget-object v2, v0, Lc2/e;->S:Lc2/d;

    iget-object v2, v2, Lc2/d;->f:Lc2/d;

    if-eqz v2, :cond_5d

    iget-object v2, v2, Lc2/d;->d:Lc2/e;

    iget v3, v2, Lc2/e;->d0:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_5c

    iget-object v2, v2, Lc2/e;->Z:[Lc2/e$b;

    const/16 v21, 0x0

    aget-object v3, v2, v21

    sget-object v4, Lc2/e$b;->c:Lc2/e$b;

    if-ne v3, v4, :cond_5c

    aget-object v2, v2, v26

    if-ne v2, v4, :cond_5c

    move/from16 v3, v26

    goto :goto_34

    :cond_5c
    const/4 v3, 0x0

    :cond_5d
    :goto_34
    if-eqz v3, :cond_5e

    const/4 v13, 0x0

    invoke-virtual {v1, v11, v5, v13, v15}, Lz1/d;->h(Lz1/i;Lz1/i;II)V

    :cond_5e
    :goto_35
    return-void
.end method

.method public i0()Z
    .locals 2

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lc2/d;->f:Lc2/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lc2/d;->f:Lc2/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public i1(IIIF)V
    .locals 0

    iput p1, p0, Lc2/e;->x:I

    iput p2, p0, Lc2/e;->C:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lc2/e;->D:I

    iput p4, p0, Lc2/e;->E:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lc2/e;->x:I

    :cond_1
    return-void
.end method

.method public j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V
    .locals 8

    sget-object v0, Lc2/d$a;->g:Lc2/d$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_c

    if-ne p3, v0, :cond_8

    sget-object p1, Lc2/d$a;->b:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    sget-object p4, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {p0, p4}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v2

    sget-object v3, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {p0, v3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    sget-object v5, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {p0, v5}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v6

    const/4 v7, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lc2/d;->o()Z

    move-result p3

    if-nez p3, :cond_1

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lc2/d;->o()Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, p1, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    invoke-virtual {p0, p4, p2, p4, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    move p1, v7

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lc2/d;->o()Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lc2/d;->o()Z

    move-result p3

    if-eqz p3, :cond_5

    :cond_4
    move v7, v1

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v3, p2, v3, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    invoke-virtual {p0, v5, p2, v5, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    :goto_1
    if-eqz p1, :cond_6

    if-eqz v7, :cond_6

    invoke-virtual {p0, v0}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, v0}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_6
    if-eqz p1, :cond_7

    sget-object p1, Lc2/d$a;->h:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p2, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_7
    if-eqz v7, :cond_1c

    sget-object p1, Lc2/d$a;->i:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p2, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_8
    sget-object p1, Lc2/d$a;->b:Lc2/d$a;

    if-eq p3, p1, :cond_b

    sget-object p4, Lc2/d$a;->d:Lc2/d$a;

    if-ne p3, p4, :cond_9

    goto :goto_2

    :cond_9
    sget-object p1, Lc2/d$a;->c:Lc2/d$a;

    if-eq p3, p1, :cond_a

    sget-object p4, Lc2/d$a;->e:Lc2/d$a;

    if-ne p3, p4, :cond_1c

    :cond_a
    invoke-virtual {p0, p1, p2, p3, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    sget-object p1, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {p0, p1, p2, p3, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    invoke-virtual {p0, v0}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_b
    :goto_2
    invoke-virtual {p0, p1, p2, p3, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    sget-object p1, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {p0, p1, p2, p3, v1}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    invoke-virtual {p0, v0}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_c
    sget-object v2, Lc2/d$a;->h:Lc2/d$a;

    if-ne p1, v2, :cond_e

    sget-object v3, Lc2/d$a;->b:Lc2/d$a;

    if-eq p3, v3, :cond_d

    sget-object v4, Lc2/d$a;->d:Lc2/d$a;

    if-ne p3, v4, :cond_e

    :cond_d
    invoke-virtual {p0, v3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    sget-object p3, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {p0, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    invoke-virtual {p3, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    invoke-virtual {p0, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_e
    sget-object v3, Lc2/d$a;->i:Lc2/d$a;

    if-ne p1, v3, :cond_10

    sget-object v4, Lc2/d$a;->c:Lc2/d$a;

    if-eq p3, v4, :cond_f

    sget-object v5, Lc2/d$a;->e:Lc2/d$a;

    if-ne p3, v5, :cond_10

    :cond_f
    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p0, v4}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    sget-object p2, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {p0, p2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    invoke-virtual {p0, v3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_10
    if-ne p1, v2, :cond_11

    if-ne p3, v2, :cond_11

    sget-object p1, Lc2/d$a;->b:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    sget-object p1, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    invoke-virtual {p0, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_11
    if-ne p1, v3, :cond_12

    if-ne p3, v3, :cond_12

    sget-object p1, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    sget-object p1, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lc2/d;->a(Lc2/d;I)Z

    invoke-virtual {p0, v3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Lc2/d;->a(Lc2/d;I)Z

    return-void

    :cond_12
    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v1

    invoke-virtual {p2, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {v1, p2}, Lc2/d;->p(Lc2/d;)Z

    move-result p3

    if-eqz p3, :cond_1c

    sget-object p3, Lc2/d$a;->f:Lc2/d$a;

    if-ne p1, p3, :cond_14

    sget-object p1, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    sget-object p3, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {p0, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lc2/d;->q()V

    :cond_13
    if-eqz p3, :cond_1b

    invoke-virtual {p3}, Lc2/d;->q()V

    goto :goto_4

    :cond_14
    sget-object v4, Lc2/d$a;->c:Lc2/d$a;

    if-eq p1, v4, :cond_18

    sget-object v4, Lc2/d$a;->e:Lc2/d$a;

    if-ne p1, v4, :cond_15

    goto :goto_3

    :cond_15
    sget-object p3, Lc2/d$a;->b:Lc2/d$a;

    if-eq p1, p3, :cond_16

    sget-object p3, Lc2/d$a;->d:Lc2/d$a;

    if-ne p1, p3, :cond_1b

    :cond_16
    invoke-virtual {p0, v0}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p3}, Lc2/d;->j()Lc2/d;

    move-result-object v0

    if-eq v0, p2, :cond_17

    invoke-virtual {p3}, Lc2/d;->q()V

    :cond_17
    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p1}, Lc2/d;->g()Lc2/d;

    move-result-object p1

    invoke-virtual {p0, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p3}, Lc2/d;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lc2/d;->q()V

    invoke-virtual {p3}, Lc2/d;->q()V

    goto :goto_4

    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    if-eqz p3, :cond_19

    invoke-virtual {p3}, Lc2/d;->q()V

    :cond_19
    invoke-virtual {p0, v0}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p3}, Lc2/d;->j()Lc2/d;

    move-result-object v0

    if-eq v0, p2, :cond_1a

    invoke-virtual {p3}, Lc2/d;->q()V

    :cond_1a
    invoke-virtual {p0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p1}, Lc2/d;->g()Lc2/d;

    move-result-object p1

    invoke-virtual {p0, v3}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    invoke-virtual {p3}, Lc2/d;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lc2/d;->q()V

    invoke-virtual {p3}, Lc2/d;->q()V

    :cond_1b
    :goto_4
    invoke-virtual {v1, p2, p4}, Lc2/d;->a(Lc2/d;I)Z

    :cond_1c
    return-void
.end method

.method public j0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->K:Z

    return v0
.end method

.method public j1(F)V
    .locals 2

    iget-object v0, p0, Lc2/e;->D0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public k(Lc2/d;Lc2/d;I)V
    .locals 1

    invoke-virtual {p1}, Lc2/d;->h()Lc2/e;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p1}, Lc2/d;->k()Lc2/d$a;

    move-result-object p1

    invoke-virtual {p2}, Lc2/d;->h()Lc2/e;

    move-result-object v0

    invoke-virtual {p2}, Lc2/d;->k()Lc2/d$a;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2, p3}, Lc2/e;->j(Lc2/d$a;Lc2/e;Lc2/d$a;I)V

    :cond_0
    return-void
.end method

.method public k0()Z
    .locals 2

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lc2/d;->f:Lc2/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    iget-object v1, v0, Lc2/d;->f:Lc2/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lc2/d;->f:Lc2/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public k1(I)V
    .locals 0

    iput p1, p0, Lc2/e;->s0:I

    return-void
.end method

.method public l(Lc2/e;FI)V
    .locals 6

    sget-object v1, Lc2/d$a;->g:Lc2/d$a;

    const/4 v5, 0x0

    move-object v3, v1

    move-object v0, p0

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    iput p2, v0, Lc2/e;->I:F

    return-void
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->L:Z

    return v0
.end method

.method public l1(I)V
    .locals 1

    iput p1, p0, Lc2/e;->b0:I

    iget v0, p0, Lc2/e;->m0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lc2/e;->b0:I

    :cond_0
    return-void
.end method

.method public m(Lz1/d;)V
    .locals 1

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {p1, v0}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {p1, v0}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p1, v0}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {p1, v0}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    iget v0, p0, Lc2/e;->l0:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {p1, v0}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    :cond_0
    return-void
.end method

.method public m0()Z
    .locals 2

    iget-boolean v0, p0, Lc2/e;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lc2/e;->s0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m1(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    iput p1, p0, Lc2/e;->v:I

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lc2/e;->e:Ld2/l;

    if-nez v0, :cond_0

    new-instance v0, Ld2/l;

    invoke-direct {v0, p0}, Ld2/l;-><init>(Lc2/e;)V

    iput-object v0, p0, Lc2/e;->e:Ld2/l;

    :cond_0
    iget-object v0, p0, Lc2/e;->f:Ld2/n;

    if-nez v0, :cond_1

    new-instance v0, Ld2/n;

    invoke-direct {v0, p0}, Ld2/n;-><init>(Lc2/e;)V

    iput-object v0, p0, Lc2/e;->f:Ld2/n;

    :cond_1
    return-void
.end method

.method public n0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->p:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public n1(I)V
    .locals 0

    iput p1, p0, Lc2/e;->f0:I

    return-void
.end method

.method public o(Lc2/d$a;)Lc2/d;
    .locals 2

    sget-object v0, Lc2/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lc2/e;->U:Lc2/d;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Lc2/e;->T:Lc2/d;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Lc2/e;->V:Lc2/d;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Lc2/e;->S:Lc2/d;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    return-object p1

    :pswitch_8
    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->q:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public o1(I)V
    .locals 0

    iput p1, p0, Lc2/e;->g0:I

    return-void
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lc2/e;->l0:I

    return v0
.end method

.method public p0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/e;->s:Z

    return v0
.end method

.method public p1(ZZZZ)V
    .locals 3

    iget p1, p0, Lc2/e;->F:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    iput v0, p0, Lc2/e;->F:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    iput v1, p0, Lc2/e;->F:I

    iget p1, p0, Lc2/e;->e0:I

    if-ne p1, v2, :cond_1

    iget p1, p0, Lc2/e;->G:F

    div-float p1, p2, p1

    iput p1, p0, Lc2/e;->G:F

    :cond_1
    :goto_0
    iget p1, p0, Lc2/e;->F:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput v1, p0, Lc2/e;->F:I

    goto :goto_1

    :cond_3
    iget p1, p0, Lc2/e;->F:I

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iput v0, p0, Lc2/e;->F:I

    :cond_5
    :goto_1
    iget p1, p0, Lc2/e;->F:I

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    iput v0, p0, Lc2/e;->F:I

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p1}, Lc2/d;->o()Z

    move-result p1

    if-eqz p1, :cond_8

    iget p1, p0, Lc2/e;->G:F

    div-float p1, p2, p1

    iput p1, p0, Lc2/e;->G:F

    iput v1, p0, Lc2/e;->F:I

    :cond_8
    :goto_2
    iget p1, p0, Lc2/e;->F:I

    if-ne p1, v2, :cond_a

    iget p1, p0, Lc2/e;->z:I

    if-lez p1, :cond_9

    iget p3, p0, Lc2/e;->C:I

    if-nez p3, :cond_9

    iput v0, p0, Lc2/e;->F:I

    return-void

    :cond_9
    if-nez p1, :cond_a

    iget p1, p0, Lc2/e;->C:I

    if-lez p1, :cond_a

    iget p1, p0, Lc2/e;->G:F

    div-float/2addr p2, p1

    iput p2, p0, Lc2/e;->G:F

    iput v1, p0, Lc2/e;->F:I

    :cond_a
    return-void
.end method

.method public q(I)F
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Lc2/e;->o0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lc2/e;->p0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method public q0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc2/e;->r:Z

    return-void
.end method

.method public q1(ZZ)V
    .locals 7

    iget-object v0, p0, Lc2/e;->e:Ld2/l;

    invoke-virtual {v0}, Ld2/p;->k()Z

    move-result v0

    and-int/2addr p1, v0

    iget-object v0, p0, Lc2/e;->f:Ld2/n;

    invoke-virtual {v0}, Ld2/p;->k()Z

    move-result v0

    and-int/2addr p2, v0

    iget-object v0, p0, Lc2/e;->e:Ld2/l;

    iget-object v1, v0, Ld2/p;->h:Ld2/f;

    iget v1, v1, Ld2/f;->g:I

    iget-object v2, p0, Lc2/e;->f:Ld2/n;

    iget-object v3, v2, Ld2/p;->h:Ld2/f;

    iget v3, v3, Ld2/f;->g:I

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    iget v0, v0, Ld2/f;->g:I

    iget-object v2, v2, Ld2/p;->i:Ld2/f;

    iget v2, v2, Ld2/f;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    iput v1, p0, Lc2/e;->f0:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Lc2/e;->g0:I

    :cond_3
    iget v1, p0, Lc2/e;->s0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    iput v6, p0, Lc2/e;->b0:I

    iput v6, p0, Lc2/e;->c0:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, Lc2/e;->Z:[Lc2/e$b;

    aget-object p1, p1, v6

    sget-object v1, Lc2/e$b;->a:Lc2/e$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Lc2/e;->b0:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Lc2/e;->b0:I

    iget p1, p0, Lc2/e;->m0:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Lc2/e;->b0:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Lc2/e$b;->a:Lc2/e$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Lc2/e;->c0:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, Lc2/e;->c0:I

    iget p1, p0, Lc2/e;->n0:I

    if-ge v2, p1, :cond_8

    iput p1, p0, Lc2/e;->c0:I

    :cond_8
    return-void
.end method

.method public r()I
    .locals 2

    invoke-virtual {p0}, Lc2/e;->Y()I

    move-result v0

    iget v1, p0, Lc2/e;->c0:I

    add-int/2addr v0, v1

    return v0
.end method

.method public r0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc2/e;->s:Z

    return-void
.end method

.method public r1(Lz1/d;Z)V
    .locals 6

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {p1, v0}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {p1, v1}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p1, v2}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {p1, v3}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result p1

    if-eqz p2, :cond_0

    iget-object v3, p0, Lc2/e;->e:Ld2/l;

    if-eqz v3, :cond_0

    iget-object v4, v3, Ld2/p;->h:Ld2/f;

    iget-boolean v5, v4, Ld2/f;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Ld2/p;->i:Ld2/f;

    iget-boolean v5, v3, Ld2/f;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, Ld2/f;->g:I

    iget v2, v3, Ld2/f;->g:I

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lc2/e;->f:Ld2/n;

    if-eqz p2, :cond_1

    iget-object v3, p2, Ld2/p;->h:Ld2/f;

    iget-boolean v4, v3, Ld2/f;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, Ld2/p;->i:Ld2/f;

    iget-boolean v4, p2, Ld2/f;->j:Z

    if-eqz v4, :cond_1

    iget v1, v3, Ld2/f;->g:I

    iget p1, p2, Ld2/f;->g:I

    :cond_1
    sub-int p2, v2, v0

    sub-int v3, p1, v1

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq v0, p2, :cond_2

    const v3, 0x7fffffff

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-eq v2, v3, :cond_2

    if-eq p1, p2, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    const/4 v0, 0x0

    move p1, v0

    move v1, p1

    move v2, v1

    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Lc2/e;->K0(IIII)V

    return-void
.end method

.method public s()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc2/e;->q0:Ljava/lang/Object;

    return-object v0
.end method

.method public s0()Z
    .locals 4

    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v3, Lc2/e$b;->c:Lc2/e$b;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    aget-object v0, v0, v2

    if-ne v0, v3, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc2/e;->u0:Ljava/lang/String;

    return-object v0
.end method

.method public t0()V
    .locals 6

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->T:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->U:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    iget-object v0, p0, Lc2/e;->V:Lc2/d;

    invoke-virtual {v0}, Lc2/d;->q()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc2/e;->a0:Lc2/e;

    const/high16 v1, 0x7fc00000    # Float.NaN

    iput v1, p0, Lc2/e;->I:F

    const/4 v1, 0x0

    iput v1, p0, Lc2/e;->b0:I

    iput v1, p0, Lc2/e;->c0:I

    const/4 v2, 0x0

    iput v2, p0, Lc2/e;->d0:F

    const/4 v2, -0x1

    iput v2, p0, Lc2/e;->e0:I

    iput v1, p0, Lc2/e;->f0:I

    iput v1, p0, Lc2/e;->g0:I

    iput v1, p0, Lc2/e;->j0:I

    iput v1, p0, Lc2/e;->k0:I

    iput v1, p0, Lc2/e;->l0:I

    iput v1, p0, Lc2/e;->m0:I

    iput v1, p0, Lc2/e;->n0:I

    sget v3, Lc2/e;->K0:F

    iput v3, p0, Lc2/e;->o0:F

    iput v3, p0, Lc2/e;->p0:F

    iget-object v3, p0, Lc2/e;->Z:[Lc2/e$b;

    sget-object v4, Lc2/e$b;->a:Lc2/e$b;

    aput-object v4, v3, v1

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, Lc2/e;->q0:Ljava/lang/Object;

    iput v1, p0, Lc2/e;->r0:I

    iput v1, p0, Lc2/e;->s0:I

    iput-object v0, p0, Lc2/e;->v0:Ljava/lang/String;

    iput-boolean v1, p0, Lc2/e;->w0:Z

    iput-boolean v1, p0, Lc2/e;->x0:Z

    iput v1, p0, Lc2/e;->z0:I

    iput v1, p0, Lc2/e;->A0:I

    iput-boolean v1, p0, Lc2/e;->B0:Z

    iput-boolean v1, p0, Lc2/e;->C0:Z

    iget-object v0, p0, Lc2/e;->D0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v1

    aput v3, v0, v5

    iput v2, p0, Lc2/e;->t:I

    iput v2, p0, Lc2/e;->u:I

    iget-object v0, p0, Lc2/e;->H:[I

    const v3, 0x7fffffff

    aput v3, v0, v1

    aput v3, v0, v5

    iput v1, p0, Lc2/e;->w:I

    iput v1, p0, Lc2/e;->x:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lc2/e;->B:F

    iput v0, p0, Lc2/e;->E:F

    iput v3, p0, Lc2/e;->A:I

    iput v3, p0, Lc2/e;->D:I

    iput v1, p0, Lc2/e;->z:I

    iput v1, p0, Lc2/e;->C:I

    iput-boolean v1, p0, Lc2/e;->h:Z

    iput v2, p0, Lc2/e;->F:I

    iput v0, p0, Lc2/e;->G:F

    iput-boolean v1, p0, Lc2/e;->y0:Z

    iget-object v0, p0, Lc2/e;->g:[Z

    aput-boolean v5, v0, v1

    aput-boolean v5, v0, v5

    iput-boolean v1, p0, Lc2/e;->L:Z

    iget-object v0, p0, Lc2/e;->Y:[Z

    aput-boolean v1, v0, v1

    aput-boolean v1, v0, v5

    iput-boolean v5, p0, Lc2/e;->i:Z

    iget-object v0, p0, Lc2/e;->y:[I

    aput v1, v0, v1

    aput v1, v0, v5

    iput v2, p0, Lc2/e;->l:I

    iput v2, p0, Lc2/e;->m:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lc2/e;->v0:Ljava/lang/String;

    const-string v2, ""

    const-string v3, " "

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lc2/e;->v0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc2/e;->u0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc2/e;->u0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc2/e;->f0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc2/e;->g0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc2/e;->b0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc2/e;->c0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(I)Lc2/e$b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc2/e;->A()Lc2/e$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lc2/e;->T()Lc2/e$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public u0()V
    .locals 3

    invoke-virtual {p0}, Lc2/e;->K()Lc2/e;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v0, v0, Lc2/f;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc2/e;->K()Lc2/e;

    move-result-object v0

    check-cast v0, Lc2/f;

    invoke-virtual {v0}, Lc2/f;->N1()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lc2/e;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lc2/e;->X:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/d;

    invoke-virtual {v2}, Lc2/d;->q()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lc2/e;->d0:F

    return v0
.end method

.method public v0()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc2/e;->p:Z

    iput-boolean v0, p0, Lc2/e;->q:Z

    iput-boolean v0, p0, Lc2/e;->r:Z

    iput-boolean v0, p0, Lc2/e;->s:Z

    iget-object v1, p0, Lc2/e;->X:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lc2/e;->X:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/d;

    invoke-virtual {v2}, Lc2/d;->r()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w()I
    .locals 1

    iget v0, p0, Lc2/e;->e0:I

    return v0
.end method

.method public w0(Lz1/c;)V
    .locals 1

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->S:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->V:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->T:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    iget-object v0, p0, Lc2/e;->U:Lc2/d;

    invoke-virtual {v0, p1}, Lc2/d;->s(Lz1/c;)V

    return-void
.end method

.method public x()I
    .locals 2

    iget v0, p0, Lc2/e;->s0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lc2/e;->c0:I

    return v0
.end method

.method public final x0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    cmpl-float p4, p3, p4

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :   "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public y()F
    .locals 1

    iget v0, p0, Lc2/e;->o0:F

    return v0
.end method

.method public final y0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V
    .locals 0

    if-ne p3, p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :   "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public z()I
    .locals 1

    iget v0, p0, Lc2/e;->z0:I

    return v0
.end method

.method public final z0(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :   "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
