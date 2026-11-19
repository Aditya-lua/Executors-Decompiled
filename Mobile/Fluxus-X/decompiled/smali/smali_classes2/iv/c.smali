.class public final Liv/c;
.super Liv/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Liv/c;",
        "Liv/f;",
        "<init>",
        "()V",
        "",
        "parallelism",
        "",
        "name",
        "Lav/l0;",
        "Q",
        "(ILjava/lang/String;)Lav/l0;",
        "",
        "close",
        "toString",
        "()Ljava/lang/String;",
        "kotlinx-coroutines-core"
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
.field public static final i:Liv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liv/c;

    invoke-direct {v0}, Liv/c;-><init>()V

    sput-object v0, Liv/c;->i:Liv/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    sget v1, Liv/j;->c:I

    sget v2, Liv/j;->d:I

    sget-wide v3, Liv/j;->e:J

    sget-object v5, Liv/j;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Liv/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public Q(ILjava/lang/String;)Lav/l0;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Lgv/m;->a(I)V

    sget v0, Liv/j;->c:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p2}, Lgv/m;->b(Lav/l0;Ljava/lang/String;)Lav/l0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, Lav/l0;->Q(ILjava/lang/String;)Lav/l0;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
