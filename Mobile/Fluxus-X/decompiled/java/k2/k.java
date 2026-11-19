package k2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f21008a;
        public IconCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t[] f21009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t[] f21010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f21011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f21013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f21014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f21015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f21016j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f21017k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f21018l;

        /* JADX INFO: renamed from: k2.k$a$a, reason: collision with other inner class name */
        public static final class C0395a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f21019a;
            public final CharSequence b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f21020c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f21021d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f21022e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList<t> f21023f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f21024g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f21025h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f21026i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f21027j;

            public C0395a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0395a a(t tVar) {
                if (this.f21023f == null) {
                    this.f21023f = new ArrayList<>();
                }
                if (tVar != null) {
                    this.f21023f.add(tVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<t> arrayList3 = this.f21023f;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        t tVar = arrayList3.get(i10);
                        i10++;
                        t tVar2 = tVar;
                        if (tVar2.k()) {
                            arrayList.add(tVar2);
                        } else {
                            arrayList2.add(tVar2);
                        }
                    }
                }
                return new a(this.f21019a, this.b, this.f21020c, this.f21022e, arrayList2.isEmpty() ? null : (t[]) arrayList2.toArray(new t[arrayList2.size()]), arrayList.isEmpty() ? null : (t[]) arrayList.toArray(new t[arrayList.size()]), this.f21021d, this.f21024g, this.f21025h, this.f21026i, this.f21027j);
            }

            public final void c() {
                if (this.f21026i && this.f21020c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0395a d(boolean z10) {
                this.f21021d = z10;
                return this;
            }

            public C0395a e(boolean z10) {
                this.f21027j = z10;
                return this;
            }

            public C0395a f(boolean z10) {
                this.f21025h = z10;
                return this;
            }

            public C0395a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.e(null, BuildConfig.FLAVOR, i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0395a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f21021d = true;
                this.f21025h = true;
                this.f21019a = iconCompat;
                this.b = f.f(charSequence);
                this.f21020c = pendingIntent;
                this.f21022e = bundle;
                this.f21023f = tVarArr == null ? null : new ArrayList<>(Arrays.asList(tVarArr));
                this.f21021d = z10;
                this.f21024g = i10;
                this.f21025h = z11;
                this.f21026i = z12;
                this.f21027j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.e(null, BuildConfig.FLAVOR, i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f21017k;
        }

        public boolean b() {
            return this.f21011e;
        }

        public Bundle c() {
            return this.f21008a;
        }

        public IconCompat d() {
            int i10;
            if (this.b == null && (i10 = this.f21015i) != 0) {
                this.b = IconCompat.e(null, BuildConfig.FLAVOR, i10);
            }
            return this.b;
        }

        public t[] e() {
            return this.f21009c;
        }

        public int f() {
            return this.f21013g;
        }

        public boolean g() {
            return this.f21012f;
        }

        public CharSequence h() {
            return this.f21016j;
        }

        public boolean i() {
            return this.f21018l;
        }

        public boolean j() {
            return this.f21014h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, t[] tVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f21012f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f21015i = iconCompat.g();
            }
            this.f21016j = f.f(charSequence);
            this.f21017k = pendingIntent;
            this.f21008a = bundle == null ? new Bundle() : bundle;
            this.f21009c = tVarArr;
            this.f21010d = tVarArr2;
            this.f21011e = z10;
            this.f21013g = i10;
            this.f21012f = z11;
            this.f21014h = z12;
            this.f21018l = z13;
        }
    }

    public static class b {
        public static String a(Notification notification) {
            return notification.getGroup();
        }
    }

    public static class c extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IconCompat f21028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f21029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f21030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f21031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f21032i;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.f21028e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f21028e.p(jVar instanceof l ? ((l) jVar).f() : null));
                } else if (iconCompat.i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f21028e.f());
                }
            }
            if (this.f21030g) {
                if (this.f21029f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f21029f.p(jVar instanceof l ? ((l) jVar).f() : null));
                }
            }
            if (this.f21072d) {
                bigContentTitle.setSummaryText(this.f21071c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f21032i);
                b.b(bigContentTitle, this.f21031h);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public c h(Bitmap bitmap) {
            this.f21029f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f21030g = true;
            return this;
        }

        public c i(Bitmap bitmap) {
            this.f21028e = bitmap == null ? null : IconCompat.c(bitmap);
            return this;
        }
    }

    public static class d extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f21033e;

        @Override // k2.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.b).bigText(this.f21033e);
            if (this.f21072d) {
                bigTextStyleBigText.setSummaryText(this.f21071c);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public d h(CharSequence charSequence) {
            this.f21033e = f.f(charSequence);
            return this;
        }
    }

    public static final class e {
        public static Notification.BubbleMetadata a(e eVar) {
            return null;
        }
    }

    public static class g extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r f21060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f21061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f21062h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f21063i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f21064j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f21065k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f21066l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public IconCompat f21067m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f21068n;

        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        public static class b {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        public static class d {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public g() {
        }

        public static g h(r rVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new g(1, rVar, null, pendingIntent, pendingIntent2);
        }

        @Override // k2.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f21059e);
            bundle.putBoolean("android.callIsVideo", this.f21064j);
            r rVar = this.f21060f;
            if (rVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(rVar.i()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", rVar.j());
                }
            }
            IconCompat iconCompat = this.f21067m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.p(this.f21070a.f21034a)));
            }
            bundle.putCharSequence("android.verificationText", this.f21068n);
            bundle.putParcelable("android.answerIntent", this.f21061g);
            bundle.putParcelable("android.declineIntent", this.f21062h);
            bundle.putParcelable("android.hangUpIntent", this.f21063i);
            Integer num = this.f21065k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f21066l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // k2.k.i
        public void b(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceJ = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceJ = null;
            if (i10 < 31) {
                Notification.Builder builderA = jVar.a();
                r rVar = this.f21060f;
                builderA.setContentTitle(rVar != null ? rVar.d() : null);
                Bundle bundle = this.f21070a.E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceJ = this.f21070a.E.getCharSequence("android.text");
                }
                if (charSequenceJ == null) {
                    charSequenceJ = j();
                }
                builderA.setContentText(charSequenceJ);
                r rVar2 = this.f21060f;
                if (rVar2 != null) {
                    if (rVar2.b() != null) {
                        b.b(builderA, this.f21060f.b().p(this.f21070a.f21034a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f21060f.i());
                    } else {
                        a.a(builderA, this.f21060f.e());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f21059e;
            if (i11 == 1) {
                callStyleA = d.a(this.f21060f.i(), this.f21062h, this.f21061g);
            } else if (i11 == 2) {
                callStyleA = d.b(this.f21060f.i(), this.f21063i);
            } else if (i11 == 3) {
                callStyleA = d.c(this.f21060f.i(), this.f21063i, this.f21061g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f21059e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(jVar.a());
                Integer num = this.f21065k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f21066l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f21068n);
                IconCompat iconCompat = this.f21067m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.p(this.f21070a.f21034a));
                }
                d.f(callStyleA, this.f21064j);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> i() {
            a aVarN = n();
            a aVarM = m();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarN);
            ArrayList<a> arrayList2 = this.f21070a.b;
            int i10 = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    a aVar = arrayList2.get(i11);
                    i11++;
                    a aVar2 = aVar;
                    if (aVar2.j()) {
                        arrayList.add(aVar2);
                    } else if (!k(aVar2)) {
                        arrayList.add(aVar2);
                        i10--;
                    }
                    if (aVarM != null && i10 == 1) {
                        arrayList.add(aVarM);
                        i10--;
                    }
                }
            }
            if (aVarM != null && i10 >= 1) {
                arrayList.add(aVarM);
            }
            return arrayList;
        }

        public final String j() {
            int i10 = this.f21059e;
            if (i10 == 1) {
                return this.f21070a.f21034a.getResources().getString(j2.f.f20026e);
            }
            if (i10 == 2) {
                return this.f21070a.f21034a.getResources().getString(j2.f.f20027f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f21070a.f21034a.getResources().getString(j2.f.f20028g);
        }

        public final boolean k(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public final a l(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(l2.b.c(this.f21070a.f21034a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f21070a.f21034a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarB = new a.C0395a(IconCompat.d(this.f21070a.f21034a, i10), spannableStringBuilder, pendingIntent).b();
            aVarB.c().putBoolean("key_action_priority", true);
            return aVarB;
        }

        public final a m() {
            int i10 = j2.d.b;
            int i11 = j2.d.f19996a;
            PendingIntent pendingIntent = this.f21061g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f21064j;
            return l(z10 ? i10 : i11, z10 ? j2.f.b : j2.f.f20023a, this.f21065k, j2.b.f19994a, pendingIntent);
        }

        public final a n() {
            int i10 = j2.d.f19997c;
            PendingIntent pendingIntent = this.f21062h;
            return pendingIntent == null ? l(i10, j2.f.f20025d, this.f21066l, j2.b.b, this.f21063i) : l(i10, j2.f.f20024c, this.f21066l, j2.b.b, pendingIntent);
        }

        public g o(int i10) {
            this.f21065k = Integer.valueOf(i10);
            return this;
        }

        public g p(int i10) {
            this.f21066l = Integer.valueOf(i10);
            return this;
        }

        public g(int i10, r rVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (rVar == null || TextUtils.isEmpty(rVar.d())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f21059e = i10;
            this.f21060f = rVar;
            this.f21061g = pendingIntent3;
            this.f21062h = pendingIntent2;
            this.f21063i = pendingIntent;
        }
    }

    public static class h extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<CharSequence> f21069e = new ArrayList<>();

        @Override // k2.k.i
        public void b(j jVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.a()).setBigContentTitle(this.b);
            if (this.f21072d) {
                bigContentTitle.setSummaryText(this.f21071c);
            }
            ArrayList<CharSequence> arrayList = this.f21069e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                CharSequence charSequence = arrayList.get(i10);
                i10++;
                bigContentTitle.addLine(charSequence);
            }
        }

        @Override // k2.k.i
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public h h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f21069e.add(f.f(charSequence));
            }
            return this;
        }

        public h i(CharSequence charSequence) {
            this.b = f.f(charSequence);
            return this;
        }
    }

    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f21070a;
        public CharSequence b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f21071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21072d = false;

        public void a(Bundle bundle) {
            if (this.f21072d) {
                bundle.putCharSequence("android.summaryText", this.f21071c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(j jVar);

        public abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(f fVar) {
            if (this.f21070a != fVar) {
                this.f21070a = fVar;
                if (fVar != null) {
                    fVar.E(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static String b(Notification notification) {
        return b.a(notification);
    }

    public static boolean c(Notification notification) {
        return (notification.flags & Barcode.FORMAT_UPC_A) != 0;
    }

    public static Bitmap d(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(j2.c.b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(j2.c.f19995a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class f {
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public l2.d O;
        public long P;
        public int Q;
        public int R;
        public boolean S;
        public Notification T;
        public boolean U;
        public Object V;

        @Deprecated
        public ArrayList<String> W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f21034a;
        public ArrayList<a> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<r> f21035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<a> f21036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f21037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f21038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f21039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f21040h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f21041i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RemoteViews f21042j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IconCompat f21043k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f21044l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f21045m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f21046n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f21047o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f21048p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i f21049q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f21050r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f21051s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence[] f21052t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f21053u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f21054v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f21055w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f21056x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f21057y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f21058z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public f(Context context, String str) {
            this.b = new ArrayList<>();
            this.f21035c = new ArrayList<>();
            this.f21036d = new ArrayList<>();
            this.f21047o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f21034a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f21046n = 0;
            this.W = new ArrayList<>();
            this.S = true;
        }

        public static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public f A(int i10) {
            this.f21046n = i10;
            return this;
        }

        public f B(boolean z10) {
            this.f21047o = z10;
            return this;
        }

        public f C(int i10) {
            this.T.icon = i10;
            return this;
        }

        public f D(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.T.audioAttributes = a.a(builderD);
            return this;
        }

        public f E(i iVar) {
            if (this.f21049q != iVar) {
                this.f21049q = iVar;
                if (iVar != null) {
                    iVar.g(this);
                }
            }
            return this;
        }

        public f F(CharSequence charSequence) {
            this.T.tickerText = f(charSequence);
            return this;
        }

        public f G(long j10) {
            this.P = j10;
            return this;
        }

        public f H(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public f I(int i10) {
            this.G = i10;
            return this;
        }

        public f J(long j10) {
            this.T.when = j10;
            return this;
        }

        public f a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public f b(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
            return this;
        }

        public f c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Notification d() {
            return new l(this).c();
        }

        public Bundle e() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public f g(boolean z10) {
            q(16, z10);
            return this;
        }

        public f h(String str) {
            this.D = str;
            return this;
        }

        public f i(String str) {
            this.L = str;
            return this;
        }

        public f j(int i10) {
            this.F = i10;
            return this;
        }

        public f k(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public f l(PendingIntent pendingIntent) {
            this.f21040h = pendingIntent;
            return this;
        }

        public f m(CharSequence charSequence) {
            this.f21038f = f(charSequence);
            return this;
        }

        public f n(CharSequence charSequence) {
            this.f21037e = f(charSequence);
            return this;
        }

        public f o(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public f p(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public final void q(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.T;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public f r(PendingIntent pendingIntent, boolean z10) {
            this.f21041i = pendingIntent;
            q(Barcode.FORMAT_ITF, z10);
            return this;
        }

        public f s(String str) {
            this.f21056x = str;
            return this;
        }

        public f t(boolean z10) {
            this.f21057y = z10;
            return this;
        }

        public f u(Bitmap bitmap) {
            this.f21043k = bitmap == null ? null : IconCompat.c(k.d(this.f21034a, bitmap));
            return this;
        }

        public f v(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public f w(boolean z10) {
            this.A = z10;
            return this;
        }

        public f x(int i10) {
            this.f21045m = i10;
            return this;
        }

        public f y(boolean z10) {
            q(2, z10);
            return this;
        }

        public f z(boolean z10) {
            q(8, z10);
            return this;
        }

        @Deprecated
        public f(Context context) {
            this(context, null);
        }
    }
}
