.class public final Ljv/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final y:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljv/y;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Method;

.field public final d:[Ljava/lang/annotation/Annotation;

.field public final e:[[Ljava/lang/annotation/Annotation;

.field public final f:[Ljava/lang/reflect/Type;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Ljava/lang/String;

.field public t:Lokhttp3/Headers;

.field public u:Lokhttp3/MediaType;

.field public v:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public w:[Ljv/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljv/s<",
            "*>;"
        }
    .end annotation
.end field

.field public x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljv/w$a;->y:Ljava/util/regex/Pattern;

    const-string v0, "[a-zA-Z][a-zA-Z0-9_-]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ljv/w$a;->z:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljv/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/y;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljv/w$a;->a:Ljv/y;

    iput-object p2, p0, Ljv/w$a;->b:Ljava/lang/Class;

    iput-object p3, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-virtual {p3}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p1

    iput-object p1, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object p1

    iput-object p1, p0, Ljv/w$a;->f:[Ljava/lang/reflect/Type;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p1

    iput-object p1, p0, Ljv/w$a;->e:[[Ljava/lang/annotation/Annotation;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_0

    const-class p0, Ljava/lang/Boolean;

    return-object p0

    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_1

    const-class p0, Ljava/lang/Byte;

    return-object p0

    :cond_1
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_2

    const-class p0, Ljava/lang/Character;

    return-object p0

    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_3

    const-class p0, Ljava/lang/Double;

    return-object p0

    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_4

    const-class p0, Ljava/lang/Float;

    return-object p0

    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_5

    const-class p0, Ljava/lang/Integer;

    return-object p0

    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_6

    const-class p0, Ljava/lang/Long;

    return-object p0

    :cond_6
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v0, p0, :cond_7

    const-class p0, Ljava/lang/Short;

    :cond_7
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljv/w$a;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public b()Ljv/w;
    .locals 8

    iget-object v0, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {p0, v4}, Ljv/w$a;->e(Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljv/w$a;->o:Ljava/lang/String;

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Ljv/w$a;->p:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ljv/w$a;->r:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ljv/w$a;->q:Z

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_2
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Ljv/w$a;->e:[[Ljava/lang/annotation/Annotation;

    array-length v0, v0

    new-array v1, v0, [Ljv/s;

    iput-object v1, p0, Ljv/w$a;->w:[Ljv/s;

    add-int/lit8 v1, v0, -0x1

    move v3, v2

    :goto_2
    if-ge v3, v0, :cond_5

    iget-object v4, p0, Ljv/w$a;->w:[Ljv/s;

    iget-object v5, p0, Ljv/w$a;->f:[Ljava/lang/reflect/Type;

    aget-object v5, v5, v3

    iget-object v6, p0, Ljv/w$a;->e:[[Ljava/lang/annotation/Annotation;

    aget-object v6, v6, v3

    if-ne v3, v1, :cond_4

    const/4 v7, 0x1

    goto :goto_3

    :cond_4
    move v7, v2

    :goto_3
    invoke-virtual {p0, v3, v5, v6, v7}, Ljv/w$a;->f(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Z)Ljv/s;

    move-result-object v5

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Ljv/w$a;->s:Ljava/lang/String;

    if-nez v0, :cond_7

    iget-boolean v0, p0, Ljv/w$a;->n:Z

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    iget-object v1, p0, Ljv/w$a;->o:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Missing either @%s URL or @Url parameter."

    invoke-static {v0, v2, v1}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_7
    :goto_4
    iget-boolean v0, p0, Ljv/w$a;->q:Z

    if-nez v0, :cond_9

    iget-boolean v1, p0, Ljv/w$a;->r:Z

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ljv/w$a;->p:Z

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ljv/w$a;->i:Z

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "Non-body HTTP method cannot contain @Body."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_9
    :goto_5
    if-eqz v0, :cond_b

    iget-boolean v0, p0, Ljv/w$a;->g:Z

    if-eqz v0, :cond_a

    goto :goto_6

    :cond_a
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "Form-encoded method must contain at least one @Field."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_b
    :goto_6
    iget-boolean v0, p0, Ljv/w$a;->r:Z

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Ljv/w$a;->h:Z

    if-eqz v0, :cond_c

    goto :goto_7

    :cond_c
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "Multipart method must contain at least one @Part."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_d
    :goto_7
    new-instance v0, Ljv/w;

    invoke-direct {v0, p0}, Ljv/w;-><init>(Ljv/w$a;)V

    return-object v0

    :cond_e
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method public final c([Ljava/lang/String;Z)Lokhttp3/Headers;
    .locals 7

    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, p1, v3

    const/16 v5, 0x3a

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-eq v5, v6, :cond_2

    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Content-Type"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    :try_start_0
    invoke-static {v4}, Lokhttp3/MediaType;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v5

    iput-object v5, p0, Ljv/w$a;->u:Lokhttp3/MediaType;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Malformed content type: %s"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, p1, v0, v1}, Ljv/c0;->o(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {v0, v6, v4}, Lokhttp3/Headers$Builder;->addUnsafeNonAscii(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v6, v4}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p2, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Ljv/w$a;->o:Ljava/lang/String;

    if-nez v0, :cond_3

    iput-object p1, p0, Ljv/w$a;->o:Ljava/lang/String;

    iput-boolean p3, p0, Ljv/w$a;->p:Z

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/16 p1, 0x3f

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    const/4 p3, -0x1

    if-eq p1, p3, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    if-ge p1, p3, :cond_2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Ljv/w$a;->y:Ljava/util/regex/Pattern;

    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3, p1}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2
    :goto_0
    iput-object p2, p0, Ljv/w$a;->s:Ljava/lang/String;

    invoke-static {p2}, Ljv/w$a;->h(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ljv/w$a;->v:Ljava/util/Set;

    return-void

    :cond_3
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "Only one HTTP method is allowed. Found: %s and %s."

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3, p1}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public final e(Ljava/lang/annotation/Annotation;)V
    .locals 4

    instance-of v0, p1, Lmv/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lmv/b;

    invoke-interface {p1}, Lmv/b;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DELETE"

    invoke-virtual {p0, v0, p1, v1}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_0
    instance-of v0, p1, Lmv/f;

    if-eqz v0, :cond_1

    check-cast p1, Lmv/f;

    invoke-interface {p1}, Lmv/f;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GET"

    invoke-virtual {p0, v0, p1, v1}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_1
    instance-of v0, p1, Lmv/g;

    if-eqz v0, :cond_2

    check-cast p1, Lmv/g;

    invoke-interface {p1}, Lmv/g;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HEAD"

    invoke-virtual {p0, v0, p1, v1}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_2
    instance-of v0, p1, Lmv/n;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    check-cast p1, Lmv/n;

    invoke-interface {p1}, Lmv/n;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PATCH"

    invoke-virtual {p0, v0, p1, v2}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_3
    instance-of v0, p1, Lmv/o;

    if-eqz v0, :cond_4

    check-cast p1, Lmv/o;

    invoke-interface {p1}, Lmv/o;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "POST"

    invoke-virtual {p0, v0, p1, v2}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_4
    instance-of v0, p1, Lmv/p;

    if-eqz v0, :cond_5

    check-cast p1, Lmv/p;

    invoke-interface {p1}, Lmv/p;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PUT"

    invoke-virtual {p0, v0, p1, v2}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_5
    instance-of v0, p1, Lmv/m;

    if-eqz v0, :cond_6

    check-cast p1, Lmv/m;

    invoke-interface {p1}, Lmv/m;->value()Ljava/lang/String;

    move-result-object p1

    const-string v0, "OPTIONS"

    invoke-virtual {p0, v0, p1, v1}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_6
    instance-of v0, p1, Lmv/h;

    if-eqz v0, :cond_7

    check-cast p1, Lmv/h;

    invoke-interface {p1}, Lmv/h;->method()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lmv/h;->path()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lmv/h;->hasBody()Z

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Ljv/w$a;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_7
    instance-of v0, p1, Lmv/k;

    if-eqz v0, :cond_9

    check-cast p1, Lmv/k;

    invoke-interface {p1}, Lmv/k;->value()[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    if-eqz v2, :cond_8

    invoke-interface {p1}, Lmv/k;->allowUnsafeNonAsciiValues()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Ljv/w$a;->c([Ljava/lang/String;Z)Lokhttp3/Headers;

    move-result-object p1

    iput-object p1, p0, Ljv/w$a;->t:Lokhttp3/Headers;

    return-void

    :cond_8
    iget-object p1, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "@Headers annotation is empty."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_9
    instance-of v0, p1, Lmv/l;

    const-string v3, "Only one encoding annotation is allowed."

    if-eqz v0, :cond_b

    iget-boolean p1, p0, Ljv/w$a;->q:Z

    if-nez p1, :cond_a

    iput-boolean v2, p0, Ljv/w$a;->r:Z

    return-void

    :cond_a
    iget-object p1, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v3, v0}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_b
    instance-of p1, p1, Lmv/e;

    if-eqz p1, :cond_d

    iget-boolean p1, p0, Ljv/w$a;->r:Z

    if-nez p1, :cond_c

    iput-boolean v2, p0, Ljv/w$a;->q:Z

    return-void

    :cond_c
    iget-object p1, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v3, v0}, Ljv/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_d
    return-void
.end method

.method public final f(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Z)Ljv/s;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Z)",
            "Ljv/s<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    array-length v2, p3

    move v3, v0

    move-object v4, v1

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v5, p3, v3

    invoke-virtual {p0, p1, p2, p3, v5}, Ljv/w$a;->g(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Ljv/s;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    if-nez v4, :cond_1

    move-object v4, v5

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "Multiple Retrofit annotations found, only one allowed."

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2
    move-object v4, v1

    :cond_3
    if-nez v4, :cond_5

    if-eqz p4, :cond_4

    :try_start_0
    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Lnt/b;

    if-ne p2, p3, :cond_4

    const/4 p2, 0x1

    iput-boolean p2, p0, Ljv/w$a;->x:Z
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_4
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "No Retrofit annotation found."

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_5
    return-object v4
.end method

.method public final g(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Ljv/s;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Ljv/s<",
            "*>;"
        }
    .end annotation

    instance-of v0, p4, Lmv/y;

    const-string v1, "@Path parameters may not be used with @Url."

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean p3, p0, Ljv/w$a;->n:Z

    if-nez p3, :cond_7

    iget-boolean p3, p0, Ljv/w$a;->j:Z

    if-nez p3, :cond_6

    iget-boolean p3, p0, Ljv/w$a;->k:Z

    if-nez p3, :cond_5

    iget-boolean p3, p0, Ljv/w$a;->l:Z

    if-nez p3, :cond_4

    iget-boolean p3, p0, Ljv/w$a;->m:Z

    if-nez p3, :cond_3

    iget-object p3, p0, Ljv/w$a;->s:Ljava/lang/String;

    if-nez p3, :cond_2

    iput-boolean v3, p0, Ljv/w$a;->n:Z

    const-class p3, Lokhttp3/HttpUrl;

    if-eq p2, p3, :cond_1

    if-eq p2, v2, :cond_1

    const-class p3, Ljava/net/URI;

    if-eq p2, p3, :cond_1

    instance-of p3, p2, Ljava/lang/Class;

    if-eqz p3, :cond_0

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "android.net.Uri"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    new-instance p2, Ljv/s$p;

    iget-object p3, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p2, p3, p1}, Ljv/s$p;-><init>(Ljava/lang/reflect/Method;I)V

    return-object p2

    :cond_2
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    iget-object p3, p0, Ljv/w$a;->o:Ljava/lang/String;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "@Url cannot be used with @%s URL"

    invoke-static {p2, p1, p4, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "A @Url parameter must not come after a @QueryMap."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_4
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "A @Url parameter must not come after a @QueryName."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_5
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "A @Url parameter must not come after a @Query."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_6
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v1, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_7
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "Multiple @Url method annotations found."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_8
    instance-of v0, p4, Lmv/s;

    if-eqz v0, :cond_e

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Ljv/w$a;->k:Z

    if-nez v0, :cond_d

    iget-boolean v0, p0, Ljv/w$a;->l:Z

    if-nez v0, :cond_c

    iget-boolean v0, p0, Ljv/w$a;->m:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ljv/w$a;->n:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Ljv/w$a;->s:Ljava/lang/String;

    if-eqz v0, :cond_9

    iput-boolean v3, p0, Ljv/w$a;->j:Z

    check-cast p4, Lmv/s;

    invoke-interface {p4}, Lmv/s;->value()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1, v3}, Ljv/w$a;->i(ILjava/lang/String;)V

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {v0, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object v4

    new-instance v0, Ljv/s$k;

    iget-object v1, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-interface {p4}, Lmv/s;->encoded()Z

    move-result v5

    move v2, p1

    invoke-direct/range {v0 .. v5}, Ljv/s$k;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Ljv/h;Z)V

    return-object v0

    :cond_9
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    iget-object p3, p0, Ljv/w$a;->o:Ljava/lang/String;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "@Path can only be used with relative url on @%s"

    invoke-static {p2, p1, p4, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_a
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v1, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "A @Path parameter must not come after a @QueryMap."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_c
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "A @Path parameter must not come after a @QueryName."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_d
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "A @Path parameter must not come after a @Query."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_e
    instance-of v0, p4, Lmv/t;

    const-string v1, "<String>)"

    const-string v5, " must include generic type (e.g., "

    const-class v6, Ljava/lang/Iterable;

    if-eqz v0, :cond_12

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    check-cast p4, Lmv/t;

    invoke-interface {p4}, Lmv/t;->value()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4}, Lmv/t;->encoded()Z

    move-result p4

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    iput-boolean v3, p0, Ljv/w$a;->k:Z

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_10

    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_f

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$l;

    invoke-direct {p2, v0, p1, p4}, Ljv/s$l;-><init>(Ljava/lang/String;Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->c()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_f
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljv/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$l;

    invoke-direct {p2, v0, p1, p4}, Ljv/s$l;-><init>(Ljava/lang/String;Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->b()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_11
    iget-object p1, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p1, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$l;

    invoke-direct {p2, v0, p1, p4}, Ljv/s$l;-><init>(Ljava/lang/String;Ljv/h;Z)V

    return-object p2

    :cond_12
    instance-of v0, p4, Lmv/v;

    if-eqz v0, :cond_16

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    check-cast p4, Lmv/v;

    invoke-interface {p4}, Lmv/v;->encoded()Z

    move-result p4

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-boolean v3, p0, Ljv/w$a;->l:Z

    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_14

    instance-of v2, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_13

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$n;

    invoke-direct {p2, p1, p4}, Ljv/s$n;-><init>(Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->c()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_13
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljv/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$n;

    invoke-direct {p2, p1, p4}, Ljv/s$n;-><init>(Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->b()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_15
    iget-object p1, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p1, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$n;

    invoke-direct {p2, p1, p4}, Ljv/s$n;-><init>(Ljv/h;Z)V

    return-object p2

    :cond_16
    instance-of v0, p4, Lmv/u;

    const-string v7, "Map must include generic types (e.g., Map<String, String>)"

    const-class v8, Ljava/util/Map;

    if-eqz v0, :cond_1a

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-boolean v3, p0, Ljv/w$a;->m:Z

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {p2, v0, v8}, Ljv/c0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_18

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_17

    invoke-static {v3, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {v0, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    new-instance p3, Ljv/s$m;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    check-cast p4, Lmv/u;

    invoke-interface {p4}, Lmv/u;->encoded()Z

    move-result p4

    invoke-direct {p3, v0, p1, p2, p4}, Ljv/s$m;-><init>(Ljava/lang/reflect/Method;ILjv/h;Z)V

    return-object p3

    :cond_17
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "@QueryMap keys must be of type String: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_18
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v7, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_19
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@QueryMap parameter type must be Map."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_1a
    instance-of v0, p4, Lmv/i;

    if-eqz v0, :cond_1e

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    check-cast p4, Lmv/i;

    invoke-interface {p4}, Lmv/i;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1c

    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_1b

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$f;

    invoke-interface {p4}, Lmv/i;->allowUnsafeNonAsciiValues()Z

    move-result p3

    invoke-direct {p2, v0, p1, p3}, Ljv/s$f;-><init>(Ljava/lang/String;Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->c()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_1b
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_1d

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljv/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$f;

    invoke-interface {p4}, Lmv/i;->allowUnsafeNonAsciiValues()Z

    move-result p3

    invoke-direct {p2, v0, p1, p3}, Ljv/s$f;-><init>(Ljava/lang/String;Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->b()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_1d
    iget-object p1, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p1, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$f;

    invoke-interface {p4}, Lmv/i;->allowUnsafeNonAsciiValues()Z

    move-result p3

    invoke-direct {p2, v0, p1, p3}, Ljv/s$f;-><init>(Ljava/lang/String;Ljv/h;Z)V

    return-object p2

    :cond_1e
    instance-of v0, p4, Lmv/j;

    if-eqz v0, :cond_23

    const-class v0, Lokhttp3/Headers;

    if-ne p2, v0, :cond_1f

    new-instance p2, Ljv/s$h;

    iget-object p3, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p2, p3, p1}, Ljv/s$h;-><init>(Ljava/lang/reflect/Method;I)V

    return-object p2

    :cond_1f
    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-static {p2, v0, v8}, Ljv/c0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_21

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_20

    invoke-static {v3, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {v0, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    new-instance p3, Ljv/s$g;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    check-cast p4, Lmv/j;

    invoke-interface {p4}, Lmv/j;->allowUnsafeNonAsciiValues()Z

    move-result p4

    invoke-direct {p3, v0, p1, p2, p4}, Ljv/s$g;-><init>(Ljava/lang/reflect/Method;ILjv/h;Z)V

    return-object p3

    :cond_20
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "@HeaderMap keys must be of type String: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_21
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v7, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_22
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@HeaderMap parameter type must be Map or Headers."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_23
    instance-of v0, p4, Lmv/c;

    if-eqz v0, :cond_28

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Ljv/w$a;->q:Z

    if-eqz v0, :cond_27

    check-cast p4, Lmv/c;

    invoke-interface {p4}, Lmv/c;->value()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4}, Lmv/c;->encoded()Z

    move-result p4

    iput-boolean v3, p0, Ljv/w$a;->g:Z

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_25

    instance-of v3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_24

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$d;

    invoke-direct {p2, v0, p1, p4}, Ljv/s$d;-><init>(Ljava/lang/String;Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->c()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_24
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_25
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_26

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljv/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p2, p1, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$d;

    invoke-direct {p2, v0, p1, p4}, Ljv/s$d;-><init>(Ljava/lang/String;Ljv/h;Z)V

    invoke-virtual {p2}, Ljv/s;->b()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_26
    iget-object p1, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {p1, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p1

    new-instance p2, Ljv/s$d;

    invoke-direct {p2, v0, p1, p4}, Ljv/s$d;-><init>(Ljava/lang/String;Ljv/h;Z)V

    return-object p2

    :cond_27
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@Field parameters can only be used with form encoding."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_28
    instance-of v0, p4, Lmv/d;

    if-eqz v0, :cond_2d

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Ljv/w$a;->q:Z

    if-eqz v0, :cond_2c

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-static {p2, v0, v8}, Ljv/c0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2a

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_29

    invoke-static {v3, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    invoke-virtual {v0, p2, p3}, Ljv/y;->j(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    iput-boolean v3, p0, Ljv/w$a;->g:Z

    new-instance p3, Ljv/s$e;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    check-cast p4, Lmv/d;

    invoke-interface {p4}, Lmv/d;->encoded()Z

    move-result p4

    invoke-direct {p3, v0, p1, p2, p4}, Ljv/s$e;-><init>(Ljava/lang/reflect/Method;ILjv/h;Z)V

    return-object p3

    :cond_29
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "@FieldMap keys must be of type String: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2a
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v7, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2b
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@FieldMap parameter type must be Map."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2c
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@FieldMap parameters can only be used with form encoding."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2d
    instance-of v0, p4, Lmv/q;

    const-class v9, Lokhttp3/MultipartBody$Part;

    if-eqz v0, :cond_3c

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Ljv/w$a;->r:Z

    if-eqz v0, :cond_3b

    check-cast p4, Lmv/q;

    iput-boolean v3, p0, Ljv/w$a;->h:Z

    invoke-interface {p4}, Lmv/q;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_34

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p3

    const-string p4, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    if-eqz p3, :cond_30

    instance-of p3, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz p3, :cond_2f

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_2e

    sget-object p1, Ljv/s$o;->a:Ljv/s$o;

    invoke-virtual {p1}, Ljv/s;->c()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_2e
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p4, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2f
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_30
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result p2

    if-eqz p2, :cond_32

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_31

    sget-object p1, Ljv/s$o;->a:Ljv/s$o;

    invoke-virtual {p1}, Ljv/s;->b()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_31
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p4, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_32
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_33

    sget-object p1, Ljv/s$o;->a:Ljv/s$o;

    return-object p1

    :cond_33
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p4, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_34
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "form-data; name=\""

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Content-Transfer-Encoding"

    invoke-interface {p4}, Lmv/q;->encoding()Ljava/lang/String;

    move-result-object p4

    const-string v7, "Content-Disposition"

    filled-new-array {v7, v0, v3, p4}, [Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lokhttp3/Headers;->of([Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object p4

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const-string v3, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    if-eqz v0, :cond_37

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_36

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_35

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    iget-object v1, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Ljv/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    new-instance p3, Ljv/s$i;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, v0, p1, p4, p2}, Ljv/s$i;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Ljv/h;)V

    invoke-virtual {p3}, Ljv/s;->c()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_35
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v3, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_36
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_37
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Ljv/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v9, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_38

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    iget-object v1, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Ljv/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    new-instance p3, Ljv/s$i;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, v0, p1, p4, p2}, Ljv/s$i;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Ljv/h;)V

    invoke-virtual {p3}, Ljv/s;->b()Ljv/s;

    move-result-object p1

    return-object p1

    :cond_38
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v3, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_39
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_3a

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    iget-object v1, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Ljv/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    new-instance p3, Ljv/s$i;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, v0, p1, p4, p2}, Ljv/s$i;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Ljv/h;)V

    return-object p3

    :cond_3a
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v3, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3b
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@Part parameters can only be used with multipart encoding."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3c
    instance-of v0, p4, Lmv/r;

    if-eqz v0, :cond_42

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean v0, p0, Ljv/w$a;->r:Z

    if-eqz v0, :cond_41

    iput-boolean v3, p0, Ljv/w$a;->h:Z

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_40

    invoke-static {p2, v0, v8}, Ljv/c0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_3f

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v4, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-ne v2, v0, :cond_3e

    invoke-static {v3, p2}, Ljv/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_3d

    iget-object v0, p0, Ljv/w$a;->a:Ljv/y;

    iget-object v1, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p2, p3, v1}, Ljv/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2

    check-cast p4, Lmv/r;

    new-instance p3, Ljv/s$j;

    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-interface {p4}, Lmv/r;->encoding()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, v0, p1, p2, p4}, Ljv/s$j;-><init>(Ljava/lang/reflect/Method;ILjv/h;Ljava/lang/String;)V

    return-object p3

    :cond_3d
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3e
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "@PartMap keys must be of type String: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3f
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, v7, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_40
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@PartMap parameter type must be Map."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_41
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@PartMap parameters can only be used with multipart encoding."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_42
    instance-of v0, p4, Lmv/a;

    if-eqz v0, :cond_45

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    iget-boolean p4, p0, Ljv/w$a;->q:Z

    if-nez p4, :cond_44

    iget-boolean p4, p0, Ljv/w$a;->r:Z

    if-nez p4, :cond_44

    iget-boolean p4, p0, Ljv/w$a;->i:Z

    if-nez p4, :cond_43

    :try_start_0
    iget-object p4, p0, Ljv/w$a;->a:Ljv/y;

    iget-object v0, p0, Ljv/w$a;->d:[Ljava/lang/annotation/Annotation;

    invoke-virtual {p4, p2, p3, v0}, Ljv/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ljv/h;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iput-boolean v3, p0, Ljv/w$a;->i:Z

    new-instance p3, Ljv/s$c;

    iget-object p4, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-direct {p3, p4, p1, p2}, Ljv/s$c;-><init>(Ljava/lang/reflect/Method;ILjv/h;)V

    return-object p3

    :catch_0
    move-exception v0

    move-object p3, v0

    iget-object p4, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v0, "Unable to create @Body converter for %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p4, p3, p1, v0, p2}, Ljv/c0;->q(Ljava/lang/reflect/Method;Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_43
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "Multiple @Body method annotations found."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_44
    iget-object p2, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string p3, "@Body parameters cannot be used with form or multi-part encoding."

    new-array p4, v4, [Ljava/lang/Object;

    invoke-static {p2, p1, p3, p4}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_45
    instance-of p3, p4, Lmv/x;

    if-eqz p3, :cond_49

    invoke-virtual {p0, p1, p2}, Ljv/w$a;->j(ILjava/lang/reflect/Type;)V

    invoke-static {p2}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Ljv/w$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    add-int/lit8 p3, p1, -0x1

    :goto_1
    if-ltz p3, :cond_48

    iget-object p4, p0, Ljv/w$a;->w:[Ljv/s;

    aget-object p4, p4, p3

    instance-of v0, p4, Ljv/s$q;

    if-eqz v0, :cond_47

    check-cast p4, Ljv/s$q;

    iget-object p4, p4, Ljv/s$q;->a:Ljava/lang/Class;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_46

    goto :goto_2

    :cond_46
    iget-object p4, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@Tag type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is duplicate of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljv/t;->b:Ljv/u;

    iget-object v1, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    invoke-virtual {p2, v1, p3}, Ljv/u;->a(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " and would always overwrite its value."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p4, p1, p2, p3}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_47
    :goto_2
    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_48
    new-instance p1, Ljv/s$q;

    invoke-direct {p1, p2}, Ljv/s$q;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_49
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(ILjava/lang/String;)V
    .locals 2

    sget-object v0, Ljv/w$a;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljv/w$a;->v:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    iget-object v1, p0, Ljv/w$a;->s:Ljava/lang/String;

    filled-new-array {v1, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "URL \"%s\" does not contain \"{%s}\"."

    invoke-static {v0, p1, v1, p2}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_1
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    sget-object v1, Ljv/w$a;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "@Path parameter name must match %s. Found: %s"

    invoke-static {v0, p1, v1, p2}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public final j(ILjava/lang/reflect/Type;)V
    .locals 2

    invoke-static {p2}, Ljv/c0;->j(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    const-string v1, "Parameter type must not include a type variable or wildcard: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, p1, v1, p2}, Ljv/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
