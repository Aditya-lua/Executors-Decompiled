.class public final synthetic Lf1/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/l;


# direct methods
.method public synthetic constructor <init>(Lm1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/q0;->a:Lm1/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/q0;->a:Lm1/l;

    invoke-static {v0}, Lf1/r0;->i(Lm1/l;)V

    return-void
.end method
