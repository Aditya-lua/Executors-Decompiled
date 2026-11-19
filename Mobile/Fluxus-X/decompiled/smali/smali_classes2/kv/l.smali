.class public final Lkv/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000c\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u000c\u00a8\u0006\u001a"
    }
    d2 = {
        "",
        "permits",
        "acquiredPermits",
        "Lkv/h;",
        "a",
        "(II)Lkv/h;",
        "",
        "id",
        "Lkv/m;",
        "prev",
        "j",
        "(JLkv/m;)Lkv/m;",
        "I",
        "MAX_SPIN_CYCLES",
        "Lgv/e0;",
        "b",
        "Lgv/e0;",
        "PERMIT",
        "c",
        "TAKEN",
        "d",
        "BROKEN",
        "e",
        "CANCELLED",
        "f",
        "SEGMENT_SIZE",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:I

.field public static final b:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v4, 0xc

    const/4 v5, 0x0

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lgv/f0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lkv/l;->a:I

    new-instance v0, Lgv/e0;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkv/l;->b:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkv/l;->c:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkv/l;->d:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkv/l;->e:Lgv/e0;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lgv/f0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lkv/l;->f:I

    return-void
.end method

.method public static final a(II)Lkv/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lkv/k;

    invoke-direct {v0, p0, p1}, Lkv/k;-><init>(II)V

    return-object v0
.end method

.method public static synthetic b(IIILjava/lang/Object;)Lkv/h;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lkv/l;->a(II)Lkv/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(JLkv/m;)Lkv/m;
    .locals 0

    invoke-static {p0, p1, p2}, Lkv/l;->j(JLkv/m;)Lkv/m;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Lgv/e0;
    .locals 1

    sget-object v0, Lkv/l;->d:Lgv/e0;

    return-object v0
.end method

.method public static final synthetic e()Lgv/e0;
    .locals 1

    sget-object v0, Lkv/l;->e:Lgv/e0;

    return-object v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lkv/l;->a:I

    return v0
.end method

.method public static final synthetic g()Lgv/e0;
    .locals 1

    sget-object v0, Lkv/l;->b:Lgv/e0;

    return-object v0
.end method

.method public static final synthetic h()I
    .locals 1

    sget v0, Lkv/l;->f:I

    return v0
.end method

.method public static final synthetic i()Lgv/e0;
    .locals 1

    sget-object v0, Lkv/l;->c:Lgv/e0;

    return-object v0
.end method

.method public static final j(JLkv/m;)Lkv/m;
    .locals 2

    new-instance v0, Lkv/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lkv/m;-><init>(JLkv/m;I)V

    return-object v0
.end method
