.class public final Ljv/n$b;
.super Ljv/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        ">",
        "Ljv/n<",
        "TResponseT;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Ljv/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljv/e<",
            "TResponseT;",
            "Ljv/d<",
            "TResponseT;>;>;"
        }
    .end annotation
.end field

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;Ljv/e;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/w;",
            "Lokhttp3/Call$Factory;",
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;",
            "Ljv/e<",
            "TResponseT;",
            "Ljv/d<",
            "TResponseT;>;>;ZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Ljv/n;-><init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;)V

    iput-object p4, p0, Ljv/n$b;->d:Ljv/e;

    iput-boolean p5, p0, Ljv/n$b;->e:Z

    iput-boolean p6, p0, Ljv/n$b;->f:Z

    return-void
.end method


# virtual methods
.method public c(Ljv/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljv/n$b;->d:Ljv/e;

    invoke-interface {v0, p1}, Ljv/e;->b(Ljv/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljv/d;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Lnt/b;

    :try_start_0
    iget-boolean v0, p0, Ljv/n$b;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljv/p;->d(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Ljv/n$b;->e:Z

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Ljv/p;->b(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, p2}, Ljv/p;->a(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/VirtualMachineError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :goto_0
    invoke-static {p1, p2}, Ljv/p;->e(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_1
    throw p1
.end method
