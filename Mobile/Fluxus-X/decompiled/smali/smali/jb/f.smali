.class public final synthetic Ljb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Ljb/o;


# direct methods
.method public synthetic constructor <init>(Ljb/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/f;->a:Ljb/o;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Ljb/f;->a:Ljb/o;

    invoke-static {v0}, Ljb/o;->j(Ljb/o;)V

    return-void
.end method
