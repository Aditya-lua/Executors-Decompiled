.class public final Lcom/withpersona/sdk2/inquiry/selfie/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/d;-><init>(Lcom/withpersona/sdk2/camera/b;Lct/a;Lhn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/selfie/d$b",
        "Lfn/s;",
        "",
        "a",
        "()V",
        "selfie_release"
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
.field public final synthetic a:Laq/a;

.field public final synthetic b:Lct/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lct/a<",
            "Lfn/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;


# direct methods
.method public constructor <init>(Laq/a;Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/a;",
            "Lct/a<",
            "Lfn/n0;",
            ">;",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->a:Laq/a;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->b:Lct/a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->c:Lcom/withpersona/sdk2/camera/b;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lfn/h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->c(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lfn/h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lfn/h;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;->i()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 10

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->a:Laq/a;

    iget-object v2, v0, Laq/a;->k:Landroidx/camera/view/PreviewView;

    const-string v0, "previewviewSelfieCamera"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/withpersona/sdk2/camera/b$a;->a:Lcom/withpersona/sdk2/camera/b$a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->b:Lct/a;

    invoke-interface {v0}, Lct/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lfn/n0;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->c:Lcom/withpersona/sdk2/camera/b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/d$b;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    new-instance v7, Lyp/m;

    invoke-direct {v7, v0}, Lyp/m;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)V

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lcom/withpersona/sdk2/camera/b;->g(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/b$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
