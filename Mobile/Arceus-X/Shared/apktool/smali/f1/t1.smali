.class public final synthetic Lf1/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/z1;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lf1/z1;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/t1;->a:Lf1/z1;

    iput-object p2, p0, Lf1/t1;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf1/t1;->a:Lf1/z1;

    iget-object v1, p0, Lf1/t1;->b:Landroid/view/Surface;

    invoke-static {v0, v1}, Lf1/z1;->b(Lf1/z1;Landroid/view/Surface;)V

    return-void
.end method
