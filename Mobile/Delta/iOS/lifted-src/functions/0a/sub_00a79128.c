/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79128..0xa79254 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79128_0 {
    char padding_0[8];
    struct st_a79128_0 *field_8;
    unsigned int field_10;
    char padding_14[4];
    struct st_a79128_0 *field_18;
    char padding_20[8];
    struct st_a79128_0 *field_28;
    char padding_30[16];
    unsigned long long field_40;
    struct st_a79128_0 *field_48;
    char padding_50[112];
    struct st_a79128_0 *field_c0;
} st_a79128_0;

extern long long g_a78698;
extern long long g_a79078;

st_a79128_0 * sub_a79128(long long a0, unsigned long a1, long long a2)
{
    st_a79128_0 *v2;  // x19
    st_a79128_0 *v3;  // x0
    st_a79128_0 *v4;  // x0
    st_a79128_0 *v5;  // x0
    st_a79128_0 *v6;  // x0
    st_a79128_0 *v7;  // x0
    long long v9;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(232, "crypto/provider_core.c", 447);
    if (!v2)
        return v2;
    /* unsupported instruction */;
    v2->field_10 = 1;
    v3 = sub_a7c11c();
    v2->field_18 = v3;
    if (v3)
    {
        v4 = sub_a7c11c();
        v2->field_c0 = v4;
        if (v4 && !(v5 = sub_a7c11c(), v2->field_8 = v5, !v5 || (v6 = sub_ad606c(a2, &g_a79078, &g_a78698), v2->field_48 = v6, !v6)))
        {
            v7 = sub_a6d9b4(a0, "crypto/provider_core.c", 469);
            v2->field_28 = v7;
            if (v7)
            {
                v2->field_40 = a1;
                return v2;
            }
            sub_a78ccc(v2);
        }
        else
        {
            sub_a368c8(sub_a78ccc(v2));
            v9 = 466;
LABEL_a79218:
            sub_a369bc("crypto/provider_core.c", v9, "provider_new");
            sub_a36abc(15, 0x8000f, 0);
        }
        return 0;
    }
    sub_a368c8(sub_a78ccc(v2));
    v9 = 455;
    goto LABEL_a79218;
}
