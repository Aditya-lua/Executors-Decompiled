.class public final synthetic Lvo/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0;

.field public final synthetic b:Lvo/n$b;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lvo/j0;Lvo/n$b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/s1;->a:Lvo/j0;

    iput-object p2, p0, Lvo/s1;->b:Lvo/n$b;

    iput-object p3, p0, Lvo/s1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvo/s1;->a:Lvo/j0;

    iget-object v1, p0, Lvo/s1;->b:Lvo/n$b;

    iget-object v2, p0, Lvo/s1;->c:Ljava/lang/String;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lvo/d2;->K(Lvo/j0;Lvo/n$b;Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
