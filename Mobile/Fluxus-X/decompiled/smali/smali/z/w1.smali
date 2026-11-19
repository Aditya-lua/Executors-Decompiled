.class public final synthetic Lz/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/f1$j;


# direct methods
.method public synthetic constructor <init>(Lg0/f1$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/w1;->a:Lg0/f1$j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/w1;->a:Lg0/f1$j;

    invoke-interface {v0}, Lg0/f1$j;->clear()V

    return-void
.end method
