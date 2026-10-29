.class public final synthetic Li8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/r;

.field public final synthetic b:Lb8/o;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Li8/r;Lb8/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/j;->a:Li8/r;

    iput-object p2, p0, Li8/j;->b:Lb8/o;

    iput p3, p0, Li8/j;->c:I

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li8/j;->a:Li8/r;

    iget-object v1, p0, Li8/j;->b:Lb8/o;

    iget v2, p0, Li8/j;->c:I

    invoke-static {v0, v1, v2}, Li8/r;->f(Li8/r;Lb8/o;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
