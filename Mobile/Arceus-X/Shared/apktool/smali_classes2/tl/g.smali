.class public final enum Ltl/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltl/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ltl/g;",
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
.field public static final enum a:Ltl/g;

.field public static final enum b:Ltl/g;

.field public static final enum c:Ltl/g;

.field public static final enum d:Ltl/g;

.field public static final enum e:Ltl/g;

.field public static final enum f:Ltl/g;

.field public static final enum g:Ltl/g;

.field public static final synthetic h:[Ltl/g;

.field public static final synthetic i:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltl/g;

    const-string v1, "NOT_INSTALLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->a:Ltl/g;

    new-instance v0, Ltl/g;

    const-string v1, "NOT_INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->b:Ltl/g;

    new-instance v0, Ltl/g;

    const-string v1, "GENERATE_SIGNAL_FAILED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->c:Ltl/g;

    new-instance v0, Ltl/g;

    const-string v1, "SERVE_AD_FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->d:Ltl/g;

    new-instance v0, Ltl/g;

    const-string v1, "NO_FILL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->e:Ltl/g;

    new-instance v0, Ltl/g;

    const-string v1, "LOAD_FAILED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->f:Ltl/g;

    new-instance v0, Ltl/g;

    const-string v1, "TIMED_OUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ltl/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltl/g;->g:Ltl/g;

    invoke-static {}, Ltl/g;->a()[Ltl/g;

    move-result-object v0

    sput-object v0, Ltl/g;->h:[Ltl/g;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ltl/g;->i:Lqt/a;

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

.method public static final synthetic a()[Ltl/g;
    .locals 7

    sget-object v0, Ltl/g;->a:Ltl/g;

    sget-object v1, Ltl/g;->b:Ltl/g;

    sget-object v2, Ltl/g;->c:Ltl/g;

    sget-object v3, Ltl/g;->d:Ltl/g;

    sget-object v4, Ltl/g;->e:Ltl/g;

    sget-object v5, Ltl/g;->f:Ltl/g;

    sget-object v6, Ltl/g;->g:Ltl/g;

    filled-new-array/range {v0 .. v6}, [Ltl/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltl/g;
    .locals 1

    const-class v0, Ltl/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltl/g;

    return-object p0
.end method

.method public static values()[Ltl/g;
    .locals 1

    sget-object v0, Ltl/g;->h:[Ltl/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltl/g;

    return-object v0
.end method
