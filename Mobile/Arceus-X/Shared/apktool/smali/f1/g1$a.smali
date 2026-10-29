.class public final enum Lf1/g1$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf1/g1$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf1/g1$a;

.field public static final enum b:Lf1/g1$a;

.field public static final synthetic c:[Lf1/g1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf1/g1$a;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf1/g1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/g1$a;->a:Lf1/g1$a;

    new-instance v0, Lf1/g1$a;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf1/g1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/g1$a;->b:Lf1/g1$a;

    invoke-static {}, Lf1/g1$a;->a()[Lf1/g1$a;

    move-result-object v0

    sput-object v0, Lf1/g1$a;->c:[Lf1/g1$a;

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

.method public static synthetic a()[Lf1/g1$a;
    .locals 2

    sget-object v0, Lf1/g1$a;->a:Lf1/g1$a;

    sget-object v1, Lf1/g1$a;->b:Lf1/g1$a;

    filled-new-array {v0, v1}, [Lf1/g1$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/g1$a;
    .locals 1

    const-class v0, Lf1/g1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/g1$a;

    return-object p0
.end method

.method public static values()[Lf1/g1$a;
    .locals 1

    sget-object v0, Lf1/g1$a;->c:[Lf1/g1$a;

    invoke-virtual {v0}, [Lf1/g1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/g1$a;

    return-object v0
.end method
