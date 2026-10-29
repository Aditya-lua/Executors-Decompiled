.class public final synthetic Lml/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field public final synthetic a:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml/g;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lml/g;->a:Landroid/app/Activity;

    check-cast p1, Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->q(Landroid/app/Activity;Landroid/app/Activity;)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method
