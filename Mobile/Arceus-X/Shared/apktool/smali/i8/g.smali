.class public final synthetic Li8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li8/r;

.field public final synthetic b:Lb8/o;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Li8/r;Lb8/o;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/g;->a:Li8/r;

    iput-object p2, p0, Li8/g;->b:Lb8/o;

    iput p3, p0, Li8/g;->c:I

    iput-object p4, p0, Li8/g;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Li8/g;->a:Li8/r;

    iget-object v1, p0, Li8/g;->b:Lb8/o;

    iget v2, p0, Li8/g;->c:I

    iget-object v3, p0, Li8/g;->d:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Li8/r;->i(Li8/r;Lb8/o;ILjava/lang/Runnable;)V

    return-void
.end method
