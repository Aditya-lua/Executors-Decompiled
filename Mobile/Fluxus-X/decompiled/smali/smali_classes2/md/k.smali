.class public final synthetic Lmd/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public synthetic constructor <init>(Lmd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/k;->a:Lmd/p;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lmd/k;->a:Lmd/p;

    invoke-static {v0}, Lmd/p;->A(Lmd/p;)V

    return-void
.end method
