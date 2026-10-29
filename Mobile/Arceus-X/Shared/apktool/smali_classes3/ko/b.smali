.class public final synthetic Lko/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lno/b;

.field public final synthetic b:Lko/m;


# direct methods
.method public synthetic constructor <init>(Lno/b;Lko/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/b;->a:Lno/b;

    iput-object p2, p0, Lko/b;->b:Lko/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lko/b;->a:Lno/b;

    iget-object v1, p0, Lko/b;->b:Lko/m;

    invoke-static {v0, v1}, Lko/m;->k(Lno/b;Lko/m;)V

    return-void
.end method
