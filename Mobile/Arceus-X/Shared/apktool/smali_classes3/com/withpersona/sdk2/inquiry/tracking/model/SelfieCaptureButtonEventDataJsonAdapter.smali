.class public final Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;",
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
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;",
        "Lum/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;)V",
        "Lum/m$b;",
        "options",
        "Lum/m$b;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;",
        "selfieCaptureButtonTypeAdapter",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;",
        "nullableTrackingMetadataAdapter",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "Ljava/lang/reflect/Constructor;",
        "tracking-events_release"
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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nullableTrackingMetadataAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;",
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

.field private final selfieCaptureButtonTypeAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lum/w;)V
    .locals 3
    .param p1    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lum/h;-><init>()V

    const-string v0, "type"

    const-string v1, "metadata"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->options:Lum/m$b;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    const-string v2, "selfieCaptureButtonType"

    invoke-static {p1, v0, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->selfieCaptureButtonTypeAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;
    .locals 10
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {p1}, Lum/m;->b()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move-object v4, v3

    move v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lum/m;->f()Z

    move-result v5

    const/4 v6, -0x3

    const-string v7, "type"

    const-string v8, "selfieCaptureButtonType"

    if-eqz v5, :cond_4

    .line 4
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->options:Lum/m$b;

    invoke-virtual {p1, v5}, Lum/m;->F(Lum/m$b;)I

    move-result v5

    if-eq v5, v1, :cond_3

    if-eqz v5, :cond_1

    const/4 v7, 0x1

    if-eq v5, v7, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    invoke-virtual {v2, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move v2, v6

    goto :goto_0

    .line 6
    :cond_1
    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->selfieCaptureButtonTypeAdapter:Lum/h;

    invoke-virtual {v3, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    if-eqz v3, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {v8, v7, p1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1

    .line 8
    :cond_3
    invoke-virtual {p1}, Lum/m;->M()V

    .line 9
    invoke-virtual {p1}, Lum/m;->P()V

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p1}, Lum/m;->d()V

    if-ne v2, v6, :cond_6

    .line 11
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;

    if-eqz v3, :cond_5

    .line 12
    invoke-direct {v0, v3, v4}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    return-object v0

    .line 13
    :cond_5
    invoke-static {v8, v7, p1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1

    .line 14
    :cond_6
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v1, :cond_7

    .line 15
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v5, Lwm/c;->c:Ljava/lang/Class;

    const-class v6, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    const-class v9, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    filled-new-array {v6, v9, v1, v5}, [Ljava/lang/Class;

    move-result-object v1

    .line 16
    const-class v5, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    if-eqz v3, :cond_8

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 19
    filled-new-array {v3, v4, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;

    return-object p1

    .line 22
    :cond_8
    invoke-static {v8, v7, p1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 3
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->selfieCaptureButtonTypeAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;->getSelfieCaptureButtonType()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;->getMetadata()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventDataJsonAdapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "GeneratedJsonAdapter(SelfieCaptureButtonEventData)"

    const/16 v1, 0x32

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/a;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
