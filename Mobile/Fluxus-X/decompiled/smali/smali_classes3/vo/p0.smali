.class public final synthetic Lvo/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/h;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lvo/d2;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lvo/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/p0;->a:Lln/k$a;

    iput-object p2, p0, Lvo/p0;->b:Lvo/d2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lvo/p0;->a:Lln/k$a;

    iget-object v1, p0, Lvo/p0;->b:Lvo/d2;

    check-cast p1, Lvo/d2$b;

    invoke-static {v0, v1, p1}, Lvo/d2;->R(Lln/k$a;Lvo/d2;Lvo/d2$b;)V

    return-void
.end method
