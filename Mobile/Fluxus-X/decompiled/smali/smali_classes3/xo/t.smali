.class public final synthetic Lxo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxo/u;


# direct methods
.method public synthetic constructor <init>(Lxo/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/t;->a:Lxo/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxo/t;->a:Lxo/u;

    invoke-static {v0}, Lxo/u$a;->a(Lxo/u;)V

    return-void
.end method
