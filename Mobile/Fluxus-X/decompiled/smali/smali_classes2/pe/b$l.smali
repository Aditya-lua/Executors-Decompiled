.class public final Lpe/b$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation


# static fields
.field public static final c:Lpe/b$l;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Lpe/b$l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpe/b$l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpe/b$l;-><init>(Z)V

    sput-object v0, Lpe/b$l;->c:Lpe/b$l;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lpe/b;->d()Lpe/b$b;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lpe/b$b;->g(Lpe/b$l;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lpe/b$l;)V
    .locals 1

    invoke-static {}, Lpe/b;->d()Lpe/b$b;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lpe/b$b;->f(Lpe/b$l;Lpe/b$l;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lpe/b$l;->a:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lpe/b$l;->a:Ljava/lang/Thread;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
