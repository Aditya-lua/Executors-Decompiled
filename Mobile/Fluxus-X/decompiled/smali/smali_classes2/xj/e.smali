.class public final enum Lxj/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxj/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lxj/e;

.field public static final enum b:Lxj/e;

.field public static final enum c:Lxj/e;

.field public static final synthetic d:[Lxj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxj/e;

    const-string v1, "none"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxj/e;->a:Lxj/e;

    new-instance v0, Lxj/e;

    const-string v1, "user"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxj/e;->b:Lxj/e;

    new-instance v0, Lxj/e;

    const-string v1, "game"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxj/e;->c:Lxj/e;

    invoke-static {}, Lxj/e;->a()[Lxj/e;

    move-result-object v0

    sput-object v0, Lxj/e;->d:[Lxj/e;

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

.method public static synthetic a()[Lxj/e;
    .locals 3

    sget-object v0, Lxj/e;->a:Lxj/e;

    sget-object v1, Lxj/e;->b:Lxj/e;

    sget-object v2, Lxj/e;->c:Lxj/e;

    filled-new-array {v0, v1, v2}, [Lxj/e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxj/e;
    .locals 1

    const-class v0, Lxj/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxj/e;

    return-object p0
.end method

.method public static values()[Lxj/e;
    .locals 1

    sget-object v0, Lxj/e;->d:[Lxj/e;

    invoke-virtual {v0}, [Lxj/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxj/e;

    return-object v0
.end method
