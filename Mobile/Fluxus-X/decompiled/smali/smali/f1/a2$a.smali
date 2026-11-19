.class public final enum Lf1/a2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/a2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf1/a2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf1/a2$a;

.field public static final enum b:Lf1/a2$a;

.field public static final enum c:Lf1/a2$a;

.field public static final synthetic d:[Lf1/a2$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf1/a2$a;

    const-string v1, "ACTIVE_STREAMING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf1/a2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/a2$a;->a:Lf1/a2$a;

    new-instance v0, Lf1/a2$a;

    const-string v1, "ACTIVE_NON_STREAMING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf1/a2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/a2$a;->b:Lf1/a2$a;

    new-instance v0, Lf1/a2$a;

    const-string v1, "INACTIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf1/a2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/a2$a;->c:Lf1/a2$a;

    invoke-static {}, Lf1/a2$a;->a()[Lf1/a2$a;

    move-result-object v0

    sput-object v0, Lf1/a2$a;->d:[Lf1/a2$a;

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

.method public static synthetic a()[Lf1/a2$a;
    .locals 3

    sget-object v0, Lf1/a2$a;->a:Lf1/a2$a;

    sget-object v1, Lf1/a2$a;->b:Lf1/a2$a;

    sget-object v2, Lf1/a2$a;->c:Lf1/a2$a;

    filled-new-array {v0, v1, v2}, [Lf1/a2$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/a2$a;
    .locals 1

    const-class v0, Lf1/a2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/a2$a;

    return-object p0
.end method

.method public static values()[Lf1/a2$a;
    .locals 1

    sget-object v0, Lf1/a2$a;->d:[Lf1/a2$a;

    invoke-virtual {v0}, [Lf1/a2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/a2$a;

    return-object v0
.end method
