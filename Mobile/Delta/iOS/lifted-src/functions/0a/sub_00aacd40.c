/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaacd40..0xaace9c (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aacd40_0 {
    char padding_0[128];
    unsigned long long field_80;
} st_aacd40_0;

typedef struct st_aacd40_1 {
    char padding_0[8];
    struct st_aacd40_2 *field_8;
    char padding_10[16];
    struct st_aacd40_0 *field_20;
} st_aacd40_1;

typedef struct st_aacd40_2 {
    unsigned int field_0;
} st_aacd40_2;


long long sub_aacd40(long long a0, st_aacd40_1 *a1)
{
    long long v4;  // x0
    unsigned long v5;  // x0
    long long v6;  // x22
    unsigned long long v7;  // x0
    unsigned long long v8;  // x21
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (sub_ab1cb0(a1->field_20, 0xf000) != 0x1000)
    {
        v6 = 5;
    }
    else if (a1->field_20->field_80)
    {
        v4 = sub_aadf10();
        v5 = sub_9c8d24(a1->field_20->field_80, v4, &v0);
        if (!v5)
            return v5;
        v6 = 16;
    }
    else
    {
        v6 = 0xffffffff;
    }
    v7 = sub_aadf50(a1->field_20, &v1);
    if ((int)v7 > 0)
    {
        v8 = v7;
        if (sub_9ca82c(a0, sub_a99624(*(int *)a1->field_8), 0, v6, v0, v1, v8))
            return 1;
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", 164, "rsa_priv_encode");
        sub_a36abc(4, 0x8000d, 0);
        sub_9c7940(v0);
        sub_a6c4e8(v1, v8 & 0xffffffff, "crypto/rsa/rsa_ameth.c", 166);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", 157, "rsa_priv_encode");
        sub_a36abc(4, 0x8000d, 0);
        sub_9c7940(v0);
    }
    return 0;
}
