.class public Lf1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lf1/x;",
            "Lh1/i;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Landroid/util/Size;",
            "Lf1/x;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lh1/i;

.field public final d:Lh1/i;


# direct methods
.method public constructor <init>(Ln0/z1;I)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lf1/o;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/TreeMap;

    new-instance v1, Lp0/e;

    invoke-direct {v1}, Lp0/e;-><init>()V

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lf1/o;->b:Ljava/util/TreeMap;

    invoke-static {}, Lf1/x;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "CapabilitiesByQuality"

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/x;

    invoke-virtual {p0, v1, p1, p2}, Lf1/o;->e(Lf1/x;Ln0/z1;I)Ln0/a2;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "profiles = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lf1/o;->h(Ln0/a2;)Lh1/i;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EncoderProfiles of quality "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has no video validated profiles."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lh1/i;->k()Ln0/a2$c;

    move-result-object v2

    iget-object v4, p0, Lf1/o;->b:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ln0/a2$c;->k()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v4, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lf1/o;->a:Ljava/util/Map;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lf1/o;->a:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "No supported EncoderProfiles"

    invoke-static {v2, p1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/o;->d:Lh1/i;

    iput-object p1, p0, Lf1/o;->c:Lh1/i;

    return-void

    :cond_3
    new-instance p1, Ljava/util/ArrayDeque;

    iget-object p2, p0, Lf1/o;->a:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/Deque;->peekFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh1/i;

    iput-object p2, p0, Lf1/o;->c:Lh1/i;

    invoke-interface {p1}, Ljava/util/Deque;->peekLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh1/i;

    iput-object p1, p0, Lf1/o;->d:Lh1/i;

    return-void
.end method

.method public static a(Lf1/x;)V
    .locals 3

    invoke-static {p0}, Lf1/x;->a(Lf1/x;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown quality: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lx2/g;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public static b(Ln0/z1;I)Z
    .locals 1

    new-instance v0, Lf1/o;

    invoke-direct {v0, p0, p1}, Lf1/o;-><init>(Ln0/z1;I)V

    invoke-virtual {v0}, Lf1/o;->g()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public c(Landroid/util/Size;)Lh1/i;
    .locals 3

    invoke-virtual {p0, p1}, Lf1/o;->d(Landroid/util/Size;)Lf1/x;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Using supported quality of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "CapabilitiesByQuality"

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lf1/x;->g:Lf1/x;

    if-eq v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lf1/o;->f(Lf1/x;)Lh1/i;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Camera advertised available quality but did not produce EncoderProfiles for advertised quality."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroid/util/Size;)Lf1/x;
    .locals 1

    iget-object v0, p0, Lf1/o;->b:Ljava/util/TreeMap;

    invoke-static {p1, v0}, Lw0/d;->a(Landroid/util/Size;Ljava/util/TreeMap;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/x;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lf1/x;->g:Lf1/x;

    return-object p1
.end method

.method public final e(Lf1/x;Ln0/z1;I)Ln0/a2;
    .locals 2

    instance-of v0, p1, Lf1/x$b;

    const-string v1, "Currently only support ConstantQuality"

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    check-cast p1, Lf1/x$b;

    invoke-virtual {p1, p3}, Lf1/x$b;->e(I)I

    move-result p1

    invoke-interface {p2, p1}, Ln0/z1;->b(I)Ln0/a2;

    move-result-object p1

    return-object p1
.end method

.method public f(Lf1/x;)Lh1/i;
    .locals 1

    invoke-static {p1}, Lf1/o;->a(Lf1/x;)V

    sget-object v0, Lf1/x;->f:Lf1/x;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lf1/o;->c:Lh1/i;

    return-object p1

    :cond_0
    sget-object v0, Lf1/x;->e:Lf1/x;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lf1/o;->d:Lh1/i;

    return-object p1

    :cond_1
    iget-object v0, p0, Lf1/o;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh1/i;

    return-object p1
.end method

.method public g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lf1/o;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final h(Ln0/a2;)Lh1/i;
    .locals 1

    invoke-interface {p1}, Ln0/a2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Lh1/i;->i(Ln0/a2;)Lh1/i;

    move-result-object p1

    return-object p1
.end method
