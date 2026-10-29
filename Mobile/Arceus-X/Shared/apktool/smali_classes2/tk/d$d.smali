.class public Ltk/d$d;
.super Ltk/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ltk/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Ltk/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ltk/a;-><init>()V

    iput-object p1, p0, Ltk/d$d;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(ZLorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Ltk/d$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltk/d;

    invoke-virtual {p0}, Ltk/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Ltk/d;->c(Ljava/lang/String;ZLorg/json/JSONObject;)V

    return-void
.end method

.method public c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Ltk/d$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltk/d;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
