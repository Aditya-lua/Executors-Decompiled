.class public final Lio/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lfn/e;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;",
        "a",
        "(Lfn/e;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;",
        "government-id_release"
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
.method public static final a(Lfn/e;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;
    .locals 2
    .param p0    # Lfn/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lfn/e$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;

    check-cast p0, Lfn/e$a;

    invoke-virtual {p0}, Lfn/e$a;->c()Ljava/lang/String;

    move-result-object p0

    const-string v1, "mrz"

    invoke-direct {v0, v1, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lfn/e$b;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;

    check-cast p0, Lfn/e$b;

    invoke-virtual {p0}, Lfn/e$b;->a()Ljava/lang/String;

    move-result-object p0

    const-string v1, "pdf417"

    invoke-direct {v0, v1, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method
