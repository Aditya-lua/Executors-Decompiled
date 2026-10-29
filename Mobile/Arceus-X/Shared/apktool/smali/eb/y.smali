.class public final Leb/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Set;

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    .line 2
    invoke-static {}, Leb/h1;->l()Leb/h1;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v1, "com.google.android.gms.fido"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Leb/y;-><init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "com.google.android.gms.fido"

    iput-object p1, p0, Leb/y;->a:Ljava/lang/String;

    iput-object p2, p0, Leb/y;->b:Ljava/util/Set;

    iput-boolean p6, p0, Leb/y;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;J)Leb/q;
    .locals 13
    .annotation build Lcom/google/android/apps/common/proguard/SideEffectFree;
    .end annotation

    new-instance v0, Leb/q;

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v4, Leb/l;

    sget-object v11, Leb/v;->a:Leb/v;

    new-instance v12, Leb/w;

    const-class v1, Ljava/lang/Long;

    invoke-direct {v12, v1}, Leb/w;-><init>(Ljava/lang/Class;)V

    iget-boolean v8, p0, Leb/y;->c:Z

    const/4 v9, 0x0

    iget-object v10, p0, Leb/y;->b:Ljava/util/Set;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v12}, Leb/l;-><init>(ZZZZZLjava/util/Set;Leb/x;Leb/x;)V

    iget-object v1, p0, Leb/y;->a:Ljava/lang/String;

    const/4 v5, 0x1

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Leb/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Leb/l;Z)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Leb/q;
    .locals 10
    .annotation build Lcom/google/android/apps/common/proguard/SideEffectFree;
    .end annotation

    new-instance v0, Leb/q;

    new-instance v1, Leb/l;

    sget-object v8, Leb/t;->a:Leb/t;

    new-instance v9, Leb/u;

    const-class v2, Ljava/lang/String;

    invoke-direct {v9, v2}, Leb/u;-><init>(Ljava/lang/Class;)V

    iget-boolean v5, p0, Leb/y;->c:Z

    const/4 v6, 0x0

    iget-object v7, p0, Leb/y;->b:Ljava/util/Set;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v9}, Leb/l;-><init>(ZZZZZLjava/util/Set;Leb/x;Leb/x;)V

    iget-object v2, p0, Leb/y;->a:Ljava/lang/String;

    const/4 v5, 0x1

    move-object v3, p2

    move-object v4, v1

    move-object v1, v2

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Leb/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Leb/l;Z)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;Z)Leb/q;
    .locals 13
    .annotation build Lcom/google/android/apps/common/proguard/SideEffectFree;
    .end annotation

    new-instance v0, Leb/q;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v4, Leb/l;

    sget-object v11, Leb/r;->a:Leb/r;

    new-instance v12, Leb/s;

    const-class p2, Ljava/lang/Boolean;

    invoke-direct {v12, p2}, Leb/s;-><init>(Ljava/lang/Class;)V

    iget-boolean v8, p0, Leb/y;->c:Z

    const/4 v9, 0x0

    iget-object v10, p0, Leb/y;->b:Ljava/util/Set;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v12}, Leb/l;-><init>(ZZZZZLjava/util/Set;Leb/x;Leb/x;)V

    iget-object v1, p0, Leb/y;->a:Ljava/lang/String;

    const/4 v5, 0x1

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Leb/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Leb/l;Z)V

    return-object v0
.end method

.method public final d()Leb/y;
    .locals 8

    new-instance v0, Leb/y;

    iget-object v1, p0, Leb/y;->a:Ljava/lang/String;

    iget-object v2, p0, Leb/y;->b:Ljava/util/Set;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Leb/y;-><init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V

    return-object v0
.end method

.method public final e(Ljava/util/Set;)Leb/y;
    .locals 8

    iget-boolean v6, p0, Leb/y;->c:Z

    new-instance v0, Leb/y;

    iget-object v1, p0, Leb/y;->a:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Leb/y;-><init>(Ljava/lang/String;Ljava/util/Set;ZZZZZ)V

    return-object v0
.end method
