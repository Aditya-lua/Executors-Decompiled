.class public Leh/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmi/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/k;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Leh/k;


# direct methods
.method public constructor <init>(Leh/k;)V
    .locals 0

    iput-object p1, p0, Leh/k$a;->a:Leh/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmi/j;)V
    .locals 2

    invoke-virtual {p1}, Lmi/j;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lmi/j;->b()I

    move-result p1

    const/16 v0, 0xca

    if-eq p1, v0, :cond_0

    const-string p1, "EventStreamManager"

    const-string v0, "addEvent: Failed to post events. Ignore and do nothing"

    invoke-static {p1, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
