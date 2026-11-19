.class public final enum Leh/d0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leh/d0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Leh/d0;",
        "",
        "",
        "collectionEnabled",
        "<init>",
        "(Ljava/lang/String;IZ)V",
        "a",
        "Z",
        "b",
        "()Z",
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
.field public static final enum b:Leh/d0;

.field public static final enum c:Leh/d0;

.field public static final enum d:Leh/d0;

.field public static final enum e:Leh/d0;

.field public static final enum f:Leh/d0;

.field public static final enum g:Leh/d0;

.field public static final enum h:Leh/d0;

.field public static final enum i:Leh/d0;

.field public static final synthetic j:[Leh/d0;

.field public static final synthetic k:Lhu/a;


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Leh/d0;

    const-string v1, "BLOCK_TRACKING_OPT_OUT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->b:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "BLOCK_ATTRIBUTION_BLOCKED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->c:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "ALLOW"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->d:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "NOT_REQUIRED"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v3}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->e:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "BLOCK_SHARING_FILTER"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->f:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "BLOCK_DMA_WITHDRAWAL"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->g:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "STAY_OFF_NO_DECISION"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->h:Leh/d0;

    new-instance v0, Leh/d0;

    const-string v1, "STAY_OFF_STALE_CACHE"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Leh/d0;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Leh/d0;->i:Leh/d0;

    invoke-static {}, Leh/d0;->a()[Leh/d0;

    move-result-object v0

    sput-object v0, Leh/d0;->j:[Leh/d0;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Leh/d0;->k:Lhu/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Leh/d0;->a:Z

    return-void
.end method

.method public static final synthetic a()[Leh/d0;
    .locals 8

    sget-object v0, Leh/d0;->b:Leh/d0;

    sget-object v1, Leh/d0;->c:Leh/d0;

    sget-object v2, Leh/d0;->d:Leh/d0;

    sget-object v3, Leh/d0;->e:Leh/d0;

    sget-object v4, Leh/d0;->f:Leh/d0;

    sget-object v5, Leh/d0;->g:Leh/d0;

    sget-object v6, Leh/d0;->h:Leh/d0;

    sget-object v7, Leh/d0;->i:Leh/d0;

    filled-new-array/range {v0 .. v7}, [Leh/d0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leh/d0;
    .locals 1

    const-class v0, Leh/d0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leh/d0;

    return-object p0
.end method

.method public static values()[Leh/d0;
    .locals 1

    sget-object v0, Leh/d0;->j:[Leh/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leh/d0;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Leh/d0;->a:Z

    return v0
.end method
