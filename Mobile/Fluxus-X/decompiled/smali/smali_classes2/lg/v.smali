.class public abstract enum Llg/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Llg/v;

.field public static final enum b:Llg/v;

.field public static final synthetic c:[Llg/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg/v$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg/v$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/v;->a:Llg/v;

    new-instance v0, Llg/v$b;

    const-string v1, "STRING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg/v$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/v;->b:Llg/v;

    invoke-static {}, Llg/v;->a()[Llg/v;

    move-result-object v0

    sput-object v0, Llg/v;->c:[Llg/v;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILlg/v$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Llg/v;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Llg/v;
    .locals 2

    sget-object v0, Llg/v;->a:Llg/v;

    sget-object v1, Llg/v;->b:Llg/v;

    filled-new-array {v0, v1}, [Llg/v;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llg/v;
    .locals 1

    const-class v0, Llg/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/v;

    return-object p0
.end method

.method public static values()[Llg/v;
    .locals 1

    sget-object v0, Llg/v;->c:[Llg/v;

    invoke-virtual {v0}, [Llg/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/v;

    return-object v0
.end method
