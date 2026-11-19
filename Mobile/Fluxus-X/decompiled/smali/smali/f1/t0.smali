.class public final synthetic Lf1/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf1/a0;


# direct methods
.method public synthetic constructor <init>(Lf1/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/t0;->a:Lf1/a0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf1/t0;->a:Lf1/a0;

    check-cast p1, Lf1/c2$a;

    invoke-static {v0, p1}, Lf1/r0$i;->a(Lf1/a0;Lf1/c2$a;)V

    return-void
.end method
