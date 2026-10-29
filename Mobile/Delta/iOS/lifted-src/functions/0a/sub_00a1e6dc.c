/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1e6dc..0xa1e7f4 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1e6dc_1 {
    char padding_0[136];
    long long field_88;
    long long field_90;
    struct st_a1e6dc_0 *field_98;
} st_a1e6dc_1;

typedef struct st_a1e6dc_0 {
    char padding_0[16];
    long long field_10;
} st_a1e6dc_0;


long long sub_a1e6dc(st_a1e6dc_1 *a0, long long a1, long long *a2)
{
    long long v2;  // x21
    long long v3;  // x0
    long long v4;  // w0
    unsigned long v5;  // x8
    long long v6;  // x0
    unsigned int v7;  // w0
    unsigned long long v8;  // 4132
    unsigned long v9;  // x8
    long long v10;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_88 && a0->field_90)
    {
        if (sub_a59bc4(a0->field_90))
        {
            v2 = a0->field_98->field_10;
            if (v2)
            {
                if (!a1)
                    goto LABEL_a1e7c8;
LABEL_a1e724:
                v3 = sub_975ff4();
                v4 = (unsigned int)sub_a19e9c(a1, *a2, v3, v2, 0);
                if (v4 < 1)
                    return 0;
                v5 = v4;
            }
            else
            {
                v2 = sub_a59bc4(a0->field_88);
                if (a1)
                    goto LABEL_a1e724;
LABEL_a1e7c8:
                v6 = sub_9ffdd0(v2);
                if (!v6)
                    return v6;
                v7 = sub_a1ad1c();
                v8 = arm64g_calculate_condition(177, v7, 7, 0);
                v9 = (v8 & 1 ? v7 + 14 : v7 + 7);
                v5 = (long long)(v9 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v9, 61) & 0xe00000001fffffff & 0x1fffffff;
            }
            *a2 = v5;
            return 1;
        }
        sub_a368c8();
        v10 = 181;
    }
    else
    {
        sub_a368c8();
        v10 = 176;
    }
    sub_a369bc("crypto/ec/ec_pmeth.c", v10, "pkey_ec_derive");
    sub_a36abc(16, 140, 0);
    return 0;
}
