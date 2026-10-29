.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;",
        "",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;",
        "params",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
        "fallbackModeApiController",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;",
        "offlineModeApiController",
        "Ldp/a;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)Ldp/a;",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;

    return-void
.end method


# virtual methods
.method public final a(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)Ldp/a;
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fallbackModeApiController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offlineModeApiController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$b;->a()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;->a(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p2, v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c$a;

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method
