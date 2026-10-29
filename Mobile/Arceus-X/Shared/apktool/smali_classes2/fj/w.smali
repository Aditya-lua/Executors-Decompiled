.class public final synthetic Lfj/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/f;


# instance fields
.field public final synthetic a:Lfj/a0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lv7/k;


# direct methods
.method public synthetic constructor <init>(Lfj/a0;Ljava/lang/String;Lv7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/w;->a:Lfj/a0;

    iput-object p2, p0, Lfj/w;->b:Ljava/lang/String;

    iput-object p3, p0, Lfj/w;->c:Lv7/k;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lfj/w;->a:Lfj/a0;

    iget-object v1, p0, Lfj/w;->b:Ljava/lang/String;

    iget-object v2, p0, Lfj/w;->c:Lv7/k;

    invoke-static {v0, v1, v2, p1, p2}, Lfj/a0;->q(Lfj/a0;Ljava/lang/String;Lv7/k;Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method
