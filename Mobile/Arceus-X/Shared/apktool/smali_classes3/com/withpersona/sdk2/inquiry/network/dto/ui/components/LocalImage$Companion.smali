.class public final Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0008\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Companion;",
        "",
        "<init>",
        "()V",
        "Lum/h$e;",
        "createAdapter",
        "()Lum/h$e;",
        "",
        "type",
        "Ljava/lang/String;",
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Companion;->createAdapter$lambda$0(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;

    move-result-object p0

    return-object p0
.end method

.method private static final createAdapter$lambda$0(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 0

    const-class p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 p2, 0x0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lvm/a;->a(Ljava/lang/Class;)Lvm/a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lvm/a;->d(Ljava/lang/Enum;)Lvm/a;

    move-result-object p0

    invoke-virtual {p0}, Lum/h;->nullSafe()Lum/h;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p2
.end method


# virtual methods
.method public final createAdapter()Lum/h$e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/a;-><init>()V

    return-object v0
.end method
