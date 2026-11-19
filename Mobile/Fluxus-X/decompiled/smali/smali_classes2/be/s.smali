.class public final Lbe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/Set;

.field public final synthetic b:Lbe/a;


# direct methods
.method public constructor <init>(Lbe/a;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lbe/s;->b:Lbe/a;

    iput-object p2, p0, Lbe/s;->a:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lbe/s;->b:Lbe/a;

    iget-object v1, p0, Lbe/s;->a:Ljava/util/Set;

    invoke-static {v0, v1}, Lbe/a;->e(Lbe/a;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "SplitCompat"

    const-string v2, "Failed to remove from splitcompat storage split that is already installed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
