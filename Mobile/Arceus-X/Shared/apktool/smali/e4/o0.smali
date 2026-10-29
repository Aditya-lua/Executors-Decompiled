.class public final synthetic Le4/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/i;

.field public final synthetic b:Landroidx/fragment/app/i$c;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/i;Landroidx/fragment/app/i$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/o0;->a:Landroidx/fragment/app/i;

    iput-object p2, p0, Le4/o0;->b:Landroidx/fragment/app/i$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le4/o0;->a:Landroidx/fragment/app/i;

    iget-object v1, p0, Le4/o0;->b:Landroidx/fragment/app/i$c;

    invoke-static {v0, v1}, Landroidx/fragment/app/i;->b(Landroidx/fragment/app/i;Landroidx/fragment/app/i$c;)V

    return-void
.end method
