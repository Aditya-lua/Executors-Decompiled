.class public final synthetic Lf1/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf1/t;


# direct methods
.method public synthetic constructor <init>(Lf1/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/v0;->a:Lf1/t;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf1/v0;->a:Lf1/t;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lf1/r0$j;->d(Lf1/t;Landroid/net/Uri;)V

    return-void
.end method
