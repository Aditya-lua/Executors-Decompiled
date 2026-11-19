.class public Leo/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leo/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Leo/s;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Leo/s;

.field public final b:Leo/s;


# direct methods
.method public constructor <init>(Leo/s;Leo/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Leo/t$b;->a:Leo/s;

    .line 4
    iput-object p2, p0, Leo/t$b;->b:Leo/s;

    return-void
.end method

.method public synthetic constructor <init>(Leo/s;Leo/s;Leo/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Leo/t$b;-><init>(Leo/s;Leo/s;)V

    return-void
.end method


# virtual methods
.method public b()Leo/s;
    .locals 2

    iget-object v0, p0, Leo/t$b;->a:Leo/s;

    invoke-virtual {v0}, Leo/s;->f()Leo/s;

    move-result-object v1

    iput-object v1, p0, Leo/t$b;->a:Leo/s;

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    iget-object v0, p0, Leo/t$b;->a:Leo/s;

    if-eqz v0, :cond_0

    iget-object v1, p0, Leo/t$b;->b:Leo/s;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leo/t$b;->b()Leo/s;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
