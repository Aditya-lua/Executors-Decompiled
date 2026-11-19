.class public final enum Ldl/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldl/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldl/e$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Ldl/e$c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
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
.field public static final enum a:Ldl/e$c;

.field public static final enum b:Ldl/e$c;

.field public static final enum c:Ldl/e$c;

.field public static final enum d:Ldl/e$c;

.field public static final enum e:Ldl/e$c;

.field public static final enum f:Ldl/e$c;

.field public static final synthetic g:[Ldl/e$c;

.field public static final synthetic h:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldl/e$c;

    const-string v1, "MIGRATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldl/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$c;->a:Ldl/e$c;

    new-instance v0, Ldl/e$c;

    const-string v1, "OKHTTP_RESPONSE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldl/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$c;->b:Ldl/e$c;

    new-instance v0, Ldl/e$c;

    const-string v1, "WEBVIEW_PULL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldl/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$c;->c:Ldl/e$c;

    new-instance v0, Ldl/e$c;

    const-string v1, "ENGINE_PUSH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ldl/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$c;->d:Ldl/e$c;

    new-instance v0, Ldl/e$c;

    const-string v1, "LOGOUT_CLEAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ldl/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$c;->e:Ldl/e$c;

    new-instance v0, Ldl/e$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ldl/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldl/e$c;->f:Ldl/e$c;

    invoke-static {}, Ldl/e$c;->a()[Ldl/e$c;

    move-result-object v0

    sput-object v0, Ldl/e$c;->g:[Ldl/e$c;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Ldl/e$c;->h:Lhu/a;

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

.method public static final synthetic a()[Ldl/e$c;
    .locals 6

    sget-object v0, Ldl/e$c;->a:Ldl/e$c;

    sget-object v1, Ldl/e$c;->b:Ldl/e$c;

    sget-object v2, Ldl/e$c;->c:Ldl/e$c;

    sget-object v3, Ldl/e$c;->d:Ldl/e$c;

    sget-object v4, Ldl/e$c;->e:Ldl/e$c;

    sget-object v5, Ldl/e$c;->f:Ldl/e$c;

    filled-new-array/range {v0 .. v5}, [Ldl/e$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldl/e$c;
    .locals 1

    const-class v0, Ldl/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldl/e$c;

    return-object p0
.end method

.method public static values()[Ldl/e$c;
    .locals 1

    sget-object v0, Ldl/e$c;->g:[Ldl/e$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldl/e$c;

    return-object v0
.end method
