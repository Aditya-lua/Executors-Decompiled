.class public final synthetic Lko/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lko/u;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

.field public final synthetic c:Landroidx/lifecycle/m;


# direct methods
.method public synthetic constructor <init>(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/o;->a:Lko/u;

    iput-object p2, p0, Lko/o;->b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iput-object p3, p0, Lko/o;->c:Landroidx/lifecycle/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lko/o;->a:Lko/u;

    iget-object v1, p0, Lko/o;->b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v2, p0, Lko/o;->c:Landroidx/lifecycle/m;

    invoke-static {v0, v1, v2}, Lko/u;->d(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
