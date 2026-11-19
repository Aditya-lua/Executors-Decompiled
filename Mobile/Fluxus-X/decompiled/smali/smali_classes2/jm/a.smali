.class public final enum Ljm/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljm/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljm/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
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
.field public static final enum a:Ljm/a;

.field public static final enum b:Ljm/a;

.field public static final synthetic c:[Ljm/a;

.field public static final synthetic d:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljm/a;

    const-string v1, "Completion"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljm/a;->a:Ljm/a;

    new-instance v0, Ljm/a;

    const-string v1, "Variable"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljm/a;->b:Ljm/a;

    invoke-static {}, Ljm/a;->a()[Ljm/a;

    move-result-object v0

    sput-object v0, Ljm/a;->c:[Ljm/a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Ljm/a;->d:Lhu/a;

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

.method public static final synthetic a()[Ljm/a;
    .locals 2

    sget-object v0, Ljm/a;->a:Ljm/a;

    sget-object v1, Ljm/a;->b:Ljm/a;

    filled-new-array {v0, v1}, [Ljm/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljm/a;
    .locals 1

    const-class v0, Ljm/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljm/a;

    return-object p0
.end method

.method public static values()[Ljm/a;
    .locals 1

    sget-object v0, Ljm/a;->c:[Ljm/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljm/a;

    return-object v0
.end method
