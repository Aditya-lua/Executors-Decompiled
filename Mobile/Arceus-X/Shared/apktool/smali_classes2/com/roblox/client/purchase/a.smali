.class public Lcom/roblox/client/purchase/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/purchase/a$f;,
        Lcom/roblox/client/purchase/a$d;,
        Lcom/roblox/client/purchase/a$e;
    }
.end annotation


# instance fields
.field public a:Lei/f;

.field public b:Lvi/g;


# direct methods
.method public constructor <init>(Lei/f;)V
    .locals 0
    .param p1    # Lei/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/purchase/a;->a:Lei/f;

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/client/purchase/a;)Lvi/g;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;->builder()Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;->setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;->setCurrencyCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;->setPaymentSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;

    move-result-object p1

    invoke-static {}, Lgk/t;->k()Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, "VngGooglePlayStore"

    goto :goto_0

    :cond_0
    const-string p3, "GooglePlayStore"

    :goto_0
    invoke-virtual {p1, p3}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;->setPaymentMethod(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;->setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;

    move-result-object p1

    iget-object p3, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p3}, Lvi/g;->A()V

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchaseV2(Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;)Ljava/util/HashMap;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "parsing response payload: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "rbx.purchaseflow"

    invoke-static {p4, p3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p3, "response_code"

    invoke-static {p1, p3}, Lgk/r;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p3

    const-string p5, "user_id"

    invoke-static {p1, p5}, Lgk/r;->b(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p5

    const-string v0, "checkout_session_id"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz p3, :cond_1

    if-eqz p5, :cond_1

    new-instance p1, Lhj/b;

    invoke-direct {p1, p5, v0, v1}, Lhj/b;-><init>(Ljava/lang/Long;Ljava/lang/String;Lcom/roblox/client/purchase/a$d;)V

    move-object v1, p1

    goto :goto_1

    :cond_1
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "parsing response payload failed: "

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p4, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->z()V

    :goto_1
    invoke-virtual {p0, p3, v1}, Lcom/roblox/client/purchase/a;->f(Ljava/lang/Integer;Lhj/b;)Lcom/roblox/client/purchase/a$e;

    move-result-object p1

    if-eqz p6, :cond_2

    const-string p3, "PaymentsProtocolV2: OnValidationCheckFinished start."

    invoke-static {p4, p3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p6, p1, p2, v1}, Lcom/roblox/client/purchase/a$f;->a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lhj/b;)V

    :cond_2
    return-void

    :cond_3
    if-eqz p4, :cond_4

    new-instance p5, Lgi/b;

    invoke-direct {p5, p2, p3, p4}, Lgi/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    new-instance p5, Lgi/b;

    invoke-direct {p5, p2, p3}, Lgi/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    new-instance p3, Lcom/roblox/client/purchase/a$a;

    invoke-direct {p3, p0, p6, p2}, Lcom/roblox/client/purchase/a$a;-><init>(Lcom/roblox/client/purchase/a;Lcom/roblox/client/purchase/a$f;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/roblox/client/purchase/a;->a:Lei/f;

    invoke-interface {p2, p1, p5, v1, p3}, Lei/f;->b(Ljava/lang/String;Lgi/a;[Lei/c$a;Lei/l;)Lei/e;

    move-result-object p1

    invoke-virtual {p1}, Lei/a;->b()V

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->A()V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/purchase/a$f;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/roblox/client/purchase/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V
    .locals 9

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Get balance."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/purchase/a$b;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/roblox/client/purchase/a$b;-><init>(Lcom/roblox/client/purchase/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V

    iget-object p1, v2, Lcom/roblox/client/purchase/a;->a:Lei/f;

    invoke-virtual {v0, v1, p1}, Lvi/h;->m(Lvi/h$d;Lei/f;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/purchase/a$f;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/roblox/client/purchase/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V

    return-void
.end method

.method public final f(Ljava/lang/Integer;Lhj/b;)Lcom/roblox/client/purchase/a$e;
    .locals 2

    const-string v0, "rbx.purchaseflow"

    if-nez p1, :cond_0

    const-string p1, "Validation unknown error: responseCode is null"

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->J()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0xc8

    if-eq p1, v1, :cond_8

    const/16 p2, 0x1ad

    if-eq p1, p2, :cond_7

    const/16 p2, 0x1f4

    if-eq p1, p2, :cond_6

    const/16 p2, 0x1f7

    if-eq p1, p2, :cond_5

    const/16 p2, 0x190

    if-eq p1, p2, :cond_4

    const/16 p2, 0x191

    if-eq p1, p2, :cond_3

    const/16 p2, 0x193

    if-eq p1, p2, :cond_2

    const/16 p2, 0x194

    if-eq p1, p2, :cond_1

    const-string p1, "Validation unknown error"

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->J()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_1
    const-string p1, "The response is not found"

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->F()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_2
    const-string p1, "Forbidden to make request."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->E()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_3
    const-string p1, "Unauthorized to make request. Auth cookie is needed."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->D()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_4
    const-string p1, "Service has thrown an unknown exception."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->C()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_5
    const-string p1, "Service has been turned off. Header response will include Retry-After in seconds."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->I()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->c:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_6
    const-string p1, "Server Error"

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->H()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_7
    const-string p1, "Service has been rate limited to user."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->G()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_8
    const-string p1, "Validation returns 200"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->B()V

    if-nez p2, :cond_9

    const-string p1, "validatePurchaseResponsePayload is null in getPurchaseValidationResult."

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->H()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_9
    invoke-virtual {p2}, Lhj/b;->b()Lcom/roblox/client/purchase/a$d;

    move-result-object p1

    if-nez p1, :cond_a

    sget-object p1, Lcom/roblox/client/purchase/a$e;->a:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Validation returns "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lhj/b;->b()Lcom/roblox/client/purchase/a$d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$c;->a:[I

    invoke-virtual {p2}, Lhj/b;->b()Lcom/roblox/client/purchase/a$d;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_c

    const/4 p2, 0x2

    if-eq p1, p2, :cond_b

    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->E()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_b
    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->E()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->e:Lcom/roblox/client/purchase/a$e;

    return-object p1

    :cond_c
    iget-object p1, p0, Lcom/roblox/client/purchase/a;->b:Lvi/g;

    invoke-virtual {p1}, Lvi/g;->E()V

    sget-object p1, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    return-object p1
.end method
