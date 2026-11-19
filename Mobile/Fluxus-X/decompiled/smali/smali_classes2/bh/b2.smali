.class public final synthetic Lbh/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbh/y1$i;

.field public final synthetic b:Lf4/v;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Lbh/y1$i;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/b2;->a:Lbh/y1$i;

    iput-object p2, p0, Lbh/b2;->b:Lf4/v;

    iput-object p3, p0, Lbh/b2;->c:Ljava/lang/String;

    iput-object p4, p0, Lbh/b2;->d:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lbh/b2;->a:Lbh/y1$i;

    iget-object v1, p0, Lbh/b2;->b:Lf4/v;

    iget-object v2, p0, Lbh/b2;->c:Ljava/lang/String;

    iget-object v3, p0, Lbh/b2;->d:Landroid/webkit/WebView;

    invoke-static {v0, v1, v2, v3}, Lbh/y1$i;->b(Lbh/y1$i;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method
