.class public Ldl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/f;


# instance fields
.field public a:Lmv/o;

.field public b:I

.field public c:I

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ldl/c;-><init>(Lmv/o;)V

    return-void
.end method

.method public constructor <init>(Lmv/o;)V
    .locals 2

    const/16 v0, 0x1e

    .line 2
    invoke-static {}, Lcl/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v0, v1}, Ldl/c;-><init>(Lmv/o;IILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lmv/o;IILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ldl/c;->a:Lmv/o;

    .line 5
    iput p2, p0, Ldl/c;->b:I

    .line 6
    iput p3, p0, Ldl/c;->c:I

    .line 7
    iput-object p4, p0, Ldl/c;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lmv/d0;
    .locals 4

    new-instance v0, Ldw/a;

    new-instance v1, Ldl/c$a;

    invoke-direct {v1, p0}, Ldl/c$a;-><init>(Ldl/c;)V

    invoke-direct {v0, v1}, Ldw/a;-><init>(Ldw/a$c;)V

    sget-object v1, Ldw/a$b;->d:Ldw/a$b;

    invoke-virtual {v0, v1}, Ldw/a;->e(Ldw/a$b;)Ldw/a;

    new-instance v1, Lmv/d0$a;

    invoke-direct {v1}, Lmv/d0$a;-><init>()V

    invoke-virtual {v1, v0}, Lmv/d0$a;->a(Lmv/a0;)Lmv/d0$a;

    iget-object v0, p0, Ldl/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v2, Lfl/a;

    invoke-direct {v2, v0}, Lfl/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lmv/d0$a;->b(Lmv/a0;)Lmv/d0$a;

    :cond_0
    new-instance v0, Lfl/b;

    invoke-direct {v0}, Lfl/b;-><init>()V

    invoke-virtual {v1, v0}, Lmv/d0$a;->b(Lmv/a0;)Lmv/d0$a;

    iget v0, p0, Ldl/c;->b:I

    int-to-long v2, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v0}, Lmv/d0$a;->f(JLjava/util/concurrent/TimeUnit;)Lmv/d0$a;

    iget v2, p0, Ldl/c;->c:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3, v0}, Lmv/d0$a;->T(JLjava/util/concurrent/TimeUnit;)Lmv/d0$a;

    iget-object v0, p0, Ldl/c;->a:Lmv/o;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Ldl/j;->e()Ldl/j;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Lmv/d0$a;->h(Lmv/o;)Lmv/d0$a;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lmv/d0$a;->l(Z)Lmv/d0$a;

    invoke-virtual {v1}, Lmv/d0$a;->c()Lmv/d0;

    move-result-object v0

    return-object v0
.end method
