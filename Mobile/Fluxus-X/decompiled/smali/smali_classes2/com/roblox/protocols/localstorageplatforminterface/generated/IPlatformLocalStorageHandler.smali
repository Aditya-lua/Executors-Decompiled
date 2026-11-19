.class public abstract Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/localstorageplatforminterface/generated/IPlatformLocalStorageHandler$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deleteCurrentUserValues()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public deleteSecureValue(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public deleteUserValues(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getCurrentUser()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getSecureValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getSecureValueForCurrentUser(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getSecureValueForUser(Ljava/lang/String;J)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getUsers()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public setCurrentUser(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setSecureValue(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setSecureValueForCurrentUser(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setSecureValueForUser(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
