.class public final Lvo/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvo/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\r\u0012\t\u0012\u00070\n\u00a2\u0006\u0002\u0008\u000b0\u0006H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lvo/a0$a;",
        "",
        "<init>",
        "()V",
        "Lxo/z;",
        "governmentIdCameraScreenViewFactory",
        "",
        "Lnn/b0;",
        "b",
        "(Lxo/z;)Ljava/util/Set;",
        "Lhn/h$e;",
        "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;",
        "a",
        "()Ljava/util/Set;",
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
    invoke-direct {p0}, Lvo/a0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;->Lo:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;->a()Lhn/h$e;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lxo/z;)Ljava/util/Set;
    .locals 3
    .param p1    # Lxo/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/z;",
            ")",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "governmentIdCameraScreenViewFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xb

    new-array v0, v0, [Lnn/b0;

    sget-object v1, Lvo/w;->f:Lvo/w$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    sget-object p1, Lhp/q;->c:Lhp/q$a;

    const/4 v1, 0x2

    aput-object p1, v0, v1

    sget-object p1, Lvo/o0;->d:Lvo/o0$a;

    const/4 v1, 0x3

    aput-object p1, v0, v1

    sget-object p1, Lrn/c;->f:Lrn/c$b;

    const/4 v1, 0x4

    aput-object p1, v0, v1

    sget-object p1, Lkr/p;->c:Lkr/p$a;

    const/4 v1, 0x5

    aput-object p1, v0, v1

    sget-object p1, Lwo/c0;->c:Lwo/c0$a;

    const/4 v1, 0x6

    aput-object p1, v0, v1

    sget-object p1, Lgp/e;->d:Lgp/e$a;

    const/4 v1, 0x7

    aput-object p1, v0, v1

    sget-object p1, Lgp/j;->c:Lgp/j$a;

    const/16 v1, 0x8

    aput-object p1, v0, v1

    sget-object p1, Lgp/p;->c:Lgp/p$a;

    const/16 v1, 0x9

    aput-object p1, v0, v1

    sget-object p1, Lgp/k;->c:Lgp/k$a;

    const/16 v1, 0xa

    aput-object p1, v0, v1

    invoke-static {v0}, Lkotlin/collections/q0;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
