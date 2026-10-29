.class public final Lfg/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lfg/a$c;

.field public e:Lfg/a$d;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Lfg/a$b;

.field public m:Ljava/lang/String;

.field public n:J

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lfg/a$a;->a:J

    const-string v2, ""

    iput-object v2, p0, Lfg/a$a;->b:Ljava/lang/String;

    iput-object v2, p0, Lfg/a$a;->c:Ljava/lang/String;

    sget-object v3, Lfg/a$c;->b:Lfg/a$c;

    iput-object v3, p0, Lfg/a$a;->d:Lfg/a$c;

    sget-object v3, Lfg/a$d;->b:Lfg/a$d;

    iput-object v3, p0, Lfg/a$a;->e:Lfg/a$d;

    iput-object v2, p0, Lfg/a$a;->f:Ljava/lang/String;

    iput-object v2, p0, Lfg/a$a;->g:Ljava/lang/String;

    const/4 v3, 0x0

    iput v3, p0, Lfg/a$a;->h:I

    iput v3, p0, Lfg/a$a;->i:I

    iput-object v2, p0, Lfg/a$a;->j:Ljava/lang/String;

    iput-wide v0, p0, Lfg/a$a;->k:J

    sget-object v3, Lfg/a$b;->b:Lfg/a$b;

    iput-object v3, p0, Lfg/a$a;->l:Lfg/a$b;

    iput-object v2, p0, Lfg/a$a;->m:Ljava/lang/String;

    iput-wide v0, p0, Lfg/a$a;->n:J

    iput-object v2, p0, Lfg/a$a;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lfg/a;
    .locals 23

    move-object/from16 v0, p0

    new-instance v1, Lfg/a;

    iget-wide v2, v0, Lfg/a$a;->a:J

    iget-object v4, v0, Lfg/a$a;->b:Ljava/lang/String;

    iget-object v5, v0, Lfg/a$a;->c:Ljava/lang/String;

    iget-object v6, v0, Lfg/a$a;->d:Lfg/a$c;

    iget-object v7, v0, Lfg/a$a;->e:Lfg/a$d;

    iget-object v8, v0, Lfg/a$a;->f:Ljava/lang/String;

    iget-object v9, v0, Lfg/a$a;->g:Ljava/lang/String;

    iget v10, v0, Lfg/a$a;->h:I

    iget v11, v0, Lfg/a$a;->i:I

    iget-object v12, v0, Lfg/a$a;->j:Ljava/lang/String;

    iget-wide v13, v0, Lfg/a$a;->k:J

    iget-object v15, v0, Lfg/a$a;->l:Lfg/a$b;

    move-object/from16 v16, v1

    iget-object v1, v0, Lfg/a$a;->m:Ljava/lang/String;

    move-wide/from16 v17, v2

    move-object v3, v1

    iget-wide v1, v0, Lfg/a$a;->n:J

    move-wide/from16 v19, v1

    iget-object v1, v0, Lfg/a$a;->o:Ljava/lang/String;

    move-wide/from16 v21, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v3

    move-wide/from16 v2, v17

    move-wide/from16 v17, v21

    invoke-direct/range {v1 .. v19}, Lfg/a;-><init>(JLjava/lang/String;Ljava/lang/String;Lfg/a$c;Lfg/a$d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLfg/a$b;Ljava/lang/String;JLjava/lang/String;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public b(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->m:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lfg/a$b;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->l:Lfg/a$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public h(Lfg/a$c;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->d:Lfg/a$c;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public j(I)Lfg/a$a;
    .locals 0

    iput p1, p0, Lfg/a$a;->h:I

    return-object p0
.end method

.method public k(J)Lfg/a$a;
    .locals 0

    iput-wide p1, p0, Lfg/a$a;->a:J

    return-object p0
.end method

.method public l(Lfg/a$d;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->e:Lfg/a$d;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lfg/a$a;
    .locals 0

    iput-object p1, p0, Lfg/a$a;->j:Ljava/lang/String;

    return-object p0
.end method

.method public n(I)Lfg/a$a;
    .locals 0

    iput p1, p0, Lfg/a$a;->i:I

    return-object p0
.end method
