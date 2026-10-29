.class public Lfj/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj/m$o;,
        Lfj/m$r;,
        Lfj/m$p;,
        Lfj/m$q;
    }
.end annotation


# static fields
.field public static E:Lfj/m;

.field public static F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public C:Lcom/roblox/client/purchase/a$f;

.field public D:Lv7/m;

.field public a:Lfj/h0;

.field public b:Lfj/m$o;

.field public c:Lfj/m$o;

.field public d:Lfj/m$o;

.field public e:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/e;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/e;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lv7/k;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:Lfj/b0;

.field public j:Landroid/app/Activity;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:J

.field public q:Z

.field public r:Ljava/lang/String;

.field public s:Lvi/g;

.field public t:Lei/f;

.field public u:Lej/j;

.field public final v:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Ljava/util/ArrayList;

    const-string v18, "com.roblox.robloxmobile.premium4950subscribed"

    const-string v19, "com.roblox.robloxmobile.premium11000subscribed"

    const-string v1, "com.roblox.client.robux40"

    const-string v2, "com.roblox.robloxmobile.premium80robux"

    const-string v3, "com.roblox.robloxmobile.premium160robux"

    const-string v4, "com.roblox.robloxmobile.premium240robux"

    const-string v5, "com.roblox.robloxmobile.premium320robux"

    const-string v6, "com.roblox.robloxmobile.premium400robux"

    const-string v7, "com.roblox.robloxmobile.premium800robux"

    const-string v8, "com.roblox.robloxmobile.premium1700robux"

    const-string v9, "com.roblox.robloxmobile.premium4500robux"

    const-string v10, "com.roblox.robloxmobile.premium10000robux"

    const-string v11, "com.roblox.robloxmobile.premium88subscribed"

    const-string v12, "com.roblox.robloxmobile.premium175subscribed"

    const-string v13, "com.roblox.robloxmobile.premium265subscribed"

    const-string v14, "com.roblox.robloxmobile.premium350subscribed"

    const-string v15, "com.roblox.robloxmobile.premium440subscribed2"

    const-string v16, "com.roblox.robloxmobile.premium880subscribed"

    const-string v17, "com.roblox.robloxmobile.premium1870subscribed"

    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lfj/m;->F:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "com.roblox.robloxmobile.robloxpremium1000"

    const-string v2, "com.roblox.robloxmobile.robloxpremium2200"

    const-string v3, "com.roblox.robloxmobile.robloxpremium450"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lfj/m;->H:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lfj/h0;Lei/f;Lvi/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lfj/m$o;->a:Lfj/m$o;

    iput-object v0, p0, Lfj/m;->b:Lfj/m$o;

    iput-object v0, p0, Lfj/m;->c:Lfj/m$o;

    iput-object v0, p0, Lfj/m;->d:Lfj/m$o;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lfj/m;->e:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lfj/m;->f:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lfj/m;->g:Ljava/util/Hashtable;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lfj/m;->h:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lfj/m;->i:Lfj/b0;

    iput-object v0, p0, Lfj/m;->k:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->l:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->m:Ljava/lang/String;

    const-string v1, ""

    iput-object v1, p0, Lfj/m;->n:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lfj/m;->p:J

    const/4 v1, 0x1

    iput-boolean v1, p0, Lfj/m;->q:Z

    iput-object v0, p0, Lfj/m;->r:Ljava/lang/String;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, p0, Lfj/m;->v:Ljava/util/Hashtable;

    iput-object v0, p0, Lfj/m;->x:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->y:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->z:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->A:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->B:Ljava/util/List;

    new-instance v0, Lfj/m$j;

    invoke-direct {v0, p0}, Lfj/m$j;-><init>(Lfj/m;)V

    iput-object v0, p0, Lfj/m;->C:Lcom/roblox/client/purchase/a$f;

    new-instance v0, Lfj/m$k;

    invoke-direct {v0, p0}, Lfj/m$k;-><init>(Lfj/m;)V

    iput-object v0, p0, Lfj/m;->D:Lv7/m;

    iput-object p1, p0, Lfj/m;->a:Lfj/h0;

    iput-object p2, p0, Lfj/m;->t:Lei/f;

    iput-object p3, p0, Lfj/m;->s:Lvi/g;

    return-void
.end method

.method public static bridge synthetic A(Lfj/m;)Lej/j;
    .locals 0

    iget-object p0, p0, Lfj/m;->u:Lej/j;

    return-object p0
.end method

.method public static bridge synthetic B(Lfj/m;)Lvi/g;
    .locals 0

    iget-object p0, p0, Lfj/m;->s:Lvi/g;

    return-object p0
.end method

.method public static bridge synthetic C(Lfj/m;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lfj/m;->f:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic D(Lfj/m;)J
    .locals 2

    iget-wide v0, p0, Lfj/m;->p:J

    return-wide v0
.end method

.method public static bridge synthetic E(Lfj/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfj/m;->n:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic F(Lfj/m;Z)V
    .locals 0

    iput-boolean p1, p0, Lfj/m;->h:Z

    return-void
.end method

.method public static F0(Landroid/content/Context;)Lfj/m;
    .locals 4

    sget-object v0, Lfj/m;->E:Lfj/m;

    if-nez v0, :cond_0

    new-instance v0, Lei/h;

    invoke-direct {v0}, Lei/h;-><init>()V

    new-instance v1, Lfj/b;

    invoke-direct {v1}, Lfj/b;-><init>()V

    new-instance v2, Lfj/m;

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v3

    invoke-direct {v2, v1, v0, v3}, Lfj/m;-><init>(Lfj/h0;Lei/f;Lvi/g;)V

    sput-object v2, Lfj/m;->E:Lfj/m;

    invoke-static {p0}, Lcom/android/billingclient/api/a;->f(Landroid/content/Context;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    sget-object v1, Lfj/m;->E:Lfj/m;

    iget-object v1, v1, Lfj/m;->D:Lv7/m;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/a$a;->c(Lv7/m;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    invoke-static {}, Lv7/i;->c()Lv7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lv7/i$a;->b()Lv7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lv7/i$a;->c()Lv7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lv7/i$a;->a()Lv7/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/a$a;->b(Lv7/i;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/a$a;->a()Lcom/android/billingclient/api/a;

    move-result-object v0

    sget-object v1, Lfj/m;->E:Lfj/m;

    invoke-virtual {v1, v0}, Lfj/m;->U1(Lcom/android/billingclient/api/a;)V

    new-instance v0, Lfj/b0;

    invoke-direct {v0, p0}, Lfj/b0;-><init>(Landroid/content/Context;)V

    sget-object p0, Lfj/m;->E:Lfj/m;

    invoke-virtual {p0, v0}, Lfj/m;->T1(Lfj/b0;)V

    :cond_0
    sget-object p0, Lfj/m;->E:Lfj/m;

    return-object p0
.end method

.method public static bridge synthetic G(Lfj/m;Lfj/m$o;)V
    .locals 0

    iput-object p1, p0, Lfj/m;->b:Lfj/m$o;

    return-void
.end method

.method public static G0()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->K3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lfj/m;->G:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lfj/m;->G:Ljava/util/List;

    :cond_0
    sget-object v0, Lfj/m;->G:Ljava/util/List;

    return-object v0

    :cond_1
    sget-object v0, Lfj/m;->F:Ljava/util/List;

    return-object v0
.end method

.method public static bridge synthetic H(Lfj/m;Lfj/m$o;)V
    .locals 0

    iput-object p1, p0, Lfj/m;->c:Lfj/m$o;

    return-void
.end method

.method public static bridge synthetic I(Lfj/m;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfj/m;->m:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic J(Lfj/m;Lfj/m$o;)V
    .locals 0

    iput-object p1, p0, Lfj/m;->d:Lfj/m$o;

    return-void
.end method

.method public static bridge synthetic K(Lfj/m;Lv7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->x0(Lv7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void
.end method

.method public static K0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/e$e;

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$e;->c()Lcom/android/billingclient/api/e$d;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$d;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/e$c;

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$c;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->b()Lcom/android/billingclient/api/e$b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$b;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic L(Lfj/m;Lv7/k;Lfj/e$b;Lfj/m0;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->z0(Lv7/k;Lfj/e$b;Lfj/m0;)V

    return-void
.end method

.method public static L0(Lcom/android/billingclient/api/e;Z)J
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/e$e;

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$e;->c()Lcom/android/billingclient/api/e$d;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$d;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/billingclient/api/e$c;

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$c;->b()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->b()Lcom/android/billingclient/api/e$b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$b;->c()J

    move-result-wide p0

    return-wide p0
.end method

.method public static bridge synthetic M(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->D0()V

    return-void
.end method

.method public static bridge synthetic N(Lfj/m;Lhj/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->E0(Lhj/b;)V

    return-void
.end method

.method public static N0()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->F0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lfj/m;->I:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lfj/m;->I:Ljava/util/List;

    :cond_0
    sget-object v0, Lfj/m;->I:Ljava/util/List;

    return-object v0

    :cond_1
    sget-object v0, Lfj/m;->H:Ljava/util/List;

    return-object v0
.end method

.method public static bridge synthetic O(Lfj/m;Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->H0(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic P(Lfj/m;Lv7/k;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->I0(Lv7/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic Q(Lfj/m;Ljava/lang/String;Z)Lcom/android/billingclient/api/e;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic R(Lfj/m;Lcom/android/billingclient/api/e;Z)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic S(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->O0()V

    return-void
.end method

.method public static bridge synthetic T(Lfj/m;Lv7/k;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->P0(Lv7/k;I)V

    return-void
.end method

.method private T0()Z
    .locals 1

    iget-object v0, p0, Lfj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic U(Lfj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic V(Lfj/m;Ljava/util/List;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->R0(Ljava/util/List;Z)V

    return-void
.end method

.method public static bridge synthetic W(Lfj/m;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->V0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic X(Lfj/m;Lv7/k;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->Y0(Lv7/k;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic Y(Lfj/m;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->Z0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic Z(Lfj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic a0(Lfj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lfj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic b0(Lfj/m;Ljava/lang/String;Lfj/e$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->k1(Ljava/lang/String;Lfj/e$b;)V

    return-void
.end method

.method public static bridge synthetic c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic d0(Lfj/m;Lfj/m$r;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->q1(Lfj/m$r;)V

    return-void
.end method

.method public static bridge synthetic e0(Lfj/m;Lfj/m$r;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfj/m;->s1(Lfj/m$r;)V

    return-void
.end method

.method public static bridge synthetic f0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->t1()V

    return-void
.end method

.method public static bridge synthetic g0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->u1()V

    return-void
.end method

.method public static bridge synthetic h0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->v1()V

    return-void
.end method

.method public static bridge synthetic i0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->D1()V

    return-void
.end method

.method public static bridge synthetic j0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->E1()V

    return-void
.end method

.method public static bridge synthetic k0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->F1()V

    return-void
.end method

.method public static bridge synthetic l0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->G1()V

    return-void
.end method

.method public static bridge synthetic m0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->I1()V

    return-void
.end method

.method public static bridge synthetic n0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->J1()V

    return-void
.end method

.method public static synthetic o(Lfj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->e1(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic o0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->L1()V

    return-void
.end method

.method public static synthetic p(Lfj/m;Ljava/util/Map;ZLjava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->c1(Ljava/util/Map;ZLjava/util/List;)V

    return-void
.end method

.method public static bridge synthetic p0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->M1()V

    return-void
.end method

.method public static synthetic q(Lfj/m;Lfj/c;ZLjava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->i1(Lfj/c;ZLjava/util/List;)V

    return-void
.end method

.method public static bridge synthetic q0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->O1()V

    return-void
.end method

.method public static synthetic r(Lfj/m;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 0

    invoke-virtual/range {p0 .. p9}, Lfj/m;->g1(ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method

.method public static bridge synthetic r0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->P1()V

    return-void
.end method

.method public static synthetic s(Lfj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lfj/m;->d1(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic s0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->Q1()V

    return-void
.end method

.method public static synthetic t(Lfj/m;Lfj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0

    invoke-virtual/range {p0 .. p7}, Lfj/m;->f1(Lfj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic t0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->R1()V

    return-void
.end method

.method public static synthetic u(Lfj/m;Ljava/util/List;Lfj/m$q;Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lfj/m;->h1(Ljava/util/List;Lfj/m$q;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method

.method public static bridge synthetic u0(Lfj/m;)V
    .locals 0

    invoke-virtual {p0}, Lfj/m;->S1()V

    return-void
.end method

.method public static bridge synthetic v(Lfj/m;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lfj/m;->g:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic w(Lfj/m;)Lfj/h0;
    .locals 0

    iget-object p0, p0, Lfj/m;->a:Lfj/h0;

    return-object p0
.end method

.method public static bridge synthetic x(Lfj/m;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lfj/m;->e:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic y(Lfj/m;)Z
    .locals 0

    iget-boolean p0, p0, Lfj/m;->o:Z

    return p0
.end method

.method public static bridge synthetic z(Lfj/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfj/m;->k:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public A0(JLjava/lang/String;Z)V
    .locals 0

    iput-wide p1, p0, Lfj/m;->p:J

    invoke-virtual {p0, p3, p4}, Lfj/m;->B0(Ljava/lang/String;Z)V

    return-void
.end method

.method public final A1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->x()V

    :cond_0
    return-void
.end method

.method public B0(Ljava/lang/String;Z)V
    .locals 1

    iput-object p1, p0, Lfj/m;->n:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "attemptGrantPendingPurchases isAppResume:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lfj/m;->X0()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "attemptGrantPendingPurchases failed: purchasing is not setup"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Lfj/m;->U0()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "attemptGrantPendingPurchases failed: purchase already pending"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lfj/m;->O0()V

    return-void

    :cond_2
    invoke-direct {p0}, Lfj/m;->T0()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Found cached pending purchase. Count = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lfj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {p2}, Ljava/util/Hashtable;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lfj/m;->O0()V

    return-void

    :cond_3
    iget-boolean p1, p0, Lfj/m;->h:Z

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lfj/m;->O0()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lfj/m;->h:Z

    :cond_4
    return-void
.end method

.method public final B1()V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "Payments-Protocol-Query-Product-Details-Failed"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final C0(Lv7/k;)V
    .locals 4

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->r0()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lfj/e0;->l(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lfj/m;->s:Lvi/g;

    const-string v0, "Play-Points-Not-Consume-Purchase"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    const-string v1, "rbx.purchaseflow"

    const-string v2, "Consuming Purchase"

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lv7/e;->b()Lv7/e$a;

    move-result-object v1

    invoke-virtual {p1}, Lv7/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lv7/e$a;->b(Ljava/lang/String;)Lv7/e$a;

    move-result-object v1

    invoke-virtual {v1}, Lv7/e$a;->a()Lv7/e;

    move-result-object v1

    iget-object v2, p0, Lfj/m;->a:Lfj/h0;

    new-instance v3, Lfj/m$n;

    invoke-direct {v3, p0, v0, p1}, Lfj/m$n;-><init>(Lfj/m;Ljava/lang/String;Lv7/k;)V

    invoke-interface {v2, v1, v3}, Lfj/h0;->c(Lv7/e;Lv7/f;)V

    return-void
.end method

.method public final C1(Z)V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0, p1}, Lvi/g;->Q(Z)V

    :cond_0
    return-void
.end method

.method public final D0()V
    .locals 7

    iget-object v0, p0, Lfj/m;->u:Lej/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lej/j;->c()V

    :cond_0
    new-instance v1, Lcom/roblox/client/purchase/a;

    iget-object v0, p0, Lfj/m;->t:Lei/f;

    invoke-direct {v1, v0}, Lcom/roblox/client/purchase/a;-><init>(Lei/f;)V

    iget-object v0, p0, Lfj/m;->r:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lfj/m;->r:Ljava/lang/String;

    :goto_0
    move-object v5, v0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_2
    iget-boolean v0, p0, Lfj/m;->q:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lsg/a1;->b1()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lfj/m;->k:Ljava/lang/String;

    iget-object v4, p0, Lfj/m;->m:Ljava/lang/String;

    iget-object v6, p0, Lfj/m;->C:Lcom/roblox/client/purchase/a$f;

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/purchase/a;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/purchase/a$f;)V

    return-void

    :cond_3
    invoke-static {}, Lsg/a1;->b1()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lfj/m;->k:Ljava/lang/String;

    iget-object v4, p0, Lfj/m;->m:Ljava/lang/String;

    iget-object v6, p0, Lfj/m;->C:Lcom/roblox/client/purchase/a$f;

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/purchase/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/purchase/a$f;)V

    return-void
.end method

.method public final D1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->R()V

    :cond_0
    return-void
.end method

.method public final E0(Lhj/b;)V
    .locals 6

    iget-object v0, p0, Lfj/m;->u:Lej/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lej/j;->d()V

    :cond_0
    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "PurchaseStarted."

    invoke-virtual {v0, v1}, Lvi/g;->l(Ljava/lang/String;)V

    iget-object v0, p0, Lfj/m;->k:Ljava/lang/String;

    iget-boolean v1, p0, Lfj/m;->o:Z

    invoke-virtual {p0, v0, v1}, Lfj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v0

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    iget-boolean v2, p0, Lfj/m;->o:Z

    invoke-virtual {p0, v1, v0, v2}, Lfj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, p0, Lfj/m;->o:Z

    if-eqz v2, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->T3()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Lfj/m;->w0(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    iget-object p1, p0, Lfj/m;->k:Ljava/lang/String;

    sget-object v0, Lfj/e$b;->v:Lfj/e$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No matching or base plan offer available for subscription product: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/e$e;

    invoke-virtual {v2}, Lcom/android/billingclient/api/e$e;->b()Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-static {}, Lcom/android/billingclient/api/c$b;->b()Lcom/android/billingclient/api/c$b$a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/android/billingclient/api/c$b$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c$b$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/c$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b$a;->a()Lcom/android/billingclient/api/c$b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/android/billingclient/api/c$b;->b()Lcom/android/billingclient/api/c$b$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/c$b$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b$a;->a()Lcom/android/billingclient/api/c$b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lhj/b;->c()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lhj/b;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_5

    invoke-virtual {p1}, Lhj/b;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lfj/m;->n:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/android/billingclient/api/c;->b()Lcom/android/billingclient/api/c$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/c$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/c$a;->d(Ljava/util/List;)Lcom/android/billingclient/api/c$a;

    move-result-object v0

    iget-object v1, p0, Lfj/m;->w:Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p1, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "Android-Purchase-Initiated-With-Charge-Request-Id"

    invoke-virtual {p1, v1}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lhj/b;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lhj/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p1, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "Android-Purchase-Initiated-With-Checkout-Session-Id"

    invoke-virtual {p1, v1}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const-string p1, "rbx.purchaseflow"

    const-string v1, "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null."

    invoke-static {p1, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "Android-Purchase-Initiated-Without-Obfuscated-Profile-Id"

    invoke-virtual {p1, v1}, Lvi/g;->q(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v0}, Lcom/android/billingclient/api/c$a;->a()Lcom/android/billingclient/api/c;

    move-result-object p1

    iget-object v0, p0, Lfj/m;->j:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lfj/m;->j:Landroid/app/Activity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    :cond_8
    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    iget-object v1, p0, Lfj/m;->j:Landroid/app/Activity;

    invoke-interface {v0, v1, p1}, Lfj/h0;->h(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lfj/m;->k:Ljava/lang/String;

    sget-object v0, Lfj/e$b;->s:Lfj/e$b;

    const-string v1, "BillingClient.launchBillingFlow failed"

    invoke-virtual {p0, p1, v0, v1}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public final E1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->S(ZZ)V

    :cond_0
    return-void
.end method

.method public final F1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->T(ZZ)V

    :cond_0
    return-void
.end method

.method public final G1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->a0(ZZ)V

    :cond_0
    return-void
.end method

.method public final H0(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv7/k;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v0, ""

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/k;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final H1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->U(ZZ)V

    :cond_0
    return-void
.end method

.method public final I0(Lv7/k;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Lv7/k;->a()Lv7/a;

    move-result-object v0

    invoke-virtual {v0}, Lv7/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    invoke-virtual {p1}, Lv7/k;->a()Lv7/a;

    move-result-object p1

    invoke-virtual {p1}, Lv7/a;->b()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "rbx.purchaseflow"

    const-string v0, "PaymentsProtocol: purchase.getAccountIdentifiers().getObfuscatedProfileId() did not return an integer and is not a valid checkoutSessionId."

    invoke-static {p1, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    return-object p1
.end method

.method public final I1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->V(ZZ)V

    :cond_0
    return-void
.end method

.method public final J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    iget-object v1, p0, Lfj/m;->f:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lfj/m;->f:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e;

    return-object p1

    :cond_1
    if-nez p2, :cond_2

    iget-object p2, p0, Lfj/m;->e:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lfj/m;->e:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e;

    return-object p1

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to get product details for productId: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.purchaseflow"

    invoke-static {p2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final J1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->W(ZZ)V

    :cond_0
    return-void
.end method

.method public final K1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->X(ZZ)V

    :cond_0
    return-void
.end method

.method public final L1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->Y(ZZ)V

    :cond_0
    return-void
.end method

.method public final M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e$e;

    invoke-virtual {p1}, Lcom/android/billingclient/api/e$e;->c()Lcom/android/billingclient/api/e$d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/e$d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e$c;

    invoke-virtual {p1}, Lcom/android/billingclient/api/e$c;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->b()Lcom/android/billingclient/api/e$b;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/android/billingclient/api/e$b;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final M1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->Z(ZZ)V

    :cond_0
    return-void
.end method

.method public final N1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->b0(ZZ)V

    :cond_0
    return-void
.end method

.method public final O0()V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Do Google Purchase GrantPending"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E()Z

    move-result v0

    const-string v1, "subs"

    const-string v2, "inapp"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lfj/m;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lv7/o;->b()Lv7/o$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lv7/o$a;->b(Ljava/lang/String;)Lv7/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lv7/o$a;->a()Lv7/o;

    move-result-object v0

    invoke-static {}, Lv7/o;->b()Lv7/o$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lv7/o$a;->b(Ljava/lang/String;)Lv7/o$a;

    move-result-object v1

    invoke-virtual {v1}, Lv7/o$a;->a()Lv7/o;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lfj/m;->C1(Z)V

    iget-object v2, p0, Lfj/m;->a:Lfj/h0;

    new-instance v3, Lfj/m$c;

    invoke-direct {v3, p0}, Lfj/m$c;-><init>(Lfj/m;)V

    invoke-interface {v2, v0, v3}, Lfj/h0;->g(Lv7/o;Lv7/l;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lfj/m;->C1(Z)V

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    new-instance v2, Lfj/m$d;

    invoke-direct {v2, p0}, Lfj/m$d;-><init>(Lfj/m;)V

    invoke-interface {v0, v1, v2}, Lfj/h0;->g(Lv7/o;Lv7/l;)V

    return-void

    :cond_1
    invoke-virtual {p0, v2}, Lfj/m;->r1(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lfj/m;->r1(Ljava/lang/String;)V

    return-void
.end method

.method public final O1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->c0()V

    :cond_0
    return-void
.end method

.method public final P0(Lv7/k;I)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Acknowledge error, response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", skipping client side acknowledge purchase."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore"

    invoke-virtual {p2, v1}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-static {p1}, Lfj/j0;->e(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lfj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1}, Lfj/m;->Y0(Lv7/k;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, v3, p1}, Lfj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p2

    invoke-virtual {p0, v3, p2, p1, p1}, Lfj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lfj/m;->s:Lvi/g;

    invoke-static {p2, p1}, Lfj/m;->K0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p2, p1}, Lfj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, p1}, Lfj/m;->L0(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Lvi/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unable to find skuDetails: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    sget-object p1, Lfj/e$b;->a:Lfj/e$b;

    invoke-virtual {p0, v3, p1}, Lfj/m;->k1(Ljava/lang/String;Lfj/e$b;)V

    return-void
.end method

.method public final P1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->d0()V

    :cond_0
    return-void
.end method

.method public final Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/d;",
            "Ljava/util/List<",
            "Lv7/k;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv7/k;

    invoke-virtual {p2}, Lv7/k;->f()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 p2, 0x2

    if-eq v1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lfj/m;->D1()V

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases for purchase "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.purchaseflow"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p2}, Lv7/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lv7/k;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->c2()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p2}, Lfj/m;->I0(Lv7/k;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lv7/k;->a()Lv7/a;

    move-result-object v1

    invoke-virtual {v1}, Lv7/a;->a()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p0, p2}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeFinishPaymentsProtocolPurchase(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lfj/m;->P1()V

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed QueryPurchases. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgk/q;->a(Ljava/lang/String;)I

    return-void
.end method

.method public final Q1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->e0(ZZ)V

    :cond_0
    return-void
.end method

.method public final R0(Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv7/k;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/Hashtable;

    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/k;

    invoke-virtual {p0, v3}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Lfj/m;->Y0(Lv7/k;)Z

    move-result v5

    invoke-virtual {p0, v4, v5}, Lfj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {p0, v3, p2}, Lfj/m;->S0(Lv7/k;Z)V

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_2

    new-instance v5, Lfj/m$p;

    const-string v6, "subs"

    invoke-direct {v5, p0, v4, v6}, Lfj/m$p;-><init>(Lfj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v5, Lfj/m$p;

    const-string v6, "inapp"

    invoke-direct {v5, p0, v4, v6}, Lfj/m$p;-><init>(Lfj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p1, Lfj/i;

    invoke-direct {p1, p0, v2, p2}, Lfj/i;-><init>(Lfj/m;Ljava/util/Map;Z)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0, v0, p1}, Lfj/m;->p1(Ljava/util/List;Lfj/m$q;)V

    :cond_4
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p0, v1, p1}, Lfj/m;->p1(Ljava/util/List;Lfj/m$q;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final R1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->f0(ZZ)V

    :cond_0
    return-void
.end method

.method public final S0(Lv7/k;Z)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Handle single purchase. Product id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Order id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv7/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". isAcknowledged: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv7/k;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lv7/k;->f()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lfj/m;->D1()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lfj/m;->P1()V

    :goto_0
    invoke-virtual {p1}, Lv7/k;->f()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lfj/j0;->e(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lfj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Lv7/k;->a()Lv7/a;

    move-result-object v0

    invoke-virtual {v0}, Lv7/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lv7/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lfj/m;->n:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_3
    iget-wide v2, p0, Lfj/m;->p:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_4

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_4
    if-eqz v0, :cond_5

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_5
    invoke-virtual {p0}, Lfj/m;->w1()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->G0()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lfj/m;->n:Ljava/lang/String;

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lfj/m;->A1()V

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lfj/m;->z1()V

    :cond_7
    :goto_1
    iget-wide p1, p0, Lfj/m;->p:J

    cmp-long v0, p1, v4

    if-gtz v0, :cond_8

    invoke-virtual {p0}, Lfj/m;->x1()V

    return-void

    :cond_8
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, Lfj/m;->y1()V

    :cond_9
    :goto_2
    return-void

    :cond_a
    invoke-static {p1}, Lfj/j0;->e(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lfj/m;->W1(Lv7/k;Ljava/lang/String;Z)V

    return-void
.end method

.method public final S1()V
    .locals 3

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->g0(ZZ)V

    :cond_0
    return-void
.end method

.method public T1(Lfj/b0;)V
    .locals 0

    iput-object p1, p0, Lfj/m;->i:Lfj/b0;

    return-void
.end method

.method public U0()Z
    .locals 1

    iget-object v0, p0, Lfj/m;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public U1(Lcom/android/billingclient/api/a;)V
    .locals 3

    iget-object v0, p0, Lfj/m;->b:Lfj/m$o;

    sget-object v1, Lfj/m$o;->c:Lfj/m$o;

    const-string v2, "rbx.purchaseflow"

    if-ne v0, v1, :cond_0

    const-string p1, "Google Billing Client is already setup"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v1, Lfj/m$o;->b:Lfj/m$o;

    if-ne v0, v1, :cond_1

    const-string p1, "Google Billing Client is already connecting"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    invoke-interface {v0, p1}, Lfj/h0;->f(Lcom/android/billingclient/api/a;)V

    iput-object v1, p0, Lfj/m;->b:Lfj/m$o;

    const-string p1, "Connecting Google Billing\'s Client"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/m;->a:Lfj/h0;

    new-instance v0, Lfj/m$f;

    invoke-direct {v0, p0}, Lfj/m$f;-><init>(Lfj/m;)V

    invoke-interface {p1, v0}, Lfj/h0;->b(Lv7/d;)V

    return-void
.end method

.method public final V0(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lfj/m;->N0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;Z)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startPurchase productId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isSubscriptionPurchase: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p7, "isInApp: "

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p7, p0, Lfj/m;->q:Z

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p7}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lfj/m;->n:Ljava/lang/String;

    invoke-virtual {p0}, Lfj/m;->W0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p6, p0, Lfj/m;->u:Lej/j;

    iput-wide p4, p0, Lfj/m;->p:J

    iput-object p2, p0, Lfj/m;->k:Ljava/lang/String;

    iput-object p3, p0, Lfj/m;->j:Landroid/app/Activity;

    invoke-virtual {p0, p2}, Lfj/m;->V0(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lfj/m;->o:Z

    new-instance p1, Lfj/m$i;

    invoke-direct {p1, p0, p2}, Lfj/m$i;-><init>(Lfj/m;Ljava/lang/String;)V

    iget-boolean p2, p0, Lfj/m;->o:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lfj/m;->s1(Lfj/m$r;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lfj/m;->q1(Lfj/m$r;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public W0()Z
    .locals 1

    iget-object v0, p0, Lfj/m;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lfj/m;->X0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W1(Lv7/k;Ljava/lang/String;Z)V
    .locals 2

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lfj/m;->i:Lfj/b0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p2}, Lfj/b0;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Lv7/k;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p2, Lfj/e$b;->k:Lfj/e$b;

    new-instance p3, Lfj/m0;

    invoke-direct {p3}, Lfj/m0;-><init>()V

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->z0(Lv7/k;Lfj/e$b;Lfj/m0;)V

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p0, p1, p3}, Lfj/m;->j1(Lv7/k;Z)V

    return-void
.end method

.method public X0()Z
    .locals 3

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lfj/m;->b:Lfj/m$o;

    sget-object v2, Lfj/m$o;->c:Lfj/m$o;

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, Lfj/h0;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y0(Lv7/k;)Z
    .locals 3

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lfj/m;->G0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    invoke-virtual {p0, p1}, Lfj/m;->V0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v1
.end method

.method public final Z0(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lfj/m;->k:Ljava/lang/String;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Z
    .locals 11

    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocol: paymentsProtocolStartPurchase."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    const-string v1, "PurchaseStarted."

    invoke-virtual {v0, v1}, Lvi/g;->l(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lfj/m;->V0(Ljava/lang/String;)Z

    move-result v4

    const/4 v0, 0x0

    if-eqz v4, :cond_0

    iget-object v1, p0, Lfj/m;->a:Lfj/h0;

    const-string v2, "subscriptions"

    invoke-interface {v1, v2}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lfj/m;->a:Lfj/h0;

    const-string v2, "fff"

    invoke-interface {v1, v2}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lfj/m;->H1()V

    return v0

    :cond_1
    invoke-static {p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    iput-wide p2, p0, Lfj/m;->p:J

    iput-object p4, p0, Lfj/m;->n:Ljava/lang/String;

    iput-object p1, p0, Lfj/m;->k:Ljava/lang/String;

    if-eqz v4, :cond_2

    const-string v0, "subs"

    goto :goto_0

    :cond_2
    const-string v0, "inapp"

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    iget-object v1, p0, Lfj/m;->a:Lfj/h0;

    new-instance v2, Lfj/f;

    move-object v3, p0

    move-object v8, p1

    move-wide v5, p2

    move-object v7, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v10}, Lfj/f;-><init>(Lfj/m;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Lfj/h0;->a(Lcom/android/billingclient/api/f;Lv7/j;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lfj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result p1

    return p1
.end method

.method public b(Lwh/r0;)V
    .locals 0

    iput-object p1, p0, Lfj/m;->u:Lej/j;

    return-void
.end method

.method public final b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    const-string p2, "rbx.purchaseflow"

    const-string p3, "Product details not found after query."

    invoke-static {p2, p3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p4, :cond_0

    sget-object p2, Lfj/e$b;->v:Lfj/e$b;

    const-string p3, "Product details not found"

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    :cond_0
    return v0

    :cond_1
    const-string p1, "Product subscription offer details not found"

    if-eqz p3, :cond_3

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    if-eqz p4, :cond_2

    iget-object p2, p0, Lfj/m;->k:Ljava/lang/String;

    sget-object p3, Lfj/e$b;->v:Lfj/e$b;

    invoke-virtual {p0, p2, p3, p1}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    :cond_2
    return v0

    :cond_3
    if-nez p3, :cond_5

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()Lcom/android/billingclient/api/e$b;

    move-result-object p2

    if-nez p2, :cond_5

    if-eqz p4, :cond_4

    iget-object p2, p0, Lfj/m;->k:Ljava/lang/String;

    sget-object p3, Lfj/e$b;->v:Lfj/e$b;

    invoke-virtual {p0, p2, p3, p1}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    :cond_4
    return v0

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Lfj/m;->V0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lfj/m;->o:Z

    invoke-virtual {p0, p1, v0}, Lfj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v0

    iget-boolean v1, p0, Lfj/m;->o:Z

    invoke-virtual {p0, p1, v0, v1}, Lfj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-boolean p1, p0, Lfj/m;->o:Z

    invoke-virtual {p0, v0, p1}, Lfj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c1(Ljava/util/Map;ZLjava/util/List;)V
    .locals 4

    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/e;

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_1

    const-string v0, "Null product details in list"

    invoke-static {v1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot find purchase associated with product details. ProductId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/k;

    invoke-virtual {p0, v0, p2}, Lfj/m;->S0(Lv7/k;Z)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLej/j;)Z
    .locals 4

    new-instance v0, Lfj/c;

    invoke-direct {v0, p4}, Lfj/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lfj/c;->b()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "rbx.purchaseflow"

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchase request is invalid. Raw payload: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    invoke-virtual {v0}, Lfj/c;->c()Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p0, Lfj/m;->a:Lfj/h0;

    const-string v1, "subscriptions"

    invoke-interface {p4, v1}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p4

    invoke-virtual {p4}, Lcom/android/billingclient/api/d;->c()I

    move-result p4

    if-eqz p4, :cond_1

    const-string p1, "Google Billing Client does not support subscription purchases."

    invoke-static {v3, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Initiated purchase. Params: "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {v3, p4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Lfj/m;->n:Ljava/lang/String;

    invoke-virtual {p0}, Lfj/m;->W0()Z

    move-result p4

    if-nez p4, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchasing is not enabled. Params: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_2
    iput-wide p1, p0, Lfj/m;->p:J

    invoke-virtual {v0}, Lfj/c;->f()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-virtual {v0}, Lfj/c;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lfj/m;->w:Ljava/lang/String;

    invoke-virtual {v0}, Lfj/c;->d()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfj/m;->B:Ljava/util/List;

    iput-object p5, p0, Lfj/m;->j:Landroid/app/Activity;

    xor-int/lit8 p1, p6, 0x1

    iput-boolean p1, p0, Lfj/m;->q:Z

    iput-object p7, p0, Lfj/m;->u:Lej/j;

    invoke-virtual {v0}, Lfj/c;->c()Z

    move-result p1

    iput-boolean p1, p0, Lfj/m;->o:Z

    invoke-virtual {v0}, Lfj/c;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lfj/m;->v:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lfj/c;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, Lfj/m$p;

    invoke-virtual {v0}, Lfj/c;->f()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0}, Lfj/c;->g()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p0, p3, p4}, Lfj/m$p;-><init>(Lfj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lfj/l;

    invoke-direct {p2, p0, v0, p6}, Lfj/l;-><init>(Lfj/m;Lfj/c;Z)V

    invoke-virtual {p0, p1, p2}, Lfj/m;->p1(Ljava/util/List;Lfj/m$q;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic d1(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PaymentsProtocol: QueryInAppPurchases. ItemsCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Items: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Lfj/m;->H0(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvi/g;->l(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lfj/m;->Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "PaymentsProtocol: Failed QueryPurchases. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.purchaseflow"

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final synthetic e1(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PaymentsProtocol: QuerySubsPurchases. ItemsCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Items: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Lfj/m;->H0(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvi/g;->l(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lfj/m;->Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "PaymentsProtocol: Failed QueryPurchases. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.purchaseflow"

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public f(Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 10

    const-string v0, "PaymentsProtocol: paymentsProtocolStartPurchase with payload string."

    const-string v2, "rbx.purchaseflow"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    const-string v3, "PurchaseStarted."

    invoke-virtual {v0, v3}, Lvi/g;->l(Ljava/lang/String;)V

    new-instance v0, Lfj/c;

    move-object/from16 v3, p6

    invoke-direct {v0, v3}, Lfj/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lfj/c;->c()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v3, p0, Lfj/m;->a:Lfj/h0;

    const-string v5, "subscriptions"

    invoke-interface {v3, v5}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/d;->c()I

    move-result v3

    if-eqz v3, :cond_0

    return v4

    :cond_0
    iget-object v3, p0, Lfj/m;->a:Lfj/h0;

    const-string v5, "fff"

    invoke-interface {v3, v5}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/d;->c()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lfj/m;->H1()V

    return v4

    :cond_1
    invoke-static {p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    iput-wide p2, p0, Lfj/m;->p:J

    iput-object p4, p0, Lfj/m;->n:Ljava/lang/String;

    iput-object p1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-virtual {v0}, Lfj/c;->f()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lfj/m;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lfj/c;->g()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lfj/m;->A:Ljava/lang/String;

    invoke-virtual {v0}, Lfj/c;->a()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lfj/m;->x:Ljava/lang/String;

    invoke-virtual {v0}, Lfj/c;->d()Ljava/util/List;

    move-result-object v7

    iput-object v7, p0, Lfj/m;->B:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PaymentsProtocol: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lfj/m;->z:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lfj/m;->A:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lfj/m$p;

    iget-object v7, p0, Lfj/m;->z:Ljava/lang/String;

    iget-object v9, p0, Lfj/m;->A:Ljava/lang/String;

    invoke-direct {v2, p0, v7, v9}, Lfj/m$p;-><init>(Lfj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v0

    new-instance v0, Lfj/k;

    move-object v1, p0

    move-object v6, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lfj/k;-><init>(Lfj/m;Lfj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {p0, v8, v0}, Lfj/m;->p1(Ljava/util/List;Lfj/m$q;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic f1(Lfj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V
    .locals 10

    move-object/from16 v1, p7

    const-string v2, "PaymentsProtocol: trying with dynamic query."

    const-string v3, "rbx.purchaseflow"

    invoke-static {v3, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lfj/m;->A:Ljava/lang/String;

    const-string v4, "subs"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iput-boolean v2, p0, Lfj/m;->o:Z

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/e;

    iget-object v4, p0, Lfj/m;->z:Ljava/lang/String;

    iget-boolean v5, p0, Lfj/m;->o:Z

    invoke-virtual {p0, v4, v1, v5, v2}, Lfj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v1, "PaymentsProtocol: invalid dynamic productDetails."

    invoke-static {v3, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p1}, Lfj/c;->c()Z

    move-result v2

    invoke-virtual {p0, v1, v2}, Lfj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lfj/m;->m:Ljava/lang/String;

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    const-string v2, "PaymentsProtocol: paymentsProtocolStartPurchase with payload string opening billing."

    invoke-static {v3, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v2, p0, Lfj/m;->o:Z

    invoke-virtual {p1}, Lfj/c;->a()Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    move-object v0, p0

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v9}, Lfj/m;->n1(Lcom/android/billingclient/api/e;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    const-string v0, "PaymentsProtocol: dynamic query dynamicProductDetailsList is empty."

    invoke-static {v3, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public g(Ljava/lang/String;JJ)Z
    .locals 2

    long-to-int p2, p2

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lfj/m;->M1()V

    new-instance p2, Lfj/e;

    sget-object v0, Lfj/e$b;->s:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p2, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lfj/m;->N1()V

    new-instance p2, Lfj/e;

    sget-object v0, Lfj/e$b;->a:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p2, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    move p2, p3

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->q1()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lfj/m;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, ""

    :goto_1
    invoke-static {p2, p4, p5, p1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinishedV2(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-static {p2, p4, p5, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinished(ZJLjava/lang/String;)V

    :goto_2
    return p3
.end method

.method public final synthetic g1(ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 12

    invoke-virtual/range {p9 .. p9}, Lv7/n;->a()Ljava/util/List;

    move-result-object v0

    const-string v1, "PaymentsProtocol: queryProductDetailsAsync."

    const-string v2, "rbx.purchaseflow"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {p8 .. p8}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "PaymentsProtocol: productDetailsList is empty."

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/android/billingclient/api/e;

    invoke-virtual {v3}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "subs"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v10, ""

    move-object v2, p0

    move v4, p1

    move-wide v5, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v11, p7

    invoke-virtual/range {v2 .. v11}, Lfj/m;->n1(Lcom/android/billingclient/api/e;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "PaymentsProtocol: Failed to get product details. BillingResult: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 p2, p8

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->G0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lfj/m;->B1()V

    :cond_3
    return-void
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lej/j;ZLjava/lang/String;)Z
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfj/m;->q:Z

    if-eqz p6, :cond_0

    iput-object p6, p0, Lfj/m;->r:Ljava/lang/String;

    :cond_0
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "startInAppPurchase productId: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isSubscriptionPurchase: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paymentSessionId: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfj/m;->r:Ljava/lang/String;

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p6}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move v8, p5

    invoke-virtual/range {v1 .. v8}, Lfj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;Z)Z

    move-result p1

    return p1
.end method

.method public final synthetic h1(Ljava/util/List;Lfj/m$q;Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 4

    invoke-virtual {p4}, Lv7/n;->a()Ljava/util/List;

    move-result-object p4

    invoke-virtual {p3}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_3

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Returned no ProductDetails for Products: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/e;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "subs"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lfj/m;->f:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lfj/m;->e:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "queryProductDetails Success. Products: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed queryProductDetails. Products: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", BillingResult: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-interface {p2, p4}, Lfj/m$q;->a(Ljava/util/List;)V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lej/j;Z)Z
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfj/m;->q:Z

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move v8, p5

    invoke-virtual/range {v1 .. v8}, Lfj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;Z)Z

    move-result p1

    return p1
.end method

.method public final synthetic i1(Lfj/c;ZLjava/util/List;)V
    .locals 2

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/android/billingclient/api/e;

    invoke-virtual {p1}, Lfj/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lfj/c;->c()Z

    move-result v1

    invoke-virtual {p0, v0, p3, v1}, Lfj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lfj/c;->c()Z

    move-result v0

    invoke-virtual {p0, p3, v0}, Lfj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lfj/m;->m:Ljava/lang/String;

    iget-object p3, p0, Lfj/m;->s:Lvi/g;

    new-instance v0, Lej/h;

    iget-object v1, p0, Lfj/m;->n:Ljava/lang/String;

    invoke-virtual {p1}, Lfj/c;->f()Ljava/lang/String;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {v0, v1, p1, p2}, Lej/h;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p3, v0}, Lvi/g;->h0(Lej/h;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lfj/m;->E0(Lhj/b;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lfj/c;->f()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lfj/e$b;->v:Lfj/e$b;

    const-string p3, "Product details not found"

    invoke-virtual {p0, p1, p2, p3}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public j(Ljava/lang/String;)Z
    .locals 0

    iput-object p1, p0, Lfj/m;->x:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final j1(Lv7/k;Z)V
    .locals 3

    iget-object v0, p0, Lfj/m;->u:Lej/j;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lfj/m;->Z0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfj/m;->u:Lej/j;

    invoke-interface {v0}, Lej/j;->b()V

    :cond_0
    invoke-static {}, Lsg/a1;->c1()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lfj/d;

    iget-boolean v2, p0, Lfj/m;->q:Z

    invoke-direct {v1, p1, p2, v2}, Lfj/d;-><init>(Lv7/k;ZZ)V

    new-instance p2, Lej/m;

    iget-object v2, p0, Lfj/m;->t:Lei/f;

    invoke-direct {p2, v2}, Lej/m;-><init>(Lei/f;)V

    new-instance v2, Lfj/m$l;

    invoke-direct {v2, p0, p1}, Lfj/m$l;-><init>(Lfj/m;Lv7/k;)V

    invoke-virtual {p2, v0, v1, v2}, Lej/m;->b(Ljava/lang/String;Lgi/a;Lej/m$c;)V

    return-void
.end method

.method public k(Z)V
    .locals 0

    iput-boolean p1, p0, Lfj/m;->q:Z

    return-void
.end method

.method public final k1(Ljava/lang/String;Lfj/e$b;)V
    .locals 8

    sget-object v0, Lfj/e$b;->a:Lfj/e$b;

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Lfj/m;->N1()V

    goto :goto_0

    :cond_0
    sget-object v1, Lfj/e$b;->j:Lfj/e$b;

    if-ne p2, v1, :cond_1

    invoke-virtual {p0}, Lfj/m;->L1()V

    goto :goto_0

    :cond_1
    sget-object v1, Lfj/e$b;->k:Lfj/e$b;

    if-ne p2, v1, :cond_2

    invoke-virtual {p0}, Lfj/m;->K1()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lfj/m;->M1()V

    :goto_0
    iget-object v1, p0, Lfj/m;->u:Lej/j;

    if-eqz v1, :cond_9

    invoke-virtual {p0, p1}, Lfj/m;->Z0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lfj/m;->u:Lej/j;

    instance-of v2, v1, Lwh/r0;

    if-eqz v2, :cond_8

    iget-wide v1, p0, Lfj/m;->p:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_7

    iget-object v1, p0, Lfj/m;->y:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    move-object v7, v1

    goto :goto_2

    :cond_3
    const-string v1, ""

    goto :goto_1

    :goto_2
    iget-object v1, p0, Lfj/m;->v:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lfj/m;->u:Lej/j;

    check-cast v1, Lwh/r0;

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    move v3, v2

    :goto_3
    iget-wide v4, p0, Lfj/m;->p:J

    iget-object p2, p0, Lfj/m;->v:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    move-object v2, v1

    invoke-interface/range {v2 .. v7}, Lwh/r0;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object v1, p0, Lfj/m;->u:Lej/j;

    check-cast v1, Lwh/r0;

    if-ne p2, v0, :cond_6

    goto :goto_4

    :cond_6
    move v3, v2

    :goto_4
    iget-wide v4, p0, Lfj/m;->p:J

    iget-object v6, p0, Lfj/m;->k:Ljava/lang/String;

    move-object v2, v1

    invoke-interface/range {v2 .. v7}, Lwh/r0;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignore calling inGamePurchaseFinished: mUserId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lfj/m;->p:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ". mProductId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".. checkoutSessionId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfj/m;->y:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_8
    if-eqz v1, :cond_9

    new-instance v0, Lfj/e;

    iget-object v2, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {v0, p2, v2}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Lej/j;->e(Lej/k;)V

    :cond_9
    :goto_5
    invoke-virtual {p0, p1}, Lfj/m;->Z0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lfj/m;->t1()V

    :cond_a
    return-void
.end method

.method public l(Ljava/lang/String;)Z
    .locals 0

    iput-object p1, p0, Lfj/m;->y:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0, p3}, Lvi/g;->l(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lfj/m;->k1(Ljava/lang/String;Lfj/e$b;)V

    return-void
.end method

.method public m(I)V
    .locals 3

    const/16 v0, 0xc8

    const-string v1, "rbx.purchaseflow"

    if-eq p1, v0, :cond_6

    const/16 v0, 0x1ad

    if-eq p1, v0, :cond_5

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_4

    const/16 v0, 0x190

    if-eq p1, v0, :cond_3

    const/16 v0, 0x191

    if-eq p1, v0, :cond_2

    const/16 v0, 0x193

    if-eq p1, v0, :cond_1

    const/16 v0, 0x194

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Validation unknown error: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->J()V

    goto :goto_0

    :cond_0
    const-string p1, "{validateModel} is invalid."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->F()V

    goto :goto_0

    :cond_1
    const-string p1, "Unauthorized to make request. XSRF token is needed."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->E()V

    goto :goto_0

    :cond_2
    const-string p1, "Unauthorized to make request. Auth cookie is needed."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->D()V

    goto :goto_0

    :cond_3
    const-string p1, "Service has thrown an uknown exception."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->C()V

    goto :goto_0

    :cond_4
    const-string p1, "Server Error"

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->H()V

    goto :goto_0

    :cond_5
    const-string p1, "Service has been rate limited to user."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->G()V

    goto :goto_0

    :cond_6
    const-string p1, "Validation successful"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->a:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->B()V

    :goto_0
    sget-object v0, Lfj/m$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_b

    const/4 v0, 0x2

    if-eq p1, v0, :cond_a

    const/4 v0, 0x3

    if-eq p1, v0, :cond_9

    const/4 v0, 0x4

    if-eq p1, v0, :cond_8

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    invoke-virtual {p0}, Lfj/m;->J1()V

    new-instance p1, Lfj/e;

    sget-object v0, Lfj/e$b;->w:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    return-void

    :cond_7
    invoke-virtual {p0}, Lfj/m;->G1()V

    new-instance p1, Lfj/e;

    sget-object v0, Lfj/e$b;->f:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    return-void

    :cond_8
    invoke-virtual {p0}, Lfj/m;->G1()V

    new-instance p1, Lfj/e;

    sget-object v0, Lfj/e$b;->e:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    return-void

    :cond_9
    invoke-virtual {p0}, Lfj/m;->I1()V

    new-instance p1, Lfj/e;

    sget-object v0, Lfj/e$b;->d:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    return-void

    :cond_a
    invoke-virtual {p0}, Lfj/m;->F1()V

    new-instance p1, Lfj/e;

    sget-object v0, Lfj/e$b;->c:Lfj/e$b;

    iget-object v1, p0, Lfj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V

    :cond_b
    return-void
.end method

.method public m1(JLjava/lang/String;Z)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    invoke-static {p1, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    :cond_0
    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases attempt."

    const-string p2, "rbx.purchaseflow"

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lfj/m;->X0()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup."

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p0}, Lfj/m;->U0()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress."

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    if-nez p4, :cond_3

    iget-boolean p1, p0, Lfj/m;->h:Z

    if-eqz p1, :cond_3

    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume."

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->E()Z

    move-result p1

    const-string p2, "subs"

    const-string p3, "inapp"

    const/4 p4, 0x1

    if-eqz p1, :cond_4

    invoke-static {}, Lv7/o;->b()Lv7/o$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lv7/o$a;->b(Ljava/lang/String;)Lv7/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lv7/o$a;->a()Lv7/o;

    move-result-object p1

    invoke-static {}, Lv7/o;->b()Lv7/o$a;

    move-result-object p3

    invoke-virtual {p3, p2}, Lv7/o$a;->b(Ljava/lang/String;)Lv7/o$a;

    move-result-object p2

    invoke-virtual {p2}, Lv7/o$a;->a()Lv7/o;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Lfj/m;->C1(Z)V

    iget-object p3, p0, Lfj/m;->a:Lfj/h0;

    new-instance v0, Lfj/g;

    invoke-direct {v0, p0}, Lfj/g;-><init>(Lfj/m;)V

    invoke-interface {p3, p1, v0}, Lfj/h0;->g(Lv7/o;Lv7/l;)V

    invoke-virtual {p0, p4}, Lfj/m;->C1(Z)V

    iget-object p1, p0, Lfj/m;->a:Lfj/h0;

    new-instance p3, Lfj/h;

    invoke-direct {p3, p0}, Lfj/h;-><init>(Lfj/m;)V

    invoke-interface {p1, p2, p3}, Lfj/h0;->g(Lv7/o;Lv7/l;)V

    iput-boolean p4, p0, Lfj/m;->h:Z

    return-void

    :cond_4
    invoke-virtual {p0, p3}, Lfj/m;->o1(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lfj/m;->o1(Ljava/lang/String;)V

    iput-boolean p4, p0, Lfj/m;->h:Z

    return-void
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;)Z
    .locals 9

    const/4 v0, 0x0

    iput-boolean v0, p0, Lfj/m;->q:Z

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lfj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;Z)Z

    move-result p1

    return p1
.end method

.method public final n1(Lcom/android/billingclient/api/e;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "PaymentsProtocol: paymentsProtocolOpenBillingFlow"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->T3()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lfj/m;->w0(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    sget-object p1, Lfj/e$b;->v:Lfj/e$b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "No matching or base plan offer available for subscription product: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p6, p1, p2}, Lfj/m;->l1(Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object p2

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/e$e;

    invoke-virtual {p2}, Lcom/android/billingclient/api/e$e;->b()Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-static {}, Lcom/android/billingclient/api/c$b;->b()Lcom/android/billingclient/api/c$b$a;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/android/billingclient/api/c$b$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c$b$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/c$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/c$b$a;->a()Lcom/android/billingclient/api/c$b;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/android/billingclient/api/c$b;->b()Lcom/android/billingclient/api/c$b$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/android/billingclient/api/c$b$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/c$b$a;->a()Lcom/android/billingclient/api/c$b;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-lez p1, :cond_3

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p5

    :cond_3
    invoke-static {}, Lcom/android/billingclient/api/c;->b()Lcom/android/billingclient/api/c$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/android/billingclient/api/c$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/c$a;->d(Ljava/util/List;)Lcom/android/billingclient/api/c$a;

    move-result-object p1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->c2()Z

    move-result p2

    const-string p3, "Android-Purchase-Initiated-Without-Obfuscated-Profile-Id"

    const-string p4, "Android-Purchase-Initiated-With-Checkout-Session-Id"

    const-string p5, "Android-Purchase-Initiated-With-Charge-Request-Id"

    if-eqz p2, :cond_6

    if-eqz p8, :cond_4

    invoke-virtual {p8}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1, p8}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {p2, p5}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    if-eqz p9, :cond_5

    invoke-virtual {p9}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p1, p9}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {p2, p4}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const-string p2, "Both chargeRequestId and checkoutSessionId are empty."

    invoke-static {v1, p2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {p2, p3}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    iget-object p2, p0, Lfj/m;->x:Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {p2, p5}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    iget-object p2, p0, Lfj/m;->y:Ljava/lang/String;

    if-eqz p2, :cond_8

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {p2, p4}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    const-string p2, "Both mStoredChargeRequestId and mCurrentCheckoutSessionId are null."

    invoke-static {v1, p2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {p2, p3}, Lvi/g;->q(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1}, Lcom/android/billingclient/api/c$a;->a()Lcom/android/billingclient/api/c;

    move-result-object p1

    iput-object p6, p0, Lfj/m;->l:Ljava/lang/String;

    iget-object p2, p0, Lfj/m;->a:Lfj/h0;

    invoke-interface {p2, p7, p1}, Lfj/h0;->h(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "PaymentsProtocol: launchBillingFlow failed!"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    return-void
.end method

.method public final o1(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lfj/m;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lv7/o;->b()Lv7/o$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv7/o$a;->b(Ljava/lang/String;)Lv7/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lv7/o$a;->a()Lv7/o;

    move-result-object p1

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    new-instance v1, Lfj/m$b;

    invoke-direct {v1, p0}, Lfj/m$b;-><init>(Lfj/m;)V

    invoke-interface {v0, p1, v1}, Lfj/h0;->g(Lv7/o;Lv7/l;)V

    return-void
.end method

.method public final p1(Ljava/util/List;Lfj/m$q;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfj/m$p;",
            ">;",
            "Lfj/m$q;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    const-string v1, "fff"

    invoke-interface {v0, v1}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "rbx.purchaseflow"

    const-string v0, "ProductDetails feature is not supported."

    invoke-static {p1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lfj/m;->H1()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lfj/m$q;->a(Ljava/util/List;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfj/m$p;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    iget-object v4, v2, Lfj/m$p;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    iget-object v2, v2, Lfj/m$p;->b:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    iget-object v1, p0, Lfj/m;->a:Lfj/h0;

    new-instance v2, Lfj/j;

    invoke-direct {v2, p0, p1, p2}, Lfj/j;-><init>(Lfj/m;Ljava/util/List;Lfj/m$q;)V

    invoke-interface {v1, v0, v2}, Lfj/h0;->a(Lcom/android/billingclient/api/f;Lv7/j;)V

    return-void
.end method

.method public final q1(Lfj/m$r;)V
    .locals 4

    const-string v0, "Attempt queryInAppProduct"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    const-string v2, "fff"

    invoke-interface {v0, v2}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ProductDetails feature is not supported."

    invoke-static {v1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lfj/m;->H1()V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lfj/m$r;->a()V

    return-void

    :cond_0
    iget-object v0, p0, Lfj/m;->c:Lfj/m$o;

    sget-object v2, Lfj/m$o;->c:Lfj/m$o;

    if-ne v0, v2, :cond_2

    const-string v0, "queryInAppProduct is setup already"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lfj/m$r;->a()V

    :cond_1
    return-void

    :cond_2
    sget-object v2, Lfj/m$o;->a:Lfj/m$o;

    if-eq v0, v2, :cond_3

    const-string p1, "queryInAppProduct is pending"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {}, Lfj/m;->G0()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v2

    const-string v3, "inapp"

    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sget-object v1, Lfj/m$o;->b:Lfj/m$o;

    iput-object v1, p0, Lfj/m;->c:Lfj/m$o;

    iget-object v1, p0, Lfj/m;->a:Lfj/h0;

    new-instance v2, Lfj/m$g;

    invoke-direct {v2, p0, p1}, Lfj/m$g;-><init>(Lfj/m;Lfj/m$r;)V

    invoke-interface {v1, v0, v2}, Lfj/h0;->a(Lcom/android/billingclient/api/f;Lv7/j;)V

    return-void
.end method

.method public final r1(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lfj/m;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lv7/o;->b()Lv7/o$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv7/o$a;->b(Ljava/lang/String;)Lv7/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lv7/o$a;->a()Lv7/o;

    move-result-object v0

    iget-object v1, p0, Lfj/m;->a:Lfj/h0;

    new-instance v2, Lfj/m$a;

    invoke-direct {v2, p0, p1}, Lfj/m$a;-><init>(Lfj/m;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Lfj/h0;->g(Lv7/o;Lv7/l;)V

    return-void
.end method

.method public final s1(Lfj/m$r;)V
    .locals 5

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Attempt querySubsProduct"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lfj/m;->a:Lfj/h0;

    const-string v3, "subscriptions"

    invoke-interface {v2, v3}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/d;->c()I

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "Google Billing Client does not support subscription purchases."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, p0, Lfj/m;->a:Lfj/h0;

    const-string v3, "fff"

    invoke-interface {v2, v3}, Lfj/h0;->e(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/d;->c()I

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "ProductDetails feature is not supported."

    invoke-static {v0, v1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lfj/m;->H1()V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lfj/m$r;->a()V

    return-void

    :cond_1
    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lfj/m;->d:Lfj/m$o;

    sget-object v2, Lfj/m$o;->c:Lfj/m$o;

    if-ne v1, v2, :cond_3

    const-string v1, "querySubsProduct is setup already"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lfj/m$r;->a()V

    :cond_2
    return-void

    :cond_3
    sget-object v2, Lfj/m$o;->a:Lfj/m$o;

    if-eq v1, v2, :cond_4

    const-string p1, "querySubsProduct is pending"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-static {}, Lfj/m;->N0()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    const-string v4, "subs"

    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/f$b$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/f$b$a;->a()Lcom/android/billingclient/api/f$b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/android/billingclient/api/f;->a()Lcom/android/billingclient/api/f$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/f$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v1

    sget-object v3, Lfj/m$o;->b:Lfj/m$o;

    iput-object v3, p0, Lfj/m;->d:Lfj/m$o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Querying SUBS ProductDetails. Count = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    new-instance v2, Lfj/m$h;

    invoke-direct {v2, p0, p1}, Lfj/m$h;-><init>(Lfj/m;Lfj/m$r;)V

    invoke-interface {v0, v1, v2}, Lfj/h0;->a(Lcom/android/billingclient/api/f;Lv7/j;)V

    return-void
.end method

.method public final t1()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lfj/m;->j:Landroid/app/Activity;

    iput-object v0, p0, Lfj/m;->u:Lej/j;

    iput-object v0, p0, Lfj/m;->k:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lfj/m;->p:J

    iput-object v0, p0, Lfj/m;->w:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->m:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lfj/m;->q:Z

    iput-object v0, p0, Lfj/m;->r:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->x:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->y:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->z:Ljava/lang/String;

    iput-object v0, p0, Lfj/m;->A:Ljava/lang/String;

    return-void
.end method

.method public final u1()V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    invoke-virtual {v0, v1}, Lvi/g;->o(Z)V

    :cond_0
    return-void
.end method

.method public v0(Lv7/k;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lfj/b;->j(Lv7/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final v1()V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    iget-boolean v1, p0, Lfj/m;->q:Z

    invoke-virtual {v0, v1}, Lvi/g;->p(Z)V

    :cond_0
    return-void
.end method

.method public final w0(Lcom/android/billingclient/api/e;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lfj/m;->B:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lfj/m;->B:Ljava/util/List;

    invoke-static {p1, v0}, Lfj/j0;->h(Lcom/android/billingclient/api/e;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    const-string v2, "Android-Subscription-Offer-Id-Not-Found"

    invoke-virtual {v0, v2}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->z0()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p1}, Lfj/j0;->a(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    iget-object p1, p0, Lfj/m;->s:Lvi/g;

    const-string v0, "Android-Subscription-Offer-No-Base-Plan-Available"

    invoke-virtual {p1, v0}, Lvi/g;->q(Ljava/lang/String;)V

    return-object v1
.end method

.method public final w1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->t()V

    :cond_0
    return-void
.end method

.method public final x0(Lv7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 3

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1}, Lv7/k;->i()Z

    move-result v1

    const-string v2, "rbx.purchaseflow"

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Attempted to acknowledge an acknowledged purchase."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lfj/e$b;->k:Lfj/e$b;

    invoke-static {p2}, Lfj/n0;->b(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)Lfj/m0;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lfj/m;->z0(Lv7/k;Lfj/e$b;Lfj/m0;)V

    return-void

    :cond_1
    :goto_0
    const-string v1, "Acknowledging Purchase"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lfj/m$m;

    invoke-direct {v1, p0, p1, v0, p2}, Lfj/m$m;-><init>(Lfj/m;Lv7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    invoke-virtual {p0, p1, v1}, Lfj/m;->y0(Lv7/k;Lv7/c;)V

    return-void
.end method

.method public final x1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->u()V

    :cond_0
    return-void
.end method

.method public final y0(Lv7/k;Lv7/c;)V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Start acknowledging Purchase"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lv7/b;->b()Lv7/b$a;

    move-result-object v0

    invoke-virtual {p1}, Lv7/k;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv7/b$a;->b(Ljava/lang/String;)Lv7/b$a;

    move-result-object p1

    invoke-virtual {p1}, Lv7/b$a;->a()Lv7/b;

    move-result-object p1

    iget-object v0, p0, Lfj/m;->a:Lfj/h0;

    invoke-interface {v0, p1, p2}, Lfj/h0;->d(Lv7/b;Lv7/c;)V

    return-void
.end method

.method public final y1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->v()V

    :cond_0
    return-void
.end method

.method public final z0(Lv7/k;Lfj/e$b;Lfj/m0;)V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Acknowledged Purchase"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lfj/m;->Y0(Lv7/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lfj/j0;->e(Lv7/k;)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lfj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v0, p3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lfj/m;->k1(Ljava/lang/String;Lfj/e$b;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lfj/m;->v0(Lv7/k;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lfj/j0;->e(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lfj/e0;->m(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Lfj/m;->i:Lfj/b0;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Lfj/b0;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    if-eqz v1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lfj/m;->s:Lvi/g;

    const-string p3, "Play-Points-Not-Show-Confirmation-Screen"

    invoke-virtual {p2, p3}, Lvi/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lfj/m;->s:Lvi/g;

    const-string v2, "Play-Points-Show-Confirmation-Screen"

    invoke-virtual {v1, v2}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v3}, Lfj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->builder()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setNativeProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setRobuxAmount(I)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setDescription(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-static {v1}, Lfj/j0;->c(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setDisplayPrice(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-static {v1}, Lfj/j0;->f(Lcom/android/billingclient/api/e;)F

    move-result v2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setPrice(F)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-static {v1}, Lfj/j0;->b(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setCurrencyCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-static {p3}, Lfj/n0;->a(Lfj/m0;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->setRobloxPurchaseInfo(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOOAPPurchaseFinished(Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;)V

    iget-object p2, p0, Lfj/m;->i:Lfj/b0;

    if-eqz p2, :cond_3

    invoke-virtual {p2, v0}, Lfj/b0;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lfj/m;->C0(Lv7/k;)V

    return-void
.end method

.method public final z1()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/m;->s:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->w()V

    :cond_0
    return-void
.end method
