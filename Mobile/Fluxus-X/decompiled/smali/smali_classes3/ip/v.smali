.class public final Lip/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJM\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u00132\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lip/v;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lsn/a0$a;",
        "cameraXControllerFactory",
        "Lun/c$a;",
        "camera2ControllerFactory",
        "Lir/b;",
        "navigationStateManager",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "Lvo/d2$a;",
        "renderProps",
        "Lvo/j0$f;",
        "renderState",
        "Lln/k$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;",
        "Lln/k;",
        "Lvo/j0;",
        "Lvo/d2$b;",
        "context",
        "Lip/l;",
        "videoCaptureHelper",
        "j",
        "(Lvo/d2$a;Lvo/j0$f;Lln/k$a;Lip/l;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lsn/a0$a;",
        "c",
        "Lun/c$a;",
        "d",
        "Lir/b;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
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

.field public final b:Lsn/a0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lun/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lir/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsn/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lun/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lir/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraXControllerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera2ControllerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/v;->a:Landroid/content/Context;

    iput-object p2, p0, Lip/v;->b:Lsn/a0$a;

    iput-object p3, p0, Lip/v;->c:Lun/c$a;

    iput-object p4, p0, Lip/v;->d:Lir/b;

    iput-object p5, p0, Lip/v;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/v;->q(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lip/v;->r()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lln/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/v;->n(Lln/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lln/k$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lip/v;->p(Lln/k$a;Lip/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lln/k$a;Lip/l;Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lip/v;->l(Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lln/k$a;Lip/l;Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/util/List;Lsn/v;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lip/v;->m(Ljava/util/List;Lsn/v;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/v;->o(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lip/v;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lip/v;->s(Lip/v;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lln/k$a;Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lip/l;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lip/v;->k(Lln/k$a;Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lip/l;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lln/k$a;Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lip/l;Ljava/lang/String;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object v0

    new-instance v1, Lip/t;

    move-object v6, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lip/t;-><init>(Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lln/k$a;Lip/l;Ljava/lang/String;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {p1, v1, p0, p1}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object p0

    invoke-interface {v0, p0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lln/k$a;Lip/l;Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;
    .locals 14

    const-string v0, "$this$action"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lip/v;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-virtual {p1}, Lvo/d2$a;->t()Ljava/lang/String;

    move-result-object v2

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const-string v3, "Stream"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStopEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;ZILjava/lang/Object;)V

    invoke-interface/range {p2 .. p2}, Lks/a;->isConnected()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface/range {p2 .. p2}, Lks/a;->e()V

    invoke-virtual/range {p3 .. p3}, Lvo/j0$f;->G()Lvo/d3;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Lvo/j0$f;->C()Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {p3 .. p3}, Lvo/j0$f;->f()Lsn/v;

    move-result-object v6

    const/16 v12, 0xa00

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v2, p1

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v5, p5

    move-object/from16 v10, p6

    invoke-static/range {v0 .. v13}, Lvo/b3;->X(Lvo/j0;Lln/k$a;Lvo/d2$a;Lvo/n;Lvo/d3;Lip/l;Lsn/v;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Ljava/util/List;Lsn/v;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Lln/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lip/u;

    invoke-direct {v0}, Lip/u;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lln/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/d2$b$b;->a:Lvo/d2$b$b;

    invoke-virtual {p0, v0}, Lln/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lln/k$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvo/b3;->S(Lln/k$a;Lip/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final q(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final s(Lip/v;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;
    .locals 1

    iget-object p0, p0, Lip/v;->a:Landroid/content/Context;

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lvo/b3;->U(Landroid/content/Context;Lln/k$a;Lvo/d2$a;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final j(Lvo/d2$a;Lvo/j0$f;Lln/k$a;Lip/l;)Ljava/lang/Object;
    .locals 40
    .param p1    # Lvo/d2$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/j0$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lln/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lip/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Lvo/j0$f;",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lip/l;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v0, p3

    move-object/from16 v6, p4

    const-string v2, "renderProps"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "renderState"

    move-object/from16 v15, p2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "videoCaptureHelper"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lip/l;->b()Lks/a;

    move-result-object v32

    if-eqz v32, :cond_0

    invoke-virtual {v1}, Lvo/d2$a;->t()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lip/m;

    move-object/from16 v2, p0

    move-object v3, v1

    move-object v5, v15

    move-object/from16 v4, v32

    move-object/from16 v1, p3

    invoke-direct/range {v0 .. v6}, Lip/m;-><init>(Lln/k$a;Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lip/l;)V

    move-object/from16 v39, v3

    move-object v3, v0

    move-object v0, v2

    move-object v2, v1

    move-object/from16 v1, v39

    invoke-interface {v4, v7, v3}, Lks/a;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    move-object/from16 v4, v32

    move-object/from16 v0, p0

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->y()Lvo/i3;

    move-result-object v3

    instance-of v5, v3, Lvo/i3$a;

    if-eqz v5, :cond_1

    check-cast v3, Lvo/i3$a;

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lvo/i3$a;->a()Lvo/d3$e;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object v8, v3

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v3, Lvo/d3$e;->d:Lvo/d3$e;

    goto :goto_2

    :goto_4
    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->G()Lvo/d3;

    move-result-object v3

    invoke-virtual {v3, v8}, Lvo/d3;->g(Lvo/d3$e;)Lvo/d3$c;

    move-result-object v3

    new-instance v5, Lrn/d;

    invoke-virtual {v1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->G()Lvo/d3;

    move-result-object v10

    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->x()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v8, v10, v11}, Lvo/b3;->K(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->G()Lvo/d3;

    move-result-object v11

    invoke-virtual {v11}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->x()Ljava/lang/String;

    move-result-object v12

    invoke-static {v10, v8, v11, v12}, Lvo/b3;->J(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v11

    invoke-virtual {v11}, Lvo/d2$a$b;->w()Ljava/lang/String;

    move-result-object v11

    move-object v12, v5

    sget-object v5, Lvo/y3$b$a;->a:Lvo/y3$b$a;

    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->G()Lvo/d3;

    move-result-object v13

    invoke-virtual {v13}, Lvo/d3;->i()Ldp/e;

    move-result-object v13

    invoke-virtual {v3}, Lvo/d3$c;->g()Lvo/y3$f;

    move-result-object v3

    iget-object v14, v0, Lip/v;->d:Lir/b;

    invoke-virtual {v14}, Lir/b;->b()Lir/a;

    move-result-object v14

    move-object v15, v9

    move-object v9, v14

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lvo/j0$f;->B()I

    move-result v16

    const/4 v7, 0x0

    invoke-static {v2, v7}, Lvo/b3;->z(Lln/k$a;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v21

    sget-object v22, Lzn/a;->a:Lzn/a;

    iget-object v7, v0, Lip/v;->b:Lsn/a0$a;

    move-object/from16 v18, v3

    iget-object v3, v0, Lip/v;->c:Lun/c$a;

    move-object/from16 v19, v18

    move-object/from16 v18, v3

    move-object v3, v10

    new-instance v10, Lip/n;

    invoke-direct {v10}, Lip/n;-><init>()V

    move-object/from16 v32, v4

    move-object v4, v11

    new-instance v11, Lip/o;

    invoke-direct {v11, v2}, Lip/o;-><init>(Lln/k$a;)V

    move-object/from16 v20, v12

    new-instance v12, Lip/p;

    invoke-direct {v12, v2, v6}, Lip/p;-><init>(Lln/k$a;Lip/l;)V

    move-object/from16 v6, v20

    new-instance v20, Lip/q;

    invoke-direct/range {v20 .. v20}, Lip/q;-><init>()V

    new-instance v27, Lip/r;

    invoke-direct/range {v27 .. v27}, Lip/r;-><init>()V

    move-object/from16 v23, v3

    new-instance v3, Lip/s;

    invoke-direct {v3, v0, v2, v1}, Lip/s;-><init>(Lip/v;Lln/k$a;Lvo/d2$a;)V

    const/16 v36, 0x3

    const/16 v37, 0x0

    move-object/from16 v17, v7

    move-object v7, v13

    const/4 v2, 0x0

    const/4 v13, 0x0

    move-object/from16 v24, v6

    move-object/from16 v6, v19

    const/16 v19, 0x0

    move-object/from16 v28, v3

    move-object/from16 v3, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x1

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    move-object/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v34, v33

    const/16 v33, 0x0

    move-object/from16 v35, v34

    const/16 v34, 0x0

    move-object/from16 v38, v35

    const/high16 v35, 0x63040000

    move-object v2, v15

    move-object/from16 v0, v38

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v37}, Lvo/i0;->g(Lvo/d2$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$b$a;Lvo/y3$f;Ldp/e;Lvo/d3$e;Lir/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lvo/j0;ILsn/a0$a;Lun/c$a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzn/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lzo/i;Lks/a;ZLkr/l;IILjava/lang/Object;)Lvo/y3$b;

    move-result-object v1

    invoke-static {v1}, Lfq/y1;->c(Ljava/lang/Object;)Lcq/c;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lrn/d;-><init>(Ljava/lang/Object;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
