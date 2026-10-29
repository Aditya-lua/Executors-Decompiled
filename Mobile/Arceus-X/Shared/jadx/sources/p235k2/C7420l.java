package p235k2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p261l2.C7977d;
import p504w1.C12278b;

/* JADX INFO: renamed from: k2.l */
/* JADX INFO: loaded from: classes.dex */
public class C7420l implements InterfaceC7418j {

    /* JADX INFO: renamed from: a */
    public final Context f28630a;

    /* JADX INFO: renamed from: b */
    public final Notification.Builder f28631b;

    /* JADX INFO: renamed from: c */
    public final C7419k.f f28632c;

    /* JADX INFO: renamed from: d */
    public RemoteViews f28633d;

    /* JADX INFO: renamed from: e */
    public RemoteViews f28634e;

    /* JADX INFO: renamed from: f */
    public final List<Bundle> f28635f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final Bundle f28636g = new Bundle();

    /* JADX INFO: renamed from: h */
    public int f28637h;

    /* JADX INFO: renamed from: i */
    public RemoteViews f28638i;

    /* JADX INFO: renamed from: k2.l$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m30842a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Action.Builder m30843b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* JADX INFO: renamed from: c */
        public static Notification.Action.Builder m30844c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* JADX INFO: renamed from: d */
        public static Notification.Action m30845d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: e */
        public static Notification.Builder m30846e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* JADX INFO: renamed from: f */
        public static Notification.Builder m30847f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        /* JADX INFO: renamed from: g */
        public static Notification.Builder m30848g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        /* JADX INFO: renamed from: h */
        public static Notification.Builder m30849h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: k2.l$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m30850a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Builder m30851b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* JADX INFO: renamed from: c */
        public static Notification.Builder m30852c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        /* JADX INFO: renamed from: d */
        public static Notification.Builder m30853d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* JADX INFO: renamed from: e */
        public static Notification.Builder m30854e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* JADX INFO: renamed from: f */
        public static Notification.Builder m30855f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: renamed from: k2.l$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m30856a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Builder m30857b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        /* JADX INFO: renamed from: c */
        public static Notification.Builder m30858c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: k2.l$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m30859a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Builder m30860b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* JADX INFO: renamed from: c */
        public static Notification.Builder m30861c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* JADX INFO: renamed from: d */
        public static Notification.Builder m30862d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* JADX INFO: renamed from: e */
        public static Notification.Builder m30863e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: k2.l$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m30864a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Builder m30865b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        /* JADX INFO: renamed from: c */
        public static Notification.Builder m30866c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        /* JADX INFO: renamed from: d */
        public static Notification.Builder m30867d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        /* JADX INFO: renamed from: e */
        public static Notification.Builder m30868e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* JADX INFO: renamed from: f */
        public static Notification.Builder m30869f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* JADX INFO: renamed from: g */
        public static Notification.Builder m30870g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: renamed from: k2.l$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m30871a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Action.Builder m30872b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: renamed from: k2.l$g */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m30873a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Builder m30874b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* JADX INFO: renamed from: c */
        public static Notification.Action.Builder m30875c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        /* JADX INFO: renamed from: d */
        public static Notification.Builder m30876d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: k2.l$h */
    public static class h {
        /* JADX INFO: renamed from: a */
        public static Notification.Action.Builder m30877a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        /* JADX INFO: renamed from: b */
        public static Notification.Builder m30878b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: renamed from: k2.l$i */
    public static final class i {
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m30879a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    public C7420l(C7419k.f fVar) {
        int i10;
        this.f28632c = fVar;
        Context context = fVar.f28589a;
        this.f28630a = context;
        Notification.Builder builderM30864a = e.m30864a(context, fVar.f28577L);
        this.f28631b = builderM30864a;
        Notification notification = fVar.f28585T;
        int i11 = 0;
        builderM30864a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.f28598j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fVar.f28593e).setContentText(fVar.f28594f).setContentInfo(fVar.f28600l).setContentIntent(fVar.f28596h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(fVar.f28597i, (notification.flags & 128) != 0).setNumber(fVar.f28601m).setProgress(fVar.f28609u, fVar.f28610v, fVar.f28611w);
        IconCompat iconCompat = fVar.f28599k;
        c.m30857b(builderM30864a, iconCompat == null ? null : iconCompat.m2699p(context));
        builderM30864a.setSubText(fVar.f28606r).setUsesChronometer(fVar.f28604p).setPriority(fVar.f28602n);
        C7419k.i iVar = fVar.f28605q;
        if (iVar instanceof C7419k.g) {
            ArrayList<C7419k.a> arrayListM30808i = ((C7419k.g) iVar).m30808i();
            int size = arrayListM30808i.size();
            int i12 = 0;
            while (i12 < size) {
                C7419k.a aVar = arrayListM30808i.get(i12);
                i12++;
                m30838b(aVar);
            }
        } else {
            ArrayList<C7419k.a> arrayList = fVar.f28590b;
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                C7419k.a aVar2 = arrayList.get(i13);
                i13++;
                m30838b(aVar2);
            }
        }
        Bundle bundle = fVar.f28570E;
        if (bundle != null) {
            this.f28636g.putAll(bundle);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f28633d = fVar.f28574I;
        this.f28634e = fVar.f28575J;
        this.f28631b.setShowWhen(fVar.f28603o);
        a.m30848g(this.f28631b, fVar.f28566A);
        a.m30846e(this.f28631b, fVar.f28612x);
        a.m30849h(this.f28631b, fVar.f28614z);
        a.m30847f(this.f28631b, fVar.f28613y);
        this.f28637h = fVar.f28582Q;
        b.m30851b(this.f28631b, fVar.f28569D);
        b.m30852c(this.f28631b, fVar.f28571F);
        b.m30855f(this.f28631b, fVar.f28572G);
        b.m30853d(this.f28631b, fVar.f28573H);
        b.m30854e(this.f28631b, notification.sound, notification.audioAttributes);
        List listM30836e = i14 < 28 ? m30836e(m30837g(fVar.f28591c), fVar.f28588W) : fVar.f28588W;
        if (listM30836e != null && !listM30836e.isEmpty()) {
            Iterator it = listM30836e.iterator();
            while (it.hasNext()) {
                b.m30850a(this.f28631b, (String) it.next());
            }
        }
        this.f28638i = fVar.f28576K;
        if (fVar.f28592d.size() > 0) {
            Bundle bundle2 = fVar.m30781d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i15 = 0; i15 < fVar.f28592d.size(); i15++) {
                bundle4.putBundle(Integer.toString(i15), C7421m.m30880a(fVar.f28592d.get(i15)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.m30781d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f28636g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i16 = Build.VERSION.SDK_INT;
        Object obj = fVar.f28587V;
        if (obj != null) {
            c.m30858c(this.f28631b, obj);
        }
        this.f28631b.setExtras(fVar.f28570E);
        d.m30863e(this.f28631b, fVar.f28608t);
        RemoteViews remoteViews = fVar.f28574I;
        if (remoteViews != null) {
            d.m30861c(this.f28631b, remoteViews);
        }
        RemoteViews remoteViews2 = fVar.f28575J;
        if (remoteViews2 != null) {
            d.m30860b(this.f28631b, remoteViews2);
        }
        RemoteViews remoteViews3 = fVar.f28576K;
        if (remoteViews3 != null) {
            d.m30862d(this.f28631b, remoteViews3);
        }
        e.m30865b(this.f28631b, fVar.f28578M);
        e.m30868e(this.f28631b, fVar.f28607s);
        e.m30869f(this.f28631b, fVar.f28579N);
        e.m30870g(this.f28631b, fVar.f28581P);
        e.m30867d(this.f28631b, fVar.f28582Q);
        if (fVar.f28568C) {
            e.m30866c(this.f28631b, fVar.f28567B);
        }
        if (!TextUtils.isEmpty(fVar.f28577L)) {
            this.f28631b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i16 >= 28) {
            ArrayList<C7426r> arrayList2 = fVar.f28591c;
            int size3 = arrayList2.size();
            while (i11 < size3) {
                C7426r c7426r = arrayList2.get(i11);
                i11++;
                f.m30871a(this.f28631b, c7426r.m30919i());
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            g.m30873a(this.f28631b, fVar.f28584S);
            g.m30874b(this.f28631b, C7419k.e.m30769a(null));
            C7977d c7977d = fVar.f28580O;
            if (c7977d != null) {
                g.m30876d(this.f28631b, c7977d.m33035c());
            }
        }
        if (i17 >= 31 && (i10 = fVar.f28583R) != 0) {
            h.m30878b(this.f28631b, i10);
        }
        if (i17 >= 36) {
            i.m30879a(this.f28631b, fVar.f28595g);
        }
        if (fVar.f28586U) {
            if (this.f28632c.f28613y) {
                this.f28637h = 2;
            } else {
                this.f28637h = 1;
            }
            this.f28631b.setVibrate(null);
            this.f28631b.setSound(null);
            int i18 = notification.defaults & (-4);
            notification.defaults = i18;
            this.f28631b.setDefaults(i18);
            if (TextUtils.isEmpty(this.f28632c.f28612x)) {
                a.m30846e(this.f28631b, "silent");
            }
            e.m30867d(this.f28631b, this.f28637h);
        }
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m30836e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C12278b c12278b = new C12278b(list.size() + list2.size());
        c12278b.addAll(list);
        c12278b.addAll(list2);
        return new ArrayList(c12278b);
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m30837g(List<C7426r> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C7426r> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m30918h());
        }
        return arrayList;
    }

    @Override // p235k2.InterfaceC7418j
    /* JADX INFO: renamed from: a */
    public Notification.Builder mo30737a() {
        return this.f28631b;
    }

    /* JADX INFO: renamed from: b */
    public final void m30838b(C7419k.a aVar) {
        IconCompat iconCompatM30745d = aVar.m30745d();
        Notification.Action.Builder builderM30856a = c.m30856a(iconCompatM30745d != null ? iconCompatM30745d.m2698o() : null, aVar.m30749h(), aVar.m30742a());
        if (aVar.m30746e() != null) {
            for (RemoteInput remoteInput : C7428t.m30933b(aVar.m30746e())) {
                a.m30844c(builderM30856a, remoteInput);
            }
        }
        Bundle bundle = aVar.m30744c() != null ? new Bundle(aVar.m30744c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m30743b());
        int i10 = Build.VERSION.SDK_INT;
        d.m30859a(builderM30856a, aVar.m30743b());
        bundle.putInt("android.support.action.semanticAction", aVar.m30747f());
        if (i10 >= 28) {
            f.m30872b(builderM30856a, aVar.m30747f());
        }
        if (i10 >= 29) {
            g.m30875c(builderM30856a, aVar.m30751j());
        }
        if (i10 >= 31) {
            h.m30877a(builderM30856a, aVar.m30750i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m30748g());
        a.m30843b(builderM30856a, bundle);
        a.m30842a(this.f28631b, a.m30845d(builderM30856a));
    }

    /* JADX INFO: renamed from: c */
    public Notification m30839c() {
        Bundle bundleM30738a;
        RemoteViews remoteViewsM30834f;
        RemoteViews remoteViewsM30832d;
        C7419k.i iVar = this.f28632c.f28605q;
        if (iVar != null) {
            iVar.mo30759b(this);
        }
        RemoteViews remoteViewsM30833e = iVar != null ? iVar.m30833e(this) : null;
        Notification notificationM30840d = m30840d();
        if (remoteViewsM30833e != null) {
            notificationM30840d.contentView = remoteViewsM30833e;
        } else {
            RemoteViews remoteViews = this.f28632c.f28574I;
            if (remoteViews != null) {
                notificationM30840d.contentView = remoteViews;
            }
        }
        if (iVar != null && (remoteViewsM30832d = iVar.m30832d(this)) != null) {
            notificationM30840d.bigContentView = remoteViewsM30832d;
        }
        if (iVar != null && (remoteViewsM30834f = this.f28632c.f28605q.m30834f(this)) != null) {
            notificationM30840d.headsUpContentView = remoteViewsM30834f;
        }
        if (iVar != null && (bundleM30738a = C7419k.m30738a(notificationM30840d)) != null) {
            iVar.mo30767a(bundleM30738a);
        }
        return notificationM30840d;
    }

    /* JADX INFO: renamed from: d */
    public Notification m30840d() {
        return this.f28631b.build();
    }

    /* JADX INFO: renamed from: f */
    public Context m30841f() {
        return this.f28630a;
    }
}
