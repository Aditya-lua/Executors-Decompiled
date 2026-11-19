.class public final synthetic Lvp/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lvp/n0;


# direct methods
.method public synthetic constructor <init>(Lvp/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/l0;->a:Lvp/n0;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lvp/l0;->a:Lvp/n0;

    invoke-static {v0, p1, p2}, Lvp/n0;->a(Lvp/n0;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
