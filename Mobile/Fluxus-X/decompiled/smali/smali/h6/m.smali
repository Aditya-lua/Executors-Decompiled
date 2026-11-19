.class public final synthetic Lh6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lh6/n;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lh6/n;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/m;->a:Lh6/n;

    iput p2, p0, Lh6/m;->b:I

    iput p3, p0, Lh6/m;->c:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lh6/m;->a:Lh6/n;

    iget v1, p0, Lh6/m;->b:I

    iget v2, p0, Lh6/m;->c:I

    invoke-static {v0, v1, v2}, Lh6/n;->a(Lh6/n;II)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
