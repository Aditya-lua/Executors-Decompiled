.class public final enum Lme/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lme/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lme/g;

.field public static final synthetic b:[Lme/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lme/g;

    const-string v1, "APPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lme/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/g;->a:Lme/g;

    invoke-static {}, Lme/g;->a()[Lme/g;

    move-result-object v0

    sput-object v0, Lme/g;->b:[Lme/g;

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

.method public static synthetic a()[Lme/g;
    .locals 1

    sget-object v0, Lme/g;->a:Lme/g;

    filled-new-array {v0}, [Lme/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lme/g;
    .locals 1

    const-class v0, Lme/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lme/g;

    return-object p0
.end method

.method public static values()[Lme/g;
    .locals 1

    sget-object v0, Lme/g;->b:[Lme/g;

    invoke-virtual {v0}, [Lme/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lme/g;

    return-object v0
.end method
