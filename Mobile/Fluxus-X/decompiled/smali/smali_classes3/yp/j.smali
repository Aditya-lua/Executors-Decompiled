.class public final Lyp/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyp/j$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lyp/j;
    .locals 1

    sget-object v0, Lyp/j$a;->a:Lyp/j;

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;)Lyp/i;
    .locals 1

    new-instance v0, Lyp/i;

    invoke-direct {v0, p0}, Lyp/i;-><init>(Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lyp/i;
    .locals 0

    invoke-static {p1}, Lyp/j;->c(Landroidx/lifecycle/l0;)Lyp/i;

    move-result-object p1

    return-object p1
.end method
