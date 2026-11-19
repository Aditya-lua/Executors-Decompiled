.class public final Lmq/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmq/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lmq/n0$a;",
        "",
        "<init>",
        "()V",
        "Lmq/p;",
        "oldSelfieCameraScreenViewFactory",
        "Lnq/p0;",
        "selfieCameraScreenViewFactory",
        "",
        "Lnn/b0;",
        "a",
        "(Lmq/p;Lnq/p0;)Ljava/util/Set;",
        "selfie_release"
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
.field public static final synthetic a:Lmq/n0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmq/n0$a;

    invoke-direct {v0}, Lmq/n0$a;-><init>()V

    sput-object v0, Lmq/n0$a;->a:Lmq/n0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmq/p;Lnq/p0;)Ljava/util/Set;
    .locals 3
    .param p1    # Lmq/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnq/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/p;",
            "Lnq/p0;",
            ")",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "oldSelfieCameraScreenViewFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfieCameraScreenViewFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    new-array v0, v0, [Lnn/b0;

    sget-object v1, Lmq/l0;->d:Lmq/l0$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 p1, 0x2

    aput-object p2, v0, p1

    sget-object p1, Luq/f;->c:Luq/f$a;

    const/4 p2, 0x3

    aput-object p1, v0, p2

    sget-object p1, Lmq/q0;->c:Lmq/q0$a;

    const/4 p2, 0x4

    aput-object p1, v0, p2

    sget-object p1, Lmq/v0;->f:Lmq/v0$a;

    const/4 p2, 0x5

    aput-object p1, v0, p2

    invoke-static {v0}, Lkotlin/collections/q0;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
