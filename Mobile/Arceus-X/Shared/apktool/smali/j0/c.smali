.class public final enum Lj0/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj0/c$a;,
        Lj0/c$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u001f\u0008\u0002\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u001d\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lj0/c;",
        "",
        "Ljava/lang/Class;",
        "surfaceClass",
        "",
        "defaultImageFormat",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/Class;I)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "Ljava/lang/Class;",
        "b",
        "()Ljava/lang/Class;",
        "I",
        "getDefaultImageFormat",
        "()I",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
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


# static fields
.field public static final c:Lj0/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum d:Lj0/c;

.field public static final enum e:Lj0/c;

.field public static final enum f:Lj0/c;

.field public static final enum g:Lj0/c;

.field public static final enum h:Lj0/c;

.field public static final synthetic i:[Lj0/c;

.field public static final synthetic j:Lqt/a;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lj0/c;

    const-string v1, "PREVIEW"

    const/4 v2, 0x0

    const-class v3, Landroid/view/SurfaceHolder;

    const/16 v4, 0x22

    invoke-direct {v0, v1, v2, v3, v4}, Lj0/c;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v0, Lj0/c;->d:Lj0/c;

    new-instance v0, Lj0/c;

    const/16 v1, 0x100

    const-string v2, "IMAGE_CAPTURE"

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-direct {v0, v2, v3, v5, v1}, Lj0/c;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v0, Lj0/c;->e:Lj0/c;

    new-instance v0, Lj0/c;

    const/4 v1, 0x2

    const-class v2, Landroid/media/MediaCodec;

    const-string v3, "VIDEO_CAPTURE"

    invoke-direct {v0, v3, v1, v2, v4}, Lj0/c;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v0, Lj0/c;->f:Lj0/c;

    new-instance v0, Lj0/c;

    const/4 v1, 0x3

    const-class v2, Landroid/graphics/SurfaceTexture;

    const-string v3, "STREAM_SHARING"

    invoke-direct {v0, v3, v1, v2, v4}, Lj0/c;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v0, Lj0/c;->g:Lj0/c;

    new-instance v0, Lj0/c;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v5, v4}, Lj0/c;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v0, Lj0/c;->h:Lj0/c;

    invoke-static {}, Lj0/c;->a()[Lj0/c;

    move-result-object v0

    sput-object v0, Lj0/c;->i:[Lj0/c;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lj0/c;->j:Lqt/a;

    new-instance v0, Lj0/c$a;

    invoke-direct {v0, v5}, Lj0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj0/c;->c:Lj0/c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lj0/c;->a:Ljava/lang/Class;

    iput p4, p0, Lj0/c;->b:I

    return-void
.end method

.method public static final synthetic a()[Lj0/c;
    .locals 5

    sget-object v0, Lj0/c;->d:Lj0/c;

    sget-object v1, Lj0/c;->e:Lj0/c;

    sget-object v2, Lj0/c;->f:Lj0/c;

    sget-object v3, Lj0/c;->g:Lj0/c;

    sget-object v4, Lj0/c;->h:Lj0/c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lj0/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj0/c;
    .locals 1

    const-class v0, Lj0/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj0/c;

    return-object p0
.end method

.method public static values()[Lj0/c;
    .locals 1

    sget-object v0, Lj0/c;->i:[Lj0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj0/c;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lj0/c;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lj0/c$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const-string v0, "Undefined"

    return-object v0

    :cond_0
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_1
    const-string v0, "StreamSharing"

    return-object v0

    :cond_2
    const-string v0, "VideoCapture"

    return-object v0

    :cond_3
    const-string v0, "ImageCapture"

    return-object v0

    :cond_4
    const-string v0, "Preview"

    return-object v0
.end method
