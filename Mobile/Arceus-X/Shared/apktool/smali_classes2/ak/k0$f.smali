.class public Lak/k0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lak/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "RBXThemeOverride"

    const-string v1, "RBXHideThemeSetting"

    invoke-static {v0, v1}, Lak/l0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lak/k0$f;->a:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic a()Ljava/util/Set;
    .locals 1

    sget-object v0, Lak/k0$f;->a:Ljava/util/Set;

    return-object v0
.end method
