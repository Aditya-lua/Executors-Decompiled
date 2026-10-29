.class public final synthetic Lf1/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf1/s0;->a:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lf1/s0;->a:I

    check-cast p1, Lf1/c2$a;

    invoke-static {v0, p1}, Lf1/r0$i;->b(ILf1/c2$a;)V

    return-void
.end method
