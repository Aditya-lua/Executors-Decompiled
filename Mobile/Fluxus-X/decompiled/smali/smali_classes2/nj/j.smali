.class public final synthetic Lnj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/j;


# instance fields
.field public final synthetic a:Lnj/m;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lnj/m$q;


# direct methods
.method public synthetic constructor <init>(Lnj/m;Ljava/util/List;Lnj/m$q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/j;->a:Lnj/m;

    iput-object p2, p0, Lnj/j;->b:Ljava/util/List;

    iput-object p3, p0, Lnj/j;->c:Lnj/m$q;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 3

    iget-object v0, p0, Lnj/j;->a:Lnj/m;

    iget-object v1, p0, Lnj/j;->b:Ljava/util/List;

    iget-object v2, p0, Lnj/j;->c:Lnj/m$q;

    invoke-static {v0, v1, v2, p1, p2}, Lnj/m;->u(Lnj/m;Ljava/util/List;Lnj/m$q;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method
