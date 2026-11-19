.class public final enum Ldl/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldl/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldl/e$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ldl/e$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "robloxplatform_googleProdRelease"
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
.field public static final enum a:Ldl/e$b;

.field public static final enum b:Ldl/e$b;

.field public static final enum c:Ldl/e$b;

.field public static final enum d:Ldl/e$b;

.field public static final synthetic e:[Ldl/e$b;

.field public static final synthetic f:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldl/e$b;

    const-string v1, "NO_WEBVIEW_COOKIE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldl/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$b;->a:Ldl/e$b;

    new-instance v0, Ldl/e$b;

    const-string v1, "UNCHANGED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldl/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$b;->b:Ldl/e$b;

    new-instance v0, Ldl/e$b;

    const-string v1, "FILLED_EMPTY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldl/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$b;->c:Ldl/e$b;

    new-instance v0, Ldl/e$b;

    const-string v1, "REPLACED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ldl/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$b;->d:Ldl/e$b;

    invoke-static {}, Ldl/e$b;->a()[Ldl/e$b;

    move-result-object v0

    sput-object v0, Ldl/e$b;->e:[Ldl/e$b;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Ldl/e$b;->f:Lhu/a;

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

.method public static final synthetic a()[Ldl/e$b;
    .locals 4

    sget-object v0, Ldl/e$b;->a:Ldl/e$b;

    sget-object v1, Ldl/e$b;->b:Ldl/e$b;

    sget-object v2, Ldl/e$b;->c:Ldl/e$b;

    sget-object v3, Ldl/e$b;->d:Ldl/e$b;

    filled-new-array {v0, v1, v2, v3}, [Ldl/e$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldl/e$b;
    .locals 1

    const-class v0, Ldl/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldl/e$b;

    return-object p0
.end method

.method public static values()[Ldl/e$b;
    .locals 1

    sget-object v0, Ldl/e$b;->e:[Ldl/e$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldl/e$b;

    return-object v0
.end method
