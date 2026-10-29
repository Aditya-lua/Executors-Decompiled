package p235k2;

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
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import p206j2.C7020b;
import p206j2.C7021c;
import p206j2.C7022d;
import p206j2.C7024f;
import p261l2.C7975b;
import p261l2.C7977d;

/* JADX INFO: renamed from: k2.k */
/* JADX INFO: loaded from: classes.dex */
public class C7419k {

    /* JADX INFO: renamed from: k2.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Bundle f28538a;

        /* JADX INFO: renamed from: b */
        public IconCompat f28539b;

        /* JADX INFO: renamed from: c */
        public final C7428t[] f28540c;

        /* JADX INFO: renamed from: d */
        public final C7428t[] f28541d;

        /* JADX INFO: renamed from: e */
        public boolean f28542e;

        /* JADX INFO: renamed from: f */
        public boolean f28543f;

        /* JADX INFO: renamed from: g */
        public final int f28544g;

        /* JADX INFO: renamed from: h */
        public final boolean f28545h;

        /* JADX INFO: renamed from: i */
        @Deprecated
        public int f28546i;

        /* JADX INFO: renamed from: j */
        public CharSequence f28547j;

        /* JADX INFO: renamed from: k */
        public PendingIntent f28548k;

        /* JADX INFO: renamed from: l */
        public boolean f28549l;

        /* JADX INFO: renamed from: k2.k$a$a, reason: collision with other inner class name */
        public static final class C14195a {

            /* JADX INFO: renamed from: a */
            public final IconCompat f28550a;

            /* JADX INFO: renamed from: b */
            public final CharSequence f28551b;

            /* JADX INFO: renamed from: c */
            public final PendingIntent f28552c;

            /* JADX INFO: renamed from: d */
            public boolean f28553d;

            /* JADX INFO: renamed from: e */
            public final Bundle f28554e;

            /* JADX INFO: renamed from: f */
            public ArrayList<C7428t> f28555f;

            /* JADX INFO: renamed from: g */
            public int f28556g;

            /* JADX INFO: renamed from: h */
            public boolean f28557h;

            /* JADX INFO: renamed from: i */
            public boolean f28558i;

            /* JADX INFO: renamed from: j */
            public boolean f28559j;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C14195a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* JADX INFO: renamed from: a */
            public C14195a m30752a(C7428t c7428t) {
                if (this.f28555f == null) {
                    this.f28555f = new ArrayList<>();
                }
                if (c7428t != null) {
                    this.f28555f.add(c7428t);
                }
                return this;
            }

            /* JADX INFO: renamed from: b */
            public a m30753b() {
                m30754c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C7428t> arrayList3 = this.f28555f;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        C7428t c7428t = arrayList3.get(i10);
                        i10++;
                        C7428t c7428t2 = c7428t;
                        if (c7428t2.m30942k()) {
                            arrayList.add(c7428t2);
                        } else {
                            arrayList2.add(c7428t2);
                        }
                    }
                }
                return new a(this.f28550a, this.f28551b, this.f28552c, this.f28554e, arrayList2.isEmpty() ? null : (C7428t[]) arrayList2.toArray(new C7428t[arrayList2.size()]), arrayList.isEmpty() ? null : (C7428t[]) arrayList.toArray(new C7428t[arrayList.size()]), this.f28553d, this.f28556g, this.f28557h, this.f28558i, this.f28559j);
            }

            /* JADX INFO: renamed from: c */
            public final void m30754c() {
                if (this.f28558i && this.f28552c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* JADX INFO: renamed from: d */
            public C14195a m30755d(boolean z10) {
                this.f28553d = z10;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public C14195a m30756e(boolean z10) {
                this.f28559j = z10;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public C14195a m30757f(boolean z10) {
                this.f28557h = z10;
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C14195a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.m2687e(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C14195a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7428t[] c7428tArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f28553d = true;
                this.f28557h = true;
                this.f28550a = iconCompat;
                this.f28551b = f.m30770e(charSequence);
                this.f28552c = pendingIntent;
                this.f28554e = bundle;
                this.f28555f = c7428tArr == null ? null : new ArrayList<>(Arrays.asList(c7428tArr));
                this.f28553d = z10;
                this.f28556g = i10;
                this.f28557h = z11;
                this.f28558i = z12;
                this.f28559j = z13;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.m2687e(null, "", i10) : null, charSequence, pendingIntent);
        }

        /* JADX INFO: renamed from: a */
        public PendingIntent m30742a() {
            return this.f28548k;
        }

        /* JADX INFO: renamed from: b */
        public boolean m30743b() {
            return this.f28542e;
        }

        /* JADX INFO: renamed from: c */
        public Bundle m30744c() {
            return this.f28538a;
        }

        /* JADX INFO: renamed from: d */
        public IconCompat m30745d() {
            int i10;
            if (this.f28539b == null && (i10 = this.f28546i) != 0) {
                this.f28539b = IconCompat.m2687e(null, "", i10);
            }
            return this.f28539b;
        }

        /* JADX INFO: renamed from: e */
        public C7428t[] m30746e() {
            return this.f28540c;
        }

        /* JADX INFO: renamed from: f */
        public int m30747f() {
            return this.f28544g;
        }

        /* JADX INFO: renamed from: g */
        public boolean m30748g() {
            return this.f28543f;
        }

        /* JADX INFO: renamed from: h */
        public CharSequence m30749h() {
            return this.f28547j;
        }

        /* JADX INFO: renamed from: i */
        public boolean m30750i() {
            return this.f28549l;
        }

        /* JADX INFO: renamed from: j */
        public boolean m30751j() {
            return this.f28545h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7428t[] c7428tArr, C7428t[] c7428tArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f28543f = true;
            this.f28539b = iconCompat;
            if (iconCompat != null && iconCompat.m2692i() == 2) {
                this.f28546i = iconCompat.m2690g();
            }
            this.f28547j = f.m30770e(charSequence);
            this.f28548k = pendingIntent;
            this.f28538a = bundle == null ? new Bundle() : bundle;
            this.f28540c = c7428tArr;
            this.f28541d = c7428tArr2;
            this.f28542e = z10;
            this.f28544g = i10;
            this.f28543f = z11;
            this.f28545h = z12;
            this.f28549l = z13;
        }
    }

    /* JADX INFO: renamed from: k2.k$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static String m30758a(Notification notification) {
            return notification.getGroup();
        }
    }

    /* JADX INFO: renamed from: k2.k$c */
    public static class c extends i {

        /* JADX INFO: renamed from: e */
        public IconCompat f28560e;

        /* JADX INFO: renamed from: f */
        public IconCompat f28561f;

        /* JADX INFO: renamed from: g */
        public boolean f28562g;

        /* JADX INFO: renamed from: h */
        public CharSequence f28563h;

        /* JADX INFO: renamed from: i */
        public boolean f28564i;

        /* JADX INFO: renamed from: k2.k$c$a */
        public static class a {
            /* JADX INFO: renamed from: a */
            public static void m30763a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: k2.k$c$b */
        public static class b {
            /* JADX INFO: renamed from: a */
            public static void m30764a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* JADX INFO: renamed from: b */
            public static void m30765b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* JADX INFO: renamed from: c */
            public static void m30766c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: b */
        public void mo30759b(InterfaceC7418j interfaceC7418j) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC7418j.mo30737a()).setBigContentTitle(this.f28627b);
            IconCompat iconCompat = this.f28560e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.m30764a(bigContentTitle, this.f28560e.m2699p(interfaceC7418j instanceof C7420l ? ((C7420l) interfaceC7418j).m30841f() : null));
                } else if (iconCompat.m2692i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f28560e.m2689f());
                }
            }
            if (this.f28562g) {
                if (this.f28561f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.m30763a(bigContentTitle, this.f28561f.m2699p(interfaceC7418j instanceof C7420l ? ((C7420l) interfaceC7418j).m30841f() : null));
                }
            }
            if (this.f28629d) {
                bigContentTitle.setSummaryText(this.f28628c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.m30766c(bigContentTitle, this.f28564i);
                b.m30765b(bigContentTitle, this.f28563h);
            }
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: c */
        public String mo30760c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* JADX INFO: renamed from: h */
        public c m30761h(Bitmap bitmap) {
            this.f28561f = bitmap == null ? null : IconCompat.m2685c(bitmap);
            this.f28562g = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public c m30762i(Bitmap bitmap) {
            this.f28560e = bitmap == null ? null : IconCompat.m2685c(bitmap);
            return this;
        }
    }

    /* JADX INFO: renamed from: k2.k$d */
    public static class d extends i {

        /* JADX INFO: renamed from: e */
        public CharSequence f28565e;

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: a */
        public void mo30767a(Bundle bundle) {
            super.mo30767a(bundle);
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: b */
        public void mo30759b(InterfaceC7418j interfaceC7418j) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC7418j.mo30737a()).setBigContentTitle(this.f28627b).bigText(this.f28565e);
            if (this.f28629d) {
                bigTextStyleBigText.setSummaryText(this.f28628c);
            }
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: c */
        public String mo30760c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* JADX INFO: renamed from: h */
        public d m30768h(CharSequence charSequence) {
            this.f28565e = f.m30770e(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: k2.k$e */
    public static final class e {
        /* JADX INFO: renamed from: a */
        public static Notification.BubbleMetadata m30769a(e eVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k2.k$g */
    public static class g extends i {

        /* JADX INFO: renamed from: e */
        public int f28615e;

        /* JADX INFO: renamed from: f */
        public C7426r f28616f;

        /* JADX INFO: renamed from: g */
        public PendingIntent f28617g;

        /* JADX INFO: renamed from: h */
        public PendingIntent f28618h;

        /* JADX INFO: renamed from: i */
        public PendingIntent f28619i;

        /* JADX INFO: renamed from: j */
        public boolean f28620j;

        /* JADX INFO: renamed from: k */
        public Integer f28621k;

        /* JADX INFO: renamed from: l */
        public Integer f28622l;

        /* JADX INFO: renamed from: m */
        public IconCompat f28623m;

        /* JADX INFO: renamed from: n */
        public CharSequence f28624n;

        /* JADX INFO: renamed from: k2.k$g$a */
        public static class a {
            /* JADX INFO: renamed from: a */
            public static Notification.Builder m30816a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            /* JADX INFO: renamed from: b */
            public static Notification.Builder m30817b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: renamed from: k2.k$g$b */
        public static class b {
            /* JADX INFO: renamed from: a */
            public static Parcelable m30818a(Icon icon) {
                return icon;
            }

            /* JADX INFO: renamed from: b */
            public static void m30819b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: k2.k$g$c */
        public static class c {
            /* JADX INFO: renamed from: a */
            public static Notification.Builder m30820a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            /* JADX INFO: renamed from: b */
            public static Parcelable m30821b(Person person) {
                return person;
            }
        }

        /* JADX INFO: renamed from: k2.k$g$d */
        public static class d {
            /* JADX INFO: renamed from: a */
            public static Notification.CallStyle m30822a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            /* JADX INFO: renamed from: b */
            public static Notification.CallStyle m30823b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            /* JADX INFO: renamed from: c */
            public static Notification.CallStyle m30824c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            /* JADX INFO: renamed from: d */
            public static Notification.CallStyle m30825d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            /* JADX INFO: renamed from: e */
            public static Notification.CallStyle m30826e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            /* JADX INFO: renamed from: f */
            public static Notification.CallStyle m30827f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            /* JADX INFO: renamed from: g */
            public static Notification.CallStyle m30828g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            /* JADX INFO: renamed from: h */
            public static Notification.CallStyle m30829h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public g() {
        }

        /* JADX INFO: renamed from: h */
        public static g m30807h(C7426r c7426r, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new g(1, c7426r, null, pendingIntent, pendingIntent2);
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: a */
        public void mo30767a(Bundle bundle) {
            super.mo30767a(bundle);
            bundle.putInt("android.callType", this.f28615e);
            bundle.putBoolean("android.callIsVideo", this.f28620j);
            C7426r c7426r = this.f28616f;
            if (c7426r != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.m30821b(c7426r.m30919i()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", c7426r.m30920j());
                }
            }
            IconCompat iconCompat = this.f28623m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.m30818a(iconCompat.m2699p(this.f28626a.f28589a)));
            }
            bundle.putCharSequence("android.verificationText", this.f28624n);
            bundle.putParcelable("android.answerIntent", this.f28617g);
            bundle.putParcelable("android.declineIntent", this.f28618h);
            bundle.putParcelable("android.hangUpIntent", this.f28619i);
            Integer num = this.f28621k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f28622l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: b */
        public void mo30759b(InterfaceC7418j interfaceC7418j) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceM30809j = null;
            callStyleM30822a = null;
            Notification.CallStyle callStyleM30822a = null;
            charSequenceM30809j = null;
            if (i10 < 31) {
                Notification.Builder builderMo30737a = interfaceC7418j.mo30737a();
                C7426r c7426r = this.f28616f;
                builderMo30737a.setContentTitle(c7426r != null ? c7426r.m30914d() : null);
                Bundle bundle = this.f28626a.f28570E;
                if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                    charSequenceM30809j = this.f28626a.f28570E.getCharSequence(NotificationCompat.EXTRA_TEXT);
                }
                if (charSequenceM30809j == null) {
                    charSequenceM30809j = m30809j();
                }
                builderMo30737a.setContentText(charSequenceM30809j);
                C7426r c7426r2 = this.f28616f;
                if (c7426r2 != null) {
                    if (c7426r2.m30912b() != null) {
                        b.m30819b(builderMo30737a, this.f28616f.m30912b().m2699p(this.f28626a.f28589a));
                    }
                    if (i10 >= 28) {
                        c.m30820a(builderMo30737a, this.f28616f.m30919i());
                    } else {
                        a.m30816a(builderMo30737a, this.f28616f.m30915e());
                    }
                }
                a.m30817b(builderMo30737a, NotificationCompat.CATEGORY_CALL);
                return;
            }
            int i11 = this.f28615e;
            if (i11 == 1) {
                callStyleM30822a = d.m30822a(this.f28616f.m30919i(), this.f28618h, this.f28617g);
            } else if (i11 == 2) {
                callStyleM30822a = d.m30823b(this.f28616f.m30919i(), this.f28619i);
            } else if (i11 == 3) {
                callStyleM30822a = d.m30824c(this.f28616f.m30919i(), this.f28619i, this.f28617g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f28615e));
            }
            if (callStyleM30822a != null) {
                callStyleM30822a.setBuilder(interfaceC7418j.mo30737a());
                Integer num = this.f28621k;
                if (num != null) {
                    d.m30825d(callStyleM30822a, num.intValue());
                }
                Integer num2 = this.f28622l;
                if (num2 != null) {
                    d.m30826e(callStyleM30822a, num2.intValue());
                }
                d.m30829h(callStyleM30822a, this.f28624n);
                IconCompat iconCompat = this.f28623m;
                if (iconCompat != null) {
                    d.m30828g(callStyleM30822a, iconCompat.m2699p(this.f28626a.f28589a));
                }
                d.m30827f(callStyleM30822a, this.f28620j);
            }
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: c */
        public String mo30760c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* JADX INFO: renamed from: i */
        public ArrayList<a> m30808i() {
            a aVarM30813n = m30813n();
            a aVarM30812m = m30812m();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM30813n);
            ArrayList<a> arrayList2 = this.f28626a.f28590b;
            int i10 = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    a aVar = arrayList2.get(i11);
                    i11++;
                    a aVar2 = aVar;
                    if (aVar2.m30751j()) {
                        arrayList.add(aVar2);
                    } else if (!m30810k(aVar2)) {
                        arrayList.add(aVar2);
                        i10--;
                    }
                    if (aVarM30812m != null && i10 == 1) {
                        arrayList.add(aVarM30812m);
                        i10--;
                    }
                }
            }
            if (aVarM30812m != null && i10 >= 1) {
                arrayList.add(aVarM30812m);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: j */
        public final String m30809j() {
            int i10 = this.f28615e;
            if (i10 == 1) {
                return this.f28626a.f28589a.getResources().getString(C7024f.f27533e);
            }
            if (i10 == 2) {
                return this.f28626a.f28589a.getResources().getString(C7024f.f27534f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f28626a.f28589a.getResources().getString(C7024f.f27535g);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m30810k(a aVar) {
            return aVar != null && aVar.m30744c().getBoolean("key_action_priority");
        }

        /* JADX INFO: renamed from: l */
        public final a m30811l(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C7975b.m33005c(this.f28626a.f28589a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f28626a.f28589a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarM30753b = new a.C14195a(IconCompat.m2686d(this.f28626a.f28589a, i10), spannableStringBuilder, pendingIntent).m30753b();
            aVarM30753b.m30744c().putBoolean("key_action_priority", true);
            return aVarM30753b;
        }

        /* JADX INFO: renamed from: m */
        public final a m30812m() {
            int i10 = C7022d.f27480b;
            int i11 = C7022d.f27479a;
            PendingIntent pendingIntent = this.f28617g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f28620j;
            return m30811l(z10 ? i10 : i11, z10 ? C7024f.f27530b : C7024f.f27529a, this.f28621k, C7020b.f27475a, pendingIntent);
        }

        /* JADX INFO: renamed from: n */
        public final a m30813n() {
            int i10 = C7022d.f27481c;
            PendingIntent pendingIntent = this.f28618h;
            return pendingIntent == null ? m30811l(i10, C7024f.f27532d, this.f28622l, C7020b.f27476b, this.f28619i) : m30811l(i10, C7024f.f27531c, this.f28622l, C7020b.f27476b, pendingIntent);
        }

        /* JADX INFO: renamed from: o */
        public g m30814o(int i10) {
            this.f28621k = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: renamed from: p */
        public g m30815p(int i10) {
            this.f28622l = Integer.valueOf(i10);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public g(int i10, C7426r c7426r, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (c7426r == null || TextUtils.isEmpty(c7426r.m30914d())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f28615e = i10;
            this.f28616f = c7426r;
            this.f28617g = pendingIntent3;
            this.f28618h = pendingIntent2;
            this.f28619i = pendingIntent;
        }
    }

    /* JADX INFO: renamed from: k2.k$h */
    public static class h extends i {

        /* JADX INFO: renamed from: e */
        public ArrayList<CharSequence> f28625e = new ArrayList<>();

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: b */
        public void mo30759b(InterfaceC7418j interfaceC7418j) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC7418j.mo30737a()).setBigContentTitle(this.f28627b);
            if (this.f28629d) {
                bigContentTitle.setSummaryText(this.f28628c);
            }
            ArrayList<CharSequence> arrayList = this.f28625e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                CharSequence charSequence = arrayList.get(i10);
                i10++;
                bigContentTitle.addLine(charSequence);
            }
        }

        @Override // p235k2.C7419k.i
        /* JADX INFO: renamed from: c */
        public String mo30760c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* JADX INFO: renamed from: h */
        public h m30830h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f28625e.add(f.m30770e(charSequence));
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public h m30831i(CharSequence charSequence) {
            this.f28627b = f.m30770e(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: k2.k$i */
    public static abstract class i {

        /* JADX INFO: renamed from: a */
        public f f28626a;

        /* JADX INFO: renamed from: b */
        public CharSequence f28627b;

        /* JADX INFO: renamed from: c */
        public CharSequence f28628c;

        /* JADX INFO: renamed from: d */
        public boolean f28629d = false;

        /* JADX INFO: renamed from: a */
        public void mo30767a(Bundle bundle) {
            if (this.f28629d) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f28628c);
            }
            CharSequence charSequence = this.f28627b;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String strMo30760c = mo30760c();
            if (strMo30760c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo30760c);
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo30759b(InterfaceC7418j interfaceC7418j);

        /* JADX INFO: renamed from: c */
        public abstract String mo30760c();

        /* JADX INFO: renamed from: d */
        public RemoteViews m30832d(InterfaceC7418j interfaceC7418j) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public RemoteViews m30833e(InterfaceC7418j interfaceC7418j) {
            return null;
        }

        /* JADX INFO: renamed from: f */
        public RemoteViews m30834f(InterfaceC7418j interfaceC7418j) {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public void m30835g(f fVar) {
            if (this.f28626a != fVar) {
                this.f28626a = fVar;
                if (fVar != null) {
                    fVar.m30772B(this);
                }
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static Bundle m30738a(Notification notification) {
        return notification.extras;
    }

    /* JADX INFO: renamed from: b */
    public static String m30739b(Notification notification) {
        return b.m30758a(notification);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m30740c(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m30741d(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7021c.f27478b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7021c.f27477a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: renamed from: k2.k$f */
    public static class f {

        /* JADX INFO: renamed from: A */
        public boolean f28566A;

        /* JADX INFO: renamed from: B */
        public boolean f28567B;

        /* JADX INFO: renamed from: C */
        public boolean f28568C;

        /* JADX INFO: renamed from: D */
        public String f28569D;

        /* JADX INFO: renamed from: E */
        public Bundle f28570E;

        /* JADX INFO: renamed from: F */
        public int f28571F;

        /* JADX INFO: renamed from: G */
        public int f28572G;

        /* JADX INFO: renamed from: H */
        public Notification f28573H;

        /* JADX INFO: renamed from: I */
        public RemoteViews f28574I;

        /* JADX INFO: renamed from: J */
        public RemoteViews f28575J;

        /* JADX INFO: renamed from: K */
        public RemoteViews f28576K;

        /* JADX INFO: renamed from: L */
        public String f28577L;

        /* JADX INFO: renamed from: M */
        public int f28578M;

        /* JADX INFO: renamed from: N */
        public String f28579N;

        /* JADX INFO: renamed from: O */
        public C7977d f28580O;

        /* JADX INFO: renamed from: P */
        public long f28581P;

        /* JADX INFO: renamed from: Q */
        public int f28582Q;

        /* JADX INFO: renamed from: R */
        public int f28583R;

        /* JADX INFO: renamed from: S */
        public boolean f28584S;

        /* JADX INFO: renamed from: T */
        public Notification f28585T;

        /* JADX INFO: renamed from: U */
        public boolean f28586U;

        /* JADX INFO: renamed from: V */
        public Object f28587V;

        /* JADX INFO: renamed from: W */
        @Deprecated
        public ArrayList<String> f28588W;

        /* JADX INFO: renamed from: a */
        public Context f28589a;

        /* JADX INFO: renamed from: b */
        public ArrayList<a> f28590b;

        /* JADX INFO: renamed from: c */
        public ArrayList<C7426r> f28591c;

        /* JADX INFO: renamed from: d */
        public ArrayList<a> f28592d;

        /* JADX INFO: renamed from: e */
        public CharSequence f28593e;

        /* JADX INFO: renamed from: f */
        public CharSequence f28594f;

        /* JADX INFO: renamed from: g */
        public String f28595g;

        /* JADX INFO: renamed from: h */
        public PendingIntent f28596h;

        /* JADX INFO: renamed from: i */
        public PendingIntent f28597i;

        /* JADX INFO: renamed from: j */
        public RemoteViews f28598j;

        /* JADX INFO: renamed from: k */
        public IconCompat f28599k;

        /* JADX INFO: renamed from: l */
        public CharSequence f28600l;

        /* JADX INFO: renamed from: m */
        public int f28601m;

        /* JADX INFO: renamed from: n */
        public int f28602n;

        /* JADX INFO: renamed from: o */
        public boolean f28603o;

        /* JADX INFO: renamed from: p */
        public boolean f28604p;

        /* JADX INFO: renamed from: q */
        public i f28605q;

        /* JADX INFO: renamed from: r */
        public CharSequence f28606r;

        /* JADX INFO: renamed from: s */
        public CharSequence f28607s;

        /* JADX INFO: renamed from: t */
        public CharSequence[] f28608t;

        /* JADX INFO: renamed from: u */
        public int f28609u;

        /* JADX INFO: renamed from: v */
        public int f28610v;

        /* JADX INFO: renamed from: w */
        public boolean f28611w;

        /* JADX INFO: renamed from: x */
        public String f28612x;

        /* JADX INFO: renamed from: y */
        public boolean f28613y;

        /* JADX INFO: renamed from: z */
        public String f28614z;

        /* JADX INFO: renamed from: k2.k$f$a */
        public static class a {
            /* JADX INFO: renamed from: a */
            public static AudioAttributes m30803a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* JADX INFO: renamed from: b */
            public static AudioAttributes.Builder m30804b() {
                return new AudioAttributes.Builder();
            }

            /* JADX INFO: renamed from: c */
            public static AudioAttributes.Builder m30805c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            /* JADX INFO: renamed from: d */
            public static AudioAttributes.Builder m30806d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f(Context context, String str) {
            this.f28590b = new ArrayList<>();
            this.f28591c = new ArrayList<>();
            this.f28592d = new ArrayList<>();
            this.f28603o = true;
            this.f28566A = false;
            this.f28571F = 0;
            this.f28572G = 0;
            this.f28578M = 0;
            this.f28582Q = 0;
            this.f28583R = 0;
            Notification notification = new Notification();
            this.f28585T = notification;
            this.f28589a = context;
            this.f28577L = str;
            notification.when = System.currentTimeMillis();
            this.f28585T.audioStreamType = -1;
            this.f28602n = 0;
            this.f28588W = new ArrayList<>();
            this.f28584S = true;
        }

        /* JADX INFO: renamed from: e */
        public static CharSequence m30770e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* JADX INFO: renamed from: A */
        public f m30771A(Uri uri) {
            Notification notification = this.f28585T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderM30806d = a.m30806d(a.m30805c(a.m30804b(), 4), 5);
            this.f28585T.audioAttributes = a.m30803a(builderM30806d);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public f m30772B(i iVar) {
            if (this.f28605q != iVar) {
                this.f28605q = iVar;
                if (iVar != null) {
                    iVar.m30835g(this);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: C */
        public f m30773C(CharSequence charSequence) {
            this.f28585T.tickerText = m30770e(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public f m30774D(long j10) {
            this.f28581P = j10;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public f m30775E(long[] jArr) {
            this.f28585T.vibrate = jArr;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public f m30776F(int i10) {
            this.f28572G = i10;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public f m30777G(long j10) {
            this.f28585T.when = j10;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public f m30778a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f28590b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public f m30779b(a aVar) {
            if (aVar != null) {
                this.f28590b.add(aVar);
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public Notification m30780c() {
            return new C7420l(this).m30839c();
        }

        /* JADX INFO: renamed from: d */
        public Bundle m30781d() {
            if (this.f28570E == null) {
                this.f28570E = new Bundle();
            }
            return this.f28570E;
        }

        /* JADX INFO: renamed from: f */
        public f m30782f(boolean z10) {
            m30791o(16, z10);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public f m30783g(String str) {
            this.f28577L = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public f m30784h(int i10) {
            this.f28571F = i10;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public f m30785i(RemoteViews remoteViews) {
            this.f28585T.contentView = remoteViews;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public f m30786j(PendingIntent pendingIntent) {
            this.f28596h = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public f m30787k(CharSequence charSequence) {
            this.f28594f = m30770e(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public f m30788l(CharSequence charSequence) {
            this.f28593e = m30770e(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public f m30789m(int i10) {
            Notification notification = this.f28585T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* JADX INFO: renamed from: n */
        public f m30790n(PendingIntent pendingIntent) {
            this.f28585T.deleteIntent = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public final void m30791o(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f28585T;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f28585T;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        /* JADX INFO: renamed from: p */
        public f m30792p(PendingIntent pendingIntent, boolean z10) {
            this.f28597i = pendingIntent;
            m30791o(128, z10);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public f m30793q(String str) {
            this.f28612x = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public f m30794r(boolean z10) {
            this.f28613y = z10;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public f m30795s(Bitmap bitmap) {
            this.f28599k = bitmap == null ? null : IconCompat.m2685c(C7419k.m30741d(this.f28589a, bitmap));
            return this;
        }

        /* JADX INFO: renamed from: t */
        public f m30796t(int i10, int i11, int i12) {
            Notification notification = this.f28585T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* JADX INFO: renamed from: u */
        public f m30797u(boolean z10) {
            this.f28566A = z10;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public f m30798v(int i10) {
            this.f28601m = i10;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public f m30799w(boolean z10) {
            m30791o(2, z10);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public f m30800x(int i10) {
            this.f28602n = i10;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public f m30801y(boolean z10) {
            this.f28603o = z10;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public f m30802z(int i10) {
            this.f28585T.icon = i10;
            return this;
        }

        @Deprecated
        public f(Context context) {
            this(context, null);
        }
    }
}
