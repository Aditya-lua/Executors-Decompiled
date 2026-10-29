.class public final Ly8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ly8/f;->a:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ly8/g;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ly8/f;->a:Ljava/lang/Boolean;

    .line 3
    invoke-static {p1}, Ly8/g;->b(Ly8/g;)Ljava/lang/String;

    .line 4
    invoke-static {p1}, Ly8/g;->d(Ly8/g;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ly8/f;->a:Ljava/lang/Boolean;

    .line 5
    invoke-static {p1}, Ly8/g;->c(Ly8/g;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly8/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ly8/f;
    .locals 0

    iput-object p1, p0, Ly8/f;->b:Ljava/lang/String;

    return-object p0
.end method
