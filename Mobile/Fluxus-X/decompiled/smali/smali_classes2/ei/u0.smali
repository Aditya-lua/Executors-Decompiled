.class public final enum Lei/u0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lei/u0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lei/u0;

.field public static final enum b:Lei/u0;

.field public static final synthetic c:[Lei/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lei/u0;

    const-string v1, "EXPERIENCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lei/u0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/u0;->a:Lei/u0;

    new-instance v0, Lei/u0;

    const-string v1, "APP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lei/u0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/u0;->b:Lei/u0;

    invoke-static {}, Lei/u0;->a()[Lei/u0;

    move-result-object v0

    sput-object v0, Lei/u0;->c:[Lei/u0;

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

.method public static synthetic a()[Lei/u0;
    .locals 2

    sget-object v0, Lei/u0;->a:Lei/u0;

    sget-object v1, Lei/u0;->b:Lei/u0;

    filled-new-array {v0, v1}, [Lei/u0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lei/u0;
    .locals 1

    const-class v0, Lei/u0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lei/u0;

    return-object p0
.end method

.method public static values()[Lei/u0;
    .locals 1

    sget-object v0, Lei/u0;->c:[Lei/u0;

    invoke-virtual {v0}, [Lei/u0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lei/u0;

    return-object v0
.end method
