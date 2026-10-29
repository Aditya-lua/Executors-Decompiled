.class public final synthetic Lrp/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrp/g0;


# direct methods
.method public synthetic constructor <init>(Lrp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/w;->a:Lrp/g0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrp/w;->a:Lrp/g0;

    check-cast p1, Lsp/c;

    invoke-static {v0, p1}, Lrp/g0;->c(Lrp/g0;Lsp/c;)Lan/k;

    move-result-object p1

    return-object p1
.end method
