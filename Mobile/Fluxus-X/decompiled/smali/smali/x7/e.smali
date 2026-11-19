.class public Lx7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/e$b;,
        Lx7/e$a;
    }
.end annotation


# static fields
.field public static final c:Lx7/e;

.field public static final d:Lx7/e;

.field public static final e:Lx7/e;

.field public static final f:Lx7/e;

.field public static final g:Lx7/e;

.field public static final h:Lx7/e;

.field public static final i:Lx7/e;

.field public static final j:Lx7/e;

.field public static final k:Lx7/e;


# instance fields
.field public a:Lx7/e$a;

.field public b:Lx7/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lx7/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->c:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v2, Lx7/e$a;->a:Lx7/e$a;

    invoke-direct {v0, v2, v1}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->d:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v1, Lx7/e$a;->f:Lx7/e$a;

    sget-object v2, Lx7/e$b;->a:Lx7/e$b;

    invoke-direct {v0, v1, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->e:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v3, Lx7/e$a;->b:Lx7/e$a;

    invoke-direct {v0, v3, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->f:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v4, Lx7/e$a;->j:Lx7/e$a;

    invoke-direct {v0, v4, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->g:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v4, Lx7/e$a;->c:Lx7/e$a;

    invoke-direct {v0, v4, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->h:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v4, Lx7/e$a;->i:Lx7/e$a;

    invoke-direct {v0, v4, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->i:Lx7/e;

    new-instance v0, Lx7/e;

    sget-object v2, Lx7/e$b;->b:Lx7/e$b;

    invoke-direct {v0, v1, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->j:Lx7/e;

    new-instance v0, Lx7/e;

    invoke-direct {v0, v3, v2}, Lx7/e;-><init>(Lx7/e$a;Lx7/e$b;)V

    sput-object v0, Lx7/e;->k:Lx7/e;

    return-void
.end method

.method public constructor <init>(Lx7/e$a;Lx7/e$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/e;->a:Lx7/e$a;

    iput-object p2, p0, Lx7/e;->b:Lx7/e$b;

    return-void
.end method


# virtual methods
.method public a()Lx7/e$a;
    .locals 1

    iget-object v0, p0, Lx7/e;->a:Lx7/e$a;

    return-object v0
.end method

.method public b()Lx7/e$b;
    .locals 1

    iget-object v0, p0, Lx7/e;->b:Lx7/e$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Lx7/e;

    iget-object v2, p0, Lx7/e;->a:Lx7/e$a;

    iget-object v3, p1, Lx7/e;->a:Lx7/e$a;

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lx7/e;->b:Lx7/e$b;

    iget-object p1, p1, Lx7/e;->b:Lx7/e$b;

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lx7/e;->a:Lx7/e$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx7/e;->b:Lx7/e$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
