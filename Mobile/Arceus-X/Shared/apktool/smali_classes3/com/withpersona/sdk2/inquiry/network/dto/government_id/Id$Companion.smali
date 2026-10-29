.class public final Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;",
        "",
        "<init>",
        "()V",
        "Lum/h$e;",
        "createAdapter",
        "()Lum/h$e;",
        "network-inquiry_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;->createAdapter$lambda$0(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;

    move-result-object p0

    return-object p0
.end method

.method private static final createAdapter$lambda$0(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 1

    const-class p1, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-static {p1}, Lvm/a;->a(Ljava/lang/Class;)Lvm/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lvm/a;->d(Ljava/lang/Enum;)Lvm/a;

    move-result-object p0

    return-object p0

    :cond_0
    const-class p1, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Lvm/a;->a(Ljava/lang/Class;)Lvm/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lvm/a;->d(Ljava/lang/Enum;)Lvm/a;

    move-result-object p0

    return-object p0

    :cond_1
    const-class p1, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {p1}, Lvm/a;->a(Ljava/lang/Class;)Lvm/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lvm/a;->d(Ljava/lang/Enum;)Lvm/a;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final createAdapter()Lum/h$e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lpp/a;

    invoke-direct {v0}, Lpp/a;-><init>()V

    return-object v0
.end method
