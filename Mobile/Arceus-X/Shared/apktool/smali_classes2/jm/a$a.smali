.class public final enum Ljm/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljm/a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ljm/a$a;

.field public static final enum b:Ljm/a$a;

.field public static final enum c:Ljm/a$a;

.field public static final synthetic d:[Ljm/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljm/a$a;

    const-string v1, "SPLASH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljm/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljm/a$a;->a:Ljm/a$a;

    new-instance v0, Ljm/a$a;

    const-string v1, "MAIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljm/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljm/a$a;->b:Ljm/a$a;

    new-instance v0, Ljm/a$a;

    const-string v1, "GAME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljm/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljm/a$a;->c:Ljm/a$a;

    invoke-static {}, Ljm/a$a;->a()[Ljm/a$a;

    move-result-object v0

    sput-object v0, Ljm/a$a;->d:[Ljm/a$a;

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

.method public static synthetic a()[Ljm/a$a;
    .locals 3

    sget-object v0, Ljm/a$a;->a:Ljm/a$a;

    sget-object v1, Ljm/a$a;->b:Ljm/a$a;

    sget-object v2, Ljm/a$a;->c:Ljm/a$a;

    filled-new-array {v0, v1, v2}, [Ljm/a$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljm/a$a;
    .locals 1

    const-class v0, Ljm/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljm/a$a;

    return-object p0
.end method

.method public static values()[Ljm/a$a;
    .locals 1

    sget-object v0, Ljm/a$a;->d:[Ljm/a$a;

    invoke-virtual {v0}, [Ljm/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljm/a$a;

    return-object v0
.end method
