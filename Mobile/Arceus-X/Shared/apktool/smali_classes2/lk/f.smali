.class public final enum Llk/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llk/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llk/f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
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
.field public static final enum a:Llk/f;

.field public static final enum b:Llk/f;

.field public static final enum c:Llk/f;

.field public static final enum d:Llk/f;

.field public static final enum e:Llk/f;

.field public static final synthetic f:[Llk/f;

.field public static final synthetic g:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llk/f;

    const-string v1, "Update"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llk/f;->a:Llk/f;

    new-instance v0, Llk/f;

    const-string v1, "Remove"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llk/f;->b:Llk/f;

    new-instance v0, Llk/f;

    const-string v1, "SizeChange"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llk/f;->c:Llk/f;

    new-instance v0, Llk/f;

    const-string v1, "Enable"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llk/f;->d:Llk/f;

    new-instance v0, Llk/f;

    const-string v1, "Disable"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llk/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llk/f;->e:Llk/f;

    invoke-static {}, Llk/f;->a()[Llk/f;

    move-result-object v0

    sput-object v0, Llk/f;->f:[Llk/f;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Llk/f;->g:Lqt/a;

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

.method public static final synthetic a()[Llk/f;
    .locals 5

    sget-object v0, Llk/f;->a:Llk/f;

    sget-object v1, Llk/f;->b:Llk/f;

    sget-object v2, Llk/f;->c:Llk/f;

    sget-object v3, Llk/f;->d:Llk/f;

    sget-object v4, Llk/f;->e:Llk/f;

    filled-new-array {v0, v1, v2, v3, v4}, [Llk/f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llk/f;
    .locals 1

    const-class v0, Llk/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llk/f;

    return-object p0
.end method

.method public static values()[Llk/f;
    .locals 1

    sget-object v0, Llk/f;->f:[Llk/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llk/f;

    return-object v0
.end method
