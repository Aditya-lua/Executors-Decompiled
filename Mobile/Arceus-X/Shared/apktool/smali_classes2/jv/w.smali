.class public final Ljv/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljv/w$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/reflect/Method;

.field public final c:Lokhttp3/HttpUrl;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lokhttp3/Headers;

.field public final g:Lokhttp3/MediaType;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:[Ljv/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljv/s<",
            "*>;"
        }
    .end annotation
.end field

.field public final l:Z


# direct methods
.method public constructor <init>(Ljv/w$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ljv/w$a;->b:Ljava/lang/Class;

    iput-object v0, p0, Ljv/w;->a:Ljava/lang/Class;

    iget-object v0, p1, Ljv/w$a;->c:Ljava/lang/reflect/Method;

    iput-object v0, p0, Ljv/w;->b:Ljava/lang/reflect/Method;

    iget-object v0, p1, Ljv/w$a;->a:Ljv/y;

    iget-object v0, v0, Ljv/y;->c:Lokhttp3/HttpUrl;

    iput-object v0, p0, Ljv/w;->c:Lokhttp3/HttpUrl;

    iget-object v0, p1, Ljv/w$a;->o:Ljava/lang/String;

    iput-object v0, p0, Ljv/w;->d:Ljava/lang/String;

    iget-object v0, p1, Ljv/w$a;->s:Ljava/lang/String;

    iput-object v0, p0, Ljv/w;->e:Ljava/lang/String;

    iget-object v0, p1, Ljv/w$a;->t:Lokhttp3/Headers;

    iput-object v0, p0, Ljv/w;->f:Lokhttp3/Headers;

    iget-object v0, p1, Ljv/w$a;->u:Lokhttp3/MediaType;

    iput-object v0, p0, Ljv/w;->g:Lokhttp3/MediaType;

    iget-boolean v0, p1, Ljv/w$a;->p:Z

    iput-boolean v0, p0, Ljv/w;->h:Z

    iget-boolean v0, p1, Ljv/w$a;->q:Z

    iput-boolean v0, p0, Ljv/w;->i:Z

    iget-boolean v0, p1, Ljv/w$a;->r:Z

    iput-boolean v0, p0, Ljv/w;->j:Z

    iget-object v0, p1, Ljv/w$a;->w:[Ljv/s;

    iput-object v0, p0, Ljv/w;->k:[Ljv/s;

    iget-boolean p1, p1, Ljv/w$a;->x:Z

    iput-boolean p1, p0, Ljv/w;->l:Z

    return-void
.end method

.method public static b(Ljv/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljv/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/y;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Ljv/w;"
        }
    .end annotation

    new-instance v0, Ljv/w$a;

    invoke-direct {v0, p0, p1, p2}, Ljv/w$a;-><init>(Ljv/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    invoke-virtual {v0}, Ljv/w$a;->b()Ljv/w;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;[Ljava/lang/Object;)Lokhttp3/Request;
    .locals 12

    iget-object v0, p0, Ljv/w;->k:[Ljv/s;

    array-length v1, p2

    array-length v2, v0

    if-ne v1, v2, :cond_2

    new-instance v3, Ljv/v;

    iget-object v4, p0, Ljv/w;->d:Ljava/lang/String;

    iget-object v5, p0, Ljv/w;->c:Lokhttp3/HttpUrl;

    iget-object v6, p0, Ljv/w;->e:Ljava/lang/String;

    iget-object v7, p0, Ljv/w;->f:Lokhttp3/Headers;

    iget-object v8, p0, Ljv/w;->g:Lokhttp3/MediaType;

    iget-boolean v9, p0, Ljv/w;->h:Z

    iget-boolean v10, p0, Ljv/w;->i:Z

    iget-boolean v11, p0, Ljv/w;->j:Z

    invoke-direct/range {v3 .. v11}, Ljv/v;-><init>(Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/MediaType;ZZZ)V

    iget-boolean v2, p0, Ljv/w;->l:Z

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, p2, v4

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-object v5, v0, v4

    aget-object v6, p2, v4

    invoke-virtual {v5, v3, v6}, Ljv/s;->a(Ljv/v;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljv/v;->k()Lokhttp3/Request$Builder;

    move-result-object p2

    new-instance v0, Ljv/o;

    iget-object v1, p0, Ljv/w;->a:Ljava/lang/Class;

    iget-object v3, p0, Ljv/w;->b:Ljava/lang/reflect/Method;

    invoke-direct {v0, v1, p1, v3, v2}, Ljv/o;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/List;)V

    const-class p1, Ljv/o;

    invoke-virtual {p2, p1, v0}, Lokhttp3/Request$Builder;->tag(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Argument count ("

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") doesn\'t match expected count ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
