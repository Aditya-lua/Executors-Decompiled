.class public final synthetic Lap/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lap/e;


# direct methods
.method public synthetic constructor <init>(Lap/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lap/a;->a:Lap/e;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lap/a;->a:Lap/e;

    invoke-static {v0, p1}, Lap/e;->A2(Lap/e;Landroid/view/View;)V

    return-void
.end method
