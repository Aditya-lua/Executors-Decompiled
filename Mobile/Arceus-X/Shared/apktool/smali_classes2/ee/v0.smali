.class public final synthetic Lee/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lee/f;


# direct methods
.method public synthetic constructor <init>(Lee/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lee/v0;->a:Lee/f;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lee/v0;->a:Lee/f;

    invoke-static {v0}, Lee/f;->k(Lee/f;)V

    return-void
.end method
