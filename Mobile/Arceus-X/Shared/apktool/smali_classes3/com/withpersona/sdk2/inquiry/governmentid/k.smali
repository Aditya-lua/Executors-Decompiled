.class public final Lcom/withpersona/sdk2/inquiry/governmentid/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/k;",
        "",
        "a",
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


# static fields
.field public static final a:Lcom/withpersona/sdk2/inquiry/governmentid/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/k;->a:Lcom/withpersona/sdk2/inquiry/governmentid/k$a;

    return-void
.end method

.method public static final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/k;->a:Lcom/withpersona/sdk2/inquiry/governmentid/k$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/k$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Lko/z;)Ljava/util/Set;
    .locals 1
    .param p0    # Lko/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko/z;",
            ")",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/k;->a:Lcom/withpersona/sdk2/inquiry/governmentid/k$a;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/k$a;->b(Lko/z;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
