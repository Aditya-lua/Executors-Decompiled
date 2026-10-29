.class public final Li8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Li8/v;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lj8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Li8/x;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lk8/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lht/a;Lht/a;Lht/a;Lht/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lht/a<",
            "Lj8/d;",
            ">;",
            "Lht/a<",
            "Li8/x;",
            ">;",
            "Lht/a<",
            "Lk8/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/w;->a:Lht/a;

    iput-object p2, p0, Li8/w;->b:Lht/a;

    iput-object p3, p0, Li8/w;->c:Lht/a;

    iput-object p4, p0, Li8/w;->d:Lht/a;

    return-void
.end method

.method public static a(Lht/a;Lht/a;Lht/a;Lht/a;)Li8/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lht/a<",
            "Lj8/d;",
            ">;",
            "Lht/a<",
            "Li8/x;",
            ">;",
            "Lht/a<",
            "Lk8/b;",
            ">;)",
            "Li8/w;"
        }
    .end annotation

    new-instance v0, Li8/w;

    invoke-direct {v0, p0, p1, p2, p3}, Li8/w;-><init>(Lht/a;Lht/a;Lht/a;Lht/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lj8/d;Li8/x;Lk8/b;)Li8/v;
    .locals 1

    new-instance v0, Li8/v;

    invoke-direct {v0, p0, p1, p2, p3}, Li8/v;-><init>(Ljava/util/concurrent/Executor;Lj8/d;Li8/x;Lk8/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Li8/v;
    .locals 4

    iget-object v0, p0, Li8/w;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li8/w;->b:Lht/a;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj8/d;

    iget-object v2, p0, Li8/w;->c:Lht/a;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/x;

    iget-object v3, p0, Li8/w;->d:Lht/a;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk8/b;

    invoke-static {v0, v1, v2, v3}, Li8/w;->c(Ljava/util/concurrent/Executor;Lj8/d;Li8/x;Lk8/b;)Li8/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/w;->b()Li8/v;

    move-result-object v0

    return-object v0
.end method
