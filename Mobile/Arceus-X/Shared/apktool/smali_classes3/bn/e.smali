.class public final synthetic Lbn/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/f$b;


# instance fields
.field public final synthetic a:Lbn/f;


# direct methods
.method public synthetic constructor <init>(Lbn/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbn/e;->a:Lbn/f;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lbn/e;->a:Lbn/f;

    invoke-static {v0}, Lbn/f;->a(Lbn/f;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
