.class public final Lgb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:Lgb/j;

.field public final b:Lgb/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lgb/k;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lgb/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgb/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lgb/j;-><init>(Lgb/k;Landroid/app/Application;[B)V

    iput-object v0, p0, Lgb/k;->a:Lgb/j;

    iput-object p2, p0, Lgb/k;->b:Lgb/n;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lgb/k;
    .locals 3

    sget-object v0, Lgb/k;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb/k;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Lgb/k;

    invoke-static {p0}, Lgb/p;->a(Landroid/app/Application;)Lgb/n;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lgb/k;-><init>(Landroid/app/Application;Lgb/n;)V

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgb/k;

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgb/k;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    const-string v0, "AutomaticGamesAuthenticator"

    const-string v1, "startWatching()"

    invoke-static {v0, v1}, Lgb/t0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lgb/k;->a:Lgb/j;

    invoke-virtual {v0}, Lgb/j;->a()V

    return-void
.end method

.method public final synthetic c()Lgb/n;
    .locals 1

    iget-object v0, p0, Lgb/k;->b:Lgb/n;

    return-object v0
.end method
