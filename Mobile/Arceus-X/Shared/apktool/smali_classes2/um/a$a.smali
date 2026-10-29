.class public Lum/a$a;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum/a;->create(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lum/a$f;

.field public final synthetic b:Lum/h;

.field public final synthetic c:Lum/w;

.field public final synthetic d:Lum/a$f;

.field public final synthetic e:Ljava/util/Set;

.field public final synthetic f:Ljava/lang/reflect/Type;

.field public final synthetic g:Lum/a;


# direct methods
.method public constructor <init>(Lum/a;Lum/a$f;Lum/h;Lum/w;Lum/a$f;Ljava/util/Set;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Lum/a$a;->g:Lum/a;

    iput-object p2, p0, Lum/a$a;->a:Lum/a$f;

    iput-object p3, p0, Lum/a$a;->b:Lum/h;

    iput-object p4, p0, Lum/a$a;->c:Lum/w;

    iput-object p5, p0, Lum/a$a;->d:Lum/a$f;

    iput-object p6, p0, Lum/a$a;->e:Ljava/util/Set;

    iput-object p7, p0, Lum/a$a;->f:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Lum/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lum/a$a;->d:Lum/a$f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lum/a$a;->b:Lum/h;

    invoke-virtual {v0, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, v0, Lum/a$f;->g:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lum/m;->u()Lum/m$c;

    move-result-object v0

    sget-object v1, Lum/m$c;->i:Lum/m$c;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lum/m;->o()Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lum/a$a;->d:Lum/a$f;

    iget-object v1, p0, Lum/a$a;->c:Lum/w;

    invoke-virtual {v0, v1, p1}, Lum/a$f;->b(Lum/w;Lum/m;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_2
    new-instance v1, Lum/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " at "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lum/m;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lum/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toJson(Lum/t;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lum/a$a;->a:Lum/a$f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lum/a$a;->b:Lum/h;

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v1, v0, Lum/a$f;->g:Z

    if-nez v1, :cond_1

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lum/t;->o()Lum/t;

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lum/a$a;->c:Lum/w;

    invoke-virtual {v0, v1, p1, p2}, Lum/a$f;->e(Lum/w;Lum/t;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of v0, p2, Ljava/io/IOException;

    if-eqz v0, :cond_2

    check-cast p2, Ljava/io/IOException;

    throw p2

    :cond_2
    new-instance v0, Lum/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lum/t;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lum/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JsonAdapter"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lum/a$a;->e:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lum/a$a;->f:Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
