.class public final Lsw/q$b;
.super Lmv/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final d:Lmv/i0;

.field public final e:Lew/g;

.field public f:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lmv/i0;)V
    .locals 1

    invoke-direct {p0}, Lmv/i0;-><init>()V

    iput-object p1, p0, Lsw/q$b;->d:Lmv/i0;

    new-instance v0, Lsw/q$b$a;

    invoke-virtual {p1}, Lmv/i0;->l3()Lew/g;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lsw/q$b$a;-><init>(Lsw/q$b;Lew/l0;)V

    invoke-static {v0}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object p1

    iput-object p1, p0, Lsw/q$b;->e:Lew/g;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lsw/q$b;->d:Lmv/i0;

    invoke-virtual {v0}, Lmv/i0;->close()V

    return-void
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lsw/q$b;->d:Lmv/i0;

    invoke-virtual {v0}, Lmv/i0;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Lmv/b0;
    .locals 1

    iget-object v0, p0, Lsw/q$b;->d:Lmv/i0;

    invoke-virtual {v0}, Lmv/i0;->f()Lmv/b0;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lsw/q$b;->f:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public l3()Lew/g;
    .locals 1

    iget-object v0, p0, Lsw/q$b;->e:Lew/g;

    return-object v0
.end method
