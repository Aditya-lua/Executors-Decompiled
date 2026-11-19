.class public interface abstract Lcom/roblox/platform/http/interfaces/TranslationsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getUpdatedStrings(Ljava/lang/String;)Lsw/d;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lvw/s;
            value = "locale"
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
        value = "v1/translations/{locale}?consumerType=AndroidApp"
    .end annotation
.end method
