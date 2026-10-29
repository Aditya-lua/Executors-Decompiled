.class public final synthetic Lo5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/e$a;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lo5/q;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lo5/q;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/f;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lo5/f;->b:Lo5/q;

    iput-object p3, p0, Lo5/f;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 3

    iget-object v0, p0, Lo5/f;->a:Ljava/lang/Runnable;

    iget-object v1, p0, Lo5/f;->b:Lo5/q;

    iget-object v2, p0, Lo5/f;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, Lo5/g;->C(Ljava/lang/Runnable;Lo5/q;Ljava/lang/Runnable;)V

    return-void
.end method
