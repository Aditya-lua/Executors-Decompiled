package androidx.core.text.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.PatternsCompat;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkifyCompat {
    private static final String[] EMPTY_STRING = new String[0];
    private static final Comparator<LinkSpec> COMPARATOR = new Comparator<LinkSpec>() { // from class: androidx.core.text.util.LinkifyCompat.1
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        public int compare(LinkSpec a10, LinkSpec b) {
            int i10;
            int i11;
            int i12 = a10.start;
            int i13 = b.start;
            if (i12 < i13) {
                return -1;
            }
            if (i12 <= i13 && (i10 = a10.end) >= (i11 = b.end)) {
                return i10 > i11 ? -1 : 0;
            }
            return 1;
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LinkifyMask {
    }

    public static boolean addLinks(@NonNull Spannable text, int mask) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(text, mask);
        }
        if (mask == 0) {
            return false;
        }
        URLSpan[] old = (URLSpan[]) text.getSpans(0, text.length(), URLSpan.class);
        for (int i10 = old.length - 1; i10 >= 0; i10--) {
            text.removeSpan(old[i10]);
        }
        int i11 = mask & 4;
        if (i11 != 0) {
            Linkify.addLinks(text, 4);
        }
        ArrayList<LinkSpec> links = new ArrayList<>();
        if ((mask & 1) != 0) {
            gatherLinks(links, text, PatternsCompat.AUTOLINK_WEB_URL, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((mask & 2) != 0) {
            gatherLinks(links, text, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[]{"mailto:"}, null, null);
        }
        if ((mask & 8) != 0) {
            gatherMapLinks(links, text);
        }
        pruneOverlaps(links, text);
        if (links.size() == 0) {
            return false;
        }
        for (LinkSpec link : links) {
            if (link.frameworkAddedSpan == null) {
                applyLink(link.url, link.start, link.end, text);
            }
        }
        return true;
    }

    public static boolean addLinks(@NonNull TextView text, int mask) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(text, mask);
        }
        if (mask == 0) {
            return false;
        }
        CharSequence t8 = text.getText();
        if (t8 instanceof Spannable) {
            if (!addLinks((Spannable) t8, mask)) {
                return false;
            }
            addLinkMovementMethod(text);
            return true;
        }
        SpannableString s8 = SpannableString.valueOf(t8);
        if (!addLinks(s8, mask)) {
            return false;
        }
        addLinkMovementMethod(text);
        text.setText(s8);
        return true;
    }

    public static void addLinks(@NonNull TextView text, @NonNull Pattern pattern, @Nullable String scheme) {
        if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(text, pattern, scheme);
        } else {
            addLinks(text, pattern, scheme, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    public static void addLinks(@NonNull TextView text, @NonNull Pattern pattern, @Nullable String scheme, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(text, pattern, scheme, matchFilter, transformFilter);
        } else {
            addLinks(text, pattern, scheme, (String[]) null, matchFilter, transformFilter);
        }
    }

    @SuppressLint({"NewApi"})
    public static void addLinks(@NonNull TextView text, @NonNull Pattern pattern, @Nullable String defaultScheme, @Nullable String[] schemes, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(text, pattern, defaultScheme, schemes, matchFilter, transformFilter);
            return;
        }
        SpannableString spannable = SpannableString.valueOf(text.getText());
        boolean linksAdded = addLinks(spannable, pattern, defaultScheme, schemes, matchFilter, transformFilter);
        if (linksAdded) {
            text.setText(spannable);
            addLinkMovementMethod(text);
        }
    }

    public static boolean addLinks(@NonNull Spannable text, @NonNull Pattern pattern, @Nullable String scheme) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(text, pattern, scheme);
        }
        return addLinks(text, pattern, scheme, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    public static boolean addLinks(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String scheme, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, pattern, scheme, matchFilter, transformFilter);
        }
        return addLinks(spannable, pattern, scheme, (String[]) null, matchFilter, transformFilter);
    }

    @SuppressLint({"NewApi"})
    public static boolean addLinks(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String defaultScheme, @Nullable String[] schemes, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, pattern, defaultScheme, schemes, matchFilter, transformFilter);
        }
        if (defaultScheme == null) {
            defaultScheme = "";
        }
        if (schemes == null || schemes.length < 1) {
            schemes = EMPTY_STRING;
        }
        String[] schemesCopy = new String[schemes.length + 1];
        schemesCopy[0] = defaultScheme.toLowerCase(Locale.ROOT);
        for (int index = 0; index < schemes.length; index++) {
            String scheme = schemes[index];
            schemesCopy[index + 1] = scheme == null ? "" : scheme.toLowerCase(Locale.ROOT);
        }
        boolean hasMatches = false;
        Matcher m10 = pattern.matcher(spannable);
        while (m10.find()) {
            int start = m10.start();
            int end = m10.end();
            boolean allowed = true;
            if (matchFilter != null) {
                allowed = matchFilter.acceptMatch(spannable, start, end);
            }
            if (allowed) {
                String url = makeUrl(m10.group(0), schemesCopy, m10, transformFilter);
                applyLink(url, start, end, spannable);
                hasMatches = true;
            }
        }
        return hasMatches;
    }

    private static boolean shouldAddLinksFallbackToFramework() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private static void addLinkMovementMethod(@NonNull TextView t8) {
        MovementMethod m10 = t8.getMovementMethod();
        if ((m10 == null || !(m10 instanceof LinkMovementMethod)) && t8.getLinksClickable()) {
            t8.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private static String makeUrl(@NonNull String url, @NonNull String[] prefixes, Matcher matcher, @Nullable Linkify.TransformFilter filter) {
        if (filter != null) {
            url = filter.transformUrl(matcher, url);
        }
        boolean hasPrefix = false;
        for (int i10 = 0; i10 < prefixes.length; i10++) {
            if (url.regionMatches(true, 0, prefixes[i10], 0, prefixes[i10].length())) {
                hasPrefix = true;
                if (!url.regionMatches(false, 0, prefixes[i10], 0, prefixes[i10].length())) {
                    url = prefixes[i10] + url.substring(prefixes[i10].length());
                    break;
                }
                break;
            }
        }
        if (!hasPrefix && prefixes.length > 0) {
            return prefixes[0] + url;
        }
        return url;
    }

    private static void gatherLinks(ArrayList<LinkSpec> links, Spannable s8, Pattern pattern, String[] schemes, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher m10 = pattern.matcher(s8);
        while (m10.find()) {
            int start = m10.start();
            int end = m10.end();
            if (matchFilter == null || matchFilter.acceptMatch(s8, start, end)) {
                LinkSpec spec = new LinkSpec();
                String url = makeUrl(m10.group(0), schemes, m10, transformFilter);
                spec.url = url;
                spec.start = start;
                spec.end = end;
                links.add(spec);
            }
        }
    }

    private static void applyLink(String url, int start, int end, Spannable text) {
        URLSpan span = new URLSpan(url);
        text.setSpan(span, start, end, 33);
    }

    private static void gatherMapLinks(ArrayList<LinkSpec> links, Spannable s8) {
        int start;
        String string = s8.toString();
        int base = 0;
        while (true) {
            try {
                String address = findAddress(string);
                if (address != null && (start = string.indexOf(address)) >= 0) {
                    LinkSpec spec = new LinkSpec();
                    int length = address.length();
                    int end = start + length;
                    spec.start = base + start;
                    spec.end = base + end;
                    string = string.substring(end);
                    base += end;
                    try {
                        String encodedAddress = URLEncoder.encode(address, "UTF-8");
                        spec.url = "geo:0,0?q=" + encodedAddress;
                        links.add(spec);
                    } catch (UnsupportedEncodingException e10) {
                    }
                }
                return;
            } catch (UnsupportedOperationException e11) {
                return;
            }
        }
    }

    private static String findAddress(String addr) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(addr);
        }
        return FindAddress.findAddress(addr);
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> links, Spannable text) {
        int i10;
        URLSpan[] urlSpans = (URLSpan[]) text.getSpans(0, text.length(), URLSpan.class);
        for (int i11 = 0; i11 < urlSpans.length; i11++) {
            LinkSpec spec = new LinkSpec();
            spec.frameworkAddedSpan = urlSpans[i11];
            spec.start = text.getSpanStart(urlSpans[i11]);
            spec.end = text.getSpanEnd(urlSpans[i11]);
            links.add(spec);
        }
        Collections.sort(links, COMPARATOR);
        int len = links.size();
        int i12 = 0;
        while (i12 < len - 1) {
            LinkSpec a10 = links.get(i12);
            LinkSpec b = links.get(i12 + 1);
            int remove = -1;
            int i13 = a10.start;
            int i14 = b.start;
            if (i13 <= i14 && (i10 = a10.end) > i14) {
                int i15 = b.end;
                if (i15 <= i10 || i10 - i13 > i15 - i14) {
                    remove = i12 + 1;
                } else if (i10 - i13 < i15 - i14) {
                    remove = i12;
                }
                if (remove != -1) {
                    URLSpan span = links.get(remove).frameworkAddedSpan;
                    if (span != null) {
                        text.removeSpan(span);
                    }
                    links.remove(remove);
                    len--;
                }
            }
            i12++;
        }
    }

    private LinkifyCompat() {
    }

    private static class LinkSpec {
        int end;
        URLSpan frameworkAddedSpan;
        int start;
        String url;

        LinkSpec() {
        }
    }
}
