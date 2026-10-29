.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmf/e0;Lmf/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 8

    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v1, Lff/e;

    invoke-interface {p1, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lff/e;

    const-class v2, Lxf/a;

    invoke-interface {p1, v2}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxf/a;

    const-class v3, Lhg/i;

    invoke-interface {p1, v3}, Lmf/d;->g(Ljava/lang/Class;)Lyf/b;

    move-result-object v3

    const-class v4, Lwf/j;

    invoke-interface {p1, v4}, Lmf/d;->g(Ljava/lang/Class;)Lyf/b;

    move-result-object v4

    const-class v5, Lzf/h;

    invoke-interface {p1, v5}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzf/h;

    invoke-interface {p1, p0}, Lmf/d;->c(Lmf/e0;)Lyf/b;

    move-result-object v6

    const-class p0, Lvf/d;

    invoke-interface {p1, p0}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lvf/d;

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lff/e;Lxf/a;Lyf/b;Lyf/b;Lzf/h;Lyf/b;Lvf/d;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmf/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lpf/b;

    const-class v1, Ly7/i;

    invoke-static {v0, v1}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v0

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, Lmf/c$b;->h(Ljava/lang/String;)Lmf/c$b;

    move-result-object v1

    const-class v3, Lff/e;

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v3, Lxf/a;

    invoke-static {v3}, Lmf/r;->g(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v3, Lhg/i;

    invoke-static {v3}, Lmf/r;->h(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v3, Lwf/j;

    invoke-static {v3}, Lmf/r;->h(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v3, Lzf/h;

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    invoke-static {v0}, Lmf/r;->i(Lmf/e0;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v3, Lvf/d;

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/firebase/messaging/z;

    invoke-direct {v3, v0}, Lcom/google/firebase/messaging/z;-><init>(Lmf/e0;)V

    invoke-virtual {v1, v3}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->c()Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    const-string v1, "25.0.1"

    invoke-static {v2, v1}, Lhg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lmf/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lmf/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
