.class public final enum Lvs/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvs/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvs/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lvs/b$a;

.field public static final enum b:Lvs/b$a;

.field public static final synthetic c:[Lvs/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvs/b$a;

    const-string v1, "BULLET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvs/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvs/b$a;->a:Lvs/b$a;

    new-instance v0, Lvs/b$a;

    const-string v1, "ORDERED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvs/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvs/b$a;->b:Lvs/b$a;

    invoke-static {}, Lvs/b$a;->a()[Lvs/b$a;

    move-result-object v0

    sput-object v0, Lvs/b$a;->c:[Lvs/b$a;

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

.method public static synthetic a()[Lvs/b$a;
    .locals 2

    sget-object v0, Lvs/b$a;->a:Lvs/b$a;

    sget-object v1, Lvs/b$a;->b:Lvs/b$a;

    filled-new-array {v0, v1}, [Lvs/b$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvs/b$a;
    .locals 1

    const-class v0, Lvs/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvs/b$a;

    return-object p0
.end method

.method public static values()[Lvs/b$a;
    .locals 1

    sget-object v0, Lvs/b$a;->c:[Lvs/b$a;

    invoke-virtual {v0}, [Lvs/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvs/b$a;

    return-object v0
.end method
