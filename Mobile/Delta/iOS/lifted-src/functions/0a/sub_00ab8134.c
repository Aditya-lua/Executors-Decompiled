/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8134..0xab8250 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8134_1 {
    char padding_0[120];
    struct st_ab8134_2 *field_78;
    char padding_80[8];
    long long field_88;
    char padding_90[8];
    struct st_ab8134_0 *field_98;
} st_ab8134_1;

typedef struct st_ab8134_2 {
    unsigned int field_0;
} st_ab8134_2;

typedef struct st_ab8134_0 {
    char padding_0[32];
    long long field_20;
    unsigned long long field_28;
    int field_30;
    int field_34;
} st_ab8134_0;


long long sub_ab8134(st_ab8134_1 *a0)
{
    st_ab8134_0 *v5;  // x21
    void* v6;  // x19
    unsigned long v7;  // x0
    unsigned int v8;  // w0
    unsigned int v9;  // w20
    long long v10;  // x1
    int v0;  // [bp-0x44]
    char v1;  // [bp-0x40], Other Possible Types: unsigned long
    long long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (*(int *)a0->field_78 != 912)
        return 0;
    v5 = a0->field_98;
    v6 = sub_a59af4(a0->field_88);
    if (!(long long)v6[128])
        return 1;
    v7 = sub_aaca2c((long long)v6[128], &v2, &v1, &v0);
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_a50ac8(v2);
    if ((int)v8 > 0)
    {
        v9 = sub_aafbcc(v6) - v8;
        if (v0 <= (int)(v9 - ((sub_aafbc4(v6) & 7) == 1)))
        {
            v5->field_20 = v2;
            v5->field_28 = v1;
            v5->field_30 = v0;
            v5->field_34 = v0;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pmeth.c", 890, "pkey_pss_init");
        v10 = 150;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pmeth.c", 883, "pkey_pss_init");
        v10 = 143;
    }
    sub_a36abc(4, v10, 0);
    return 0;
}
