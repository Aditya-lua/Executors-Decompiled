.class public final Loh/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loh/f;->a(Loh/i$a;)V
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
.field public final synthetic a:Loh/f;


# direct methods
.method public constructor <init>(Loh/f;)V
    .locals 0

    iput-object p1, p0, Loh/f$c;->a:Loh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Loh/f$c;->a:Loh/f;

    invoke-static {p1}, Loh/f;->f(Loh/f;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Loh/f$c;->a:Loh/f;

    sget-object p2, Loh/i$a;->b:Loh/i$a;

    invoke-virtual {p1, p2}, Loh/f;->a(Loh/i$a;)V

    return-void
.end method
