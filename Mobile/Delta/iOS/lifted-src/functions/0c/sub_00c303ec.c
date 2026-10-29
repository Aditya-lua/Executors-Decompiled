/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc303ec..0xc314a8 (4284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c303ec_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c303ec_0;

typedef struct st_c303ec_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_c303ec_1;

extern st_c303ec_1 g_e06c2e;

long long sub_c303ec(st_c303ec_0 *a0, unsigned long a1)
{
    unsigned long v9;  // x9
    unsigned long v10;  // x8
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v9 = a0->field_18 - 12;
    v10 = 9;
    if (11 >= a0->field_18)
        v9 = v10;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = &v8;
    v7 = v17;
    goto *((void *)(sub_c30438 + (&g_e06c2e.field_0)[v9] * 4));
}
