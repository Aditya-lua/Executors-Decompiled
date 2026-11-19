.class public final Lgb/s0;
.super Ll9/g;
.source "SourceFile"


# static fields
.field public static final k:Ll9/a$a;

.field public static final l:Ll9/a$g;

.field public static final m:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgb/q0;

    invoke-direct {v0}, Lgb/q0;-><init>()V

    sput-object v0, Lgb/s0;->k:Ll9/a$a;

    new-instance v1, Ll9/a$g;

    invoke-direct {v1}, Ll9/a$g;-><init>()V

    sput-object v1, Lgb/s0;->l:Ll9/a$g;

    new-instance v2, Ll9/a;

    const-string v3, "Games.API"

    invoke-direct {v2, v3, v0, v1}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lgb/s0;->m:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lea/x;)V
    .locals 2

    sget-object v0, Lgb/s0;->m:Ll9/a;

    sget-object v1, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, p2, v1}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method


# virtual methods
.method public final x()Lo9/f$a;
    .locals 2

    invoke-super {p0}, Ll9/g;->x()Lo9/f$a;

    move-result-object v0

    invoke-virtual {p0}, Ll9/g;->F()Ll9/a$d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll9/g;->F()Ll9/a$d;

    move-result-object v1

    check-cast v1, Lea/x;

    iget-object v1, v1, Lea/x;->k:Ljava/lang/String;

    :cond_0
    return-object v0
.end method
