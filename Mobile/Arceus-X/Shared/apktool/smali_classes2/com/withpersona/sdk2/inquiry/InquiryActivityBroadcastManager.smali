.class public final Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;",
        "",
        "<init>",
        "()V",
        "",
        "skipBackendCall",
        "",
        "cancelRunningInquiries",
        "(Z)V",
        "Lku/p0;",
        "coroutineScope",
        "Lku/p0;",
        "Lnu/b0;",
        "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;",
        "_eventFlow",
        "Lnu/b0;",
        "Lnu/g0;",
        "getEventFlow",
        "()Lnu/g0;",
        "eventFlow",
        "inquiry-dynamic-feature_release"
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
.field public static final INSTANCE:Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final _eventFlow:Lnu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/b0<",
            "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final coroutineScope:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->INSTANCE:Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;

    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->coroutineScope:Lku/p0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    invoke-static {v0, v0, v2, v1, v2}, Lnu/i0;->b(IILmu/a;ILjava/lang/Object;)Lnu/b0;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->_eventFlow:Lnu/b0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$get_eventFlow$p()Lnu/b0;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->_eventFlow:Lnu/b0;

    return-object v0
.end method

.method public static synthetic cancelRunningInquiries$default(Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->cancelRunningInquiries(Z)V

    return-void
.end method


# virtual methods
.method public final cancelRunningInquiries(Z)V
    .locals 6

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->coroutineScope:Lku/p0;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager$cancelRunningInquiries$1;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager$cancelRunningInquiries$1;-><init>(ZLnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final getEventFlow()Lnu/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/g0<",
            "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->_eventFlow:Lnu/b0;

    return-object v0
.end method
