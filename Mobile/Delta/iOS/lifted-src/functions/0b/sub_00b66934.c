/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb66934..0xb676b4 (3456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b66934_1 {
    char padding_0[8];
    struct st_b66934_0 *field_8;
    unsigned long long field_10;
} st_b66934_1;

typedef struct st_b66934_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b66934_0;

typedef struct st_b66934_2 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_b66934_2;

extern st_b66934_2 g_e06018;

st_b66934_1 * sub_b66934(st_b66934_1 *a0, unsigned long long a1)
{
    st_b66934_0 *v5;  // x23
    unsigned long v6;  // x8
    unsigned long long v0;  // [bp-0xb8]
    unsigned long v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa8]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a0->field_10)
        return a0;
    v0 = (char *)a0->field_8 + 264 * a0->field_10;
    v5 = a0->field_8;
    v1 = &v5[8].padding_0[8];
    v2 = a1;
    if (11 < v5->field_18)
        v6 = v5->field_18 - 12;
    else
        v6 = 9;
    goto *((void *)(sub_b669d0 + (&g_e06018.field_0)[v6] * 4));
}
