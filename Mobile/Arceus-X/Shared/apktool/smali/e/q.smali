.class public final synthetic Le/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le/p$e;


# direct methods
.method public synthetic constructor <init>(Le/p$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q;->a:Le/p$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/q;->a:Le/p$e;

    invoke-static {v0}, Le/p$e;->b(Le/p$e;)V

    return-void
.end method
