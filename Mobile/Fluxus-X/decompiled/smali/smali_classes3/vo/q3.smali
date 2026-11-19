.class public final Lvo/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsn/g;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;",
        "a",
        "(Lsn/g;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;",
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
.method public static final a(Lsn/g;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;
    .locals 2
    .param p0    # Lsn/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lsn/g$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;

    check-cast p0, Lsn/g$a;

    invoke-virtual {p0}, Lsn/g$a;->c()Ljava/lang/String;

    move-result-object p0

    const-string v1, "mrz"

    invoke-direct {v0, v1, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lsn/g$b;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;

    check-cast p0, Lsn/g$b;

    invoke-virtual {p0}, Lsn/g$b;->a()Ljava/lang/String;

    move-result-object p0

    const-string v1, "pdf417"

    invoke-direct {v0, v1, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0
.end method
