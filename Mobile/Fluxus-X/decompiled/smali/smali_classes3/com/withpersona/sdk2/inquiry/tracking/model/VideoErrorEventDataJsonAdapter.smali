.class public final Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;",
        "Lhn/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;",
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
        "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;",
        "Lhn/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lhn/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;)V",
        "Lhn/m$b;",
        "options",
        "Lhn/m$b;",
        "nullableStringAdapter",
        "Lhn/h;",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nullableStringAdapter:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableTrackingMetadataAdapter:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;",
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
    .locals 6
    .param p1    # Lhn/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lhn/h;-><init>()V

    const-string v4, "error_reason"

    const-string v5, "metadata"

    const-string v0, "step_name"

    const-string v1, "page_name"

    const-string v2, "capture_method"

    const-string v3, "error_name"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhn/m$b;->a([Ljava/lang/String;)Lhn/m$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->options:Lhn/m$b;

    const-class v0, Ljava/lang/String;

    const-string v1, "stepName"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lhn/w;Ljava/lang/Class;Ljava/lang/String;)Lhn/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    const-string v1, "metadata"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lhn/w;Ljava/lang/Class;Ljava/lang/String;)Lhn/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lhn/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;
    .locals 19
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {v1}, Lhn/m;->b()V

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    .line 3
    :goto_0
    invoke-virtual {v1}, Lhn/m;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->options:Lhn/m$b;

    invoke-virtual {v1, v2}, Lhn/m;->I(Lhn/m$b;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lhn/h;

    invoke-virtual {v2, v1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    and-int/lit8 v3, v3, -0x21

    goto :goto_0

    .line 6
    :pswitch_1
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {v2, v1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x11

    goto :goto_0

    .line 7
    :pswitch_2
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {v2, v1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x9

    goto :goto_0

    .line 8
    :pswitch_3
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {v2, v1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x5

    goto :goto_0

    .line 9
    :pswitch_4
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {v2, v1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x3

    goto :goto_0

    .line 10
    :pswitch_5
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {v2, v1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    goto :goto_0

    .line 11
    :pswitch_6
    invoke-virtual {v1}, Lhn/m;->O()V

    .line 12
    invoke-virtual {v1}, Lhn/m;->Q()V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1}, Lhn/m;->d()V

    const/16 v1, -0x3f

    if-ne v3, v1, :cond_1

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    .line 14
    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;

    invoke-direct/range {v4 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    return-object v4

    :cond_1
    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    .line 15
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v1, :cond_2

    .line 16
    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v18, Ljn/c;->c:Ljava/lang/Class;

    const-class v11, Ljava/lang/String;

    const-class v12, Ljava/lang/String;

    const-class v13, Ljava/lang/String;

    const-class v14, Ljava/lang/String;

    const-class v15, Ljava/lang/String;

    const-class v16, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    filled-new-array/range {v11 .. v18}, [Ljava/lang/Class;

    move-result-object v1

    .line 17
    const-class v2, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 18
    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v11, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v2

    .line 20
    filled-new-array/range {v4 .. v11}, [Ljava/lang/Object;

    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;)V
    .locals 2
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    .line 3
    const-string v0, "step_name"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;->getStepName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "page_name"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;->getPageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "capture_method"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;->getCaptureMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 9
    const-string v0, "error_name"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 10
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;->getErrorName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 11
    const-string v0, "error_reason"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 12
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableStringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;->getErrorReason()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 13
    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 14
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;->getMetadata()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "GeneratedJsonAdapter(VideoErrorEventData)"

    const/16 v1, 0x29

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/a;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
