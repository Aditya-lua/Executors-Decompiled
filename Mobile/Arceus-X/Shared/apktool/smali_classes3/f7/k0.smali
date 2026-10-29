.class public Lf7/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public f:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf7/k0;->a:I

    iput p2, p0, Lf7/k0;->b:I

    iput-object p3, p0, Lf7/k0;->c:Ljava/lang/String;

    iput-object p4, p0, Lf7/k0;->d:Ljava/lang/String;

    iput-object p5, p0, Lf7/k0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(F)Lf7/k0;
    .locals 6

    new-instance v0, Lf7/k0;

    iget v1, p0, Lf7/k0;->a:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    iget v2, p0, Lf7/k0;->b:I

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    iget-object v3, p0, Lf7/k0;->c:Ljava/lang/String;

    iget-object v4, p0, Lf7/k0;->d:Ljava/lang/String;

    iget-object v5, p0, Lf7/k0;->e:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lf7/k0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lf7/k0;->f:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    iget v1, v0, Lf7/k0;->a:I

    iget v2, v0, Lf7/k0;->b:I

    const/4 v3, 0x1

    invoke-static {p1, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf7/k0;->g(Landroid/graphics/Bitmap;)V

    :cond_0
    return-object v0
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lf7/k0;->f:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/k0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lf7/k0;->b:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/k0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lf7/k0;->a:I

    return v0
.end method

.method public g(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lf7/k0;->f:Landroid/graphics/Bitmap;

    return-void
.end method
