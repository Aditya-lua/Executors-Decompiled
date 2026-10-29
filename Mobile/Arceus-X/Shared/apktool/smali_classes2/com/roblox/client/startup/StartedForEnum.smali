.class public final enum Lcom/roblox/client/startup/StartedForEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/startup/StartedForEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum AFTER_LOGIN:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum AFTER_LOGIN_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum AFTER_SIGN_UP:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum APP_RESTART:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum LOG_OUT:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum REMINDER_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum SHELL_PROCESS_RESTART:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum SHELL_PROCESS_RESTART_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

.field public static final enum SYSTEM:Lcom/roblox/client/startup/StartedForEnum;


# instance fields
.field private final id:I


# direct methods
.method private static synthetic $values()[Lcom/roblox/client/startup/StartedForEnum;
    .locals 11

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SYSTEM:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v2, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v3, Lcom/roblox/client/startup/StartedForEnum;->APP_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v4, Lcom/roblox/client/startup/StartedForEnum;->AFTER_SIGN_UP:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v5, Lcom/roblox/client/startup/StartedForEnum;->AFTER_LOGIN:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v6, Lcom/roblox/client/startup/StartedForEnum;->PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v7, Lcom/roblox/client/startup/StartedForEnum;->LOG_OUT:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v8, Lcom/roblox/client/startup/StartedForEnum;->REMINDER_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v9, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v10, Lcom/roblox/client/startup/StartedForEnum;->AFTER_LOGIN_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

    filled-new-array/range {v0 .. v10}, [Lcom/roblox/client/startup/StartedForEnum;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "SYSTEM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->SYSTEM:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "SHELL_PROCESS_RESTART"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "SHELL_PROCESS_RESTART_FOR_RESULT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "APP_RESTART"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->APP_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "AFTER_SIGN_UP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->AFTER_SIGN_UP:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "AFTER_LOGIN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->AFTER_LOGIN:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "PROTOCOL_LAUNCH"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "LOG_OUT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->LOG_OUT:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "REMINDER_NOTIFICATION"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->REMINDER_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "LOADED_FROM_PUSH_NOTIFICATION"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Lcom/roblox/client/startup/StartedForEnum;

    const-string v1, "AFTER_LOGIN_FOR_RESULT"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, Lcom/roblox/client/startup/StartedForEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->AFTER_LOGIN_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {}, Lcom/roblox/client/startup/StartedForEnum;->$values()[Lcom/roblox/client/startup/StartedForEnum;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/StartedForEnum;->$VALUES:[Lcom/roblox/client/startup/StartedForEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/roblox/client/startup/StartedForEnum;->id:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/startup/StartedForEnum;
    .locals 1

    const-class v0, Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/startup/StartedForEnum;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/startup/StartedForEnum;
    .locals 1

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->$VALUES:[Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0}, [Lcom/roblox/client/startup/StartedForEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/startup/StartedForEnum;

    return-object v0
.end method


# virtual methods
.method public getId()I
    .locals 1

    iget v0, p0, Lcom/roblox/client/startup/StartedForEnum;->id:I

    return v0
.end method
