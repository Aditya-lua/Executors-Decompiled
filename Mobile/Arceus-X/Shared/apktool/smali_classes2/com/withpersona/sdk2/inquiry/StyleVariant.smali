.class public final enum Lcom/withpersona/sdk2/inquiry/StyleVariant;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/StyleVariant$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/StyleVariant;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/StyleVariant;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "LIGHT",
        "DARK",
        "Companion",
        "inquiry-dynamic-feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lqt/a;

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/StyleVariant;

.field public static final Companion:Lcom/withpersona/sdk2/inquiry/StyleVariant$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum DARK:Lcom/withpersona/sdk2/inquiry/StyleVariant;

.field public static final enum LIGHT:Lcom/withpersona/sdk2/inquiry/StyleVariant;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/StyleVariant;
    .locals 2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->LIGHT:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/StyleVariant;->DARK:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    filled-new-array {v0, v1}, [Lcom/withpersona/sdk2/inquiry/StyleVariant;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;

    const/4 v1, 0x0

    const-string v2, "light"

    const-string v3, "LIGHT"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/StyleVariant;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->LIGHT:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;

    const/4 v1, 0x1

    const-string v2, "dark"

    const-string v3, "DARK"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/StyleVariant;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->DARK:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/StyleVariant;->$values()[Lcom/withpersona/sdk2/inquiry/StyleVariant;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->$VALUES:[Lcom/withpersona/sdk2/inquiry/StyleVariant;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->$ENTRIES:Lqt/a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/StyleVariant$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/StyleVariant$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->Companion:Lcom/withpersona/sdk2/inquiry/StyleVariant$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/withpersona/sdk2/inquiry/StyleVariant;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/StyleVariant;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/StyleVariant;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/StyleVariant;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->$VALUES:[Lcom/withpersona/sdk2/inquiry/StyleVariant;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/StyleVariant;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/StyleVariant;->value:Ljava/lang/String;

    return-object v0
.end method
