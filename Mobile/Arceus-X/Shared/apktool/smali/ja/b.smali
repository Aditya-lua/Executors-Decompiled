.class public final Lja/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Ljava/lang/String;

.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public final K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final M:Ljava/lang/String;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "external_player_id"

    iput-object p1, p0, Lja/b;->a:Ljava/lang/String;

    const-string p1, "game_player_id"

    iput-object p1, p0, Lja/b;->b:Ljava/lang/String;

    const-string p1, "profile_name"

    iput-object p1, p0, Lja/b;->c:Ljava/lang/String;

    const-string p1, "profile_icon_image_uri"

    iput-object p1, p0, Lja/b;->d:Ljava/lang/String;

    const-string p1, "profile_icon_image_url"

    iput-object p1, p0, Lja/b;->e:Ljava/lang/String;

    const-string p1, "profile_hi_res_image_uri"

    iput-object p1, p0, Lja/b;->f:Ljava/lang/String;

    const-string p1, "profile_hi_res_image_url"

    iput-object p1, p0, Lja/b;->g:Ljava/lang/String;

    const-string p1, "last_updated"

    iput-object p1, p0, Lja/b;->h:Ljava/lang/String;

    const-string p1, "is_in_circles"

    iput-object p1, p0, Lja/b;->i:Ljava/lang/String;

    const-string p1, "played_with_timestamp"

    iput-object p1, p0, Lja/b;->j:Ljava/lang/String;

    const-string p1, "current_xp_total"

    iput-object p1, p0, Lja/b;->k:Ljava/lang/String;

    const-string p1, "current_level"

    iput-object p1, p0, Lja/b;->l:Ljava/lang/String;

    const-string p1, "current_level_min_xp"

    iput-object p1, p0, Lja/b;->m:Ljava/lang/String;

    const-string p1, "current_level_max_xp"

    iput-object p1, p0, Lja/b;->n:Ljava/lang/String;

    const-string p1, "next_level"

    iput-object p1, p0, Lja/b;->o:Ljava/lang/String;

    const-string p1, "next_level_max_xp"

    iput-object p1, p0, Lja/b;->p:Ljava/lang/String;

    const-string p1, "last_level_up_timestamp"

    iput-object p1, p0, Lja/b;->q:Ljava/lang/String;

    const-string p1, "player_title"

    iput-object p1, p0, Lja/b;->r:Ljava/lang/String;

    const-string p1, "is_profile_visible"

    iput-object p1, p0, Lja/b;->s:Ljava/lang/String;

    const-string p1, "most_recent_external_game_id"

    iput-object p1, p0, Lja/b;->t:Ljava/lang/String;

    const-string p1, "most_recent_game_name"

    iput-object p1, p0, Lja/b;->u:Ljava/lang/String;

    const-string p1, "most_recent_activity_timestamp"

    iput-object p1, p0, Lja/b;->v:Ljava/lang/String;

    const-string p1, "most_recent_game_icon_uri"

    iput-object p1, p0, Lja/b;->w:Ljava/lang/String;

    const-string p1, "most_recent_game_hi_res_uri"

    iput-object p1, p0, Lja/b;->x:Ljava/lang/String;

    const-string p1, "most_recent_game_featured_uri"

    iput-object p1, p0, Lja/b;->y:Ljava/lang/String;

    const-string p1, "has_debug_access"

    iput-object p1, p0, Lja/b;->z:Ljava/lang/String;

    const-string p1, "gamer_tag"

    iput-object p1, p0, Lja/b;->A:Ljava/lang/String;

    const-string p1, "real_name"

    iput-object p1, p0, Lja/b;->B:Ljava/lang/String;

    const-string p1, "banner_image_landscape_uri"

    iput-object p1, p0, Lja/b;->C:Ljava/lang/String;

    const-string p1, "banner_image_landscape_url"

    iput-object p1, p0, Lja/b;->D:Ljava/lang/String;

    const-string p1, "banner_image_portrait_uri"

    iput-object p1, p0, Lja/b;->E:Ljava/lang/String;

    const-string p1, "banner_image_portrait_url"

    iput-object p1, p0, Lja/b;->F:Ljava/lang/String;

    const-string p1, "total_unlocked_achievements"

    iput-object p1, p0, Lja/b;->G:Ljava/lang/String;

    const-string p1, "play_together_friend_status"

    iput-object p1, p0, Lja/b;->H:Ljava/lang/String;

    const-string p1, "play_together_nickname"

    iput-object p1, p0, Lja/b;->I:Ljava/lang/String;

    const-string p1, "play_together_invitation_nickname"

    iput-object p1, p0, Lja/b;->J:Ljava/lang/String;

    const-string p1, "nickname_abuse_report_token"

    iput-object p1, p0, Lja/b;->K:Ljava/lang/String;

    const-string p1, "friends_list_visibility"

    iput-object p1, p0, Lja/b;->L:Ljava/lang/String;

    const-string p1, "always_auto_sign_in"

    :goto_0
    iput-object p1, p0, Lja/b;->M:Ljava/lang/String;

    return-void

    :cond_0
    const-string p1, "nullexternal_player_id"

    iput-object p1, p0, Lja/b;->a:Ljava/lang/String;

    const-string p1, "nullgame_player_id"

    iput-object p1, p0, Lja/b;->b:Ljava/lang/String;

    const-string p1, "nullprofile_name"

    iput-object p1, p0, Lja/b;->c:Ljava/lang/String;

    const-string p1, "nullprofile_icon_image_uri"

    iput-object p1, p0, Lja/b;->d:Ljava/lang/String;

    const-string p1, "nullprofile_icon_image_url"

    iput-object p1, p0, Lja/b;->e:Ljava/lang/String;

    const-string p1, "nullprofile_hi_res_image_uri"

    iput-object p1, p0, Lja/b;->f:Ljava/lang/String;

    const-string p1, "nullprofile_hi_res_image_url"

    iput-object p1, p0, Lja/b;->g:Ljava/lang/String;

    const-string p1, "nulllast_updated"

    iput-object p1, p0, Lja/b;->h:Ljava/lang/String;

    const-string p1, "nullis_in_circles"

    iput-object p1, p0, Lja/b;->i:Ljava/lang/String;

    const-string p1, "nullplayed_with_timestamp"

    iput-object p1, p0, Lja/b;->j:Ljava/lang/String;

    const-string p1, "nullcurrent_xp_total"

    iput-object p1, p0, Lja/b;->k:Ljava/lang/String;

    const-string p1, "nullcurrent_level"

    iput-object p1, p0, Lja/b;->l:Ljava/lang/String;

    const-string p1, "nullcurrent_level_min_xp"

    iput-object p1, p0, Lja/b;->m:Ljava/lang/String;

    const-string p1, "nullcurrent_level_max_xp"

    iput-object p1, p0, Lja/b;->n:Ljava/lang/String;

    const-string p1, "nullnext_level"

    iput-object p1, p0, Lja/b;->o:Ljava/lang/String;

    const-string p1, "nullnext_level_max_xp"

    iput-object p1, p0, Lja/b;->p:Ljava/lang/String;

    const-string p1, "nulllast_level_up_timestamp"

    iput-object p1, p0, Lja/b;->q:Ljava/lang/String;

    const-string p1, "nullplayer_title"

    iput-object p1, p0, Lja/b;->r:Ljava/lang/String;

    const-string p1, "nullis_profile_visible"

    iput-object p1, p0, Lja/b;->s:Ljava/lang/String;

    const-string p1, "nullmost_recent_external_game_id"

    iput-object p1, p0, Lja/b;->t:Ljava/lang/String;

    const-string p1, "nullmost_recent_game_name"

    iput-object p1, p0, Lja/b;->u:Ljava/lang/String;

    const-string p1, "nullmost_recent_activity_timestamp"

    iput-object p1, p0, Lja/b;->v:Ljava/lang/String;

    const-string p1, "nullmost_recent_game_icon_uri"

    iput-object p1, p0, Lja/b;->w:Ljava/lang/String;

    const-string p1, "nullmost_recent_game_hi_res_uri"

    iput-object p1, p0, Lja/b;->x:Ljava/lang/String;

    const-string p1, "nullmost_recent_game_featured_uri"

    iput-object p1, p0, Lja/b;->y:Ljava/lang/String;

    const-string p1, "nullhas_debug_access"

    iput-object p1, p0, Lja/b;->z:Ljava/lang/String;

    const-string p1, "nullgamer_tag"

    iput-object p1, p0, Lja/b;->A:Ljava/lang/String;

    const-string p1, "nullreal_name"

    iput-object p1, p0, Lja/b;->B:Ljava/lang/String;

    const-string p1, "nullbanner_image_landscape_uri"

    iput-object p1, p0, Lja/b;->C:Ljava/lang/String;

    const-string p1, "nullbanner_image_landscape_url"

    iput-object p1, p0, Lja/b;->D:Ljava/lang/String;

    const-string p1, "nullbanner_image_portrait_uri"

    iput-object p1, p0, Lja/b;->E:Ljava/lang/String;

    const-string p1, "nullbanner_image_portrait_url"

    iput-object p1, p0, Lja/b;->F:Ljava/lang/String;

    const-string p1, "nulltotal_unlocked_achievements"

    iput-object p1, p0, Lja/b;->G:Ljava/lang/String;

    const-string p1, "nullplay_together_friend_status"

    iput-object p1, p0, Lja/b;->H:Ljava/lang/String;

    const-string p1, "nullplay_together_nickname"

    iput-object p1, p0, Lja/b;->I:Ljava/lang/String;

    const-string p1, "nullplay_together_invitation_nickname"

    iput-object p1, p0, Lja/b;->J:Ljava/lang/String;

    const-string p1, "nullnickname_abuse_report_token"

    iput-object p1, p0, Lja/b;->K:Ljava/lang/String;

    const-string p1, "nullfriends_list_visibility"

    iput-object p1, p0, Lja/b;->L:Ljava/lang/String;

    const-string p1, "nullalways_auto_sign_in"

    goto/16 :goto_0
.end method
