.class public Ljj/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljj/u$b;,
        Ljj/u$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljj/j;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ljj/u;->b:Ljava/util/HashMap;

    .line 5
    invoke-virtual {p0}, Ljj/u;->g()V

    return-void
.end method

.method public synthetic constructor <init>(Ljj/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljj/u;-><init>()V

    return-void
.end method

.method public static c()Ljj/u;
    .locals 1

    invoke-static {}, Ljj/u$b;->a()Ljj/u;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ljj/u;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p0}, Ljj/u;->g()V

    return-void
.end method

.method public b(Ljava/lang/String;)Ljj/j;
    .locals 1

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljj/j;

    return-object p1
.end method

.method public d(Ljava/lang/String;)Ljj/j;
    .locals 2

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    new-instance v1, Ljj/u$a;

    invoke-direct {v1, p0, p1}, Ljj/u$a;-><init>(Ljj/u;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljj/j;

    return-object p1
.end method

.method public e(Ljava/lang/String;J)Ljj/j;
    .locals 2

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    new-instance v1, Ljj/c;

    invoke-direct {v1, p2, p3}, Ljj/c;-><init>(J)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljj/j;

    return-object p1
.end method

.method public f(J)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljj/u;->b:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    new-instance v1, Ljj/g;

    invoke-direct {v1}, Ljj/g;-><init>()V

    const-string v2, "FriendRequestReceived"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    new-instance v1, Ljj/f;

    invoke-direct {v1}, Ljj/f;-><init>()V

    const-string v2, "FriendRequestAccepted"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    new-instance v1, Ljj/l;

    invoke-direct {v1}, Ljj/l;-><init>()V

    const-string v2, "PrivateMessageReceived"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljj/u;->b:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ljj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
