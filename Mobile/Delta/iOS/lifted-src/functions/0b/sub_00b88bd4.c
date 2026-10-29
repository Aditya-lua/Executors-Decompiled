/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb88bd4..0xb8a1ec (5656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b88bd4_1 {
    char padding_0[8];
    struct st_b88bd4_0 *field_8;
    unsigned long long field_10;
} st_b88bd4_1;

typedef struct st_b88bd4_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b88bd4_0;

typedef struct st_b88bd4_2 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_b88bd4_2;

extern st_b88bd4_2 g_e06268;

unsigned long long sub_b88bd4(unsigned long long a0, st_b88bd4_1 *a1)
{
    unsigned long v4;  // x8
    unsigned long long v0;  // [bp-0xa8]
    unsigned long long v1;  // [bp-0xa0]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1->field_10)
        return a0;
    v0 = (char *)a1->field_8 + 264 * a1->field_10;
    v1 = a0;
    if (11 < a1->field_8->field_18)
        v4 = a1->field_8->field_18 - 12;
    else
        v4 = 9;
    goto *((void *)(sub_b88c74 + (&g_e06268.field_0)[v4] * 4));
}
