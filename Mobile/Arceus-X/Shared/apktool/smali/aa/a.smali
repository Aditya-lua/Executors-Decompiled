.class public Laa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/a$g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final b:Lk9/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final c:Leb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Laa/a;->a:Lk9/a$g;

    new-instance v1, Lk9/a;

    new-instance v2, Leb/c;

    invoke-direct {v2}, Leb/c;-><init>()V

    const-string v3, "Fido.U2F_ZERO_PARTY_API"

    invoke-direct {v1, v3, v2, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v1, Laa/a;->b:Lk9/a;

    new-instance v0, Leb/b;

    invoke-direct {v0}, Leb/b;-><init>()V

    sput-object v0, Laa/a;->c:Leb/b;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lba/a;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lba/a;

    invoke-direct {v0, p0}, Lba/a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
