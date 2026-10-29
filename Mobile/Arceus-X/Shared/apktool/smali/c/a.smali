.class public interface abstract Lc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a$b;,
        Lc/a$a;
    }
.end annotation


# static fields
.field public static final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$customtabs$ICustomTabsCallback"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/a;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract L1(ILandroid/os/Bundle;)V
.end method

.method public abstract M(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public abstract c2(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract g2(Landroid/os/Bundle;)V
.end method

.method public abstract j2(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end method

.method public abstract l1(Landroid/os/Bundle;)V
.end method

.method public abstract m0(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract p0(Landroid/os/Bundle;)V
.end method

.method public abstract q1(Landroid/os/Bundle;)V
.end method

.method public abstract w1(IILandroid/os/Bundle;)V
.end method

.method public abstract z(IIIIILandroid/os/Bundle;)V
.end method
