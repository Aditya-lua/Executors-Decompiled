.class public final Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/FirebaseCommonKtxRegistrar;->getComponents()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmf/g;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/FirebaseCommonKtxRegistrar$d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;

    invoke-direct {v0}, Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;-><init>()V

    sput-object v0, Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;->a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmf/d;)Lku/l0;
    .locals 2

    const-class v0, Lkf/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v0

    invoke-interface {p1, v0}, Lmf/d;->f(Lmf/e0;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lku/v1;->b(Ljava/util/concurrent/Executor;)Lku/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic create(Lmf/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;->a(Lmf/d;)Lku/l0;

    move-result-object p1

    return-object p1
.end method
