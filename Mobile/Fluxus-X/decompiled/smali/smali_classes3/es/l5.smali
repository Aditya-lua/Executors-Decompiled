.class public final synthetic Les/l5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;

.field public final synthetic c:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Les/i4;Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/l5;->a:Les/i4;

    iput-object p2, p0, Les/l5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;

    iput-object p3, p0, Les/l5;->c:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/l5;->a:Les/i4;

    iget-object v1, p0, Les/l5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;

    iget-object v2, p0, Les/l5;->c:Lqr/x5;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/s6;->w(Les/i4;Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;Lqr/x5;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
