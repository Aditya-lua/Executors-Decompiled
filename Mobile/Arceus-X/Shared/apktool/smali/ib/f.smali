.class public final synthetic Lib/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lib/o;


# direct methods
.method public synthetic constructor <init>(Lib/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib/f;->a:Lib/o;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lib/f;->a:Lib/o;

    invoke-static {v0}, Lib/o;->j(Lib/o;)V

    return-void
.end method
