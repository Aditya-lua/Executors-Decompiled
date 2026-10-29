.class public final synthetic Lf1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf1/r0;


# direct methods
.method public synthetic constructor <init>(Lf1/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/b0;->a:Lf1/r0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf1/b0;->a:Lf1/r0;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lf1/r0;->k(Lf1/r0;Landroid/net/Uri;)V

    return-void
.end method
