.class public final Lcom/withpersona/sdk2/inquiry/selfie/h$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/h;->h(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lvq/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$showRendering$1$5"
    f = "SelfieInstructionsRunner.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Laq/e;

.field public final synthetic v:I

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Laq/e;ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/e;",
            "I",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->u:Laq/e;

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->v:I

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->x:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->u:Laq/e;

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->v:I

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->x:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/h$b;-><init>(Laq/e;ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Ljava/lang/String;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/h$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->u:Laq/e;

    iget-object p1, p1, Laq/e;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->v:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    const-string v0, "openRawResource(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance p1, Ljava/io/BufferedReader;

    const/16 v0, 0x2000

    invoke-direct {p1, v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :try_start_0
    invoke-static {p1}, Lut/n;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;->n()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getSelfieStartIconStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;

    move-result-object v0

    :cond_0
    move-object v3, v0

    const-string p1, "#01099C"

    const-string v0, "#02089C"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object v4

    const-string p1, "#7378FD"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v5

    const-string p1, "#D3D5FF"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v6

    const-string p1, "#FFFFFF"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Ljr/g;->g(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->u:Laq/e;

    iget-object v0, v0, Laq/e;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/h$b;->x:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/airbnb/lottie/LottieAnimationView;->z(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, v1}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
