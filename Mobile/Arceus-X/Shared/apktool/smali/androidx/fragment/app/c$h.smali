.class public Landroidx/fragment/app/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/c;->h(Lh/a;Lg/a;)Lg/c;
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
        "Lg/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c$h;->a:Landroidx/fragment/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)Lg/f;
    .locals 2

    iget-object p1, p0, Landroidx/fragment/app/c$h;->a:Landroidx/fragment/app/c;

    iget-object v0, p1, Landroidx/fragment/app/c;->w:Le4/t;

    instance-of v1, v0, Lg/g;

    if-eqz v1, :cond_0

    check-cast v0, Lg/g;

    invoke-interface {v0}, Lg/g;->q()Lg/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/c;->H1()Le4/q;

    move-result-object p1

    invoke-virtual {p1}, Le/p;->q()Lg/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/c$h;->a(Ljava/lang/Void;)Lg/f;

    move-result-object p1

    return-object p1
.end method
