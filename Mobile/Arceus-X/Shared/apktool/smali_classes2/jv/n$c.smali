.class public final Ljv/n$c;
.super Ljv/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
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


# direct methods
.method public constructor <init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;Ljv/e;)V
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
            "TResponseT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Ljv/n;-><init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;)V

    iput-object p4, p0, Ljv/n$c;->d:Ljv/e;

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

    iget-object v0, p0, Ljv/n$c;->d:Ljv/e;

    invoke-interface {v0, p1}, Ljv/e;->b(Ljv/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljv/d;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Lnt/b;

    :try_start_0
    invoke-static {p1, p2}, Ljv/p;->c(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1, p2}, Ljv/p;->e(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
