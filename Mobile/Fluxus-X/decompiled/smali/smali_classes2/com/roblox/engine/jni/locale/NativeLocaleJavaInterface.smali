.class public Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static sImplementation:Lxk/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxk/a;

    invoke-direct {v0}, Lxk/a;-><init>()V

    sput-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lxk/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getGameLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lxk/a;

    invoke-virtual {v0}, Lxk/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lxk/a;

    invoke-virtual {v0}, Lxk/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getRobloxLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lxk/a;

    invoke-virtual {v0}, Lxk/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static setImplementation(Lxk/a;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lxk/a;

    return-void
.end method
