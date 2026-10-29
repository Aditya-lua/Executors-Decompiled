.class public final enum Lcom/roblox/client/captcha/LoginCaptchaConfig$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/captcha/LoginCaptchaConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/captcha/LoginCaptchaConfig$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

.field public static final enum b:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

.field public static final enum c:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

.field public static final synthetic d:[Lcom/roblox/client/captcha/LoginCaptchaConfig$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    const-string v1, "USERNAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->a:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    new-instance v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    const-string v1, "EMAIL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->b:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    new-instance v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    const-string v1, "PHONE_NUMBER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->c:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    invoke-static {}, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->a()[Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->d:[Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lcom/roblox/client/captcha/LoginCaptchaConfig$c;
    .locals 3

    sget-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->a:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    sget-object v1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->b:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    sget-object v2, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->c:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    filled-new-array {v0, v1, v2}, [Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/captcha/LoginCaptchaConfig$c;
    .locals 1

    const-class v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/captcha/LoginCaptchaConfig$c;
    .locals 1

    sget-object v0, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->d:[Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    invoke-virtual {v0}, [Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    return-object v0
.end method
