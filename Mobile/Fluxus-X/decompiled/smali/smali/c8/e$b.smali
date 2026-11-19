.class public final Lc8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/u$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lc8/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lc8/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)Lc8/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lc8/e$b;->b(Landroid/content/Context;)Lc8/e$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;)Lc8/e$b;
    .locals 0

    invoke-static {p1}, Le8/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lc8/e$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public build()Lc8/u;
    .locals 3

    iget-object v0, p0, Lc8/e$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Le8/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lc8/e;

    iget-object v1, p0, Lc8/e$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc8/e;-><init>(Landroid/content/Context;Lc8/e$a;)V

    return-object v0
.end method
