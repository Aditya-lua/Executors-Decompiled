.class public interface abstract Lgn/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnr/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lgn/n;",
        "Lnr/a;",
        "Lcom/google/mlkit/vision/common/InputImage;",
        "inputImage",
        "Ljt/n;",
        "Lgn/a;",
        "b",
        "(Lcom/google/mlkit/vision/common/InputImage;Lnt/b;)Ljava/lang/Object;",
        "",
        "close",
        "()V",
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


# virtual methods
.method public abstract b(Lcom/google/mlkit/vision/common/InputImage;Lnt/b;)Ljava/lang/Object;
    .param p1    # Lcom/google/mlkit/vision/common/InputImage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/mlkit/vision/common/InputImage;",
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
.end method

.method public abstract close()V
.end method
