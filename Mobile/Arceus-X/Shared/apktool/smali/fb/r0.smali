.class public final Lfb/r0;
.super Lk9/e;
.source "SourceFile"


# static fields
.field public static final k:Lk9/a$a;

.field public static final l:Lk9/a$g;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lfb/p0;

    invoke-direct {v0}, Lfb/p0;-><init>()V

    sput-object v0, Lfb/r0;->k:Lk9/a$a;

    new-instance v1, Lk9/a$g;

    invoke-direct {v1}, Lk9/a$g;-><init>()V

    sput-object v1, Lfb/r0;->l:Lk9/a$g;

    new-instance v2, Lk9/a;

    const-string v3, "Games.API"

    invoke-direct {v2, v3, v0, v1}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lfb/r0;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lda/o;)V
    .locals 2

    sget-object v0, Lfb/r0;->m:Lk9/a;

    sget-object v1, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public final x()Ln9/d$a;
    .locals 2

    invoke-super {p0}, Lk9/e;->x()Ln9/d$a;

    move-result-object v0

    invoke-virtual {p0}, Lk9/e;->F()Lk9/a$d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lk9/e;->F()Lk9/a$d;

    move-result-object v1

    check-cast v1, Lda/o;

    iget-object v1, v1, Lda/o;->k:Ljava/lang/String;

    :cond_0
    return-object v0
.end method
