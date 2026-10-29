.class public final enum Lnb/o8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lnb/o8;

.field public static final enum c:Lnb/o8;

.field public static final synthetic d:[Lnb/o8;


# instance fields
.field public final a:[Lnb/p8;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnb/o8;

    sget-object v1, Lnb/p8;->b:Lnb/p8;

    sget-object v2, Lnb/p8;->c:Lnb/p8;

    filled-new-array {v1, v2}, [Lnb/p8;

    move-result-object v1

    const-string v2, "STORAGE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lnb/o8;-><init>(Ljava/lang/String;I[Lnb/p8;)V

    sput-object v0, Lnb/o8;->b:Lnb/o8;

    new-instance v1, Lnb/o8;

    sget-object v2, Lnb/p8;->d:Lnb/p8;

    filled-new-array {v2}, [Lnb/p8;

    move-result-object v2

    const-string v3, "DMA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lnb/o8;-><init>(Ljava/lang/String;I[Lnb/p8;)V

    sput-object v1, Lnb/o8;->c:Lnb/o8;

    filled-new-array {v0, v1}, [Lnb/o8;

    move-result-object v0

    sput-object v0, Lnb/o8;->d:[Lnb/o8;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[Lnb/p8;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnb/o8;->a:[Lnb/p8;

    return-void
.end method

.method public static values()[Lnb/o8;
    .locals 1

    sget-object v0, Lnb/o8;->d:[Lnb/o8;

    invoke-virtual {v0}, [Lnb/o8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/o8;

    return-object v0
.end method


# virtual methods
.method public final a()[Lnb/p8;
    .locals 1

    iget-object v0, p0, Lnb/o8;->a:[Lnb/p8;

    return-object v0
.end method

.method public final synthetic b()[Lnb/p8;
    .locals 1

    iget-object v0, p0, Lnb/o8;->a:[Lnb/p8;

    return-object v0
.end method
