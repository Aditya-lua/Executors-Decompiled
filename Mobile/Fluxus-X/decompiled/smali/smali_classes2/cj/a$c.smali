.class public Lcj/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lcj/a;


# direct methods
.method public constructor <init>(Lcj/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcj/a$c;->a:Lcj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcj/a;Lcj/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcj/a$c;-><init>(Lcj/a;)V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 4

    iget-object v0, p0, Lcj/a$c;->a:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "PushNotificationRegistration"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcj/a$c;->a:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {v0}, Lk2/n;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_0

    iget-object v0, p0, Lcj/a$c;->a:Lcj/a;

    invoke-virtual {v0, v1}, Lnh/d;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcj/a$c;->a:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {v0}, Lk2/n;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v0

    iget-object v2, p0, Lcj/a$c;->a:Lcj/a;

    invoke-static {v2}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lrj/r;->z(Landroid/content/Context;Z)V

    :cond_1
    iget-object v0, p0, Lcj/a$c;->a:Lcj/a;

    invoke-virtual {v0, v1}, Lnh/d;->d(Ljava/lang/String;)V

    return-void
.end method
