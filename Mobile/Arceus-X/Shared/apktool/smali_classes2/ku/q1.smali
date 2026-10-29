.class public final Lku/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0006*\u001e\u0008\u0002\u0010\u000c\u001a\u0004\u0008\u0000\u0010\n\"\u0008\u0012\u0004\u0012\u00028\u00000\u000b2\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u00a8\u0006\r"
    }
    d2 = {
        "",
        "timeMillis",
        "c",
        "(J)J",
        "Lqu/e0;",
        "a",
        "Lqu/e0;",
        "DISPOSED_TASK",
        "b",
        "CLOSED_EMPTY",
        "T",
        "Lqu/r;",
        "Queue",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lqu/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lqu/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqu/e0;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, Lqu/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lku/q1;->a:Lqu/e0;

    new-instance v0, Lqu/e0;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, Lqu/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lku/q1;->b:Lqu/e0;

    return-void
.end method

.method public static final synthetic a()Lqu/e0;
    .locals 1

    sget-object v0, Lku/q1;->b:Lqu/e0;

    return-object v0
.end method

.method public static final synthetic b()Lqu/e0;
    .locals 1

    sget-object v0, Lku/q1;->a:Lqu/e0;

    return-object v0
.end method

.method public static final c(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    return-wide v0

    :cond_0
    const-wide v0, 0x8637bd05af6L

    cmp-long v0, p0, v0

    if-ltz v0, :cond_1

    const-wide p0, 0x7fffffffffffffffL

    return-wide p0

    :cond_1
    const-wide/32 v0, 0xf4240

    mul-long/2addr p0, v0

    return-wide p0
.end method
