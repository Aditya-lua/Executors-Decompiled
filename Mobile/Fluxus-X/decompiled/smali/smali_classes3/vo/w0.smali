.class public final synthetic Lvo/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/d2;

.field public final synthetic b:Lvo/i3$a;

.field public final synthetic c:Lvo/j0;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lvo/d2;Lvo/i3$a;Lvo/j0;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/w0;->a:Lvo/d2;

    iput-object p2, p0, Lvo/w0;->b:Lvo/i3$a;

    iput-object p3, p0, Lvo/w0;->c:Lvo/j0;

    iput-object p4, p0, Lvo/w0;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvo/w0;->a:Lvo/d2;

    iget-object v1, p0, Lvo/w0;->b:Lvo/i3$a;

    iget-object v2, p0, Lvo/w0;->c:Lvo/j0;

    iget-object v3, p0, Lvo/w0;->d:Lln/k$a;

    check-cast p1, Lvo/j$a;

    invoke-static {v0, v1, v2, v3, p1}, Lvo/d2;->B(Lvo/d2;Lvo/i3$a;Lvo/j0;Lln/k$a;Lvo/j$a;)Lln/r;

    move-result-object p1

    return-object p1
.end method
