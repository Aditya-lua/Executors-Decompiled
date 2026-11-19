.class public Lv0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

.field public final b:Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    invoke-static {v0}, Lu0/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    iput-object v0, p0, Lv0/e;->a:Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    const-class v0, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    invoke-static {v0}, Lu0/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    iput-object v0, p0, Lv0/e;->b:Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lv0/e;->a:Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->k(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lv0/e;->b:Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;->i(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
