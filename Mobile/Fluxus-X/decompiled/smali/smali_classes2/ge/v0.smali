.class public final synthetic Lge/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lge/f;


# direct methods
.method public synthetic constructor <init>(Lge/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/v0;->a:Lge/f;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lge/v0;->a:Lge/f;

    invoke-static {v0}, Lge/f;->k(Lge/f;)V

    return-void
.end method
