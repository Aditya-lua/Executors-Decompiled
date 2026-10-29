.class public final synthetic Lnb/ka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:Lnb/qa;


# direct methods
.method public synthetic constructor <init>(Lnb/qa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/ka;->a:Lnb/qa;

    return-void
.end method


# virtual methods
.method public final synthetic onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lnb/ka;->a:Lnb/qa;

    invoke-virtual {v0, p1, p2}, Lnb/qa;->T(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
