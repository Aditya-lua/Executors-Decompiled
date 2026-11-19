.class public final synthetic Lf1/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0;


# direct methods
.method public synthetic constructor <init>(Lf1/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/l0;->a:Lf1/r0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/l0;->a:Lf1/r0;

    invoke-virtual {v0}, Lf1/r0;->B0()V

    return-void
.end method
