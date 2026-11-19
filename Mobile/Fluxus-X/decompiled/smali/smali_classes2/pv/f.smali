.class public final Lpv/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpv/f$a;,
        Lpv/f$b;,
        Lpv/f$c;,
        Lpv/f$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0005*\u0001r\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004B>?:B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\r\u0010#\u001a\u00020\u0011\u00a2\u0006\u0004\u0008#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008$\u0010\u0013J\u001e\u0010&\u001a\u0008\u0018\u00010%R\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0086\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\'\u0010*\u001a\u0008\u0018\u00010)R\u00020\u00002\u0006\u0010!\u001a\u00020\u00172\u0008\u0008\u0002\u0010(\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008*\u0010+J#\u0010.\u001a\u00020\u00112\n\u0010,\u001a\u00060)R\u00020\u00002\u0006\u0010-\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0017\u00a2\u0006\u0004\u00080\u00101J\u001b\u00104\u001a\u00020\u001c2\n\u00103\u001a\u000602R\u00020\u0000H\u0000\u00a2\u0006\u0004\u00084\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u00086\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u00087\u0010\u0013J\r\u00108\u001a\u00020\u0011\u00a2\u0006\u0004\u00088\u0010\u0013J\r\u00109\u001a\u00020\u0011\u00a2\u0006\u0004\u00089\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010\u0015\u001a\u0004\u0008@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER*\u0010\u000c\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010;R\u0014\u0010P\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010;R\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010;R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010HR\u0018\u0010W\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR>\u0010^\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\u0008\u0012\u000602R\u00020\u00000Xj\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0008\u0012\u000602R\u00020\u0000`Y8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]R\u0016\u0010`\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010\u0015R\u0016\u0010b\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010aR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010aR\u0016\u0010d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010aR\"\u0010h\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010a\u001a\u0004\u0008e\u0010\u001e\"\u0004\u0008f\u0010gR\u0016\u0010j\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010aR\u0016\u0010l\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010aR\u0016\u0010m\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010HR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010s\u00a8\u0006v"
    }
    d2 = {
        "Lpv/f;",
        "Ljava/io/Closeable;",
        "Ljava/io/Flushable;",
        "",
        "Lew/k;",
        "fileSystem",
        "Lew/b0;",
        "directory",
        "",
        "appVersion",
        "valueCount",
        "",
        "maxSize",
        "Lqv/d;",
        "taskRunner",
        "<init>",
        "(Lew/k;Lew/b0;IIJLqv/d;)V",
        "",
        "N",
        "()V",
        "Lew/f;",
        "I",
        "()Lew/f;",
        "",
        "line",
        "O",
        "(Ljava/lang/String;)V",
        "L",
        "",
        "E",
        "()Z",
        "m",
        "b0",
        "key",
        "d0",
        "A",
        "Q",
        "Lpv/f$d;",
        "s",
        "(Ljava/lang/String;)Lpv/f$d;",
        "expectedSequenceNumber",
        "Lpv/f$b;",
        "p",
        "(Ljava/lang/String;J)Lpv/f$b;",
        "editor",
        "success",
        "n",
        "(Lpv/f$b;Z)V",
        "T",
        "(Ljava/lang/String;)Z",
        "Lpv/f$c;",
        "entry",
        "Y",
        "(Lpv/f$c;)Z",
        "flush",
        "close",
        "c0",
        "o",
        "a",
        "Lew/b0;",
        "w",
        "()Lew/b0;",
        "b",
        "c",
        "z",
        "()I",
        "d",
        "Lew/k;",
        "y",
        "()Lew/k;",
        "value",
        "e",
        "J",
        "getMaxSize",
        "()J",
        "setMaxSize",
        "(J)V",
        "f",
        "journalFile",
        "g",
        "journalFileTmp",
        "h",
        "journalFileBackup",
        "i",
        "size",
        "j",
        "Lew/f;",
        "journalWriter",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "k",
        "Ljava/util/LinkedHashMap;",
        "getLruEntries$okhttp",
        "()Ljava/util/LinkedHashMap;",
        "lruEntries",
        "l",
        "redundantOpCount",
        "Z",
        "hasJournalErrors",
        "civilizedFileSystem",
        "initialized",
        "u",
        "setClosed$okhttp",
        "(Z)V",
        "closed",
        "q",
        "mostRecentTrimFailed",
        "r",
        "mostRecentRebuildFailed",
        "nextSequenceNumber",
        "Lqv/c;",
        "t",
        "Lqv/c;",
        "cleanupQueue",
        "pv/f$e",
        "Lpv/f$e;",
        "cleanupTask",
        "v",
        "okhttp"
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
.field public static final A:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final B:J

.field public static final C:Lkotlin/text/Regex;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final D:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final E:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final F:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final G:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final v:Lpv/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final w:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final x:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final y:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final z:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lew/b0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I

.field public final c:I

.field public final d:Lew/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:J

.field public final f:Lew/b0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lew/b0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lew/b0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:J

.field public j:Lew/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final k:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lpv/f$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:J

.field public final t:Lqv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u:Lpv/f$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpv/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpv/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpv/f;->v:Lpv/f$a;

    const-string v0, "journal"

    sput-object v0, Lpv/f;->w:Ljava/lang/String;

    const-string v0, "journal.tmp"

    sput-object v0, Lpv/f;->x:Ljava/lang/String;

    const-string v0, "journal.bkp"

    sput-object v0, Lpv/f;->y:Ljava/lang/String;

    const-string v0, "libcore.io.DiskLruCache"

    sput-object v0, Lpv/f;->z:Ljava/lang/String;

    const-string v0, "1"

    sput-object v0, Lpv/f;->A:Ljava/lang/String;

    const-wide/16 v0, -0x1

    sput-wide v0, Lpv/f;->B:J

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[a-z0-9_-]{1,120}"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpv/f;->C:Lkotlin/text/Regex;

    const-string v0, "CLEAN"

    sput-object v0, Lpv/f;->D:Ljava/lang/String;

    const-string v0, "DIRTY"

    sput-object v0, Lpv/f;->E:Ljava/lang/String;

    const-string v0, "REMOVE"

    sput-object v0, Lpv/f;->F:Ljava/lang/String;

    const-string v0, "READ"

    sput-object v0, Lpv/f;->G:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lew/k;Lew/b0;IIJLqv/d;)V
    .locals 2
    .param p1    # Lew/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lew/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lqv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskRunner"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpv/f;->a:Lew/b0;

    iput p3, p0, Lpv/f;->b:I

    iput p4, p0, Lpv/f;->c:I

    new-instance p3, Lpv/f$f;

    invoke-direct {p3, p1}, Lpv/f$f;-><init>(Lew/k;)V

    iput-object p3, p0, Lpv/f;->d:Lew/k;

    iput-wide p5, p0, Lpv/f;->e:J

    new-instance p1, Ljava/util/LinkedHashMap;

    const/high16 p3, 0x3f400000    # 0.75f

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, p3, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {p7}, Lqv/d;->k()Lqv/c;

    move-result-object p1

    iput-object p1, p0, Lpv/f;->t:Lqv/c;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p3, Lnv/q;->c:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " Cache"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Lpv/f$e;

    invoke-direct {p3, p0, p1}, Lpv/f$e;-><init>(Lpv/f;Ljava/lang/String;)V

    iput-object p3, p0, Lpv/f;->u:Lpv/f$e;

    const-wide/16 v0, 0x0

    cmp-long p1, p5, v0

    if-lez p1, :cond_1

    if-lez p4, :cond_0

    sget-object p1, Lpv/f;->w:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lew/b0;->p(Ljava/lang/String;)Lew/b0;

    move-result-object p1

    iput-object p1, p0, Lpv/f;->f:Lew/b0;

    sget-object p1, Lpv/f;->x:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lew/b0;->p(Ljava/lang/String;)Lew/b0;

    move-result-object p1

    iput-object p1, p0, Lpv/f;->g:Lew/b0;

    sget-object p1, Lpv/f;->y:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lew/b0;->p(Ljava/lang/String;)Lew/b0;

    move-result-object p1

    iput-object p1, p0, Lpv/f;->h:Lew/b0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "valueCount <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "maxSize <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final K(Lpv/f;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean p1, Lnv/q;->b:Z

    if-eqz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lpv/f;->m:Z

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Lpv/f;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lpv/f;->K(Lpv/f;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lpv/f;)Z
    .locals 0

    iget-boolean p0, p0, Lpv/f;->n:Z

    return p0
.end method

.method public static final synthetic c(Lpv/f;)Z
    .locals 0

    iget-boolean p0, p0, Lpv/f;->o:Z

    return p0
.end method

.method public static final synthetic d(Lpv/f;)Lew/f;
    .locals 0

    iget-object p0, p0, Lpv/f;->j:Lew/f;

    return-object p0
.end method

.method public static final synthetic e(Lpv/f;)Z
    .locals 0

    invoke-virtual {p0}, Lpv/f;->E()Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Lpv/f;Lew/f;)V
    .locals 0

    iput-object p1, p0, Lpv/f;->j:Lew/f;

    return-void
.end method

.method public static final synthetic g(Lpv/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lpv/f;->r:Z

    return-void
.end method

.method public static final synthetic h(Lpv/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lpv/f;->q:Z

    return-void
.end method

.method public static final synthetic k(Lpv/f;I)V
    .locals 0

    iput p1, p0, Lpv/f;->l:I

    return-void
.end method

.method public static synthetic r(Lpv/f;Ljava/lang/String;JILjava/lang/Object;)Lpv/f$b;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-wide p2, Lpv/f;->B:J

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lpv/f;->p(Ljava/lang/String;J)Lpv/f$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized A()V
    .locals 5

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lnv/q;->b:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lpv/f;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->h:Lew/b0;

    invoke-virtual {v0, v1}, Lew/k;->m(Lew/b0;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1}, Lew/k;->m(Lew/b0;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->h:Lew/b0;

    invoke-virtual {v0, v1}, Lew/k;->h(Lew/b0;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->h:Lew/b0;

    iget-object v2, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1, v2}, Lew/k;->c(Lew/b0;Lew/b0;)V

    :cond_4
    :goto_1
    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->h:Lew/b0;

    invoke-static {v0, v1}, Lnv/n;->x(Lew/k;Lew/b0;)Z

    move-result v0

    iput-boolean v0, p0, Lpv/f;->n:Z

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1}, Lew/k;->m(Lew/b0;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    :try_start_2
    invoke-virtual {p0}, Lpv/f;->N()V

    invoke-virtual {p0}, Lpv/f;->L()V

    iput-boolean v1, p0, Lpv/f;->o:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    sget-object v2, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    invoke-virtual {v2}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DiskLruCache "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lpv/f;->a:Lew/b0;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " is corrupt: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", removing"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    invoke-virtual {v2, v3, v4, v0}, Lokhttp3/internal/platform/c;->m(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {p0}, Lpv/f;->o()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iput-boolean v0, p0, Lpv/f;->p:Z

    goto :goto_2

    :catchall_1
    move-exception v1

    iput-boolean v0, p0, Lpv/f;->p:Z

    throw v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lpv/f;->Q()V

    iput-boolean v1, p0, Lpv/f;->o:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0
.end method

.method public final E()Z
    .locals 2

    iget v0, p0, Lpv/f;->l:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I()Lew/f;
    .locals 3

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1}, Lew/k;->a(Lew/b0;)Lew/j0;

    move-result-object v0

    new-instance v1, Lpv/h;

    new-instance v2, Lpv/e;

    invoke-direct {v2, p0}, Lpv/e;-><init>(Lpv/f;)V

    invoke-direct {v1, v0, v2}, Lpv/h;-><init>(Lew/j0;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v1}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object v0

    return-object v0
.end method

.method public final L()V
    .locals 9

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->g:Lew/b0;

    invoke-static {v0, v1}, Lnv/n;->i(Lew/k;Lew/b0;)V

    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget v2, p0, Lpv/f;->c:I

    :goto_1
    if-ge v3, v2, :cond_0

    iget-wide v4, p0, Lpv/f;->i:J

    invoke-virtual {v1}, Lpv/f$c;->e()[J

    move-result-object v6

    aget-wide v7, v6, v3

    add-long/2addr v4, v7

    iput-wide v4, p0, Lpv/f;->i:J

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lpv/f$c;->l(Lpv/f$b;)V

    iget v2, p0, Lpv/f;->c:I

    :goto_2
    if-ge v3, v2, :cond_2

    iget-object v4, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {v1}, Lpv/f$c;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lew/b0;

    invoke-static {v4, v5}, Lnv/n;->i(Lew/k;Lew/b0;)V

    iget-object v4, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {v1}, Lpv/f$c;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lew/b0;

    invoke-static {v4, v5}, Lnv/n;->i(Lew/k;Lew/b0;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final N()V
    .locals 9

    const-string v0, ", "

    iget-object v1, p0, Lpv/f;->d:Lew/k;

    iget-object v2, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v1, v2}, Lew/k;->w(Lew/b0;)Lew/l0;

    move-result-object v1

    invoke-static {v1}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lpv/f;->z:Ljava/lang/String;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v7, Lpv/f;->A:Ljava/lang/String;

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget v7, p0, Lpv/f;->b:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget v4, p0, Lpv/f;->c:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v4, :cond_3

    const/4 v0, 0x0

    :goto_0
    :try_start_1
    invoke-interface {v1}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lpv/f;->O(Ljava/lang/String;)V
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
    iget-object v2, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Lpv/f;->l:I

    invoke-interface {v1}, Lew/g;->c2()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lpv/f;->Q()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lpv/f;->j:Lew/f;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_1
    invoke-virtual {p0}, Lpv/f;->I()Lew/f;

    move-result-object v0

    iput-object v0, p0, Lpv/f;->j:Lew/f;

    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    :try_start_3
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_2
    const/4 v0, 0x0

    goto :goto_4

    :cond_3
    :try_start_4
    new-instance v4, Ljava/io/IOException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "unexpected journal header: ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    if-eqz v1, :cond_4

    :try_start_5
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v1

    invoke-static {v0, v1}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    if-nez v0, :cond_5

    return-void

    :cond_5
    throw v0
.end method

.method public final O(Ljava/lang/String;)V
    .locals 18

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

    sget-object v11, Lpv/f;->F:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-ne v7, v12, :cond_1

    invoke-static {v1, v11, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v1, v0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v11, v0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v11, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpv/f$c;

    if-nez v11, :cond_2

    new-instance v11, Lpv/f$c;

    invoke-direct {v11, v0, v3}, Lpv/f$c;-><init>(Lpv/f;Ljava/lang/String;)V

    iget-object v12, v0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-interface {v12, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eq v2, v9, :cond_3

    sget-object v3, Lpv/f;->D:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v12

    if-ne v7, v12, :cond_3

    invoke-static {v1, v3, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v13, v3, [C

    const/16 v1, 0x20

    aput-char v1, v13, v6

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->N0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v11, v3}, Lpv/f$c;->o(Z)V

    invoke-virtual {v11, v10}, Lpv/f$c;->l(Lpv/f$b;)V

    invoke-virtual {v11, v1}, Lpv/f$c;->m(Ljava/util/List;)V

    return-void

    :cond_3
    if-ne v2, v9, :cond_4

    sget-object v3, Lpv/f;->E:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v7, v4, :cond_4

    invoke-static {v1, v3, v6, v5, v10}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v1, Lpv/f$b;

    invoke-direct {v1, v0, v11}, Lpv/f$b;-><init>(Lpv/f;Lpv/f$c;)V

    invoke-virtual {v11, v1}, Lpv/f$c;->l(Lpv/f$b;)V

    return-void

    :cond_4
    if-ne v2, v9, :cond_5

    sget-object v2, Lpv/f;->G:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v7, v3, :cond_5

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

.method public final declared-synchronized Q()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lpv/f;->j:Lew/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lew/j0;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->g:Lew/b0;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lew/k;->u(Lew/b0;Z)Lew/j0;

    move-result-object v0

    invoke-static {v0}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v1, Lpv/f;->z:Ljava/lang/String;

    invoke-interface {v0, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object v1

    const/16 v3, 0xa

    invoke-interface {v1, v3}, Lew/f;->writeByte(I)Lew/f;

    sget-object v1, Lpv/f;->A:Ljava/lang/String;

    invoke-interface {v0, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object v1

    invoke-interface {v1, v3}, Lew/f;->writeByte(I)Lew/f;

    iget v1, p0, Lpv/f;->b:I

    int-to-long v4, v1

    invoke-interface {v0, v4, v5}, Lew/f;->A1(J)Lew/f;

    move-result-object v1

    invoke-interface {v1, v3}, Lew/f;->writeByte(I)Lew/f;

    iget v1, p0, Lpv/f;->c:I

    int-to-long v4, v1

    invoke-interface {v0, v4, v5}, Lew/f;->A1(J)Lew/f;

    move-result-object v1

    invoke-interface {v1, v3}, Lew/f;->writeByte(I)Lew/f;

    invoke-interface {v0, v3}, Lew/f;->writeByte(I)Lew/f;

    iget-object v1, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "next(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lpv/f$c;

    invoke-virtual {v4}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v5

    const/16 v6, 0x20

    if-eqz v5, :cond_1

    sget-object v5, Lpv/f;->E:Ljava/lang/String;

    invoke-interface {v0, v5}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object v5

    invoke-interface {v5, v6}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {v4}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {v0, v3}, Lew/f;->writeByte(I)Lew/f;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    sget-object v5, Lpv/f;->D:Ljava/lang/String;

    invoke-interface {v0, v5}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object v5

    invoke-interface {v5, v6}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {v4}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-virtual {v4, v0}, Lpv/f$c;->s(Lew/f;)V

    invoke-interface {v0, v3}, Lew/f;->writeByte(I)Lew/f;

    goto :goto_1

    :cond_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_3

    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_5

    :cond_3
    :goto_2
    const/4 v0, 0x0

    goto :goto_5

    :goto_3
    if-eqz v0, :cond_4

    :try_start_3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    :try_start_4
    invoke-static {v1, v0}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    move-object v0, v1

    :goto_5
    if-nez v0, :cond_7

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1}, Lew/k;->m(Lew/b0;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->f:Lew/b0;

    iget-object v3, p0, Lpv/f;->h:Lew/b0;

    invoke-virtual {v0, v1, v3}, Lew/k;->c(Lew/b0;Lew/b0;)V

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->g:Lew/b0;

    iget-object v3, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1, v3}, Lew/k;->c(Lew/b0;Lew/b0;)V

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->h:Lew/b0;

    invoke-static {v0, v1}, Lnv/n;->i(Lew/k;Lew/b0;)V

    goto :goto_6

    :cond_5
    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->g:Lew/b0;

    iget-object v3, p0, Lpv/f;->f:Lew/b0;

    invoke-virtual {v0, v1, v3}, Lew/k;->c(Lew/b0;Lew/b0;)V

    :goto_6
    iget-object v0, p0, Lpv/f;->j:Lew/f;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_6
    invoke-virtual {p0}, Lpv/f;->I()Lew/f;

    move-result-object v0

    iput-object v0, p0, Lpv/f;->j:Lew/f;

    iput-boolean v2, p0, Lpv/f;->m:Z

    iput-boolean v2, p0, Lpv/f;->r:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_5
    throw v0

    :goto_7
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public final declared-synchronized T(Ljava/lang/String;)Z
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpv/f;->A()V

    invoke-virtual {p0}, Lpv/f;->m()V

    invoke-virtual {p0, p1}, Lpv/f;->d0(Ljava/lang/String;)V

    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpv/f$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lpv/f;->Y(Lpv/f$c;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v1, p0, Lpv/f;->i:J

    iget-wide v3, p0, Lpv/f;->e:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    iput-boolean v0, p0, Lpv/f;->q:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    return p1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final Y(Lpv/f$c;)Z
    .locals 10
    .param p1    # Lpv/f$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lpv/f;->n:Z

    const/16 v1, 0xa

    const/16 v2, 0x20

    const/4 v3, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lpv/f$c;->f()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lpv/f;->j:Lew/f;

    if-eqz v0, :cond_0

    sget-object v4, Lpv/f;->E:Ljava/lang/String;

    invoke-interface {v0, v4}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {v0, v2}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {p1}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {v0, v1}, Lew/f;->writeByte(I)Lew/f;

    invoke-interface {v0}, Lew/f;->flush()V

    :cond_0
    invoke-virtual {p1}, Lpv/f$c;->f()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p1}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p1, v3}, Lpv/f$c;->q(Z)V

    return v3

    :cond_2
    invoke-virtual {p1}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpv/f$b;->d()V

    :cond_3
    iget v0, p0, Lpv/f;->c:I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_4

    iget-object v5, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {p1}, Lpv/f$c;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lew/b0;

    invoke-static {v5, v6}, Lnv/n;->i(Lew/k;Lew/b0;)V

    iget-wide v5, p0, Lpv/f;->i:J

    invoke-virtual {p1}, Lpv/f$c;->e()[J

    move-result-object v7

    aget-wide v8, v7, v4

    sub-long/2addr v5, v8

    iput-wide v5, p0, Lpv/f;->i:J

    invoke-virtual {p1}, Lpv/f$c;->e()[J

    move-result-object v5

    const-wide/16 v6, 0x0

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    iget v0, p0, Lpv/f;->l:I

    add-int/2addr v0, v3

    iput v0, p0, Lpv/f;->l:I

    iget-object v0, p0, Lpv/f;->j:Lew/f;

    if-eqz v0, :cond_5

    sget-object v4, Lpv/f;->F:Ljava/lang/String;

    invoke-interface {v0, v4}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {v0, v2}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {p1}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {v0, v1}, Lew/f;->writeByte(I)Lew/f;

    :cond_5
    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lpv/f;->E()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object v4, p0, Lpv/f;->t:Lqv/c;

    iget-object v5, p0, Lpv/f;->u:Lpv/f$e;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Lqv/c;->m(Lqv/c;Lqv/a;JILjava/lang/Object;)V

    :cond_6
    return v3
.end method

.method public final b0()Z
    .locals 3

    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->i()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Lpv/f;->Y(Lpv/f$c;)Z

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c0()V
    .locals 4

    :cond_0
    iget-wide v0, p0, Lpv/f;->i:J

    iget-wide v2, p0, Lpv/f;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lpv/f;->b0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lpv/f;->q:Z

    return-void
.end method

.method public declared-synchronized close()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lpv/f;->o:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lpv/f;->p:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v3, v2, [Lpv/f$c;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpv/f$c;

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_2

    aget-object v4, v0, v2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lpv/f$b;->d()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lpv/f;->c0()V

    iget-object v0, p0, Lpv/f;->j:Lew/f;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lpv/f;->j:Lew/f;

    iput-boolean v1, p0, Lpv/f;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :goto_2
    :try_start_1
    iput-boolean v1, p0, Lpv/f;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final d0(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpv/f;->C:Lkotlin/text/Regex;

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

.method public declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lpv/f;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lpv/f;->m()V

    invoke-virtual {p0}, Lpv/f;->c0()V

    iget-object v0, p0, Lpv/f;->j:Lew/f;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Lew/f;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized m()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lpv/f;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized n(Lpv/f$b;Z)V
    .locals 8
    .param p1    # Lpv/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "editor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpv/f$b;->e()Lpv/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lpv/f$c;->g()Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, p0, Lpv/f;->c:I

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {p1}, Lpv/f$b;->f()[Z

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_1

    iget-object v4, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {v0}, Lpv/f$c;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lew/b0;

    invoke-virtual {v4, v5}, Lew/k;->m(Lew/b0;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p1}, Lpv/f$b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lpv/f$b;->b()V

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Newly created entry didn\'t create value for index "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, p0, Lpv/f;->c:I

    :goto_1
    if-ge v1, p1, :cond_6

    invoke-virtual {v0}, Lpv/f$c;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lew/b0;

    if-eqz p2, :cond_4

    invoke-virtual {v0}, Lpv/f$c;->i()Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {v3, v2}, Lew/k;->m(Lew/b0;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lpv/f$c;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lew/b0;

    iget-object v4, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {v4, v2, v3}, Lew/k;->c(Lew/b0;Lew/b0;)V

    invoke-virtual {v0}, Lpv/f$c;->e()[J

    move-result-object v2

    aget-wide v4, v2, v1

    iget-object v2, p0, Lpv/f;->d:Lew/k;

    invoke-virtual {v2, v3}, Lew/k;->o(Lew/b0;)Lew/j;

    move-result-object v2

    invoke-virtual {v2}, Lew/j;->d()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_2

    :cond_3
    const-wide/16 v2, 0x0

    :goto_2
    invoke-virtual {v0}, Lpv/f$c;->e()[J

    move-result-object v6

    aput-wide v2, v6, v1

    iget-wide v6, p0, Lpv/f;->i:J

    sub-long/2addr v6, v4

    add-long/2addr v6, v2

    iput-wide v6, p0, Lpv/f;->i:J

    goto :goto_3

    :cond_4
    iget-object v3, p0, Lpv/f;->d:Lew/k;

    invoke-static {v3, v2}, Lnv/n;->i(Lew/k;Lew/b0;)V

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lpv/f$c;->l(Lpv/f$b;)V

    invoke-virtual {v0}, Lpv/f$c;->i()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, v0}, Lpv/f;->Y(Lpv/f$c;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_2
    iget p1, p0, Lpv/f;->l:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lpv/f;->l:I

    iget-object p1, p0, Lpv/f;->j:Lew/f;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpv/f$c;->g()Z

    move-result v2

    const/16 v3, 0xa

    const/16 v4, 0x20

    if-nez v2, :cond_9

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Lpv/f;->F:Ljava/lang/String;

    invoke-interface {p1, p2}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object p2

    invoke-interface {p2, v4}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {v0}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {p1, v3}, Lew/f;->writeByte(I)Lew/f;

    goto :goto_5

    :cond_9
    :goto_4
    invoke-virtual {v0, v1}, Lpv/f$c;->o(Z)V

    sget-object v1, Lpv/f;->D:Ljava/lang/String;

    invoke-interface {p1, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object v1

    invoke-interface {v1, v4}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {v0}, Lpv/f$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-virtual {v0, p1}, Lpv/f$c;->s(Lew/f;)V

    invoke-interface {p1, v3}, Lew/f;->writeByte(I)Lew/f;

    if-eqz p2, :cond_a

    iget-wide v1, p0, Lpv/f;->s:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lpv/f;->s:J

    invoke-virtual {v0, v1, v2}, Lpv/f$c;->p(J)V

    :cond_a
    :goto_5
    invoke-interface {p1}, Lew/f;->flush()V

    iget-wide p1, p0, Lpv/f;->i:J

    iget-wide v0, p0, Lpv/f;->e:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_b

    invoke-virtual {p0}, Lpv/f;->E()Z

    move-result p1

    if-eqz p1, :cond_c

    :cond_b
    iget-object v0, p0, Lpv/f;->t:Lqv/c;

    iget-object v1, p0, Lpv/f;->u:Lpv/f$e;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lqv/c;->m(Lqv/c;Lqv/a;JILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_c
    monitor-exit p0

    return-void

    :cond_d
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_6
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final o()V
    .locals 2

    invoke-virtual {p0}, Lpv/f;->close()V

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    iget-object v1, p0, Lpv/f;->a:Lew/b0;

    invoke-static {v0, v1}, Lnv/n;->h(Lew/k;Lew/b0;)V

    return-void
.end method

.method public final declared-synchronized p(Ljava/lang/String;J)Lpv/f$b;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpv/f;->A()V

    invoke-virtual {p0}, Lpv/f;->m()V

    invoke-virtual {p0, p1}, Lpv/f;->d0(Ljava/lang/String;)V

    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpv/f$c;

    sget-wide v1, Lpv/f;->B:J

    cmp-long v1, p2, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpv/f$c;->h()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p2, v3, p2

    if-eqz p2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v2

    :cond_1
    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_2
    move-object p2, v2

    :goto_1
    if-eqz p2, :cond_3

    monitor-exit p0

    return-object v2

    :cond_3
    if-eqz v0, :cond_4

    :try_start_2
    invoke-virtual {v0}, Lpv/f$c;->f()I

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p2, :cond_4

    monitor-exit p0

    return-object v2

    :cond_4
    :try_start_3
    iget-boolean p2, p0, Lpv/f;->q:Z

    if-nez p2, :cond_8

    iget-boolean p2, p0, Lpv/f;->r:Z

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    iget-object p2, p0, Lpv/f;->j:Lew/f;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object p3, Lpv/f;->E:Ljava/lang/String;

    invoke-interface {p2, p3}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object p3

    const/16 v1, 0x20

    invoke-interface {p3, v1}, Lew/f;->writeByte(I)Lew/f;

    move-result-object p3

    invoke-interface {p3, p1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object p3

    const/16 v1, 0xa

    invoke-interface {p3, v1}, Lew/f;->writeByte(I)Lew/f;

    invoke-interface {p2}, Lew/f;->flush()V

    iget-boolean p2, p0, Lpv/f;->m:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p2, :cond_6

    monitor-exit p0

    return-object v2

    :cond_6
    if-nez v0, :cond_7

    :try_start_4
    new-instance v0, Lpv/f$c;

    invoke-direct {v0, p0, p1}, Lpv/f$c;-><init>(Lpv/f;Ljava/lang/String;)V

    iget-object p2, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    new-instance p1, Lpv/f$b;

    invoke-direct {p1, p0, v0}, Lpv/f$b;-><init>(Lpv/f;Lpv/f$c;)V

    invoke-virtual {v0, p1}, Lpv/f$c;->l(Lpv/f$b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_8
    :goto_2
    :try_start_5
    iget-object v3, p0, Lpv/f;->t:Lqv/c;

    iget-object v4, p0, Lpv/f;->u:Lpv/f$e;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Lqv/c;->m(Lqv/c;Lqv/a;JILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-object v2

    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final declared-synchronized s(Ljava/lang/String;)Lpv/f$d;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpv/f;->A()V

    invoke-virtual {p0}, Lpv/f;->m()V

    invoke-virtual {p0, p1}, Lpv/f;->d0(Ljava/lang/String;)V

    iget-object v0, p0, Lpv/f;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpv/f$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lpv/f$c;->r()Lpv/f$d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    iget v1, p0, Lpv/f;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lpv/f;->l:I

    iget-object v1, p0, Lpv/f;->j:Lew/f;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Lpv/f;->G:Ljava/lang/String;

    invoke-interface {v1, v2}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object v1

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Lew/f;->writeByte(I)Lew/f;

    move-result-object v1

    invoke-interface {v1, p1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    move-result-object p1

    const/16 v1, 0xa

    invoke-interface {p1, v1}, Lew/f;->writeByte(I)Lew/f;

    invoke-virtual {p0}, Lpv/f;->E()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lpv/f;->t:Lqv/c;

    iget-object v2, p0, Lpv/f;->u:Lpv/f$e;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lqv/c;->m(Lqv/c;Lqv/a;JILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, Lpv/f;->p:Z

    return v0
.end method

.method public final w()Lew/b0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpv/f;->a:Lew/b0;

    return-object v0
.end method

.method public final y()Lew/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpv/f;->d:Lew/k;

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Lpv/f;->c:I

    return v0
.end method
