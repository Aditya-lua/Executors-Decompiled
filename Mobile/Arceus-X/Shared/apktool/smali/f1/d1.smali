.class public Lf1/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/h1;


# instance fields
.field public final b:Ln0/z1;

.field public final c:Z

.field public final d:I

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/k0;",
            "Lf1/o;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/k0;",
            "Lf1/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILn0/o0;ILm1/r1$a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lf1/d1;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lf1/d1;->f:Ljava/util/Map;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not a supported video capabilities source: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    const/4 v1, 0x2

    if-ne p3, v1, :cond_2

    move v0, v1

    :cond_2
    iput v0, p0, Lf1/d1;->d:I

    invoke-static {p1, p2, p4, v0}, Lf1/d1;->h(ILn0/o0;Lm1/r1$a;I)Ln0/z1;

    move-result-object p1

    iput-object p1, p0, Lf1/d1;->b:Ln0/z1;

    invoke-interface {p2}, Ln0/o0;->c()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg0/k0;

    new-instance p4, Lh1/e;

    iget-object v0, p0, Lf1/d1;->b:Ln0/z1;

    invoke-direct {p4, v0, p3}, Lh1/e;-><init>(Ln0/z1;Lg0/k0;)V

    new-instance v0, Lf1/o;

    iget v1, p0, Lf1/d1;->d:I

    invoke-direct {v0, p4, v1}, Lf1/o;-><init>(Ln0/z1;I)V

    invoke-virtual {v0}, Lf1/o;->g()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_3

    iget-object p4, p0, Lf1/d1;->e:Ljava/util/Map;

    invoke-interface {p4, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    invoke-interface {p2}, Ln0/o0;->o()Z

    move-result p1

    iput-boolean p1, p0, Lf1/d1;->c:Z

    return-void
.end method

.method public static h(ILn0/o0;Lm1/r1$a;I)Ln0/z1;
    .locals 7

    invoke-interface {p1}, Ln0/o0;->x()Ln0/z1;

    move-result-object v0

    const/4 v1, 0x2

    if-ne p3, v1, :cond_1

    invoke-interface {p1}, Ln0/o0;->s()Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Ln0/z1;->a:Ln0/z1;

    return-object p0

    :cond_0
    return-object v0

    :cond_1
    invoke-static {v0, p3}, Lf1/o;->b(Ln0/z1;I)Z

    move-result p3

    if-nez p3, :cond_2

    const-string p3, "RecorderVideoCapabilities"

    const-string v0, "Camera EncoderProfilesProvider doesn\'t contain any supported Quality."

    invoke-static {p3, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p3, Lf1/x;->c:Lf1/x;

    sget-object v0, Lf1/x;->b:Lf1/x;

    sget-object v1, Lf1/x;->a:Lf1/x;

    filled-new-array {p3, v0, v1}, [Lf1/x;

    move-result-object p3

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    new-instance v0, Lo1/c;

    invoke-direct {v0, p1, p3, p2}, Lo1/c;-><init>(Ln0/o0;Ljava/util/List;Lm1/r1$a;)V

    :cond_2
    invoke-static {}, Lk1/c;->c()Ln0/k3;

    move-result-object p3

    new-instance v2, Lo1/d;

    invoke-direct {v2, v0, p3, p1, p2}, Lo1/d;-><init>(Ln0/z1;Ln0/k3;Ln0/o0;Lm1/r1$a;)V

    const/4 v0, 0x1

    if-ne p0, v0, :cond_3

    new-instance v1, Lh1/h;

    invoke-static {}, Lf1/x;->b()Ljava/util/List;

    move-result-object v3

    sget-object p0, Lg0/k0;->d:Lg0/k0;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const/16 p0, 0x22

    invoke-interface {p1, p0}, Ln0/o0;->m(I)Ljava/util/List;

    move-result-object v5

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lh1/h;-><init>(Ln0/z1;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lm1/r1$a;)V

    move-object v2, v1

    goto :goto_0

    :cond_3
    move-object v6, p2

    :goto_0
    new-instance p0, Lo1/e;

    invoke-direct {p0, v2, p3}, Lo1/e;-><init>(Ln0/z1;Ln0/k3;)V

    invoke-static {p1}, Lf1/d1;->i(Ln0/o0;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, Lh1/b;

    invoke-direct {p2, p0, v6}, Lh1/b;-><init>(Ln0/z1;Lm1/r1$a;)V

    move-object p0, p2

    :cond_4
    new-instance p2, Lo1/f;

    invoke-direct {p2, p0, p1, p3}, Lo1/f;-><init>(Ln0/z1;Ln0/o0;Ln0/k3;)V

    return-object p2
.end method

.method public static i(Ln0/o0;)Z
    .locals 3

    invoke-interface {p0}, Ln0/o0;->c()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/k0;

    invoke-virtual {v0}, Lg0/k0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0}, Lg0/k0;->a()I

    move-result v0

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Landroid/util/Size;Lg0/k0;)Lf1/x;
    .locals 0

    invoke-virtual {p0, p2}, Lf1/d1;->g(Lg0/k0;)Lf1/o;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p1, Lf1/x;->g:Lf1/x;

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Lf1/o;->d(Landroid/util/Size;)Lf1/x;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/util/Size;Lg0/k0;)Lh1/i;
    .locals 0

    invoke-virtual {p0, p2}, Lf1/d1;->g(Lg0/k0;)Lf1/o;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Lf1/o;->c(Landroid/util/Size;)Lh1/i;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf1/d1;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d(Lf1/x;Lg0/k0;)Lh1/i;
    .locals 0

    invoke-virtual {p0, p2}, Lf1/d1;->g(Lg0/k0;)Lf1/o;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Lf1/o;->f(Lf1/x;)Lh1/i;

    move-result-object p1

    return-object p1
.end method

.method public e(Lg0/k0;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            ")",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lf1/d1;->g(Lg0/k0;)Lf1/o;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lf1/o;->g()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lg0/k0;)Lf1/o;
    .locals 2

    invoke-virtual {p0}, Lf1/d1;->c()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, Ln0/y1;->c(Lg0/k0;Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lh1/e;

    iget-object v1, p0, Lf1/d1;->b:Ln0/z1;

    invoke-direct {v0, v1, p1}, Lh1/e;-><init>(Ln0/z1;Lg0/k0;)V

    new-instance p1, Lf1/o;

    iget v1, p0, Lf1/d1;->d:I

    invoke-direct {p1, v0, v1}, Lf1/o;-><init>(Ln0/z1;I)V

    return-object p1
.end method

.method public final g(Lg0/k0;)Lf1/o;
    .locals 2

    invoke-virtual {p1}, Lg0/k0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/d1;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/o;

    return-object p1

    :cond_0
    iget-object v0, p0, Lf1/d1;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf1/d1;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/o;

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lf1/d1;->f(Lg0/k0;)Lf1/o;

    move-result-object v0

    iget-object v1, p0, Lf1/d1;->f:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
