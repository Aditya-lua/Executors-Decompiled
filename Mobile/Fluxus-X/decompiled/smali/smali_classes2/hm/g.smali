.class public final enum Lhm/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhm/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lhm/g;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "universalapp_googleProdRelease"
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
.field public static final enum a:Lhm/g;

.field public static final enum b:Lhm/g;

.field public static final enum c:Lhm/g;

.field public static final enum d:Lhm/g;

.field public static final enum e:Lhm/g;

.field public static final enum f:Lhm/g;

.field public static final enum g:Lhm/g;

.field public static final synthetic h:[Lhm/g;

.field public static final synthetic i:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhm/g;

    const-string v1, "NOT_INSTALLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->a:Lhm/g;

    new-instance v0, Lhm/g;

    const-string v1, "NOT_INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->b:Lhm/g;

    new-instance v0, Lhm/g;

    const-string v1, "GENERATE_SIGNAL_FAILED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->c:Lhm/g;

    new-instance v0, Lhm/g;

    const-string v1, "SERVE_AD_FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->d:Lhm/g;

    new-instance v0, Lhm/g;

    const-string v1, "NO_FILL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->e:Lhm/g;

    new-instance v0, Lhm/g;

    const-string v1, "LOAD_FAILED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->f:Lhm/g;

    new-instance v0, Lhm/g;

    const-string v1, "TIMED_OUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lhm/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhm/g;->g:Lhm/g;

    invoke-static {}, Lhm/g;->a()[Lhm/g;

    move-result-object v0

    sput-object v0, Lhm/g;->h:[Lhm/g;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lhm/g;->i:Lhu/a;

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

.method public static final synthetic a()[Lhm/g;
    .locals 7

    sget-object v0, Lhm/g;->a:Lhm/g;

    sget-object v1, Lhm/g;->b:Lhm/g;

    sget-object v2, Lhm/g;->c:Lhm/g;

    sget-object v3, Lhm/g;->d:Lhm/g;

    sget-object v4, Lhm/g;->e:Lhm/g;

    sget-object v5, Lhm/g;->f:Lhm/g;

    sget-object v6, Lhm/g;->g:Lhm/g;

    filled-new-array/range {v0 .. v6}, [Lhm/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhm/g;
    .locals 1

    const-class v0, Lhm/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhm/g;

    return-object p0
.end method

.method public static values()[Lhm/g;
    .locals 1

    sget-object v0, Lhm/g;->h:[Lhm/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhm/g;

    return-object v0
.end method
