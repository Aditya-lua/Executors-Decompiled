.class public final Llg/a0$b;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llg/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Llg/a0;


# direct methods
.method public constructor <init>(Llg/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llg/a0$b;->a:Llg/a0;

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Llg/a0;Llg/a0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Llg/a0$b;-><init>(Llg/a0;)V

    return-void
.end method


# virtual methods
.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Llg/a0$b;->a:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NullSafeTypeAdapter["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg/a0$b;->a:Llg/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
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

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    iget-object v0, p0, Llg/a0$b;->a:Llg/a0;

    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method
