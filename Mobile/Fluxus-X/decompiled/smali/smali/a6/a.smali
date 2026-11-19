.class public La6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Lz5/u;

.field public final b:Ly5/j0;

.field public final c:Ly5/b;

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

    invoke-static {v0}, Ly5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La6/a;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lz5/u;Ly5/j0;Ly5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/a;->a:Lz5/u;

    iput-object p2, p0, La6/a;->b:Ly5/j0;

    iput-object p3, p0, La6/a;->c:Ly5/b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La6/a;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lg6/j0;J)V
    .locals 3

    iget-object v0, p0, La6/a;->d:Ljava/util/Map;

    iget-object v1, p1, Lg6/j0;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, La6/a;->b:Ly5/j0;

    invoke-interface {v1, v0}, Ly5/j0;->a(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v0, La6/a$a;

    invoke-direct {v0, p0, p1}, La6/a$a;-><init>(La6/a;Lg6/j0;)V

    iget-object v1, p0, La6/a;->d:Ljava/util/Map;

    iget-object p1, p1, Lg6/j0;->a:Ljava/lang/String;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, La6/a;->c:Ly5/b;

    invoke-interface {p1}, Ly5/b;->a()J

    move-result-wide v1

    sub-long/2addr p2, v1

    iget-object p1, p0, La6/a;->b:Ly5/j0;

    invoke-interface {p1, p2, p3, v0}, Ly5/j0;->b(JLjava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, La6/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v0, p0, La6/a;->b:Ly5/j0;

    invoke-interface {v0, p1}, Ly5/j0;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
