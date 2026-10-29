package eb;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class f4 {
    public static final e4 a(InputStream inputStream, h4 h4Var) {
        try {
            return b(inputStream, h4Var);
        } finally {
            try {
                h4Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final e4 b(InputStream inputStream, h4 h4Var) throws y3 {
        try {
            g4 g4VarD = h4Var.d();
            if (g4VarD == null) {
                throw new y3("Parser being asked to parse an empty input stream");
            }
            try {
                byte bA = g4VarD.a();
                byte b = g4VarD.b();
                int i10 = 0;
                if (b == -128) {
                    long jA = h4Var.a();
                    if (jA > 1000) {
                        throw new y3("Parser being asked to read a large CBOR array");
                    }
                    c(bA, jA, inputStream, h4Var);
                    e4[] e4VarArr = new e4[(int) jA];
                    while (i10 < jA) {
                        e4VarArr[i10] = b(inputStream, h4Var);
                        i10++;
                    }
                    return new v3(e1.i(e4VarArr));
                }
                if (b != -96) {
                    if (b == -64) {
                        throw new y3("Tags are currently unsupported");
                    }
                    if (b == -32) {
                        return new w3(h4Var.f());
                    }
                    if (b == 0 || b == 32) {
                        long jB = h4Var.b();
                        c(bA, jB > 0 ? jB : ~jB, inputStream, h4Var);
                        return new z3(jB);
                    }
                    if (b == 64) {
                        byte[] bArrG = h4Var.g();
                        int length = bArrG.length;
                        c(bA, length, inputStream, h4Var);
                        return new x3(m3.m(bArrG, 0, length));
                    }
                    if (b == 96) {
                        String strE = h4Var.e();
                        c(bA, strE.length(), inputStream, h4Var);
                        return new c4(strE);
                    }
                    throw new y3("Unidentifiable major type: " + g4VarD.c());
                }
                long jC = h4Var.c();
                if (jC > 1000) {
                    throw new y3("Parser being asked to read a large CBOR map");
                }
                c(bA, jC, inputStream, h4Var);
                int i11 = (int) jC;
                a4[] a4VarArr = new a4[i11];
                e4 e4Var = null;
                int i12 = 0;
                while (i12 < jC) {
                    e4 e4VarB = b(inputStream, h4Var);
                    if (e4Var != null && e4VarB.compareTo(e4Var) <= 0) {
                        throw new u3(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", e4Var.toString(), e4VarB.toString()));
                    }
                    a4VarArr[i12] = new a4(e4VarB, b(inputStream, h4Var));
                    i12++;
                    e4Var = e4VarB;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    a4 a4Var = a4VarArr[i10];
                    if (treeMap.containsKey(a4Var.a())) {
                        throw new u3("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(a4Var.a(), a4Var.b());
                    i10++;
                }
                return new b4(l1.e(treeMap));
            } catch (IOException e10) {
                e = e10;
                throw new y3("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e11) {
                e = e11;
                throw new y3("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e12) {
            throw new y3("Error in decoding CborValue from bytes", e12);
        }
    }

    public static final void c(byte b, long j10, InputStream inputStream, h4 h4Var) throws u3 {
        switch (b) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j10 >= 256) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j10 >= 65536) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j10 >= 4294967296L) {
                    return;
                }
                throw new u3("Integer value " + j10 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
