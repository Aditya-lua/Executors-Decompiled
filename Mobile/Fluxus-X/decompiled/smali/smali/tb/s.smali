.class public final Ltb/s;
.super Ltb/a;
.source "SourceFile"


# instance fields
.field public final a:Ltb/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltb/a;-><init>()V

    new-instance v0, Ltb/n0;

    invoke-direct {v0}, Ltb/n0;-><init>()V

    iput-object v0, p0, Ltb/s;->a:Ltb/n0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Ltb/s;->a:Ltb/n0;

    invoke-virtual {v0}, Ltb/n0;->m()Z

    move-result v0

    return v0
.end method

.method public final b(Ltb/h;)Ltb/a;
    .locals 2
    .param p1    # Ltb/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ltb/n;

    invoke-direct {v0, p0, p1}, Ltb/n;-><init>(Ltb/s;Ltb/h;)V

    iget-object p1, p0, Ltb/s;->a:Ltb/n0;

    sget-object v1, Ltb/l;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v0}, Ltb/n0;->f(Ljava/util/concurrent/Executor;Ltb/g;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Ltb/s;->a:Ltb/n0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ltb/n0;->t(Ljava/lang/Object;)Z

    return-void
.end method
