.class public final synthetic Len/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Len/e;


# direct methods
.method public synthetic constructor <init>(Len/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Len/a;->a:Len/e;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Len/a;->a:Len/e;

    invoke-static {v0, p1}, Len/c;->e(Len/e;Landroid/content/DialogInterface;)V

    return-void
.end method
