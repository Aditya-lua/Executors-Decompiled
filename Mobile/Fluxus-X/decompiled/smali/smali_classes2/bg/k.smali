.class public Lbg/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbg/o;


# instance fields
.field public final a:Lbg/p;

.field public final b:Ltb/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltb/k<",
            "Lbg/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbg/p;Ltb/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbg/p;",
            "Ltb/k<",
            "Lbg/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg/k;->a:Lbg/p;

    iput-object p2, p0, Lbg/k;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lbg/k;->b:Ltb/k;

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public b(Ldg/d;)Z
    .locals 4

    invoke-virtual {p1}, Ldg/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbg/k;->a:Lbg/p;

    invoke-virtual {v0, p1}, Lbg/p;->f(Ldg/d;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbg/k;->b:Ltb/k;

    invoke-static {}, Lbg/m;->a()Lbg/m$a;

    move-result-object v1

    invoke-virtual {p1}, Ldg/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbg/m$a;->b(Ljava/lang/String;)Lbg/m$a;

    move-result-object v1

    invoke-virtual {p1}, Ldg/d;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lbg/m$a;->d(J)Lbg/m$a;

    move-result-object v1

    invoke-virtual {p1}, Ldg/d;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lbg/m$a;->c(J)Lbg/m$a;

    move-result-object p1

    invoke-virtual {p1}, Lbg/m$a;->a()Lbg/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
