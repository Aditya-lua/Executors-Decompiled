.class public Lk2/k$g;
.super Lk2/k$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/k$g$c;,
        Lk2/k$g$b;,
        Lk2/k$g$d;,
        Lk2/k$g$a;
    }
.end annotation


# instance fields
.field public e:I

.field public f:Lk2/r;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroid/app/PendingIntent;

.field public j:Z

.field public k:Ljava/lang/Integer;

.field public l:Ljava/lang/Integer;

.field public m:Landroidx/core/graphics/drawable/IconCompat;

.field public n:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk2/k$i;-><init>()V

    return-void
.end method

.method public constructor <init>(ILk2/r;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lk2/k$i;-><init>()V

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Lk2/r;->d()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput p1, p0, Lk2/k$g;->e:I

    .line 5
    iput-object p2, p0, Lk2/k$g;->f:Lk2/r;

    .line 6
    iput-object p5, p0, Lk2/k$g;->g:Landroid/app/PendingIntent;

    .line 7
    iput-object p4, p0, Lk2/k$g;->h:Landroid/app/PendingIntent;

    .line 8
    iput-object p3, p0, Lk2/k$g;->i:Landroid/app/PendingIntent;

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "person must have a non-empty a name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static h(Lk2/r;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Lk2/k$g;
    .locals 6

    new-instance v0, Lk2/k$g;

    const-string v1, "declineIntent is required"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "answerIntent is required"

    invoke-static {p2, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lk2/k$g;-><init>(ILk2/r;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lk2/k$i;->a(Landroid/os/Bundle;)V

    const-string v0, "android.callType"

    iget v1, p0, Lk2/k$g;->e:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "android.callIsVideo"

    iget-boolean v1, p0, Lk2/k$g;->j:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, Lk2/k$g;->f:Lk2/r;

    if-eqz v0, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lk2/r;->i()Landroid/app/Person;

    move-result-object v0

    invoke-static {v0}, Lk2/k$g$c;->b(Landroid/app/Person;)Landroid/os/Parcelable;

    move-result-object v0

    const-string v1, "android.callPerson"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_0
    const-string v1, "android.callPersonCompat"

    invoke-virtual {v0}, Lk2/r;->j()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lk2/k$g;->m:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v1, v1, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->p(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    invoke-static {v0}, Lk2/k$g$b;->a(Landroid/graphics/drawable/Icon;)Landroid/os/Parcelable;

    move-result-object v0

    const-string v1, "android.verificationIcon"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_2
    const-string v0, "android.verificationText"

    iget-object v1, p0, Lk2/k$g;->n:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "android.answerIntent"

    iget-object v1, p0, Lk2/k$g;->g:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "android.declineIntent"

    iget-object v1, p0, Lk2/k$g;->h:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "android.hangUpIntent"

    iget-object v1, p0, Lk2/k$g;->i:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lk2/k$g;->k:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v1, "android.answerColor"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    iget-object v0, p0, Lk2/k$g;->l:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v1, "android.declineColor"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_4
    return-void
.end method

.method public b(Lk2/j;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_8

    iget v0, p0, Lk2/k$g;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "NotifCompat"

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized call type in CallStyle: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lk2/k$g;->e:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk2/k$g;->f:Lk2/r;

    invoke-virtual {v0}, Lk2/r;->i()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Lk2/k$g;->i:Landroid/app/PendingIntent;

    iget-object v2, p0, Lk2/k$g;->g:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, Lk2/k$g$d;->c(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk2/k$g;->f:Lk2/r;

    invoke-virtual {v0}, Lk2/r;->i()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Lk2/k$g;->i:Landroid/app/PendingIntent;

    invoke-static {v0, v1}, Lk2/k$g$d;->b(Landroid/app/Person;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lk2/k$g;->f:Lk2/r;

    invoke-virtual {v0}, Lk2/r;->i()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Lk2/k$g;->h:Landroid/app/PendingIntent;

    iget-object v2, p0, Lk2/k$g;->g:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, Lk2/k$g$d;->a(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v2

    :cond_3
    :goto_0
    if-eqz v2, :cond_7

    invoke-interface {p1}, Lk2/j;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/app/Notification$CallStyle;->setBuilder(Landroid/app/Notification$Builder;)V

    iget-object p1, p0, Lk2/k$g;->k:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v2, p1}, Lk2/k$g$d;->d(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    :cond_4
    iget-object p1, p0, Lk2/k$g;->l:Ljava/lang/Integer;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v2, p1}, Lk2/k$g$d;->e(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    :cond_5
    iget-object p1, p0, Lk2/k$g;->n:Ljava/lang/CharSequence;

    invoke-static {v2, p1}, Lk2/k$g$d;->h(Landroid/app/Notification$CallStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$CallStyle;

    iget-object p1, p0, Lk2/k$g;->m:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz p1, :cond_6

    iget-object v0, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v0, v0, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroidx/core/graphics/drawable/IconCompat;->p(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v2, p1}, Lk2/k$g$d;->g(Landroid/app/Notification$CallStyle;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$CallStyle;

    :cond_6
    iget-boolean p1, p0, Lk2/k$g;->j:Z

    invoke-static {v2, p1}, Lk2/k$g$d;->f(Landroid/app/Notification$CallStyle;Z)Landroid/app/Notification$CallStyle;

    :cond_7
    return-void

    :cond_8
    invoke-interface {p1}, Lk2/j;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v1, p0, Lk2/k$g;->f:Lk2/r;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lk2/r;->d()Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_1

    :cond_9
    move-object v1, v2

    :goto_1
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v1, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v1, v1, Lk2/k$f;->E:Landroid/os/Bundle;

    if-eqz v1, :cond_a

    const-string v3, "android.text"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v1, v1, Lk2/k$f;->E:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    :cond_a
    if-nez v2, :cond_b

    invoke-virtual {p0}, Lk2/k$g;->j()Ljava/lang/String;

    move-result-object v2

    :cond_b
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v1, p0, Lk2/k$g;->f:Lk2/r;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lk2/r;->b()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lk2/k$g;->f:Lk2/r;

    invoke-virtual {v1}, Lk2/r;->b()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    iget-object v2, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v2, v2, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroidx/core/graphics/drawable/IconCompat;->p(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {p1, v1}, Lk2/k$g$b;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)V

    :cond_c
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_d

    iget-object v0, p0, Lk2/k$g;->f:Lk2/r;

    invoke-virtual {v0}, Lk2/r;->i()Landroid/app/Person;

    move-result-object v0

    invoke-static {p1, v0}, Lk2/k$g$c;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_2

    :cond_d
    iget-object v0, p0, Lk2/k$g;->f:Lk2/r;

    invoke-virtual {v0}, Lk2/r;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lk2/k$g$a;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_e
    :goto_2
    const-string v0, "call"

    invoke-static {p1, v0}, Lk2/k$g$a;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$CallStyle"

    return-object v0
.end method

.method public i()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lk2/k$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lk2/k$g;->n()Lk2/k$a;

    move-result-object v0

    invoke-virtual {p0}, Lk2/k$g;->m()Lk2/k$a;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v0, v0, Lk2/k$f;->b:Ljava/util/ArrayList;

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :cond_0
    :goto_0
    if-ge v6, v5, :cond_3

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Lk2/k$a;

    invoke-virtual {v7}, Lk2/k$a;->j()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v7}, Lk2/k$g;->k(Lk2/k$a;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, -0x1

    :goto_1
    if-eqz v1, :cond_0

    if-ne v4, v3, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    if-lt v4, v3, :cond_4

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v2
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lk2/k$g;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v0, v0, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lj2/f;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v0, v0, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lj2/f;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v0, v0, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lj2/f;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lk2/k$a;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk2/k$a;->c()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_action_priority"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final l(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lk2/k$a;
    .locals 2

    if-nez p3, :cond_0

    iget-object p3, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object p3, p3, Lk2/k$f;->a:Landroid/content/Context;

    invoke-static {p3, p4}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_0
    new-instance p4, Landroid/text/SpannableStringBuilder;

    invoke-direct {p4}, Landroid/text/SpannableStringBuilder;-><init>()V

    iget-object v0, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object v0, v0, Lk2/k$f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p3

    const/16 v0, 0x12

    const/4 v1, 0x0

    invoke-virtual {p4, p2, v1, p3, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    new-instance p2, Lk2/k$a$a;

    iget-object p3, p0, Lk2/k$i;->a:Lk2/k$f;

    iget-object p3, p3, Lk2/k$f;->a:Landroid/content/Context;

    invoke-static {p3, p1}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    invoke-direct {p2, p1, p4, p5}, Lk2/k$a$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p2}, Lk2/k$a$a;->b()Lk2/k$a;

    move-result-object p1

    invoke-virtual {p1}, Lk2/k$a;->c()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "key_action_priority"

    const/4 p4, 0x1

    invoke-virtual {p2, p3, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p1
.end method

.method public final m()Lk2/k$a;
    .locals 8

    sget v0, Lj2/d;->b:I

    sget v1, Lj2/d;->a:I

    iget-object v7, p0, Lk2/k$g;->g:Landroid/app/PendingIntent;

    if-nez v7, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-boolean v2, p0, Lk2/k$g;->j:Z

    if-eqz v2, :cond_1

    move v3, v0

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    if-eqz v2, :cond_2

    sget v0, Lj2/f;->b:I

    :goto_1
    move v4, v0

    goto :goto_2

    :cond_2
    sget v0, Lj2/f;->a:I

    goto :goto_1

    :goto_2
    iget-object v5, p0, Lk2/k$g;->k:Ljava/lang/Integer;

    sget v6, Lj2/b;->a:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lk2/k$g;->l(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lk2/k$a;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lk2/k$a;
    .locals 6

    sget v1, Lj2/d;->c:I

    iget-object v5, p0, Lk2/k$g;->h:Landroid/app/PendingIntent;

    if-nez v5, :cond_0

    sget v2, Lj2/f;->d:I

    iget-object v3, p0, Lk2/k$g;->l:Ljava/lang/Integer;

    sget v4, Lj2/b;->b:I

    iget-object v5, p0, Lk2/k$g;->i:Landroid/app/PendingIntent;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lk2/k$g;->l(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lk2/k$a;

    move-result-object v1

    return-object v1

    :cond_0
    move-object v0, p0

    sget v2, Lj2/f;->c:I

    iget-object v3, v0, Lk2/k$g;->l:Ljava/lang/Integer;

    sget v4, Lj2/b;->b:I

    invoke-virtual/range {v0 .. v5}, Lk2/k$g;->l(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lk2/k$a;

    move-result-object v1

    return-object v1
.end method

.method public o(I)Lk2/k$g;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lk2/k$g;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public p(I)Lk2/k$g;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lk2/k$g;->l:Ljava/lang/Integer;

    return-object p0
.end method
