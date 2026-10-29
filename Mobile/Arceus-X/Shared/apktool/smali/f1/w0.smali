.class public final synthetic Lf1/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf1/t;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lf1/t;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/w0;->a:Lf1/t;

    iput-object p2, p0, Lf1/w0;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lf1/w0;->a:Lf1/t;

    iget-object v1, p0, Lf1/w0;->b:Landroid/content/Context;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lf1/r0$j;->c(Lf1/t;Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method
