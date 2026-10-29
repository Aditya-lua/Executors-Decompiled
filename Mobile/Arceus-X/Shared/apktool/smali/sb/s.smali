.class public final Lsb/s;
.super Lsb/a;
.source "SourceFile"


# instance fields
.field public final a:Lsb/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lsb/a;-><init>()V

    new-instance v0, Lsb/n0;

    invoke-direct {v0}, Lsb/n0;-><init>()V

    iput-object v0, p0, Lsb/s;->a:Lsb/n0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lsb/s;->a:Lsb/n0;

    invoke-virtual {v0}, Lsb/n0;->m()Z

    move-result v0

    return v0
.end method

.method public final b(Lsb/h;)Lsb/a;
    .locals 2
    .param p1    # Lsb/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lsb/n;

    invoke-direct {v0, p0, p1}, Lsb/n;-><init>(Lsb/s;Lsb/h;)V

    iget-object p1, p0, Lsb/s;->a:Lsb/n0;

    sget-object v1, Lsb/l;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v0}, Lsb/n0;->f(Ljava/util/concurrent/Executor;Lsb/g;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lsb/s;->a:Lsb/n0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lsb/n0;->t(Ljava/lang/Object;)Z

    return-void
.end method
