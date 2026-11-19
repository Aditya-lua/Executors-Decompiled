.class public final enum Lxm/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxm/a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lxm/a$a;

.field public static final enum b:Lxm/a$a;

.field public static final enum c:Lxm/a$a;

.field public static final synthetic d:[Lxm/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxm/a$a;

    const-string v1, "SPLASH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxm/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxm/a$a;->a:Lxm/a$a;

    new-instance v0, Lxm/a$a;

    const-string v1, "MAIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxm/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxm/a$a;->b:Lxm/a$a;

    new-instance v0, Lxm/a$a;

    const-string v1, "GAME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxm/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxm/a$a;->c:Lxm/a$a;

    invoke-static {}, Lxm/a$a;->a()[Lxm/a$a;

    move-result-object v0

    sput-object v0, Lxm/a$a;->d:[Lxm/a$a;

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

.method public static synthetic a()[Lxm/a$a;
    .locals 3

    sget-object v0, Lxm/a$a;->a:Lxm/a$a;

    sget-object v1, Lxm/a$a;->b:Lxm/a$a;

    sget-object v2, Lxm/a$a;->c:Lxm/a$a;

    filled-new-array {v0, v1, v2}, [Lxm/a$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxm/a$a;
    .locals 1

    const-class v0, Lxm/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxm/a$a;

    return-object p0
.end method

.method public static values()[Lxm/a$a;
    .locals 1

    sget-object v0, Lxm/a$a;->d:[Lxm/a$a;

    invoke-virtual {v0}, [Lxm/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxm/a$a;

    return-object v0
.end method
