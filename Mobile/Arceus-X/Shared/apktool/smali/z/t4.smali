.class public Lz/t4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/t4$b;,
        Lz/t4$c;
    }
.end annotation


# instance fields
.field public a:Ln0/u1;

.field public b:Ln0/o3;

.field public final c:Lz/t4$b;

.field public final d:Landroid/util/Size;

.field public final e:Ld0/w;

.field public final f:Lz/t4$c;

.field public g:Ln0/o3$c;


# direct methods
.method public constructor <init>(La0/c0;Lz/q3;Lz/t4$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld0/w;

    invoke-direct {v0}, Ld0/w;-><init>()V

    iput-object v0, p0, Lz/t4;->e:Ld0/w;

    const/4 v0, 0x0

    iput-object v0, p0, Lz/t4;->g:Ln0/o3$c;

    new-instance v0, Lz/t4$b;

    invoke-direct {v0}, Lz/t4$b;-><init>()V

    iput-object v0, p0, Lz/t4;->c:Lz/t4$b;

    iput-object p3, p0, Lz/t4;->f:Lz/t4$c;

    invoke-virtual {p0, p1, p2}, Lz/t4;->g(La0/c0;Lz/q3;)Landroid/util/Size;

    move-result-object p1

    iput-object p1, p0, Lz/t4;->d:Landroid/util/Size;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "MeteringSession SurfaceTexture size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MeteringRepeating"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/t4;->d()Ln0/o3;

    move-result-object p1

    iput-object p1, p0, Lz/t4;->b:Ln0/o3;

    return-void
.end method

.method public static synthetic a(Lz/t4;Ln0/o3;Ln0/o3$g;)V
    .locals 0

    invoke-virtual {p0}, Lz/t4;->d()Ln0/o3;

    move-result-object p1

    iput-object p1, p0, Lz/t4;->b:Ln0/o3;

    iget-object p0, p0, Lz/t4;->f:Lz/t4$c;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lz/t4$c;->a()V

    :cond_0
    return-void
.end method

.method public static synthetic b(Landroid/util/Size;Landroid/util/Size;)I
    .locals 4

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long v2, p0

    mul-long/2addr v0, v2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p0

    int-to-long v2, p0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long p0, p0

    mul-long/2addr v2, p0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result p0

    return p0
.end method


# virtual methods
.method public c()V
    .locals 2

    const-string v0, "MeteringRepeating"

    const-string v1, "MeteringRepeating clear!"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/t4;->a:Ln0/u1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/u1;->d()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lz/t4;->a:Ln0/u1;

    return-void
.end method

.method public d()Ln0/o3;
    .locals 5

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iget-object v1, p0, Lz/t4;->d:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    iget-object v2, p0, Lz/t4;->d:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, Lz/t4;->c:Lz/t4$b;

    iget-object v3, p0, Lz/t4;->d:Landroid/util/Size;

    invoke-static {v2, v3}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ln0/o3$b;->B(I)Ln0/o3$b;

    new-instance v3, Ln0/k2;

    invoke-direct {v3, v1}, Ln0/k2;-><init>(Landroid/view/Surface;)V

    iput-object v3, p0, Lz/t4;->a:Ln0/u1;

    invoke-virtual {v3}, Ln0/u1;->k()Lne/x;

    move-result-object v3

    new-instance v4, Lz/t4$a;

    invoke-direct {v4, p0, v1, v0}, Lz/t4$a;-><init>(Lz/t4;Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v3, v4, v0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lz/t4;->a:Ln0/u1;

    invoke-virtual {v2, v0}, Ln0/o3$b;->l(Ln0/u1;)Ln0/o3$b;

    iget-object v0, p0, Lz/t4;->g:Ln0/o3$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    :cond_0
    new-instance v0, Ln0/o3$c;

    new-instance v1, Lz/r4;

    invoke-direct {v1, p0}, Lz/r4;-><init>(Lz/t4;)V

    invoke-direct {v0, v1}, Ln0/o3$c;-><init>(Ln0/o3$d;)V

    iput-object v0, p0, Lz/t4;->g:Ln0/o3$c;

    invoke-virtual {v2, v0}, Ln0/o3$b;->u(Ln0/o3$d;)Ln0/o3$b;

    invoke-virtual {v2}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lz/t4;->d:Landroid/util/Size;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "MeteringRepeating"

    return-object v0
.end method

.method public final g(La0/c0;Lz/q3;)Landroid/util/Size;
    .locals 11

    invoke-virtual {p1}, La0/c0;->e()La0/u0;

    move-result-object p1

    const/16 v0, 0x22

    invoke-virtual {p1, v0}, La0/u0;->g(I)[Landroid/util/Size;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "MeteringRepeating"

    const-string p2, "Can not get output size list."

    invoke-static {p1, p2}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, v0, v0}, Landroid/util/Size;-><init>(II)V

    return-object p1

    :cond_0
    iget-object v1, p0, Lz/t4;->e:Ld0/w;

    invoke-virtual {v1, p1}, Ld0/w;->a([Landroid/util/Size;)[Landroid/util/Size;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lz/s4;

    invoke-direct {v2}, Lz/s4;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p2}, Lz/q3;->f()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    int-to-long v4, p2

    mul-long/2addr v2, v4

    const-wide/32 v4, 0x4b000

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    array-length p2, p1

    const/4 v4, 0x0

    move v5, v0

    :goto_0
    if-ge v5, p2, :cond_3

    aget-object v6, p1, v5

    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v7

    int-to-long v7, v7

    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v9

    int-to-long v9, v9

    mul-long/2addr v7, v9

    cmp-long v7, v7, v2

    if-nez v7, :cond_1

    return-object v6

    :cond_1
    if-lez v7, :cond_2

    if-eqz v4, :cond_3

    return-object v4

    :cond_2
    add-int/lit8 v5, v5, 0x1

    move-object v4, v6

    goto :goto_0

    :cond_3
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method public h()Ln0/o3;
    .locals 1

    iget-object v0, p0, Lz/t4;->b:Ln0/o3;

    return-object v0
.end method

.method public i()Ln0/i4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lz/t4;->c:Lz/t4$b;

    return-object v0
.end method
