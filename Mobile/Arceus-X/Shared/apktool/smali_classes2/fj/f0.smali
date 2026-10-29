.class public final Lfj/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj/f0$a;,
        Lfj/f0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lfj/f0;",
        "",
        "<init>",
        "()V",
        "Lv7/k;",
        "purchase",
        "",
        "orderId",
        "productId",
        "",
        "isInAppPurchase",
        "Lfj/f0$b;",
        "timeoutCallback",
        "",
        "a",
        "(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;)V",
        "b",
        "NativeShell_googleProdRelease"
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
.field public static final a:Lfj/f0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfj/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfj/f0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfj/f0;->a:Lfj/f0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;)V
    .locals 9
    .param p1    # Lv7/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lfj/f0$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "purchase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfj/b;->i(Lv7/k;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lgk/t;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "VngGooglePlayStore"

    goto :goto_0

    :cond_0
    const-string v1, "GooglePlayStore"

    :goto_0
    invoke-static {}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->builder()Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2, v0}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setCheckoutSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setPaymentProviderType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lv7/k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setPackageName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setOrderId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lv7/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setToken(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    move-result-object v7

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    new-instance v1, Lfj/f0$c;

    const/4 v8, 0x0

    move-object v6, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v8}, Lfj/f0$c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;Lv7/k;Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v1

    move-object v1, v0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method
