.class public final Lku/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0007\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0004\u0010\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lku/y0;",
        "b",
        "()Lku/y0;",
        "",
        "a",
        "Z",
        "defaultMainDelayOptIn",
        "Lku/y0;",
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

.field public static final b:Lku/y0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lqu/f0;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lku/v0;->a:Z

    invoke-static {}, Lku/v0;->b()Lku/y0;

    move-result-object v0

    sput-object v0, Lku/v0;->b:Lku/y0;

    return-void
.end method

.method public static final a()Lku/y0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lku/v0;->b:Lku/y0;

    return-object v0
.end method

.method public static final b()Lku/y0;
    .locals 2

    sget-boolean v0, Lku/v0;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lku/u0;->i:Lku/u0;

    return-object v0

    :cond_0
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v0

    invoke-static {v0}, Lqu/u;->c(Lku/n2;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lku/y0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Lku/y0;

    return-object v0

    :cond_2
    :goto_0
    sget-object v0, Lku/u0;->i:Lku/u0;

    return-object v0
.end method
