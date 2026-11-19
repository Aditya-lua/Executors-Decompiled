.class public final enum Lg0/w2$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/w2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg0/w2$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg0/w2$b;

.field public static final enum b:Lg0/w2$b;

.field public static final synthetic c:[Lg0/w2$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg0/w2$b;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg0/w2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w2$b;->a:Lg0/w2$b;

    new-instance v0, Lg0/w2$b;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg0/w2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg0/w2$b;->b:Lg0/w2$b;

    invoke-static {}, Lg0/w2$b;->a()[Lg0/w2$b;

    move-result-object v0

    sput-object v0, Lg0/w2$b;->c:[Lg0/w2$b;

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

.method public static synthetic a()[Lg0/w2$b;
    .locals 2

    sget-object v0, Lg0/w2$b;->a:Lg0/w2$b;

    sget-object v1, Lg0/w2$b;->b:Lg0/w2$b;

    filled-new-array {v0, v1}, [Lg0/w2$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg0/w2$b;
    .locals 1

    const-class v0, Lg0/w2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg0/w2$b;

    return-object p0
.end method

.method public static values()[Lg0/w2$b;
    .locals 1

    sget-object v0, Lg0/w2$b;->c:[Lg0/w2$b;

    invoke-virtual {v0}, [Lg0/w2$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg0/w2$b;

    return-object v0
.end method
