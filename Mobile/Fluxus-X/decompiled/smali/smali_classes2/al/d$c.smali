.class public Lal/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lal/d;


# direct methods
.method public constructor <init>(Lal/d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lal/d$c;->a:Lal/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lal/d;Lal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lal/d$c;-><init>(Lal/d;)V

    return-void
.end method


# virtual methods
.method public executeRoblox(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lal/d$c;->a:Lal/d;

    iget-object v0, v0, Lal/d;->b:Landroid/os/Handler;

    new-instance v1, Lal/d$c$a;

    invoke-direct {v1, p0, p1}, Lal/d$c$a;-><init>(Lal/d$c;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
