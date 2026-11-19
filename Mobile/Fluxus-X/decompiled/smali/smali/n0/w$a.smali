.class public final enum Ln0/w$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/w$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/w$a;

.field public static final synthetic b:[Ln0/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/w$a;

    const-string v1, "ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/w$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w$a;->a:Ln0/w$a;

    invoke-static {}, Ln0/w$a;->a()[Ln0/w$a;

    move-result-object v0

    sput-object v0, Ln0/w$a;->b:[Ln0/w$a;

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

.method public static synthetic a()[Ln0/w$a;
    .locals 1

    sget-object v0, Ln0/w$a;->a:Ln0/w$a;

    filled-new-array {v0}, [Ln0/w$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/w$a;
    .locals 1

    const-class v0, Ln0/w$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/w$a;

    return-object p0
.end method

.method public static values()[Ln0/w$a;
    .locals 1

    sget-object v0, Ln0/w$a;->b:[Ln0/w$a;

    invoke-virtual {v0}, [Ln0/w$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/w$a;

    return-object v0
.end method
