.class public final synthetic Lfj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/j;


# instance fields
.field public final synthetic a:Lfj/m;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lfj/m$q;


# direct methods
.method public synthetic constructor <init>(Lfj/m;Ljava/util/List;Lfj/m$q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/j;->a:Lfj/m;

    iput-object p2, p0, Lfj/j;->b:Ljava/util/List;

    iput-object p3, p0, Lfj/j;->c:Lfj/m$q;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 3

    iget-object v0, p0, Lfj/j;->a:Lfj/m;

    iget-object v1, p0, Lfj/j;->b:Ljava/util/List;

    iget-object v2, p0, Lfj/j;->c:Lfj/m$q;

    invoke-static {v0, v1, v2, p1, p2}, Lfj/m;->u(Lfj/m;Ljava/util/List;Lfj/m$q;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method
