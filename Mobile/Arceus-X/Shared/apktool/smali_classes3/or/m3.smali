.class public final synthetic Lor/m3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic c:Lcr/w3;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/m3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lor/m3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Lor/m3;->c:Lcr/w3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/m3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v1, p0, Lor/m3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Lor/m3;->c:Lcr/w3;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->G(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w3;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
