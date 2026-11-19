.class public final synthetic Lf1/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0$k$a;


# direct methods
.method public synthetic constructor <init>(Lf1/r0$k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/c1;->a:Lf1/r0$k$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/c1;->a:Lf1/r0$k$a;

    invoke-static {v0}, Lf1/r0$k$a;->a(Lf1/r0$k$a;)V

    return-void
.end method
