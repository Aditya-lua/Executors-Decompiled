.class public final Lgn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgn/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgn/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lgn/o;",
        "Lgn/e;",
        "<init>",
        "()V",
        "Lfn/z;",
        "image",
        "Landroid/graphics/Rect;",
        "viewfinderRect",
        "Ljt/n;",
        "Lgn/a;",
        "a",
        "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;",
        "Lgn/n;",
        "b",
        "()Lgn/n;",
        "Lgn/n;",
        "textEntityExtractor",
        "Ljava/util/HashMap;",
        "",
        "",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "previousReadings",
        "c",
        "camera_release"
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
.field public static final c:Lgn/o$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lgn/n;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
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

    new-instance v0, Lgn/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgn/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgn/o;->c:Lgn/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lgn/o;->b()Lgn/n;

    move-result-object v0

    iput-object v0, p0, Lgn/o;->a:Lgn/n;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lgn/o;->b:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lfn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/z;",
            "Landroid/graphics/Rect;",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "+",
            "Lgn/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lgn/o$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lgn/o$b;

    iget v1, v0, Lgn/o$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgn/o$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgn/o$b;

    invoke-direct {v0, p0, p3}, Lgn/o$b;-><init>(Lgn/o;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lgn/o$b;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lgn/o$b;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lgn/o$b;->u:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Rect;

    iget-object p1, v0, Lgn/o$b;->t:Ljava/lang/Object;

    check-cast p1, Lfn/z;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lgn/o;->a:Lgn/n;

    if-eqz p3, :cond_4

    invoke-interface {p1}, Lfn/z;->g()Lcom/google/mlkit/vision/common/InputImage;

    move-result-object v2

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lgn/o$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lgn/o$b;->u:Ljava/lang/Object;

    iput v4, v0, Lgn/o$b;->x:I

    invoke-interface {p3, v2, v0}, Lgn/n;->b(Lcom/google/mlkit/vision/common/InputImage;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljt/n;

    goto :goto_2

    :cond_4
    move-object p3, v3

    :goto_2
    if-eqz p3, :cond_6

    invoke-virtual {p3}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    move-object p1, v3

    :cond_5
    check-cast p1, Lgn/a;

    goto :goto_3

    :cond_6
    move-object p1, v3

    :goto_3
    instance-of p2, p1, Lgn/a$f;

    if-eqz p2, :cond_7

    check-cast p1, Lgn/a$f;

    invoke-virtual {p1}, Lgn/a$f;->a()Lcom/withpersona/sdk2/camera/ExtractedTexts;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/ExtractedTexts;->a()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {p1}, Lgn/a$f;->a()Lcom/withpersona/sdk2/camera/ExtractedTexts;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/ExtractedTexts;->f()Ljava/util/Date;

    move-result-object p1

    goto :goto_4

    :cond_7
    move-object p1, v3

    :goto_4
    const/4 v0, 0x0

    if-eqz v3, :cond_9

    if-eqz p1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgn/o;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_5

    :cond_8
    move v5, v0

    :goto_5
    add-int/2addr v5, v4

    invoke-static {v5}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    if-eqz v3, :cond_a

    if-eqz p1, :cond_a

    move v1, v4

    goto :goto_6

    :cond_a
    move v1, v0

    :goto_6
    iget-object v2, p0, Lgn/o;->b:Ljava/util/HashMap;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_7

    :cond_b
    const/4 v2, -0x1

    :goto_7
    const/4 v5, 0x3

    if-lt v2, v5, :cond_c

    goto :goto_8

    :cond_c
    move v4, v0

    :goto_8
    if-eqz v1, :cond_e

    if-eqz v4, :cond_e

    iget-object p2, p0, Lgn/o;->a:Lgn/n;

    if-eqz p2, :cond_d

    invoke-interface {p2}, Lgn/n;->close()V

    :cond_d
    sget-object p2, Ljt/n;->b:Ljt/n$a;

    new-instance p2, Lgn/a$f;

    new-instance p3, Lcom/withpersona/sdk2/camera/ExtractedTexts;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p3, v3, p1}, Lcom/withpersona/sdk2/camera/ExtractedTexts;-><init>(Ljava/util/Date;Ljava/util/Date;)V

    invoke-direct {p2, p3}, Lgn/a$f;-><init>(Lcom/withpersona/sdk2/camera/ExtractedTexts;)V

    invoke-static {p2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_e
    if-eqz p2, :cond_f

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    sget-object p1, Lgn/a$b;->a:Lgn/a$b;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_f
    if-eqz p3, :cond_10

    invoke-virtual {p3}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_10
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    sget-object p1, Lgn/a$b;->a:Lgn/a$b;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lgn/n;
    .locals 2

    :try_start_0
    const-string v0, "com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgn/n;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
