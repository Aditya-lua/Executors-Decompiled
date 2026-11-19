.class public interface abstract Lcom/roblox/platform/http/interfaces/LocaleInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getMultipleLocales(Ljava/lang/String;)Lsw/d;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lvw/i;
            value = "Accept-Language"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/f;
        value = "v1/locales/user-localization-locus-supported-locales"
    .end annotation
.end method
