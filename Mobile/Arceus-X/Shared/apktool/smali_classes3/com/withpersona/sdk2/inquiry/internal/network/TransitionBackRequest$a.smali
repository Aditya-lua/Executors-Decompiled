.class public final Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;",
        "",
        "<init>",
        "()V",
        "",
        "fromStep",
        "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;",
        "a",
        "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fromStep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;

    invoke-direct {v1, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;)V

    return-object v0
.end method
