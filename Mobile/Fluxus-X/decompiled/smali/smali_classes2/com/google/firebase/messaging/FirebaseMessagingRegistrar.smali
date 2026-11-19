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

.method public static synthetic a(Lof/e0;Lof/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 8

    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v1, Lhf/e;

    invoke-interface {p1, v1}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhf/e;

    const-class v2, Lzf/a;

    invoke-interface {p1, v2}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzf/a;

    const-class v3, Ljg/i;

    invoke-interface {p1, v3}, Lof/d;->d(Ljava/lang/Class;)Lag/b;

    move-result-object v3

    const-class v4, Lyf/j;

    invoke-interface {p1, v4}, Lof/d;->d(Ljava/lang/Class;)Lag/b;

    move-result-object v4

    const-class v5, Lbg/h;

    invoke-interface {p1, v5}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbg/h;

    invoke-interface {p1, p0}, Lof/d;->g(Lof/e0;)Lag/b;

    move-result-object v6

    const-class p0, Lxf/d;

    invoke-interface {p1, p0}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lxf/d;

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lhf/e;Lzf/a;Lag/b;Lag/b;Lbg/h;Lag/b;Lxf/d;)V

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
            "Lof/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lrf/b;

    const-class v1, Lz7/i;

    invoke-static {v0, v1}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v0

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, Lof/c$b;->h(Ljava/lang/String;)Lof/c$b;

    move-result-object v1

    const-class v3, Lhf/e;

    invoke-static {v3}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v3, Lzf/a;

    invoke-static {v3}, Lof/r;->g(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v3, Ljg/i;

    invoke-static {v3}, Lof/r;->h(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v3, Lyf/j;

    invoke-static {v3}, Lof/r;->h(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v3, Lbg/h;

    invoke-static {v3}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    invoke-static {v0}, Lof/r;->i(Lof/e0;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v3, Lxf/d;

    invoke-static {v3}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/firebase/messaging/z;

    invoke-direct {v3, v0}, Lcom/google/firebase/messaging/z;-><init>(Lof/e0;)V

    invoke-virtual {v1, v3}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->c()Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    const-string v1, "25.0.1"

    invoke-static {v2, v1}, Ljg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lof/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lof/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
