.class public final synthetic Lmf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmf/y;

.field public final synthetic b:Lyf/b;


# direct methods
.method public synthetic constructor <init>(Lmf/y;Lyf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/n;->a:Lmf/y;

    iput-object p2, p0, Lmf/n;->b:Lyf/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lmf/n;->a:Lmf/y;

    iget-object v1, p0, Lmf/n;->b:Lyf/b;

    invoke-static {v0, v1}, Lmf/o;->k(Lmf/y;Lyf/b;)V

    return-void
.end method
