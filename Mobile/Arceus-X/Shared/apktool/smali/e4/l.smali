.class public final synthetic Le4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/c;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/l;->a:Landroidx/fragment/app/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le4/l;->a:Landroidx/fragment/app/c;

    invoke-static {v0}, Landroidx/fragment/app/c;->i(Landroidx/fragment/app/c;)V

    return-void
.end method
