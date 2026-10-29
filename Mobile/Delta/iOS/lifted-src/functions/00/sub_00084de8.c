/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84de8..0x84ed8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84de8_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[228];
    char field_f0;
    char padding_f1[735];
    char field_3d0;
    char padding_3d1[2247];
    long long field_c98;
    long long field_ca0;
    char padding_ca8[304];
    long long field_dd8;
    long long field_de0;
} st_84de8_1;

typedef struct st_84de8_0 {
    char field_0;
} st_84de8_0;

extern char g_10002b0;

unsigned long long sub_84de8(st_84de8_1 *a0, long long a1, long long a2, long long a3, long long a4, unsigned int a5)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4106
    st_84de8_0 **v0;  // [bp-0x1a0], Other Possible Types: char
    st_84de8_0 *v1;  // [bp-0x198]
    char v2;  // [bp-0x190]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_7fd6c(&a0->field_3d0, a0->field_c98, a0->field_ca0, &a0->field_f0, &v2, a0->field_dd8, a0->field_de0);
    v7 = arm64g_calculate_condition(130, v6, 120, 0);
    if (!(v7 & 1))
        v6 = sub_83cec(&a0->field_3d0, a0->field_c98, a0->field_ca0, &v2, &a0->field_f0, a1, a2, a3, a4, CONCAT(a5, a0->field_8), a0->field_dd8, a0->field_de0);
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
