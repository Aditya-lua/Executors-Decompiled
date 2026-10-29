/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52d08..0xb52fe4 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52d08_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    char padding_34[52];
    unsigned int field_68;
    char padding_6c[4];
    long long field_70;
    char padding_78[56];
    unsigned int field_b0;
    char padding_b4[20];
    unsigned long long field_c8;
} st_b52d08_0;


unsigned long long sub_b52d08(st_b52d08_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // w8
    unsigned long long v16;  // x0
    unsigned long long v17;  // w0
    long long v8;  // x1
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned int v13;  // w0
    long long v14;  // x24
    unsigned long long v15;  // x0
    long long v0;  // [bp-0x60]
    long long v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x4c]
    long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_a2f9e0();
    if (!(unsigned int)v6)
        return v6;
    if (a0->field_20)
    {
        switch (v7)
        {
        case 6:
            v13 = sub_a50ac8();
            v14 = v13 & ~((int)(v13) >> 31);
            if (v14 != a4)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 1083, "rsa_verify_directly");
                v0 = v14;
                v1 = a4;
                sub_a36abc(57, 166, "Should be %d, but got %d");
                return 0;
            }
            if (!a0->field_c8)
            {
                v15 = sub_a6bf4c(sub_aafbcc(a0->field_10), "providers/implementations/signature/rsa_sig.c", 614);
                a0->field_c8 = v15;
                if (!v15)
                    return v15;
            }
            if ((int)sub_aafc18(a2, a1) > 0)
            {
                v2 = a0->field_b0;
                if ((int)sub_ab8274(a0->field_10, a3, a0->field_20, a0->field_70, a0->field_c8, &v2) > 0)
                    return 1;
                sub_a368c8();
                v8 = 1103;
                break;
            }
            else
            {
                sub_a368c8();
                v8 = 1094;
                break;
            }
        case 5:
            if (!a0->field_c8)
            {
                v11 = sub_a6bf4c(sub_aafbcc(a0->field_10), "providers/implementations/signature/rsa_sig.c", 614);
                a0->field_c8 = v11;
                if (!v11)
                    return v11;
            }
            v12 = sub_b50434(a0);
            if (!(unsigned int)v12)
            {
                return v12;
            }
            else if (v3 == a4)
            {
                return !_memcmp(a3, a0->field_c8, a4);
            }
            else
            {
                return 0;
            }
        case 1:
            if (!sub_ab9840(a0->field_30, a3, a4, a1, a2, a0->field_10))
            {
                sub_a368c8();
                v8 = 1060;
                break;
            }
            else
            {
                return 1;
            }
        default:
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1113, "rsa_verify_directly");
            sub_a36abc(57, 168, "Only X.931, PKCS#1 v1.5 or PSS padding allowed");
            return 0;
        }
    }
    else
    {
        if (!a0->field_c8)
        {
            v16 = sub_a6bf4c(sub_aafbcc(a0->field_10), "providers/implementations/signature/rsa_sig.c", 614);
            a0->field_c8 = v16;
            if (!v16)
                return v16;
        }
        v17 = (unsigned int)sub_aafc18(a2, a1);
        if (v17 > 0)
        {
            if (v17 == a4)
                return !_memcmp(a3, a0->field_c8, a4);
            return 0;
        }
        sub_a368c8();
        v8 = 1125;
    }
    sub_a369bc("providers/implementations/signature/rsa_sig.c", v8, "rsa_verify_directly");
    sub_a36abc(57, 0x80004, 0);
    return 0;
}
