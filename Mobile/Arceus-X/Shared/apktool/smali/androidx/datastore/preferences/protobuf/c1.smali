.class public final Landroidx/datastore/preferences/protobuf/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Landroidx/datastore/preferences/protobuf/c1;

.field public static d:Z


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/h1;

.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Landroidx/datastore/preferences/protobuf/g1<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/c1;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/c1;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/c1;->c:Landroidx/datastore/preferences/protobuf/c1;

    const/4 v0, 0x0

    sput-boolean v0, Landroidx/datastore/preferences/protobuf/c1;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/c1;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Landroidx/datastore/preferences/protobuf/j0;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/j0;-><init>()V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/c1;->a:Landroidx/datastore/preferences/protobuf/h1;

    return-void
.end method

.method public static a()Landroidx/datastore/preferences/protobuf/c1;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/c1;->c:Landroidx/datastore/preferences/protobuf/c1;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/g1;)Landroidx/datastore/preferences/protobuf/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Landroidx/datastore/preferences/protobuf/g1<",
            "*>;)",
            "Landroidx/datastore/preferences/protobuf/g1<",
            "*>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/c1;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/g1;

    return-object p1
.end method

.method public c(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroidx/datastore/preferences/protobuf/g1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/c1;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/g1;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/c1;->a:Landroidx/datastore/preferences/protobuf/h1;

    invoke-interface {v0, p1}, Landroidx/datastore/preferences/protobuf/h1;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/c1;->b(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/g1;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Landroidx/datastore/preferences/protobuf/g1<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/c1;->c(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object p1

    return-object p1
.end method
