.class public Lng/w$a;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lng/w;->create(Llg/f;Lsg/a;)Llg/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public volatile a:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Llg/f;

.field public final synthetic e:Lsg/a;

.field public final synthetic f:Lng/w;


# direct methods
.method public constructor <init>(Lng/w;ZZLlg/f;Lsg/a;)V
    .locals 0

    iput-object p1, p0, Lng/w$a;->f:Lng/w;

    iput-boolean p2, p0, Lng/w$a;->b:Z

    iput-boolean p3, p0, Lng/w$a;->c:Z

    iput-object p4, p0, Lng/w$a;->d:Llg/f;

    iput-object p5, p0, Lng/w$a;->e:Lsg/a;

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Llg/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lng/w$a;->a:Llg/a0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lng/w$a;->d:Llg/f;

    iget-object v1, p0, Lng/w$a;->f:Lng/w;

    iget-object v2, p0, Lng/w$a;->e:Lsg/a;

    invoke-virtual {v0, v1, v2}, Llg/f;->n(Llg/b0;Lsg/a;)Llg/a0;

    move-result-object v0

    iput-object v0, p0, Lng/w$a;->a:Llg/a0;

    :cond_0
    return-object v0
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

    iget-boolean v0, p0, Lng/w$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ltg/a;->n0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lng/w$a;->a()Llg/a0;

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

    iget-boolean v0, p0, Lng/w$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    invoke-virtual {p0}, Lng/w$a;->a()Llg/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method
