.class public final Luo/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luo/c$a;


# instance fields
.field public final a:Luo/d;


# direct methods
.method public constructor <init>(Luo/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/e;->a:Luo/d;

    return-void
.end method

.method public static a(Luo/d;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luo/d;",
            ")",
            "Lwt/i<",
            "Luo/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Luo/e;

    invoke-direct {v0, p0}, Luo/e;-><init>(Luo/d;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Luo/c;
    .locals 1

    iget-object v0, p0, Luo/e;->a:Luo/d;

    invoke-virtual {v0, p1}, Luo/d;->b(Ljava/lang/String;)Luo/c;

    move-result-object p1

    return-object p1
.end method
