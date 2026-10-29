.class public final Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;
.super Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CppProxy"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final nativeRef:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-static {p0, p1, p2}, Lcom/snapchat/djinni/NativeObjectManager;->register(Ljava/lang/Object;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "nativeRef is zero"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native nativeDestroy(J)V
.end method

.method private native native_deleteCurrentUserValues(J)Z
.end method

.method private native native_deleteSecureValue(JLjava/lang/String;)Z
.end method

.method private native native_deleteUserValues(JJ)Z
.end method

.method private native native_getCurrentUser(J)J
.end method

.method private native native_getSecureValue(JLjava/lang/String;)Ljava/lang/String;
.end method

.method private native native_getSecureValueForCurrentUser(JLjava/lang/String;)Ljava/lang/String;
.end method

.method private native native_getSecureValueForUser(JLjava/lang/String;J)Ljava/lang/String;
.end method

.method private native native_getUsers(J)Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/HashSet<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method private native native_setCurrentUser(JJ)Z
.end method

.method private native native_setSecureValue(JLjava/lang/String;Ljava/lang/String;)Z
.end method

.method private native native_setSecureValueForCurrentUser(JLjava/lang/String;Ljava/lang/String;)Z
.end method

.method private native native_setSecureValueForUser(JLjava/lang/String;Ljava/lang/String;J)Z
.end method


# virtual methods
.method public deleteCurrentUserValues()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_deleteCurrentUserValues(J)Z

    move-result v0

    return v0
.end method

.method public deleteSecureValue(Ljava/lang/String;)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_deleteSecureValue(JLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public deleteUserValues(J)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_deleteUserValues(JJ)Z

    move-result p1

    return p1
.end method

.method public getCurrentUser()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_getCurrentUser(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getSecureValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_getSecureValue(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSecureValueForCurrentUser(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_getSecureValueForCurrentUser(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSecureValueForUser(Ljava/lang/String;J)Ljava/lang/String;
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    move-object v0, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_getSecureValueForUser(JLjava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getUsers()Ljava/util/HashSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_getUsers(J)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public setCurrentUser(J)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_setCurrentUser(JJ)Z

    move-result p1

    return p1
.end method

.method public setSecureValue(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_setSecureValue(JLjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public setSecureValueForCurrentUser(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_setSecureValueForCurrentUser(JLjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public setSecureValueForUser(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 7

    iget-wide v1, p0, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->nativeRef:J

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;->native_setSecureValueForUser(JLjava/lang/String;Ljava/lang/String;J)Z

    move-result p1

    return p1
.end method
