.class public final Lcom/withpersona/sdk2/camera/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lnu/p0;",
        "Lcom/withpersona/sdk2/camera/d;",
        "Lnu/h;",
        "a",
        "(Lnu/p0;)Lnu/h;",
        "camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lnu/p0;)Lnu/h;
    .locals 2
    .param p0    # Lnu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/p0<",
            "+",
            "Lcom/withpersona/sdk2/camera/d;",
            ">;)",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/camera/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/camera/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/camera/a$a;-><init>(Lnt/b;)V

    invoke-static {p0, v0}, Lnu/j;->T(Lnu/h;Lzt/n;)Lnu/h;

    move-result-object p0

    return-object p0
.end method
