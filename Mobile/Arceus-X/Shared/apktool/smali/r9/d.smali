.class public final Lr9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/d$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lr9/a;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lr9/a;Ljava/util/concurrent/Executor;ZLr9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p4, "APIs must not be null."

    invoke-static {p1, p4}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    const-string p5, "APIs must not be empty."

    invoke-static {p4, p5}, Ln9/m;->b(ZLjava/lang/Object;)V

    if-eqz p3, :cond_0

    const-string p4, "Listener must not be null when listener executor is set."

    invoke-static {p2, p4}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p1, p0, Lr9/d;->a:Ljava/util/List;

    iput-object p2, p0, Lr9/d;->b:Lr9/a;

    iput-object p3, p0, Lr9/d;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static d()Lr9/d$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lr9/d$a;

    invoke-direct {v0}, Lr9/d$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk9/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lr9/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public b()Lr9/a;
    .locals 1

    iget-object v0, p0, Lr9/d;->b:Lr9/a;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lr9/d;->c:Ljava/util/concurrent/Executor;

    return-object v0
.end method
