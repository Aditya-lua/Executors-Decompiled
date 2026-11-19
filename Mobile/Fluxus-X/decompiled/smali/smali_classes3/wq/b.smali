.class public final synthetic Lwq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;

.field public final synthetic b:Loq/b;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Loq/b;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwq/b;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;

    iput-object p2, p0, Lwq/b;->b:Loq/b;

    iput-object p3, p0, Lwq/b;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lwq/b;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;

    iget-object v1, p0, Lwq/b;->b:Loq/b;

    iget-object v2, p0, Lwq/b;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->H(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Loq/b;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
