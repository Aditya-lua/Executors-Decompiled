.class public final Lnb/n6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lnb/g7;


# direct methods
.method public constructor <init>(Lnb/me;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lnb/me;->g0()Lnb/g7;

    move-result-object p1

    iput-object p1, p0, Lnb/n6;->a:Lnb/g7;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to get PackageManager for Install Referrer Play Store compatibility check"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    const-string v1, "com.android.vending"

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Lw9/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0x4d17ab4

    if-lt v1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :goto_0
    iget-object v2, p0, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to retrieve Play Store version for Install Referrer"

    invoke-virtual {v2, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method
