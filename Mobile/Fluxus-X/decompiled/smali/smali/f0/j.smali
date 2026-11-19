.class public final Lf0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\"\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lg0/g0;",
        "Lf0/i;",
        "a",
        "(Lg0/g0;)Lf0/i;",
        "Ln0/n1$a;",
        "Ln0/n1$a;",
        "getOPTION_CAPTURE_REQUEST_CONFIGURATOR",
        "()Ln0/n1$a;",
        "OPTION_CAPTURE_REQUEST_CONFIGURATOR",
        "camera-camera2_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lf0/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.appConfig.captureRequestConfigurator"

    const-class v1, Lf0/i;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lf0/j;->a:Ln0/n1$a;

    return-void
.end method

.method public static final a(Lg0/g0;)Lf0/i;
    .locals 2
    .param p0    # Lg0/g0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/g0;->n()Ln0/n1;

    move-result-object p0

    sget-object v0, Lf0/j;->a:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf0/i;

    return-object p0
.end method
