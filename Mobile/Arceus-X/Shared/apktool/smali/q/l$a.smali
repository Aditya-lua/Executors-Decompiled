.class public Lq/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lq/l;


# direct methods
.method public constructor <init>(Lq/l;)V
    .locals 0

    iput-object p1, p0, Lq/l$a;->a:Lq/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/textclassifier/TextClassifier;
    .locals 1

    iget-object v0, p0, Lq/l$a;->a:Lq/l;

    invoke-static {v0}, Lq/l;->b(Lq/l;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/view/textclassifier/TextClassifier;)V
    .locals 1

    iget-object v0, p0, Lq/l$a;->a:Lq/l;

    invoke-static {v0, p1}, Lq/l;->c(Lq/l;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method
