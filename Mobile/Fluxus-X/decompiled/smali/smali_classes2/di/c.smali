.class public final synthetic Ldi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ldi/d;


# direct methods
.method public synthetic constructor <init>(Ldi/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/c;->a:Ldi/d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ldi/c;->a:Ldi/d;

    invoke-static {v0, p1}, Ldi/d;->J3(Ldi/d;Landroid/view/View;)V

    return-void
.end method
