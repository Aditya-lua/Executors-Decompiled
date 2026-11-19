.class public interface abstract Lcom/roblox/platform/http/interfaces/AuthInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract updateUsername(Lml/a;)Lsw/d;
    .param p1    # Lml/a;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lml/a;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v1/username"
    .end annotation
.end method

.method public abstract verifiedSignUp(Lhl/b;)Lsw/d;
    .param p1    # Lhl/b;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl/b;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/verified-signup"
    .end annotation
.end method

.method public abstract verifiedSignUpChallenge(Lhl/a;)Lsw/d;
    .param p1    # Lhl/a;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl/a;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/verified-signup/challenge"
    .end annotation
.end method

.method public abstract verifiedSignUpVerify(Lhl/c;)Lsw/d;
    .param p1    # Lhl/c;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl/c;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/verified-signup/voucher"
    .end annotation
.end method
