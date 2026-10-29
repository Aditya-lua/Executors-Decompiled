.class public final Lwe/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/y$b;
    }
.end annotation


# static fields
.field public static final b:Lwe/y;

.field public static final c:Lwe/y$b;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lwe/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe/y;

    invoke-direct {v0}, Lwe/y;-><init>()V

    sput-object v0, Lwe/y;->b:Lwe/y;

    new-instance v0, Lwe/y$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwe/y$b;-><init>(Lwe/y$a;)V

    sput-object v0, Lwe/y;->c:Lwe/y$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lwe/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lwe/y;
    .locals 1

    sget-object v0, Lwe/y;->b:Lwe/y;

    return-object v0
.end method


# virtual methods
.method public a()Lwe/s;
    .locals 1

    iget-object v0, p0, Lwe/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/s;

    if-nez v0, :cond_0

    sget-object v0, Lwe/y;->c:Lwe/y$b;

    :cond_0
    return-object v0
.end method
