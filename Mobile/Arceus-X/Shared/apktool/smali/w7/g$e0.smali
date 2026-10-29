.class public Lw7/g$e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e0"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw7/g$e0$e;,
        Lw7/g$e0$i;,
        Lw7/g$e0$h;,
        Lw7/g$e0$g;,
        Lw7/g$e0$f;,
        Lw7/g$e0$b;,
        Lw7/g$e0$d;,
        Lw7/g$e0$c;,
        Lw7/g$e0$a;
    }
.end annotation


# instance fields
.field public A:Ljava/lang/Boolean;

.field public B:Ljava/lang/Boolean;

.field public C:Lw7/g$o0;

.field public D:Ljava/lang/Float;

.field public E:Ljava/lang/String;

.field public F:Lw7/g$e0$a;

.field public G:Ljava/lang/String;

.field public H:Lw7/g$o0;

.field public I:Ljava/lang/Float;

.field public J:Lw7/g$o0;

.field public K:Ljava/lang/Float;

.field public L:Lw7/g$e0$i;

.field public M:Lw7/g$e0$e;

.field public a:J

.field public b:Lw7/g$o0;

.field public c:Lw7/g$e0$a;

.field public d:Ljava/lang/Float;

.field public e:Lw7/g$o0;

.field public f:Ljava/lang/Float;

.field public g:Lw7/g$p;

.field public h:Lw7/g$e0$c;

.field public i:Lw7/g$e0$d;

.field public j:Ljava/lang/Float;

.field public k:[Lw7/g$p;

.field public l:Lw7/g$p;

.field public m:Ljava/lang/Float;

.field public n:Lw7/g$f;

.field public o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lw7/g$p;

.field public q:Ljava/lang/Integer;

.field public r:Lw7/g$e0$b;

.field public s:Lw7/g$e0$g;

.field public t:Lw7/g$e0$h;

.field public u:Lw7/g$e0$f;

.field public v:Ljava/lang/Boolean;

.field public w:Lw7/g$c;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lw7/g$e0;->a:J

    return-void
.end method

.method public static a()Lw7/g$e0;
    .locals 8

    new-instance v0, Lw7/g$e0;

    invoke-direct {v0}, Lw7/g$e0;-><init>()V

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lw7/g$e0;->a:J

    sget-object v1, Lw7/g$f;->b:Lw7/g$f;

    iput-object v1, v0, Lw7/g$e0;->b:Lw7/g$o0;

    sget-object v2, Lw7/g$e0$a;->a:Lw7/g$e0$a;

    iput-object v2, v0, Lw7/g$e0;->c:Lw7/g$e0$a;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v0, Lw7/g$e0;->d:Ljava/lang/Float;

    const/4 v5, 0x0

    iput-object v5, v0, Lw7/g$e0;->e:Lw7/g$o0;

    iput-object v4, v0, Lw7/g$e0;->f:Ljava/lang/Float;

    new-instance v6, Lw7/g$p;

    invoke-direct {v6, v3}, Lw7/g$p;-><init>(F)V

    iput-object v6, v0, Lw7/g$e0;->g:Lw7/g$p;

    sget-object v3, Lw7/g$e0$c;->a:Lw7/g$e0$c;

    iput-object v3, v0, Lw7/g$e0;->h:Lw7/g$e0$c;

    sget-object v3, Lw7/g$e0$d;->a:Lw7/g$e0$d;

    iput-object v3, v0, Lw7/g$e0;->i:Lw7/g$e0$d;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v0, Lw7/g$e0;->j:Ljava/lang/Float;

    iput-object v5, v0, Lw7/g$e0;->k:[Lw7/g$p;

    new-instance v3, Lw7/g$p;

    const/4 v6, 0x0

    invoke-direct {v3, v6}, Lw7/g$p;-><init>(F)V

    iput-object v3, v0, Lw7/g$e0;->l:Lw7/g$p;

    iput-object v4, v0, Lw7/g$e0;->m:Ljava/lang/Float;

    iput-object v1, v0, Lw7/g$e0;->n:Lw7/g$f;

    iput-object v5, v0, Lw7/g$e0;->o:Ljava/util/List;

    new-instance v3, Lw7/g$p;

    const/high16 v6, 0x41400000    # 12.0f

    sget-object v7, Lw7/g$d1;->g:Lw7/g$d1;

    invoke-direct {v3, v6, v7}, Lw7/g$p;-><init>(FLw7/g$d1;)V

    iput-object v3, v0, Lw7/g$e0;->p:Lw7/g$p;

    const/16 v3, 0x190

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lw7/g$e0;->q:Ljava/lang/Integer;

    sget-object v3, Lw7/g$e0$b;->a:Lw7/g$e0$b;

    iput-object v3, v0, Lw7/g$e0;->r:Lw7/g$e0$b;

    sget-object v3, Lw7/g$e0$g;->a:Lw7/g$e0$g;

    iput-object v3, v0, Lw7/g$e0;->s:Lw7/g$e0$g;

    sget-object v3, Lw7/g$e0$h;->a:Lw7/g$e0$h;

    iput-object v3, v0, Lw7/g$e0;->t:Lw7/g$e0$h;

    sget-object v3, Lw7/g$e0$f;->a:Lw7/g$e0$f;

    iput-object v3, v0, Lw7/g$e0;->u:Lw7/g$e0$f;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, v0, Lw7/g$e0;->v:Ljava/lang/Boolean;

    iput-object v5, v0, Lw7/g$e0;->w:Lw7/g$c;

    iput-object v5, v0, Lw7/g$e0;->x:Ljava/lang/String;

    iput-object v5, v0, Lw7/g$e0;->y:Ljava/lang/String;

    iput-object v5, v0, Lw7/g$e0;->z:Ljava/lang/String;

    iput-object v3, v0, Lw7/g$e0;->A:Ljava/lang/Boolean;

    iput-object v3, v0, Lw7/g$e0;->B:Ljava/lang/Boolean;

    iput-object v1, v0, Lw7/g$e0;->C:Lw7/g$o0;

    iput-object v4, v0, Lw7/g$e0;->D:Ljava/lang/Float;

    iput-object v5, v0, Lw7/g$e0;->E:Ljava/lang/String;

    iput-object v2, v0, Lw7/g$e0;->F:Lw7/g$e0$a;

    iput-object v5, v0, Lw7/g$e0;->G:Ljava/lang/String;

    iput-object v5, v0, Lw7/g$e0;->H:Lw7/g$o0;

    iput-object v4, v0, Lw7/g$e0;->I:Ljava/lang/Float;

    iput-object v5, v0, Lw7/g$e0;->J:Lw7/g$o0;

    iput-object v4, v0, Lw7/g$e0;->K:Ljava/lang/Float;

    sget-object v1, Lw7/g$e0$i;->a:Lw7/g$e0$i;

    iput-object v1, v0, Lw7/g$e0;->L:Lw7/g$e0$i;

    sget-object v1, Lw7/g$e0$e;->a:Lw7/g$e0$e;

    iput-object v1, v0, Lw7/g$e0;->M:Lw7/g$e0$e;

    return-object v0
.end method


# virtual methods
.method public b(Z)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Lw7/g$e0;->A:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    iput-object v1, p0, Lw7/g$e0;->v:Ljava/lang/Boolean;

    const/4 p1, 0x0

    iput-object p1, p0, Lw7/g$e0;->w:Lw7/g$c;

    iput-object p1, p0, Lw7/g$e0;->E:Ljava/lang/String;

    iput-object v0, p0, Lw7/g$e0;->m:Ljava/lang/Float;

    sget-object v1, Lw7/g$f;->b:Lw7/g$f;

    iput-object v1, p0, Lw7/g$e0;->C:Lw7/g$o0;

    iput-object v0, p0, Lw7/g$e0;->D:Ljava/lang/Float;

    iput-object p1, p0, Lw7/g$e0;->G:Ljava/lang/String;

    iput-object p1, p0, Lw7/g$e0;->H:Lw7/g$o0;

    iput-object v0, p0, Lw7/g$e0;->I:Ljava/lang/Float;

    iput-object p1, p0, Lw7/g$e0;->J:Lw7/g$o0;

    iput-object v0, p0, Lw7/g$e0;->K:Ljava/lang/Float;

    sget-object p1, Lw7/g$e0$i;->a:Lw7/g$e0$i;

    iput-object p1, p0, Lw7/g$e0;->L:Lw7/g$e0$i;

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/g$e0;

    iget-object v1, p0, Lw7/g$e0;->k:[Lw7/g$p;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, [Lw7/g$p;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lw7/g$p;

    iput-object v1, v0, Lw7/g$e0;->k:[Lw7/g$p;

    :cond_0
    return-object v0
.end method
