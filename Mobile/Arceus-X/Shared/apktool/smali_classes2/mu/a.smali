.class public final enum Lmu/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmu/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lmu/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lmu/a;

.field public static final enum b:Lmu/a;

.field public static final enum c:Lmu/a;

.field public static final synthetic d:[Lmu/a;

.field public static final synthetic e:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmu/a;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmu/a;->a:Lmu/a;

    new-instance v0, Lmu/a;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmu/a;->b:Lmu/a;

    new-instance v0, Lmu/a;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmu/a;->c:Lmu/a;

    invoke-static {}, Lmu/a;->a()[Lmu/a;

    move-result-object v0

    sput-object v0, Lmu/a;->d:[Lmu/a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lmu/a;->e:Lqt/a;

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

.method public static final synthetic a()[Lmu/a;
    .locals 3

    sget-object v0, Lmu/a;->a:Lmu/a;

    sget-object v1, Lmu/a;->b:Lmu/a;

    sget-object v2, Lmu/a;->c:Lmu/a;

    filled-new-array {v0, v1, v2}, [Lmu/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmu/a;
    .locals 1

    const-class v0, Lmu/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmu/a;

    return-object p0
.end method

.method public static values()[Lmu/a;
    .locals 1

    sget-object v0, Lmu/a;->d:[Lmu/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmu/a;

    return-object v0
.end method
