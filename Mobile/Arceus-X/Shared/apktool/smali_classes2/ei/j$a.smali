.class public final enum Lei/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lei/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lei/j$a;

.field public static final enum b:Lei/j$a;

.field public static final synthetic c:[Lei/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lei/j$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lei/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/j$a;->a:Lei/j$a;

    new-instance v0, Lei/j$a;

    const-string v1, "POST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lei/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei/j$a;->b:Lei/j$a;

    invoke-static {}, Lei/j$a;->a()[Lei/j$a;

    move-result-object v0

    sput-object v0, Lei/j$a;->c:[Lei/j$a;

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

.method public static synthetic a()[Lei/j$a;
    .locals 2

    sget-object v0, Lei/j$a;->a:Lei/j$a;

    sget-object v1, Lei/j$a;->b:Lei/j$a;

    filled-new-array {v0, v1}, [Lei/j$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lei/j$a;
    .locals 1

    const-class v0, Lei/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lei/j$a;

    return-object p0
.end method

.method public static values()[Lei/j$a;
    .locals 1

    sget-object v0, Lei/j$a;->c:[Lei/j$a;

    invoke-virtual {v0}, [Lei/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lei/j$a;

    return-object v0
.end method
