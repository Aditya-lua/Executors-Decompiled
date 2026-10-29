package p100eb;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* JADX INFO: renamed from: eb.f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4929f4 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC4923e4 m23593a(InputStream inputStream, C4941h4 c4941h4) {
        try {
            return m23594b(inputStream, c4941h4);
        } finally {
            try {
                c4941h4.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC4923e4 m23594b(InputStream inputStream, C4941h4 c4941h4) throws C5042y3 {
        try {
            C4935g4 c4935g4M23621d = c4941h4.m23621d();
            if (c4935g4M23621d == null) {
                throw new C5042y3("Parser being asked to parse an empty input stream");
            }
            try {
                byte bM23603a = c4935g4M23621d.m23603a();
                byte bM23604b = c4935g4M23621d.m23604b();
                int i10 = 0;
                if (bM23604b == -128) {
                    long jM23618a = c4941h4.m23618a();
                    if (jM23618a > 1000) {
                        throw new C5042y3("Parser being asked to read a large CBOR array");
                    }
                    m23595c(bM23603a, jM23618a, inputStream, c4941h4);
                    AbstractC4923e4[] abstractC4923e4Arr = new AbstractC4923e4[(int) jM23618a];
                    while (i10 < jM23618a) {
                        abstractC4923e4Arr[i10] = m23594b(inputStream, c4941h4);
                        i10++;
                    }
                    return new C5024v3(AbstractC4920e1.m23572i(abstractC4923e4Arr));
                }
                if (bM23604b != -96) {
                    if (bM23604b == -64) {
                        throw new C5042y3("Tags are currently unsupported");
                    }
                    if (bM23604b == -32) {
                        return new C5030w3(c4941h4.m23623f());
                    }
                    if (bM23604b == 0 || bM23604b == 32) {
                        long jM23619b = c4941h4.m23619b();
                        m23595c(bM23603a, jM23619b > 0 ? jM23619b : ~jM23619b, inputStream, c4941h4);
                        return new C5047z3(jM23619b);
                    }
                    if (bM23604b == 64) {
                        byte[] bArrM23624g = c4941h4.m23624g();
                        int length = bArrM23624g.length;
                        m23595c(bM23603a, length, inputStream, c4941h4);
                        return new C5036x3(AbstractC4970m3.m23673m(bArrM23624g, 0, length));
                    }
                    if (bM23604b == 96) {
                        String strM23622e = c4941h4.m23622e();
                        m23595c(bM23603a, strM23622e.length(), inputStream, c4941h4);
                        return new C4911c4(strM23622e);
                    }
                    throw new C5042y3("Unidentifiable major type: " + c4935g4M23621d.m23605c());
                }
                long jM23620c = c4941h4.m23620c();
                if (jM23620c > 1000) {
                    throw new C5042y3("Parser being asked to read a large CBOR map");
                }
                m23595c(bM23603a, jM23620c, inputStream, c4941h4);
                int i11 = (int) jM23620c;
                C4899a4[] c4899a4Arr = new C4899a4[i11];
                AbstractC4923e4 abstractC4923e4 = null;
                int i12 = 0;
                while (i12 < jM23620c) {
                    AbstractC4923e4 abstractC4923e4M23594b = m23594b(inputStream, c4941h4);
                    if (abstractC4923e4 != null && abstractC4923e4M23594b.compareTo(abstractC4923e4) <= 0) {
                        throw new C5018u3(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", abstractC4923e4.toString(), abstractC4923e4M23594b.toString()));
                    }
                    c4899a4Arr[i12] = new C4899a4(abstractC4923e4M23594b, m23594b(inputStream, c4941h4));
                    i12++;
                    abstractC4923e4 = abstractC4923e4M23594b;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    C4899a4 c4899a4 = c4899a4Arr[i10];
                    if (treeMap.containsKey(c4899a4.m23549a())) {
                        throw new C5018u3("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(c4899a4.m23549a(), c4899a4.m23550b());
                    i10++;
                }
                return new C4905b4(C4962l1.m23653e(treeMap));
            } catch (IOException e10) {
                e = e10;
                throw new C5042y3("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e11) {
                e = e11;
                throw new C5042y3("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e12) {
            throw new C5042y3("Error in decoding CborValue from bytes", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m23595c(byte b, long j10, InputStream inputStream, C4941h4 c4941h4) throws C5018u3 {
        switch (b) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new C5018u3("Integer value " + j10 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j10 >= 256) {
                    return;
                }
                throw new C5018u3("Integer value " + j10 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j10 >= 65536) {
                    return;
                }
                throw new C5018u3("Integer value " + j10 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j10 >= 4294967296L) {
                    return;
                }
                throw new C5018u3("Integer value " + j10 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
