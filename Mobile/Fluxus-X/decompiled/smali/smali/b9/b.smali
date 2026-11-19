.class public abstract Lb9/b;
.super Ll9/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/g<",
        "Ll9/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Ll9/a$g;

.field public static final l:Ll9/a$a;

.field public static final m:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lb9/b;->k:Ll9/a$g;

    new-instance v1, Lb9/c;

    invoke-direct {v1}, Lb9/c;-><init>()V

    sput-object v1, Lb9/b;->l:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lb9/b;->m:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lb9/b;->m:Ll9/a;

    sget-object v1, Ll9/a$d;->Oo:Ll9/a$d$c;

    sget-object v2, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, v1, v2}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

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
