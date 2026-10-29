.class public final Lcom/withpersona/sdk2/inquiry/internal/network/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0001\u0018\u00002\u00020\u0001BI\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\u0008&\u0010#J \u0010+\u001a\u00020*2\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0086@\u00a2\u0006\u0004\u0008+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0086@\u00a2\u0006\u0004\u0008/\u00100J:\u00104\u001a\u0002032\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\u0008\u00102\u001a\u0004\u0018\u00010\u0019H\u0080@\u00a2\u0006\u0004\u00084\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0000\u00a2\u0006\u0004\u00089\u0010:J \u0010<\u001a\u00020;2\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@\u00a2\u0006\u0004\u0008<\u0010,J\"\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@\u00a2\u0006\u0004\u0008>\u0010,J6\u0010D\u001a\u0004\u0018\u00010=2\"\u0010C\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020B0A0@\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@\u00a2\u0006\u0004\u0008D\u0010EJ:\u0010F\u001a\u0002032\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\u0008\u00102\u001a\u0004\u0018\u00010\u0019H\u0082@\u00a2\u0006\u0004\u0008F\u00105J \u0010G\u001a\u0002032\u0006\u0010\'\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008G\u0010HJ\u0019\u0010K\u001a\u0004\u0018\u00010\u001b2\u0006\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\u0008K\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010[\u00a8\u0006\\"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lgp/w;",
        "service",
        "Lgp/y;",
        "relayService",
        "Ldp/i;",
        "fallbackModeManager",
        "Lwp/c;",
        "sandboxFlags",
        "Lyn/a;",
        "deviceIdProvider",
        "Lep/a;",
        "playIntegrityHelper",
        "",
        "redactAppIdentifyingInformation",
        "<init>",
        "(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)V",
        "Lgp/e;",
        "attributes",
        "Lcom/withpersona/sdk2/inquiry/internal/network/a;",
        "h",
        "(Lgp/e;Lnt/b;)Ljava/lang/Object;",
        "",
        "inquiryId",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;",
        "inquirySessionDataWrapper",
        "Lcom/withpersona/sdk2/inquiry/internal/network/b;",
        "i",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lnt/b;)Ljava/lang/Object;",
        "oneTimeLinkCode",
        "Lcom/withpersona/sdk2/inquiry/internal/network/d;",
        "k",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "relaySessionToken",
        "Lcom/withpersona/sdk2/inquiry/internal/network/g;",
        "m",
        "sessionToken",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "inquirySessionConfig",
        "Lcom/withpersona/sdk2/inquiry/internal/network/i;",
        "r",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;",
        "Lyn/c;",
        "metrics",
        "s",
        "(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;",
        "fromStep",
        "trackingEventsUrl",
        "Lcom/withpersona/sdk2/inquiry/internal/network/h;",
        "p",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;",
        "inquirySessionData",
        "",
        "q",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V",
        "Lcom/withpersona/sdk2/inquiry/internal/network/j;",
        "u",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
        "t",
        "Lkotlin/Function1;",
        "Lnt/b;",
        "Ljv/x;",
        "Lokhttp3/ResponseBody;",
        "inquiryCall",
        "l",
        "(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;",
        "o",
        "n",
        "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;",
        "checkInquiryResponse",
        "j",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lgp/w;",
        "c",
        "Lgp/y;",
        "d",
        "Ldp/i;",
        "e",
        "Lwp/c;",
        "f",
        "Lyn/a;",
        "g",
        "Lep/a;",
        "Z",
        "inquiry-internal_release"
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
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lgp/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lgp/y;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ldp/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lwp/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lyn/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lep/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lgp/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lgp/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ldp/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lwp/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lyn/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lep/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "service"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "relayService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackModeManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sandboxFlags"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceIdProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "playIntegrityHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b:Lgp/w;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->c:Lgp/y;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->e:Lwp/c;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->f:Lyn/a;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->g:Lep/a;

    iput-boolean p8, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->h:Z

    return-void
.end method

.method public static final synthetic a(Lcom/withpersona/sdk2/inquiry/internal/network/e;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lgp/w;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b:Lgp/w;

    return-object p0
.end method

.method public static final synthetic c(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->l(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->n(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->t(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->u(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final h(Lgp/e;Lnt/b;)Ljava/lang/Object;
    .locals 17
    .param p1    # Lgp/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgp/e;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;

    iget v3, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->w:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;

    invoke-direct {v2, v1, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object v0, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->w:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->t:Ljava/lang/Object;

    check-cast v2, Lgp/e;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->t:Ljava/lang/Object;

    check-cast v2, Lgp/e;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lgp/e;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v7, 0x0

    if-eqz v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lgp/e;->i()Ljava/lang/String;

    move-result-object v0

    const-string v8, "itmpl_"

    invoke-static {v0, v8, v7, v5, v4}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$IntegrationErrorInfo;

    invoke-virtual/range {p1 .. p1}, Lgp/e;->i()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid template format: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$IntegrationErrorInfo;-><init>(Ljava/lang/String;)V

    const-string v3, "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1"

    invoke-direct {v0, v3, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object v0

    :cond_4
    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-virtual {v0}, Ldp/i;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;->e:Lwp/c;

    invoke-virtual/range {p1 .. p1}, Lgp/e;->b()Lzo/h;

    move-result-object v4

    sget-object v5, Lzo/h;->b:Lzo/h;

    if-ne v4, v5, :cond_5

    move v7, v6

    :cond_5
    invoke-virtual {v0, v7}, Lwp/c;->e(Z)V

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->t:Ljava/lang/Object;

    iput v6, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->w:I

    move-object/from16 v6, p1

    invoke-virtual {v0, v6, v2}, Ldp/i;->c(Lgp/e;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    goto/16 :goto_2

    :cond_6
    :goto_1
    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-nez v0, :cond_9

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-virtual {v0}, Ldp/i;->d()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    move-result-object v0

    const-string v2, "Required value was null."

    if-eqz v0, :cond_8

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/network/a$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    move-result-object v5

    if-eqz v5, :cond_7

    const/16 v9, 0x1c

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/withpersona/sdk2/inquiry/internal/network/a$b;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object v2

    :cond_a
    move-object/from16 v6, p1

    :try_start_1
    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b:Lgp/w;

    sget-object v7, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$b;

    invoke-virtual {v6}, Lgp/e;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lgp/e;->j()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lgp/e;->b()Lzo/h;

    move-result-object v10

    invoke-static {v10}, Lgp/b;->a(Lzo/h;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Lgp/e;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Lgp/e;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lgp/e;->g()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lgp/e;->d()Ljava/util/Map;

    move-result-object v14

    invoke-virtual {v6}, Lgp/e;->k()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6}, Lgp/e;->f()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v7 .. v16}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;

    move-result-object v7

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-virtual {v8}, Ldp/i;->e()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v8

    sget-object v9, Lcom/withpersona/sdk2/inquiry/FallbackMode;->DEFER:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    if-ne v8, v9, :cond_b

    const-string v4, "defer"

    :cond_b
    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->t:Ljava/lang/Object;

    iput v5, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$a;->w:I

    invoke-interface {v0, v7, v4, v2}, Lgp/w;->k(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    :goto_2
    return-object v3

    :cond_c
    :goto_3
    check-cast v0, Ljv/x;

    invoke-virtual {v0}, Ljv/x;->g()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/a$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;->getNextStep()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    move-result-object v4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->j(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;

    move-result-object v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;->getRedirectUri()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lcom/withpersona/sdk2/inquiry/internal/network/a$b;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Ljava/lang/String;)V

    return-object v2

    :cond_d
    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :goto_4
    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;

    const-string v3, "There was a problem reaching the server."

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toSocketTimeoutErrorInfo(Ljava/net/SocketTimeoutException;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/a$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object v2
.end method

.method public final i(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lnt/b;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->y:I

    const-string v3, "Bearer "

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->v:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->u:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-virtual {p3}, Ldp/i;->d()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    move-result-object p3

    if-eqz p3, :cond_3

    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/network/b$b;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->b()Ljava/lang/String;

    move-result-object v6

    sget-object p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/withpersona/sdk2/inquiry/internal/network/b$b;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;->getInquirySessionData()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->q(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/b$b;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;->getAccessToken()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;->getInquirySessionData()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    move-result-object v0

    invoke-static {v0}, Lgp/c;->a(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;->getTrackingEventsUrl()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p3, v0, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/b$b;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V

    return-object p1

    :cond_4
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b:Lgp/w;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;->c:Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$a;

    invoke-virtual {v5, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$a;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;

    move-result-object v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->f:Lyn/a;

    invoke-interface {v6}, Lyn/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->u:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->v:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$b;->y:I

    invoke-interface {v2, v5, v6, v0}, Lgp/w;->g(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    check-cast p3, Ljv/x;

    invoke-virtual {p3}, Ljv/x;->g()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p3}, Ljv/x;->f()Lokhttp3/Headers;

    move-result-object p1

    const-string p2, "persona-device-id"

    invoke-virtual {p1, p2}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->f:Lyn/a;

    invoke-interface {p2, p1}, Lyn/a;->a(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {p3}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->a()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->q(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V

    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/network/b$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->b()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;

    move-result-object p3

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;->a()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->a()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    move-result-object v0

    invoke-static {v0}, Lgp/c;->a(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->b()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, v0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/b$b;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V

    return-object p2

    :cond_7
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/b$a;

    invoke-static {p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1
.end method

.method public final j(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;
    .locals 6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getMeta()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getIncluded()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    if-eqz v5, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    if-eqz p1, :cond_4

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;->getTrackingEventsUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, p1, v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;Ljava/lang/String;)V

    :cond_4
    return-object v1
.end method

.method public final k(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->w:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b:Lgp/w;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Data;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Attributes;

    invoke-direct {v6, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Attributes;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x2

    invoke-direct {v5, v6, v4, v7, v4}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Data;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Attributes;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v5}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Data;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->t:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$c;->w:I

    invoke-interface {p2, v2, v0}, Lgp/w;->b(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljv/x;

    invoke-virtual {p2}, Ljv/x;->g()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p2}, Ljv/x;->f()Lokhttp3/Headers;

    move-result-object p1

    const-string v0, "persona-device-id"

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->f:Lyn/a;

    invoke-interface {v0, p1}, Lyn/a;->a(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p2}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;->a()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getRelationships()Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;->getInquiry()Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/RelationshipData;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/RelationshipData;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    move-object v0, v4

    :goto_2
    if-eqz p2, :cond_6

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->q(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V

    :cond_6
    if-nez v0, :cond_7

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/d$a;

    new-instance p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v0, "Error exchanging one-time-code."

    invoke-direct {p2, v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1

    :cond_7
    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/network/d$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;->b()Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_8
    move-object v2, v4

    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Bearer "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    move-result-object p2

    invoke-static {p2}, Lgp/c;->a(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object p2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;->b()Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;->b()Ljava/lang/String;

    move-result-object v4

    :cond_9
    invoke-direct {v1, v0, v2, p2, v4}, Lcom/withpersona/sdk2/inquiry/internal/network/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V

    return-object v1

    :cond_a
    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getCode()I

    move-result v0

    const/16 v1, 0x194

    if-ne v0, v1, :cond_b

    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/network/d$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$InvalidOneTimeLinkCode;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$InvalidOneTimeLinkCode;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p2

    :cond_b
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/d$a;

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1
.end method

.method public final l(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "Lokhttp3/ResponseBody;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->u:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/c0;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->t:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/c0;

    invoke-direct {p2}, Lkotlin/jvm/internal/c0;-><init>()V

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p2, v4}, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/c0;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->t:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->u:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$d;->x:I

    const/4 p1, 0x5

    invoke-static {p1, v2, v0}, Ljq/b0;->a(ILkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    :goto_1
    iget-object p1, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final m(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->w:I

    const-string v3, "Bearer "

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->c:Lgp/y;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->t:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$f;->w:I

    invoke-interface {p2, v2, v0}, Lgp/y;->a(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljv/x;

    invoke-virtual {p2}, Ljv/x;->g()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Ljv/x;->f()Lokhttp3/Headers;

    move-result-object p1

    const-string v0, "persona-device-id"

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->f:Lyn/a;

    invoke-interface {v0, p1}, Lyn/a;->a(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p2}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;->a()Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;->getInquiry()Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/RelationshipData;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/RelationshipData;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    move-object v0, p2

    :goto_2
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;->b()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;->a()Ljava/lang/String;

    move-result-object p2

    :cond_6
    if-eqz v0, :cond_8

    if-nez p2, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/g$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v1

    invoke-direct {p1, v0, p2, v1}, Lcom/withpersona/sdk2/inquiry/internal/network/g$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V

    return-object p1

    :cond_8
    :goto_3
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/g$a;

    new-instance p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v0, "Error resolving relay session."

    invoke-direct {p2, v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/g$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1

    :cond_9
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/g$a;

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/g$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;

    invoke-virtual {v2, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;

    move-result-object v2

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->u:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$g;->x:I

    invoke-virtual {p3, p1, v2, v0}, Ldp/i;->f(Ljava/lang/String;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljv/x;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-virtual {p1}, Ldp/i;->d()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    move-result-object p1

    invoke-virtual {p3}, Ljv/x;->g()Z

    move-result p2

    if-nez p2, :cond_4

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;

    invoke-static {p3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1

    :cond_4
    if-nez p1, :cond_5

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;

    new-instance p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string p3, "Current fallback session is unexpectedly null."

    invoke-direct {p2, p3}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1

    :cond_5
    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/network/h$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/h$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :goto_2
    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toSocketTimeoutErrorInfo(Ljava/net/SocketTimeoutException;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p2
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->A:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->A:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;

    invoke-direct {v0, p0, p6}, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p6, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->A:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->x:Ljava/lang/Object;

    move-object p5, p1

    check-cast p5, Ljava/lang/String;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->w:Ljava/lang/Object;

    move-object p4, p1

    check-cast p4, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->v:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p6}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p6, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b:Lgp/w;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;

    invoke-virtual {v2, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;

    move-result-object v2

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->u:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->v:Ljava/lang/Object;

    iput-object p4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->w:Ljava/lang/Object;

    iput-object p5, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->x:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$h;->A:I

    invoke-interface {p6, p1, p2, v2, v0}, Lgp/w;->j(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p6, Ljv/x;

    invoke-virtual {p6}, Ljv/x;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/network/h$b;

    invoke-virtual {p6}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p3, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    invoke-static {p3, p1, p4, p5}, Lgp/a;->w(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/h$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V

    return-object p2

    :cond_4
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;

    invoke-static {p6}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toSocketTimeoutErrorInfo(Ljava/net/SocketTimeoutException;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/h$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p2
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/String;
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
    .param p4    # Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->d:Ldp/i;

    invoke-virtual {v0}, Ldp/i;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p3, p6}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->n(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquirySessionData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getRelationships()Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;->getDevice()Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/RelationshipData;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/RelationshipData;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->f:Lyn/a;

    invoke-interface {v1, v0}, Lyn/a;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getPlayIntegrityProjectId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->g:Lep/a;

    invoke-virtual {v0, p1}, Lep/a;->h(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final r(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->v:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/j;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->u:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->t:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->u:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->t:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->u:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->y:I

    invoke-virtual {p0, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->u(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lcom/withpersona/sdk2/inquiry/internal/network/j;

    instance-of v2, p3, Lcom/withpersona/sdk2/inquiry/internal/network/j$a;

    if-eqz v2, :cond_5

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;

    check-cast p3, Lcom/withpersona/sdk2/inquiry/internal/network/j$a;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/internal/network/j$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1

    :cond_5
    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->t:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->u:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->v:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$i;->y:I

    invoke-virtual {p0, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->t(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object p1, p2

    :goto_3
    check-cast p3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    if-eqz p3, :cond_7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->k()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;

    invoke-direct {p1, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1

    :cond_7
    sget-object p1, Lcom/withpersona/sdk2/inquiry/internal/network/i$b;->a:Lcom/withpersona/sdk2/inquiry/internal/network/i$b;

    return-object p1
.end method

.method public final s(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lyn/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lyn/c;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->u:Ljava/lang/Object;

    check-cast p1, Lyn/c;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;

    const/4 v2, 0x0

    invoke-direct {p3, p0, p1, p2, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Lyn/c;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->u:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$j;->x:I

    invoke-virtual {p0, p3, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->l(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    if-nez p3, :cond_4

    sget-object p1, Lcom/withpersona/sdk2/inquiry/internal/network/i$b;->a:Lcom/withpersona/sdk2/inquiry/internal/network/i$b;

    return-object p1

    :cond_4
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;

    invoke-direct {p1, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1
.end method

.method public final t(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v2, p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;

    if-eqz v2, :cond_0

    move-object v2, p3

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;

    iget v3, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->z:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;

    invoke-direct {v2, p0, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->x:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v7

    iget v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->z:I

    const/4 v8, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v8, :cond_1

    iget-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->w:Ljava/lang/Object;

    check-cast v2, Lxn/a;

    iget-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->v:Ljava/lang/Object;

    check-cast v2, Ltq/a;

    iget-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->t:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->v:Ljava/lang/Object;

    check-cast v2, Ltq/a;

    iget-object v3, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->u:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->t:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->t:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v11, v4

    move-object v4, v0

    move-object v0, v2

    move-object v2, v11

    goto :goto_2

    :cond_4
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->f()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    move-result-object v0

    sget-object v2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->c:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    if-eq v0, v2, :cond_6

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->a:Landroid/content/Context;

    iput-object p1, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->u:Ljava/lang/Object;

    iput v4, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->z:I

    invoke-static {v0, v6}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a;->a(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    goto/16 :goto_7

    :cond_5
    move-object v2, p1

    move-object v4, v0

    move-object v0, p2

    :goto_2
    check-cast v4, Ltq/a;

    goto :goto_3

    :cond_6
    move-object v2, p1

    move-object v0, p2

    move-object v4, v5

    :goto_3
    invoke-static {}, Lxn/c;->b()Lnu/h;

    move-result-object v9

    if-eqz v9, :cond_8

    iput-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->t:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->u:Ljava/lang/Object;

    iput-object v4, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->v:Ljava/lang/Object;

    iput v3, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->z:I

    invoke-static {v9, v6}, Lnu/j;->v(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_7

    goto :goto_7

    :cond_7
    move-object v11, v3

    move-object v3, v0

    move-object v0, v11

    move-object v11, v4

    move-object v4, v2

    move-object v2, v11

    :goto_4
    check-cast v0, Lxn/a;

    move-object v9, v3

    move-object v3, v2

    move-object v2, v4

    move-object v4, v0

    goto :goto_5

    :cond_8
    move-object v9, v0

    move-object v3, v4

    move-object v4, v5

    :goto_5
    if-nez v3, :cond_b

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lxn/a;->b()Ljava/util/Map;

    move-result-object v0

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    return-object v5

    :cond_b
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Ltq/a;Lxn/a;Lnt/b;)V

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->t:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->w:Ljava/lang/Object;

    iput v8, v6, Lcom/withpersona/sdk2/inquiry/internal/network/e$l;->z:I

    invoke-virtual {p0, v0, v6}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->l(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_c

    :goto_7
    return-object v7

    :cond_c
    :goto_8
    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    return-object v0
.end method

.method public final u(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->x:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->z:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->w:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->v:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->u:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->v:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->u:Ljava/lang/Object;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->t:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->u:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-boolean p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->h:Z

    if-eqz p3, :cond_5

    sget-object p1, Lcom/withpersona/sdk2/inquiry/internal/network/j$b;->a:Lcom/withpersona/sdk2/inquiry/internal/network/j$b;

    return-object p1

    :cond_5
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->i()Z

    move-result p3

    if-nez p3, :cond_6

    sget-object p1, Lcom/withpersona/sdk2/inquiry/internal/network/j$b;->a:Lcom/withpersona/sdk2/inquiry/internal/network/j$b;

    return-object p1

    :cond_6
    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->g:Lep/a;

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->u:Ljava/lang/Object;

    iput v5, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->z:I

    invoke-virtual {p3, v0}, Lep/a;->g(Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_8

    sget-object p1, Lcom/withpersona/sdk2/inquiry/internal/network/j$b;->a:Lcom/withpersona/sdk2/inquiry/internal/network/j$b;

    return-object p1

    :cond_8
    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/e$o;

    const/4 v5, 0x0

    invoke-direct {v2, p0, p1, p3, v5}, Lcom/withpersona/sdk2/inquiry/internal/network/e$o;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->u:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->v:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->z:I

    invoke-virtual {p0, v2, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->l(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto :goto_3

    :cond_9
    move-object v6, v2

    move-object v2, p1

    move-object p1, p3

    move-object p3, v6

    :goto_2
    check-cast p3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    if-nez p3, :cond_b

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e;->g:Lep/a;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->v:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->w:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$n;->z:I

    invoke-virtual {v4, v0}, Lep/a;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    :goto_4
    sget-object p1, Lcom/withpersona/sdk2/inquiry/internal/network/j$b;->a:Lcom/withpersona/sdk2/inquiry/internal/network/j$b;

    return-object p1

    :cond_b
    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/j$a;

    invoke-direct {p1, p3}, Lcom/withpersona/sdk2/inquiry/internal/network/j$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    return-object p1
.end method
