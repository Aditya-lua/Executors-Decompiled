.class public final synthetic Les/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic c:Lqr/k4;


# direct methods
.method public synthetic constructor <init>(Les/h4;Lcom/google/android/material/textfield/TextInputLayout;Lqr/k4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/t3;->a:Les/h4;

    iput-object p2, p0, Les/t3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Les/t3;->c:Lqr/k4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/t3;->a:Les/h4;

    iget-object v1, p0, Les/t3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Les/t3;->c:Lqr/k4;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Les/h4;->G(Les/h4;Lcom/google/android/material/textfield/TextInputLayout;Lqr/k4;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
