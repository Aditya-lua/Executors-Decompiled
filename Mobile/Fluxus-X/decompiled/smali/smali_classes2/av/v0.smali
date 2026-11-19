.class public final Lav/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0007\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0004\u0010\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lav/y0;",
        "b",
        "()Lav/y0;",
        "",
        "a",
        "Z",
        "defaultMainDelayOptIn",
        "Lav/y0;",
        "getDefaultDelay$annotations",
        "()V",
        "DefaultDelay",
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
.field public static final a:Z

.field public static final b:Lav/y0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgv/f0;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lav/v0;->a:Z

    invoke-static {}, Lav/v0;->b()Lav/y0;

    move-result-object v0

    sput-object v0, Lav/v0;->b:Lav/y0;

    return-void
.end method

.method public static final a()Lav/y0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lav/v0;->b:Lav/y0;

    return-object v0
.end method

.method public static final b()Lav/y0;
    .locals 2

    sget-boolean v0, Lav/v0;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lav/u0;->i:Lav/u0;

    return-object v0

    :cond_0
    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object v0

    invoke-static {v0}, Lgv/u;->c(Lav/n2;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lav/y0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Lav/y0;

    return-object v0

    :cond_2
    :goto_0
    sget-object v0, Lav/u0;->i:Lav/u0;

    return-object v0
.end method
