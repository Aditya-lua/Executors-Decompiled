.class public final Lcom/withpersona/sdk2/camera/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/camera/h$a;,
        Lcom/withpersona/sdk2/camera/h$b;,
        Lcom/withpersona/sdk2/camera/h$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 &2\u00020\u0001:\u0003\u0013\u0011\u0015B)\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u001bR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/withpersona/sdk2/camera/h;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lf1/r0;",
        "recorder",
        "Lqq/c;",
        "sdkFilesManager",
        "",
        "isAudioRequired",
        "<init>",
        "(Landroid/content/Context;Lf1/r0;Lqq/c;Z)V",
        "Ljt/n;",
        "Ljava/io/File;",
        "e",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "c",
        "()V",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lf1/r0;",
        "Lqq/c;",
        "d",
        "Z",
        "Ljava/util/concurrent/Executor;",
        "Ljava/util/concurrent/Executor;",
        "recordingExecutor",
        "Lnu/c0;",
        "Lcom/withpersona/sdk2/camera/h$c;",
        "f",
        "Lnu/c0;",
        "videoStateFlow",
        "Lcom/withpersona/sdk2/camera/h$b;",
        "g",
        "Lcom/withpersona/sdk2/camera/h$b;",
        "currentSession",
        "h",
        "camera_release"
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
.field public static final h:Lcom/withpersona/sdk2/camera/h$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lf1/r0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Z

.field public final e:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "Lcom/withpersona/sdk2/camera/h$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Lcom/withpersona/sdk2/camera/h$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/camera/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/camera/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/camera/h;->h:Lcom/withpersona/sdk2/camera/h$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf1/r0;Lqq/c;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf1/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recorder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/camera/h;->b:Lf1/r0;

    iput-object p3, p0, Lcom/withpersona/sdk2/camera/h;->c:Lqq/c;

    iput-boolean p4, p0, Lcom/withpersona/sdk2/camera/h;->d:Z

    invoke-static {p1}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p1

    const-string p2, "getMainExecutor(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/h;->e:Ljava/util/concurrent/Executor;

    sget-object p1, Lcom/withpersona/sdk2/camera/h$c;->a:Lcom/withpersona/sdk2/camera/h$c;

    invoke-static {p1}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/h;->f:Lnu/c0;

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/camera/h;Lf1/b2;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/camera/h;->d(Lcom/withpersona/sdk2/camera/h;Lf1/b2;)V

    return-void
.end method

.method public static final synthetic b(Lcom/withpersona/sdk2/camera/h;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/h;->c()V

    return-void
.end method

.method public static final d(Lcom/withpersona/sdk2/camera/h;Lf1/b2;)V
    .locals 5

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/h;->g:Lcom/withpersona/sdk2/camera/h$b;

    instance-of v1, p1, Lf1/b2$d;

    if-eqz v1, :cond_0

    iget-object p0, p0, Lcom/withpersona/sdk2/camera/h;->f:Lnu/c0;

    sget-object p1, Lcom/withpersona/sdk2/camera/h$c;->b:Lcom/withpersona/sdk2/camera/h$c;

    invoke-interface {p0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v1, p1, Lf1/b2$a;

    if-eqz v1, :cond_4

    check-cast p1, Lf1/b2$a;

    invoke-virtual {p1}, Lf1/b2$a;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    new-instance v1, Lfn/v;

    invoke-virtual {p1}, Lf1/b2$a;->j()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Recording completed with error code "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lf1/b2$a;->i()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lfn/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/camera/h$b;->d(Ljava/lang/Throwable;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/h$b;->c()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/h$b;->a()V

    :cond_3
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/h;->g:Lcom/withpersona/sdk2/camera/h$b;

    iget-object p0, p0, Lcom/withpersona/sdk2/camera/h;->f:Lnu/c0;

    sget-object p1, Lcom/withpersona/sdk2/camera/h$c;->c:Lcom/withpersona/sdk2/camera/h$c;

    invoke-interface {p0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/h;->g:Lcom/withpersona/sdk2/camera/h$b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/camera/h;->c:Lqq/c;

    const-string v1, "mp4"

    invoke-virtual {v0, v1}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/camera/h;->a:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v2}, Ll2/g;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Lcom/withpersona/sdk2/camera/h;->d:Z

    if-eqz v2, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lfn/d0;

    invoke-direct {v0}, Lfn/d0;-><init>()V

    throw v0

    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/withpersona/sdk2/camera/h;->b:Lf1/r0;

    iget-object v3, p0, Lcom/withpersona/sdk2/camera/h;->a:Landroid/content/Context;

    new-instance v4, Lf1/r$a;

    invoke-direct {v4, v0}, Lf1/r$a;-><init>(Ljava/io/File;)V

    invoke-virtual {v4}, Lf1/r$a;->a()Lf1/r;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lf1/r0;->d0(Landroid/content/Context;Lf1/r;)Lf1/w;

    move-result-object v2

    iget-boolean v3, p0, Lcom/withpersona/sdk2/camera/h;->d:Z

    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lf1/w;->j()Lf1/w;

    :cond_4
    const-string v1, "apply(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfn/k0;

    invoke-direct {v1, p0}, Lfn/k0;-><init>(Lcom/withpersona/sdk2/camera/h;)V

    iget-object v3, p0, Lcom/withpersona/sdk2/camera/h;->e:Ljava/util/concurrent/Executor;

    invoke-virtual {v2, v3, v1}, Lf1/w;->i(Ljava/util/concurrent/Executor;Lx2/a;)Lf1/e1;

    move-result-object v1

    const-string v2, "start(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/withpersona/sdk2/camera/h$b;

    invoke-direct {v2, v1, v0}, Lcom/withpersona/sdk2/camera/h$b;-><init>(Lf1/e1;Ljava/io/File;)V

    iput-object v2, p0, Lcom/withpersona/sdk2/camera/h;->g:Lcom/withpersona/sdk2/camera/h$b;

    return-void
.end method

.method public final e(Lnt/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "+",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/camera/h$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/camera/h$d;

    iget v1, v0, Lcom/withpersona/sdk2/camera/h$d;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/camera/h$d;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/camera/h$d;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/camera/h$d;-><init>(Lcom/withpersona/sdk2/camera/h;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/camera/h$d;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/camera/h$d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/withpersona/sdk2/camera/h$d;->u:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v0, v0, Lcom/withpersona/sdk2/camera/h$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/camera/h$b;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/h;->g:Lcom/withpersona/sdk2/camera/h$b;

    if-nez p1, :cond_3

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Lfn/h0;

    invoke-direct {p1}, Lfn/h0;-><init>()V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/h$b;->c()Ljava/io/File;

    move-result-object v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/h$b;->e()V

    iget-object v4, p0, Lcom/withpersona/sdk2/camera/h;->f:Lnu/c0;

    new-instance v5, Lcom/withpersona/sdk2/camera/h$e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/camera/h$e;-><init>(Lnt/b;)V

    invoke-static {v4, v5}, Lnu/j;->N(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v4

    iput-object p1, v0, Lcom/withpersona/sdk2/camera/h$d;->t:Ljava/lang/Object;

    iput-object v2, v0, Lcom/withpersona/sdk2/camera/h$d;->u:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/camera/h$d;->x:I

    invoke-static {v4, v0}, Lnu/j;->i(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p1

    move-object v1, v2

    :goto_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/h$b;->b()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
