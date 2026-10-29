.class public final Lh1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh1/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh1/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lh1/g;",
        "Lh1/f;",
        "Lf1/u;",
        "outputOptions",
        "<init>",
        "(Lf1/u;)V",
        "",
        "a",
        "()J",
        "Lf1/u;",
        "b",
        "camera-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lh1/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lf1/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh1/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh1/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh1/g;->b:Lh1/g$a;

    return-void
.end method

.method public constructor <init>(Lf1/u;)V
    .locals 1
    .param p1    # Lf1/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outputOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/g;->a:Lf1/u;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 5

    const-wide v0, 0x7fffffffffffffffL

    :try_start_0
    iget-object v2, p0, Lh1/g;->a:Lf1/u;

    instance-of v3, v2, Lf1/r;

    if-eqz v3, :cond_0

    check-cast v2, Lf1/r;

    invoke-virtual {v2}, Lf1/r;->d()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2}, Ln1/e;->b(Ljava/io/File;)J

    move-result-wide v0

    return-wide v0

    :catch_0
    move-exception v2

    goto :goto_0

    :cond_0
    instance-of v3, v2, Lf1/t;

    if-eqz v3, :cond_1

    check-cast v2, Lf1/t;

    invoke-virtual {v2}, Lf1/t;->d()Landroid/net/Uri;

    move-result-object v2

    const-string v3, "getCollectionUri(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ln1/e;->d(Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    instance-of v2, v2, Lf1/q;

    if-eqz v2, :cond_2

    return-wide v0

    :cond_2
    new-instance v2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown OutputOptions: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lh1/g;->a:Lf1/u;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const-string v3, "OutputStorageImpl"

    const-string v4, "Fail to access the available bytes."

    invoke-static {v3, v4, v2}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-wide v0
.end method
