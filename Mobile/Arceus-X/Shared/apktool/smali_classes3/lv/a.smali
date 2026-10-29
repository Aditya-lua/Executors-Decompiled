.class public final Llv/a;
.super Ljv/h$a;
.source "SourceFile"


# instance fields
.field public final a:Lum/w;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Lum/w;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljv/h$a;-><init>()V

    iput-object p1, p0, Llv/a;->a:Lum/w;

    iput-boolean p2, p0, Llv/a;->b:Z

    iput-boolean p3, p0, Llv/a;->c:Z

    iput-boolean p4, p0, Llv/a;->d:Z

    iput-boolean p5, p0, Llv/a;->e:Z

    return-void
.end method

.method public static f(Lum/w;)Llv/a;
    .locals 6

    if-eqz p0, :cond_0

    new-instance v0, Llv/a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Llv/a;-><init>(Lum/w;ZZZZ)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "moshi == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g([Ljava/lang/annotation/Annotation;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lum/l;

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    :cond_0
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljv/y;",
            ")",
            "Ljv/h<",
            "*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    iget-object p3, p0, Llv/a;->a:Lum/w;

    invoke-static {p2}, Llv/a;->g([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lum/w;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/h;

    move-result-object p1

    iget-boolean p2, p0, Llv/a;->b:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lum/h;->lenient()Lum/h;

    move-result-object p1

    :cond_0
    iget-boolean p2, p0, Llv/a;->c:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lum/h;->failOnUnknown()Lum/h;

    move-result-object p1

    :cond_1
    iget-boolean p2, p0, Llv/a;->d:Z

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lum/h;->serializeNulls()Lum/h;

    move-result-object p1

    :cond_2
    new-instance p2, Llv/b;

    iget-boolean p3, p0, Llv/a;->e:Z

    invoke-direct {p2, p1, p3}, Llv/b;-><init>(Lum/h;Z)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljv/y;",
            ")",
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    iget-object p3, p0, Llv/a;->a:Lum/w;

    invoke-static {p2}, Llv/a;->g([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lum/w;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)Lum/h;

    move-result-object p1

    iget-boolean p2, p0, Llv/a;->b:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lum/h;->lenient()Lum/h;

    move-result-object p1

    :cond_0
    iget-boolean p2, p0, Llv/a;->c:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lum/h;->failOnUnknown()Lum/h;

    move-result-object p1

    :cond_1
    iget-boolean p2, p0, Llv/a;->d:Z

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lum/h;->serializeNulls()Lum/h;

    move-result-object p1

    :cond_2
    new-instance p2, Llv/c;

    invoke-direct {p2, p1}, Llv/c;-><init>(Lum/h;)V

    return-object p2
.end method
