.class public abstract Lhn/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhn/h$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final failOnUnknown()Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhn/h$c;

    invoke-direct {v0, p0, p0}, Lhn/h$c;-><init>(Lhn/h;Lhn/h;)V

    return-object v0
.end method

.method public final fromJson(Lew/g;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lew/g;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhn/m;->u(Lew/g;)Lhn/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract fromJson(Lhn/m;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/m;",
            ")TT;"
        }
    .end annotation
.end method

.method public final fromJson(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 2
    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    invoke-virtual {v0, p1}, Lew/e;->I0(Ljava/lang/String;)Lew/e;

    move-result-object p1

    invoke-static {p1}, Lhn/m;->u(Lew/g;)Lhn/m;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lhn/h;->isLenient()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lhn/m;->w()Lhn/m$c;

    move-result-object p1

    sget-object v1, Lhn/m$c;->j:Lhn/m$c;

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lhn/j;

    const-string v0, "JSON document was not fully consumed."

    invoke-direct {p1, v0}, Lhn/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Lhn/q;

    invoke-direct {v0, p1}, Lhn/q;-><init>(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p0, v0}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public indent(Ljava/lang/String;)Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lhn/h$d;

    invoke-direct {v0, p0, p0, p1}, Lhn/h$d;-><init>(Lhn/h;Lhn/h;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "indent == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isLenient()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final lenient()Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhn/h$b;

    invoke-direct {v0, p0, p0}, Lhn/h$b;-><init>(Lhn/h;Lhn/h;)V

    return-object v0
.end method

.method public final nonNull()Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Ljn/a;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljn/a;

    invoke-direct {v0, p0}, Ljn/a;-><init>(Lhn/h;)V

    return-object v0
.end method

.method public final nullSafe()Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Ljn/b;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljn/b;

    invoke-direct {v0, p0}, Ljn/b;-><init>(Lhn/h;)V

    return-object v0
.end method

.method public final serializeNulls()Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhn/h$a;

    invoke-direct {v0, p0, p0}, Lhn/h$a;-><init>(Lhn/h;Lhn/h;)V

    return-object v0
.end method

.method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 3
    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    .line 4
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lhn/h;->toJson(Lew/f;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    invoke-virtual {v0}, Lew/e;->V2()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final toJson(Lew/f;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lew/f;",
            "TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhn/t;->r(Lew/f;)Lhn/t;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract toJson(Lhn/t;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/t;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lhn/s;

    invoke-direct {v0}, Lhn/s;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lhn/s;->d0()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
