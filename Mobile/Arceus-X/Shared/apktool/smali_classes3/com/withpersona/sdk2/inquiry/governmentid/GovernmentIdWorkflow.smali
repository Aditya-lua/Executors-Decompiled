.class public final Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;
.super Lym/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;,
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;,
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lym/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0002zVBy\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#JC\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010\'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008(\u0010)J;\u0010,\u001a\u00020+2\"\u0010\'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010*\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008,\u0010-J-\u00101\u001a\u00020+2\u001c\u00100\u001a\u00180.R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040/H\u0002\u00a2\u0006\u0004\u00081\u00102J\u001b\u00104\u001a\u000203*\u00020\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u00084\u00105J!\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000508*\u00020\u00052\u0006\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\u00089\u0010:J\u0013\u0010<\u001a\u00020;*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010>\u001a\u0004\u0018\u000106*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008>\u0010?J-\u0010E\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\u0008\u0010D\u001a\u0004\u0018\u000106H\u0002\u00a2\u0006\u0004\u0008E\u0010FJ-\u0010G\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\u0008\u0010D\u001a\u0004\u0018\u000106H\u0002\u00a2\u0006\u0004\u0008G\u0010FJ-\u0010H\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\u0008\u0010D\u001a\u0004\u0018\u000106H\u0002\u00a2\u0006\u0004\u0008H\u0010FJ\u001b\u0010I\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ\u001b\u0010K\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002\u00a2\u0006\u0004\u0008K\u0010JJ\u0017\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008M\u0010=J!\u0010Q\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00022\u0008\u0010P\u001a\u0004\u0018\u00010OH\u0016\u00a2\u0006\u0004\u0008Q\u0010RJC\u0010S\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010\'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016\u00a2\u0006\u0004\u0008S\u0010)J\u0019\u0010T\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008T\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008n\u0010oR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010tR \u0010y\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0003\u0018\u00010v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008w\u0010x\u00a8\u0006{"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lk6/s;",
        "imageLoader",
        "Lpo/c$a;",
        "submitVerificationWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/governmentid/e;",
        "documentSelectWorker",
        "Luo/j;",
        "localVideoCaptureRenderer",
        "Luo/v;",
        "webRtcRenderer",
        "Llo/t0;",
        "captureRenderer",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        "autoClassifyWorkerFactory",
        "Ljo/n;",
        "autoClassificationRenderer",
        "Lln/a;",
        "cameraStatsManager",
        "Luq/a;",
        "navigationStateManager",
        "Lpq/c;",
        "externalEventLogger",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "themeManager",
        "<init>",
        "(Landroid/content/Context;Lk6/s;Lpo/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Luo/j;Luo/v;Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Ljo/n;Lln/a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;)V",
        "renderProps",
        "renderState",
        "Lym/k$a;",
        "context",
        "j0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;",
        "output",
        "",
        "b1",
        "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V",
        "Lym/r$c;",
        "Lym/r;",
        "updater",
        "c1",
        "(Lym/r$c;)V",
        "Lwq/m;",
        "f1",
        "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lwq/m;",
        "",
        "name",
        "Lan/m;",
        "h0",
        "(Ljava/lang/Object;Ljava/lang/String;)Lan/m;",
        "",
        "e1",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z",
        "e0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;",
        "side",
        "selectedId",
        "countryCode",
        "a0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "Z",
        "b0",
        "d0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;",
        "c0",
        "state",
        "g0",
        "props",
        "Lym/i;",
        "snapshot",
        "f0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "i0",
        "d1",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lym/i;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lk6/s;",
        "c",
        "Lpo/c$a;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/governmentid/e;",
        "e",
        "Luo/j;",
        "f",
        "Luo/v;",
        "g",
        "Llo/t0;",
        "h",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        "i",
        "Ljo/n;",
        "j",
        "Lln/a;",
        "k",
        "Luq/a;",
        "l",
        "Lpq/c;",
        "m",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "n",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "Luo/l;",
        "o",
        "Luo/l;",
        "videoCaptureHelper",
        "Lhu/c;",
        "p",
        "Lhu/c;",
        "previousStateClass",
        "Input",
        "government-id_release"
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

.field public final b:Lk6/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lpo/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/governmentid/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Luo/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Luo/v;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Llo/t0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Ljo/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lln/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lpq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Luo/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public p:Lhu/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhu/c<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk6/s;Lpo/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Luo/j;Luo/v;Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Ljo/n;Lln/a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lk6/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lpo/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/governmentid/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Luo/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Luo/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Llo/t0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljo/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lln/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lpq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitVerificationWorkerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentSelectWorker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localVideoCaptureRenderer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webRtcRenderer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureRenderer"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoClassifyWorkerFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoClassificationRenderer"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraStatsManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalEventLogger"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeManager"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lym/k;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b:Lk6/s;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->c:Lpo/c$a;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->d:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->e:Luo/j;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->f:Luo/v;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->g:Llo/t0;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->h:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->i:Ljo/n;

    iput-object p10, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->j:Lln/a;

    iput-object p11, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    iput-object p12, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->l:Lpq/c;

    iput-object p13, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iput-object p14, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->n:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    new-instance p1, Luo/l;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3, p2}, Luo/l;-><init>(Lur/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    return-void
.end method

.method public static synthetic A(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->z0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final A0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;
    .locals 10

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;->RETAKE_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdButtonClickEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;ZILjava/lang/Object;)V

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object v0

    new-instance v4, Lio/k0;

    move-object v9, p0

    move-object v8, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v4 .. v9}, Lio/k0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    const/4 p0, 0x1

    invoke-static {v9, v3, v4, p0, v3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    invoke-interface {v0, p0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic B(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 21

    move-object/from16 v0, p5

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    move-object/from16 v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->E()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    move-result-object v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->D()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v9

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->x(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->x()Ljava/lang/String;

    move-result-object v16

    sget-object v11, Luo/x;->c:Luo/x;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->i()Ljava/lang/String;

    move-result-object v12

    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    new-instance v1, Lio/y0;

    move-object/from16 v2, p3

    move-object/from16 v6, p4

    invoke-direct {v1, v2, v6}, Lio/y0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    const/16 v19, 0x2e00

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v6, p2

    move-object/from16 v18, v1

    invoke-direct/range {v3 .. v20}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->G(Z)V

    invoke-virtual {v0, v3}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final C0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/c1;

    invoke-direct {v0, p1}, Lio/c1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic D(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->W0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v1}, Luo/l;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Luo/x;->b:Luo/x;

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_1
    sget-object v1, Luo/x;->c:Luo/x;

    goto :goto_2

    :goto_3
    const/16 v18, 0x7f7f

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic E(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->D0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final E0(Lym/h;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-interface {p0, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->q0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final F0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/v0;

    invoke-direct {v0, p2}, Lio/v0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic G(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->I0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final G0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    const/16 v14, 0x6ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    move-result-object v1

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic H(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->y0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iget-object v0, p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    iget-object p3, p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {p0, p1, p2, v0, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->h(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic I(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->x0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final I0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->S(Lym/k$a;Luo/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic J(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->p0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final J0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->S(Lym/k$a;Luo/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic K(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->Y0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final K0(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->v(Lym/k$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lpo/c$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->O0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lpo/c$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/l0;

    invoke-direct {v0, p2}, Lio/l0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic M(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->G0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final M0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    const/16 v15, 0xdff

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    move-result-object v1

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic N(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->C0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->S(Lym/k$a;Luo/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic O(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->r0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final O0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lpo/c$b;)Lym/r;
    .locals 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lpo/c$b$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lio/n0;

    invoke-direct {p2, p0, p1}, Lio/n0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p2, Lpo/c$b$b;

    if-eqz v0, :cond_2

    check-cast p2, Lpo/c$b$b;

    invoke-virtual {p2}, Lpo/c$b$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object p1

    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;

    const-string v0, "getString(...)"

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget v3, Lvp/g;->t:I

    invoke-virtual {p2}, Lpo/c$b$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object p2

    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;->getDetails()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;->getMinDimensionSize()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, v3, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget p2, Lvp/g;->u:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    new-instance p2, Lio/o0;

    invoke-direct {p2, p1}, Lio/o0;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p2, Lpo/c$b$a;

    if-eqz v0, :cond_3

    new-instance v0, Lio/p0;

    invoke-direct {v0, p2, p0, p1}, Lio/p0;-><init>(Lpo/c$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic P(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->s0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final P0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Q(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->U0(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Q0(Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->u(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic R(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->v0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    return-void
.end method

.method public static final R0(Lpo/c$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    check-cast p0, Lpo/c$b$a;

    invoke-virtual {p0}, Lpo/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v1

    instance-of v1, v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpo/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget p1, Lvp/g;->B:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "getString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->u(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    invoke-virtual {p0}, Lpo/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p0

    invoke-direct {p3, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic S(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->K0(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final S0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic T(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->J0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final T0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic U(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->F0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final U0(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->v(Lym/k$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic V(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final V0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/x0;

    invoke-direct {v0, p2}, Lio/x0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic W(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Luo/l;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    return-object p0
.end method

.method public static final W0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic X(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->Z0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V

    return-void
.end method

.method public static final X0(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Ljava/lang/String;Ljava/lang/String;)Lym/r;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lym/r<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    const/4 v2, 0x2

    const/4 v9, 0x0

    invoke-direct {v1, p3, v9, v2, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object p0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->e0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    move-result-object v2

    move-object p0, p1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object p0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p0, Lio/z0;

    invoke-direct {p0, p1, v0, p4}, Lio/z0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-static {p2, v9, p0, p1, v9}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Y(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->c1(Lym/r$c;)V

    return-void
.end method

.method public static final Y0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p3

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    move-object v2, v1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    move-object/from16 v4, p0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-object v5, v2

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v2

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->E()Ljava/util/List;

    move-result-object v6

    move-object v7, v4

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v4

    move-object v8, v7

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->D()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->C()I

    move-result v5

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v0, v9, v10, v3}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->y(Lym/r$c;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v9

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v13

    const/16 v14, 0x700

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v8, v5

    move-object v3, v6

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final Z0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;",
            "Z)V"
        }
    .end annotation

    invoke-virtual/range {p4 .. p4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->f()Ljava/util/List;

    move-result-object v8

    move-object/from16 v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    move-object/from16 v1, p1

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    new-instance v6, Lcom/withpersona/sdk2/camera/CameraProperties;

    const/16 v15, 0x1f

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v16}, Lcom/withpersona/sdk2/camera/CameraProperties;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0xe00

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v4, p4

    move/from16 v7, p5

    invoke-static/range {v0 .. v13}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->X(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic a1(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;ZILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    const/4 p5, 0x1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->Z0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V

    return-void
.end method

.method public static synthetic h(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->H0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->S0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->A0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->N0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lym/r;
    .locals 2

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;

    if-eqz v0, :cond_0

    check-cast p4, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;

    invoke-virtual {p4}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;->b()Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p2, p0, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->X0(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Ljava/lang/String;Ljava/lang/String;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p1, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Lio/r0;

    invoke-direct {p1, p2}, Lio/r0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    invoke-static {p0, v1, p1, v0, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p1, p4, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;

    if-eqz p1, :cond_2

    new-instance p1, Lio/t0;

    invoke-direct {p1, p0, p3, p4}, Lio/t0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)V

    invoke-static {p0, v1, p1, v0, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic l(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->n0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final l0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p2

    invoke-direct {p3, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->P0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 13

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic n(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->t0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object v0

    new-instance v1, Lio/m0;

    invoke-direct {v1, p2, p3, p0, p1}, Lio/m0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    const/4 p0, 0x1

    const/4 p2, 0x0

    invoke-static {p1, p2, v1, p0, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    invoke-interface {v0, p0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic o(Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->Q0(Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 22

    move-object/from16 v0, p4

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    move-object/from16 v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v5

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->E()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v7

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    move-object/from16 v8, p1

    invoke-static {v8, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->D()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->C()I

    move-result v10

    const/4 v1, 0x0

    const/4 v11, 0x1

    invoke-static {v0, v1, v11, v3}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->y(Lym/r$c;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v11

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v17

    sget-object v12, Luo/x;->c:Luo/x;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->i()Ljava/lang/String;

    move-result-object v13

    move-object v8, v4

    new-instance v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    new-instance v1, Lio/a1;

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-direct {v1, v2, v3}, Lio/a1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    const/16 v20, 0x2e00

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v1

    invoke-direct/range {v4 .. v21}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v4}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic p(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->l0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/b1;

    invoke-direct {v0, p1}, Lio/b1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->B0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v1}, Luo/l;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Luo/x;->b:Luo/x;

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_1
    sget-object v1, Luo/x;->c:Luo/x;

    goto :goto_2

    :goto_3
    const/16 v18, 0x7f7f

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->M0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/u0;

    invoke-direct {v0, p1, p2}, Lio/u0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic s(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->T0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->d:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/e;->g()V

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v10, 0x1bf

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v11}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-result-object p0

    invoke-virtual {p2, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic t(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->V0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final t0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->S(Lym/k$a;Luo/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic u(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->w0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->v(Lym/k$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic v(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->u0(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object v0

    new-instance v1, Lio/w0;

    invoke-direct {v1, p1, p0, p2}, Lio/w0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    const/4 p0, 0x1

    const/4 p2, 0x0

    invoke-static {p1, p2, v1, p0, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    invoke-interface {v0, p0}, Lym/h;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic x(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->L0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lio/q0;

    invoke-direct {v0, p2}, Lio/q0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic y(Lym/h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->E0(Lym/h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 13

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic z(Lpo/c$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->R0(Lpo/c$b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;
    .locals 1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iget-object v0, p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    iget-object p3, p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {p0, p1, p2, v0, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->h(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final Z(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->A()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;

    move-result-object p1

    invoke-virtual {p1, p4, p3, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget p2, Lvp/g;->r:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final a0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->D()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;

    move-result-object p1

    invoke-virtual {p1, p4, p3, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget p2, Lvp/g;->s:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final b0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->I()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;

    move-result-object p1

    invoke-virtual {p1, p4, p3, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public final b1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-static {p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->b0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Luo/l;)V

    return-void
.end method

.method public final c0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->x0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget p2, Lvp/g;->v:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final c1(Lym/r$c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/r<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            ">.c;)V"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;

    const-string v2, "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project."

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->f0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object p1

    return-object p1
.end method

.method public final d0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->C0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    sget p2, Lvp/g;->w:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public d1(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lym/i;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->g0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Lan/q;->a(Landroid/os/Parcelable;)Lym/i;

    move-result-object p1

    return-object p1
.end method

.method public final e0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_3
    :goto_1
    const-string p1, "camera_screen"

    return-object p1
.end method

.method public final e1(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z
    .locals 1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->i0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;
    .locals 22
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "props"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    invoke-virtual/range {p2 .. p2}, Lym/i;->b()Lxu/h;

    move-result-object v2

    invoke-virtual {v2}, Lxu/h;->I()I

    move-result v3

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const-string v3, "obtain()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lxu/h;->O()[B

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    const-class v2, Lym/i;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "parcel.readParcelable<T>\u2026class.java.classLoader)!!"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    move-object v1, v2

    :goto_1
    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    :cond_2
    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_6

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v2, v0}, Luo/l;->c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->u()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-direct {v4, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v5

    new-instance v9, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v2

    invoke-direct {v9, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v8

    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v13, 0x140

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_4
    new-instance v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-direct {v5, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v6

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v2

    invoke-direct {v7, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v2

    sget-object v3, Lio/d;->b:Lio/d;

    if-ne v2, v3, :cond_5

    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;->c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    :goto_2
    move-object v8, v2

    goto :goto_3

    :cond_5
    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    goto :goto_2

    :goto_3
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v9

    sget-object v12, Luo/x;->c:Luo/x;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->i()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v17

    const/16 v20, 0x6e00

    const/16 v21, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v4 .. v21}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_6
    move-object/from16 v1, p0

    :cond_7
    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v11

    const/16 v14, 0xdf

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method public final f1(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lwq/m;
    .locals 1

    new-instance v0, Lwq/m;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->A()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lwq/l;->b:Lwq/l;

    goto :goto_0

    :cond_0
    sget-object p2, Lwq/l;->a:Lwq/l;

    :goto_0
    invoke-direct {v0, p1, p2}, Lwq/m;-><init>(Ljava/lang/Object;Lwq/l;)V

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Lym/i;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->d1(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lym/i;

    move-result-object p1

    return-object p1
.end method

.method public final g0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z
    .locals 1

    :goto_0
    if-eqz p1, :cond_2

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final h0(Ljava/lang/Object;Ljava/lang/String;)Lan/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Lan/m<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lan/m;

    invoke-direct {v0, p1, p2}, Lan/m;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "renderProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->j0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->e0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->h0(Ljava/lang/Object;Ljava/lang/String;)Lan/m;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->e1(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$c;

    invoke-direct {v1, p0, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$c;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lnt/b;)V

    const-string v3, "close_camera"

    invoke-virtual {p3, v3, v1}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_1
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v1, p1}, Luo/l;->f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a:Landroid/content/Context;

    invoke-static {p1}, Ljq/g;->e(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$d;

    invoke-direct {p1, p3, p0, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$d;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lnt/b;)V

    const-string v1, "output_webrtc_error"

    invoke-virtual {p3, v1, p1}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_2
    invoke-virtual {p0, v0, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->f1(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lwq/m;

    move-result-object p1

    return-object p1
.end method

.method public final j0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v0

    new-instance v5, Lio/w;

    invoke-direct {v5, v3, v1}, Lio/w;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->g()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->i()Z

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->isEnabled()Z

    move-result v4

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v4, :cond_0

    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-nez v4, :cond_0

    move v9, v14

    goto :goto_0

    :cond_0
    move v9, v13

    :goto_0
    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    if-eqz v4, :cond_1

    sget-object v6, Lpq/h$a;->a:Lpq/h$a;

    goto/16 :goto_2

    :cond_1
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v6, :cond_2

    sget-object v6, Lpq/h$b;->a:Lpq/h$b;

    goto/16 :goto_2

    :cond_2
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-eqz v6, :cond_3

    sget-object v6, Lpq/h$h;->a:Lpq/h$h;

    goto :goto_2

    :cond_3
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-eqz v6, :cond_4

    new-instance v6, Lpq/h$f;

    move-object v7, v2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->C()I

    move-result v7

    invoke-direct {v6, v7}, Lpq/h$f;-><init>(I)V

    goto :goto_2

    :cond_4
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-nez v6, :cond_a

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    if-nez v6, :cond_a

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-nez v6, :cond_a

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-nez v6, :cond_a

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v6, :cond_5

    goto :goto_1

    :cond_5
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    if-eqz v6, :cond_6

    new-instance v6, Lpq/h$c;

    move-object v7, v2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->C()I

    move-result v7

    invoke-direct {v6, v7}, Lpq/h$c;-><init>(I)V

    goto :goto_2

    :cond_6
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-eqz v6, :cond_7

    new-instance v6, Lpq/h$d;

    move-object v7, v2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->C()I

    move-result v7

    invoke-direct {v6, v7}, Lpq/h$d;-><init>(I)V

    goto :goto_2

    :cond_7
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-eqz v6, :cond_8

    sget-object v6, Lpq/h$e;->a:Lpq/h$e;

    goto :goto_2

    :cond_8
    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz v6, :cond_9

    sget-object v6, Lpq/h$g;->a:Lpq/h$g;

    goto :goto_2

    :cond_9
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_a
    :goto_1
    new-instance v6, Lpq/h$i;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v7

    invoke-direct {v6, v7}, Lpq/h$i;-><init>(I)V

    :goto_2
    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->l:Lpq/c;

    new-instance v8, Lpq/i$c;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v6}, Lpq/i$c;-><init>(Ljava/lang/String;Lpq/h;)V

    invoke-virtual {v7, v8}, Lpq/c;->c(Lpq/i;)V

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->p:Lhu/c;

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-nez v7, :cond_d

    iget-object v15, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v17

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logInquiryPageViewEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    const-class v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    invoke-static {v6}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v15, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v16, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->LOADING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->z()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;

    move-result-object v7

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->Q(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v7

    move-object/from16 v18, v7

    goto :goto_3

    :cond_b
    move-object/from16 v18, v9

    :goto_3
    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v15, v13, v8, v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    :cond_c
    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->p:Lhu/c;

    :cond_d
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-eqz v0, :cond_e

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$e;

    const/4 v5, 0x0

    move-object v4, v3

    move-object v3, v1

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$e;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lnt/b;)V

    move-object v6, v3

    move-object v3, v4

    const-string v4, "check_if_single_id_class"

    invoke-virtual {v3, v4, v0}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->v0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->z()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->g0()Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->N(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;

    move-result-object v12

    new-instance v14, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$g;

    invoke-direct {v14, v2, v6, v3, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$g;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getSelectPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v15

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    invoke-virtual {v0}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v13

    move-object v0, v2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;->K()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->isEnabled()Z

    move-result v17

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->n:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;->f()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;

    move-result-object v22

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->K0()Ljava/lang/String;

    move-result-object v23

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;

    new-instance v0, Lio/y;

    invoke-direct {v0, v3, v6}, Lio/y;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    new-instance v1, Lio/b0;

    invoke-direct {v1, v3}, Lio/b0;-><init>(Lym/k$a;)V

    new-instance v4, Lio/c0;

    invoke-direct {v4, v3, v6, v2}, Lio/c0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/high16 v25, 0x10000

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v18, v0

    move-object/from16 v19, v1

    move-object/from16 v21, v4

    invoke-direct/range {v7 .. v26}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;Ljava/lang/String;Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_e
    move-object v6, v1

    move-object/from16 v1, p1

    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const-string v7, ""

    if-eqz v0, :cond_1a

    move-object v0, v2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->L()Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object v5, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->d:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    new-instance v10, Lio/d0;

    invoke-direct {v10, v6, v4, v2, v3}, Lio/d0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)V

    const-class v11, Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-static {v11}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v11

    invoke-static {v3, v5, v11, v7, v10}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_f
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getPromptPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;

    move-result-object v5

    new-instance v15, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->n()Ljava/util/List;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v7

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v10

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v11

    invoke-static {v11}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v7, v10, v11, v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->a0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v7

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v10

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v7, v4, v10, v11}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->Z(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->C()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->E()Ljava/lang/String;

    move-result-object v20

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v21

    new-instance v4, Lio/e0;

    invoke-direct {v4, v3, v6, v2, v1}, Lio/e0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V

    new-instance v7, Lio/f0;

    invoke-direct {v7, v3, v6, v2}, Lio/f0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    new-instance v10, Lio/g0;

    invoke-direct {v10, v3, v6}, Lio/g0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    new-instance v11, Lio/i0;

    invoke-direct {v11, v3}, Lio/i0;-><init>(Lym/k$a;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->O()Ljava/lang/String;

    move-result-object v26

    new-instance v12, Lio/j0;

    invoke-direct {v12, v3, v6, v2}, Lio/j0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v28

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v2

    sget-object v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v13, 0x4

    if-eq v2, v14, :cond_14

    if-eq v2, v8, :cond_13

    const/4 v9, 0x3

    if-eq v2, v9, :cond_10

    if-eq v2, v13, :cond_12

    const/4 v9, 0x5

    if-ne v2, v9, :cond_11

    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getPassportSignaturePictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    :goto_4
    move-object/from16 v29, v9

    goto :goto_5

    :cond_10
    const/16 v29, 0x0

    goto :goto_5

    :cond_11
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_12
    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getBarcodePdf417Pictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_4

    :cond_13
    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getIdBackPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_4

    :cond_14
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v2

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;

    move-result-object v2

    sget-object v9, Lpo/b;->j:Lpo/b;

    if-ne v2, v9, :cond_15

    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getPassportFrontPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_4

    :cond_15
    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getIdFrontPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_4

    :goto_5
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v14, :cond_17

    if-eq v2, v8, :cond_16

    if-eq v2, v13, :cond_16

    sget v0, Lio/p2;->e:I

    :goto_6
    move/from16 v30, v0

    goto :goto_7

    :cond_16
    sget v0, Lio/p2;->d:I

    goto :goto_6

    :cond_17
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v0

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;

    move-result-object v0

    sget-object v2, Lpo/b;->j:Lpo/b;

    if-ne v0, v2, :cond_18

    sget v0, Lio/p2;->f:I

    goto :goto_6

    :cond_18
    sget v0, Lio/p2;->e:I

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->w0()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_19

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v0

    :cond_19
    move-object/from16 v31, v0

    const/high16 v33, 0x10000

    const/16 v34, 0x0

    const/16 v32, 0x0

    move-object/from16 v22, v4

    move-object/from16 v23, v7

    move-object/from16 v24, v10

    move-object/from16 v25, v11

    move-object/from16 v27, v12

    invoke-direct/range {v15 .. v34}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ILjava/lang/String;Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15

    :cond_1a
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v0, :cond_1b

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->g:Llo/t0;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual/range {v0 .. v5}, Llo/t0;->n0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1b
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    if-eqz v0, :cond_1c

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->g:Llo/t0;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    invoke-virtual/range {v0 .. v5}, Llo/t0;->Y(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1c
    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object v9, v5

    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    if-eqz v0, :cond_1f

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v15, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v16, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-object v4, v2

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v5

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v18

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    invoke-static {v0, v15, v13, v8, v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->d(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    move-result-object v0

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v7

    invoke-interface {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->Q()Z

    move-result v10

    if-eqz v10, :cond_1d

    move-object v10, v2

    check-cast v10, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iget-object v11, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    iget-object v12, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->h:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    invoke-static {v1, v10, v3, v11, v12}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V

    :cond_1d
    new-instance v10, Len/d;

    iget-object v11, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b:Lk6/s;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v12

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v15

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v15

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->x()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v15, v14, v13}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->M(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->s()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;->g()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;

    move-result-object v27

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v29

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;

    move-result-object v30

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v28

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    invoke-virtual {v0}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v31

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->n()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->m()Ljava/lang/String;

    move-result-object v35

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v7

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v12

    invoke-static {v12}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->x()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v0, v7, v12, v13}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v38

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->P()Ljava/lang/String;

    move-result-object v39

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getCapturePage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;

    move-result-object v41

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->Q()Z

    move-result v0

    if-nez v0, :cond_1e

    const/16 v42, 0x1

    goto :goto_8

    :cond_1e
    const/16 v42, 0x0

    :goto_8
    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->Q()Z

    move-result v43

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->C()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;

    move-result-object v44

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v45

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->x()Ljava/lang/String;

    move-result-object v47

    new-instance v23, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;

    new-instance v7, Lio/h0;

    invoke-direct {v7, v1, v2, v3, v6}, Lio/h0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    new-instance v0, Lio/s0;

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object v4, v1

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lio/s0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)V

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    move-object v6, v1

    new-instance v1, Lio/d1;

    invoke-direct {v1, v9}, Lio/d1;-><init>(Lym/h;)V

    new-instance v4, Lio/e1;

    invoke-direct {v4, v3, v6, v2}, Lio/e1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/high16 v49, 0x1400000

    const/16 v50, 0x0

    const/16 v46, 0x0

    const/16 v48, 0x0

    move-object/from16 v34, v0

    move-object/from16 v37, v1

    move-object/from16 v40, v4

    move-object/from16 v32, v7

    move-object/from16 v24, v11

    invoke-direct/range {v23 .. v50}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lpo/b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lio/d;ZLjava/lang/String;Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v23 .. v23}, Lcom/withpersona/sdk2/inquiry/permissions/g;->c(Ljava/lang/Object;)Lop/c;

    move-result-object v0

    const/4 v5, 0x0

    invoke-direct {v10, v0, v5, v8, v5}, Len/d;-><init>(Ljava/lang/Object;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10

    :cond_1f
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-eqz v0, :cond_22

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v9, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v10, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-object v4, v2

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v5

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v12

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static {v0, v9, v5, v8, v7}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v0

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->R()Z

    move-result v5

    if-eqz v5, :cond_20

    move-object v5, v2

    check-cast v5, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iget-object v7, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    iget-object v8, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->h:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    invoke-static {v1, v5, v3, v7, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V

    :cond_20
    iget-object v10, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->b:Lk6/s;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v7

    invoke-virtual {v6, v5, v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v0

    invoke-virtual {v6, v5, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->c0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->B0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->y0()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v0

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v0

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->f()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->Q()Ljava/lang/String;

    move-result-object v17

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    invoke-virtual {v0}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v18

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->P()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->R()Z

    move-result v26

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v25

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->G0()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_21

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v0

    :cond_21
    move-object/from16 v27, v0

    new-instance v9, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;

    new-instance v0, Lio/f1;

    invoke-direct {v0, v1, v2, v3, v6}, Lio/f1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    new-instance v1, Lio/g1;

    invoke-direct {v1, v3, v6}, Lio/g1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    new-instance v4, Lio/h1;

    invoke-direct {v4, v3, v6}, Lio/h1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V

    new-instance v5, Lio/i1;

    invoke-direct {v5, v3}, Lio/i1;-><init>(Lym/k$a;)V

    new-instance v7, Lio/j1;

    invoke-direct {v7, v3, v6, v2}, Lio/j1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/high16 v29, 0x40000

    const/16 v30, 0x0

    const/16 v28, 0x0

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v24, v7

    invoke-direct/range {v9 .. v30}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;ZLjava/lang/String;Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_22
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-eqz v0, :cond_23

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->c:Lpo/c$a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->x()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->s()Ljava/lang/String;

    move-result-object v26

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->K()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;

    move-result-object v28

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->N()Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v30

    move-object/from16 v23, v0

    invoke-interface/range {v23 .. v30}, Lpo/c$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;

    move-result-object v0

    new-instance v2, Lio/x;

    invoke-direct {v2, v6, v3}, Lio/x;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V

    const-class v4, Lpo/c;

    invoke-static {v4}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v4

    invoke-static {v3, v0, v4, v7, v2}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    iget-object v8, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    const/16 v13, 0xc

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v14}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    new-instance v15, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->u0()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->s0()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getPendingPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;

    move-result-object v19

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->k:Luq/a;

    invoke-virtual {v0}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v20

    new-instance v0, Lio/z;

    invoke-direct {v0, v6, v3}, Lio/z;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V

    new-instance v2, Lio/a0;

    invoke-direct {v2, v6, v3}, Lio/a0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->A()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v23

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->q0()Ljava/lang/String;

    move-result-object v25

    const/16 v27, 0x500

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v21, v0

    move-object/from16 v22, v2

    invoke-direct/range {v15 .. v28}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLjava/lang/String;Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15

    :cond_23
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-eqz v0, :cond_24

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->e:Luo/j;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v0, v1, v2, v3, v4}, Luo/j;->i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Luo/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_24
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-eqz v0, :cond_25

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->f:Luo/v;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v0, v1, v2, v3, v4}, Luo/v;->j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lym/k$a;Luo/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_25
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v0, :cond_26

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->g:Llo/t0;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Llo/t0;->j0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_26
    if-eqz v4, :cond_27

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->i:Ljo/n;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v0, v1, v2, v3, v4}, Ljo/n;->n(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lym/k$a;Luo/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;

    move-result-object v0

    return-object v0

    :cond_27
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v0, :cond_28

    iget-object v0, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->i:Ljo/n;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    iget-object v4, v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->o:Luo/l;

    invoke-virtual {v0, v1, v2, v3, v4}, Ljo/n;->t(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lym/k$a;Luo/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v0

    return-object v0

    :cond_28
    instance-of v0, v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz v0, :cond_29

    const/4 v5, 0x0

    invoke-virtual {v6, v1, v5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->f0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;

    invoke-direct {v1, v6, v3, v0, v5}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V

    const-string v0, "restart_step"

    invoke-virtual {v3, v0, v1}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;

    const/4 v1, 0x1

    invoke-direct {v0, v5, v1, v5}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;-><init>(Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_29
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method
