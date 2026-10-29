.class public abstract La9/b;
.super Lk9/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/e<",
        "Lk9/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a$a;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, La9/b;->k:Lk9/a$g;

    new-instance v1, La9/c;

    invoke-direct {v1}, La9/c;-><init>()V

    sput-object v1, La9/b;->l:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, La9/b;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, La9/b;->m:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public abstract P()Lcom/google/android/gms/tasks/Task;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
