.class public final Lmv/i0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmv/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lmv/i0$b;",
        "",
        "<init>",
        "()V",
        "",
        "Lmv/b0;",
        "contentType",
        "Lmv/i0;",
        "c",
        "(Ljava/lang/String;Lmv/b0;)Lmv/i0;",
        "",
        "e",
        "([BLmv/b0;)Lmv/i0;",
        "Lew/h;",
        "b",
        "(Lew/h;Lmv/b0;)Lmv/i0;",
        "Lew/g;",
        "",
        "contentLength",
        "a",
        "(Lew/g;Lmv/b0;J)Lmv/i0;",
        "content",
        "d",
        "(Lmv/b0;JLew/g;)Lmv/i0;",
        "EMPTY",
        "Lmv/i0;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmv/i0$b;-><init>()V

    return-void
.end method

.method public static synthetic f(Lmv/i0$b;Lew/h;Lmv/b0;ILjava/lang/Object;)Lmv/i0;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lmv/i0$b;->b(Lew/h;Lmv/b0;)Lmv/i0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lew/g;Lmv/b0;J)Lmv/i0;
    .locals 1
    .param p1    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmv/i0$b$a;

    invoke-direct {v0, p2, p3, p4, p1}, Lmv/i0$b$a;-><init>(Lmv/b0;JLew/g;)V

    return-object v0
.end method

.method public final b(Lew/h;Lmv/b0;)Lmv/i0;
    .locals 3
    .param p1    # Lew/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    invoke-virtual {v0, p1}, Lew/e;->h0(Lew/h;)Lew/e;

    move-result-object v0

    invoke-virtual {p1}, Lew/h;->I()I

    move-result p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, Lmv/i0$b;->a(Lew/g;Lmv/b0;J)Lmv/i0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Lmv/b0;)Lmv/i0;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lnv/b;->b(Lmv/b0;)Lkotlin/Pair;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/charset/Charset;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lmv/b0;

    new-instance v1, Lew/e;

    invoke-direct {v1}, Lew/e;-><init>()V

    invoke-virtual {v1, p1, v0}, Lew/e;->E0(Ljava/lang/String;Ljava/nio/charset/Charset;)Lew/e;

    move-result-object p1

    invoke-virtual {p1}, Lew/e;->size()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lmv/i0$b;->a(Lew/g;Lmv/b0;J)Lmv/i0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lmv/b0;JLew/g;)Lmv/i0;
    .locals 1
    .param p1    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "content"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p2, p3}, Lmv/i0$b;->a(Lew/g;Lmv/b0;J)Lmv/i0;

    move-result-object p1

    return-object p1
.end method

.method public final e([BLmv/b0;)Lmv/i0;
    .locals 3
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    invoke-virtual {v0, p1}, Lew/e;->i0([B)Lew/e;

    move-result-object v0

    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, Lmv/i0$b;->a(Lew/g;Lmv/b0;J)Lmv/i0;

    move-result-object p1

    return-object p1
.end method
