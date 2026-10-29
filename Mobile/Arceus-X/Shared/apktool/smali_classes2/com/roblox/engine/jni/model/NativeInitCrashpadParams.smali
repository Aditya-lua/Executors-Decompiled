.class public abstract Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 2

    new-instance v0, Lcom/roblox/engine/jni/model/a$a;

    invoke-direct {v0}, Lcom/roblox/engine/jni/model/a$a;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/model/a$a;->f(Z)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract appVersion()Ljava/lang/String;
.end method

.method public abstract baseUrl()Ljava/lang/String;
.end method

.method public abstract buildVariant()Ljava/lang/String;
.end method

.method public abstract collectLogcat()Z
.end method

.method public abstract countName()Ljava/lang/String;
.end method

.method public abstract envArgs()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract handlerClassName()Ljava/lang/String;
.end method

.method public abstract isAtLeastQ()Z
.end method

.method public abstract token()Ljava/lang/String;
.end method

.method public abstract uploadUrl()Ljava/lang/String;
.end method
