.class public final synthetic Ln2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln2/h$f;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ln2/h$f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln2/j;->a:Ln2/h$f;

    iput p2, p0, Ln2/j;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln2/j;->a:Ln2/h$f;

    iget v1, p0, Ln2/j;->b:I

    invoke-static {v0, v1}, Ln2/h$f;->b(Ln2/h$f;I)V

    return-void
.end method
