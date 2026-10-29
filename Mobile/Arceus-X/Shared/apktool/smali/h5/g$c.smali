.class public final Lh5/g$c;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh5/g$c$a;,
        Lh5/g$c$b;,
        Lh5/g$c$c;,
        Lh5/g$c$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u0000 <2\u00020\u0001:\u0003(,\u0010B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\'\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008 \u0010\u0019J\'\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\'\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00100\u001a\u0004\u00081\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00103\u001a\u0004\u00084\u00105R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u00103R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u00108R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u00103\u00a8\u0006="
    }
    d2 = {
        "Lh5/g$c;",
        "Landroid/database/sqlite/SQLiteOpenHelper;",
        "Landroid/content/Context;",
        "context",
        "",
        "name",
        "Lh5/g$b;",
        "dbRef",
        "Lg5/d$a;",
        "callback",
        "",
        "allowDataLossOnRecovery",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Lh5/g$b;Lg5/d$a;Z)V",
        "writable",
        "Lg5/c;",
        "c",
        "(Z)Lg5/c;",
        "Landroid/database/sqlite/SQLiteDatabase;",
        "sqLiteDatabase",
        "Lh5/e;",
        "d",
        "(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;",
        "",
        "onCreate",
        "(Landroid/database/sqlite/SQLiteDatabase;)V",
        "",
        "oldVersion",
        "newVersion",
        "onUpgrade",
        "(Landroid/database/sqlite/SQLiteDatabase;II)V",
        "db",
        "onConfigure",
        "onDowngrade",
        "onOpen",
        "close",
        "()V",
        "f",
        "(Z)Landroid/database/sqlite/SQLiteDatabase;",
        "e",
        "a",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "b",
        "Lh5/g$b;",
        "getDbRef",
        "()Lh5/g$b;",
        "Lg5/d$a;",
        "getCallback",
        "()Lg5/d$a;",
        "Z",
        "getAllowDataLossOnRecovery",
        "()Z",
        "migrated",
        "Lj5/a;",
        "Lj5/a;",
        "lock",
        "g",
        "opened",
        "h",
        "sqlite-framework"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final h:Lh5/g$c$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lh5/g$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lg5/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Z

.field public e:Z

.field public final f:Lj5/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh5/g$c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh5/g$c$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh5/g$c;->h:Lh5/g$c$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lh5/g$b;Lg5/d$a;Z)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lh5/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lg5/d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dbRef"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, p4, Lg5/d$a;->a:I

    new-instance v6, Lh5/h;

    invoke-direct {v6, p4, p3}, Lh5/h;-><init>(Lg5/d$a;Lh5/g$b;)V

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object v2, v1, Lh5/g$c;->a:Landroid/content/Context;

    iput-object p3, v1, Lh5/g$c;->b:Lh5/g$b;

    iput-object p4, v1, Lh5/g$c;->c:Lg5/d$a;

    iput-boolean p5, v1, Lh5/g$c;->d:Z

    new-instance p1, Lj5/a;

    if-nez v3, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "toString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p3

    const/4 p4, 0x0

    invoke-direct {p1, p2, p3, p4}, Lj5/a;-><init>(Ljava/lang/String;Ljava/io/File;Z)V

    iput-object p1, v1, Lh5/g$c;->f:Lj5/a;

    return-void
.end method

.method public static synthetic a(Lg5/d$a;Lh5/g$b;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lh5/g$c;->b(Lg5/d$a;Lh5/g$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public static final b(Lg5/d$a;Lh5/g$b;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    sget-object v0, Lh5/g$c;->h:Lh5/g$c$c;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lh5/g$c$c;->a(Lh5/g$b;Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg5/d$a;->c(Lg5/c;)V

    return-void
.end method


# virtual methods
.method public final c(Z)Lg5/c;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lh5/g$c;->f:Lj5/a;

    iget-boolean v1, p0, Lh5/g$c;->g:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lj5/a;->b(Z)V

    iput-boolean v2, p0, Lh5/g$c;->e:Z

    invoke-virtual {p0, p1}, Lh5/g$c;->f(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-boolean v1, p0, Lh5/g$c;->e:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lh5/g$c;->close()V

    invoke-virtual {p0, p1}, Lh5/g$c;->c(Z)Lg5/c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object v0, p0, Lh5/g$c;->f:Lj5/a;

    invoke-virtual {v0}, Lj5/a;->d()V

    return-object p1

    :cond_1
    :try_start_1
    invoke-virtual {p0, v0}, Lh5/g$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lh5/g$c;->f:Lj5/a;

    invoke-virtual {v0}, Lj5/a;->d()V

    throw p1
.end method

.method public close()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lh5/g$c;->f:Lj5/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lj5/a;->c(Lj5/a;ZILjava/lang/Object;)V

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v0, p0, Lh5/g$c;->b:Lh5/g$b;

    invoke-virtual {v0, v2}, Lh5/g$b;->b(Lh5/e;)V

    iput-boolean v3, p0, Lh5/g$c;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lh5/g$c;->f:Lj5/a;

    invoke-virtual {v0}, Lj5/a;->d()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lh5/g$c;->f:Lj5/a;

    invoke-virtual {v1}, Lj5/a;->d()V

    throw v0
.end method

.method public final d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh5/g$c;->h:Lh5/g$c$c;

    iget-object v1, p0, Lh5/g$c;->b:Lh5/g$b;

    invoke-virtual {v0, v1, p1}, Lh5/g$c$c;->a(Lh5/g$b;Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    return-object p1
.end method

.method public final e(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    if-eqz p1, :cond_0

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final f(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 4

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lh5/g$c;->g:Z

    if-eqz v0, :cond_0

    if-nez v1, :cond_0

    iget-object v1, p0, Lh5/g$c;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid database parent file, not a directory: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SupportSQLite"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lh5/g$c;->e(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const-wide/16 v1, 0x1f4

    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    invoke-virtual {p0, p1}, Lh5/g$c;->e(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object p1

    :catchall_1
    move-exception v1

    instance-of v2, v1, Lh5/g$c$a;

    if-eqz v2, :cond_4

    check-cast v1, Lh5/g$c$a;

    invoke-virtual {v1}, Lh5/g$c$a;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1}, Lh5/g$c$a;->a()Lh5/g$c$b;

    move-result-object v1

    sget-object v3, Lh5/g$c$d;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    const/4 v3, 0x4

    if-eq v1, v3, :cond_3

    const/4 v3, 0x5

    if-ne v1, v3, :cond_2

    instance-of v1, v2, Landroid/database/sqlite/SQLiteException;

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    throw v2

    :cond_2
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_3
    throw v2

    :cond_4
    :goto_0
    instance-of v2, v1, Landroid/database/sqlite/SQLiteException;

    if-eqz v2, :cond_5

    if-eqz v0, :cond_5

    iget-boolean v2, p0, Lh5/g$c;->d:Z

    if-eqz v2, :cond_5

    iget-object v1, p0, Lh5/g$c;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    :try_start_3
    invoke-virtual {p0, p1}, Lh5/g$c;->e(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_3
    .catch Lh5/g$c$a; {:try_start_3 .. :try_end_3} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lh5/g$c$a;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_5
    throw v1
.end method

.method public onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lh5/g$c;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh5/g$c;->c:Lg5/d$a;

    iget v0, v0, Lg5/d$a;->a:I

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->setMaxSqlCacheSize(I)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lh5/g$c;->c:Lg5/d$a;

    invoke-virtual {p0, p1}, Lh5/g$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg5/d$a;->b(Lg5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lh5/g$c$a;

    sget-object v1, Lh5/g$c$b;->a:Lh5/g$c$b;

    invoke-direct {v0, v1, p1}, Lh5/g$c$a;-><init>(Lh5/g$c$b;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lh5/g$c;->c:Lg5/d$a;

    invoke-virtual {p0, p1}, Lh5/g$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg5/d$a;->d(Lg5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lh5/g$c$a;

    sget-object v1, Lh5/g$c$b;->b:Lh5/g$c$b;

    invoke-direct {v0, v1, p1}, Lh5/g$c$a;-><init>(Lh5/g$c$b;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh5/g$c;->e:Z

    :try_start_0
    iget-object v0, p0, Lh5/g$c;->c:Lg5/d$a;

    invoke-virtual {p0, p1}, Lh5/g$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lg5/d$a;->e(Lg5/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lh5/g$c$a;

    sget-object p3, Lh5/g$c$b;->d:Lh5/g$c$b;

    invoke-direct {p2, p3, p1}, Lh5/g$c$a;-><init>(Lh5/g$c$b;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lh5/g$c;->e:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lh5/g$c;->c:Lg5/d$a;

    invoke-virtual {p0, p1}, Lh5/g$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg5/d$a;->f(Lg5/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Lh5/g$c$a;

    sget-object v1, Lh5/g$c$b;->e:Lh5/g$c$b;

    invoke-direct {v0, v1, p1}, Lh5/g$c$a;-><init>(Lh5/g$c$b;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lh5/g$c;->g:Z

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh5/g$c;->e:Z

    :try_start_0
    iget-object v0, p0, Lh5/g$c;->c:Lg5/d$a;

    invoke-virtual {p0, p1}, Lh5/g$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lg5/d$a;->g(Lg5/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lh5/g$c$a;

    sget-object p3, Lh5/g$c$b;->c:Lh5/g$c$b;

    invoke-direct {p2, p3, p1}, Lh5/g$c$a;-><init>(Lh5/g$c$b;Ljava/lang/Throwable;)V

    throw p2
.end method
