.class public final synthetic Lxd/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lxd/t;


# direct methods
.method public synthetic constructor <init>(Lxd/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/k;->a:Lxd/t;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lxd/k;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->j(Lxd/t;)V

    return-void
.end method
