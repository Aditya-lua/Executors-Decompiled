.class public interface abstract Lcom/roblox/platform/http/interfaces/AccountInformationInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract updateGender(Lml/b;)Lsw/d;
    .param p1    # Lml/b;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lml/b;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v1/gender"
    .end annotation
.end method
