.class public final synthetic Lnj/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lnj/a0;

.field public final synthetic b:Lnj/c;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lnj/a0;Lnj/c;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/z;->a:Lnj/a0;

    iput-object p2, p0, Lnj/z;->b:Lnj/c;

    iput-object p3, p0, Lnj/z;->c:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lnj/z;->a:Lnj/a0;

    iget-object v1, p0, Lnj/z;->b:Lnj/c;

    iget-object v2, p0, Lnj/z;->c:Landroid/app/Activity;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lnj/a0;->r(Lnj/a0;Lnj/c;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method
