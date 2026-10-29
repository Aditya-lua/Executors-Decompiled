.class public Lz5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Ly5/u;

.field public final b:Lx5/j0;

.field public final c:Lx5/b;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayedWorkTracker"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lz5/a;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ly5/u;Lx5/j0;Lx5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/a;->a:Ly5/u;

    iput-object p2, p0, Lz5/a;->b:Lx5/j0;

    iput-object p3, p0, Lz5/a;->c:Lx5/b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lz5/a;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lf6/j0;J)V
    .locals 3

    iget-object v0, p0, Lz5/a;->d:Ljava/util/Map;

    iget-object v1, p1, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz5/a;->b:Lx5/j0;

    invoke-interface {v1, v0}, Lx5/j0;->a(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v0, Lz5/a$a;

    invoke-direct {v0, p0, p1}, Lz5/a$a;-><init>(Lz5/a;Lf6/j0;)V

    iget-object v1, p0, Lz5/a;->d:Ljava/util/Map;

    iget-object p1, p1, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lz5/a;->c:Lx5/b;

    invoke-interface {p1}, Lx5/b;->a()J

    move-result-wide v1

    sub-long/2addr p2, v1

    iget-object p1, p0, Lz5/a;->b:Lx5/j0;

    invoke-interface {p1, p2, p3, v0}, Lx5/j0;->b(JLjava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz5/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz5/a;->b:Lx5/j0;

    invoke-interface {v0, p1}, Lx5/j0;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
