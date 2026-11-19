.class public Log/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Log/k;->b(Llg/z;)Llg/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Llg/z;


# direct methods
.method public constructor <init>(Llg/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Log/k$a;->a:Llg/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Llg/f;Lsg/a;)Llg/a0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llg/f;",
            "Lsg/a<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    new-instance p2, Log/k;

    iget-object v0, p0, Log/k$a;->a:Llg/z;

    invoke-direct {p2, p1, v0, v1}, Log/k;-><init>(Llg/f;Llg/z;Log/k$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
