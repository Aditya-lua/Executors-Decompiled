.class public Ld0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Ln0/k3;Ln0/k3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/TextureViewIsClosedQuirk;

    invoke-virtual {p2, v0}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p2

    iput-boolean p2, p0, Ld0/i;->a:Z

    const-class p2, Landroidx/camera/camera2/internal/compat/quirk/PreviewOrientationIncorrectQuirk;

    invoke-virtual {p1, p2}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p2

    iput-boolean p2, p0, Ld0/i;->b:Z

    const-class p2, Landroidx/camera/camera2/internal/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    invoke-virtual {p1, p2}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, Ld0/i;->c:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ld0/i;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u1;

    invoke-virtual {v0}, Ln0/u1;->d()V

    goto :goto_0

    :cond_0
    const-string p1, "ForceCloseDeferrableSurface"

    const-string v0, "deferrableSurface closed"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ld0/i;->a:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ld0/i;->b:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ld0/i;->c:Z

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
