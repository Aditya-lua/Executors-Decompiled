.class public final Ln0/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4;
.implements Ln0/i2;
.implements Ls0/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i4<",
        "Lg0/f1;",
        ">;",
        "Ln0/i2;",
        "Ls0/i;"
    }
.end annotation


# static fields
.field public static final Q:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final R:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final S:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/k1;",
            ">;"
        }
    .end annotation
.end field

.field public static final T:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final U:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final V:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final W:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lg0/m1;",
            ">;"
        }
    .end annotation
.end field

.field public static final X:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final Y:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final Z:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final a0:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lg0/f1$j;",
            ">;"
        }
    .end annotation
.end field

.field public static final b0:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "La1/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final c0:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final P:Ln0/c3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "camerax.core.imageCapture.captureMode"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->Q:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.flashMode"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->R:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.captureBundle"

    const-class v2, Ln0/k1;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->S:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.bufferFormat"

    const-class v2, Ljava/lang/Integer;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->T:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.outputFormat"

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->U:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.maxCaptureStages"

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->V:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.imageReaderProxyProvider"

    const-class v2, Lg0/m1;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->W:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.useSoftwareJpegEncoder"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->X:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.flashType"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->Y:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.jpegCompressionQuality"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->Z:Ln0/n1$a;

    const-string v0, "camerax.core.imageCapture.screenFlash"

    const-class v1, Lg0/f1$j;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->a0:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.postviewResolutionSelector"

    const-class v1, La1/c;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->b0:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.isPostviewEnabled"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/g2;->c0:Ln0/n1$a;

    return-void
.end method

.method public constructor <init>(Ln0/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/g2;->P:Ln0/c3;

    return-void
.end method


# virtual methods
.method public h0(Ln0/k1;)Ln0/k1;
    .locals 1

    sget-object v0, Ln0/g2;->S:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/k1;

    return-object p1
.end method

.method public i0()I
    .locals 1

    sget-object v0, Ln0/g2;->Q:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public j0(I)I
    .locals 1

    sget-object v0, Ln0/g2;->R:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public k0(I)I
    .locals 1

    sget-object v0, Ln0/g2;->Y:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public l0()Lg0/m1;
    .locals 2

    sget-object v0, Ln0/g2;->W:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/m1;

    return-object v0
.end method

.method public m0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Ls0/i;->L:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Ln0/g2;->P:Ln0/c3;

    return-object v0
.end method

.method public n0()I
    .locals 1

    sget-object v0, Ln0/g2;->Z:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public o0()Lg0/f1$j;
    .locals 2

    sget-object v0, Ln0/g2;->a0:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/f1$j;

    return-object v0
.end method

.method public p()I
    .locals 1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public p0()Z
    .locals 1

    sget-object v0, Ln0/g2;->Q:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    return v0
.end method
