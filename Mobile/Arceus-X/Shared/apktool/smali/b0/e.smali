.class public final Lb0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb0/e$a;
    }
.end annotation


# instance fields
.field public final a:Lb0/e$a;


# direct methods
.method public constructor <init>(Lb0/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/e;->a:Lb0/e$a;

    return-void
.end method

.method public static a(La0/c0;)Lb0/e;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Lb0/d;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    invoke-virtual {p0, v0}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ly/f;->a(Ljava/lang/Object;)Landroid/hardware/camera2/params/DynamicRangeProfiles;

    move-result-object p0

    invoke-static {p0}, Lb0/e;->e(Landroid/hardware/camera2/params/DynamicRangeProfiles;)Lb0/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lb0/g;->a:Lb0/e;

    :cond_1
    return-object p0
.end method

.method public static e(Landroid/hardware/camera2/params/DynamicRangeProfiles;)Lb0/e;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    new-instance v0, Lb0/e;

    new-instance v1, Lb0/f;

    invoke-direct {v1, p0}, Lb0/f;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lb0/e;-><init>(Lb0/e$a;)V

    return-object v0
.end method


# virtual methods
.method public b(Lg0/k0;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            ")",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->a:Lb0/e$a;

    invoke-interface {v0, p1}, Lb0/e$a;->d(Lg0/k0;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->a:Lb0/e$a;

    invoke-interface {v0}, Lb0/e$a;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/hardware/camera2/params/DynamicRangeProfiles;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lb0/e;->a:Lb0/e$a;

    invoke-interface {v0}, Lb0/e$a;->a()Landroid/hardware/camera2/params/DynamicRangeProfiles;

    move-result-object v0

    return-object v0
.end method
