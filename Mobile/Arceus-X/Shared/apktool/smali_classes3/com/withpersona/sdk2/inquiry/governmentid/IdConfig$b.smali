.class public final enum Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u0008j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;",
        "",
        "",
        "key",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "b",
        "d",
        "f",
        "g",
        "h",
        "government-id_release"
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
.field public static final b:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljt/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

.field public static final enum e:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

.field public static final enum f:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

.field public static final enum g:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

.field public static final enum h:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

.field public static final synthetic i:[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

.field public static final synthetic j:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    const/4 v1, 0x0

    const-string v2, "front"

    const-string v3, "Front"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    const/4 v1, 0x1

    const-string v2, "back"

    const-string v3, "Back"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->e:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    const/4 v1, 0x2

    const-string v2, "front_or_back"

    const-string v3, "FrontOrBack"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->f:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    const/4 v1, 0x3

    const-string v2, "barcode_pdf417"

    const-string v3, "BarcodePdf417"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->g:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    const/4 v1, 0x4

    const-string v2, "passport_signature"

    const-string v3, "PassportSignature"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->h:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->b()[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->i:[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->j:Lqt/a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->b:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b$a;

    new-instance v0, Lio/i2;

    invoke-direct {v0}, Lio/i2;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->c:Ljt/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;
    .locals 5

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->e:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->f:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->g:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->h:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c()Ljt/h;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->c:Ljt/h;

    return-object v0
.end method

.method public static d()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->j:Lqt/a;

    return-object v0
.end method

.method public static final h()Ljava/util/Map;
    .locals 6

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->values()[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lkotlin/collections/j0;->f(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lkotlin/ranges/d;->c(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-object v5, v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->a:Ljava/lang/String;

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->i:[Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->a:Ljava/lang/String;

    return-object v0
.end method
