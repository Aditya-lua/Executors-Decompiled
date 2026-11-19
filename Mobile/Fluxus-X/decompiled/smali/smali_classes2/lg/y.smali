.class public abstract enum Llg/y;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Llg/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/y;",
        ">;",
        "Llg/z;"
    }
.end annotation


# static fields
.field public static final enum a:Llg/y;

.field public static final enum b:Llg/y;

.field public static final enum c:Llg/y;

.field public static final enum d:Llg/y;

.field public static final synthetic e:[Llg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg/y$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/y;->a:Llg/y;

    new-instance v0, Llg/y$b;

    const-string v1, "LAZILY_PARSED_NUMBER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg/y$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/y;->b:Llg/y;

    new-instance v0, Llg/y$c;

    const-string v1, "LONG_OR_DOUBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llg/y$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/y;->c:Llg/y;

    new-instance v0, Llg/y$d;

    const-string v1, "BIG_DECIMAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llg/y$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/y;->d:Llg/y;

    invoke-static {}, Llg/y;->b()[Llg/y;

    move-result-object v0

    sput-object v0, Llg/y;->e:[Llg/y;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILlg/y$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Llg/y;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b()[Llg/y;
    .locals 4

    sget-object v0, Llg/y;->a:Llg/y;

    sget-object v1, Llg/y;->b:Llg/y;

    sget-object v2, Llg/y;->c:Llg/y;

    sget-object v3, Llg/y;->d:Llg/y;

    filled-new-array {v0, v1, v2, v3}, [Llg/y;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llg/y;
    .locals 1

    const-class v0, Llg/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/y;

    return-object p0
.end method

.method public static values()[Llg/y;
    .locals 1

    sget-object v0, Llg/y;->e:[Llg/y;

    invoke-virtual {v0}, [Llg/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/y;

    return-object v0
.end method
