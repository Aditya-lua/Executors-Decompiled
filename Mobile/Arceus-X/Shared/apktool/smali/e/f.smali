.class public final synthetic Le/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic a:Le/p0;

.field public final synthetic b:Le/p;


# direct methods
.method public synthetic constructor <init>(Le/p0;Le/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f;->a:Le/p0;

    iput-object p2, p0, Le/f;->b:Le/p;

    return-void
.end method


# virtual methods
.method public final g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 2

    iget-object v0, p0, Le/f;->a:Le/p0;

    iget-object v1, p0, Le/f;->b:Le/p;

    invoke-static {v0, v1, p1, p2}, Le/p;->y0(Le/p0;Le/p;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    return-void
.end method
