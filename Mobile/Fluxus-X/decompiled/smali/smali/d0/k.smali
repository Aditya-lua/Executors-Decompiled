.class public Ld0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    invoke-static {v0}, Lc0/e;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    invoke-direct {p0, v0}, Ld0/k;-><init>(Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;)V

    return-void
.end method

.method public constructor <init>(Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ld0/k;->a:Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;)Landroid/util/Size;
    .locals 4

    iget-object v0, p0, Ld0/k;->a:Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ln0/w3$d;->a:Ln0/w3$d;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;->g(Ln0/w3$d;)Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int/2addr v2, v3

    if-le v1, v2, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
