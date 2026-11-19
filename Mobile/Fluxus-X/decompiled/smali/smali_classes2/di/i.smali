.class public final synthetic Ldi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ldi/j;


# direct methods
.method public synthetic constructor <init>(Ldi/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/i;->a:Ldi/j;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ldi/i;->a:Ldi/j;

    invoke-static {v0, p1}, Ldi/j;->i3(Ldi/j;Landroid/view/View;)V

    return-void
.end method
