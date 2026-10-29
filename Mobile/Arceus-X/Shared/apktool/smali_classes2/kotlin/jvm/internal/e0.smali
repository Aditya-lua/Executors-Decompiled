.class public Lkotlin/jvm/internal/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkotlin/jvm/internal/j;)Lhu/g;
    .locals 0

    return-object p1
.end method

.method public b(Ljava/lang/Class;)Lhu/c;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/f;

    invoke-direct {v0, p1}, Lkotlin/jvm/internal/f;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)Lhu/f;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/q;

    invoke-direct {v0, p1, p2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lkotlin/jvm/internal/n;)Lhu/h;
    .locals 0

    return-object p1
.end method

.method public e(Lkotlin/jvm/internal/r;)Lhu/i;
    .locals 0

    return-object p1
.end method

.method public f(Lkotlin/jvm/internal/t;)Lhu/j;
    .locals 0

    return-object p1
.end method

.method public g(Lkotlin/jvm/internal/v;)Lhu/k;
    .locals 0

    return-object p1
.end method

.method public h(Lkotlin/jvm/internal/i;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public i(Lkotlin/jvm/internal/m;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/e0;->h(Lkotlin/jvm/internal/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j(Lhu/e;Ljava/util/List;Z)Lhu/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu/e;",
            "Ljava/util/List<",
            "Lkotlin/reflect/KTypeProjection;",
            ">;Z)",
            "Lhu/m;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/j0;

    invoke-direct {v0, p1, p2, p3}, Lkotlin/jvm/internal/j0;-><init>(Lhu/e;Ljava/util/List;Z)V

    return-object v0
.end method
