.class public final synthetic Le4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/b;

.field public final synthetic b:Landroidx/fragment/app/i$d;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/b;Landroidx/fragment/app/i$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/a;->a:Landroidx/fragment/app/b;

    iput-object p2, p0, Le4/a;->b:Landroidx/fragment/app/i$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le4/a;->a:Landroidx/fragment/app/b;

    iget-object v1, p0, Le4/a;->b:Landroidx/fragment/app/i$d;

    invoke-static {v0, v1}, Landroidx/fragment/app/b;->E(Landroidx/fragment/app/b;Landroidx/fragment/app/i$d;)V

    return-void
.end method
