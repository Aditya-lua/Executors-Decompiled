.class public final enum Leh/v0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leh/v0$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Leh/v0$b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum b:Leh/v0$b;

.field public static final enum c:Leh/v0$b;

.field public static final enum d:Leh/v0$b;

.field public static final enum e:Leh/v0$b;

.field public static final enum f:Leh/v0$b;

.field public static final enum g:Leh/v0$b;

.field public static final enum h:Leh/v0$b;

.field public static final enum i:Leh/v0$b;

.field public static final enum j:Leh/v0$b;

.field public static final enum k:Leh/v0$b;

.field public static final enum l:Leh/v0$b;

.field public static final synthetic m:[Leh/v0$b;

.field public static final synthetic n:Lhu/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x0

    const-string v2, "browser_service_bridge"

    const-string v3, "BROWSER_SERVICE_BRIDGE"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->b:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x1

    const-string v2, "web_activity"

    const-string v3, "WEB_ACTIVITY"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->c:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x2

    const-string v2, "web_fragment"

    const-string v3, "WEB_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->d:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x3

    const-string v2, "web_dialog_fragment"

    const-string v3, "WEB_DIALOG_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->e:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x4

    const-string v2, "notification_stream_activity"

    const-string v3, "NOTIFICATION_STREAM_ACTIVITY"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->f:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x5

    const-string v2, "notification_stream_web_fragment"

    const-string v3, "NOTIFICATION_STREAM_WEB_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->g:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x6

    const-string v2, "reset_password_activity"

    const-string v3, "RESET_PASSWORD_ACTIVITY"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->h:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/4 v1, 0x7

    const-string v2, "roblox_modal_web_fragment"

    const-string v3, "ROBLOX_MODAL_WEB_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->i:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/16 v1, 0x8

    const-string v2, "robux_premium_dialog_fragment"

    const-string v3, "ROBUX_PREMIUM_DIALOG_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->j:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/16 v1, 0x9

    const-string v2, "robux_premium_fragment"

    const-string v3, "ROBUX_PREMIUM_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->k:Leh/v0$b;

    new-instance v0, Leh/v0$b;

    const/16 v1, 0xa

    const-string v2, "generic_web_fragment"

    const-string v3, "GENERIC_WEB_FRAGMENT"

    invoke-direct {v0, v3, v1, v2}, Leh/v0$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Leh/v0$b;->l:Leh/v0$b;

    invoke-static {}, Leh/v0$b;->a()[Leh/v0$b;

    move-result-object v0

    sput-object v0, Leh/v0$b;->m:[Leh/v0$b;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Leh/v0$b;->n:Lhu/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Leh/v0$b;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Leh/v0$b;
    .locals 11

    sget-object v0, Leh/v0$b;->b:Leh/v0$b;

    sget-object v1, Leh/v0$b;->c:Leh/v0$b;

    sget-object v2, Leh/v0$b;->d:Leh/v0$b;

    sget-object v3, Leh/v0$b;->e:Leh/v0$b;

    sget-object v4, Leh/v0$b;->f:Leh/v0$b;

    sget-object v5, Leh/v0$b;->g:Leh/v0$b;

    sget-object v6, Leh/v0$b;->h:Leh/v0$b;

    sget-object v7, Leh/v0$b;->i:Leh/v0$b;

    sget-object v8, Leh/v0$b;->j:Leh/v0$b;

    sget-object v9, Leh/v0$b;->k:Leh/v0$b;

    sget-object v10, Leh/v0$b;->l:Leh/v0$b;

    filled-new-array/range {v0 .. v10}, [Leh/v0$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leh/v0$b;
    .locals 1

    const-class v0, Leh/v0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leh/v0$b;

    return-object p0
.end method

.method public static values()[Leh/v0$b;
    .locals 1

    sget-object v0, Leh/v0$b;->m:[Leh/v0$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leh/v0$b;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Leh/v0$b;->a:Ljava/lang/String;

    return-object v0
.end method
