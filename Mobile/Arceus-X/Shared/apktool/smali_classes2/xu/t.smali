.class public final Lxu/t;
.super Lxu/o;
.source "SourceFile"

# interfaces
.implements Lxu/p0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxu/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u0012B\u0019\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0019\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198G\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lxu/t;",
        "Lxu/o;",
        "Lxu/p0;",
        "sink",
        "Ljava/security/MessageDigest;",
        "digest",
        "<init>",
        "(Lxu/p0;Ljava/security/MessageDigest;)V",
        "",
        "algorithm",
        "(Lxu/p0;Ljava/lang/String;)V",
        "Lxu/e;",
        "source",
        "",
        "byteCount",
        "",
        "write",
        "(Lxu/e;J)V",
        "a",
        "Ljava/security/MessageDigest;",
        "messageDigest",
        "Ljavax/crypto/Mac;",
        "b",
        "Ljavax/crypto/Mac;",
        "mac",
        "Lxu/h;",
        "()Lxu/h;",
        "hash",
        "c",
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
.field public static final c:Lxu/t$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/security/MessageDigest;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Ljavax/crypto/Mac;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxu/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxu/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxu/t;->c:Lxu/t$a;

    return-void
.end method

.method public constructor <init>(Lxu/p0;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lxu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "algorithm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2

    const-string v0, "getInstance(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lxu/t;-><init>(Lxu/p0;Ljava/security/MessageDigest;)V

    return-void
.end method

.method public constructor <init>(Lxu/p0;Ljava/security/MessageDigest;)V
    .locals 1
    .param p1    # Lxu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/security/MessageDigest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lxu/o;-><init>(Lxu/p0;)V

    .line 2
    iput-object p2, p0, Lxu/t;->a:Ljava/security/MessageDigest;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lxu/t;->b:Ljavax/crypto/Mac;

    return-void
.end method


# virtual methods
.method public final a()Lxu/h;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/t;->a:Ljava/security/MessageDigest;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxu/t;->b:Ljavax/crypto/Mac;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    :goto_0
    new-instance v1, Lxu/h;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lxu/h;-><init>([B)V

    return-object v1
.end method

.method public write(Lxu/e;J)V
    .locals 9
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    iget-object p2, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    :goto_0
    cmp-long p3, v0, v5

    if-gez p3, :cond_1

    sub-long v2, v5, v0

    iget p3, p2, Lxu/m0;->c:I

    iget v4, p2, Lxu/m0;->b:I

    sub-int/2addr p3, v4

    int-to-long v7, p3

    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Lxu/t;->a:Ljava/security/MessageDigest;

    if-eqz v2, :cond_0

    iget-object v3, p2, Lxu/m0;->a:[B

    iget v4, p2, Lxu/m0;->b:I

    invoke-virtual {v2, v3, v4, p3}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lxu/t;->b:Ljavax/crypto/Mac;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p2, Lxu/m0;->a:[B

    iget v4, p2, Lxu/m0;->b:I

    invoke-virtual {v2, v3, v4, p3}, Ljavax/crypto/Mac;->update([BII)V

    :goto_1
    int-to-long v2, p3

    add-long/2addr v0, v2

    iget-object p2, p2, Lxu/m0;->f:Lxu/m0;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, v5, v6}, Lxu/o;->write(Lxu/e;J)V

    return-void
.end method
