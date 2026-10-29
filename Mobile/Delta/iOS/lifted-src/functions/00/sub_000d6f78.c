/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6f78..0xd7050 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d6f78_1 {
    char padding_0[16];
    struct st_d6f78_2 *field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_d6f78_1;

typedef struct st_d6f78_2 {
    unsigned long long field_0;
} st_d6f78_2;

typedef struct st_d6f78_0 {
    char field_0;
} st_d6f78_0;


long long sub_d6f78(st_d6f78_1 *a0)
{
    unsigned int v6;  // w21
    unsigned int v7;  // w9
    unsigned long v8;  // x20
    unsigned long long v9;  // x0
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // 4107
    unsigned long long i;  // x9
    st_d6f78_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_d6f78_0 *v1;  // [bp-0x48]
    st_d6f78_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_d6f78_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_30;
    if (v6 < 3)
        return v6 > 2;
    v7 = a0->field_34;
    a0->field_30 = __ROL__(v6, 31) & 0x800000ff & 0xff;
    a0->field_34 = v7 + 1;
    v8 = a0->field_20 + 1;
    v3 = &v2;
    v2 = &v3;
    v9 = sub_e24b4();
    v10 = 0xff;
    if (v9 < 0xff)
        v10 = v9;
    v11 = v10 + v8;
    v12 = arm64g_calculate_condition(2, v10, v8, 0);
    if (!(v12 & 1))
    {
        i = 0;
        do
        {
            *(unsigned long long *)((char *)a0->field_10 + i) = (unsigned long long)(*(long long *)((char *)a0->field_10 + i)) >> 1 & 0x7f7f7f7f7f7f7f7f;
            i += 8;
        } while (i < v11);
    }
    *((char *)a0->field_10 + v11) = 1;
    a0->field_28 = sub_e24b4(a0, a0->field_20 + 1);
    return v6 > 2;
}
