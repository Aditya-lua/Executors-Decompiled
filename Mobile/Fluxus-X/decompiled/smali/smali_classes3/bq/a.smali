.class public final enum Lbq/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbq/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lbq/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "logger_release"
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
.field public static final enum a:Lbq/a;

.field public static final enum b:Lbq/a;

.field public static final enum c:Lbq/a;

.field public static final synthetic d:[Lbq/a;

.field public static final synthetic e:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbq/a;

    const-string v1, "Debug"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbq/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbq/a;->a:Lbq/a;

    new-instance v0, Lbq/a;

    const-string v1, "Warning"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbq/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbq/a;->b:Lbq/a;

    new-instance v0, Lbq/a;

    const-string v1, "Error"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbq/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbq/a;->c:Lbq/a;

    invoke-static {}, Lbq/a;->a()[Lbq/a;

    move-result-object v0

    sput-object v0, Lbq/a;->d:[Lbq/a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lbq/a;->e:Lhu/a;

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

.method public static final synthetic a()[Lbq/a;
    .locals 3

    sget-object v0, Lbq/a;->a:Lbq/a;

    sget-object v1, Lbq/a;->b:Lbq/a;

    sget-object v2, Lbq/a;->c:Lbq/a;

    filled-new-array {v0, v1, v2}, [Lbq/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbq/a;
    .locals 1

    const-class v0, Lbq/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbq/a;

    return-object p0
.end method

.method public static values()[Lbq/a;
    .locals 1

    sget-object v0, Lbq/a;->d:[Lbq/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbq/a;

    return-object v0
.end method
