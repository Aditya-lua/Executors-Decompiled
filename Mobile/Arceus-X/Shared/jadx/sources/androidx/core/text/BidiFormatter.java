package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    static final BidiFormatter DEFAULT_LTR_INSTANCE;
    static final BidiFormatter DEFAULT_RTL_INSTANCE;
    static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristicCompat;
        LRM_STRING = Character.toString(LRM);
        RLM_STRING = Character.toString(RLM);
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        public Builder(boolean rtlContext) {
            initialize(rtlContext);
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.isRtlLocale(locale));
        }

        private void initialize(boolean isRtlContext) {
            this.mIsRtlContext = isRtlContext;
            this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public Builder stereoReset(boolean stereoReset) {
            if (stereoReset) {
                this.mFlags |= 2;
            } else {
                this.mFlags &= -3;
            }
            return this;
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat heuristic) {
            this.mTextDirectionHeuristicCompat = heuristic;
            return this;
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean isRtlContext) {
            return isRtlContext ? BidiFormatter.DEFAULT_RTL_INSTANCE : BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        public BidiFormatter build() {
            if (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) {
                return getDefaultInstanceFromContext(this.mIsRtlContext);
            }
            return new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public static BidiFormatter getInstance(boolean rtlContext) {
        return new Builder(rtlContext).build();
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    BidiFormatter(boolean isRtlContext, int flags, TextDirectionHeuristicCompat heuristic) {
        this.mIsRtlContext = isRtlContext;
        this.mFlags = flags;
        this.mDefaultTextDirectionHeuristicCompat = heuristic;
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    private String markAfter(CharSequence str, TextDirectionHeuristicCompat heuristic) {
        boolean isRtl = heuristic.isRtl(str, 0, str.length());
        if (!this.mIsRtlContext && (isRtl || getExitDir(str) == 1)) {
            return LRM_STRING;
        }
        if (!this.mIsRtlContext) {
            return "";
        }
        if (!isRtl || getExitDir(str) == -1) {
            return RLM_STRING;
        }
        return "";
    }

    private String markBefore(CharSequence str, TextDirectionHeuristicCompat heuristic) {
        boolean isRtl = heuristic.isRtl(str, 0, str.length());
        if (!this.mIsRtlContext && (isRtl || getEntryDir(str) == 1)) {
            return LRM_STRING;
        }
        if (!this.mIsRtlContext) {
            return "";
        }
        if (!isRtl || getEntryDir(str) == -1) {
            return RLM_STRING;
        }
        return "";
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtl(CharSequence str) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(str, 0, str.length());
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat heuristic, boolean isolate) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, heuristic, isolate).toString();
    }

    public CharSequence unicodeWrap(CharSequence str, TextDirectionHeuristicCompat heuristic, boolean isolate) {
        if (str == null) {
            return null;
        }
        boolean isRtl = heuristic.isRtl(str, 0, str.length());
        SpannableStringBuilder result = new SpannableStringBuilder();
        if (getStereoReset() && isolate) {
            result.append((CharSequence) markBefore(str, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        if (isRtl != this.mIsRtlContext) {
            result.append(isRtl ? RLE : LRE);
            result.append(str);
            result.append(PDF);
        } else {
            result.append(str);
        }
        if (isolate) {
            result.append((CharSequence) markAfter(str, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        return result;
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat heuristic) {
        return unicodeWrap(str, heuristic, true);
    }

    public CharSequence unicodeWrap(CharSequence str, TextDirectionHeuristicCompat heuristic) {
        return unicodeWrap(str, heuristic, true);
    }

    public String unicodeWrap(String str, boolean isolate) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, isolate);
    }

    public CharSequence unicodeWrap(CharSequence str, boolean isolate) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, isolate);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    static boolean isRtlLocale(Locale locale) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private static int getExitDir(CharSequence str) {
        return new DirectionalityEstimator(str, false).getExitDir();
    }

    private static int getEntryDir(CharSequence str) {
        return new DirectionalityEstimator(str, false).getEntryDir();
    }

    private static class DirectionalityEstimator {
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final CharSequence text;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];

        static {
            for (int i10 = 0; i10 < DIR_TYPE_CACHE_SIZE; i10++) {
                DIR_TYPE_CACHE[i10] = Character.getDirectionality(i10);
            }
        }

        DirectionalityEstimator(CharSequence text, boolean isHtml) {
            this.text = text;
            this.isHtml = isHtml;
            this.length = text.length();
        }

        int getEntryDir() {
            this.charIndex = 0;
            int embeddingLevel = 0;
            int embeddingLevelDir = 0;
            int firstNonEmptyEmbeddingLevel = 0;
            while (this.charIndex < this.length && firstNonEmptyEmbeddingLevel == 0) {
                switch (dirTypeForward()) {
                    case 0:
                        if (embeddingLevel == 0) {
                            return -1;
                        }
                        firstNonEmptyEmbeddingLevel = embeddingLevel;
                        break;
                    case 1:
                    case 2:
                        if (embeddingLevel == 0) {
                            return 1;
                        }
                        firstNonEmptyEmbeddingLevel = embeddingLevel;
                        break;
                    case 9:
                        break;
                    case 14:
                    case 15:
                        embeddingLevel++;
                        embeddingLevelDir = -1;
                        break;
                    case 16:
                    case 17:
                        embeddingLevel++;
                        embeddingLevelDir = 1;
                        break;
                    case 18:
                        embeddingLevel--;
                        embeddingLevelDir = 0;
                        break;
                    default:
                        firstNonEmptyEmbeddingLevel = embeddingLevel;
                        break;
                }
            }
            if (firstNonEmptyEmbeddingLevel == 0) {
                return 0;
            }
            if (embeddingLevelDir != 0) {
                return embeddingLevelDir;
            }
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (firstNonEmptyEmbeddingLevel == embeddingLevel) {
                            return -1;
                        }
                        embeddingLevel--;
                        break;
                    case 16:
                    case 17:
                        if (firstNonEmptyEmbeddingLevel == embeddingLevel) {
                            return 1;
                        }
                        embeddingLevel--;
                        break;
                    case 18:
                        embeddingLevel++;
                        break;
                }
            }
            return 0;
        }

        int getExitDir() {
            this.charIndex = this.length;
            int embeddingLevel = 0;
            int lastNonEmptyEmbeddingLevel = 0;
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 0:
                        if (embeddingLevel == 0) {
                            return -1;
                        }
                        if (lastNonEmptyEmbeddingLevel == 0) {
                            lastNonEmptyEmbeddingLevel = embeddingLevel;
                        }
                        break;
                    case 1:
                    case 2:
                        if (embeddingLevel == 0) {
                            return 1;
                        }
                        if (lastNonEmptyEmbeddingLevel == 0) {
                            lastNonEmptyEmbeddingLevel = embeddingLevel;
                        }
                        break;
                    case 9:
                        break;
                    case 14:
                    case 15:
                        if (lastNonEmptyEmbeddingLevel == embeddingLevel) {
                            return -1;
                        }
                        embeddingLevel--;
                        break;
                    case 16:
                    case 17:
                        if (lastNonEmptyEmbeddingLevel == embeddingLevel) {
                            return 1;
                        }
                        embeddingLevel--;
                        break;
                    case 18:
                        embeddingLevel++;
                        break;
                    default:
                        if (lastNonEmptyEmbeddingLevel == 0) {
                            lastNonEmptyEmbeddingLevel = embeddingLevel;
                        }
                        break;
                }
            }
            return 0;
        }

        private static byte getCachedDirectionality(char c10) {
            return c10 < DIR_TYPE_CACHE_SIZE ? DIR_TYPE_CACHE[c10] : Character.getDirectionality(c10);
        }

        byte dirTypeForward() {
            char cCharAt = this.text.charAt(this.charIndex);
            this.lastChar = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int codePoint = Character.codePointAt(this.text, this.charIndex);
                this.charIndex += Character.charCount(codePoint);
                return Character.getDirectionality(codePoint);
            }
            this.charIndex++;
            byte dirType = getCachedDirectionality(this.lastChar);
            if (this.isHtml) {
                char c10 = this.lastChar;
                if (c10 == '<') {
                    return skipTagForward();
                }
                if (c10 == '&') {
                    return skipEntityForward();
                }
                return dirType;
            }
            return dirType;
        }

        byte dirTypeBackward() {
            char cCharAt = this.text.charAt(this.charIndex - 1);
            this.lastChar = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int codePoint = Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= Character.charCount(codePoint);
                return Character.getDirectionality(codePoint);
            }
            this.charIndex--;
            byte dirType = getCachedDirectionality(this.lastChar);
            if (this.isHtml) {
                char c10 = this.lastChar;
                if (c10 == '>') {
                    return skipTagBackward();
                }
                if (c10 == ';') {
                    return skipEntityBackward();
                }
                return dirType;
            }
            return dirType;
        }

        private byte skipTagForward() {
            char cCharAt;
            int initialCharIndex = this.charIndex;
            while (true) {
                int i10 = this.charIndex;
                if (i10 < this.length) {
                    CharSequence charSequence = this.text;
                    this.charIndex = i10 + 1;
                    char cCharAt2 = charSequence.charAt(i10);
                    this.lastChar = cCharAt2;
                    if (cCharAt2 == '>') {
                        return (byte) 12;
                    }
                    if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                        char quote = this.lastChar;
                        do {
                            int i11 = this.charIndex;
                            if (i11 >= this.length) {
                                break;
                            }
                            CharSequence charSequence2 = this.text;
                            this.charIndex = i11 + 1;
                            cCharAt = charSequence2.charAt(i11);
                            this.lastChar = cCharAt;
                        } while (cCharAt != quote);
                    }
                } else {
                    this.charIndex = initialCharIndex;
                    this.lastChar = '<';
                    return (byte) 13;
                }
            }
        }

        private byte skipTagBackward() {
            char cCharAt;
            int initialCharIndex = this.charIndex;
            while (true) {
                int i10 = this.charIndex;
                if (i10 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i11 = i10 - 1;
                this.charIndex = i11;
                char cCharAt2 = charSequence.charAt(i11);
                this.lastChar = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    char quote = this.lastChar;
                    do {
                        int i12 = this.charIndex;
                        if (i12 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.text;
                        int i13 = i12 - 1;
                        this.charIndex = i13;
                        cCharAt = charSequence2.charAt(i13);
                        this.lastChar = cCharAt;
                    } while (cCharAt != quote);
                }
            }
            this.charIndex = initialCharIndex;
            this.lastChar = '>';
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char cCharAt;
            do {
                int i10 = this.charIndex;
                if (i10 >= this.length) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.lastChar = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte skipEntityBackward() {
            char cCharAt;
            int initialCharIndex = this.charIndex;
            do {
                int i10 = this.charIndex;
                if (i10 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i11 = i10 - 1;
                this.charIndex = i11;
                cCharAt = charSequence.charAt(i11);
                this.lastChar = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.charIndex = initialCharIndex;
            this.lastChar = ';';
            return (byte) 13;
        }
    }
}
