.class public Llg/f$f;
.super Log/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Log/m<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Log/m;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Llg/f$f;->a:Llg/a0;

    return-void
.end method

.method private b()Llg/a0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Llg/f$f;->a:Llg/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Llg/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    invoke-direct {p0}, Llg/f$f;->b()Llg/a0;

    move-result-object v0

    return-object v0
.end method

.method public c(Llg/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Llg/f$f;->a:Llg/a0;

    if-nez v0, :cond_0

    iput-object p1, p0, Llg/f$f;->a:Llg/a0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Delegate is already set"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    invoke-direct {p0}, Llg/f$f;->b()Llg/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Ltg/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Llg/f$f;->b()Llg/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method
