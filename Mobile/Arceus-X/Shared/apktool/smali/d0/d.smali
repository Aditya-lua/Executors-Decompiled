.class public Ld0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    invoke-static {v0}, Lc0/e;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    iput-object v0, p0, Ld0/d;->a:Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    return-void
.end method


# virtual methods
.method public a()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Ld0/d;->a:Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;->g()Landroid/util/Size;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
