.class public final synthetic Lmi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/y;


# instance fields
.field public final synthetic a:Lmi/c;


# direct methods
.method public synthetic constructor <init>(Lmi/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi/b;->a:Lmi/c;

    return-void
.end method


# virtual methods
.method public final K(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1

    iget-object v0, p0, Lmi/b;->a:Lmi/c;

    invoke-static {v0, p1, p2}, Lmi/c;->a(Lmi/c;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method
