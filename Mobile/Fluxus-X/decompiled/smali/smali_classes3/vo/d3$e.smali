.class public final enum Lvo/d3$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvo/d3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvo/d3$e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvo/d3$e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u0008j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lvo/d3$e;",
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
.field public static final b:Lvo/d3$e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lvo/d3$e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum d:Lvo/d3$e;

.field public static final enum e:Lvo/d3$e;

.field public static final enum f:Lvo/d3$e;

.field public static final enum g:Lvo/d3$e;

.field public static final enum h:Lvo/d3$e;

.field public static final synthetic i:[Lvo/d3$e;

.field public static final synthetic j:Lhu/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lvo/d3$e;

    const/4 v1, 0x0

    const-string v2, "front"

    const-string v3, "Front"

    invoke-direct {v0, v3, v1, v2}, Lvo/d3$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvo/d3$e;->d:Lvo/d3$e;

    new-instance v0, Lvo/d3$e;

    const/4 v1, 0x1

    const-string v2, "back"

    const-string v3, "Back"

    invoke-direct {v0, v3, v1, v2}, Lvo/d3$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvo/d3$e;->e:Lvo/d3$e;

    new-instance v0, Lvo/d3$e;

    const/4 v1, 0x2

    const-string v2, "front_or_back"

    const-string v3, "FrontOrBack"

    invoke-direct {v0, v3, v1, v2}, Lvo/d3$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvo/d3$e;->f:Lvo/d3$e;

    new-instance v0, Lvo/d3$e;

    const/4 v1, 0x3

    const-string v2, "barcode_pdf417"

    const-string v3, "BarcodePdf417"

    invoke-direct {v0, v3, v1, v2}, Lvo/d3$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvo/d3$e;->g:Lvo/d3$e;

    new-instance v0, Lvo/d3$e;

    const/4 v1, 0x4

    const-string v2, "passport_signature"

    const-string v3, "PassportSignature"

    invoke-direct {v0, v3, v1, v2}, Lvo/d3$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvo/d3$e;->h:Lvo/d3$e;

    invoke-static {}, Lvo/d3$e;->b()[Lvo/d3$e;

    move-result-object v0

    sput-object v0, Lvo/d3$e;->i:[Lvo/d3$e;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lvo/d3$e;->j:Lhu/a;

    new-instance v0, Lvo/d3$e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvo/d3$e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvo/d3$e;->b:Lvo/d3$e$a;

    new-instance v0, Lvo/e3;

    invoke-direct {v0}, Lvo/e3;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lvo/d3$e;->c:Lzt/h;

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

    iput-object p3, p0, Lvo/d3$e;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lvo/d3$e;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()[Lvo/d3$e;
    .locals 5

    sget-object v0, Lvo/d3$e;->d:Lvo/d3$e;

    sget-object v1, Lvo/d3$e;->e:Lvo/d3$e;

    sget-object v2, Lvo/d3$e;->f:Lvo/d3$e;

    sget-object v3, Lvo/d3$e;->g:Lvo/d3$e;

    sget-object v4, Lvo/d3$e;->h:Lvo/d3$e;

    filled-new-array {v0, v1, v2, v3, v4}, [Lvo/d3$e;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c()Lzt/h;
    .locals 1

    sget-object v0, Lvo/d3$e;->c:Lzt/h;

    return-object v0
.end method

.method public static d()Lhu/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhu/a<",
            "Lvo/d3$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lvo/d3$e;->j:Lhu/a;

    return-object v0
.end method

.method public static final h()Ljava/util/Map;
    .locals 6

    invoke-static {}, Lvo/d3$e;->values()[Lvo/d3$e;

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

    iget-object v5, v4, Lvo/d3$e;->a:Ljava/lang/String;

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public static valueOf(Ljava/lang/String;)Lvo/d3$e;
    .locals 1

    const-class v0, Lvo/d3$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvo/d3$e;

    return-object p0
.end method

.method public static values()[Lvo/d3$e;
    .locals 1

    sget-object v0, Lvo/d3$e;->i:[Lvo/d3$e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvo/d3$e;

    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvo/d3$e;->a:Ljava/lang/String;

    return-object v0
.end method
