.class public final Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;,
        Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 \t2\u00020\u0001:\u0002\n\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;",
        "",
        "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;",
        "meta",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;",
        "()Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;",
        "b",
        "Meta",
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

.annotation runtime Lum/i;
    generateAdapter = true
.end annotation


# static fields
.field public static final b:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "meta"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;->a:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;->a:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;

    return-object v0
.end method
