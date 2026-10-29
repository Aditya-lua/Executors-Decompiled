.class public Lgk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk/c$a;
    }
.end annotation


# static fields
.field public static b:Ljava/lang/String;

.field public static c:Lne/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/e0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lne/e0;->H()Lne/e0;

    move-result-object v0

    sput-object v0, Lgk/c;->c:Lne/e0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgk/c;->a:Z

    return-void
.end method

.method public static synthetic b(Lgk/c;Lgk/a$a;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgk/c;->h(Lgk/a$a;Ljava/lang/String;)V

    return-void
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A5()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lgk/c;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lgk/c;->b:Ljava/lang/String;

    const-string v0, ""

    return-object v0

    :cond_1
    sget-object v0, Lgk/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static g()Lgk/c;
    .locals 1

    invoke-static {}, Lgk/c$a;->a()Lgk/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    sput-object p1, Lgk/c;->b:Ljava/lang/String;

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lgk/c;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgk/c;->a:Z

    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lgk/c;->f(Landroid/content/Context;Lgk/a$a;)V

    return-void
.end method

.method public f(Landroid/content/Context;Lgk/a$a;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lgk/c;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgk/c;->a:Z

    new-instance v0, Lgk/a;

    new-instance v1, Lgk/b;

    invoke-direct {v1, p0, p2}, Lgk/b;-><init>(Lgk/c;Lgk/a$a;)V

    invoke-direct {v0, p1, v1}, Lgk/a;-><init>(Landroid/content/Context;Lgk/a$a;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :cond_1
    if-eqz p2, :cond_2

    sget-object p1, Lgk/c;->b:Ljava/lang/String;

    invoke-interface {p2, p1}, Lgk/a$a;->a(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final synthetic h(Lgk/a$a;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p2}, Lgk/c;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lgk/a$a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
