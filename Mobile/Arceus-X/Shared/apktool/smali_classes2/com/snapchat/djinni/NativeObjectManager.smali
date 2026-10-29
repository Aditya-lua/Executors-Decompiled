.class public Lcom/snapchat/djinni/NativeObjectManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/snapchat/djinni/NativeObjectManager$c;,
        Lcom/snapchat/djinni/NativeObjectManager$b;
    }
.end annotation


# instance fields
.field private final mReferenceQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final mReferences:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/snapchat/djinni/NativeObjectManager$c;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mThread:Ljava/lang/Thread;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lcom/snapchat/djinni/NativeObjectManager;->mReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/snapchat/djinni/NativeObjectManager;->mReferences:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    new-instance v0, Lcom/snapchat/djinni/NativeObjectManager$a;

    const-string v1, "NativeObjectManager"

    invoke-direct {v0, p0, v1}, Lcom/snapchat/djinni/NativeObjectManager$a;-><init>(Lcom/snapchat/djinni/NativeObjectManager;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/snapchat/djinni/NativeObjectManager;->mThread:Ljava/lang/Thread;

    const/4 v1, 0x4

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 7
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public synthetic constructor <init>(Ltm/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/snapchat/djinni/NativeObjectManager;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/snapchat/djinni/NativeObjectManager;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    iget-object p0, p0, Lcom/snapchat/djinni/NativeObjectManager;->mReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/snapchat/djinni/NativeObjectManager;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, Lcom/snapchat/djinni/NativeObjectManager;->mReferences:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static register(Ljava/lang/Object;J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lcom/snapchat/djinni/NativeObjectManager;->register(Ljava/lang/Object;Ljava/lang/Class;J)V

    return-void
.end method

.method public static register(Ljava/lang/Object;Ljava/lang/Class;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;J)V"
        }
    .end annotation

    .line 2
    :try_start_0
    new-instance v0, Lcom/snapchat/djinni/NativeObjectManager$c;

    sget-object v6, Lcom/snapchat/djinni/NativeObjectManager$b;->a:Lcom/snapchat/djinni/NativeObjectManager;

    iget-object v5, v6, Lcom/snapchat/djinni/NativeObjectManager;->mReferenceQueue:Ljava/lang/ref/ReferenceQueue;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    :try_start_1
    invoke-direct/range {v0 .. v5}, Lcom/snapchat/djinni/NativeObjectManager$c;-><init>(Ljava/lang/Object;Ljava/lang/Class;JLjava/lang/ref/ReferenceQueue;)V

    .line 3
    iget-object p0, v6, Lcom/snapchat/djinni/NativeObjectManager;->mReferences:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    move-object v1, p0

    .line 4
    :catch_1
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "failed to register object of type "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " no static method nativeDestroy() found"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static stop()V
    .locals 1

    sget-object v0, Lcom/snapchat/djinni/NativeObjectManager$b;->a:Lcom/snapchat/djinni/NativeObjectManager;

    iget-object v0, v0, Lcom/snapchat/djinni/NativeObjectManager;->mThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
