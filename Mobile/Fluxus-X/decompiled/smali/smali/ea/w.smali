.class public final Lea/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ljava/util/ArrayList;

.field public c:Ljava/lang/String;

.field public d:Lha/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x1110

    iput p1, p0, Lea/w;->a:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lea/w;->b:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, p0, Lea/w;->c:Ljava/lang/String;

    sget-object p1, Lha/r;->d:Lha/r;

    iput-object p1, p0, Lea/w;->d:Lha/r;

    return-void
.end method


# virtual methods
.method public final a(I)Lea/w;
    .locals 0

    const p1, 0x201113

    iput p1, p0, Lea/w;->a:I

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lea/w;
    .locals 0

    iput-object p1, p0, Lea/w;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Lha/r;)Lea/w;
    .locals 0

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lha/r;

    iput-object p1, p0, Lea/w;->d:Lha/r;

    return-object p0
.end method

.method public final d()Lea/x;
    .locals 19

    move-object/from16 v0, p0

    iget-object v8, v0, Lea/w;->b:Ljava/util/ArrayList;

    new-instance v1, Lea/x;

    iget v6, v0, Lea/w;->a:I

    iget-object v15, v0, Lea/w;->c:Ljava/lang/String;

    iget-object v2, v0, Lea/w;->d:Lha/r;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x11

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x9

    invoke-direct/range {v1 .. v18}, Lea/x;-><init>(ZZIZILjava/lang/String;Ljava/util/ArrayList;ZZZLjava/lang/String;IILjava/lang/String;Lha/r;Z[B)V

    return-object v1
.end method
