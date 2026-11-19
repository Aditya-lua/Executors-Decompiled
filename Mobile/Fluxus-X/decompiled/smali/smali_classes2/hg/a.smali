.class public final Lhg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg/a$c;,
        Lhg/a$d;,
        Lhg/a$b;,
        Lhg/a$a;
    }
.end annotation


# static fields
.field public static final p:Lhg/a;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lhg/a$c;

.field public final e:Lhg/a$d;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:Lhg/a$b;

.field public final m:Ljava/lang/String;

.field public final n:J

.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhg/a$a;

    invoke-direct {v0}, Lhg/a$a;-><init>()V

    invoke-virtual {v0}, Lhg/a$a;->a()Lhg/a;

    move-result-object v0

    sput-object v0, Lhg/a;->p:Lhg/a;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Lhg/a$c;Lhg/a$d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLhg/a$b;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lhg/a;->a:J

    iput-object p3, p0, Lhg/a;->b:Ljava/lang/String;

    iput-object p4, p0, Lhg/a;->c:Ljava/lang/String;

    iput-object p5, p0, Lhg/a;->d:Lhg/a$c;

    iput-object p6, p0, Lhg/a;->e:Lhg/a$d;

    iput-object p7, p0, Lhg/a;->f:Ljava/lang/String;

    iput-object p8, p0, Lhg/a;->g:Ljava/lang/String;

    iput p9, p0, Lhg/a;->h:I

    iput p10, p0, Lhg/a;->i:I

    iput-object p11, p0, Lhg/a;->j:Ljava/lang/String;

    iput-wide p12, p0, Lhg/a;->k:J

    iput-object p14, p0, Lhg/a;->l:Lhg/a$b;

    iput-object p15, p0, Lhg/a;->m:Ljava/lang/String;

    move-wide/from16 p1, p16

    iput-wide p1, p0, Lhg/a;->n:J

    move-object/from16 p1, p18

    iput-object p1, p0, Lhg/a;->o:Ljava/lang/String;

    return-void
.end method

.method public static p()Lhg/a$a;
    .locals 1

    new-instance v0, Lhg/a$a;

    invoke-direct {v0}, Lhg/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0xd
    .end annotation

    iget-object v0, p0, Lhg/a;->m:Ljava/lang/String;

    return-object v0
.end method

.method public b()J
    .locals 2
    .annotation build Lwf/d;
        tag = 0xb
    .end annotation

    iget-wide v0, p0, Lhg/a;->k:J

    return-wide v0
.end method

.method public c()J
    .locals 2
    .annotation build Lwf/d;
        tag = 0xe
    .end annotation

    iget-wide v0, p0, Lhg/a;->n:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x7
    .end annotation

    iget-object v0, p0, Lhg/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0xf
    .end annotation

    iget-object v0, p0, Lhg/a;->o:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lhg/a$b;
    .locals 1
    .annotation build Lwf/d;
        tag = 0xc
    .end annotation

    iget-object v0, p0, Lhg/a;->l:Lhg/a$b;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lhg/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Lhg/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lhg/a$c;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Lhg/a;->d:Lhg/a$c;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x6
    .end annotation

    iget-object v0, p0, Lhg/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1
    .annotation build Lwf/d;
        tag = 0x8
    .end annotation

    iget v0, p0, Lhg/a;->h:I

    return v0
.end method

.method public l()J
    .locals 2
    .annotation build Lwf/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lhg/a;->a:J

    return-wide v0
.end method

.method public m()Lhg/a$d;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x5
    .end annotation

    iget-object v0, p0, Lhg/a;->e:Lhg/a$d;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1
    .annotation build Lwf/d;
        tag = 0xa
    .end annotation

    iget-object v0, p0, Lhg/a;->j:Ljava/lang/String;

    return-object v0
.end method

.method public o()I
    .locals 1
    .annotation build Lwf/d;
        tag = 0x9
    .end annotation

    iget v0, p0, Lhg/a;->i:I

    return v0
.end method
