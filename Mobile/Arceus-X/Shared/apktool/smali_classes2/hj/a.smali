.class public final Lhj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "",
        "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;",
        "a",
        "(Ljava/lang/String;)Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;",
        "",
        "Lcom/roblox/client/purchase/model/ProviderPayload;",
        "b",
        "([J)Lcom/roblox/client/purchase/model/ProviderPayload;",
        "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;",
        "EMPTY_PURCHASE_VERIFICATION_RESPONSE",
        "NativeShell_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;-><init>(Lcom/roblox/client/purchase/model/ProviderPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhj/a;->a:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-class v0, Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    invoke-static {p0, v0}, Lgk/n;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    if-nez v0, :cond_0

    sget-object p0, Lhj/a;->a:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;
    :try_end_0
    .catch Lkg/u; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_0
    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse response "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lhj/a;->a:Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    return-object p0
.end method

.method public static final b([J)Lcom/roblox/client/purchase/model/ProviderPayload;
    .locals 1
    .param p0    # [J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/client/purchase/model/ProviderPayload;

    invoke-static {p0}, Lkotlin/collections/m;->i0([J)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/roblox/client/purchase/model/ProviderPayload;-><init>(Ljava/util/List;)V

    return-object v0
.end method
