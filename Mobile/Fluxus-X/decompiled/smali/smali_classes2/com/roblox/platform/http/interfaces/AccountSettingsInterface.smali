.class public interface abstract Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getAccountSettingsGroups()Lsw/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/f;
        value = "/v1/account/settings/settings-groups"
    .end annotation
.end method

.method public abstract getUserSelectedTheme(J)Lsw/d;
    .param p1    # J
        .annotation runtime Lvw/s;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/f;
        value = "v1/themes/User/{userId}"
    .end annotation
.end method
