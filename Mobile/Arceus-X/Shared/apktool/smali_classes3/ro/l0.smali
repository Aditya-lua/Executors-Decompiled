.class public final synthetic Lro/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lro/m0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Lvr/f;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

.field public final synthetic e:Lym/h;


# direct methods
.method public synthetic constructor <init>(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lym/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/l0;->a:Lro/m0;

    iput-object p2, p0, Lro/l0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Lro/l0;->c:Lvr/f;

    iput-object p4, p0, Lro/l0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iput-object p5, p0, Lro/l0;->e:Lym/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lro/l0;->a:Lro/m0;

    iget-object v1, p0, Lro/l0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Lro/l0;->c:Lvr/f;

    iget-object v3, p0, Lro/l0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iget-object v4, p0, Lro/l0;->e:Lym/h;

    move-object v5, p1

    check-cast v5, Ljt/n;

    invoke-static/range {v0 .. v5}, Lro/m0;->f(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lym/h;Ljt/n;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
