.class public final synthetic Lkq/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lkq/i;


# direct methods
.method public synthetic constructor <init>(Lkq/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/n;->a:Lkq/i;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lkq/n;->a:Lkq/i;

    invoke-static {v0, p1, p2}, Lkq/p;->f(Lkq/i;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
