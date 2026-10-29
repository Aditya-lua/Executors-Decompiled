.class public final enum Lfh/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfh/i$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lfh/i$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
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
.field public static final enum a:Lfh/i$a;

.field public static final enum b:Lfh/i$a;

.field public static final enum c:Lfh/i$a;

.field public static final synthetic d:[Lfh/i$a;

.field public static final synthetic e:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfh/i$a;

    const-string v1, "Optional"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfh/i$a;->a:Lfh/i$a;

    new-instance v0, Lfh/i$a;

    const-string v1, "Required"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfh/i$a;->b:Lfh/i$a;

    new-instance v0, Lfh/i$a;

    const-string v1, "NewApp"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfh/i$a;->c:Lfh/i$a;

    invoke-static {}, Lfh/i$a;->a()[Lfh/i$a;

    move-result-object v0

    sput-object v0, Lfh/i$a;->d:[Lfh/i$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lfh/i$a;->e:Lqt/a;

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

.method public static final synthetic a()[Lfh/i$a;
    .locals 3

    sget-object v0, Lfh/i$a;->a:Lfh/i$a;

    sget-object v1, Lfh/i$a;->b:Lfh/i$a;

    sget-object v2, Lfh/i$a;->c:Lfh/i$a;

    filled-new-array {v0, v1, v2}, [Lfh/i$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfh/i$a;
    .locals 1

    const-class v0, Lfh/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfh/i$a;

    return-object p0
.end method

.method public static values()[Lfh/i$a;
    .locals 1

    sget-object v0, Lfh/i$a;->d:[Lfh/i$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfh/i$a;

    return-object v0
.end method
