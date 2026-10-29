.class public final synthetic Le4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Le4/q;


# direct methods
.method public synthetic constructor <init>(Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/o;->a:Le4/q;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le4/o;->a:Le4/q;

    check-cast p1, Landroid/content/Intent;

    invoke-static {v0, p1}, Le4/q;->j1(Le4/q;Landroid/content/Intent;)V

    return-void
.end method
