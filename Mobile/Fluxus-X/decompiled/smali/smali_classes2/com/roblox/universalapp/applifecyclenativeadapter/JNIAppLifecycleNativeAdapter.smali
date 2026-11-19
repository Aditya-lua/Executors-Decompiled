.class public Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setActive()V
.end method

.method public static native setHidden()V
.end method

.method public static native setInactive()V
.end method


# virtual methods
.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object p1, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;->setHidden()V

    return-void

    :cond_1
    invoke-static {}, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;->setInactive()V

    return-void

    :cond_2
    invoke-static {}, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;->setActive()V

    return-void
.end method
