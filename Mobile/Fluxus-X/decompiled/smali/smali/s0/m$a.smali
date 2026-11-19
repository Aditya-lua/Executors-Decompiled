.class public final Ls0/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001Ji\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "s0/m$a",
        "Ls0/m;",
        "",
        "cameraMode",
        "Ln0/o0;",
        "cameraInfoInternal",
        "",
        "Lg0/w2;",
        "newUseCases",
        "attachedUseCases",
        "Ln0/h0;",
        "cameraConfig",
        "sessionType",
        "Landroid/util/Range;",
        "targetFrameRate",
        "",
        "isFeatureComboInvocation",
        "findMaxSupportedFrameRate",
        "Ls0/l;",
        "a",
        "(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;",
        "camera-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ln0/o0;",
            "Ljava/util/List<",
            "+",
            "Lg0/w2;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lg0/w2;",
            ">;",
            "Ln0/h0;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;ZZ)",
            "Ls0/l;"
        }
    .end annotation

    const-string p1, "cameraInfoInternal"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newUseCases"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "attachedUseCases"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cameraConfig"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "targetFrameRate"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ls0/l;

    const/4 p2, 0x0

    const/4 p3, 0x3

    const/4 p4, 0x0

    invoke-direct {p1, p4, p2, p3, p4}, Ls0/l;-><init>(Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
