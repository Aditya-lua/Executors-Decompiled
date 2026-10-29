.class public abstract Lxu/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxu/l$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0010\u0008&\u0018\u0000 D2\u00060\u0001j\u0002`\u0002:\u0001EB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\'\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0017\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\rH&\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008#\u0010$JB\u0010+\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00028\u00000&H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\u0008)\u0010*J!\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008-\u0010.J\u0015\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0004\u0008-\u0010/JL\u00104\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000&H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0003 \u0001\u00a2\u0006\u0004\u00082\u00103J!\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001f\u001a\u00020\rH&\u00a2\u0006\u0004\u00085\u0010.J\u0015\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0004\u00085\u0010/J!\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\rH&\u00a2\u0006\u0004\u00087\u00108J\u0015\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\u00087\u00109J\u001f\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\r\u00a2\u0006\u0004\u0008:\u00108J\u0015\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\u0008:\u00109J\u001f\u0010<\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008<\u0010=J\u001f\u0010>\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008>\u0010=J!\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001f\u001a\u00020\rH&\u00a2\u0006\u0004\u0008?\u00108J\u0015\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008?\u00109J!\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008A\u00108J\u0015\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u0005\u00a2\u0006\u0004\u0008A\u00109J\u001f\u0010B\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008B\u0010=J\u000f\u0010C\u001a\u000206H\u0016\u00a2\u0006\u0004\u0008C\u0010\u0004\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006F"
    }
    d2 = {
        "Lxu/l;",
        "Ljava/io/Closeable;",
        "Lokio/Closeable;",
        "<init>",
        "()V",
        "Lxu/h0;",
        "path",
        "canonicalize",
        "(Lxu/h0;)Lxu/h0;",
        "Lxu/k;",
        "metadata",
        "(Lxu/h0;)Lxu/k;",
        "metadataOrNull",
        "",
        "exists",
        "(Lxu/h0;)Z",
        "dir",
        "",
        "list",
        "(Lxu/h0;)Ljava/util/List;",
        "listOrNull",
        "followSymlinks",
        "Lkotlin/sequences/Sequence;",
        "listRecursively",
        "(Lxu/h0;Z)Lkotlin/sequences/Sequence;",
        "(Lxu/h0;)Lkotlin/sequences/Sequence;",
        "file",
        "Lxu/j;",
        "openReadOnly",
        "(Lxu/h0;)Lxu/j;",
        "mustCreate",
        "mustExist",
        "openReadWrite",
        "(Lxu/h0;ZZ)Lxu/j;",
        "Lxu/r0;",
        "source",
        "(Lxu/h0;)Lxu/r0;",
        "T",
        "Lkotlin/Function1;",
        "Lxu/g;",
        "readerAction",
        "-read",
        "(Lxu/h0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "read",
        "Lxu/p0;",
        "sink",
        "(Lxu/h0;Z)Lxu/p0;",
        "(Lxu/h0;)Lxu/p0;",
        "Lxu/f;",
        "writerAction",
        "-write",
        "(Lxu/h0;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "write",
        "appendingSink",
        "",
        "createDirectory",
        "(Lxu/h0;Z)V",
        "(Lxu/h0;)V",
        "createDirectories",
        "target",
        "atomicMove",
        "(Lxu/h0;Lxu/h0;)V",
        "copy",
        "delete",
        "fileOrDirectory",
        "deleteRecursively",
        "createSymlink",
        "close",
        "Companion",
        "a",
        "okio"
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
.field public static final Companion:Lxu/l$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final RESOURCES:Lxu/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SYSTEM:Lxu/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SYSTEM_TEMPORARY_DIRECTORY:Lxu/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static synthetic -write$default(Lxu/l;Lxu/h0;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p5, :cond_4

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    const-string p4, "file"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "writerAction"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lxu/l;->sink(Lxu/h0;Z)Lxu/p0;

    move-result-object p0

    invoke-static {p0}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {p2}, Lkotlin/jvm/internal/l;->b(I)V

    if-eqz p0, :cond_1

    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :cond_1
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->a(I)V

    move-object v0, p3

    move-object p3, p1

    move-object p1, v0

    goto :goto_2

    :catchall_1
    move-exception p3

    invoke-static {p2}, Lkotlin/jvm/internal/l;->b(I)V

    if-eqz p0, :cond_2

    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    invoke-static {p3, p0}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    invoke-static {p2}, Lkotlin/jvm/internal/l;->a(I)V

    :goto_2
    if-nez p3, :cond_3

    return-object p1

    :cond_3
    throw p3

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: write"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lxu/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxu/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxu/l;->Companion:Lxu/l$a;

    :try_start_0
    const-string v0, "java.nio.file.Files"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    new-instance v0, Lxu/a0;

    invoke-direct {v0}, Lxu/a0;-><init>()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lxu/x;

    invoke-direct {v0}, Lxu/x;-><init>()V

    :goto_0
    sput-object v0, Lxu/l;->SYSTEM:Lxu/l;

    sget-object v0, Lxu/h0;->b:Lxu/h0$a;

    const-string v2, "java.io.tmpdir"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getProperty(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, Lxu/h0$a;->e(Lxu/h0$a;Ljava/lang/String;ZILjava/lang/Object;)Lxu/h0;

    move-result-object v0

    sput-object v0, Lxu/l;->SYSTEM_TEMPORARY_DIRECTORY:Lxu/h0;

    new-instance v1, Lyu/m;

    const-class v0, Lyu/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v0, "getClassLoader(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lyu/m;-><init>(Ljava/lang/ClassLoader;ZLxu/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lxu/l;->RESOURCES:Lxu/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic appendingSink$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)Lxu/p0;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->appendingSink(Lxu/h0;Z)Lxu/p0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: appendingSink"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic createDirectories$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->createDirectories(Lxu/h0;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createDirectories"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic createDirectory$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->createDirectory(Lxu/h0;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createDirectory"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic delete$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->delete(Lxu/h0;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: delete"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic deleteRecursively$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->deleteRecursively(Lxu/h0;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: deleteRecursively"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final get(Ljava/nio/file/FileSystem;)Lxu/l;
    .locals 1
    .param p0    # Ljava/nio/file/FileSystem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lxu/l;->Companion:Lxu/l$a;

    invoke-virtual {v0, p0}, Lxu/l$a;->a(Ljava/nio/file/FileSystem;)Lxu/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic listRecursively$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)Lkotlin/sequences/Sequence;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->listRecursively(Lxu/h0;Z)Lkotlin/sequences/Sequence;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: listRecursively"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic openReadWrite$default(Lxu/l;Lxu/h0;ZZILjava/lang/Object;)Lxu/j;
    .locals 1

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lxu/l;->openReadWrite(Lxu/h0;ZZ)Lxu/j;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: openReadWrite"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic sink$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)Lxu/p0;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/l;->sink(Lxu/h0;Z)Lxu/p0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sink"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final -read(Lxu/h0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxu/h0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lxu/g;",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readerAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxu/l;->source(Lxu/h0;)Lxu/r0;

    move-result-object p1

    invoke-static {p1}, Lxu/b0;->c(Lxu/r0;)Lxu/g;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(I)V

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :cond_0
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->a(I)V

    move-object v2, v1

    move-object v1, p2

    move-object p2, v2

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(I)V

    if-eqz p1, :cond_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-static {p2, p1}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/l;->a(I)V

    :goto_2
    if-nez p2, :cond_2

    return-object v1

    :cond_2
    throw p2
.end method

.method public final -write(Lxu/h0;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxu/h0;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lxu/f;",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writerAction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lxu/l;->sink(Lxu/h0;Z)Lxu/p0;

    move-result-object p1

    invoke-static {p1}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {p2}, Lkotlin/jvm/internal/l;->b(I)V

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_0
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->a(I)V

    move-object v1, v0

    move-object v0, p3

    move-object p3, v1

    goto :goto_2

    :catchall_1
    move-exception p3

    invoke-static {p2}, Lkotlin/jvm/internal/l;->b(I)V

    if-eqz p1, :cond_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-static {p3, p1}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-static {p2}, Lkotlin/jvm/internal/l;->a(I)V

    :goto_2
    if-nez p3, :cond_2

    return-object v0

    :cond_2
    throw p3
.end method

.method public final appendingSink(Lxu/h0;)Lxu/p0;
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lxu/l;->appendingSink(Lxu/h0;Z)Lxu/p0;

    move-result-object p1

    return-object p1
.end method

.method public abstract appendingSink(Lxu/h0;Z)Lxu/p0;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract atomicMove(Lxu/h0;Lxu/h0;)V
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract canonicalize(Lxu/h0;)Lxu/h0;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public copy(Lxu/h0;Lxu/h0;)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lyu/d;->b(Lxu/l;Lxu/h0;Lxu/h0;)V

    return-void
.end method

.method public final createDirectories(Lxu/h0;)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxu/l;->createDirectories(Lxu/h0;Z)V

    return-void
.end method

.method public final createDirectories(Lxu/h0;Z)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1, p2}, Lyu/d;->c(Lxu/l;Lxu/h0;Z)V

    return-void
.end method

.method public final createDirectory(Lxu/h0;)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lxu/l;->createDirectory(Lxu/h0;Z)V

    return-void
.end method

.method public abstract createDirectory(Lxu/h0;Z)V
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract createSymlink(Lxu/h0;Lxu/h0;)V
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final delete(Lxu/h0;)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lxu/l;->delete(Lxu/h0;Z)V

    return-void
.end method

.method public abstract delete(Lxu/h0;Z)V
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final deleteRecursively(Lxu/h0;)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fileOrDirectory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxu/l;->deleteRecursively(Lxu/h0;Z)V

    return-void
.end method

.method public deleteRecursively(Lxu/h0;Z)V
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fileOrDirectory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1, p2}, Lyu/d;->d(Lxu/l;Lxu/h0;Z)V

    return-void
.end method

.method public final exists(Lxu/h0;)Z
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lyu/d;->e(Lxu/l;Lxu/h0;)Z

    move-result p1

    return p1
.end method

.method public abstract list(Lxu/h0;)Ljava/util/List;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/h0;",
            ")",
            "Ljava/util/List<",
            "Lxu/h0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract listOrNull(Lxu/h0;)Ljava/util/List;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/h0;",
            ")",
            "Ljava/util/List<",
            "Lxu/h0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final listRecursively(Lxu/h0;)Lkotlin/sequences/Sequence;
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/h0;",
            ")",
            "Lkotlin/sequences/Sequence<",
            "Lxu/h0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxu/l;->listRecursively(Lxu/h0;Z)Lkotlin/sequences/Sequence;

    move-result-object p1

    return-object p1
.end method

.method public listRecursively(Lxu/h0;Z)Lkotlin/sequences/Sequence;
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/h0;",
            "Z)",
            "Lkotlin/sequences/Sequence<",
            "Lxu/h0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1, p2}, Lyu/d;->f(Lxu/l;Lxu/h0;Z)Lkotlin/sequences/Sequence;

    move-result-object p1

    return-object p1
.end method

.method public final metadata(Lxu/h0;)Lxu/k;
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lyu/d;->g(Lxu/l;Lxu/h0;)Lxu/k;

    move-result-object p1

    return-object p1
.end method

.method public abstract metadataOrNull(Lxu/h0;)Lxu/k;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract openReadOnly(Lxu/h0;)Lxu/j;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final openReadWrite(Lxu/h0;)Lxu/j;
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lxu/l;->openReadWrite(Lxu/h0;ZZ)Lxu/j;

    move-result-object p1

    return-object p1
.end method

.method public abstract openReadWrite(Lxu/h0;ZZ)Lxu/j;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final sink(Lxu/h0;)Lxu/p0;
    .locals 1
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lxu/l;->sink(Lxu/h0;Z)Lxu/p0;

    move-result-object p1

    return-object p1
.end method

.method public abstract sink(Lxu/h0;Z)Lxu/p0;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract source(Lxu/h0;)Lxu/r0;
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
