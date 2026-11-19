.class public Lnj/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnj/m$o;,
        Lnj/m$r;,
        Lnj/m$p;,
        Lnj/m$q;
    }
.end annotation


# static fields
.field public static E:Lnj/m;

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

.field public D:Lw7/m;

.field public a:Lnj/h0;

.field public b:Lnj/m$o;

.field public c:Lnj/m$o;

.field public d:Lnj/m$o;

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
            "Lw7/k;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:Lnj/b0;

.field public j:Landroid/app/Activity;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:J

.field public q:Z

.field public r:Ljava/lang/String;

.field public s:Ldj/g;

.field public t:Lmi/f;

.field public u:Lmj/o;

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

    sput-object v0, Lnj/m;->F:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "com.roblox.robloxmobile.robloxpremium1000"

    const-string v2, "com.roblox.robloxmobile.robloxpremium2200"

    const-string v3, "com.roblox.robloxmobile.robloxpremium450"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lnj/m;->H:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lnj/h0;Lmi/f;Ldj/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lnj/m$o;->a:Lnj/m$o;

    iput-object v0, p0, Lnj/m;->b:Lnj/m$o;

    iput-object v0, p0, Lnj/m;->c:Lnj/m$o;

    iput-object v0, p0, Lnj/m;->d:Lnj/m$o;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/m;->e:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/m;->f:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lnj/m;->g:Ljava/util/Hashtable;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnj/m;->h:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lnj/m;->i:Lnj/b0;

    iput-object v0, p0, Lnj/m;->k:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->l:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->m:Ljava/lang/String;

    const-string v1, ""

    iput-object v1, p0, Lnj/m;->n:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lnj/m;->p:J

    const/4 v1, 0x1

    iput-boolean v1, p0, Lnj/m;->q:Z

    iput-object v0, p0, Lnj/m;->r:Ljava/lang/String;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, p0, Lnj/m;->v:Ljava/util/Hashtable;

    iput-object v0, p0, Lnj/m;->x:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->y:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->z:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->A:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->B:Ljava/util/List;

    new-instance v0, Lnj/m$j;

    invoke-direct {v0, p0}, Lnj/m$j;-><init>(Lnj/m;)V

    iput-object v0, p0, Lnj/m;->C:Lcom/roblox/client/purchase/a$f;

    new-instance v0, Lnj/m$k;

    invoke-direct {v0, p0}, Lnj/m$k;-><init>(Lnj/m;)V

    iput-object v0, p0, Lnj/m;->D:Lw7/m;

    iput-object p1, p0, Lnj/m;->a:Lnj/h0;

    iput-object p2, p0, Lnj/m;->t:Lmi/f;

    iput-object p3, p0, Lnj/m;->s:Ldj/g;

    return-void
.end method

.method public static bridge synthetic A(Lnj/m;)Lmj/o;
    .locals 0

    iget-object p0, p0, Lnj/m;->u:Lmj/o;

    return-object p0
.end method

.method public static bridge synthetic B(Lnj/m;)Ldj/g;
    .locals 0

    iget-object p0, p0, Lnj/m;->s:Ldj/g;

    return-object p0
.end method

.method public static bridge synthetic C(Lnj/m;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lnj/m;->f:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic D(Lnj/m;)J
    .locals 2

    iget-wide v0, p0, Lnj/m;->p:J

    return-wide v0
.end method

.method public static bridge synthetic E(Lnj/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lnj/m;->n:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic F(Lnj/m;Z)V
    .locals 0

    iput-boolean p1, p0, Lnj/m;->h:Z

    return-void
.end method

.method public static F0(Landroid/content/Context;)Lnj/m;
    .locals 4

    sget-object v0, Lnj/m;->E:Lnj/m;

    if-nez v0, :cond_0

    new-instance v0, Lmi/h;

    invoke-direct {v0}, Lmi/h;-><init>()V

    new-instance v1, Lnj/b;

    invoke-direct {v1}, Lnj/b;-><init>()V

    new-instance v2, Lnj/m;

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object v3

    invoke-direct {v2, v1, v0, v3}, Lnj/m;-><init>(Lnj/h0;Lmi/f;Ldj/g;)V

    sput-object v2, Lnj/m;->E:Lnj/m;

    invoke-static {p0}, Lcom/android/billingclient/api/a;->f(Landroid/content/Context;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    sget-object v1, Lnj/m;->E:Lnj/m;

    iget-object v1, v1, Lnj/m;->D:Lw7/m;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/a$a;->c(Lw7/m;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    invoke-static {}, Lw7/i;->c()Lw7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/i$a;->b()Lw7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/i$a;->c()Lw7/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/i$a;->a()Lw7/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/a$a;->b(Lw7/i;)Lcom/android/billingclient/api/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/a$a;->a()Lcom/android/billingclient/api/a;

    move-result-object v0

    sget-object v1, Lnj/m;->E:Lnj/m;

    invoke-virtual {v1, v0}, Lnj/m;->U1(Lcom/android/billingclient/api/a;)V

    new-instance v0, Lnj/b0;

    invoke-direct {v0, p0}, Lnj/b0;-><init>(Landroid/content/Context;)V

    sget-object p0, Lnj/m;->E:Lnj/m;

    invoke-virtual {p0, v0}, Lnj/m;->T1(Lnj/b0;)V

    :cond_0
    sget-object p0, Lnj/m;->E:Lnj/m;

    return-object p0
.end method

.method public static bridge synthetic G(Lnj/m;Lnj/m$o;)V
    .locals 0

    iput-object p1, p0, Lnj/m;->b:Lnj/m$o;

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

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->V3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lnj/m;->G:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lnj/m;->G:Ljava/util/List;

    :cond_0
    sget-object v0, Lnj/m;->G:Ljava/util/List;

    return-object v0

    :cond_1
    sget-object v0, Lnj/m;->F:Ljava/util/List;

    return-object v0
.end method

.method public static bridge synthetic H(Lnj/m;Lnj/m$o;)V
    .locals 0

    iput-object p1, p0, Lnj/m;->c:Lnj/m$o;

    return-void
.end method

.method public static bridge synthetic I(Lnj/m;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnj/m;->m:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic J(Lnj/m;Lnj/m$o;)V
    .locals 0

    iput-object p1, p0, Lnj/m;->d:Lnj/m$o;

    return-void
.end method

.method public static bridge synthetic K(Lnj/m;Lw7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->x0(Lw7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

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

.method public static bridge synthetic L(Lnj/m;Lw7/k;Lnj/e$b;Lnj/m0;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->z0(Lw7/k;Lnj/e$b;Lnj/m0;)V

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

.method public static bridge synthetic M(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->D0()V

    return-void
.end method

.method public static bridge synthetic N(Lnj/m;Lpj/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->E0(Lpj/b;)V

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

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->K0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lnj/m;->I:Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lnj/m;->I:Ljava/util/List;

    :cond_0
    sget-object v0, Lnj/m;->I:Ljava/util/List;

    return-object v0

    :cond_1
    sget-object v0, Lnj/m;->H:Ljava/util/List;

    return-object v0
.end method

.method public static bridge synthetic O(Lnj/m;Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->H0(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic P(Lnj/m;Lw7/k;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->I0(Lw7/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic Q(Lnj/m;Ljava/lang/String;Z)Lcom/android/billingclient/api/e;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic R(Lnj/m;Lcom/android/billingclient/api/e;Z)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic S(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->O0()V

    return-void
.end method

.method public static bridge synthetic T(Lnj/m;Lw7/k;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->P0(Lw7/k;I)V

    return-void
.end method

.method private T0()Z
    .locals 1

    iget-object v0, p0, Lnj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic U(Lnj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic V(Lnj/m;Ljava/util/List;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->R0(Ljava/util/List;Z)V

    return-void
.end method

.method public static bridge synthetic W(Lnj/m;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->V0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic X(Lnj/m;Lw7/k;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->Y0(Lw7/k;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic Y(Lnj/m;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->Z0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic Z(Lnj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic a0(Lnj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic b0(Lnj/m;Ljava/lang/String;Lnj/e$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->k1(Ljava/lang/String;Lnj/e$b;)V

    return-void
.end method

.method public static bridge synthetic c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic d0(Lnj/m;Lnj/m$r;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->q1(Lnj/m$r;)V

    return-void
.end method

.method public static bridge synthetic e0(Lnj/m;Lnj/m$r;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnj/m;->s1(Lnj/m$r;)V

    return-void
.end method

.method public static bridge synthetic f0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->t1()V

    return-void
.end method

.method public static bridge synthetic g0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->u1()V

    return-void
.end method

.method public static bridge synthetic h0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->v1()V

    return-void
.end method

.method public static bridge synthetic i0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->D1()V

    return-void
.end method

.method public static bridge synthetic j0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->E1()V

    return-void
.end method

.method public static bridge synthetic k0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->F1()V

    return-void
.end method

.method public static bridge synthetic l0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->G1()V

    return-void
.end method

.method public static bridge synthetic m0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->I1()V

    return-void
.end method

.method public static bridge synthetic n0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->J1()V

    return-void
.end method

.method public static synthetic o(Lnj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->e1(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic o0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->L1()V

    return-void
.end method

.method public static synthetic p(Lnj/m;Ljava/util/Map;ZLjava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->c1(Ljava/util/Map;ZLjava/util/List;)V

    return-void
.end method

.method public static bridge synthetic p0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->M1()V

    return-void
.end method

.method public static synthetic q(Lnj/m;Lnj/c;ZLjava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->i1(Lnj/c;ZLjava/util/List;)V

    return-void
.end method

.method public static bridge synthetic q0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->O1()V

    return-void
.end method

.method public static synthetic r(Lnj/m;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 0

    invoke-virtual/range {p0 .. p9}, Lnj/m;->g1(ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method

.method public static bridge synthetic r0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->P1()V

    return-void
.end method

.method public static synthetic s(Lnj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnj/m;->d1(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic s0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->Q1()V

    return-void
.end method

.method public static synthetic t(Lnj/m;Lnj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0

    invoke-virtual/range {p0 .. p7}, Lnj/m;->f1(Lnj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic t0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->R1()V

    return-void
.end method

.method public static synthetic u(Lnj/m;Ljava/util/List;Lnj/m$q;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnj/m;->h1(Ljava/util/List;Lnj/m$q;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method

.method public static bridge synthetic u0(Lnj/m;)V
    .locals 0

    invoke-virtual {p0}, Lnj/m;->S1()V

    return-void
.end method

.method public static bridge synthetic v(Lnj/m;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lnj/m;->g:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic w(Lnj/m;)Lnj/h0;
    .locals 0

    iget-object p0, p0, Lnj/m;->a:Lnj/h0;

    return-object p0
.end method

.method public static bridge synthetic x(Lnj/m;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lnj/m;->e:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic y(Lnj/m;)Z
    .locals 0

    iget-boolean p0, p0, Lnj/m;->o:Z

    return p0
.end method

.method public static bridge synthetic z(Lnj/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lnj/m;->k:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public A0(JLjava/lang/String;Z)V
    .locals 0

    iput-wide p1, p0, Lnj/m;->p:J

    invoke-virtual {p0, p3, p4}, Lnj/m;->B0(Ljava/lang/String;Z)V

    return-void
.end method

.method public final A1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->x()V

    :cond_0
    return-void
.end method

.method public B0(Ljava/lang/String;Z)V
    .locals 1

    iput-object p1, p0, Lnj/m;->n:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "attemptGrantPendingPurchases isAppResume:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/m;->X0()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "attemptGrantPendingPurchases failed: purchasing is not setup"

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Lnj/m;->U0()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "attemptGrantPendingPurchases failed: purchase already pending"

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lnj/m;->O0()V

    return-void

    :cond_2
    invoke-direct {p0}, Lnj/m;->T0()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Found cached pending purchase. Count = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lnj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {p2}, Ljava/util/Hashtable;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/m;->O0()V

    return-void

    :cond_3
    iget-boolean p1, p0, Lnj/m;->h:Z

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lnj/m;->O0()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lnj/m;->h:Z

    :cond_4
    return-void
.end method

.method public final B1()V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "Payments-Protocol-Query-Product-Details-Failed"

    invoke-virtual {v0, v1}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final C0(Lw7/k;)V
    .locals 4

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->u0()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lnj/e0;->l(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnj/m;->s:Ldj/g;

    const-string v0, "Play-Points-Not-Consume-Purchase"

    invoke-virtual {p1, v0}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    const-string v1, "rbx.purchaseflow"

    const-string v2, "Consuming Purchase"

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lw7/e;->b()Lw7/e$a;

    move-result-object v1

    invoke-virtual {p1}, Lw7/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lw7/e$a;->b(Ljava/lang/String;)Lw7/e$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/e$a;->a()Lw7/e;

    move-result-object v1

    iget-object v2, p0, Lnj/m;->a:Lnj/h0;

    new-instance v3, Lnj/m$n;

    invoke-direct {v3, p0, v0, p1}, Lnj/m$n;-><init>(Lnj/m;Ljava/lang/String;Lw7/k;)V

    invoke-interface {v2, v1, v3}, Lnj/h0;->g(Lw7/e;Lw7/f;)V

    return-void
.end method

.method public final C1(Z)V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0, p1}, Ldj/g;->Q(Z)V

    :cond_0
    return-void
.end method

.method public final D0()V
    .locals 7

    iget-object v0, p0, Lnj/m;->u:Lmj/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmj/o;->c()V

    :cond_0
    new-instance v1, Lcom/roblox/client/purchase/a;

    iget-object v0, p0, Lnj/m;->t:Lmi/f;

    invoke-direct {v1, v0}, Lcom/roblox/client/purchase/a;-><init>(Lmi/f;)V

    iget-object v0, p0, Lnj/m;->r:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lnj/m;->r:Ljava/lang/String;

    :goto_0
    move-object v5, v0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_2
    iget-boolean v0, p0, Lnj/m;->q:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lbh/a1;->c1()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnj/m;->k:Ljava/lang/String;

    iget-object v4, p0, Lnj/m;->m:Ljava/lang/String;

    iget-object v6, p0, Lnj/m;->C:Lcom/roblox/client/purchase/a$f;

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/purchase/a;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/purchase/a$f;)V

    return-void

    :cond_3
    invoke-static {}, Lbh/a1;->c1()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnj/m;->k:Ljava/lang/String;

    iget-object v4, p0, Lnj/m;->m:Ljava/lang/String;

    iget-object v6, p0, Lnj/m;->C:Lcom/roblox/client/purchase/a$f;

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/purchase/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/purchase/a$f;)V

    return-void
.end method

.method public final D1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->R()V

    :cond_0
    return-void
.end method

.method public final E0(Lpj/b;)V
    .locals 6

    iget-object v0, p0, Lnj/m;->u:Lmj/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmj/o;->d()V

    :cond_0
    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "PurchaseStarted."

    invoke-virtual {v0, v1}, Ldj/g;->l(Ljava/lang/String;)V

    iget-object v0, p0, Lnj/m;->k:Ljava/lang/String;

    iget-boolean v1, p0, Lnj/m;->o:Z

    invoke-virtual {p0, v0, v1}, Lnj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v0

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    iget-boolean v2, p0, Lnj/m;->o:Z

    invoke-virtual {p0, v1, v0, v2}, Lnj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, p0, Lnj/m;->o:Z

    if-eqz v2, :cond_4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->d4()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Lnj/m;->w0(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    iget-object p1, p0, Lnj/m;->k:Ljava/lang/String;

    sget-object v0, Lnj/e$b;->v:Lnj/e$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No matching or base plan offer available for subscription product: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

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

    invoke-virtual {p1}, Lpj/b;->c()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lpj/b;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_5

    invoke-virtual {p1}, Lpj/b;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lnj/m;->n:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/android/billingclient/api/c;->b()Lcom/android/billingclient/api/c$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/c$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/c$a;->d(Ljava/util/List;)Lcom/android/billingclient/api/c$a;

    move-result-object v0

    iget-object v1, p0, Lnj/m;->w:Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p1, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "Android-Purchase-Initiated-With-Charge-Request-Id"

    invoke-virtual {p1, v1}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lpj/b;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lpj/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p1, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "Android-Purchase-Initiated-With-Checkout-Session-Id"

    invoke-virtual {p1, v1}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const-string p1, "rbx.purchaseflow"

    const-string v1, "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null."

    invoke-static {p1, v1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "Android-Purchase-Initiated-Without-Obfuscated-Profile-Id"

    invoke-virtual {p1, v1}, Ldj/g;->q(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v0}, Lcom/android/billingclient/api/c$a;->a()Lcom/android/billingclient/api/c;

    move-result-object p1

    iget-object v0, p0, Lnj/m;->j:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lnj/m;->j:Landroid/app/Activity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    :cond_8
    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    iget-object v1, p0, Lnj/m;->j:Landroid/app/Activity;

    invoke-interface {v0, v1, p1}, Lnj/h0;->h(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lnj/m;->k:Ljava/lang/String;

    sget-object v0, Lnj/e$b;->s:Lnj/e$b;

    const-string v1, "BillingClient.launchBillingFlow failed"

    invoke-virtual {p0, p1, v0, v1}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public final E1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->S(ZZ)V

    :cond_0
    return-void
.end method

.method public final F1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->T(ZZ)V

    :cond_0
    return-void
.end method

.method public final G1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->a0(ZZ)V

    :cond_0
    return-void
.end method

.method public final H0(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/k;",
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

    check-cast v1, Lw7/k;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

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

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->U(ZZ)V

    :cond_0
    return-void
.end method

.method public final I0(Lw7/k;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Lw7/k;->a()Lw7/a;

    move-result-object v0

    invoke-virtual {v0}, Lw7/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    invoke-virtual {p1}, Lw7/k;->a()Lw7/a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/a;->b()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "rbx.purchaseflow"

    const-string v0, "PaymentsProtocol: purchase.getAccountIdentifiers().getObfuscatedProfileId() did not return an integer and is not a valid checkoutSessionId."

    invoke-static {p1, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    return-object p1
.end method

.method public final I1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->V(ZZ)V

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

    iget-object v1, p0, Lnj/m;->f:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lnj/m;->f:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/e;

    return-object p1

    :cond_1
    if-nez p2, :cond_2

    iget-object p2, p0, Lnj/m;->e:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lnj/m;->e:Ljava/util/Hashtable;

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

    invoke-static {p2, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final J1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->W(ZZ)V

    :cond_0
    return-void
.end method

.method public final K1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->X(ZZ)V

    :cond_0
    return-void
.end method

.method public final L1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->Y(ZZ)V

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

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->Z(ZZ)V

    :cond_0
    return-void
.end method

.method public final N1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->b0(ZZ)V

    :cond_0
    return-void
.end method

.method public final O0()V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Do Google Purchase GrantPending"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D()Z

    move-result v0

    const-string v1, "subs"

    const-string v2, "inapp"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lnj/m;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lw7/o$a;->a()Lw7/o;

    move-result-object v0

    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/o$a;->a()Lw7/o;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lnj/m;->C1(Z)V

    iget-object v2, p0, Lnj/m;->a:Lnj/h0;

    new-instance v3, Lnj/m$c;

    invoke-direct {v3, p0}, Lnj/m$c;-><init>(Lnj/m;)V

    invoke-interface {v2, v0, v3}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnj/m;->C1(Z)V

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    new-instance v2, Lnj/m$d;

    invoke-direct {v2, p0}, Lnj/m$d;-><init>(Lnj/m;)V

    invoke-interface {v0, v1, v2}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    return-void

    :cond_1
    invoke-virtual {p0, v2}, Lnj/m;->r1(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lnj/m;->r1(Ljava/lang/String;)V

    return-void
.end method

.method public final O1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->c0()V

    :cond_0
    return-void
.end method

.method public final P0(Lw7/k;I)V
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

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore"

    invoke-virtual {p2, v1}, Ldj/g;->q(Ljava/lang/String;)V

    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lnj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1}, Lnj/m;->Y0(Lw7/k;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, v3, p1}, Lnj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object p2

    invoke-virtual {p0, v3, p2, p1, p1}, Lnj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lnj/m;->s:Ldj/g;

    invoke-static {p2, p1}, Lnj/m;->K0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p2, p1}, Lnj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, p1}, Lnj/m;->L0(Lcom/android/billingclient/api/e;Z)J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Ldj/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unable to find skuDetails: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    sget-object p1, Lnj/e$b;->a:Lnj/e$b;

    invoke-virtual {p0, v3, p1}, Lnj/m;->k1(Ljava/lang/String;Lnj/e$b;)V

    return-void
.end method

.method public final P1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->d0()V

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
            "Lw7/k;",
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

    check-cast p2, Lw7/k;

    invoke-virtual {p2}, Lw7/k;->f()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 p2, 0x2

    if-eq v1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnj/m;->D1()V

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

    invoke-static {v2, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p2}, Lw7/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lw7/k;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->h2()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p2}, Lnj/m;->I0(Lw7/k;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lw7/k;->a()Lw7/a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/a;->a()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p0, p2}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeFinishPaymentsProtocolPurchase(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lnj/m;->P1()V

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

    invoke-static {p1}, Lok/q;->a(Ljava/lang/String;)I

    return-void
.end method

.method public final Q1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->e0(ZZ)V

    :cond_0
    return-void
.end method

.method public final R0(Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/k;",
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

    check-cast v3, Lw7/k;

    invoke-virtual {p0, v3}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Lnj/m;->Y0(Lw7/k;)Z

    move-result v5

    invoke-virtual {p0, v4, v5}, Lnj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {p0, v3, p2}, Lnj/m;->S0(Lw7/k;Z)V

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_2

    new-instance v5, Lnj/m$p;

    const-string v6, "subs"

    invoke-direct {v5, p0, v4, v6}, Lnj/m$p;-><init>(Lnj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v5, Lnj/m$p;

    const-string v6, "inapp"

    invoke-direct {v5, p0, v4, v6}, Lnj/m$p;-><init>(Lnj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p1, Lnj/i;

    invoke-direct {p1, p0, v2, p2}, Lnj/i;-><init>(Lnj/m;Ljava/util/Map;Z)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0, v0, p1}, Lnj/m;->p1(Ljava/util/List;Lnj/m$q;)V

    :cond_4
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p0, v1, p1}, Lnj/m;->p1(Ljava/util/List;Lnj/m$q;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final R1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->f0(ZZ)V

    :cond_0
    return-void
.end method

.method public final S0(Lw7/k;Z)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Handle single purchase. Product id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Order id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw7/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". isAcknowledged: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lw7/k;->f()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnj/m;->D1()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lnj/m;->P1()V

    :goto_0
    invoke-virtual {p1}, Lw7/k;->f()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Lw7/k;->a()Lw7/a;

    move-result-object v0

    invoke-virtual {v0}, Lw7/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lw7/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lnj/m;->n:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_3
    iget-wide v2, p0, Lnj/m;->p:J

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
    invoke-virtual {p0}, Lnj/m;->w1()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->L0()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lnj/m;->n:Ljava/lang/String;

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lnj/m;->A1()V

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lnj/m;->z1()V

    :cond_7
    :goto_1
    iget-wide p1, p0, Lnj/m;->p:J

    cmp-long v0, p1, v4

    if-gtz v0, :cond_8

    invoke-virtual {p0}, Lnj/m;->x1()V

    return-void

    :cond_8
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, Lnj/m;->y1()V

    :cond_9
    :goto_2
    return-void

    :cond_a
    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lnj/m;->W1(Lw7/k;Ljava/lang/String;Z)V

    return-void
.end method

.method public final S1()V
    .locals 3

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ldj/g;->g0(ZZ)V

    :cond_0
    return-void
.end method

.method public T1(Lnj/b0;)V
    .locals 0

    iput-object p1, p0, Lnj/m;->i:Lnj/b0;

    return-void
.end method

.method public U0()Z
    .locals 1

    iget-object v0, p0, Lnj/m;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public U1(Lcom/android/billingclient/api/a;)V
    .locals 3

    iget-object v0, p0, Lnj/m;->b:Lnj/m$o;

    sget-object v1, Lnj/m$o;->c:Lnj/m$o;

    const-string v2, "rbx.purchaseflow"

    if-ne v0, v1, :cond_0

    const-string p1, "Google Billing Client is already setup"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v1, Lnj/m$o;->b:Lnj/m$o;

    if-ne v0, v1, :cond_1

    const-string p1, "Google Billing Client is already connecting"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    invoke-interface {v0, p1}, Lnj/h0;->e(Lcom/android/billingclient/api/a;)V

    iput-object v1, p0, Lnj/m;->b:Lnj/m$o;

    const-string p1, "Connecting Google Billing\'s Client"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/m;->a:Lnj/h0;

    new-instance v0, Lnj/m$f;

    invoke-direct {v0, p0}, Lnj/m$f;-><init>(Lnj/m;)V

    invoke-interface {p1, v0}, Lnj/h0;->i(Lw7/d;)V

    return-void
.end method

.method public final V0(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lnj/m;->N0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;Z)Z
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

    iget-boolean p7, p0, Lnj/m;->q:Z

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p7}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lnj/m;->n:Ljava/lang/String;

    invoke-virtual {p0}, Lnj/m;->W0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p6, p0, Lnj/m;->u:Lmj/o;

    iput-wide p4, p0, Lnj/m;->p:J

    iput-object p2, p0, Lnj/m;->k:Ljava/lang/String;

    iput-object p3, p0, Lnj/m;->j:Landroid/app/Activity;

    invoke-virtual {p0, p2}, Lnj/m;->V0(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lnj/m;->o:Z

    new-instance p1, Lnj/m$i;

    invoke-direct {p1, p0, p2}, Lnj/m$i;-><init>(Lnj/m;Ljava/lang/String;)V

    iget-boolean p2, p0, Lnj/m;->o:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lnj/m;->s1(Lnj/m$r;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lnj/m;->q1(Lnj/m$r;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public W0()Z
    .locals 1

    iget-object v0, p0, Lnj/m;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnj/m;->X0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W1(Lw7/k;Ljava/lang/String;Z)V
    .locals 2

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lnj/m;->i:Lnj/b0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p2}, Lnj/b0;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p2, Lnj/e$b;->k:Lnj/e$b;

    new-instance p3, Lnj/m0;

    invoke-direct {p3}, Lnj/m0;-><init>()V

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->z0(Lw7/k;Lnj/e$b;Lnj/m0;)V

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p0, p1, p3}, Lnj/m;->j1(Lw7/k;Z)V

    return-void
.end method

.method public X0()Z
    .locals 3

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnj/m;->b:Lnj/m$o;

    sget-object v2, Lnj/m$o;->c:Lnj/m$o;

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, Lnj/h0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y0(Lw7/k;)Z
    .locals 3

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lnj/m;->G0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Lnj/e0;->m(Ljava/lang/String;)Z

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
    invoke-virtual {p0, p1}, Lnj/m;->V0(Ljava/lang/String;)Z

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

    iget-object v0, p0, Lnj/m;->k:Ljava/lang/String;

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

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    const-string v1, "PurchaseStarted."

    invoke-virtual {v0, v1}, Ldj/g;->l(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lnj/m;->V0(Ljava/lang/String;)Z

    move-result v4

    const/4 v0, 0x0

    if-eqz v4, :cond_0

    iget-object v1, p0, Lnj/m;->a:Lnj/h0;

    const-string v2, "subscriptions"

    invoke-interface {v1, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lnj/m;->a:Lnj/h0;

    const-string v2, "fff"

    invoke-interface {v1, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lnj/m;->H1()V

    return v0

    :cond_1
    invoke-static {p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    iput-wide p2, p0, Lnj/m;->p:J

    iput-object p4, p0, Lnj/m;->n:Ljava/lang/String;

    iput-object p1, p0, Lnj/m;->k:Ljava/lang/String;

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

    iget-object v1, p0, Lnj/m;->a:Lnj/h0;

    new-instance v2, Lnj/f;

    move-object v3, p0

    move-object v8, p1

    move-wide v5, p2

    move-object v7, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v10}, Lnj/f;-><init>(Lnj/m;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lnj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;)Z
    .locals 9

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnj/m;->q:Z

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lnj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;Z)Z

    move-result p1

    return p1
.end method

.method public final b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    const-string p2, "rbx.purchaseflow"

    const-string p3, "Product details not found after query."

    invoke-static {p2, p3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p4, :cond_0

    sget-object p2, Lnj/e$b;->v:Lnj/e$b;

    const-string p3, "Product details not found"

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :cond_0
    return v0

    :cond_1
    const-string p1, "Product subscription offer details not found"

    if-eqz p3, :cond_3

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    if-eqz p4, :cond_2

    iget-object p2, p0, Lnj/m;->k:Ljava/lang/String;

    sget-object p3, Lnj/e$b;->v:Lnj/e$b;

    invoke-virtual {p0, p2, p3, p1}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :cond_2
    return v0

    :cond_3
    if-nez p3, :cond_5

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->b()Lcom/android/billingclient/api/e$b;

    move-result-object p2

    if-nez p2, :cond_5

    if-eqz p4, :cond_4

    iget-object p2, p0, Lnj/m;->k:Ljava/lang/String;

    sget-object p3, Lnj/e$b;->v:Lnj/e$b;

    invoke-virtual {p0, p2, p3, p1}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    :cond_4
    return v0

    :cond_5
    const/4 p1, 0x1

    return p1
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

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

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

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/k;

    invoke-virtual {p0, v0, p2}, Lnj/m;->S0(Lw7/k;Z)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public d(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLmj/o;)Z
    .locals 4

    new-instance v0, Lnj/c;

    invoke-direct {v0, p4}, Lnj/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnj/c;->b()Z

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

    invoke-static {v3, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    invoke-virtual {v0}, Lnj/c;->c()Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p0, Lnj/m;->a:Lnj/h0;

    const-string v1, "subscriptions"

    invoke-interface {p4, v1}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p4

    invoke-virtual {p4}, Lcom/android/billingclient/api/d;->c()I

    move-result p4

    if-eqz p4, :cond_1

    const-string p1, "Google Billing Client does not support subscription purchases."

    invoke-static {v3, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Initiated purchase. Params: "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {v3, p4}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Lnj/m;->n:Ljava/lang/String;

    invoke-virtual {p0}, Lnj/m;->W0()Z

    move-result p4

    if-nez p4, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Purchasing is not enabled. Params: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_2
    iput-wide p1, p0, Lnj/m;->p:J

    invoke-virtual {v0}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/c;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnj/m;->w:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/c;->d()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lnj/m;->B:Ljava/util/List;

    iput-object p5, p0, Lnj/m;->j:Landroid/app/Activity;

    xor-int/lit8 p1, p6, 0x1

    iput-boolean p1, p0, Lnj/m;->q:Z

    iput-object p7, p0, Lnj/m;->u:Lmj/o;

    invoke-virtual {v0}, Lnj/c;->c()Z

    move-result p1

    iput-boolean p1, p0, Lnj/m;->o:Z

    invoke-virtual {v0}, Lnj/c;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnj/m;->v:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, Lnj/m$p;

    invoke-virtual {v0}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0}, Lnj/c;->g()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p2, p0, p3, p4}, Lnj/m$p;-><init>(Lnj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lnj/l;

    invoke-direct {p2, p0, v0, p6}, Lnj/l;-><init>(Lnj/m;Lnj/c;Z)V

    invoke-virtual {p0, p1, p2}, Lnj/m;->p1(Ljava/util/List;Lnj/m$q;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic d1(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PaymentsProtocol: QueryInAppPurchases. ItemsCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Items: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Lnj/m;->H0(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/g;->l(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lnj/m;->Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

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

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Lnj/m;->V0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lnj/m;->o:Z

    invoke-virtual {p0, p1, v0}, Lnj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v0

    iget-boolean v1, p0, Lnj/m;->o:Z

    invoke-virtual {p0, p1, v0, v1}, Lnj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-boolean p1, p0, Lnj/m;->o:Z

    invoke-virtual {p0, v0, p1}, Lnj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e1(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PaymentsProtocol: QuerySubsPurchases. ItemsCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Items: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Lnj/m;->H0(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/g;->l(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lnj/m;->Q0(Lcom/android/billingclient/api/d;Ljava/util/List;)V

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

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;Z)Z
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnj/m;->q:Z

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move v8, p5

    invoke-virtual/range {v1 .. v8}, Lnj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;Z)Z

    move-result p1

    return p1
.end method

.method public final synthetic f1(Lnj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V
    .locals 10

    move-object/from16 v1, p7

    const-string v2, "PaymentsProtocol: trying with dynamic query."

    const-string v3, "rbx.purchaseflow"

    invoke-static {v3, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lnj/m;->A:Ljava/lang/String;

    const-string v4, "subs"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iput-boolean v2, p0, Lnj/m;->o:Z

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/e;

    iget-object v4, p0, Lnj/m;->z:Ljava/lang/String;

    iget-boolean v5, p0, Lnj/m;->o:Z

    invoke-virtual {p0, v4, v1, v5, v2}, Lnj/m;->b1(Ljava/lang/String;Lcom/android/billingclient/api/e;ZZ)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v1, "PaymentsProtocol: invalid dynamic productDetails."

    invoke-static {v3, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p1}, Lnj/c;->c()Z

    move-result v2

    invoke-virtual {p0, v1, v2}, Lnj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnj/m;->m:Ljava/lang/String;

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    const-string v2, "PaymentsProtocol: paymentsProtocolStartPurchase with payload string opening billing."

    invoke-static {v3, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v2, p0, Lnj/m;->o:Z

    invoke-virtual {p1}, Lnj/c;->a()Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    move-object v0, p0

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v9}, Lnj/m;->n1(Lcom/android/billingclient/api/e;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    const-string v0, "PaymentsProtocol: dynamic query dynamicProductDetailsList is empty."

    invoke-static {v3, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public g(Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 10

    const-string v0, "PaymentsProtocol: paymentsProtocolStartPurchase with payload string."

    const-string v2, "rbx.purchaseflow"

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    const-string v3, "PurchaseStarted."

    invoke-virtual {v0, v3}, Ldj/g;->l(Ljava/lang/String;)V

    new-instance v0, Lnj/c;

    move-object/from16 v3, p6

    invoke-direct {v0, v3}, Lnj/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnj/c;->c()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v3, p0, Lnj/m;->a:Lnj/h0;

    const-string v5, "subscriptions"

    invoke-interface {v3, v5}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/d;->c()I

    move-result v3

    if-eqz v3, :cond_0

    return v4

    :cond_0
    iget-object v3, p0, Lnj/m;->a:Lnj/h0;

    const-string v5, "fff"

    invoke-interface {v3, v5}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/d;->c()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lnj/m;->H1()V

    return v4

    :cond_1
    invoke-static {p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetUserId(J)V

    iput-wide p2, p0, Lnj/m;->p:J

    iput-object p4, p0, Lnj/m;->n:Ljava/lang/String;

    iput-object p1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/c;->f()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lnj/m;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/c;->g()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lnj/m;->A:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/c;->a()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lnj/m;->x:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/c;->d()Ljava/util/List;

    move-result-object v7

    iput-object v7, p0, Lnj/m;->B:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PaymentsProtocol: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lnj/m;->z:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lnj/m;->A:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lnj/m$p;

    iget-object v7, p0, Lnj/m;->z:Ljava/lang/String;

    iget-object v9, p0, Lnj/m;->A:Ljava/lang/String;

    invoke-direct {v2, p0, v7, v9}, Lnj/m$p;-><init>(Lnj/m;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v0

    new-instance v0, Lnj/k;

    move-object v1, p0

    move-object v6, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lnj/k;-><init>(Lnj/m;Lnj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {p0, v8, v0}, Lnj/m;->p1(Ljava/util/List;Lnj/m$q;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic g1(ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 12

    invoke-virtual/range {p9 .. p9}, Lw7/n;->a()Ljava/util/List;

    move-result-object v0

    const-string v1, "PaymentsProtocol: queryProductDetailsAsync."

    const-string v2, "rbx.purchaseflow"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {p8 .. p8}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "PaymentsProtocol: productDetailsList is empty."

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

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

    invoke-virtual/range {v2 .. v11}, Lnj/m;->n1(Lcom/android/billingclient/api/e;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-static {v2, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->L0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lnj/m;->B1()V

    :cond_3
    return-void
.end method

.method public h(Ljava/lang/String;JJ)Z
    .locals 2

    long-to-int p2, p2

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lnj/m;->M1()V

    new-instance p2, Lnj/e;

    sget-object v0, Lnj/e$b;->s:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p2, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnj/m;->N1()V

    new-instance p2, Lnj/e;

    sget-object v0, Lnj/e$b;->a:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p2, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    move p2, p3

    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->u1()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnj/m;->y:Ljava/lang/String;

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

.method public final synthetic h1(Ljava/util/List;Lnj/m$q;Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 4

    invoke-virtual {p4}, Lw7/n;->a()Ljava/util/List;

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

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

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

    iget-object v2, p0, Lnj/m;->f:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lnj/m;->e:Ljava/util/Hashtable;

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

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

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

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-interface {p2, p4}, Lnj/m$q;->a(Ljava/util/List;)V

    return-void
.end method

.method public i(Ljava/lang/String;)Z
    .locals 0

    iput-object p1, p0, Lnj/m;->x:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final synthetic i1(Lnj/c;ZLjava/util/List;)V
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

    invoke-virtual {p1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnj/c;->c()Z

    move-result v1

    invoke-virtual {p0, v0, p3, v1}, Lnj/m;->a1(Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lnj/c;->c()Z

    move-result v0

    invoke-virtual {p0, p3, v0}, Lnj/m;->M0(Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lnj/m;->m:Ljava/lang/String;

    iget-object p3, p0, Lnj/m;->s:Ldj/g;

    new-instance v0, Lmj/m;

    iget-object v1, p0, Lnj/m;->n:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {v0, v1, p1, p2}, Lmj/m;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p3, v0}, Ldj/g;->h0(Lmj/m;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lnj/m;->E0(Lpj/b;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lnj/c;->f()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lnj/e$b;->v:Lnj/e$b;

    const-string p3, "Product details not found"

    invoke-virtual {p0, p1, p2, p3}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void
.end method

.method public j(Lei/s0;)V
    .locals 0

    iput-object p1, p0, Lnj/m;->u:Lmj/o;

    return-void
.end method

.method public final j1(Lw7/k;Z)V
    .locals 3

    iget-object v0, p0, Lnj/m;->u:Lmj/o;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnj/m;->Z0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnj/m;->u:Lmj/o;

    invoke-interface {v0}, Lmj/o;->b()V

    :cond_0
    invoke-static {}, Lbh/a1;->d1()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lnj/d;

    iget-boolean v2, p0, Lnj/m;->q:Z

    invoke-direct {v1, p1, p2, v2}, Lnj/d;-><init>(Lw7/k;ZZ)V

    new-instance p2, Lmj/r;

    iget-object v2, p0, Lnj/m;->t:Lmi/f;

    invoke-direct {p2, v2}, Lmj/r;-><init>(Lmi/f;)V

    new-instance v2, Lnj/m$l;

    invoke-direct {v2, p0, p1}, Lnj/m$l;-><init>(Lnj/m;Lw7/k;)V

    invoke-virtual {p2, v0, v1, v2}, Lmj/r;->b(Ljava/lang/String;Loi/a;Lmj/r$c;)V

    return-void
.end method

.method public k(Z)V
    .locals 0

    iput-boolean p1, p0, Lnj/m;->q:Z

    return-void
.end method

.method public final k1(Ljava/lang/String;Lnj/e$b;)V
    .locals 8

    sget-object v0, Lnj/e$b;->a:Lnj/e$b;

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Lnj/m;->N1()V

    goto :goto_0

    :cond_0
    sget-object v1, Lnj/e$b;->j:Lnj/e$b;

    if-ne p2, v1, :cond_1

    invoke-virtual {p0}, Lnj/m;->L1()V

    goto :goto_0

    :cond_1
    sget-object v1, Lnj/e$b;->k:Lnj/e$b;

    if-ne p2, v1, :cond_2

    invoke-virtual {p0}, Lnj/m;->K1()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lnj/m;->M1()V

    :goto_0
    iget-object v1, p0, Lnj/m;->u:Lmj/o;

    if-eqz v1, :cond_9

    invoke-virtual {p0, p1}, Lnj/m;->Z0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lnj/m;->u:Lmj/o;

    instance-of v2, v1, Lei/s0;

    if-eqz v2, :cond_8

    iget-wide v1, p0, Lnj/m;->p:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_7

    iget-object v1, p0, Lnj/m;->y:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    move-object v7, v1

    goto :goto_2

    :cond_3
    const-string v1, ""

    goto :goto_1

    :goto_2
    iget-object v1, p0, Lnj/m;->v:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lnj/m;->u:Lmj/o;

    check-cast v1, Lei/s0;

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    move v3, v2

    :goto_3
    iget-wide v4, p0, Lnj/m;->p:J

    iget-object p2, p0, Lnj/m;->v:Ljava/util/Hashtable;

    invoke-virtual {p2, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    move-object v2, v1

    invoke-interface/range {v2 .. v7}, Lei/s0;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object v1, p0, Lnj/m;->u:Lmj/o;

    check-cast v1, Lei/s0;

    if-ne p2, v0, :cond_6

    goto :goto_4

    :cond_6
    move v3, v2

    :goto_4
    iget-wide v4, p0, Lnj/m;->p:J

    iget-object v6, p0, Lnj/m;->k:Ljava/lang/String;

    move-object v2, v1

    invoke-interface/range {v2 .. v7}, Lei/s0;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignore calling inGamePurchaseFinished: mUserId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lnj/m;->p:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ". mProductId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".. checkoutSessionId="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnj/m;->y:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_8
    if-eqz v1, :cond_9

    new-instance v0, Lnj/e;

    iget-object v2, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {v0, p2, v2}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Lmj/o;->e(Lmj/p;)V

    :cond_9
    :goto_5
    invoke-virtual {p0, p1}, Lnj/m;->Z0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lnj/m;->t1()V

    :cond_a
    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;ZLjava/lang/String;)Z
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnj/m;->q:Z

    if-eqz p6, :cond_0

    iput-object p6, p0, Lnj/m;->r:Ljava/lang/String;

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

    iget-object v0, p0, Lnj/m;->r:Ljava/lang/String;

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p6}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v7, p4

    move v8, p5

    invoke-virtual/range {v1 .. v8}, Lnj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLmj/o;Z)Z

    move-result p1

    return p1
.end method

.method public final l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0, p3}, Ldj/g;->l(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lnj/m;->k1(Ljava/lang/String;Lnj/e$b;)V

    return-void
.end method

.method public m(Ljava/lang/String;)Z
    .locals 0

    iput-object p1, p0, Lnj/m;->y:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
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

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/m;->X0()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup."

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p0}, Lnj/m;->U0()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress."

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    if-nez p4, :cond_3

    iget-boolean p1, p0, Lnj/m;->h:Z

    if-eqz p1, :cond_3

    const-string p1, "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume."

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D()Z

    move-result p1

    const-string p2, "subs"

    const-string p3, "inapp"

    const/4 p4, 0x1

    if-eqz p1, :cond_4

    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/o$a;->a()Lw7/o;

    move-result-object p1

    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object p3

    invoke-virtual {p3, p2}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object p2

    invoke-virtual {p2}, Lw7/o$a;->a()Lw7/o;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Lnj/m;->C1(Z)V

    iget-object p3, p0, Lnj/m;->a:Lnj/h0;

    new-instance v0, Lnj/g;

    invoke-direct {v0, p0}, Lnj/g;-><init>(Lnj/m;)V

    invoke-interface {p3, p1, v0}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    invoke-virtual {p0, p4}, Lnj/m;->C1(Z)V

    iget-object p1, p0, Lnj/m;->a:Lnj/h0;

    new-instance p3, Lnj/h;

    invoke-direct {p3, p0}, Lnj/h;-><init>(Lnj/m;)V

    invoke-interface {p1, p2, p3}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    iput-boolean p4, p0, Lnj/m;->h:Z

    return-void

    :cond_4
    invoke-virtual {p0, p3}, Lnj/m;->o1(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lnj/m;->o1(Ljava/lang/String;)V

    iput-boolean p4, p0, Lnj/m;->h:Z

    return-void
.end method

.method public n(I)V
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

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->J()V

    goto :goto_0

    :cond_0
    const-string p1, "{validateModel} is invalid."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->F()V

    goto :goto_0

    :cond_1
    const-string p1, "Unauthorized to make request. XSRF token is needed."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->E()V

    goto :goto_0

    :cond_2
    const-string p1, "Unauthorized to make request. Auth cookie is needed."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->D()V

    goto :goto_0

    :cond_3
    const-string p1, "Service has thrown an uknown exception."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->C()V

    goto :goto_0

    :cond_4
    const-string p1, "Server Error"

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->H()V

    goto :goto_0

    :cond_5
    const-string p1, "Service has been rate limited to user."

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->G()V

    goto :goto_0

    :cond_6
    const-string p1, "Validation successful"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->a:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->B()V

    :goto_0
    sget-object v0, Lnj/m$e;->a:[I

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

    invoke-virtual {p0}, Lnj/m;->J1()V

    new-instance p1, Lnj/e;

    sget-object v0, Lnj/e$b;->w:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    return-void

    :cond_7
    invoke-virtual {p0}, Lnj/m;->G1()V

    new-instance p1, Lnj/e;

    sget-object v0, Lnj/e$b;->f:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    return-void

    :cond_8
    invoke-virtual {p0}, Lnj/m;->G1()V

    new-instance p1, Lnj/e;

    sget-object v0, Lnj/e$b;->e:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    return-void

    :cond_9
    invoke-virtual {p0}, Lnj/m;->I1()V

    new-instance p1, Lnj/e;

    sget-object v0, Lnj/e$b;->d:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    return-void

    :cond_a
    invoke-virtual {p0}, Lnj/m;->F1()V

    new-instance p1, Lnj/e;

    sget-object v0, Lnj/e$b;->c:Lnj/e$b;

    iget-object v1, p0, Lnj/m;->k:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lnj/e;-><init>(Lnj/e$b;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lmj/p;)V

    :cond_b
    return-void
.end method

.method public final n1(Lcom/android/billingclient/api/e;ZJLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "PaymentsProtocol: paymentsProtocolOpenBillingFlow"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->d4()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lnj/m;->w0(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    sget-object p1, Lnj/e$b;->v:Lnj/e$b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "No matching or base plan offer available for subscription product: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p6, p1, p2}, Lnj/m;->l1(Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

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

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->h2()Z

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

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {p2, p5}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    if-eqz p9, :cond_5

    invoke-virtual {p9}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p1, p9}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {p2, p4}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const-string p2, "Both chargeRequestId and checkoutSessionId are empty."

    invoke-static {v1, p2}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {p2, p3}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    iget-object p2, p0, Lnj/m;->x:Ljava/lang/String;

    if-eqz p2, :cond_7

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {p2, p5}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    iget-object p2, p0, Lnj/m;->y:Ljava/lang/String;

    if-eqz p2, :cond_8

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/c$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {p2, p4}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    const-string p2, "Both mStoredChargeRequestId and mCurrentCheckoutSessionId are null."

    invoke-static {v1, p2}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {p2, p3}, Ldj/g;->q(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1}, Lcom/android/billingclient/api/c$a;->a()Lcom/android/billingclient/api/c;

    move-result-object p1

    iput-object p6, p0, Lnj/m;->l:Ljava/lang/String;

    iget-object p2, p0, Lnj/m;->a:Lnj/h0;

    invoke-interface {p2, p7, p1}, Lnj/h0;->h(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "PaymentsProtocol: launchBillingFlow failed!"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    return-void
.end method

.method public final o1(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lnj/m;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/o$a;->a()Lw7/o;

    move-result-object p1

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    new-instance v1, Lnj/m$b;

    invoke-direct {v1, p0}, Lnj/m$b;-><init>(Lnj/m;)V

    invoke-interface {v0, p1, v1}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    return-void
.end method

.method public final p1(Ljava/util/List;Lnj/m$q;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnj/m$p;",
            ">;",
            "Lnj/m$q;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    const-string v1, "fff"

    invoke-interface {v0, v1}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "rbx.purchaseflow"

    const-string v0, "ProductDetails feature is not supported."

    invoke-static {p1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/m;->H1()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lnj/m$q;->a(Ljava/util/List;)V

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

    check-cast v2, Lnj/m$p;

    invoke-static {}, Lcom/android/billingclient/api/f$b;->b()Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    iget-object v4, v2, Lnj/m$p;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/android/billingclient/api/f$b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$b$a;

    move-result-object v3

    iget-object v2, v2, Lnj/m$p;->b:Ljava/lang/String;

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

    iget-object v1, p0, Lnj/m;->a:Lnj/h0;

    new-instance v2, Lnj/j;

    invoke-direct {v2, p0, p1, p2}, Lnj/j;-><init>(Lnj/m;Ljava/util/List;Lnj/m$q;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public final q1(Lnj/m$r;)V
    .locals 4

    const-string v0, "Attempt queryInAppProduct"

    const-string v1, "rbx.purchaseflow"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    const-string v2, "fff"

    invoke-interface {v0, v2}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ProductDetails feature is not supported."

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/m;->H1()V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lnj/m$r;->a()V

    return-void

    :cond_0
    iget-object v0, p0, Lnj/m;->c:Lnj/m$o;

    sget-object v2, Lnj/m$o;->c:Lnj/m$o;

    if-ne v0, v2, :cond_2

    const-string v0, "queryInAppProduct is setup already"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lnj/m$r;->a()V

    :cond_1
    return-void

    :cond_2
    sget-object v2, Lnj/m$o;->a:Lnj/m$o;

    if-eq v0, v2, :cond_3

    const-string p1, "queryInAppProduct is pending"

    invoke-static {v1, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {}, Lnj/m;->G0()Ljava/util/List;

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

    sget-object v1, Lnj/m$o;->b:Lnj/m$o;

    iput-object v1, p0, Lnj/m;->c:Lnj/m$o;

    iget-object v1, p0, Lnj/m;->a:Lnj/h0;

    new-instance v2, Lnj/m$g;

    invoke-direct {v2, p0, p1}, Lnj/m$g;-><init>(Lnj/m;Lnj/m$r;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public final r1(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lnj/m;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lw7/o;->b()Lw7/o$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw7/o$a;->b(Ljava/lang/String;)Lw7/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lw7/o$a;->a()Lw7/o;

    move-result-object v0

    iget-object v1, p0, Lnj/m;->a:Lnj/h0;

    new-instance v2, Lnj/m$a;

    invoke-direct {v2, p0, p1}, Lnj/m$a;-><init>(Lnj/m;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Lnj/h0;->f(Lw7/o;Lw7/l;)V

    return-void
.end method

.method public final s1(Lnj/m$r;)V
    .locals 5

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Attempt querySubsProduct"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lnj/m;->a:Lnj/h0;

    const-string v3, "subscriptions"

    invoke-interface {v2, v3}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/d;->c()I

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "Google Billing Client does not support subscription purchases."

    invoke-static {v0, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, p0, Lnj/m;->a:Lnj/h0;

    const-string v3, "fff"

    invoke-interface {v2, v3}, Lnj/h0;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/d;->c()I

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "ProductDetails feature is not supported."

    invoke-static {v0, v1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lnj/m;->H1()V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lnj/m$r;->a()V

    return-void

    :cond_1
    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lnj/m;->d:Lnj/m$o;

    sget-object v2, Lnj/m$o;->c:Lnj/m$o;

    if-ne v1, v2, :cond_3

    const-string v1, "querySubsProduct is setup already"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lnj/m$r;->a()V

    :cond_2
    return-void

    :cond_3
    sget-object v2, Lnj/m$o;->a:Lnj/m$o;

    if-eq v1, v2, :cond_4

    const-string p1, "querySubsProduct is pending"

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-static {}, Lnj/m;->N0()Ljava/util/List;

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

    sget-object v3, Lnj/m$o;->b:Lnj/m$o;

    iput-object v3, p0, Lnj/m;->d:Lnj/m$o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Querying SUBS ProductDetails. Count = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    new-instance v2, Lnj/m$h;

    invoke-direct {v2, p0, p1}, Lnj/m$h;-><init>(Lnj/m;Lnj/m$r;)V

    invoke-interface {v0, v1, v2}, Lnj/h0;->c(Lcom/android/billingclient/api/f;Lw7/j;)V

    return-void
.end method

.method public final t1()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lnj/m;->j:Landroid/app/Activity;

    iput-object v0, p0, Lnj/m;->u:Lmj/o;

    iput-object v0, p0, Lnj/m;->k:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lnj/m;->p:J

    iput-object v0, p0, Lnj/m;->w:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->m:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lnj/m;->q:Z

    iput-object v0, p0, Lnj/m;->r:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->x:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->y:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->z:Ljava/lang/String;

    iput-object v0, p0, Lnj/m;->A:Ljava/lang/String;

    return-void
.end method

.method public final u1()V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    invoke-virtual {v0, v1}, Ldj/g;->o(Z)V

    :cond_0
    return-void
.end method

.method public v0(Lw7/k;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lnj/b;->k(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final v1()V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    iget-boolean v1, p0, Lnj/m;->q:Z

    invoke-virtual {v0, v1}, Ldj/g;->p(Z)V

    :cond_0
    return-void
.end method

.method public final w0(Lcom/android/billingclient/api/e;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lnj/m;->B:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnj/m;->B:Ljava/util/List;

    invoke-static {p1, v0}, Lnj/j0;->h(Lcom/android/billingclient/api/e;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    const-string v2, "Android-Subscription-Offer-Id-Not-Found"

    invoke-virtual {v0, v2}, Ldj/g;->q(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p1}, Lnj/j0;->a(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    iget-object p1, p0, Lnj/m;->s:Ldj/g;

    const-string v0, "Android-Subscription-Offer-No-Base-Plan-Available"

    invoke-virtual {p1, v0}, Ldj/g;->q(Ljava/lang/String;)V

    return-object v1
.end method

.method public final w1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->t()V

    :cond_0
    return-void
.end method

.method public final x0(Lw7/k;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 3

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1}, Lw7/k;->i()Z

    move-result v1

    const-string v2, "rbx.purchaseflow"

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Attempted to acknowledge an acknowledged purchase."

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lnj/e$b;->k:Lnj/e$b;

    invoke-static {p2}, Lnj/n0;->b(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)Lnj/m0;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lnj/m;->z0(Lw7/k;Lnj/e$b;Lnj/m0;)V

    return-void

    :cond_1
    :goto_0
    const-string v1, "Acknowledging Purchase"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lnj/m$m;

    invoke-direct {v1, p0, p1, v0, p2}, Lnj/m$m;-><init>(Lnj/m;Lw7/k;ZLcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    invoke-virtual {p0, p1, v1}, Lnj/m;->y0(Lw7/k;Lw7/c;)V

    return-void
.end method

.method public final x1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->u()V

    :cond_0
    return-void
.end method

.method public final y0(Lw7/k;Lw7/c;)V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Start acknowledging Purchase"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lw7/b;->b()Lw7/b$a;

    move-result-object v0

    invoke-virtual {p1}, Lw7/k;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw7/b$a;->b(Ljava/lang/String;)Lw7/b$a;

    move-result-object p1

    invoke-virtual {p1}, Lw7/b$a;->a()Lw7/b;

    move-result-object p1

    iget-object v0, p0, Lnj/m;->a:Lnj/h0;

    invoke-interface {v0, p1, p2}, Lnj/h0;->d(Lw7/b;Lw7/c;)V

    return-void
.end method

.method public final y1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->v()V

    :cond_0
    return-void
.end method

.method public final z0(Lw7/k;Lnj/e$b;Lnj/m0;)V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Acknowledged Purchase"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lnj/m;->Y0(Lw7/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lnj/m;->g:Ljava/util/Hashtable;

    invoke-virtual {v0, p3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnj/m;->k1(Ljava/lang/String;Lnj/e$b;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lnj/m;->v0(Lw7/k;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lnj/j0;->e(Lw7/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lnj/e0;->m(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Lnj/m;->i:Lnj/b0;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Lnj/b0;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    if-eqz v1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lnj/m;->s:Ldj/g;

    const-string p3, "Play-Points-Not-Show-Confirmation-Screen"

    invoke-virtual {p2, p3}, Ldj/g;->q(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lnj/m;->s:Ldj/g;

    const-string v2, "Play-Points-Show-Confirmation-Screen"

    invoke-virtual {v1, v2}, Ldj/g;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v3}, Lnj/m;->J0(Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->builder()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->g(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->e(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->i(I)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {v1}, Lnj/j0;->c(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {v1}, Lnj/j0;->f(Lcom/android/billingclient/api/e;)F

    move-result v2

    invoke-virtual {p2, v2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->f(F)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {v1}, Lnj/j0;->b(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-static {p3}, Lnj/n0;->a(Lnj/m0;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$a;->a()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOOAPPurchaseFinished(Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;)V

    iget-object p2, p0, Lnj/m;->i:Lnj/b0;

    if-eqz p2, :cond_3

    invoke-virtual {p2, v0}, Lnj/b0;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lnj/m;->C0(Lw7/k;)V

    return-void
.end method

.method public final z1()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/m;->s:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->w()V

    :cond_0
    return-void
.end method
