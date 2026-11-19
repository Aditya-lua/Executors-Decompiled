.class public final Lcom/google/android/gms/internal/play_billing/a7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:Ljava/lang/Class;

.field public static final c:Z

.field public static final d:Lcom/google/android/gms/internal/play_billing/z6;

.field public static final e:Z

.field public static final f:J

.field public static final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-class v0, Ljava/lang/Class;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a7;->k()Lsun/misc/Unsafe;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/play_billing/a7;->a:Lsun/misc/Unsafe;

    sget v2, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    const-class v2, Llibcore/io/Memory;

    sput-object v2, Lcom/google/android/gms/internal/play_billing/a7;->b:Ljava/lang/Class;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a7;->z(Ljava/lang/Class;)Z

    move-result v3

    sput-boolean v3, Lcom/google/android/gms/internal/play_billing/a7;->c:Z

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/a7;->z(Ljava/lang/Class;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v3, :cond_1

    new-instance v6, Lcom/google/android/gms/internal/play_billing/y6;

    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/play_billing/y6;-><init>(Lsun/misc/Unsafe;)V

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_2

    new-instance v6, Lcom/google/android/gms/internal/play_billing/x6;

    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/play_billing/x6;-><init>(Lsun/misc/Unsafe;)V

    :cond_2
    :goto_0
    sput-object v6, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    const-string v1, "getLong"

    const-class v3, Ljava/lang/reflect/Field;

    const-string v5, "objectFieldOffset"

    const-class v7, Ljava/lang/Object;

    if-eqz v6, :cond_3

    iget-object v6, v6, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    :try_start_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v5, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    filled-new-array {v7, v2}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a7;->a()Ljava/lang/reflect/Field;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v6

    invoke-static {v6}, Lcom/google/android/gms/internal/play_billing/a7;->l(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    sget-object v6, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v6, :cond_4

    :goto_2
    move v0, v9

    goto :goto_3

    :cond_4
    iget-object v6, v6, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    :try_start_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v6, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "arrayBaseOffset"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v6, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "arrayIndexScale"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v6, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getInt"

    filled-new-array {v7, v2}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v6, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putInt"

    filled-new-array {v7, v2, v4}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v6, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    filled-new-array {v7, v2}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v6, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putLong"

    filled-new-array {v7, v2, v2}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getObject"

    filled-new-array {v7, v2}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putObject"

    filled-new-array {v7, v2, v7}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v0, v8

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->l(Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_3
    sput-boolean v0, Lcom/google/android/gms/internal/play_billing/a7;->e:Z

    const-class v0, [B

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lcom/google/android/gms/internal/play_billing/a7;->f:J

    const-class v0, [Z

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->D(Ljava/lang/Class;)I

    const-class v0, [I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->D(Ljava/lang/Class;)I

    const-class v0, [J

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->D(Ljava/lang/Class;)I

    const-class v0, [F

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->D(Ljava/lang/Class;)I

    const-class v0, [D

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->D(Ljava/lang/Class;)I

    const-class v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->C(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a7;->D(Ljava/lang/Class;)I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a7;->a()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v1, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    if-eqz v1, :cond_5

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    :cond_5
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v1, :cond_6

    goto :goto_4

    :cond_6
    move v8, v9

    :goto_4
    sput-boolean v8, Lcom/google/android/gms/internal/play_billing/a7;->g:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Ljava/lang/Object;J)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/z6;->g(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static B()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/a7;->e:Z

    return v0
.end method

.method public static C(Ljava/lang/Class;)I
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/a7;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static D(Ljava/lang/Class;)I
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/a7;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static a()Ljava/lang/reflect/Field;
    .locals 3

    sget v0, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    const-string v0, "effectiveDirectAddress"

    const-class v1, Ljava/nio/Buffer;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/a7;->b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "address"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/a7;->b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Ljava/lang/Object;JB)V
    .locals 5

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    const-wide/16 v1, -0x4

    and-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    long-to-int p1, p1

    not-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v4, p2, p1

    not-int v4, v4

    and-int/2addr v3, v4

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v3

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static d(Ljava/lang/Object;JB)V
    .locals 5

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    const-wide/16 v1, -0x4

    and-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    long-to-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v4, p2, p1

    not-int v4, v4

    and-int/2addr v3, v4

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v3

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static e(Ljava/lang/Object;J)D
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/z6;->a(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static f(Ljava/lang/Object;J)F
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/z6;->b(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method public static g(Ljava/lang/Object;J)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static h(Ljava/lang/Object;J)J
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static i(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static j(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static k()Lsun/misc/Unsafe;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/play_billing/w6;

    invoke-direct {v1}, Lcom/google/android/gms/internal/play_billing/w6;-><init>()V

    invoke-static {v1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_0

    return-object v0

    :cond_0
    :try_start_1
    const-class v2, [B

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    const-class v1, Lcom/google/android/gms/internal/play_billing/a7;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "getUnsafe"

    const-string v4, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely."

    const-string v5, "com.google.protobuf.UnsafeUtil"

    invoke-virtual {v1, v2, v5, v3, v4}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic l(Ljava/lang/Throwable;)V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/play_billing/a7;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "platform method missing - proto runtime falling back to safer methods: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "com.google.protobuf.UnsafeUtil"

    const-string v3, "logMissingMethod"

    invoke-virtual {v0, v1, v2, v3, p0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/Object;JZ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/a7;->c(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static synthetic n(Ljava/lang/Object;JZ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/a7;->d(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static bridge synthetic o(Ljava/lang/Object;JB)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/a7;->c(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static bridge synthetic p(Ljava/lang/Object;JB)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/a7;->d(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static q(Ljava/lang/Object;JZ)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/z6;->c(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static r([BJB)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    sget-wide v1, Lcom/google/android/gms/internal/play_billing/a7;->f:J

    add-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2, p3}, Lcom/google/android/gms/internal/play_billing/z6;->d(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static s(Ljava/lang/Object;JD)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/z6;->e(Ljava/lang/Object;JD)V

    return-void
.end method

.method public static t(Ljava/lang/Object;JF)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/z6;->f(Ljava/lang/Object;JF)V

    return-void
.end method

.method public static u(Ljava/lang/Object;JI)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2, p3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static v(Ljava/lang/Object;JJ)V
    .locals 7

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v1, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public static w(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic x(Ljava/lang/Object;J)Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    const-wide/16 v1, -0x4

    and-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result p0

    not-long p1, p1

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic y(Ljava/lang/Object;J)Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a7;->d:Lcom/google/android/gms/internal/play_billing/z6;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/z6;->a:Lsun/misc/Unsafe;

    const-wide/16 v1, -0x4

    and-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result p0

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static z(Ljava/lang/Class;)Z
    .locals 6

    const-class v0, [B

    sget v1, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/play_billing/a7;->b:Ljava/lang/Class;

    const-string v2, "peekLong"

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v3}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "pokeLong"

    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v4, v3}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "pokeInt"

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v4, v3}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "peekInt"

    filled-new-array {p0, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "pokeByte"

    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "peekByte"

    filled-new-array {p0}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "pokeByteArray"

    filled-new-array {p0, v0, v4, v4}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "peekByteArray"

    filled-new-array {p0, v0, v4, v4}, [Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    const/4 p0, 0x0

    return p0
.end method
