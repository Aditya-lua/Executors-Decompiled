.class public Lv0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    invoke-static {v0}, Lu0/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    iput-object v0, p0, Lv0/a;->a:Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lv0/a;->a:Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->g()I

    move-result v0

    return v0
.end method
