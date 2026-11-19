.class public final synthetic Lof/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lof/c0;

.field public final synthetic b:Lag/b;


# direct methods
.method public synthetic constructor <init>(Lof/c0;Lag/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/m;->a:Lof/c0;

    iput-object p2, p0, Lof/m;->b:Lag/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lof/m;->a:Lof/c0;

    iget-object v1, p0, Lof/m;->b:Lag/b;

    invoke-static {v0, v1}, Lof/o;->i(Lof/c0;Lag/b;)V

    return-void
.end method
