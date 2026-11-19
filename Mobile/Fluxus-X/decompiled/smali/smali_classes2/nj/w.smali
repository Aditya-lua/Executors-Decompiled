.class public final synthetic Lnj/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/f;


# instance fields
.field public final synthetic a:Lnj/a0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw7/k;


# direct methods
.method public synthetic constructor <init>(Lnj/a0;Ljava/lang/String;Lw7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/w;->a:Lnj/a0;

    iput-object p2, p0, Lnj/w;->b:Ljava/lang/String;

    iput-object p3, p0, Lnj/w;->c:Lw7/k;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lnj/w;->a:Lnj/a0;

    iget-object v1, p0, Lnj/w;->b:Ljava/lang/String;

    iget-object v2, p0, Lnj/w;->c:Lw7/k;

    invoke-static {v0, v1, v2, p1, p2}, Lnj/a0;->q(Lnj/a0;Ljava/lang/String;Lw7/k;Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method
