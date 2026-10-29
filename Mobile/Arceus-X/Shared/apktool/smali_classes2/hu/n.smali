.class public final enum Lhu/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhu/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lhu/n;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "kotlin-stdlib"
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
.field public static final enum a:Lhu/n;

.field public static final enum b:Lhu/n;

.field public static final enum c:Lhu/n;

.field public static final synthetic d:[Lhu/n;

.field public static final synthetic e:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhu/n;

    const-string v1, "INVARIANT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhu/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhu/n;->a:Lhu/n;

    new-instance v0, Lhu/n;

    const-string v1, "IN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhu/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhu/n;->b:Lhu/n;

    new-instance v0, Lhu/n;

    const-string v1, "OUT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhu/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhu/n;->c:Lhu/n;

    invoke-static {}, Lhu/n;->a()[Lhu/n;

    move-result-object v0

    sput-object v0, Lhu/n;->d:[Lhu/n;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lhu/n;->e:Lqt/a;

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

.method public static final synthetic a()[Lhu/n;
    .locals 3

    sget-object v0, Lhu/n;->a:Lhu/n;

    sget-object v1, Lhu/n;->b:Lhu/n;

    sget-object v2, Lhu/n;->c:Lhu/n;

    filled-new-array {v0, v1, v2}, [Lhu/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhu/n;
    .locals 1

    const-class v0, Lhu/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhu/n;

    return-object p0
.end method

.method public static values()[Lhu/n;
    .locals 1

    sget-object v0, Lhu/n;->d:[Lhu/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhu/n;

    return-object v0
.end method
