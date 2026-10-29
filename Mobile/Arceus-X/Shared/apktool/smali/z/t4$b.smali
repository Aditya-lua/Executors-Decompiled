.class public Lz/t4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/t4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i4<",
        "Lg0/w2;",
        ">;"
    }
.end annotation


# instance fields
.field public final P:Ln0/n1;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    sget-object v1, Ln0/i4;->y:Ln0/n1$a;

    new-instance v2, Lz/s2;

    invoke-direct {v2}, Lz/s2;-><init>()V

    invoke-virtual {v0, v1, v2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    const/16 v2, 0x22

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lz/t4$b;->h0(Ln0/x2;)V

    iput-object v0, p0, Lz/t4$b;->P:Ln0/n1;

    return-void
.end method


# virtual methods
.method public X()Ln0/j4$b;
    .locals 1

    sget-object v0, Ln0/j4$b;->f:Ln0/j4$b;

    return-object v0
.end method

.method public final h0(Ln0/x2;)V
    .locals 2

    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    const-class v1, Lz/t4;

    invoke-virtual {p1, v0, v1}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    invoke-virtual {p1, v1, v0}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-void
.end method

.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Lz/t4$b;->P:Ln0/n1;

    return-object v0
.end method
