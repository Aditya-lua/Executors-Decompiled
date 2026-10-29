.class public final synthetic Ljr/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/h;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput p2, p0, Ljr/h;->b:I

    iput p3, p0, Ljr/h;->c:I

    iput p4, p0, Ljr/h;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ljr/h;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget v1, p0, Ljr/h;->b:I

    iget v2, p0, Ljr/h;->c:I

    iget v3, p0, Ljr/h;->d:I

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Ljr/o;->c(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
