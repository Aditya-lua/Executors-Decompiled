.class public final synthetic Lk3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Lf3/n;


# direct methods
.method public synthetic constructor <init>(Le3/p;Lf3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/m;->a:Le3/p;

    iput-object p2, p0, Lk3/m;->b:Lf3/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk3/m;->a:Le3/p;

    iget-object v1, p0, Lk3/m;->b:Lf3/n;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;->$r8$lambda$YEK_rua2T4JzD4b95RKPXSnoHjQ(Le3/p;Lf3/n;)V

    return-void
.end method
