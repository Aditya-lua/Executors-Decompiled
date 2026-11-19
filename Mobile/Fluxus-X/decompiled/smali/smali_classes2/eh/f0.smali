.class public final enum Leh/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leh/f0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Leh/f0;",
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
.field public static final enum a:Leh/f0;

.field public static final enum b:Leh/f0;

.field public static final enum c:Leh/f0;

.field public static final enum d:Leh/f0;

.field public static final synthetic e:[Leh/f0;

.field public static final synthetic f:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leh/f0;

    const-string v1, "ANALYTICS_STORAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leh/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/f0;->a:Leh/f0;

    new-instance v0, Leh/f0;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leh/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/f0;->b:Leh/f0;

    new-instance v0, Leh/f0;

    const-string v1, "AD_USER_DATA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leh/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/f0;->c:Leh/f0;

    new-instance v0, Leh/f0;

    const-string v1, "AD_PERSONALIZATION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Leh/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/f0;->d:Leh/f0;

    invoke-static {}, Leh/f0;->a()[Leh/f0;

    move-result-object v0

    sput-object v0, Leh/f0;->e:[Leh/f0;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Leh/f0;->f:Lhu/a;

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

.method public static final synthetic a()[Leh/f0;
    .locals 4

    sget-object v0, Leh/f0;->a:Leh/f0;

    sget-object v1, Leh/f0;->b:Leh/f0;

    sget-object v2, Leh/f0;->c:Leh/f0;

    sget-object v3, Leh/f0;->d:Leh/f0;

    filled-new-array {v0, v1, v2, v3}, [Leh/f0;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lhu/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhu/a<",
            "Leh/f0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Leh/f0;->f:Lhu/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leh/f0;
    .locals 1

    const-class v0, Leh/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leh/f0;

    return-object p0
.end method

.method public static values()[Leh/f0;
    .locals 1

    sget-object v0, Leh/f0;->e:[Leh/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leh/f0;

    return-object v0
.end method
