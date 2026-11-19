.class public interface abstract Lcom/roblox/platform/http/interfaces/ClientSettingsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getAndroidAppSettings(Ljava/lang/String;)Lsw/d;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lvw/t;
            value = "apiKey"
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
        value = "/Setting/Get/AndroidAppSettings/"
    .end annotation
.end method
