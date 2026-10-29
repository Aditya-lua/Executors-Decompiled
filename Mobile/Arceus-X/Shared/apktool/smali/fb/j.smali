.class public final Lfb/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:Lfb/i;

.field public final b:Lfb/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lfb/j;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lfb/m;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfb/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lfb/i;-><init>(Lfb/j;Landroid/app/Application;[B)V

    iput-object v0, p0, Lfb/j;->a:Lfb/i;

    iput-object p2, p0, Lfb/j;->b:Lfb/m;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lfb/j;
    .locals 3

    sget-object v0, Lfb/j;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb/j;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Lfb/j;

    invoke-static {p0}, Lfb/o;->a(Landroid/app/Application;)Lfb/m;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lfb/j;-><init>(Landroid/app/Application;Lfb/m;)V

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfb/j;

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfb/j;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    const-string v0, "AutomaticGamesAuthenticator"

    const-string v1, "startWatching()"

    invoke-static {v0, v1}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lfb/j;->a:Lfb/i;

    invoke-virtual {v0}, Lfb/i;->a()V

    return-void
.end method

.method public final synthetic c()Lfb/m;
    .locals 1

    iget-object v0, p0, Lfb/j;->b:Lfb/m;

    return-object v0
.end method
