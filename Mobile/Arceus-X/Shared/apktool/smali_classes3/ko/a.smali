.class public final synthetic Lko/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lko/m;

.field public final synthetic b:Lcr/y4;

.field public final synthetic c:Lno/b;


# direct methods
.method public synthetic constructor <init>(Lko/m;Lcr/y4;Lno/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/a;->a:Lko/m;

    iput-object p2, p0, Lko/a;->b:Lcr/y4;

    iput-object p3, p0, Lko/a;->c:Lno/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lko/a;->a:Lko/m;

    iget-object v1, p0, Lko/a;->b:Lcr/y4;

    iget-object v2, p0, Lko/a;->c:Lno/b;

    invoke-static {v0, v1, v2}, Lko/m;->l(Lko/m;Lcr/y4;Lno/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
