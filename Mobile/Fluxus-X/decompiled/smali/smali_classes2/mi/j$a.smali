.class public final enum Lmi/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmi/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lmi/j$a;

.field public static final enum b:Lmi/j$a;

.field public static final synthetic c:[Lmi/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmi/j$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmi/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmi/j$a;->a:Lmi/j$a;

    new-instance v0, Lmi/j$a;

    const-string v1, "POST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmi/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmi/j$a;->b:Lmi/j$a;

    invoke-static {}, Lmi/j$a;->a()[Lmi/j$a;

    move-result-object v0

    sput-object v0, Lmi/j$a;->c:[Lmi/j$a;

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

.method public static synthetic a()[Lmi/j$a;
    .locals 2

    sget-object v0, Lmi/j$a;->a:Lmi/j$a;

    sget-object v1, Lmi/j$a;->b:Lmi/j$a;

    filled-new-array {v0, v1}, [Lmi/j$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmi/j$a;
    .locals 1

    const-class v0, Lmi/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmi/j$a;

    return-object p0
.end method

.method public static values()[Lmi/j$a;
    .locals 1

    sget-object v0, Lmi/j$a;->c:[Lmi/j$a;

    invoke-virtual {v0}, [Lmi/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmi/j$a;

    return-object v0
.end method
