.class public final Lk6/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\"\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0003\"\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0003\"\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0003\"\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0008*\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0013\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lk6/l$c;",
        "",
        "a",
        "Lk6/l$c;",
        "bitmapFactoryMaxParallelismKey",
        "Lm6/o;",
        "b",
        "bitmapFactoryExifOrientationStrategyKey",
        "",
        "c",
        "imageDecoderEnabledKey",
        "",
        "d",
        "memoryCacheMaxSizePercentWhileInBackgroundKey",
        "Lk6/w$a;",
        "(Lk6/w$a;)I",
        "bitmapFactoryMaxParallelism",
        "(Lk6/w$a;)Lm6/o;",
        "bitmapFactoryExifOrientationStrategy",
        "(Lk6/w$a;)Z",
        "imageDecoderEnabled",
        "(Lk6/w$a;)D",
        "memoryCacheMaxSizePercentWhileInBackground",
        "coil-core_release"
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
.field public static final a:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Lm6/o;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk6/l$c;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lk6/u;->a:Lk6/l$c;

    new-instance v0, Lk6/l$c;

    sget-object v1, Lm6/o;->c:Lm6/o;

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lk6/u;->b:Lk6/l$c;

    new-instance v0, Lk6/l$c;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lk6/u;->c:Lk6/l$c;

    new-instance v0, Lk6/l$c;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lk6/u;->d:Lk6/l$c;

    return-void
.end method

.method public static final a(Lk6/w$a;)Lm6/o;
    .locals 1
    .param p0    # Lk6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lk6/w$a;->c()Lx6/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lx6/g$b;->f()Lk6/l;

    move-result-object p0

    sget-object v0, Lk6/u;->b:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->c(Lk6/l;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm6/o;

    return-object p0
.end method

.method public static final b(Lk6/w$a;)I
    .locals 1
    .param p0    # Lk6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lk6/w$a;->c()Lx6/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lx6/g$b;->f()Lk6/l;

    move-result-object p0

    sget-object v0, Lk6/u;->a:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->c(Lk6/l;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final c(Lk6/w$a;)Z
    .locals 1
    .param p0    # Lk6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lk6/w$a;->c()Lx6/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lx6/g$b;->f()Lk6/l;

    move-result-object p0

    sget-object v0, Lk6/u;->c:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->c(Lk6/l;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lk6/w$a;)D
    .locals 2
    .param p0    # Lk6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lk6/w$a;->c()Lx6/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lx6/g$b;->f()Lk6/l;

    move-result-object p0

    sget-object v0, Lk6/u;->d:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->c(Lk6/l;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method
