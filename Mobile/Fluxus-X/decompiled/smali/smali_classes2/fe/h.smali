.class public final synthetic Lfe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfe/a;

.field public final synthetic b:Lce/e;


# direct methods
.method public synthetic constructor <init>(Lfe/a;Lce/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/h;->a:Lfe/a;

    iput-object p2, p0, Lfe/h;->b:Lce/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lfe/h;->a:Lfe/a;

    iget-object v1, p0, Lfe/h;->b:Lce/e;

    invoke-virtual {v0, v1}, Lfe/a;->k(Lce/e;)V

    return-void
.end method
