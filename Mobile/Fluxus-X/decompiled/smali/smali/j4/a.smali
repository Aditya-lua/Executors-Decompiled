.class public final synthetic Lj4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/f$b;


# instance fields
.field public final synthetic a:Lj4/b;


# direct methods
.method public synthetic constructor <init>(Lj4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/a;->a:Lj4/b;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lj4/a;->a:Lj4/b;

    invoke-static {v0}, Lj4/b;->a(Lj4/b;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
