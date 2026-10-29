.class public final synthetic Lfj/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/j;


# instance fields
.field public final synthetic a:Lfj/a0;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Lfj/a0;Ljava/util/List;Ljava/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/x;->a:Lfj/a0;

    iput-object p2, p0, Lfj/x;->b:Ljava/util/List;

    iput-object p3, p0, Lfj/x;->c:Ljava/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 3

    iget-object v0, p0, Lfj/x;->a:Lfj/a0;

    iget-object v1, p0, Lfj/x;->b:Ljava/util/List;

    iget-object v2, p0, Lfj/x;->c:Ljava/util/function/Consumer;

    invoke-static {v0, v1, v2, p1, p2}, Lfj/a0;->v(Lfj/a0;Ljava/util/List;Ljava/util/function/Consumer;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method
