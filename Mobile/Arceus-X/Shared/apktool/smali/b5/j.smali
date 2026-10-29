.class public final synthetic Lb5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lb5/g$b;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lb5/g$b;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/j;->a:Lb5/g$b;

    iput-object p2, p0, Lb5/j;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb5/j;->a:Lb5/g$b;

    iget-object v1, p0, Lb5/j;->b:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lg5/c;

    invoke-static {v0, v1, p1}, Lb5/g$b;->c(Lb5/g$b;Lkotlin/jvm/functions/Function1;Lg5/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
