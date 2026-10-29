.class public final enum Lke/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lke/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lke/g;

.field public static final synthetic b:[Lke/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lke/g;

    const-string v1, "APPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lke/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/g;->a:Lke/g;

    invoke-static {}, Lke/g;->a()[Lke/g;

    move-result-object v0

    sput-object v0, Lke/g;->b:[Lke/g;

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

.method public static synthetic a()[Lke/g;
    .locals 1

    sget-object v0, Lke/g;->a:Lke/g;

    filled-new-array {v0}, [Lke/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lke/g;
    .locals 1

    const-class v0, Lke/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lke/g;

    return-object p0
.end method

.method public static values()[Lke/g;
    .locals 1

    sget-object v0, Lke/g;->b:[Lke/g;

    invoke-virtual {v0}, [Lke/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lke/g;

    return-object v0
.end method
