.class public final synthetic Lei/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lei/f;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lei/f$h;


# direct methods
.method public synthetic constructor <init>(Lei/f;Landroid/content/Context;Lei/f$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei/e;->a:Lei/f;

    iput-object p2, p0, Lei/e;->b:Landroid/content/Context;

    iput-object p3, p0, Lei/e;->c:Lei/f$h;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lei/e;->a:Lei/f;

    iget-object v1, p0, Lei/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lei/e;->c:Lei/f$h;

    invoke-static {v0, v1, v2}, Lei/f;->c(Lei/f;Landroid/content/Context;Lei/f$h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
