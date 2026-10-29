.class public final Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/facialageestimation/a;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;",
        "Lcom/roblox/universalapp/facialageestimation/a;",
        "<init>",
        "()V",
        "Lj/b;",
        "activity",
        "",
        "onActivityCreated",
        "(Lj/b;)V",
        "",
        "inquiryId",
        "sessionToken",
        "Lcom/roblox/universalapp/facialageestimation/a$a;",
        "callback",
        "launchInquiry",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V",
        "Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;",
        "currentInquiry",
        "Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;",
        "Lg/c;",
        "Lcom/withpersona/sdk2/inquiry/Inquiry;",
        "inquiryLauncher",
        "Lg/c;",
        "InquiryCall",
        "personasdk_googleProdRelease"
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
.field private currentInquiry:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private inquiryLauncher:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/Inquiry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;Lcom/withpersona/sdk2/inquiry/InquiryResponse;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->onActivityCreated$lambda$0(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;Lcom/withpersona/sdk2/inquiry/InquiryResponse;)V

    return-void
.end method

.method private static final onActivityCreated$lambda$0(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;Lcom/withpersona/sdk2/inquiry/InquiryResponse;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;

    const-string v1, "PersonaActivityResultLauncher"

    if-eqz v0, :cond_1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;->getInquiryId()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inquiry "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " completed"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->currentInquiry:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->getInquiryId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->getCallback()Lcom/roblox/universalapp/facialageestimation/a$a;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0, p1}, Lcom/roblox/universalapp/facialageestimation/a$a;->onComplete(Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;

    if-eqz v0, :cond_2

    const-string p1, "Inquiry cancelled"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->currentInquiry:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->getCallback()Lcom/roblox/universalapp/facialageestimation/a$a;

    move-result-object p1

    invoke-virtual {p0}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->getInquiryId()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/roblox/universalapp/facialageestimation/a$a;->onCancel(Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;->getDebugMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Inquiry error. Debug message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->currentInquiry:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->getCallback()Lcom/roblox/universalapp/facialageestimation/a$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->getInquiryId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;->getDebugMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/roblox/universalapp/facialageestimation/a$a;->onError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void

    :cond_4
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method


# virtual methods
.method public launchInquiry(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/roblox/universalapp/facialageestimation/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Launching inquiry with inquiryId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionToken "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PersonaActivityResultLauncher"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    invoke-direct {v0, p1, p3}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;-><init>(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V

    iput-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->currentInquiry:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    iget-object p3, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->inquiryLauncher:Lg/c;

    if-nez p3, :cond_0

    const-string p3, "inquiryLauncher"

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 p3, 0x0

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromInquiry(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->sessionToken(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->build()Lcom/withpersona/sdk2/inquiry/Inquiry;

    move-result-object p1

    invoke-virtual {p3, p1}, Lg/c;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreated(Lj/b;)V
    .locals 2
    .param p1    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;-><init>(Landroid/content/Context;)V

    new-instance v1, Lbj/a;

    invoke-direct {v1, p0}, Lbj/a;-><init>(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;)V

    invoke-virtual {p1, v0, v1}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->inquiryLauncher:Lg/c;

    return-void
.end method
