.class public Ls1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ln0/h3;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/h3;",
            ")",
            "Ljava/util/List<",
            "Ln0/g3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-class v1, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    invoke-static {}, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;->j()Z

    move-result v2

    invoke-virtual {p0, v1, v2}, Ln0/h3;->a(Ljava/lang/Class;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    invoke-direct {v1}, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const-class v1, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    invoke-static {}, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;->g()Z

    move-result v2

    invoke-virtual {p0, v1, v2}, Ln0/h3;->a(Ljava/lang/Class;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    invoke-direct {p0}, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method
