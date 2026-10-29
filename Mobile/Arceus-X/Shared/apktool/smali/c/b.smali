.class public interface abstract Lc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b$b;,
        Lc/b$a;
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$customtabs$ICustomTabsService"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/b;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract J(Lc/a;)Z
.end method

.method public abstract h1(J)Z
.end method

.method public abstract j1(Lc/a;Landroid/net/Uri;)Z
.end method

.method public abstract l2(Lc/a;Landroid/net/Uri;Landroid/os/Bundle;)Z
.end method

.method public abstract m(Lc/a;Landroid/os/Bundle;)Z
.end method

.method public abstract w0(Lc/a;Ljava/lang/String;Landroid/os/Bundle;)I
.end method
