.class public final synthetic Lko/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lko/m;

.field public final synthetic b:Lno/b;


# direct methods
.method public synthetic constructor <init>(Lko/m;Lno/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/l;->a:Lko/m;

    iput-object p2, p0, Lko/l;->b:Lno/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lko/l;->a:Lko/m;

    iget-object v1, p0, Lko/l;->b:Lno/b;

    invoke-static {v0, v1}, Lko/m;->o(Lko/m;Lno/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
