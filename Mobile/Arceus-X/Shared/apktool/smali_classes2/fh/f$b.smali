.class public final Lfh/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh/f;->a(Lfh/i$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lfh/f;


# direct methods
.method public constructor <init>(Lfh/f;)V
    .locals 0

    iput-object p1, p0, Lfh/f$b;->a:Lfh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lfh/f$b;->a:Lfh/f;

    invoke-static {p1}, Lfh/f;->f(Lfh/f;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lfh/f$b;->a:Lfh/f;

    invoke-static {p1}, Lfh/f;->e(Lfh/f;)Landroidx/appcompat/app/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj/l;->dismiss()V

    :cond_0
    iget-object p1, p0, Lfh/f$b;->a:Lfh/f;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lfh/f;->g(Lfh/f;Landroidx/appcompat/app/a;)V

    return-void
.end method
