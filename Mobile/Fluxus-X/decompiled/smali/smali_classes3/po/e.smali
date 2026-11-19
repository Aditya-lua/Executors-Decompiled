.class public final Lpo/e;
.super Lmv/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpo/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpo/e;",
        "Lmv/g0;",
        "Ljava/io/File;",
        "file",
        "Lmv/b0;",
        "mediaType",
        "<init>",
        "(Ljava/io/File;Lmv/b0;)V",
        "b",
        "()Lmv/b0;",
        "",
        "a",
        "()J",
        "Lew/f;",
        "sink",
        "",
        "h",
        "(Lew/f;)V",
        "Ldv/p0;",
        "",
        "i",
        "()Ldv/p0;",
        "c",
        "Ljava/io/File;",
        "d",
        "Lmv/b0;",
        "Ldv/c0;",
        "e",
        "Ldv/c0;",
        "flow",
        "f",
        "document_release"
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
.field public static final f:Lpo/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final c:Ljava/io/File;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lmv/b0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpo/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpo/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpo/e;->f:Lpo/e$a;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lmv/b0;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lmv/g0;-><init>()V

    iput-object p1, p0, Lpo/e;->c:Ljava/io/File;

    iput-object p2, p0, Lpo/e;->d:Lmv/b0;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lpo/e;->e:Ldv/c0;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lpo/e;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lmv/b0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lpo/e;->d:Lmv/b0;

    return-object v0
.end method

.method public h(Lew/f;)V
    .locals 11
    .param p1    # Lew/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpo/e;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-float v0, v0

    const/16 v1, 0x800

    new-array v1, v1, [B

    new-instance v2, Ljava/io/FileInputStream;

    iget-object v3, p0, Lpo/e;->c:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    :try_start_0
    invoke-virtual {v2, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move v7, v4

    :cond_0
    :goto_0
    const/4 v8, -0x1

    if-eq v3, v8, :cond_2

    int-to-long v8, v3

    add-long/2addr v5, v8

    invoke-interface {p1, v1, v4, v3}, Lew/f;->write([BII)Lew/f;

    invoke-virtual {v2, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v3

    long-to-float v8, v5

    div-float/2addr v8, v0

    const/high16 v9, 0x42c80000    # 100.0f

    mul-float/2addr v8, v9

    invoke-static {v8}, Lsu/b;->d(F)I

    move-result v8

    sub-int v9, v8, v7

    const/4 v10, 0x1

    if-gt v9, v10, :cond_1

    const/16 v9, 0x64

    if-lt v8, v9, :cond_0

    :cond_1
    iget-object v7, p0, Lpo/e;->e:Ldv/c0;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v7, v9}, Ldv/b0;->a(Ljava/lang/Object;)Z

    move v7, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v2, p1}, Llu/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v2, p1}, Llu/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final i()Ldv/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/p0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpo/e;->e:Ldv/c0;

    invoke-static {v0}, Ldv/j;->a(Ldv/c0;)Ldv/p0;

    move-result-object v0

    return-object v0
.end method
