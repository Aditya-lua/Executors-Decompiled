.class public final synthetic Le/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/f$b;


# instance fields
.field public final synthetic a:Le/p;


# direct methods
.method public synthetic constructor <init>(Le/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k;->a:Le/p;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Le/k;->a:Le/p;

    invoke-static {v0}, Le/p;->x0(Le/p;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
