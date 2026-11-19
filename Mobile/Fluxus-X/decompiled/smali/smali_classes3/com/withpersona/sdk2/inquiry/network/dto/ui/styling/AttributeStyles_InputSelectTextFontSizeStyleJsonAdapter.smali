.class public final Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;",
        "Lhn/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;",
        "Lhn/w;",
        "moshi",
        "<init>",
        "(Lhn/w;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lhn/m;",
        "reader",
        "fromJson",
        "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;",
        "Lhn/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;)V",
        "Lhn/m$b;",
        "options",
        "Lhn/m$b;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;",
        "nullableMeasurementAdapter",
        "Lhn/h;",
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
.field private final nullableMeasurementAdapter:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lhn/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn/w;)V
    .locals 3
    .param p1    # Lhn/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lhn/h;-><init>()V

    const-string v0, "label"

    const-string v1, "error"

    const-string v2, "base"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhn/m$b;->a([Ljava/lang/String;)Lhn/m$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->options:Lhn/m$b;

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v2}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object p1

    const-string v0, "adapter(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;
    .locals 5
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lhn/m;->b()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 4
    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->options:Lhn/m$b;

    invoke-virtual {p1, v3}, Lhn/m;->I(Lhn/m$b;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    invoke-virtual {v2, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    invoke-virtual {v1, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p1}, Lhn/m;->O()V

    .line 9
    invoke-virtual {p1}, Lhn/m;->Q()V

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p1}, Lhn/m;->d()V

    .line 11
    new-instance p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;

    invoke-direct {p1, v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V

    return-object p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;)V
    .locals 2
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    .line 3
    const-string v0, "base"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "label"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;->getLabel()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->nullableMeasurementAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;->getError()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles_InputSelectTextFontSizeStyleJsonAdapter;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x42

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "AttributeStyles.InputSelectTextFontSizeStyle"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
