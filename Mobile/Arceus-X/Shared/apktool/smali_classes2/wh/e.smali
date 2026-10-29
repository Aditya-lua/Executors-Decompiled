.class public final synthetic Lwh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lwh/f;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lwh/f$h;


# direct methods
.method public synthetic constructor <init>(Lwh/f;Landroid/content/Context;Lwh/f$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/e;->a:Lwh/f;

    iput-object p2, p0, Lwh/e;->b:Landroid/content/Context;

    iput-object p3, p0, Lwh/e;->c:Lwh/f$h;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwh/e;->a:Lwh/f;

    iget-object v1, p0, Lwh/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lwh/e;->c:Lwh/f$h;

    invoke-static {v0, v1, v2}, Lwh/f;->c(Lwh/f;Landroid/content/Context;Lwh/f$h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
