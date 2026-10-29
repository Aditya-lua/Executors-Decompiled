/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4cdb0..0xb4cef0 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4cdb0_0 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[332];
    long long field_168;
    unsigned long long field_170;
} st_b4cdb0_0;

extern char g_10002b0;

unsigned long long sub_b4cdb0(st_b4cdb0_0 *a0, unsigned long a1, unsigned long a2, long long a3, unsigned long long a4)
{
    unsigned long long v11;  // x0
    uint128_t v0;  // [bp-0xc0]
    uint128_t v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa0]
    char v3;  // [bp-0x98]
    uint128_t v4;  // [bp-0x70]
    uint128_t v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (a0->field_18 == 0x8000)
    {
        sub_a71bbc(sub_a71670("signature"));
        v4 = v0;
        v5 = v1;
        v6 = v2;
        if ((int)sub_b4d7b0(a0, &v3) < 1 || (int)sub_a3fe10(a0->field_168, a3, a4) < 1)
            goto LABEL_b4ce70;
        v11 = sub_b4d6d8(a0);
    }
    else
    {
        v11 = sub_a2f9e0();
        if ((unsigned int)v11)
        {
            if ((!a0->field_170 || a0->field_170 == a4) && *(long long *)&g_10002b0 != v7)
                ___stack_chk_fail();
LABEL_b4ce70:
            v11 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v7)
        return v11;
    ___stack_chk_fail();
}
