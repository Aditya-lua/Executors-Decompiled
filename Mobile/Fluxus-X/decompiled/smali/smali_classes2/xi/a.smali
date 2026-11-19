.class public final synthetic Lxi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/a;->a:Landroid/app/Activity;

    iput-boolean p2, p0, Lxi/a;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxi/a;->a:Landroid/app/Activity;

    iget-boolean v1, p0, Lxi/a;->b:Z

    invoke-static {v0, v1}, Lxi/b;->a(Landroid/app/Activity;Z)V

    return-void
.end method
