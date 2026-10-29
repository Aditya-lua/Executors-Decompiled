.class public final enum Landroidx/camera/core/ImageProcessingUtil$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ImageProcessingUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/ImageProcessingUtil$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Landroidx/camera/core/ImageProcessingUtil$c;

.field public static final enum b:Landroidx/camera/core/ImageProcessingUtil$c;

.field public static final enum c:Landroidx/camera/core/ImageProcessingUtil$c;

.field public static final synthetic d:[Landroidx/camera/core/ImageProcessingUtil$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/ImageProcessingUtil$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/ImageProcessingUtil$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->a:Landroidx/camera/core/ImageProcessingUtil$c;

    new-instance v0, Landroidx/camera/core/ImageProcessingUtil$c;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/ImageProcessingUtil$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->b:Landroidx/camera/core/ImageProcessingUtil$c;

    new-instance v0, Landroidx/camera/core/ImageProcessingUtil$c;

    const-string v1, "ERROR_CONVERSION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/ImageProcessingUtil$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    invoke-static {}, Landroidx/camera/core/ImageProcessingUtil$c;->a()[Landroidx/camera/core/ImageProcessingUtil$c;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->d:[Landroidx/camera/core/ImageProcessingUtil$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Landroidx/camera/core/ImageProcessingUtil$c;
    .locals 3

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->a:Landroidx/camera/core/ImageProcessingUtil$c;

    sget-object v1, Landroidx/camera/core/ImageProcessingUtil$c;->b:Landroidx/camera/core/ImageProcessingUtil$c;

    sget-object v2, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    filled-new-array {v0, v1, v2}, [Landroidx/camera/core/ImageProcessingUtil$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/ImageProcessingUtil$c;
    .locals 1

    const-class v0, Landroidx/camera/core/ImageProcessingUtil$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/ImageProcessingUtil$c;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/ImageProcessingUtil$c;
    .locals 1

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->d:[Landroidx/camera/core/ImageProcessingUtil$c;

    invoke-virtual {v0}, [Landroidx/camera/core/ImageProcessingUtil$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/ImageProcessingUtil$c;

    return-object v0
.end method
