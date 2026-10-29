.class public final Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;",
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
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;",
        "Lum/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;)V",
        "Lum/m$b;",
        "options",
        "Lum/m$b;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;",
        "nfcScanPhaseAdapter",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;",
        "nfcScanStatusAdapter",
        "",
        "nullableLongAdapter",
        "nullableStringAdapter",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nfcScanPhaseAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nfcScanStatusAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableLongAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/Long;",
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
    .locals 7
    .param p1    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lum/h;-><init>()V

    const-string v5, "data_group_type"

    const-string v6, "metadata"

    const-string v0, "phase"

    const-string v1, "status"

    const-string v2, "duration_ms"

    const-string v3, "auth_method"

    const-string v4, "chip_auth_status"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->options:Lum/m$b;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "phase"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nfcScanPhaseAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;

    const-string v1, "status"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nfcScanStatusAdapter:Lum/h;

    const-class v0, Ljava/lang/Long;

    const-string v1, "durationMs"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableLongAdapter:Lum/h;

    const-class v0, Ljava/lang/String;

    const-string v1, "authMethod"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    const-string v1, "metadata"

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/b;->a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;
    .locals 22
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

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    .line 3
    :goto_0
    invoke-virtual {v1}, Lum/m;->f()Z

    move-result v2

    const-string v11, "phase"

    const-string v12, "status"

    if-eqz v2, :cond_2

    .line 4
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->options:Lum/m$b;

    invoke-virtual {v1, v2}, Lum/m;->F(Lum/m$b;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    and-int/lit8 v3, v3, -0x41

    goto :goto_0

    .line 6
    :pswitch_1
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x21

    goto :goto_0

    .line 7
    :pswitch_2
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x11

    goto :goto_0

    .line 8
    :pswitch_3
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    and-int/lit8 v3, v3, -0x9

    goto :goto_0

    .line 9
    :pswitch_4
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableLongAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/Long;

    and-int/lit8 v3, v3, -0x5

    goto :goto_0

    .line 10
    :pswitch_5
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nfcScanStatusAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;

    if-eqz v5, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {v12, v12, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_6
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nfcScanPhaseAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    if-eqz v4, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    invoke-static {v11, v11, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_7
    invoke-virtual {v1}, Lum/m;->M()V

    .line 15
    invoke-virtual {v1}, Lum/m;->P()V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {v1}, Lum/m;->d()V

    const/16 v2, -0x7d

    if-ne v3, v2, :cond_5

    move-object v2, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    .line 17
    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;

    if-eqz v5, :cond_4

    if-eqz v6, :cond_3

    .line 18
    invoke-direct/range {v4 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V

    return-object v4

    .line 19
    :cond_3
    invoke-static {v12, v12, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 20
    :cond_4
    invoke-static {v2, v2, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    :cond_5
    move-object v2, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    .line 21
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v4, :cond_6

    .line 22
    sget-object v20, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v21, Lwm/c;->c:Ljava/lang/Class;

    const-class v13, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-class v14, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;

    const-class v15, Ljava/lang/Long;

    const-class v16, Ljava/lang/String;

    const-class v17, Ljava/lang/String;

    const-class v18, Ljava/lang/String;

    const-class v19, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    filled-new-array/range {v13 .. v21}, [Ljava/lang/Class;

    move-result-object v4

    .line 23
    const-class v13, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;

    invoke-virtual {v13, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 24
    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    move-object v13, v4

    if-eqz v5, :cond_8

    if-eqz v6, :cond_7

    .line 26
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v12, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v1

    .line 27
    filled-new-array/range {v4 .. v12}, [Ljava/lang/Object;

    move-result-object v1

    .line 28
    invoke-virtual {v13, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;

    return-object v1

    .line 30
    :cond_7
    invoke-static {v12, v12, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 31
    :cond_8
    invoke-static {v2, v2, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 3
    const-string v0, "phase"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nfcScanPhaseAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getPhase()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nfcScanStatusAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getStatus()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "duration_ms"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableLongAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getDurationMs()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 9
    const-string v0, "auth_method"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 10
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getAuthMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 11
    const-string v0, "chip_auth_status"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 12
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getChipAuthStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 13
    const-string v0, "data_group_type"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 14
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getDataGroupType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 15
    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 16
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->nullableTrackingMetadataAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;->getMetadata()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "GeneratedJsonAdapter(NfcScanEventData)"

    const/16 v1, 0x26

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/model/a;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
