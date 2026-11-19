.class public final Ltw/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/h<",
        "Lmv/i0;",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Llg/f;

.field public final b:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llg/f;Llg/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Llg/a0<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltw/c;->a:Llg/f;

    iput-object p2, p0, Ltw/c;->b:Llg/a0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmv/i0;

    invoke-virtual {p0, p1}, Ltw/c;->b(Lmv/i0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/i0;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/i0;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Ltw/c;->a:Llg/f;

    invoke-virtual {p1}, Lmv/i0;->c()Ljava/io/Reader;

    move-result-object v1

    invoke-virtual {v0, v1}, Llg/f;->p(Ljava/io/Reader;)Ltg/a;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Ltw/c;->b:Llg/a0;

    invoke-virtual {v1, v0}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v2, Ltg/b;->j:Ltg/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lmv/i0;->close()V

    return-object v1

    :cond_0
    :try_start_1
    new-instance v0, Llg/m;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Llg/m;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lmv/i0;->close()V

    throw v0
.end method
