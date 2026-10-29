.class public final Lka/n;
.super Lk9/e;
.source "SourceFile"


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a$a;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lka/n;->k:Lk9/a$g;

    new-instance v1, Lka/h;

    invoke-direct {v1}, Lka/h;-><init>()V

    sput-object v1, Lka/n;->l:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "GamesAppShortcuts.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lka/n;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-object v0, Lka/n;->m:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/app/Activity;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 2
    sget-object v0, Lka/n;->m:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method
