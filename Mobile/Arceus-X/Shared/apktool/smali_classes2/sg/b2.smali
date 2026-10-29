.class public final synthetic Lsg/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsg/y1$i;

.field public final synthetic b:Le4/q;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Lsg/y1$i;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/b2;->a:Lsg/y1$i;

    iput-object p2, p0, Lsg/b2;->b:Le4/q;

    iput-object p3, p0, Lsg/b2;->c:Ljava/lang/String;

    iput-object p4, p0, Lsg/b2;->d:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lsg/b2;->a:Lsg/y1$i;

    iget-object v1, p0, Lsg/b2;->b:Le4/q;

    iget-object v2, p0, Lsg/b2;->c:Ljava/lang/String;

    iget-object v3, p0, Lsg/b2;->d:Landroid/webkit/WebView;

    invoke-static {v0, v1, v2, v3}, Lsg/y1$i;->a(Lsg/y1$i;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method
