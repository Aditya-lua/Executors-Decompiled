.class public final synthetic Lzd/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lzd/t;


# direct methods
.method public synthetic constructor <init>(Lzd/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/k;->a:Lzd/t;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lzd/k;->a:Lzd/t;

    invoke-static {v0}, Lzd/t;->j(Lzd/t;)V

    return-void
.end method
