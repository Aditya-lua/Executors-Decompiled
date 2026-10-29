.class public interface abstract Ljv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# virtual methods
.method public abstract B(Ljv/f;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/f<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract cancel()V
.end method

.method public abstract clone()Ljv/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/d<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract execute()Ljv/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/x<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract isCanceled()Z
.end method

.method public abstract request()Lokhttp3/Request;
.end method
