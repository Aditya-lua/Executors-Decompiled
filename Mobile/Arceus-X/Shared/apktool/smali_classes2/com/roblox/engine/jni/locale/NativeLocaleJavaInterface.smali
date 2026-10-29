.class public Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sImplementation:Lpk/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpk/a;

    invoke-direct {v0}, Lpk/a;-><init>()V

    sput-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lpk/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getGameLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lpk/a;

    invoke-virtual {v0}, Lpk/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lpk/a;

    invoke-virtual {v0}, Lpk/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getRobloxLocale()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lpk/a;

    invoke-virtual {v0}, Lpk/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static setImplementation(Lpk/a;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->sImplementation:Lpk/a;

    return-void
.end method
