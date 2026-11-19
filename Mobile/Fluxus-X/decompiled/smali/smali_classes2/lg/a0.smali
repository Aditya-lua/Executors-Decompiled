.class public abstract Llg/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/a0$b;
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
.method public final fromJson(Ljava/io/Reader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Reader;",
            ")TT;"
        }
    .end annotation

    .line 1
    new-instance v0, Ltg/a;

    invoke-direct {v0, p1}, Ltg/a;-><init>(Ljava/io/Reader;)V

    .line 2
    invoke-virtual {p0, v0}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final fromJson(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 3
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Llg/a0;->fromJson(Ljava/io/Reader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final fromJsonTree(Llg/l;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/l;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Log/g;

    invoke-direct {v0, p1}, Log/g;-><init>(Llg/l;)V

    invoke-virtual {p0, v0}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Llg/m;

    invoke-direct {v0, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final nullSafe()Llg/a0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Llg/a0$b;

    if-nez v0, :cond_0

    new-instance v0, Llg/a0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Llg/a0$b;-><init>(Llg/a0;Llg/a0$a;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public abstract read(Ltg/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation
.end method

.method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    :try_start_0
    invoke-static {v0}, Lng/h0;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Llg/a0;->toJson(Ljava/io/Writer;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance v0, Llg/m;

    invoke-direct {v0, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final toJson(Ljava/io/Writer;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Writer;",
            "TT;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ltg/c;

    invoke-direct {v0, p1}, Ltg/c;-><init>(Ljava/io/Writer;)V

    .line 2
    invoke-virtual {p0, v0, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method

.method public final toJsonTree(Ljava/lang/Object;)Llg/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Llg/l;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Log/h;

    invoke-direct {v0}, Log/h;-><init>()V

    invoke-virtual {p0, v0, p1}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    invoke-virtual {v0}, Log/h;->d0()Llg/l;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Llg/m;

    invoke-direct {v0, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract write(Ltg/c;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation
.end method
