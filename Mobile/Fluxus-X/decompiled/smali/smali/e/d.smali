.class public final synthetic Le/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le/p;

.field public final synthetic b:Le/p0;


# direct methods
.method public synthetic constructor <init>(Le/p;Le/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/d;->a:Le/p;

    iput-object p2, p0, Le/d;->b:Le/p0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/d;->a:Le/p;

    iget-object v1, p0, Le/d;->b:Le/p0;

    invoke-static {v0, v1}, Le/p;->u0(Le/p;Le/p0;)V

    return-void
.end method
