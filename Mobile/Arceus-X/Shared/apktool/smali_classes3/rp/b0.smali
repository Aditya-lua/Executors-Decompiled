.class public final synthetic Lrp/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lsp/c;

.field public final synthetic b:Lrp/g0;


# direct methods
.method public synthetic constructor <init>(Lsp/c;Lrp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/b0;->a:Lsp/c;

    iput-object p2, p0, Lrp/b0;->b:Lrp/g0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrp/b0;->a:Lsp/c;

    iget-object v1, p0, Lrp/b0;->b:Lrp/g0;

    invoke-static {v0, v1}, Lrp/g0;->e(Lsp/c;Lrp/g0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
