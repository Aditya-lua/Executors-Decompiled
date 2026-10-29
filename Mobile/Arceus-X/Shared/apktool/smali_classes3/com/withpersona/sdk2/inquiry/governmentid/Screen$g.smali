.class public final Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/governmentid/Screen;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        "Lwq/l;",
        "transition",
        "<init>",
        "(Lwq/l;)V",
        "a",
        "Lwq/l;",
        "()Lwq/l;",
        "government-id_release"
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
.field public final a:Lwq/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;-><init>(Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lwq/l;)V
    .locals 1
    .param p1    # Lwq/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "transition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;->a:Lwq/l;

    return-void
.end method

.method public synthetic constructor <init>(Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lwq/l;->c:Lwq/l;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;-><init>(Lwq/l;)V

    return-void
.end method


# virtual methods
.method public a()Lwq/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;->a:Lwq/l;

    return-object v0
.end method

.method public b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)Z
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen;->b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)Z

    move-result p1

    return p1
.end method
