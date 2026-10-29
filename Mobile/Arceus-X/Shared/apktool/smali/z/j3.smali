.class public final synthetic Lz/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/k3;


# direct methods
.method public synthetic constructor <init>(Lz/k3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/j3;->a:Lz/k3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/j3;->a:Lz/k3;

    invoke-static {v0}, Lz/k3;->j(Lz/k3;)V

    return-void
.end method
