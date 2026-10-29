.class public final synthetic Le4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/i$d;

.field public final synthetic b:Landroidx/fragment/app/b$g;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/i$d;Landroidx/fragment/app/b$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/e;->a:Landroidx/fragment/app/i$d;

    iput-object p2, p0, Le4/e;->b:Landroidx/fragment/app/b$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le4/e;->a:Landroidx/fragment/app/i$d;

    iget-object v1, p0, Le4/e;->b:Landroidx/fragment/app/b$g;

    invoke-static {v0, v1}, Landroidx/fragment/app/b$g;->l(Landroidx/fragment/app/i$d;Landroidx/fragment/app/b$g;)V

    return-void
.end method
