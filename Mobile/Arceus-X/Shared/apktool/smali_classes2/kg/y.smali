.class public abstract enum Lkg/y;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkg/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkg/y;",
        ">;",
        "Lkg/z;"
    }
.end annotation


# static fields
.field public static final enum a:Lkg/y;

.field public static final enum b:Lkg/y;

.field public static final enum c:Lkg/y;

.field public static final enum d:Lkg/y;

.field public static final synthetic e:[Lkg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkg/y$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkg/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/y;->a:Lkg/y;

    new-instance v0, Lkg/y$b;

    const-string v1, "LAZILY_PARSED_NUMBER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkg/y$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/y;->b:Lkg/y;

    new-instance v0, Lkg/y$c;

    const-string v1, "LONG_OR_DOUBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkg/y$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/y;->c:Lkg/y;

    new-instance v0, Lkg/y$d;

    const-string v1, "BIG_DECIMAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkg/y$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/y;->d:Lkg/y;

    invoke-static {}, Lkg/y;->b()[Lkg/y;

    move-result-object v0

    sput-object v0, Lkg/y;->e:[Lkg/y;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkg/y$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lkg/y;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b()[Lkg/y;
    .locals 4

    sget-object v0, Lkg/y;->a:Lkg/y;

    sget-object v1, Lkg/y;->b:Lkg/y;

    sget-object v2, Lkg/y;->c:Lkg/y;

    sget-object v3, Lkg/y;->d:Lkg/y;

    filled-new-array {v0, v1, v2, v3}, [Lkg/y;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkg/y;
    .locals 1

    const-class v0, Lkg/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkg/y;

    return-object p0
.end method

.method public static values()[Lkg/y;
    .locals 1

    sget-object v0, Lkg/y;->e:[Lkg/y;

    invoke-virtual {v0}, [Lkg/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkg/y;

    return-object v0
.end method
