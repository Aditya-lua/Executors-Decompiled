.class public final synthetic Lon/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/f$b;


# instance fields
.field public final synthetic a:Lon/f;


# direct methods
.method public synthetic constructor <init>(Lon/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lon/e;->a:Lon/f;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lon/e;->a:Lon/f;

    invoke-static {v0}, Lon/f;->a(Lon/f;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
