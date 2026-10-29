.class public final Lokhttp3/TrailersSource$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/TrailersSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static peek(Lokhttp3/TrailersSource;)Lokhttp3/Headers;
    .locals 0
    .param p0    # Lokhttp3/TrailersSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0}, Lokhttp3/TrailersSource;->access$peek$jd(Lokhttp3/TrailersSource;)Lokhttp3/Headers;

    move-result-object p0

    return-object p0
.end method
