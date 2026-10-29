.class public final enum Lrl/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrl/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lrl/m;

.field public static final enum b:Lrl/m;

.field public static final enum c:Lrl/m;

.field public static final enum d:Lrl/m;

.field public static final enum e:Lrl/m;

.field public static final enum f:Lrl/m;

.field public static final enum g:Lrl/m;

.field public static final enum h:Lrl/m;

.field public static final synthetic i:[Lrl/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrl/m;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->a:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "TOKEN_PROVIDER_UNINITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->b:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "INVALID_NONCE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->c:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "REQUEST_TIMEOUT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->d:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "EXCEPTION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->e:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "INTERRUPTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->f:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "RECEIVED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->g:Lrl/m;

    new-instance v0, Lrl/m;

    const-string v1, "REFRESHED_TOKEN_PROVIDER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lrl/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrl/m;->h:Lrl/m;

    invoke-static {}, Lrl/m;->a()[Lrl/m;

    move-result-object v0

    sput-object v0, Lrl/m;->i:[Lrl/m;

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

.method public static synthetic a()[Lrl/m;
    .locals 8

    sget-object v0, Lrl/m;->a:Lrl/m;

    sget-object v1, Lrl/m;->b:Lrl/m;

    sget-object v2, Lrl/m;->c:Lrl/m;

    sget-object v3, Lrl/m;->d:Lrl/m;

    sget-object v4, Lrl/m;->e:Lrl/m;

    sget-object v5, Lrl/m;->f:Lrl/m;

    sget-object v6, Lrl/m;->g:Lrl/m;

    sget-object v7, Lrl/m;->h:Lrl/m;

    filled-new-array/range {v0 .. v7}, [Lrl/m;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrl/m;
    .locals 1

    const-class v0, Lrl/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrl/m;

    return-object p0
.end method

.method public static values()[Lrl/m;
    .locals 1

    sget-object v0, Lrl/m;->i:[Lrl/m;

    invoke-virtual {v0}, [Lrl/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrl/m;

    return-object v0
.end method
