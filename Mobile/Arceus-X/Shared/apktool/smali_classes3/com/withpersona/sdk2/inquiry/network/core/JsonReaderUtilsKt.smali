.class public final Lcom/withpersona/sdk2/inquiry/network/core/JsonReaderUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final nextStringOrNull(Lum/m;)Ljava/lang/String;
    .locals 2
    .param p0    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lum/m;->u()Lum/m$c;

    move-result-object v0

    sget-object v1, Lum/m$c;->i:Lum/m$c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lum/m;->r()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lum/m;->o()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method
