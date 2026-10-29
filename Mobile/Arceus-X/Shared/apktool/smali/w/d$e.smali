.class public final Lw/d$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Lw/a$a;

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/app/ActivityOptions;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroid/os/Bundle;

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    .line 3
    new-instance v0, Lw/a$a;

    invoke-direct {v0}, Lw/a$a;-><init>()V

    iput-object v0, p0, Lw/d$e;->b:Lw/a$a;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lw/d$e;->h:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lw/d$e;->i:Z

    return-void
.end method

.method public constructor <init>(Lw/f;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    .line 8
    new-instance v0, Lw/a$a;

    invoke-direct {v0}, Lw/a$a;-><init>()V

    iput-object v0, p0, Lw/d$e;->b:Lw/a$a;

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lw/d$e;->h:I

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lw/d$e;->i:Z

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p0, p1}, Lw/d$e;->g(Lw/f;)Lw/d$e;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lw/d;
    .locals 4

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1, v1}, Lw/d$e;->h(Landroid/os/IBinder;Landroid/app/PendingIntent;)V

    :cond_0
    iget-object v0, p0, Lw/d$e;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v3, "android.support.customtabs.extra.MENU_ITEMS"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_1
    iget-object v0, p0, Lw/d$e;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v3, "android.support.customtabs.extra.TOOLBAR_ITEMS"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_2
    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v2, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    iget-boolean v3, p0, Lw/d$e;->i:Z

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    iget-object v2, p0, Lw/d$e;->b:Lw/a$a;

    invoke-virtual {v2}, Lw/a$a;->a()Lw/a;

    move-result-object v2

    invoke-virtual {v2}, Lw/a;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v0, p0, Lw/d$e;->g:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-virtual {v2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    iget-object v0, p0, Lw/d$e;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"

    iget-object v3, p0, Lw/d$e;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    iget-object v2, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-virtual {v2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_4
    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v2, "androidx.browser.customtabs.extra.SHARE_STATE"

    iget v3, p0, Lw/d$e;->h:I

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v0, p0, Lw/d$e;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v2, "androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS"

    iget-object v3, p0, Lw/d$e;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0}, Lw/d$e;->d()V

    const/16 v2, 0x22

    if-lt v0, v2, :cond_6

    invoke-virtual {p0}, Lw/d$e;->i()V

    :cond_6
    const/16 v2, 0x24

    if-lt v0, v2, :cond_7

    invoke-virtual {p0}, Lw/d$e;->b()V

    :cond_7
    iget-object v0, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v1

    :cond_8
    new-instance v0, Lw/d;

    iget-object v2, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-direct {v0, v2, v1}, Lw/d;-><init>(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    if-nez v0, :cond_0

    invoke-static {}, Lw/d$a;->a()Landroid/app/ActivityOptions;

    move-result-object v0

    iput-object v0, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    :cond_0
    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-static {v0}, Lw/d;->a(Landroid/content/Intent;)Z

    move-result v0

    iget-object v1, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    invoke-static {v1, v0}, Lw/d$d;->a(Landroid/app/ActivityOptions;Z)V

    return-void
.end method

.method public c(I)Lw/d$e;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v1, "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid value for the position argument"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()V
    .locals 5

    invoke-static {}, Lw/d$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v2, "com.android.browser.headers"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v3, "Accept-Language"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_1
    return-void
.end method

.method public e(I)Lw/d$e;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lw/d$e;->f(II)Lw/d$e;

    move-result-object p1

    return-object p1
.end method

.method public f(II)Lw/d$e;
    .locals 2

    if-lez p1, :cond_1

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-gt p2, v0, :cond_0

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v1, "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lw/d$e;->a:Landroid/content/Intent;

    const-string v0, "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid value for the activityHeightResizeBehavior argument"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid value for the initialHeightPx argument"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lw/f;)Lw/d$e;
    .locals 2

    iget-object v0, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-virtual {p1}, Lw/f;->e()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lw/f;->d()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1}, Lw/f;->f()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/d$e;->h(Landroid/os/IBinder;Landroid/app/PendingIntent;)V

    return-object p0
.end method

.method public final h(Landroid/os/IBinder;Landroid/app/PendingIntent;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    if-eqz p2, :cond_0

    const-string p1, "android.support.customtabs.extra.SESSION_ID"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-object p1, p0, Lw/d$e;->a:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    if-nez v0, :cond_0

    invoke-static {}, Lw/d$a;->a()Landroid/app/ActivityOptions;

    move-result-object v0

    iput-object v0, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    :cond_0
    iget-object v0, p0, Lw/d$e;->d:Landroid/app/ActivityOptions;

    iget-boolean v1, p0, Lw/d$e;->j:Z

    invoke-static {v0, v1}, Lw/d$c;->a(Landroid/app/ActivityOptions;Z)V

    return-void
.end method
