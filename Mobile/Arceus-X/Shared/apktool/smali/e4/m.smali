.class public final synthetic Le4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/f$b;


# instance fields
.field public final synthetic a:Le4/q;


# direct methods
.method public synthetic constructor <init>(Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/m;->a:Le4/q;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Le4/m;->a:Le4/q;

    invoke-static {v0}, Le4/q;->i1(Le4/q;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
