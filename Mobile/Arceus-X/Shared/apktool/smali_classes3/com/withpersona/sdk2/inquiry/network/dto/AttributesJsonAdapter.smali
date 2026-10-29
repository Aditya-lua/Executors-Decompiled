.class public final Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;",
        "Lum/w;",
        "moshi",
        "<init>",
        "(Lum/w;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lum/m;",
        "reader",
        "fromJson",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;",
        "Lum/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)V",
        "Lum/m$b;",
        "options",
        "Lum/m$b;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
        "nullableGpsCollectionRequirementAdapter",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;",
        "nullableGpsPrecisionRequirementAdapter",
        "nullableStringAdapter",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "Ljava/lang/reflect/Constructor;",
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


# instance fields
.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nullableGpsCollectionRequirementAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableGpsPrecisionRequirementAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableStringAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lum/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lum/w;)V
    .locals 5
    .param p1    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lum/h;-><init>()V

    const-string v0, "gpsCollectionRequirement"

    const-string v1, "gpsPrecisionRequirement"

    const-string v2, "playIntegrityProjectId"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v3

    const-string v4, "of(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->options:Lum/m$b;

    const-class v3, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {p1, v3, v4, v0}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    const-string v3, "adapter(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableGpsCollectionRequirementAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {p1, v0, v4, v1}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableGpsPrecisionRequirementAdapter:Lum/h;

    const-class v0, Ljava/lang/String;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v2}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableStringAdapter:Lum/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;
    .locals 9
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lum/m;->b()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move-object v4, v3

    move-object v5, v4

    move v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lum/m;->f()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 4
    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->options:Lum/m$b;

    invoke-virtual {p1, v6}, Lum/m;->F(Lum/m$b;)I

    move-result v6

    if-eq v6, v1, :cond_3

    if-eqz v6, :cond_2

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v5, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    and-int/lit8 v2, v2, -0x5

    goto :goto_0

    .line 6
    :cond_1
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableGpsPrecisionRequirementAdapter:Lum/h;

    invoke-virtual {v4, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    and-int/lit8 v2, v2, -0x3

    goto :goto_0

    .line 7
    :cond_2
    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableGpsCollectionRequirementAdapter:Lum/h;

    invoke-virtual {v3, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    and-int/lit8 v2, v2, -0x2

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p1}, Lum/m;->M()V

    .line 9
    invoke-virtual {p1}, Lum/m;->P()V

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p1}, Lum/m;->d()V

    const/4 p1, -0x8

    if-ne v2, p1, :cond_5

    .line 11
    new-instance p1, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    invoke-direct {p1, v3, v4, v5}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;Ljava/lang/String;)V

    return-object p1

    .line 12
    :cond_5
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_6

    .line 13
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    sget-object v1, Lwm/c;->c:Ljava/lang/Class;

    const-class v6, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    const-class v7, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    const-class v8, Ljava/lang/String;

    filled-new-array {v6, v7, v8, p1, v1}, [Ljava/lang/Class;

    move-result-object p1

    .line 15
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    const-string v1, "also(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    :cond_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 18
    filled-new-array {v3, v4, v5, v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "newInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    return-object p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 3
    const-string v0, "gpsCollectionRequirement"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableGpsCollectionRequirementAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getGpsCollectionRequirement()Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "gpsPrecisionRequirement"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableGpsPrecisionRequirementAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getGpsPrecisionRequirement()Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "playIntegrityProjectId"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getPlayIntegrityProjectId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/AttributesJsonAdapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Attributes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
