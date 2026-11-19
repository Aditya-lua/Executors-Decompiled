.class public final Lye/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/y$b;
    }
.end annotation


# static fields
.field public static final b:Lye/y;

.field public static final c:Lye/y$b;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lye/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lye/y;

    invoke-direct {v0}, Lye/y;-><init>()V

    sput-object v0, Lye/y;->b:Lye/y;

    new-instance v0, Lye/y$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lye/y$b;-><init>(Lye/y$a;)V

    sput-object v0, Lye/y;->c:Lye/y$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lye/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lye/y;
    .locals 1

    sget-object v0, Lye/y;->b:Lye/y;

    return-object v0
.end method


# virtual methods
.method public a()Lye/s;
    .locals 1

    iget-object v0, p0, Lye/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/s;

    if-nez v0, :cond_0

    sget-object v0, Lye/y;->c:Lye/y$b;

    :cond_0
    return-object v0
.end method
