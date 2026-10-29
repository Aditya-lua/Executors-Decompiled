.class public Lkg/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lkg/e;

.field public static final e:Lkg/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkg/e;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Lkg/e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, Lkg/e;->d:Lkg/e;

    new-instance v0, Lkg/e;

    const-string v1, "  "

    const/4 v2, 0x1

    const-string v3, "\n"

    invoke-direct {v0, v3, v1, v2}, Lkg/e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, Lkg/e;->e:Lkg/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "newline == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "indent == null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "[\r\n]*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "[ \t]*"

    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lkg/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lkg/e;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lkg/e;->c:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only combinations of spaces and tabs are allowed in indent."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only combinations of \\n and \\r are allowed in newline."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkg/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkg/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lkg/e;->c:Z

    return v0
.end method

.method public d(Ljava/lang/String;)Lkg/e;
    .locals 3

    new-instance v0, Lkg/e;

    iget-object v1, p0, Lkg/e;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lkg/e;->c:Z

    invoke-direct {v0, v1, p1, v2}, Lkg/e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method
