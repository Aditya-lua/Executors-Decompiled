.class public final synthetic Lp1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/f1$k;


# direct methods
.method public synthetic constructor <init>(Lg0/f1$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/e0;->a:Lg0/f1$k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp1/e0;->a:Lg0/f1$k;

    invoke-interface {v0}, Lg0/f1$k;->a()V

    return-void
.end method
