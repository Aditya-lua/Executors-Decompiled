.class public final synthetic Lbn/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbn/k;

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lbn/k;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbn/i;->a:Lbn/k;

    iput-object p2, p0, Lbn/i;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbn/i;->a:Lbn/k;

    iget-object v1, p0, Lbn/i;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lbn/k;->b(Lbn/k;Landroid/app/Activity;)V

    return-void
.end method
