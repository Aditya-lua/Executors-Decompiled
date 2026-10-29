.class public final synthetic Le4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/b$g;

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/b$g;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/i;->a:Landroidx/fragment/app/b$g;

    iput-object p2, p0, Le4/i;->b:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le4/i;->a:Landroidx/fragment/app/b$g;

    iget-object v1, p0, Le4/i;->b:Landroid/view/ViewGroup;

    invoke-static {v0, v1}, Landroidx/fragment/app/b$g$b$a;->a(Landroidx/fragment/app/b$g;Landroid/view/ViewGroup;)V

    return-void
.end method
