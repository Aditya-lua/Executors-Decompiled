.class public Ld0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;La0/c0;)I
    .locals 1

    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    invoke-static {v0}, Lc0/e;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;->g()I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, p2}, Lc0/a;->a(Ljava/lang/String;La0/c0;)Ln0/k3;

    move-result-object p1

    const-class p2, Landroidx/camera/camera2/internal/compat/quirk/AspectRatioLegacyApi21Quirk;

    invoke-virtual {p1, p2}, Ln0/k3;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    check-cast p1, Landroidx/camera/camera2/internal/compat/quirk/AspectRatioLegacyApi21Quirk;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/quirk/AspectRatioLegacyApi21Quirk;->g()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x3

    return p1
.end method
