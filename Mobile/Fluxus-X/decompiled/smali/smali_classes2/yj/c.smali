.class public final enum Lyj/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyj/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lyj/c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
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
.field public static final enum a:Lyj/c;
    .annotation runtime Lmg/c;
        value = "square"
    .end annotation
.end field

.field public static final enum b:Lyj/c;
    .annotation runtime Lmg/c;
        value = "rectangle"
    .end annotation
.end field

.field public static final enum c:Lyj/c;
    .annotation runtime Lmg/c;
        value = "circle"
    .end annotation
.end field

.field public static final enum d:Lyj/c;
    .annotation runtime Lmg/c;
        value = "none"
    .end annotation
.end field

.field public static final synthetic e:[Lyj/c;

.field public static final synthetic f:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyj/c;

    const-string v1, "SQUARE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyj/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyj/c;->a:Lyj/c;

    new-instance v0, Lyj/c;

    const-string v1, "RECTANGLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyj/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyj/c;->b:Lyj/c;

    new-instance v0, Lyj/c;

    const-string v1, "CIRCLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lyj/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyj/c;->c:Lyj/c;

    new-instance v0, Lyj/c;

    const-string v1, "NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lyj/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyj/c;->d:Lyj/c;

    invoke-static {}, Lyj/c;->a()[Lyj/c;

    move-result-object v0

    sput-object v0, Lyj/c;->e:[Lyj/c;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lyj/c;->f:Lhu/a;

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

.method public static final synthetic a()[Lyj/c;
    .locals 4

    sget-object v0, Lyj/c;->a:Lyj/c;

    sget-object v1, Lyj/c;->b:Lyj/c;

    sget-object v2, Lyj/c;->c:Lyj/c;

    sget-object v3, Lyj/c;->d:Lyj/c;

    filled-new-array {v0, v1, v2, v3}, [Lyj/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyj/c;
    .locals 1

    const-class v0, Lyj/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyj/c;

    return-object p0
.end method

.method public static values()[Lyj/c;
    .locals 1

    sget-object v0, Lyj/c;->e:[Lyj/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyj/c;

    return-object v0
.end method
