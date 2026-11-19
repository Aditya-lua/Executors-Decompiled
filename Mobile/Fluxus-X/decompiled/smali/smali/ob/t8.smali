.class public final enum Lob/t8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lob/t8;

.field public static final enum c:Lob/t8;

.field public static final synthetic d:[Lob/t8;


# instance fields
.field public final a:[Lob/u8;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lob/t8;

    sget-object v1, Lob/u8;->b:Lob/u8;

    sget-object v2, Lob/u8;->c:Lob/u8;

    filled-new-array {v1, v2}, [Lob/u8;

    move-result-object v1

    const-string v2, "STORAGE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lob/t8;-><init>(Ljava/lang/String;I[Lob/u8;)V

    sput-object v0, Lob/t8;->b:Lob/t8;

    new-instance v1, Lob/t8;

    sget-object v2, Lob/u8;->d:Lob/u8;

    filled-new-array {v2}, [Lob/u8;

    move-result-object v2

    const-string v3, "DMA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lob/t8;-><init>(Ljava/lang/String;I[Lob/u8;)V

    sput-object v1, Lob/t8;->c:Lob/t8;

    filled-new-array {v0, v1}, [Lob/t8;

    move-result-object v0

    sput-object v0, Lob/t8;->d:[Lob/t8;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[Lob/u8;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lob/t8;->a:[Lob/u8;

    return-void
.end method

.method public static values()[Lob/t8;
    .locals 1

    sget-object v0, Lob/t8;->d:[Lob/t8;

    invoke-virtual {v0}, [Lob/t8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lob/t8;

    return-object v0
.end method


# virtual methods
.method public final a()[Lob/u8;
    .locals 1

    iget-object v0, p0, Lob/t8;->a:[Lob/u8;

    return-object v0
.end method

.method public final synthetic b()[Lob/u8;
    .locals 1

    iget-object v0, p0, Lob/t8;->a:[Lob/u8;

    return-object v0
.end method
