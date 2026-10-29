.class public final synthetic Lx5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lku/d2;


# direct methods
.method public synthetic constructor <init>(Lku/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx5/q;->a:Lku/d2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx5/q;->a:Lku/d2;

    invoke-static {v0}, Lx5/u;->e(Lku/d2;)V

    return-void
.end method
