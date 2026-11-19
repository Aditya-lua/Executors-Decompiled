.class public final enum Lbk/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbk/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lbk/c;

.field public static final enum d:Lbk/c;

.field public static final enum e:Lbk/c;

.field public static final enum f:Lbk/c;

.field public static final enum g:Lbk/c;

.field public static final enum h:Lbk/c;

.field public static final enum i:Lbk/c;

.field public static final enum j:Lbk/c;

.field public static final enum k:Lbk/c;

.field public static final synthetic l:[Lbk/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbk/c;

    const/4 v1, 0x0

    const-string v2, "HOME_TAG"

    const-string v3, "HOME"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->c:Lbk/c;

    new-instance v0, Lbk/c;

    const/4 v1, 0x1

    const-string v2, "GAMES_TAG"

    const-string v3, "GAMES"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->d:Lbk/c;

    new-instance v0, Lbk/c;

    const/4 v1, 0x2

    const-string v2, "AVATAR_EDITOR_TAG"

    const-string v3, "AVATAR"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->e:Lbk/c;

    new-instance v0, Lbk/c;

    const/4 v1, 0x3

    const-string v2, "MORE_TAG"

    const-string v3, "MORE"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->f:Lbk/c;

    new-instance v0, Lbk/c;

    const-string v1, "gameId"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "GAME_DETAILS"

    const/4 v3, 0x4

    const-string v4, "GAME_DETAILS_TAG"

    invoke-direct {v0, v2, v3, v4, v1}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lbk/c;->g:Lbk/c;

    new-instance v0, Lbk/c;

    const-string v1, "userId"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "PROFILE"

    const/4 v3, 0x5

    const-string v4, "PROFILE_TAG"

    invoke-direct {v0, v2, v3, v4, v1}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lbk/c;->h:Lbk/c;

    new-instance v0, Lbk/c;

    const/4 v1, 0x6

    const-string v2, "CATALOG_TAG"

    const-string v3, "CATALOG"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->i:Lbk/c;

    new-instance v0, Lbk/c;

    const/4 v1, 0x7

    const-string v2, "FRIENDS_TAG"

    const-string v3, "FRIENDS"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->j:Lbk/c;

    new-instance v0, Lbk/c;

    const/16 v1, 0x8

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbk/c;->k:Lbk/c;

    invoke-static {}, Lbk/c;->a()[Lbk/c;

    move-result-object v0

    sput-object v0, Lbk/c;->l:[Lbk/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, v0}, Lbk/c;-><init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lbk/c;->a:Ljava/lang/String;

    .line 3
    iput-object p4, p0, Lbk/c;->b:[Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()[Lbk/c;
    .locals 9

    sget-object v0, Lbk/c;->c:Lbk/c;

    sget-object v1, Lbk/c;->d:Lbk/c;

    sget-object v2, Lbk/c;->e:Lbk/c;

    sget-object v3, Lbk/c;->f:Lbk/c;

    sget-object v4, Lbk/c;->g:Lbk/c;

    sget-object v5, Lbk/c;->h:Lbk/c;

    sget-object v6, Lbk/c;->i:Lbk/c;

    sget-object v7, Lbk/c;->j:Lbk/c;

    sget-object v8, Lbk/c;->k:Lbk/c;

    filled-new-array/range {v0 .. v8}, [Lbk/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbk/c;
    .locals 1

    const-class v0, Lbk/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbk/c;

    return-object p0
.end method

.method public static values()[Lbk/c;
    .locals 1

    sget-object v0, Lbk/c;->l:[Lbk/c;

    invoke-virtual {v0}, [Lbk/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbk/c;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbk/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lbk/c;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbk/c;->b:[Ljava/lang/String;

    return-object v0
.end method
