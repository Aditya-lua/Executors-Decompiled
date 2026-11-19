.class public final Lhg/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lhg/a$c;

.field public e:Lhg/a$d;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Lhg/a$b;

.field public m:Ljava/lang/String;

.field public n:J

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhg/a$a;->a:J

    const-string v2, ""

    iput-object v2, p0, Lhg/a$a;->b:Ljava/lang/String;

    iput-object v2, p0, Lhg/a$a;->c:Ljava/lang/String;

    sget-object v3, Lhg/a$c;->b:Lhg/a$c;

    iput-object v3, p0, Lhg/a$a;->d:Lhg/a$c;

    sget-object v3, Lhg/a$d;->b:Lhg/a$d;

    iput-object v3, p0, Lhg/a$a;->e:Lhg/a$d;

    iput-object v2, p0, Lhg/a$a;->f:Ljava/lang/String;

    iput-object v2, p0, Lhg/a$a;->g:Ljava/lang/String;

    const/4 v3, 0x0

    iput v3, p0, Lhg/a$a;->h:I

    iput v3, p0, Lhg/a$a;->i:I

    iput-object v2, p0, Lhg/a$a;->j:Ljava/lang/String;

    iput-wide v0, p0, Lhg/a$a;->k:J

    sget-object v3, Lhg/a$b;->b:Lhg/a$b;

    iput-object v3, p0, Lhg/a$a;->l:Lhg/a$b;

    iput-object v2, p0, Lhg/a$a;->m:Ljava/lang/String;

    iput-wide v0, p0, Lhg/a$a;->n:J

    iput-object v2, p0, Lhg/a$a;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lhg/a;
    .locals 23

    move-object/from16 v0, p0

    new-instance v1, Lhg/a;

    iget-wide v2, v0, Lhg/a$a;->a:J

    iget-object v4, v0, Lhg/a$a;->b:Ljava/lang/String;

    iget-object v5, v0, Lhg/a$a;->c:Ljava/lang/String;

    iget-object v6, v0, Lhg/a$a;->d:Lhg/a$c;

    iget-object v7, v0, Lhg/a$a;->e:Lhg/a$d;

    iget-object v8, v0, Lhg/a$a;->f:Ljava/lang/String;

    iget-object v9, v0, Lhg/a$a;->g:Ljava/lang/String;

    iget v10, v0, Lhg/a$a;->h:I

    iget v11, v0, Lhg/a$a;->i:I

    iget-object v12, v0, Lhg/a$a;->j:Ljava/lang/String;

    iget-wide v13, v0, Lhg/a$a;->k:J

    iget-object v15, v0, Lhg/a$a;->l:Lhg/a$b;

    move-object/from16 v16, v1

    iget-object v1, v0, Lhg/a$a;->m:Ljava/lang/String;

    move-wide/from16 v17, v2

    move-object v3, v1

    iget-wide v1, v0, Lhg/a$a;->n:J

    move-wide/from16 v19, v1

    iget-object v1, v0, Lhg/a$a;->o:Ljava/lang/String;

    move-wide/from16 v21, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v3

    move-wide/from16 v2, v17

    move-wide/from16 v17, v21

    invoke-direct/range {v1 .. v19}, Lhg/a;-><init>(JLjava/lang/String;Ljava/lang/String;Lhg/a$c;Lhg/a$d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLhg/a$b;Ljava/lang/String;JLjava/lang/String;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public b(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->m:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lhg/a$b;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->l:Lhg/a$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public h(Lhg/a$c;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->d:Lhg/a$c;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public j(I)Lhg/a$a;
    .locals 0

    iput p1, p0, Lhg/a$a;->h:I

    return-object p0
.end method

.method public k(J)Lhg/a$a;
    .locals 0

    iput-wide p1, p0, Lhg/a$a;->a:J

    return-object p0
.end method

.method public l(Lhg/a$d;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->e:Lhg/a$d;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lhg/a$a;
    .locals 0

    iput-object p1, p0, Lhg/a$a;->j:Ljava/lang/String;

    return-object p0
.end method

.method public n(I)Lhg/a$a;
    .locals 0

    iput p1, p0, Lhg/a$a;->i:I

    return-object p0
.end method
