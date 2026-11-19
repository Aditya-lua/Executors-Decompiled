.class public Lba/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final b:Ll9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final c:Lfb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lba/a;->a:Ll9/a$g;

    new-instance v1, Ll9/a;

    new-instance v2, Lfb/c;

    invoke-direct {v2}, Lfb/c;-><init>()V

    const-string v3, "Fido.U2F_ZERO_PARTY_API"

    invoke-direct {v1, v3, v2, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v1, Lba/a;->b:Ll9/a;

    new-instance v0, Lfb/b;

    invoke-direct {v0}, Lfb/b;-><init>()V

    sput-object v0, Lba/a;->c:Lfb/b;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lca/a;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lca/a;

    invoke-direct {v0, p0}, Lca/a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
