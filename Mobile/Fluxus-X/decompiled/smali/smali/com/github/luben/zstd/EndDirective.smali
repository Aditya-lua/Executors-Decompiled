.class public final enum Lcom/github/luben/zstd/EndDirective;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/github/luben/zstd/EndDirective;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/github/luben/zstd/EndDirective;

.field public static final enum CONTINUE:Lcom/github/luben/zstd/EndDirective;

.field public static final enum END:Lcom/github/luben/zstd/EndDirective;

.field public static final enum FLUSH:Lcom/github/luben/zstd/EndDirective;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/github/luben/zstd/EndDirective;

    const-string v1, "CONTINUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/github/luben/zstd/EndDirective;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/github/luben/zstd/EndDirective;->CONTINUE:Lcom/github/luben/zstd/EndDirective;

    new-instance v1, Lcom/github/luben/zstd/EndDirective;

    const-string v2, "FLUSH"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/github/luben/zstd/EndDirective;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/github/luben/zstd/EndDirective;->FLUSH:Lcom/github/luben/zstd/EndDirective;

    new-instance v2, Lcom/github/luben/zstd/EndDirective;

    const-string v3, "END"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/github/luben/zstd/EndDirective;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/github/luben/zstd/EndDirective;->END:Lcom/github/luben/zstd/EndDirective;

    filled-new-array {v0, v1, v2}, [Lcom/github/luben/zstd/EndDirective;

    move-result-object v0

    sput-object v0, Lcom/github/luben/zstd/EndDirective;->$VALUES:[Lcom/github/luben/zstd/EndDirective;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/github/luben/zstd/EndDirective;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/luben/zstd/EndDirective;
    .locals 1

    const-class v0, Lcom/github/luben/zstd/EndDirective;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/github/luben/zstd/EndDirective;

    return-object p0
.end method

.method public static values()[Lcom/github/luben/zstd/EndDirective;
    .locals 1

    sget-object v0, Lcom/github/luben/zstd/EndDirective;->$VALUES:[Lcom/github/luben/zstd/EndDirective;

    invoke-virtual {v0}, [Lcom/github/luben/zstd/EndDirective;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/github/luben/zstd/EndDirective;

    return-object v0
.end method


# virtual methods
.method public value()I
    .locals 1

    iget v0, p0, Lcom/github/luben/zstd/EndDirective;->value:I

    return v0
.end method
