.class public final enum Lfm/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfm/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lfm/m;

.field public static final enum b:Lfm/m;

.field public static final enum c:Lfm/m;

.field public static final enum d:Lfm/m;

.field public static final enum e:Lfm/m;

.field public static final enum f:Lfm/m;

.field public static final enum g:Lfm/m;

.field public static final enum h:Lfm/m;

.field public static final synthetic i:[Lfm/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfm/m;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->a:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "TOKEN_PROVIDER_UNINITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->b:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "INVALID_NONCE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->c:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "REQUEST_TIMEOUT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->d:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "EXCEPTION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->e:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "INTERRUPTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->f:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "RECEIVED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->g:Lfm/m;

    new-instance v0, Lfm/m;

    const-string v1, "REFRESHED_TOKEN_PROVIDER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lfm/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/m;->h:Lfm/m;

    invoke-static {}, Lfm/m;->a()[Lfm/m;

    move-result-object v0

    sput-object v0, Lfm/m;->i:[Lfm/m;

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

.method public static synthetic a()[Lfm/m;
    .locals 8

    sget-object v0, Lfm/m;->a:Lfm/m;

    sget-object v1, Lfm/m;->b:Lfm/m;

    sget-object v2, Lfm/m;->c:Lfm/m;

    sget-object v3, Lfm/m;->d:Lfm/m;

    sget-object v4, Lfm/m;->e:Lfm/m;

    sget-object v5, Lfm/m;->f:Lfm/m;

    sget-object v6, Lfm/m;->g:Lfm/m;

    sget-object v7, Lfm/m;->h:Lfm/m;

    filled-new-array/range {v0 .. v7}, [Lfm/m;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfm/m;
    .locals 1

    const-class v0, Lfm/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfm/m;

    return-object p0
.end method

.method public static values()[Lfm/m;
    .locals 1

    sget-object v0, Lfm/m;->i:[Lfm/m;

    invoke-virtual {v0}, [Lfm/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfm/m;

    return-object v0
.end method
