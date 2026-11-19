.class public Lf4/q$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/q;->h(Lh/a;Lg/b;)Lg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt/a<",
        "Ljava/lang/Void;",
        "Lg/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf4/q;


# direct methods
.method public constructor <init>(Lf4/q;)V
    .locals 0

    iput-object p1, p0, Lf4/q$h;->a:Lf4/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)Lg/g;
    .locals 2

    iget-object p1, p0, Lf4/q$h;->a:Lf4/q;

    iget-object v0, p1, Lf4/q;->w:Lf4/a0;

    instance-of v1, v0, Lg/h;

    if-eqz v1, :cond_0

    check-cast v0, Lg/h;

    invoke-interface {v0}, Lg/h;->q()Lg/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lf4/q;->H1()Lf4/v;

    move-result-object p1

    invoke-virtual {p1}, Le/p;->q()Lg/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lf4/q$h;->a(Ljava/lang/Void;)Lg/g;

    move-result-object p1

    return-object p1
.end method
