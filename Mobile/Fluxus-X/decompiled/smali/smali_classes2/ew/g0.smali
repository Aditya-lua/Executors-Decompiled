.class public final Lew/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lew/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B1\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0002\u0010\u000cJ\r\u0010\r\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001cR\u0016\u0010\u0008\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lew/g0;",
        "",
        "<init>",
        "()V",
        "",
        "data",
        "",
        "pos",
        "limit",
        "",
        "shared",
        "owner",
        "([BIIZZ)V",
        "d",
        "()Lew/g0;",
        "b",
        "segment",
        "c",
        "(Lew/g0;)Lew/g0;",
        "byteCount",
        "e",
        "(I)Lew/g0;",
        "",
        "a",
        "sink",
        "f",
        "(Lew/g0;I)V",
        "[B",
        "I",
        "Z",
        "Lew/g0;",
        "next",
        "g",
        "prev",
        "h",
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
.field public static final h:Lew/g0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Lew/g0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Lew/g0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lew/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lew/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lew/g0;->h:Lew/g0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 2
    new-array v0, v0, [B

    iput-object v0, p0, Lew/g0;->a:[B

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lew/g0;->e:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lew/g0;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 1
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lew/g0;->a:[B

    .line 7
    iput p2, p0, Lew/g0;->b:I

    .line 8
    iput p3, p0, Lew/g0;->c:I

    .line 9
    iput-boolean p4, p0, Lew/g0;->d:Z

    .line 10
    iput-boolean p5, p0, Lew/g0;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lew/g0;->g:Lew/g0;

    if-eq v0, p0, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-boolean v0, v0, Lew/g0;->e:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lew/g0;->c:I

    iget v1, p0, Lew/g0;->b:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lew/g0;->g:Lew/g0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v1, Lew/g0;->c:I

    rsub-int v1, v1, 0x2000

    iget-object v2, p0, Lew/g0;->g:Lew/g0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-boolean v2, v2, Lew/g0;->d:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lew/g0;->g:Lew/g0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v2, v2, Lew/g0;->b:I

    :goto_0
    add-int/2addr v1, v2

    if-le v0, v1, :cond_2

    :goto_1
    return-void

    :cond_2
    iget-object v1, p0, Lew/g0;->g:Lew/g0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0}, Lew/g0;->f(Lew/g0;I)V

    invoke-virtual {p0}, Lew/g0;->b()Lew/g0;

    invoke-static {p0}, Lew/h0;->b(Lew/g0;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot compact"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lew/g0;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lew/g0;->f:Lew/g0;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lew/g0;->g:Lew/g0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lew/g0;->f:Lew/g0;

    iput-object v3, v2, Lew/g0;->f:Lew/g0;

    iget-object v2, p0, Lew/g0;->f:Lew/g0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lew/g0;->g:Lew/g0;

    iput-object v3, v2, Lew/g0;->g:Lew/g0;

    iput-object v1, p0, Lew/g0;->f:Lew/g0;

    iput-object v1, p0, Lew/g0;->g:Lew/g0;

    return-object v0
.end method

.method public final c(Lew/g0;)Lew/g0;
    .locals 1
    .param p1    # Lew/g0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lew/g0;->g:Lew/g0;

    iget-object v0, p0, Lew/g0;->f:Lew/g0;

    iput-object v0, p1, Lew/g0;->f:Lew/g0;

    iget-object v0, p0, Lew/g0;->f:Lew/g0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p1, v0, Lew/g0;->g:Lew/g0;

    iput-object p1, p0, Lew/g0;->f:Lew/g0;

    return-object p1
.end method

.method public final d()Lew/g0;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lew/g0;->d:Z

    new-instance v1, Lew/g0;

    iget-object v2, p0, Lew/g0;->a:[B

    iget v3, p0, Lew/g0;->b:I

    iget v4, p0, Lew/g0;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lew/g0;-><init>([BIIZZ)V

    return-object v1
.end method

.method public final e(I)Lew/g0;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-lez p1, :cond_1

    iget v0, p0, Lew/g0;->c:I

    iget v1, p0, Lew/g0;->b:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_1

    const/16 v0, 0x400

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lew/g0;->d()Lew/g0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lew/h0;->c()Lew/g0;

    move-result-object v0

    iget-object v1, p0, Lew/g0;->a:[B

    iget-object v2, v0, Lew/g0;->a:[B

    iget v4, p0, Lew/g0;->b:I

    add-int v5, v4, p1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->j([B[BIIIILjava/lang/Object;)[B

    :goto_0
    iget v1, v0, Lew/g0;->b:I

    add-int/2addr v1, p1

    iput v1, v0, Lew/g0;->c:I

    iget v1, p0, Lew/g0;->b:I

    add-int/2addr v1, p1

    iput v1, p0, Lew/g0;->b:I

    iget-object p1, p0, Lew/g0;->g:Lew/g0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lew/g0;->c(Lew/g0;)Lew/g0;

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteCount out of range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lew/g0;I)V
    .locals 8
    .param p1    # Lew/g0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lew/g0;->e:Z

    if-eqz v0, :cond_3

    iget v5, p1, Lew/g0;->c:I

    add-int v0, v5, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    iget-boolean v0, p1, Lew/g0;->d:Z

    if-nez v0, :cond_1

    add-int v0, v5, p2

    iget v4, p1, Lew/g0;->b:I

    sub-int/2addr v0, v4

    if-gt v0, v1, :cond_0

    iget-object v1, p1, Lew/g0;->a:[B

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v2, v1

    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->j([B[BIIIILjava/lang/Object;)[B

    iget v0, p1, Lew/g0;->c:I

    iget v1, p1, Lew/g0;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Lew/g0;->c:I

    const/4 v0, 0x0

    iput v0, p1, Lew/g0;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lew/g0;->a:[B

    iget-object v1, p1, Lew/g0;->a:[B

    iget v2, p1, Lew/g0;->c:I

    iget v3, p0, Lew/g0;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/collections/l;->f([B[BIII)[B

    iget v0, p1, Lew/g0;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lew/g0;->c:I

    iget p1, p0, Lew/g0;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lew/g0;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
