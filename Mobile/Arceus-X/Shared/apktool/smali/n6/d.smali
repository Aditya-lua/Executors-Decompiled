.class public final Ln6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln6/d$a;,
        Ln6/d$b;,
        Ln6/d$c;,
        Ln6/d$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0008\u0004*\u0001`\u0008\u0000\u0018\u0000 b2\u00060\u0001j\u0002`\u0002:\u0004;8:6B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0012J#\u0010 \u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u001b\u0010&\u001a\u00020\u001e2\n\u0010%\u001a\u00060$R\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008)\u0010\u0012J\u000f\u0010*\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008*\u0010#J\u000f\u0010+\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008.\u0010\u0019J\r\u0010/\u001a\u00020\u0010\u00a2\u0006\u0004\u0008/\u0010\u0012J\u001e\u00101\u001a\u0008\u0018\u000100R\u00020\u00002\u0006\u0010-\u001a\u00020\u0016H\u0086\u0002\u00a2\u0006\u0004\u00081\u00102J\u001b\u00103\u001a\u0008\u0018\u00010\u001cR\u00020\u00002\u0006\u0010-\u001a\u00020\u0016\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00085\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010\u0014R\u0014\u0010=\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u00107R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00107R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u00107R$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0008\u0012\u00060$R\u00020\u00000B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0018\u0010N\u001a\u00060Jj\u0002`K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u00109R\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010\u0014R\u0018\u0010U\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0016\u0010W\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010)R\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010)R\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010)R\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010)R\u0016\u0010_\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008^\u0010)R\u0014\u0010\u0004\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010a\u00a8\u0006c"
    }
    d2 = {
        "Ln6/d;",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "Lxu/l;",
        "fileSystem",
        "Lxu/h0;",
        "directory",
        "Lkotlin/coroutines/CoroutineContext;",
        "cleanupCoroutineContext",
        "",
        "maxSize",
        "",
        "appVersion",
        "valueCount",
        "<init>",
        "(Lxu/l;Lxu/h0;Lkotlin/coroutines/CoroutineContext;JII)V",
        "",
        "P",
        "()V",
        "Lxu/f;",
        "I",
        "()Lxu/f;",
        "",
        "line",
        "U",
        "(Ljava/lang/String;)V",
        "M",
        "b0",
        "Ln6/d$b;",
        "editor",
        "",
        "success",
        "u",
        "(Ln6/d$b;Z)V",
        "F",
        "()Z",
        "Ln6/d$c;",
        "entry",
        "X",
        "(Ln6/d$c;)Z",
        "s",
        "Z",
        "Y",
        "v",
        "H",
        "key",
        "a0",
        "B",
        "Ln6/d$d;",
        "y",
        "(Ljava/lang/String;)Ln6/d$d;",
        "w",
        "(Ljava/lang/String;)Ln6/d$b;",
        "close",
        "a",
        "Lxu/h0;",
        "b",
        "J",
        "c",
        "d",
        "e",
        "journalFile",
        "f",
        "journalFileTmp",
        "g",
        "journalFileBackup",
        "",
        "h",
        "Ljava/util/Map;",
        "lruEntries",
        "Lku/p0;",
        "i",
        "Lku/p0;",
        "cleanupScope",
        "",
        "Lkotlinx/atomicfu/locks/SynchronizedObject;",
        "j",
        "Ljava/lang/Object;",
        "lock",
        "k",
        "size",
        "l",
        "operationsSinceRewrite",
        "m",
        "Lxu/f;",
        "journalWriter",
        "n",
        "hasJournalErrors",
        "o",
        "initialized",
        "p",
        "closed",
        "q",
        "mostRecentTrimFailed",
        "r",
        "mostRecentRebuildFailed",
        "n6/d$e",
        "Ln6/d$e;",
        "t",
        "coil-core_release"
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
.field public static final t:Ln6/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final u:Lkotlin/text/Regex;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lxu/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:J

.field public final c:I

.field public final d:I

.field public final e:Lxu/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lxu/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lxu/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/d$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public k:J

.field public l:I

.field public m:Lxu/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public final s:Ln6/d$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln6/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln6/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln6/d;->t:Ln6/d$a;

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[a-z0-9_-]{1,120}"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Ln6/d;->u:Lkotlin/text/Regex;

    return-void
.end method

.method public constructor <init>(Lxu/l;Lxu/h0;Lkotlin/coroutines/CoroutineContext;JII)V
    .locals 2
    .param p1    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln6/d;->a:Lxu/h0;

    iput-wide p4, p0, Ln6/d;->b:J

    iput p6, p0, Ln6/d;->c:I

    iput p7, p0, Ln6/d;->d:I

    const-wide/16 v0, 0x0

    cmp-long p4, p4, v0

    if-lez p4, :cond_2

    if-lez p7, :cond_1

    const-string p4, "journal"

    invoke-virtual {p2, p4}, Lxu/h0;->n(Ljava/lang/String;)Lxu/h0;

    move-result-object p4

    iput-object p4, p0, Ln6/d;->e:Lxu/h0;

    const-string p4, "journal.tmp"

    invoke-virtual {p2, p4}, Lxu/h0;->n(Ljava/lang/String;)Lxu/h0;

    move-result-object p4

    iput-object p4, p0, Ln6/d;->f:Lxu/h0;

    const-string p4, "journal.bkp"

    invoke-virtual {p2, p4}, Lxu/h0;->n(Ljava/lang/String;)Lxu/h0;

    move-result-object p2

    iput-object p2, p0, Ln6/d;->g:Lxu/h0;

    const/4 p2, 0x0

    const/4 p4, 0x3

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-static {p5, p2, p4, p6}, Le7/d;->b(IFILjava/lang/Object;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Ln6/d;->h:Ljava/util/Map;

    const/4 p2, 0x1

    invoke-static {p6, p2, p6}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object p4

    invoke-interface {p3, p4}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p4

    invoke-static {p3}, Le7/h0;->j(Lkotlin/coroutines/CoroutineContext;)Lku/l0;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {}, Le7/f;->a()Lku/l0;

    move-result-object p3

    :cond_0
    const/4 p5, 0x2

    invoke-static {p3, p2, p6, p5, p6}, Lku/l0;->U(Lku/l0;ILjava/lang/String;ILjava/lang/Object;)Lku/l0;

    move-result-object p2

    invoke-interface {p4, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-static {p2}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p2

    iput-object p2, p0, Ln6/d;->i:Lku/p0;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln6/d;->j:Ljava/lang/Object;

    new-instance p2, Ln6/d$e;

    invoke-direct {p2, p1}, Ln6/d$e;-><init>(Lxu/l;)V

    iput-object p2, p0, Ln6/d;->s:Ln6/d$e;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "valueCount <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "maxSize <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final L(Ln6/d;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln6/d;->n:Z

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Ln6/d;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Ln6/d;->L(Ln6/d;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ln6/d;Ln6/d$b;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ln6/d;->u(Ln6/d$b;Z)V

    return-void
.end method

.method public static final synthetic c(Ln6/d;)Z
    .locals 0

    iget-boolean p0, p0, Ln6/d;->p:Z

    return p0
.end method

.method public static final synthetic d(Ln6/d;)Lxu/h0;
    .locals 0

    iget-object p0, p0, Ln6/d;->a:Lxu/h0;

    return-object p0
.end method

.method public static final synthetic e(Ln6/d;)Ln6/d$e;
    .locals 0

    iget-object p0, p0, Ln6/d;->s:Ln6/d$e;

    return-object p0
.end method

.method public static final synthetic f(Ln6/d;)Z
    .locals 0

    iget-boolean p0, p0, Ln6/d;->o:Z

    return p0
.end method

.method public static final synthetic g(Ln6/d;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ln6/d;->j:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic h(Ln6/d;)I
    .locals 0

    iget p0, p0, Ln6/d;->d:I

    return p0
.end method

.method public static final synthetic j(Ln6/d;)Z
    .locals 0

    invoke-virtual {p0}, Ln6/d;->F()Z

    move-result p0

    return p0
.end method

.method public static final synthetic l(Ln6/d;Ln6/d$c;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ln6/d;->X(Ln6/d$c;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic m(Ln6/d;Lxu/f;)V
    .locals 0

    iput-object p1, p0, Ln6/d;->m:Lxu/f;

    return-void
.end method

.method public static final synthetic n(Ln6/d;Z)V
    .locals 0

    iput-boolean p1, p0, Ln6/d;->r:Z

    return-void
.end method

.method public static final synthetic o(Ln6/d;Z)V
    .locals 0

    iput-boolean p1, p0, Ln6/d;->q:Z

    return-void
.end method

.method public static final synthetic q(Ln6/d;)V
    .locals 0

    invoke-virtual {p0}, Ln6/d;->Z()V

    return-void
.end method

.method public static final synthetic r(Ln6/d;)V
    .locals 0

    invoke-virtual {p0}, Ln6/d;->b0()V

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 4

    iget-object v0, p0, Ln6/d;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ln6/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->f:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->delete(Lxu/h0;)V

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->g:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->g:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->delete(Lxu/h0;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->g:Lxu/h0;

    iget-object v3, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2, v3}, Lxu/n;->atomicMove(Lxu/h0;Lxu/h0;)V

    :cond_2
    :goto_0
    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    :try_start_2
    invoke-virtual {p0}, Ln6/d;->P()V

    invoke-virtual {p0}, Ln6/d;->M()V

    iput-boolean v2, p0, Ln6/d;->o:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catch_0
    const/4 v1, 0x0

    :try_start_3
    invoke-virtual {p0}, Ln6/d;->v()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iput-boolean v1, p0, Ln6/d;->p:Z

    goto :goto_1

    :catchall_1
    move-exception v2

    iput-boolean v1, p0, Ln6/d;->p:Z

    throw v2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Ln6/d;->b0()V

    iput-boolean v2, p0, Ln6/d;->o:Z

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final F()Z
    .locals 2

    iget v0, p0, Ln6/d;->l:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final H()V
    .locals 6

    iget-object v0, p0, Ln6/d;->i:Lku/p0;

    new-instance v3, Ln6/d$f;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Ln6/d$f;-><init>(Ln6/d;Lnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final I()Lxu/f;
    .locals 3

    iget-object v0, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v1, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v0, v1}, Lxu/l;->appendingSink(Lxu/h0;)Lxu/p0;

    move-result-object v0

    new-instance v1, Ln6/e;

    new-instance v2, Ln6/c;

    invoke-direct {v2, p0}, Ln6/c;-><init>(Ln6/d;)V

    invoke-direct {v1, v0, v2}, Ln6/e;-><init>(Lxu/p0;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v1}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object v0

    return-object v0
.end method

.method public final M()V
    .locals 9

    iget-object v0, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/d$c;

    invoke-virtual {v3}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    iget v4, p0, Ln6/d;->d:I

    :goto_1
    if-ge v5, v4, :cond_0

    invoke-virtual {v3}, Ln6/d$c;->e()[J

    move-result-object v6

    aget-wide v7, v6, v5

    add-long/2addr v1, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ln6/d$c;->i(Ln6/d$b;)V

    iget v4, p0, Ln6/d;->d:I

    :goto_2
    if-ge v5, v4, :cond_2

    iget-object v6, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v3}, Ln6/d$c;->a()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxu/h0;

    invoke-virtual {v6, v7}, Lxu/l;->delete(Lxu/h0;)V

    iget-object v6, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v3}, Ln6/d$c;->c()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxu/h0;

    invoke-virtual {v6, v7}, Lxu/l;->delete(Lxu/h0;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    iput-wide v1, p0, Ln6/d;->k:J

    return-void
.end method

.method public final P()V
    .locals 10

    const-string v0, ", "

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->source(Lxu/h0;)Lxu/r0;

    move-result-object v1

    invoke-static {v1}, Lxu/b0;->c(Lxu/r0;)Lxu/g;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Lxu/g;->b1()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lxu/g;->b1()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Lxu/g;->b1()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Lxu/g;->b1()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Lxu/g;->b1()Ljava/lang/String;

    move-result-object v6

    const-string v7, "libcore.io.DiskLruCache"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "1"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget v7, p0, Ln6/d;->c:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget v7, p0, Ln6/d;->d:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v7, :cond_2

    const/4 v0, 0x0

    :goto_0
    :try_start_1
    invoke-interface {v1}, Lxu/g;->b1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ln6/d;->U(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    :try_start_2
    iget-object v2, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Ln6/d;->l:I

    invoke-interface {v1}, Lxu/g;->Z1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln6/d;->b0()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ln6/d;->I()Lxu/f;

    move-result-object v0

    iput-object v0, p0, Ln6/d;->m:Lxu/f;

    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    :try_start_3
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_1
    :goto_2
    const/4 v0, 0x0

    goto :goto_4

    :cond_2
    :try_start_4
    new-instance v7, Ljava/io/IOException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "unexpected journal header: ["

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    if-eqz v1, :cond_3

    :try_start_5
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v1

    invoke-static {v0, v1}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_3
    :goto_4
    if-nez v0, :cond_4

    return-void

    :cond_4
    throw v0
.end method

.method public final U(Ljava/lang/String;)V
    .locals 19

    move-object/from16 v0, p0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v7

    const-string v8, "unexpected journal line: "

    const/4 v9, -0x1

    if-eq v7, v9, :cond_6

    add-int/lit8 v3, v7, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    const-string v4, "substring(...)"

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v10, 0x0

    if-ne v2, v9, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x6

    if-ne v7, v11, :cond_1

    const-string v11, "REMOVE"

    invoke-static {v1, v11, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v1, v0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v11, v0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_2

    new-instance v12, Ln6/d$c;

    invoke-direct {v12, v0, v3}, Ln6/d$c;-><init>(Ln6/d;Ljava/lang/String;)V

    invoke-interface {v11, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v12, Ln6/d$c;

    const/4 v3, 0x5

    if-eq v2, v9, :cond_3

    if-ne v7, v3, :cond_3

    const-string v11, "CLEAN"

    invoke-static {v1, v11, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v14, v3, [C

    const/16 v1, 0x20

    aput-char v1, v14, v6

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->P0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v12, v3}, Ln6/d$c;->l(Z)V

    invoke-virtual {v12, v10}, Ln6/d$c;->i(Ln6/d$b;)V

    invoke-virtual {v12, v1}, Ln6/d$c;->j(Ljava/util/List;)V

    return-void

    :cond_3
    if-ne v2, v9, :cond_4

    if-ne v7, v3, :cond_4

    const-string v3, "DIRTY"

    invoke-static {v1, v3, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v1, Ln6/d$b;

    invoke-direct {v1, v0, v12}, Ln6/d$b;-><init>(Ln6/d;Ln6/d$c;)V

    invoke-virtual {v12, v1}, Ln6/d$c;->i(Ln6/d$b;)V

    return-void

    :cond_4
    if-ne v2, v9, :cond_5

    const/4 v2, 0x4

    if-ne v7, v2, :cond_5

    const-string v2, "READ"

    invoke-static {v1, v2, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    move-object/from16 v1, p1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final X(Ln6/d$c;)Z
    .locals 10

    invoke-virtual {p1}, Ln6/d$c;->f()I

    move-result v0

    const/16 v1, 0xa

    const/16 v2, 0x20

    if-lez v0, :cond_0

    iget-object v0, p0, Ln6/d;->m:Lxu/f;

    if-eqz v0, :cond_0

    const-string v3, "DIRTY"

    invoke-interface {v0, v3}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v0, v2}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {p1}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v0}, Lxu/f;->flush()V

    :cond_0
    invoke-virtual {p1}, Ln6/d$c;->f()I

    move-result v0

    const/4 v3, 0x1

    if-gtz v0, :cond_5

    invoke-virtual {p1}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Ln6/d;->d:I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    iget-object v5, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {p1}, Ln6/d$c;->a()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lxu/h0;

    invoke-virtual {v5, v6}, Lxu/l;->delete(Lxu/h0;)V

    iget-wide v5, p0, Ln6/d;->k:J

    invoke-virtual {p1}, Ln6/d$c;->e()[J

    move-result-object v7

    aget-wide v8, v7, v4

    sub-long/2addr v5, v8

    iput-wide v5, p0, Ln6/d;->k:J

    invoke-virtual {p1}, Ln6/d$c;->e()[J

    move-result-object v5

    const-wide/16 v6, 0x0

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget v0, p0, Ln6/d;->l:I

    add-int/2addr v0, v3

    iput v0, p0, Ln6/d;->l:I

    iget-object v0, p0, Ln6/d;->m:Lxu/f;

    if-eqz v0, :cond_3

    const-string v4, "REMOVE"

    invoke-interface {v0, v4}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v0, v2}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {p1}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v0, v1}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v0}, Lxu/f;->flush()V

    :cond_3
    iget-object v0, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-virtual {p1}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ln6/d;->F()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ln6/d;->H()V

    :cond_4
    return v3

    :cond_5
    :goto_1
    invoke-virtual {p1, v3}, Ln6/d$c;->m(Z)V

    return v3
.end method

.method public final Y()Z
    .locals 3

    iget-object v0, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/d$c;

    invoke-virtual {v1}, Ln6/d$c;->h()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Ln6/d;->X(Ln6/d$c;)Z

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final Z()V
    .locals 4

    :cond_0
    iget-wide v0, p0, Ln6/d;->k:J

    iget-wide v2, p0, Ln6/d;->b:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p0}, Ln6/d;->Y()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Ln6/d;->q:Z

    return-void
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Ln6/d;->u:Lkotlin/text/Regex;

    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b0()V
    .locals 8

    iget-object v0, p0, Ln6/d;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln6/d;->m:Lxu/f;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lxu/p0;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->f:Lxu/h0;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lxu/l;->sink(Lxu/h0;Z)Lxu/p0;

    move-result-object v1

    invoke-static {v1}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "libcore.io.DiskLruCache"

    invoke-interface {v1, v2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    move-result-object v2

    const/16 v4, 0xa

    invoke-interface {v2, v4}, Lxu/f;->writeByte(I)Lxu/f;

    const-string v2, "1"

    invoke-interface {v1, v2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    move-result-object v2

    invoke-interface {v2, v4}, Lxu/f;->writeByte(I)Lxu/f;

    iget v2, p0, Ln6/d;->c:I

    int-to-long v5, v2

    invoke-interface {v1, v5, v6}, Lxu/f;->z1(J)Lxu/f;

    move-result-object v2

    invoke-interface {v2, v4}, Lxu/f;->writeByte(I)Lxu/f;

    iget v2, p0, Ln6/d;->d:I

    int-to-long v5, v2

    invoke-interface {v1, v5, v6}, Lxu/f;->z1(J)Lxu/f;

    move-result-object v2

    invoke-interface {v2, v4}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v1, v4}, Lxu/f;->writeByte(I)Lxu/f;

    iget-object v2, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln6/d$c;

    invoke-virtual {v5}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v6

    const/16 v7, 0x20

    if-eqz v6, :cond_1

    const-string v6, "DIRTY"

    invoke-interface {v1, v6}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v1, v7}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {v5}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v1, v4}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_3

    :cond_1
    const-string v6, "CLEAN"

    invoke-interface {v1, v6}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {v1, v7}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {v5}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-virtual {v5, v1}, Ln6/d$c;->o(Lxu/f;)V

    invoke-interface {v1, v4}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_1

    :cond_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_3

    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    goto :goto_5

    :cond_3
    :goto_2
    const/4 v1, 0x0

    goto :goto_5

    :goto_3
    if-eqz v1, :cond_4

    :try_start_3
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v1

    :try_start_4
    invoke-static {v2, v1}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    move-object v1, v2

    :goto_5
    if-nez v1, :cond_6

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->e:Lxu/h0;

    iget-object v4, p0, Ln6/d;->g:Lxu/h0;

    invoke-virtual {v1, v2, v4}, Lxu/n;->atomicMove(Lxu/h0;Lxu/h0;)V

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->f:Lxu/h0;

    iget-object v4, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2, v4}, Lxu/n;->atomicMove(Lxu/h0;Lxu/h0;)V

    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->g:Lxu/h0;

    invoke-virtual {v1, v2}, Lxu/l;->delete(Lxu/h0;)V

    goto :goto_6

    :cond_5
    iget-object v1, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v2, p0, Ln6/d;->f:Lxu/h0;

    iget-object v4, p0, Ln6/d;->e:Lxu/h0;

    invoke-virtual {v1, v2, v4}, Lxu/n;->atomicMove(Lxu/h0;Lxu/h0;)V

    :goto_6
    invoke-virtual {p0}, Ln6/d;->I()Lxu/f;

    move-result-object v1

    iput-object v1, p0, Ln6/d;->m:Lxu/f;

    iput v3, p0, Ln6/d;->l:I

    iput-boolean v3, p0, Ln6/d;->n:Z

    iput-boolean v3, p0, Ln6/d;->r:Z

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :cond_6
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_7
    monitor-exit v0

    throw v1
.end method

.method public close()V
    .locals 6

    iget-object v0, p0, Ln6/d;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ln6/d;->o:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Ln6/d;->p:Z

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    const/4 v3, 0x0

    new-array v4, v3, [Ln6/d$c;

    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ln6/d$c;

    array-length v4, v1

    :goto_0
    if-ge v3, v4, :cond_2

    aget-object v5, v1, v3

    invoke-virtual {v5}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ln6/d$b;->e()V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ln6/d;->Z()V

    iget-object v1, p0, Ln6/d;->i:Lku/p0;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    iget-object v1, p0, Ln6/d;->m:Lxu/f;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1}, Lxu/p0;->close()V

    iput-object v3, p0, Ln6/d;->m:Lxu/f;

    iput-boolean v2, p0, Ln6/d;->p:Z

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_3
    :goto_2
    :try_start_1
    iput-boolean v2, p0, Ln6/d;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method public final s()V
    .locals 2

    iget-boolean v0, p0, Ln6/d;->p:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u(Ln6/d$b;Z)V
    .locals 11

    iget-object v0, p0, Ln6/d;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Ln6/d$b;->g()Ln6/d$c;

    move-result-object v1

    invoke-virtual {v1}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_4

    invoke-virtual {v1}, Ln6/d$c;->h()Z

    move-result v4

    if-nez v4, :cond_4

    iget v4, p0, Ln6/d;->d:I

    move v5, v3

    :goto_0
    if-ge v5, v4, :cond_1

    invoke-virtual {p1}, Ln6/d$b;->h()[Z

    move-result-object v6

    aget-boolean v6, v6, v5

    if-eqz v6, :cond_0

    iget-object v6, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v1}, Ln6/d$c;->c()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxu/h0;

    invoke-virtual {v6, v7}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {p1}, Ln6/d$b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :try_start_1
    iget p1, p0, Ln6/d;->d:I

    move v4, v3

    :goto_1
    if-ge v4, p1, :cond_5

    invoke-virtual {v1}, Ln6/d$c;->c()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxu/h0;

    invoke-virtual {v1}, Ln6/d$c;->a()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lxu/h0;

    iget-object v7, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v7, v5}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v7, v5, v6}, Lxu/n;->atomicMove(Lxu/h0;Lxu/h0;)V

    goto :goto_2

    :cond_2
    iget-object v5, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v1}, Ln6/d$c;->a()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxu/h0;

    const/4 v8, 0x2

    invoke-static {v5, v7, v3, v8, v2}, Le7/l;->b(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V

    :goto_2
    invoke-virtual {v1}, Ln6/d$c;->e()[J

    move-result-object v5

    aget-wide v7, v5, v4

    iget-object v5, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v5, v6}, Lxu/l;->metadata(Lxu/h0;)Lxu/k;

    move-result-object v5

    invoke-virtual {v5}, Lxu/k;->d()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_3

    :cond_3
    const-wide/16 v5, 0x0

    :goto_3
    invoke-virtual {v1}, Ln6/d$c;->e()[J

    move-result-object v9

    aput-wide v5, v9, v4

    iget-wide v9, p0, Ln6/d;->k:J

    sub-long/2addr v9, v7

    add-long/2addr v9, v5

    iput-wide v9, p0, Ln6/d;->k:J

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget p1, p0, Ln6/d;->d:I

    :goto_4
    if-ge v3, p1, :cond_5

    iget-object v4, p0, Ln6/d;->s:Ln6/d$e;

    invoke-virtual {v1}, Ln6/d$c;->c()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxu/h0;

    invoke-virtual {v4, v5}, Lxu/l;->delete(Lxu/h0;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {v1, v2}, Ln6/d$c;->i(Ln6/d$b;)V

    invoke-virtual {v1}, Ln6/d$c;->h()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v1}, Ln6/d;->X(Ln6/d$c;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :cond_6
    :try_start_2
    iget p1, p0, Ln6/d;->l:I

    const/4 v2, 0x1

    add-int/2addr p1, v2

    iput p1, p0, Ln6/d;->l:I

    iget-object p1, p0, Ln6/d;->m:Lxu/f;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v3, 0xa

    const/16 v4, 0x20

    if-nez p2, :cond_8

    invoke-virtual {v1}, Ln6/d$c;->g()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_5

    :cond_7
    iget-object p2, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-virtual {v1}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "REMOVE"

    invoke-interface {p1, p2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {p1, v4}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {v1}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {p1, v3}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_6

    :cond_8
    :goto_5
    invoke-virtual {v1, v2}, Ln6/d$c;->l(Z)V

    const-string p2, "CLEAN"

    invoke-interface {p1, p2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-interface {p1, v4}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-virtual {v1}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    invoke-virtual {v1, p1}, Ln6/d$c;->o(Lxu/f;)V

    invoke-interface {p1, v3}, Lxu/f;->writeByte(I)Lxu/f;

    :goto_6
    invoke-interface {p1}, Lxu/f;->flush()V

    iget-wide p1, p0, Ln6/d;->k:J

    iget-wide v1, p0, Ln6/d;->b:J

    cmp-long p1, p1, v1

    if-gtz p1, :cond_9

    invoke-virtual {p0}, Ln6/d;->F()Z

    move-result p1

    if-eqz p1, :cond_a

    :cond_9
    invoke-virtual {p0}, Ln6/d;->H()V

    :cond_a
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :cond_b
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_7
    monitor-exit v0

    throw p1
.end method

.method public final v()V
    .locals 2

    invoke-virtual {p0}, Ln6/d;->close()V

    iget-object v0, p0, Ln6/d;->s:Ln6/d$e;

    iget-object v1, p0, Ln6/d;->a:Lxu/h0;

    invoke-static {v0, v1}, Le7/l;->c(Lxu/l;Lxu/h0;)V

    return-void
.end method

.method public final w(Ljava/lang/String;)Ln6/d$b;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ln6/d;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ln6/d;->s()V

    invoke-virtual {p0, p1}, Ln6/d;->a0(Ljava/lang/String;)V

    invoke-virtual {p0}, Ln6/d;->B()V

    iget-object v1, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/d$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    monitor-exit v0

    return-object v2

    :cond_1
    if-eqz v1, :cond_2

    :try_start_1
    invoke-virtual {v1}, Ln6/d$c;->f()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    :try_start_2
    iget-boolean v3, p0, Ln6/d;->q:Z

    if-nez v3, :cond_6

    iget-boolean v3, p0, Ln6/d;->r:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    iget-object v3, p0, Ln6/d;->m:Lxu/f;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v4, "DIRTY"

    invoke-interface {v3, v4}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    const/16 v4, 0x20

    invoke-interface {v3, v4}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v3, p1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    const/16 v4, 0xa

    invoke-interface {v3, v4}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v3}, Lxu/f;->flush()V

    iget-boolean v3, p0, Ln6/d;->n:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_4

    monitor-exit v0

    return-object v2

    :cond_4
    if-nez v1, :cond_5

    :try_start_3
    new-instance v1, Ln6/d$c;

    invoke-direct {v1, p0, p1}, Ln6/d$c;-><init>(Ln6/d;Ljava/lang/String;)V

    iget-object v2, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    new-instance p1, Ln6/d$b;

    invoke-direct {p1, p0, v1}, Ln6/d$b;-><init>(Ln6/d;Ln6/d$c;)V

    invoke-virtual {v1, p1}, Ln6/d$c;->i(Ln6/d$b;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object p1

    :cond_6
    :goto_1
    :try_start_4
    invoke-virtual {p0}, Ln6/d;->H()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public final y(Ljava/lang/String;)Ln6/d$d;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ln6/d;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ln6/d;->s()V

    invoke-virtual {p0, p1}, Ln6/d;->a0(Ljava/lang/String;)V

    invoke-virtual {p0}, Ln6/d;->B()V

    iget-object v1, p0, Ln6/d;->h:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/d$c;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ln6/d$c;->n()Ln6/d$d;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v2, p0, Ln6/d;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ln6/d;->l:I

    iget-object v2, p0, Ln6/d;->m:Lxu/f;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "READ"

    invoke-interface {v2, v3}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    const/16 v3, 0x20

    invoke-interface {v2, v3}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v2, p1}, Lxu/f;->C0(Ljava/lang/String;)Lxu/f;

    const/16 p1, 0xa

    invoke-interface {v2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    invoke-interface {v2}, Lxu/f;->flush()V

    invoke-virtual {p0}, Ln6/d;->F()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ln6/d;->H()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit v0

    return-object v1

    :cond_2
    :goto_1
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :goto_2
    monitor-exit v0

    throw p1
.end method
