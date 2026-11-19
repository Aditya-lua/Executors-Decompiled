.class public final synthetic Lxo/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lap/b;

.field public final synthetic b:Lxo/m;


# direct methods
.method public synthetic constructor <init>(Lap/b;Lxo/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/b;->a:Lap/b;

    iput-object p2, p0, Lxo/b;->b:Lxo/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxo/b;->a:Lap/b;

    iget-object v1, p0, Lxo/b;->b:Lxo/m;

    invoke-static {v0, v1}, Lxo/m;->k(Lap/b;Lxo/m;)V

    return-void
.end method
