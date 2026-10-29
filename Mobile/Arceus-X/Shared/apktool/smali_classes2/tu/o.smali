.class public final enum Ltu/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltu/o;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltu/o;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
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
.field public static final enum a:Ltu/o;

.field public static final enum b:Ltu/o;

.field public static final enum c:Ltu/o;

.field public static final enum d:Ltu/o;

.field public static final synthetic e:[Ltu/o;

.field public static final synthetic f:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltu/o;

    const-string v1, "SUCCESSFUL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltu/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/o;->a:Ltu/o;

    new-instance v0, Ltu/o;

    const-string v1, "REREGISTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltu/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/o;->b:Ltu/o;

    new-instance v0, Ltu/o;

    const-string v1, "CANCELLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltu/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/o;->c:Ltu/o;

    new-instance v0, Ltu/o;

    const-string v1, "ALREADY_SELECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltu/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltu/o;->d:Ltu/o;

    invoke-static {}, Ltu/o;->a()[Ltu/o;

    move-result-object v0

    sput-object v0, Ltu/o;->e:[Ltu/o;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ltu/o;->f:Lqt/a;

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

.method public static final synthetic a()[Ltu/o;
    .locals 4

    sget-object v0, Ltu/o;->a:Ltu/o;

    sget-object v1, Ltu/o;->b:Ltu/o;

    sget-object v2, Ltu/o;->c:Ltu/o;

    sget-object v3, Ltu/o;->d:Ltu/o;

    filled-new-array {v0, v1, v2, v3}, [Ltu/o;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltu/o;
    .locals 1

    const-class v0, Ltu/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltu/o;

    return-object p0
.end method

.method public static values()[Ltu/o;
    .locals 1

    sget-object v0, Ltu/o;->e:[Ltu/o;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltu/o;

    return-object v0
.end method
