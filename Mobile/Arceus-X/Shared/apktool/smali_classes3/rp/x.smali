.class public final synthetic Lrp/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# instance fields
.field public final synthetic b:Lrp/g0;

.field public final synthetic c:Lsp/c;


# direct methods
.method public synthetic constructor <init>(Lrp/g0;Lsp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/x;->b:Lrp/g0;

    iput-object p2, p0, Lrp/x;->c:Lsp/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lan/y;)V
    .locals 2

    iget-object v0, p0, Lrp/x;->b:Lrp/g0;

    iget-object v1, p0, Lrp/x;->c:Lsp/c;

    check-cast p1, Lrp/g0;

    invoke-static {v0, v1, p1, p2}, Lrp/g0;->i(Lrp/g0;Lsp/c;Lrp/g0;Lan/y;)V

    return-void
.end method
