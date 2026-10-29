.class public Lcom/roblox/client/JNIAAssetManagerSetup;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "JNIAAssetManagerSetup"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/roblox/client/JNIAAssetManagerSetup;->a:Ljava/lang/String;

    const-string v1, "Initialize Android AssetReader"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/JNIAAssetManagerSetup;->initNative(Landroid/content/res/AssetManager;)V

    return-void
.end method

.method private static native initNative(Landroid/content/res/AssetManager;)V
.end method
