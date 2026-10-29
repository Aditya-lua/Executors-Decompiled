.class public final synthetic Lmf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmf/c0;

.field public final synthetic b:Lyf/b;


# direct methods
.method public synthetic constructor <init>(Lmf/c0;Lyf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/m;->a:Lmf/c0;

    iput-object p2, p0, Lmf/m;->b:Lyf/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lmf/m;->a:Lmf/c0;

    iget-object v1, p0, Lmf/m;->b:Lyf/b;

    invoke-static {v0, v1}, Lmf/o;->i(Lmf/c0;Lyf/b;)V

    return-void
.end method
