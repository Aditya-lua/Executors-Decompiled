.class public final Lzp/k0$f$b$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp/k0$f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2$3$1"
    f = "CameraScreenRunner.kt"
    l = {
        0xe1,
        0xe7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

.field public final synthetic v:Lfn/g;

.field public final synthetic w:Lzp/k0;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lfn/g;Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;",
            "Lfn/g;",
            "Lzp/k0;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
            "Lnt/b<",
            "-",
            "Lzp/k0$f$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzp/k0$f$b$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    iput-object p2, p0, Lzp/k0$f$b$a;->v:Lfn/g;

    iput-object p3, p0, Lzp/k0$f$b$a;->w:Lzp/k0;

    iput-object p4, p0, Lzp/k0$f$b$a;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

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

    new-instance v0, Lzp/k0$f$b$a;

    iget-object v1, p0, Lzp/k0$f$b$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    iget-object v2, p0, Lzp/k0$f$b$a;->v:Lfn/g;

    iget-object v3, p0, Lzp/k0$f$b$a;->w:Lzp/k0;

    iget-object v4, p0, Lzp/k0$f$b$a;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lzp/k0$f$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lfn/g;Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lzp/k0$f$b$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzp/k0$f$b$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lzp/k0$f$b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzp/k0$f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lzp/k0$f$b$a;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lzp/k0$f$b$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;->b()J

    move-result-wide v4

    iput v3, p0, Lzp/k0$f$b$a;->t:I

    invoke-static {v4, v5, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lzp/k0$f$b$a;->v:Lfn/g;

    invoke-interface {p1}, Lfn/g;->b()Lnu/p0;

    move-result-object p1

    invoke-interface {p1}, Lnu/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcom/withpersona/sdk2/camera/d$a;

    if-eqz p1, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p1, p0, Lzp/k0$f$b$a;->v:Lfn/g;

    iput v2, p0, Lzp/k0$f$b$a;->t:I

    invoke-interface {p1, p0}, Lfn/g;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object v0, p0, Lzp/k0$f$b$a;->w:Lzp/k0;

    iget-object v1, p0, Lzp/k0$f$b$a;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Ljava/io/File;

    invoke-static {v0}, Lzp/k0;->v(Lzp/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->E()Lmn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    const/16 v11, 0x7c

    const/4 v12, 0x0

    const-string v4, "selfie"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStopEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;ZILjava/lang/Object;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_6
    iget-object v0, p0, Lzp/k0$f$b$a;->w:Lzp/k0;

    iget-object v1, p0, Lzp/k0$f$b$a;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Lzp/k0;->v(Lzp/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->E()Lmn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x14

    const/4 v9, 0x0

    const-string v3, "selfie"

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_7
    iget-object p1, p0, Lzp/k0$f$b$a;->w:Lzp/k0;

    invoke-static {p1}, Lzp/k0;->q(Lzp/k0;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lfn/m0;

    invoke-direct {v0}, Lfn/m0;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
