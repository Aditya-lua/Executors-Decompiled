.class public final synthetic Lhp/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lhp/n0;


# direct methods
.method public synthetic constructor <init>(Lhp/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/l0;->a:Lhp/n0;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lhp/l0;->a:Lhp/n0;

    invoke-static {v0, p1, p2}, Lhp/n0;->a(Lhp/n0;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
