.class public Lr9/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public b:Lr9/a;

.field public c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lr9/d$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lk9/h;)Lr9/d$a;
    .locals 1
    .param p1    # Lk9/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lr9/d$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lr9/d;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lr9/d;

    iget-object v1, p0, Lr9/d$a;->a:Ljava/util/List;

    iget-object v2, p0, Lr9/d$a;->b:Lr9/a;

    iget-object v3, p0, Lr9/d$a;->c:Ljava/util/concurrent/Executor;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lr9/d;-><init>(Ljava/util/List;Lr9/a;Ljava/util/concurrent/Executor;ZLr9/g;)V

    return-object v0
.end method
