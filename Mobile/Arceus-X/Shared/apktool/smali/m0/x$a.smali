.class public Lm0/x$a;
.super Ln0/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/x;->s(Lm0/x$c;)Lm0/u0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm0/x;


# direct methods
.method public constructor <init>(Lm0/x;)V
    .locals 0

    iput-object p1, p0, Lm0/x$a;->a:Lm0/x;

    invoke-direct {p0}, Ln0/u;-><init>()V

    return-void
.end method

.method public static synthetic e(Lm0/x$a;)V
    .locals 0

    iget-object p0, p0, Lm0/x$a;->a:Lm0/x;

    iget-object p0, p0, Lm0/x;->a:Lm0/v0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lm0/v0;->p()V

    :cond_0
    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 1

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, Lm0/w;

    invoke-direct {v0, p0}, Lm0/w;-><init>(Lm0/x$a;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
