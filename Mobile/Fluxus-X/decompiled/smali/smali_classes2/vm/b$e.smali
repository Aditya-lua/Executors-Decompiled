.class public Lvm/b$e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvm/b;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvm/b;


# direct methods
.method public constructor <init>(Lvm/b;)V
    .locals 0

    iput-object p1, p0, Lvm/b$e;->a:Lvm/b;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lvm/b$e;->a:Lvm/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lvm/b;->c(Lvm/b;Z)V

    iget-object v0, p0, Lvm/b$e;->a:Lvm/b;

    invoke-virtual {v0}, Lvm/b;->q()V

    return-void
.end method
