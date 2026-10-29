.class public final enum Lcom/roblox/client/startup/FlagCacheUtils$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/startup/FlagCacheUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/startup/FlagCacheUtils$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/roblox/client/startup/FlagCacheUtils$a;",
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
.field public static final enum b:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum c:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum d:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum e:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum f:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum g:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum h:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final enum i:Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final synthetic j:[Lcom/roblox/client/startup/FlagCacheUtils$a;

.field public static final synthetic k:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x0

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->b:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x1

    const-string v2, "miss_no_cached_channel"

    const-string v3, "MISS_NO_CACHED_CHANNEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->c:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x2

    const-string v2, "miss_channel_mismatch"

    const-string v3, "MISS_CHANNEL_MISMATCH"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->d:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x3

    const-string v2, "miss_no_file"

    const-string v3, "MISS_NO_FILE"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->e:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x4

    const-string v2, "miss_expired"

    const-string v3, "MISS_EXPIRED"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->f:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x5

    const-string v2, "miss_read_error"

    const-string v3, "MISS_READ_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->g:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x6

    const-string v2, "miss_burn_failed"

    const-string v3, "MISS_BURN_FAILED"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->h:Lcom/roblox/client/startup/FlagCacheUtils$a;

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const/4 v1, 0x7

    const-string v2, "miss_network_won"

    const-string v3, "MISS_NETWORK_WON"

    invoke-direct {v0, v3, v1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->i:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils$a;->a()[Lcom/roblox/client/startup/FlagCacheUtils$a;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->j:[Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->k:Lqt/a;

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

    iput-object p3, p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lcom/roblox/client/startup/FlagCacheUtils$a;
    .locals 8

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->b:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v1, Lcom/roblox/client/startup/FlagCacheUtils$a;->c:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v2, Lcom/roblox/client/startup/FlagCacheUtils$a;->d:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v3, Lcom/roblox/client/startup/FlagCacheUtils$a;->e:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v4, Lcom/roblox/client/startup/FlagCacheUtils$a;->f:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v5, Lcom/roblox/client/startup/FlagCacheUtils$a;->g:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v6, Lcom/roblox/client/startup/FlagCacheUtils$a;->h:Lcom/roblox/client/startup/FlagCacheUtils$a;

    sget-object v7, Lcom/roblox/client/startup/FlagCacheUtils$a;->i:Lcom/roblox/client/startup/FlagCacheUtils$a;

    filled-new-array/range {v0 .. v7}, [Lcom/roblox/client/startup/FlagCacheUtils$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/startup/FlagCacheUtils$a;
    .locals 1

    const-class v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/startup/FlagCacheUtils$a;
    .locals 1

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils$a;->j:[Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/startup/FlagCacheUtils$a;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->a:Ljava/lang/String;

    return-object v0
.end method
