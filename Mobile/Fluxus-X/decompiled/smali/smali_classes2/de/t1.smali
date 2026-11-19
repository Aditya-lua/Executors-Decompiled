.class public final synthetic Lde/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lde/g;


# direct methods
.method public synthetic constructor <init>(Lde/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/t1;->a:Lde/g;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lde/t1;->a:Lde/g;

    invoke-static {v0}, Lde/g;->j(Lde/g;)V

    return-void
.end method
