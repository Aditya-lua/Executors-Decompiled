.class public Lf1/r0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/a3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/r0;->S(Lf1/r0$l;)Lf1/r0$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/a3$a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf1/r0;


# direct methods
.method public constructor <init>(Lf1/r0;)V
    .locals 0

    iput-object p1, p0, Lf1/r0$g;->a:Lf1/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lf1/r0$g;->b(Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lf1/r0$g;->a:Lf1/r0;

    invoke-static {v0}, Lf1/r0;->w(Lf1/r0;)Ln0/y2;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln0/y2;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lf1/r0$g;->a:Lf1/r0;

    invoke-static {v0}, Lf1/r0;->w(Lf1/r0;)Ln0/y2;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln0/y2;->j(Ljava/lang/Throwable;)V

    return-void
.end method
