package k2;

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
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21073a;
    public final Notification.Builder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.f f21074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f21075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RemoteViews f21076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Bundle> f21077f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f21078g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RemoteViews f21080i;

    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public static final class i {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    public l(k.f fVar) {
        int i10;
        this.f21074c = fVar;
        Context context = fVar.f21034a;
        this.f21073a = context;
        Notification.Builder builderA = e.a(context, fVar.L);
        this.b = builderA;
        Notification notification = fVar.T;
        int i11 = 0;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.f21042j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fVar.f21037e).setContentText(fVar.f21038f).setContentInfo(fVar.f21044l).setContentIntent(fVar.f21040h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(fVar.f21041i, (notification.flags & Barcode.FORMAT_ITF) != 0).setNumber(fVar.f21045m).setProgress(fVar.f21053u, fVar.f21054v, fVar.f21055w);
        IconCompat iconCompat = fVar.f21043k;
        c.b(builderA, iconCompat == null ? null : iconCompat.p(context));
        builderA.setSubText(fVar.f21050r).setUsesChronometer(fVar.f21048p).setPriority(fVar.f21046n);
        k.i iVar = fVar.f21049q;
        if (iVar instanceof k.g) {
            ArrayList<k.a> arrayListI = ((k.g) iVar).i();
            int size = arrayListI.size();
            int i12 = 0;
            while (i12 < size) {
                k.a aVar = arrayListI.get(i12);
                i12++;
                b(aVar);
            }
        } else {
            ArrayList<k.a> arrayList = fVar.b;
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                k.a aVar2 = arrayList.get(i13);
                i13++;
                b(aVar2);
            }
        }
        Bundle bundle = fVar.E;
        if (bundle != null) {
            this.f21078g.putAll(bundle);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f21075d = fVar.I;
        this.f21076e = fVar.J;
        this.b.setShowWhen(fVar.f21047o);
        a.g(this.b, fVar.A);
        a.e(this.b, fVar.f21056x);
        a.h(this.b, fVar.f21058z);
        a.f(this.b, fVar.f21057y);
        this.f21079h = fVar.Q;
        b.b(this.b, fVar.D);
        b.c(this.b, fVar.F);
        b.f(this.b, fVar.G);
        b.d(this.b, fVar.H);
        b.e(this.b, notification.sound, notification.audioAttributes);
        List listE = i14 < 28 ? e(g(fVar.f21035c), fVar.W) : fVar.W;
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                b.a(this.b, (String) it.next());
            }
        }
        this.f21080i = fVar.K;
        if (fVar.f21036d.size() > 0) {
            Bundle bundle2 = fVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i15 = 0; i15 < fVar.f21036d.size(); i15++) {
                bundle4.putBundle(Integer.toString(i15), m.a(fVar.f21036d.get(i15)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f21078g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i16 = Build.VERSION.SDK_INT;
        Object obj = fVar.V;
        if (obj != null) {
            c.c(this.b, obj);
        }
        this.b.setExtras(fVar.E);
        d.e(this.b, fVar.f21052t);
        RemoteViews remoteViews = fVar.I;
        if (remoteViews != null) {
            d.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = fVar.J;
        if (remoteViews2 != null) {
            d.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = fVar.K;
        if (remoteViews3 != null) {
            d.d(this.b, remoteViews3);
        }
        e.b(this.b, fVar.M);
        e.e(this.b, fVar.f21051s);
        e.f(this.b, fVar.N);
        e.g(this.b, fVar.P);
        e.d(this.b, fVar.Q);
        if (fVar.C) {
            e.c(this.b, fVar.B);
        }
        if (!TextUtils.isEmpty(fVar.L)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i16 >= 28) {
            ArrayList<r> arrayList2 = fVar.f21035c;
            int size3 = arrayList2.size();
            while (i11 < size3) {
                r rVar = arrayList2.get(i11);
                i11++;
                f.a(this.b, rVar.i());
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            g.a(this.b, fVar.S);
            g.b(this.b, k.e.a(null));
            l2.d dVar = fVar.O;
            if (dVar != null) {
                g.d(this.b, dVar.c());
            }
        }
        if (i17 >= 31 && (i10 = fVar.R) != 0) {
            h.b(this.b, i10);
        }
        if (i17 >= 36) {
            i.a(this.b, fVar.f21039g);
        }
        if (fVar.U) {
            if (this.f21074c.f21057y) {
                this.f21079h = 2;
            } else {
                this.f21079h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i18 = notification.defaults & (-4);
            notification.defaults = i18;
            this.b.setDefaults(i18);
            if (TextUtils.isEmpty(this.f21074c.f21056x)) {
                a.e(this.b, "silent");
            }
            e.d(this.b, this.f21079h);
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        w1.b bVar = new w1.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> g(List<r> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<r> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        return arrayList;
    }

    @Override // k2.j
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(k.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.o() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : t.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.b, a.d(builderA));
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        k.i iVar = this.f21074c.f21049q;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews remoteViewsE = iVar != null ? iVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f21074c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (iVar != null && (remoteViewsD = iVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (iVar != null && (remoteViewsF = this.f21074c.f21049q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (iVar != null && (bundleA = k.a(notificationD)) != null) {
            iVar.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        return this.b.build();
    }

    public Context f() {
        return this.f21073a;
    }
}
