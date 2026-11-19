.class public final enum Lh1/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh1/c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lh1/c$a;

.field public static final enum b:Lh1/c$a;

.field public static final synthetic c:[Lh1/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh1/c$a;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh1/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh1/c$a;->a:Lh1/c$a;

    new-instance v0, Lh1/c$a;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh1/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh1/c$a;->b:Lh1/c$a;

    invoke-static {}, Lh1/c$a;->a()[Lh1/c$a;

    move-result-object v0

    sput-object v0, Lh1/c$a;->c:[Lh1/c$a;

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

.method public static synthetic a()[Lh1/c$a;
    .locals 2

    sget-object v0, Lh1/c$a;->a:Lh1/c$a;

    sget-object v1, Lh1/c$a;->b:Lh1/c$a;

    filled-new-array {v0, v1}, [Lh1/c$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh1/c$a;
    .locals 1

    const-class v0, Lh1/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh1/c$a;

    return-object p0
.end method

.method public static values()[Lh1/c$a;
    .locals 1

    sget-object v0, Lh1/c$a;->c:[Lh1/c$a;

    invoke-virtual {v0}, [Lh1/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh1/c$a;

    return-object v0
.end method
