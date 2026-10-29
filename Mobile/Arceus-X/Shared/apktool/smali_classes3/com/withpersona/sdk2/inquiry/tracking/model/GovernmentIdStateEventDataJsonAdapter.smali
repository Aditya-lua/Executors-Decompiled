.class public final Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;",
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
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;",
        "Lum/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;)V",
        "Lum/m$b;",
        "options",
        "Lum/m$b;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;",
        "govIdCaptureStateAdapter",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;",
        "nullableGovIdCaptureMethodAdapter",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;",
        "nullableGovIdCaptureSideAdapter",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final govIdCaptureStateAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableGovIdCaptureMethodAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableGovIdCaptureSideAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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


# direct methods
.method public constructor <init>(Lum/w;)V
    .locals 4
    .param p1    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lum/h;-><init>()V

    const-string v0, "state"

    const-string v1, "capture_method"

    const-string v2, "side"

    const-string v3, "metadata"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->options:Lum/m$b;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "govIdCaptureState"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->govIdCaptureStateAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;

    const-string v1, "captureMethod"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableGovIdCaptureMethodAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    invoke-static {p1, v0, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableGovIdCaptureSideAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    invoke-static {p1, v0, v3}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;
    .locals 17
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {v1}, Lum/m;->b()V

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move v2, v3

    .line 3
    :goto_0
    invoke-virtual {v1}, Lum/m;->f()Z

    move-result v8

    const-string v9, "state"

    const-string v10, "govIdCaptureState"

    if-eqz v8, :cond_6

    .line 4
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->options:Lum/m$b;

    invoke-virtual {v1, v8}, Lum/m;->F(Lum/m$b;)I

    move-result v8

    if-eq v8, v3, :cond_5

    if-eqz v8, :cond_3

    const/4 v9, 0x1

    if-eq v8, v9, :cond_2

    const/4 v9, 0x2

    if-eq v8, v9, :cond_1

    const/4 v9, 0x3

    if-eq v8, v9, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    invoke-virtual {v7, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    and-int/lit8 v2, v2, -0x9

    goto :goto_0

    .line 6
    :cond_1
    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableGovIdCaptureSideAdapter:Lum/h;

    invoke-virtual {v6, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    and-int/lit8 v2, v2, -0x5

    goto :goto_0

    .line 7
    :cond_2
    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableGovIdCaptureMethodAdapter:Lum/h;

    invoke-virtual {v5, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;

    goto :goto_0

    .line 8
    :cond_3
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->govIdCaptureStateAdapter:Lum/h;

    invoke-virtual {v4, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    if-eqz v4, :cond_4

    goto :goto_0

    .line 9
    :cond_4
    invoke-static {v10, v9, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 10
    :cond_5
    invoke-virtual {v1}, Lum/m;->M()V

    .line 11
    invoke-virtual {v1}, Lum/m;->P()V

    goto :goto_0

    .line 12
    :cond_6
    invoke-virtual {v1}, Lum/m;->d()V

    const/16 v3, -0xd

    if-ne v2, v3, :cond_8

    .line 13
    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    if-eqz v4, :cond_7

    .line 14
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    return-object v2

    .line 15
    :cond_7
    invoke-static {v10, v9, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 16
    :cond_8
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_9

    .line 17
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v16, Lwm/c;->c:Ljava/lang/Class;

    const-class v11, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-class v12, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;

    const-class v13, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    const-class v14, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    filled-new-array/range {v11 .. v16}, [Ljava/lang/Class;

    move-result-object v3

    .line 18
    const-class v8, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    invoke-virtual {v8, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 19
    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_9
    if-eqz v4, :cond_a

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    .line 21
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Object;

    move-result-object v1

    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    return-object v1

    .line 24
    :cond_a
    invoke-static {v10, v9, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 3
    const-string v0, "state"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->govIdCaptureStateAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;->getGovIdCaptureState()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "capture_method"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableGovIdCaptureMethodAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;->getCaptureMethod()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "side"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableGovIdCaptureSideAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;->getSide()Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 9
    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 10
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;->getMetadata()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "GeneratedJsonAdapter(GovernmentIdStateEventData)"

    const/16 v1, 0x30

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/a;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
