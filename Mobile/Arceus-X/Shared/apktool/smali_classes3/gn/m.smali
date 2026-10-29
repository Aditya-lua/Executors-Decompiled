.class public final Lgn/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgn/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lgn/m;",
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
        "Lcom/google/mlkit/vision/text/TextRecognizer;",
        "Ljt/h;",
        "c",
        "()Lcom/google/mlkit/vision/text/TextRecognizer;",
        "textDetector",
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


# instance fields
.field public final a:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgn/l;

    invoke-direct {v0}, Lgn/l;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lgn/m;->a:Ljt/h;

    return-void
.end method

.method public static synthetic b()Lcom/google/mlkit/vision/text/TextRecognizer;
    .locals 1

    invoke-static {}, Lgn/m;->d()Lcom/google/mlkit/vision/text/TextRecognizer;

    move-result-object v0

    return-object v0
.end method

.method private final c()Lcom/google/mlkit/vision/text/TextRecognizer;
    .locals 1

    iget-object v0, p0, Lgn/m;->a:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/vision/text/TextRecognizer;

    return-object v0
.end method

.method public static final d()Lcom/google/mlkit/vision/text/TextRecognizer;
    .locals 2

    sget-object v0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->DEFAULT_OPTIONS:Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;

    invoke-static {v0}, Lcom/google/mlkit/vision/text/TextRecognition;->getClient(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)Lcom/google/mlkit/vision/text/TextRecognizer;

    move-result-object v0

    const-string v1, "getClient(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;
    .locals 3
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

    invoke-direct {p0}, Lgn/m;->c()Lcom/google/mlkit/vision/text/TextRecognizer;

    move-result-object p2

    invoke-interface {p1}, Lfn/z;->g()Lcom/google/mlkit/vision/common/InputImage;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/mlkit/vision/text/TextRecognizer;->process(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "process(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lsb/m;->a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/mlkit/vision/text/Text;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/vision/text/Text;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/text/Text;->getText()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getText(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, ""

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    sget-object p1, Lgn/a$b;->a:Lgn/a$b;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lfn/g0;->p:Lfn/g0$a;

    invoke-virtual {p2, p1}, Lfn/g0$a;->e(Ljava/lang/String;)Lfn/g0;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    sget-object p1, Lgn/a$b;->a:Lgn/a$b;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p2, Ljt/n;->b:Ljt/n$a;

    new-instance p2, Lgn/a$a;

    new-instance p3, Lfn/e$a;

    invoke-virtual {p1}, Lfn/g0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lfn/g0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lfn/g0;->f()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {p1}, Lfn/g0;->g()Ljava/util/Date;

    move-result-object p1

    invoke-direct {p3, v0, v1, v2, p1}, Lfn/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V

    invoke-direct {p2, p3}, Lgn/a$a;-><init>(Lfn/e;)V

    invoke-static {p2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Lgn/b$b;

    invoke-direct {p1}, Lgn/b$b;-><init>()V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
