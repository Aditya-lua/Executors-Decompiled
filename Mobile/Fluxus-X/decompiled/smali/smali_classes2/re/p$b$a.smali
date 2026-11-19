.class public final Lre/p$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/p$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Lre/n;

.field public final c:Lre/l;

.field public final d:Lre/x;

.field public e:Lre/p$b$b;

.field public f:Lre/p$b;


# direct methods
.method public constructor <init>(Lre/x;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lre/n;->b:Lre/n;

    iput-object v0, p0, Lre/p$b$a;->b:Lre/n;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lre/p$b$a;->e:Lre/p$b$b;

    .line 5
    iput-object v0, p0, Lre/p$b$a;->f:Lre/p$b;

    .line 6
    iput-object v0, p0, Lre/p$b$a;->c:Lre/l;

    .line 7
    iput-object p1, p0, Lre/p$b$a;->d:Lre/x;

    return-void
.end method

.method public synthetic constructor <init>(Lre/x;Lre/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lre/p$b$a;-><init>(Lre/x;)V

    return-void
.end method

.method public static synthetic a(Lre/p$b$a;)Lre/x;
    .locals 0

    iget-object p0, p0, Lre/p$b$a;->d:Lre/x;

    return-object p0
.end method

.method public static synthetic b(Lre/p$b$a;)Z
    .locals 0

    iget-boolean p0, p0, Lre/p$b$a;->a:Z

    return p0
.end method

.method public static synthetic c(Lre/p$b$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lre/p$b$a;->a:Z

    return p1
.end method

.method public static synthetic d(Lre/p$b$a;)Lre/p$b;
    .locals 0

    iget-object p0, p0, Lre/p$b$a;->f:Lre/p$b;

    return-object p0
.end method

.method public static synthetic e(Lre/p$b$a;Lre/p$b;)Lre/p$b;
    .locals 0

    iput-object p1, p0, Lre/p$b$a;->f:Lre/p$b;

    return-object p1
.end method

.method public static synthetic f(Lre/p$b$a;)Lre/p$b$b;
    .locals 0

    iget-object p0, p0, Lre/p$b$a;->e:Lre/p$b$b;

    return-object p0
.end method

.method public static synthetic g(Lre/p$b$a;)Lre/n;
    .locals 0

    iget-object p0, p0, Lre/p$b$a;->b:Lre/n;

    return-object p0
.end method

.method public static synthetic h(Lre/p$b$a;)Lre/l;
    .locals 0

    iget-object p0, p0, Lre/p$b$a;->c:Lre/l;

    return-object p0
.end method


# virtual methods
.method public i()Lre/p$b$a;
    .locals 1

    iget-object v0, p0, Lre/p$b$a;->f:Lre/p$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lre/p$b;->a(Lre/p$b;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lre/p$b$a;->a:Z

    return-object p0
.end method

.method public j()Lre/p$b$a;
    .locals 1

    invoke-static {}, Lre/p$b$b;->a()Lre/p$b$b;

    move-result-object v0

    iput-object v0, p0, Lre/p$b$a;->e:Lre/p$b$b;

    return-object p0
.end method
