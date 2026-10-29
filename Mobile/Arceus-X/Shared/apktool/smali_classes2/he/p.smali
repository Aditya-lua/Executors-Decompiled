.class public final Lhe/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhe/p$d;,
        Lhe/p$e;
    }
.end annotation


# instance fields
.field public final a:Lhe/d;

.field public final b:Z

.field public final c:Lhe/p$e;

.field public final d:I


# direct methods
.method public constructor <init>(Lhe/p$e;)V
    .locals 3

    .line 1
    invoke-static {}, Lhe/d;->e()Lhe/d;

    move-result-object v0

    const v1, 0x7fffffff

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lhe/p;-><init>(Lhe/p$e;ZLhe/d;I)V

    return-void
.end method

.method public constructor <init>(Lhe/p$e;ZLhe/d;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lhe/p;->c:Lhe/p$e;

    .line 4
    iput-boolean p2, p0, Lhe/p;->b:Z

    .line 5
    iput-object p3, p0, Lhe/p;->a:Lhe/d;

    .line 6
    iput p4, p0, Lhe/p;->d:I

    return-void
.end method

.method public static synthetic a(Lhe/p;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1}, Lhe/p;->i(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhe/p;)Lhe/d;
    .locals 0

    iget-object p0, p0, Lhe/p;->a:Lhe/d;

    return-object p0
.end method

.method public static synthetic c(Lhe/p;)Z
    .locals 0

    iget-boolean p0, p0, Lhe/p;->b:Z

    return p0
.end method

.method public static synthetic d(Lhe/p;)I
    .locals 0

    iget p0, p0, Lhe/p;->d:I

    return p0
.end method

.method public static e(I)Lhe/p;
    .locals 2

    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The length may not be less than 1"

    invoke-static {v0, v1}, Lhe/n;->e(ZLjava/lang/Object;)V

    new-instance v0, Lhe/p;

    new-instance v1, Lhe/p$b;

    invoke-direct {v1, p0}, Lhe/p$b;-><init>(I)V

    invoke-direct {v0, v1}, Lhe/p;-><init>(Lhe/p$e;)V

    return-object v0
.end method

.method public static f(C)Lhe/p;
    .locals 0

    invoke-static {p0}, Lhe/d;->c(C)Lhe/d;

    move-result-object p0

    invoke-static {p0}, Lhe/p;->g(Lhe/d;)Lhe/p;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lhe/d;)Lhe/p;
    .locals 2

    invoke-static {p0}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lhe/p;

    new-instance v1, Lhe/p$a;

    invoke-direct {v1, p0}, Lhe/p$a;-><init>(Lhe/d;)V

    invoke-direct {v0, v1}, Lhe/p;-><init>(Lhe/p$e;)V

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

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lhe/p$c;

    invoke-direct {v0, p0, p1}, Lhe/p$c;-><init>(Lhe/p;Ljava/lang/CharSequence;)V

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

    iget-object v0, p0, Lhe/p;->c:Lhe/p$e;

    invoke-interface {v0, p0, p1}, Lhe/p$e;->a(Lhe/p;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
