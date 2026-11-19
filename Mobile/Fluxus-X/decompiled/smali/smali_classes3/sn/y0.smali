.class public final Lsn/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsn/y0$a;,
        Lsn/y0$b;,
        Lsn/y0$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 &2\u00020\u0001:\u0003\u0013\u0011\u0015B)\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u001bR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006\'"
    }
    d2 = {
        "Lsn/y0;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lf1/r0;",
        "recorder",
        "Ler/c;",
        "sdkFilesManager",
        "",
        "isAudioRequired",
        "<init>",
        "(Landroid/content/Context;Lf1/r0;Ler/c;Z)V",
        "Lzt/n;",
        "Ljava/io/File;",
        "e",
        "(Leu/b;)Ljava/lang/Object;",
        "",
        "c",
        "()V",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lf1/r0;",
        "Ler/c;",
        "d",
        "Z",
        "Ljava/util/concurrent/Executor;",
        "Ljava/util/concurrent/Executor;",
        "recordingExecutor",
        "Ldv/c0;",
        "Lsn/y0$c;",
        "f",
        "Ldv/c0;",
        "videoStateFlow",
        "Lsn/y0$b;",
        "g",
        "Lsn/y0$b;",
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
.field public static final h:Lsn/y0$a;
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

.field public final c:Ler/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Z

.field public final e:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Lsn/y0$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Lsn/y0$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsn/y0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsn/y0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsn/y0;->h:Lsn/y0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf1/r0;Ler/c;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf1/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ler/c;
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

    iput-object p1, p0, Lsn/y0;->a:Landroid/content/Context;

    iput-object p2, p0, Lsn/y0;->b:Lf1/r0;

    iput-object p3, p0, Lsn/y0;->c:Ler/c;

    iput-boolean p4, p0, Lsn/y0;->d:Z

    invoke-static {p1}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p1

    const-string p2, "getMainExecutor(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsn/y0;->e:Ljava/util/concurrent/Executor;

    sget-object p1, Lsn/y0$c;->a:Lsn/y0$c;

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lsn/y0;->f:Ldv/c0;

    return-void
.end method

.method public static synthetic a(Lsn/y0;Lf1/b2;)V
    .locals 0

    invoke-static {p0, p1}, Lsn/y0;->d(Lsn/y0;Lf1/b2;)V

    return-void
.end method

.method public static final synthetic b(Lsn/y0;)V
    .locals 0

    invoke-virtual {p0}, Lsn/y0;->c()V

    return-void
.end method

.method public static final d(Lsn/y0;Lf1/b2;)V
    .locals 5

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsn/y0;->g:Lsn/y0$b;

    instance-of v1, p1, Lf1/b2$d;

    if-eqz v1, :cond_0

    iget-object p0, p0, Lsn/y0;->f:Ldv/c0;

    sget-object p1, Lsn/y0$c;->b:Lsn/y0$c;

    invoke-interface {p0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v1, p1, Lf1/b2$a;

    if-eqz v1, :cond_4

    check-cast p1, Lf1/b2$a;

    invoke-virtual {p1}, Lf1/b2$a;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    new-instance v1, Lsn/f0;

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

    invoke-direct {v1, v2, p1}, Lsn/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lsn/y0$b;->d(Ljava/lang/Throwable;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lsn/y0$b;->c()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lsn/y0$b;->a()V

    :cond_3
    const/4 p1, 0x0

    iput-object p1, p0, Lsn/y0;->g:Lsn/y0$b;

    iget-object p0, p0, Lsn/y0;->f:Ldv/c0;

    sget-object p1, Lsn/y0$c;->c:Lsn/y0$c;

    invoke-interface {p0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

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

    iget-object v0, p0, Lsn/y0;->g:Lsn/y0$b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsn/y0;->c:Ler/c;

    const-string v1, "mp4"

    invoke-virtual {v0, v1}, Ler/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lsn/y0;->a:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v2}, Ll2/g;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Lsn/y0;->d:Z

    if-eqz v2, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lsn/p0;

    invoke-direct {v0}, Lsn/p0;-><init>()V

    throw v0

    :cond_3
    :goto_1
    iget-object v2, p0, Lsn/y0;->b:Lf1/r0;

    iget-object v3, p0, Lsn/y0;->a:Landroid/content/Context;

    new-instance v4, Lf1/r$a;

    invoke-direct {v4, v0}, Lf1/r$a;-><init>(Ljava/io/File;)V

    invoke-virtual {v4}, Lf1/r$a;->a()Lf1/r;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lf1/r0;->d0(Landroid/content/Context;Lf1/r;)Lf1/w;

    move-result-object v2

    iget-boolean v3, p0, Lsn/y0;->d:Z

    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lf1/w;->j()Lf1/w;

    :cond_4
    const-string v1, "apply(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsn/x0;

    invoke-direct {v1, p0}, Lsn/x0;-><init>(Lsn/y0;)V

    iget-object v3, p0, Lsn/y0;->e:Ljava/util/concurrent/Executor;

    invoke-virtual {v2, v3, v1}, Lf1/w;->i(Ljava/util/concurrent/Executor;Lx2/a;)Lf1/e1;

    move-result-object v1

    const-string v2, "start(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lsn/y0$b;

    invoke-direct {v2, v1, v0}, Lsn/y0$b;-><init>(Lf1/e1;Ljava/io/File;)V

    iput-object v2, p0, Lsn/y0;->g:Lsn/y0$b;

    return-void
.end method

.method public final e(Leu/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lzt/n<",
            "+",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lsn/y0$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lsn/y0$d;

    iget v1, v0, Lsn/y0$d;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsn/y0$d;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsn/y0$d;

    invoke-direct {v0, p0, p1}, Lsn/y0$d;-><init>(Lsn/y0;Leu/b;)V

    :goto_0
    iget-object p1, v0, Lsn/y0$d;->v:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lsn/y0$d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lsn/y0$d;->u:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v0, v0, Lsn/y0$d;->t:Ljava/lang/Object;

    check-cast v0, Lsn/y0$b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lsn/y0;->g:Lsn/y0$b;

    if-nez p1, :cond_3

    sget-object p1, Lzt/n;->b:Lzt/n$a;

    new-instance p1, Lsn/t0;

    invoke-direct {p1}, Lsn/t0;-><init>()V

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lsn/y0$b;->c()Ljava/io/File;

    move-result-object v2

    invoke-virtual {p1}, Lsn/y0$b;->e()V

    iget-object v4, p0, Lsn/y0;->f:Ldv/c0;

    new-instance v5, Lsn/y0$e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lsn/y0$e;-><init>(Leu/b;)V

    invoke-static {v4, v5}, Ldv/j;->O(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v4

    iput-object p1, v0, Lsn/y0$d;->t:Ljava/lang/Object;

    iput-object v2, v0, Lsn/y0$d;->u:Ljava/lang/Object;

    iput v3, v0, Lsn/y0$d;->x:I

    invoke-static {v4, v0}, Ldv/j;->i(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p1

    move-object v1, v2

    :goto_1
    invoke-virtual {v0}, Lsn/y0$b;->b()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    sget-object v0, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {v1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
