.class public Lzf/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzf/o;


# instance fields
.field public final a:Lzf/p;

.field public final b:Lsb/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsb/k<",
            "Lzf/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzf/p;Lsb/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzf/p;",
            "Lsb/k<",
            "Lzf/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/k;->a:Lzf/p;

    iput-object p2, p0, Lzf/k;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lzf/k;->b:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public b(Lbg/d;)Z
    .locals 4

    invoke-virtual {p1}, Lbg/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzf/k;->a:Lzf/p;

    invoke-virtual {v0, p1}, Lzf/p;->f(Lbg/d;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzf/k;->b:Lsb/k;

    invoke-static {}, Lzf/m;->a()Lzf/m$a;

    move-result-object v1

    invoke-virtual {p1}, Lbg/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lzf/m$a;->b(Ljava/lang/String;)Lzf/m$a;

    move-result-object v1

    invoke-virtual {p1}, Lbg/d;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lzf/m$a;->d(J)Lzf/m$a;

    move-result-object v1

    invoke-virtual {p1}, Lbg/d;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lzf/m$a;->c(J)Lzf/m$a;

    move-result-object p1

    invoke-virtual {p1}, Lzf/m$a;->a()Lzf/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
