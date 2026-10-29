.class public final enum Ln0/n1$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/n1$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/n1$c;

.field public static final enum b:Ln0/n1$c;

.field public static final enum c:Ln0/n1$c;

.field public static final enum d:Ln0/n1$c;

.field public static final synthetic e:[Ln0/n1$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/n1$c;

    const-string v1, "ALWAYS_OVERRIDE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/n1$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/n1$c;->a:Ln0/n1$c;

    new-instance v0, Ln0/n1$c;

    const-string v1, "HIGH_PRIORITY_REQUIRED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/n1$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/n1$c;->b:Ln0/n1$c;

    new-instance v0, Ln0/n1$c;

    const-string v1, "REQUIRED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/n1$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/n1$c;->c:Ln0/n1$c;

    new-instance v0, Ln0/n1$c;

    const-string v1, "OPTIONAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/n1$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/n1$c;->d:Ln0/n1$c;

    invoke-static {}, Ln0/n1$c;->a()[Ln0/n1$c;

    move-result-object v0

    sput-object v0, Ln0/n1$c;->e:[Ln0/n1$c;

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

.method public static synthetic a()[Ln0/n1$c;
    .locals 4

    sget-object v0, Ln0/n1$c;->a:Ln0/n1$c;

    sget-object v1, Ln0/n1$c;->b:Ln0/n1$c;

    sget-object v2, Ln0/n1$c;->c:Ln0/n1$c;

    sget-object v3, Ln0/n1$c;->d:Ln0/n1$c;

    filled-new-array {v0, v1, v2, v3}, [Ln0/n1$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/n1$c;
    .locals 1

    const-class v0, Ln0/n1$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/n1$c;

    return-object p0
.end method

.method public static values()[Ln0/n1$c;
    .locals 1

    sget-object v0, Ln0/n1$c;->e:[Ln0/n1$c;

    invoke-virtual {v0}, [Ln0/n1$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/n1$c;

    return-object v0
.end method
