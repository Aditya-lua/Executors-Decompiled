.class public Lig/a;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field public static a:Lff/l;

.field public static b:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lff/l;->e()Lff/l;

    move-result-object v0

    sput-object v0, Lig/a;->a:Lff/l;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lig/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static a()Lff/l;
    .locals 1

    sget-object v0, Lig/a;->a:Lff/l;

    return-object v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lig/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
