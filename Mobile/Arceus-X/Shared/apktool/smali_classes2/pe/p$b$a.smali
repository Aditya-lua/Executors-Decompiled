.class public final Lpe/p$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/p$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Lpe/n;

.field public final c:Lpe/l;

.field public final d:Lpe/x;

.field public e:Lpe/p$b$b;

.field public f:Lpe/p$b;


# direct methods
.method public constructor <init>(Lpe/x;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lpe/n;->b:Lpe/n;

    iput-object v0, p0, Lpe/p$b$a;->b:Lpe/n;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lpe/p$b$a;->e:Lpe/p$b$b;

    .line 5
    iput-object v0, p0, Lpe/p$b$a;->f:Lpe/p$b;

    .line 6
    iput-object v0, p0, Lpe/p$b$a;->c:Lpe/l;

    .line 7
    iput-object p1, p0, Lpe/p$b$a;->d:Lpe/x;

    return-void
.end method

.method public synthetic constructor <init>(Lpe/x;Lpe/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lpe/p$b$a;-><init>(Lpe/x;)V

    return-void
.end method

.method public static synthetic a(Lpe/p$b$a;)Lpe/x;
    .locals 0

    iget-object p0, p0, Lpe/p$b$a;->d:Lpe/x;

    return-object p0
.end method

.method public static synthetic b(Lpe/p$b$a;)Z
    .locals 0

    iget-boolean p0, p0, Lpe/p$b$a;->a:Z

    return p0
.end method

.method public static synthetic c(Lpe/p$b$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lpe/p$b$a;->a:Z

    return p1
.end method

.method public static synthetic d(Lpe/p$b$a;)Lpe/p$b;
    .locals 0

    iget-object p0, p0, Lpe/p$b$a;->f:Lpe/p$b;

    return-object p0
.end method

.method public static synthetic e(Lpe/p$b$a;Lpe/p$b;)Lpe/p$b;
    .locals 0

    iput-object p1, p0, Lpe/p$b$a;->f:Lpe/p$b;

    return-object p1
.end method

.method public static synthetic f(Lpe/p$b$a;)Lpe/p$b$b;
    .locals 0

    iget-object p0, p0, Lpe/p$b$a;->e:Lpe/p$b$b;

    return-object p0
.end method

.method public static synthetic g(Lpe/p$b$a;)Lpe/n;
    .locals 0

    iget-object p0, p0, Lpe/p$b$a;->b:Lpe/n;

    return-object p0
.end method

.method public static synthetic h(Lpe/p$b$a;)Lpe/l;
    .locals 0

    iget-object p0, p0, Lpe/p$b$a;->c:Lpe/l;

    return-object p0
.end method


# virtual methods
.method public i()Lpe/p$b$a;
    .locals 1

    iget-object v0, p0, Lpe/p$b$a;->f:Lpe/p$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lpe/p$b;->a(Lpe/p$b;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpe/p$b$a;->a:Z

    return-object p0
.end method

.method public j()Lpe/p$b$a;
    .locals 1

    invoke-static {}, Lpe/p$b$b;->a()Lpe/p$b$b;

    move-result-object v0

    iput-object v0, p0, Lpe/p$b$a;->e:Lpe/p$b$b;

    return-object p0
.end method
