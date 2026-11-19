.class public final synthetic Les/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lur/d;

.field public final synthetic c:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

.field public final synthetic d:Les/s6$d$a;

.field public final synthetic e:Lqr/x5;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lur/d;Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Les/s6$d$a;Lqr/x5;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/w3;->a:Ljava/util/List;

    iput-object p2, p0, Les/w3;->b:Lur/d;

    iput-object p3, p0, Les/w3;->c:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    iput-object p4, p0, Les/w3;->d:Les/s6$d$a;

    iput-object p5, p0, Les/w3;->e:Lqr/x5;

    iput-object p6, p0, Les/w3;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 11

    iget-object v0, p0, Les/w3;->a:Ljava/util/List;

    iget-object v1, p0, Les/w3;->b:Lur/d;

    iget-object v2, p0, Les/w3;->c:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    iget-object v3, p0, Les/w3;->d:Les/s6$d$a;

    iget-object v4, p0, Les/w3;->e:Lqr/x5;

    iget-object v5, p0, Les/w3;->f:Ljava/util/List;

    move-object v6, p1

    move-object v7, p2

    move v8, p3

    move-wide v9, p4

    invoke-static/range {v0 .. v10}, Les/h4;->d(Ljava/util/List;Lur/d;Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Les/s6$d$a;Lqr/x5;Ljava/util/List;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method
