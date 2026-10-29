.class public final Lcom/withpersona/sdk2/inquiry/governmentid/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u0015\u0010\u000c\u001a\u00020\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;",
        "side",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "d",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;",
        "c",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;",
        "",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;",
        "idClassKey",
        "Lpo/b;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;",
        "idClass",
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    if-eqz v0, :cond_0

    sget-object p0, Lpo/b;->B:Lpo/b;

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->i()Lpo/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    if-eqz v0, :cond_0

    const-string p0, "auto-classification"

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final d(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "side"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;->a()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->f()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->g(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method
