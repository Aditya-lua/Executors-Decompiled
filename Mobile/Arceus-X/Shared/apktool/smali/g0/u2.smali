.class public final synthetic Lg0/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx2/a;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lx2/a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/u2;->a:Lx2/a;

    iput-object p2, p0, Lg0/u2;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/u2;->a:Lx2/a;

    iget-object v1, p0, Lg0/u2;->b:Landroid/view/Surface;

    invoke-static {v0, v1}, Lg0/v2;->i(Lx2/a;Landroid/view/Surface;)V

    return-void
.end method
