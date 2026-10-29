.class public final Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElementsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "displayMetrics",
        "Landroid/util/DisplayMetrics;",
        "kotlin.jvm.PlatformType",
        "pxToDp",
        "",
        "getPxToDp",
        "(D)D",
        "network-inquiry_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final displayMetrics:Landroid/util/DisplayMetrics;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElementsKt;->displayMetrics:Landroid/util/DisplayMetrics;

    return-void
.end method

.method public static final synthetic access$getPxToDp(D)D
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElementsKt;->getPxToDp(D)D

    move-result-wide p0

    return-wide p0
.end method

.method private static final getPxToDp(D)D
    .locals 2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElementsKt;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    float-to-double v0, v0

    div-double/2addr p0, v0

    return-wide p0
.end method
