.class public Lj/g$o;
.super Lj/g$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "o"
.end annotation


# instance fields
.field public final c:Lj/s;

.field public final synthetic d:Lj/g;


# direct methods
.method public constructor <init>(Lj/g;Lj/s;)V
    .locals 0
    .param p1    # Lj/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lj/g$o;->d:Lj/g;

    invoke-direct {p0, p1}, Lj/g$n;-><init>(Lj/g;)V

    iput-object p2, p0, Lj/g$o;->c:Lj/s;

    return-void
.end method


# virtual methods
.method public b()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lj/g$o;->c:Lj/s;

    invoke-virtual {v0}, Lj/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lj/g$o;->d:Lj/g;

    invoke-virtual {v0}, Lj/g;->Q()Z

    return-void
.end method
