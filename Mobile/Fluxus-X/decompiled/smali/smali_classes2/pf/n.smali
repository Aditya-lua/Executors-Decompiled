.class public final synthetic Lpf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Callable;

.field public final synthetic b:Lpf/p$b;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;Lpf/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf/n;->a:Ljava/util/concurrent/Callable;

    iput-object p2, p0, Lpf/n;->b:Lpf/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpf/n;->a:Ljava/util/concurrent/Callable;

    iget-object v1, p0, Lpf/n;->b:Lpf/p$b;

    invoke-static {v0, v1}, Lpf/o;->e(Ljava/util/concurrent/Callable;Lpf/p$b;)V

    return-void
.end method
