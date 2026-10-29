.class public final synthetic Lfj/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lfj/a0;

.field public final synthetic b:Lfj/c;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lfj/a0;Lfj/c;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/z;->a:Lfj/a0;

    iput-object p2, p0, Lfj/z;->b:Lfj/c;

    iput-object p3, p0, Lfj/z;->c:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lfj/z;->a:Lfj/a0;

    iget-object v1, p0, Lfj/z;->b:Lfj/c;

    iget-object v2, p0, Lfj/z;->c:Landroid/app/Activity;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lfj/a0;->r(Lfj/a0;Lfj/c;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method
