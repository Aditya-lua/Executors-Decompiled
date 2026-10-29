.class public final enum Ltq/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltq/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ltq/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "shared_release"
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
.field public static final enum a:Ltq/b;

.field public static final enum b:Ltq/b;

.field public static final synthetic c:[Ltq/b;

.field public static final synthetic d:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltq/b;

    const-string v1, "ROUGH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltq/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltq/b;->a:Ltq/b;

    new-instance v0, Ltq/b;

    const-string v1, "PRECISE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltq/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltq/b;->b:Ltq/b;

    invoke-static {}, Ltq/b;->a()[Ltq/b;

    move-result-object v0

    sput-object v0, Ltq/b;->c:[Ltq/b;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ltq/b;->d:Lqt/a;

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

.method public static final synthetic a()[Ltq/b;
    .locals 2

    sget-object v0, Ltq/b;->a:Ltq/b;

    sget-object v1, Ltq/b;->b:Ltq/b;

    filled-new-array {v0, v1}, [Ltq/b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltq/b;
    .locals 1

    const-class v0, Ltq/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltq/b;

    return-object p0
.end method

.method public static values()[Ltq/b;
    .locals 1

    sget-object v0, Ltq/b;->c:[Ltq/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltq/b;

    return-object v0
.end method
