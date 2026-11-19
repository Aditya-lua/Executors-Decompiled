.class public final Lje/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/p$d;,
        Lje/p$e;
    }
.end annotation


# instance fields
.field public final a:Lje/d;

.field public final b:Z

.field public final c:Lje/p$e;

.field public final d:I


# direct methods
.method public constructor <init>(Lje/p$e;)V
    .locals 3

    .line 1
    invoke-static {}, Lje/d;->e()Lje/d;

    move-result-object v0

    const v1, 0x7fffffff

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lje/p;-><init>(Lje/p$e;ZLje/d;I)V

    return-void
.end method

.method public constructor <init>(Lje/p$e;ZLje/d;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lje/p;->c:Lje/p$e;

    .line 4
    iput-boolean p2, p0, Lje/p;->b:Z

    .line 5
    iput-object p3, p0, Lje/p;->a:Lje/d;

    .line 6
    iput p4, p0, Lje/p;->d:I

    return-void
.end method

.method public static synthetic a(Lje/p;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1}, Lje/p;->i(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lje/p;)Lje/d;
    .locals 0

    iget-object p0, p0, Lje/p;->a:Lje/d;

    return-object p0
.end method

.method public static synthetic c(Lje/p;)Z
    .locals 0

    iget-boolean p0, p0, Lje/p;->b:Z

    return p0
.end method

.method public static synthetic d(Lje/p;)I
    .locals 0

    iget p0, p0, Lje/p;->d:I

    return p0
.end method

.method public static e(I)Lje/p;
    .locals 2

    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The length may not be less than 1"

    invoke-static {v0, v1}, Lje/n;->e(ZLjava/lang/Object;)V

    new-instance v0, Lje/p;

    new-instance v1, Lje/p$b;

    invoke-direct {v1, p0}, Lje/p$b;-><init>(I)V

    invoke-direct {v0, v1}, Lje/p;-><init>(Lje/p$e;)V

    return-object v0
.end method

.method public static f(C)Lje/p;
    .locals 0

    invoke-static {p0}, Lje/d;->c(C)Lje/d;

    move-result-object p0

    invoke-static {p0}, Lje/p;->g(Lje/d;)Lje/p;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lje/d;)Lje/p;
    .locals 2

    invoke-static {p0}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lje/p;

    new-instance v1, Lje/p$a;

    invoke-direct {v1, p0}, Lje/p$a;-><init>(Lje/d;)V

    invoke-direct {v0, v1}, Lje/p;-><init>(Lje/p$e;)V

    return-object v0
.end method


# virtual methods
.method public h(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lje/p$c;

    invoke-direct {v0, p0, p1}, Lje/p$c;-><init>(Lje/p;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final i(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lje/p;->c:Lje/p$e;

    invoke-interface {v0, p0, p1}, Lje/p$e;->a(Lje/p;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
