.class public final synthetic Lbe/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lbe/g;


# direct methods
.method public synthetic constructor <init>(Lbe/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/t1;->a:Lbe/g;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lbe/t1;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->j(Lbe/g;)V

    return-void
.end method
