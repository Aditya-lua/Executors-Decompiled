.class public final Lv/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Lv/a$b;

.field public c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lv/b$b;->a:Landroid/content/Intent;

    new-instance v0, Lv/a$b;

    invoke-direct {v0}, Lv/a$b;-><init>()V

    iput-object v0, p0, Lv/b$b;->b:Lv/a$b;

    return-void
.end method


# virtual methods
.method public a()Lv/b;
    .locals 4

    iget-object v0, p0, Lv/b$b;->a:Landroid/content/Intent;

    const-string v1, "androidx.browser.auth.extra.LAUNCH_AUTH_TAB"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lv/b$b;->a:Landroid/content/Intent;

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1, v1}, Lv/b$b;->b(Landroid/os/IBinder;Landroid/app/PendingIntent;)V

    :cond_0
    iget-object v0, p0, Lv/b$b;->a:Landroid/content/Intent;

    iget-object v2, p0, Lv/b$b;->b:Lv/a$b;

    invoke-virtual {v2}, Lv/a$b;->a()Lv/a;

    move-result-object v2

    invoke-virtual {v2}, Lv/a;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v0, p0, Lv/b$b;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lv/b$b;->a:Landroid/content/Intent;

    invoke-virtual {v2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_1
    iget-object v0, p0, Lv/b$b;->c:Landroid/util/SparseArray;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"

    iget-object v3, p0, Lv/b$b;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    iget-object v2, p0, Lv/b$b;->a:Landroid/content/Intent;

    invoke-virtual {v2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2
    new-instance v0, Lv/b;

    iget-object v2, p0, Lv/b$b;->a:Landroid/content/Intent;

    invoke-direct {v0, v2, v1, v1, v1}, Lv/b;-><init>(Landroid/content/Intent;Lv/c;Lv/c$a;Lv/b$a;)V

    return-object v0
.end method

.method public final b(Landroid/os/IBinder;Landroid/app/PendingIntent;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    if-eqz p2, :cond_0

    const-string p1, "android.support.customtabs.extra.SESSION_ID"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-object p1, p0, Lv/b$b;->a:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method
