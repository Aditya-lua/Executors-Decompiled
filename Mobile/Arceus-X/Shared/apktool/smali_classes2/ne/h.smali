.class public abstract Lne/h;
.super Lne/b$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/h$d;,
        Lne/h$c;,
        Lne/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<OutputT:",
        "Ljava/lang/Object;",
        ">",
        "Lne/b$j<",
        "TOutputT;>;"
    }
.end annotation


# static fields
.field public static final j:Lne/h$b;

.field public static final k:Ljava/util/logging/Logger;


# instance fields
.field public volatile h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public volatile i:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-class v0, Lne/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    sput-object v1, Lne/h;->k:Ljava/util/logging/Logger;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lne/h$c;

    const-class v3, Ljava/util/Set;

    const-string v4, "h"

    invoke-static {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    const-string v4, "i"

    invoke-static {v0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lne/h$c;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v2, Lne/h$d;

    invoke-direct {v2, v1}, Lne/h$d;-><init>(Lne/h$a;)V

    move-object v1, v0

    :goto_0
    sput-object v2, Lne/h;->j:Lne/h$b;

    if-eqz v1, :cond_0

    sget-object v0, Lne/h;->k:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "SafeAtomicHelper is broken!"

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lne/b$j;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lne/h;->h:Ljava/util/Set;

    iput p1, p0, Lne/h;->i:I

    return-void
.end method

.method public static synthetic H(Lne/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lne/h;->h:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic I(Lne/h;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    iput-object p1, p0, Lne/h;->h:Ljava/util/Set;

    return-object p1
.end method

.method public static synthetic J(Lne/h;)I
    .locals 1

    iget v0, p0, Lne/h;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lne/h;->i:I

    return v0
.end method


# virtual methods
.method public abstract K(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation
.end method

.method public final L()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lne/h;->h:Ljava/util/Set;

    return-void
.end method

.method public final M()I
    .locals 1

    sget-object v0, Lne/h;->j:Lne/h$b;

    invoke-virtual {v0, p0}, Lne/h$b;->b(Lne/h;)I

    move-result v0

    return v0
.end method

.method public final N()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lne/h;->h:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-static {}, Lie/t0;->c()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v0}, Lne/h;->K(Ljava/util/Set;)V

    sget-object v1, Lne/h;->j:Lne/h$b;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v0}, Lne/h$b;->a(Lne/h;Ljava/util/Set;Ljava/util/Set;)V

    iget-object v0, p0, Lne/h;->h:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    :cond_0
    return-object v0
.end method
