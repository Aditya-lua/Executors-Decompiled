.class public final Ljv/n$a;
.super Ljv/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Ljv/n<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field public final d:Ljv/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljv/e<",
            "TResponseT;TReturnT;>;"
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
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Ljv/n;-><init>(Ljv/w;Lokhttp3/Call$Factory;Ljv/h;)V

    iput-object p4, p0, Ljv/n$a;->d:Ljv/e;

    return-void
.end method


# virtual methods
.method public c(Ljv/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    iget-object p2, p0, Ljv/n$a;->d:Ljv/e;

    invoke-interface {p2, p1}, Ljv/e;->b(Ljv/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
