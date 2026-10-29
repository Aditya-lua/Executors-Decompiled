.class public final Lne/w$b;
.super Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lne/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/w<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lne/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/w<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;-><init>()V

    .line 3
    iput-object p1, p0, Lne/w$b;->a:Lne/w;

    return-void
.end method

.method public synthetic constructor <init>(Lne/w;Lne/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lne/w$b;-><init>(Lne/w;)V

    return-void
.end method

.method public static synthetic a(Lne/w$b;Ljava/lang/Thread;)V
    .locals 0

    invoke-virtual {p0, p1}, Lne/w$b;->b(Ljava/lang/Thread;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Thread;)V
    .locals 0

    invoke-super {p0, p1}, Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;->setExclusiveOwnerThread(Ljava/lang/Thread;)V

    return-void
.end method

.method public run()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lne/w$b;->a:Lne/w;

    invoke-virtual {v0}, Lne/w;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
