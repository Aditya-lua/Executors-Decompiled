.class public final Lob/s6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lob/l7;


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lob/ve;->g0()Lob/l7;

    move-result-object p1

    iput-object p1, p0, Lob/s6;->a:Lob/l7;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lob/s6;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lx9/c;->a(Landroid/content/Context;)Lx9/b;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to get PackageManager for Install Referrer Play Store compatibility check"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    const-string v1, "com.android.vending"

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Lx9/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

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
    iget-object v2, p0, Lob/s6;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    const-string v3, "Failed to retrieve Play Store version for Install Referrer"

    invoke-virtual {v2, v3, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method
