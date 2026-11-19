.class public final Lj8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lj8/v;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lk8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lj8/x;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ll8/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Lj8/x;",
            ">;",
            "Lyt/a<",
            "Ll8/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/w;->a:Lyt/a;

    iput-object p2, p0, Lj8/w;->b:Lyt/a;

    iput-object p3, p0, Lj8/w;->c:Lyt/a;

    iput-object p4, p0, Lj8/w;->d:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;Lyt/a;)Lj8/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Lj8/x;",
            ">;",
            "Lyt/a<",
            "Ll8/b;",
            ">;)",
            "Lj8/w;"
        }
    .end annotation

    new-instance v0, Lj8/w;

    invoke-direct {v0, p0, p1, p2, p3}, Lj8/w;-><init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lk8/d;Lj8/x;Ll8/b;)Lj8/v;
    .locals 1

    new-instance v0, Lj8/v;

    invoke-direct {v0, p0, p1, p2, p3}, Lj8/v;-><init>(Ljava/util/concurrent/Executor;Lk8/d;Lj8/x;Ll8/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lj8/v;
    .locals 4

    iget-object v0, p0, Lj8/w;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lj8/w;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk8/d;

    iget-object v2, p0, Lj8/w;->c:Lyt/a;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8/x;

    iget-object v3, p0, Lj8/w;->d:Lyt/a;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll8/b;

    invoke-static {v0, v1, v2, v3}, Lj8/w;->c(Ljava/util/concurrent/Executor;Lk8/d;Lj8/x;Ll8/b;)Lj8/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj8/w;->b()Lj8/v;

    move-result-object v0

    return-object v0
.end method
