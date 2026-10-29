.class public final synthetic Ljr/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/y;->a:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljr/y;->a:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast p1, Landroid/graphics/Typeface;

    invoke-static {v0, p1}, Ljr/d0;->d(Lcom/google/android/material/textfield/TextInputLayout;Landroid/graphics/Typeface;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
