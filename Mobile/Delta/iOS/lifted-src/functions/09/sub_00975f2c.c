/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x975f2c..0x975fa0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_975f2c_0 {
    char padding_0[256];
    long long field_100;
    char padding_108[2088];
    unsigned long long field_930;
} st_975f2c_0;


unsigned long long sub_975f2c(st_975f2c_0 *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x10
    unsigned long long v11;  // x8
    unsigned long long v12;  // 4110
    unsigned long long v13;  // x9
    unsigned long long v14;  // x10
    unsigned long long v15;  // 4114
    unsigned long long v16;  // 4109
    char v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    sub_989228(a0->field_100, &v0);
    v10 = v1 * 4;
    if (1000000 >= v10)
        v10 = 1000000;
    if (v1 > 0x3fffffffffffffff)
        v10 = 0xffffffffffffffff;
    v11 = v0 + v10;
    v12 = arm64g_calculate_condition(50, v0, v10, 0);
    if (!(v12 & 1))
        v11 = 0xffffffffffffffff;
    v13 = a0->field_930;
    v14 = v11 + v13;
    v15 = arm64g_calculate_condition(50, v11, v13, 0);
    if (!(v15 & 1))
        v14 = 0xffffffffffffffff;
    v16 = arm64g_calculate_condition(2, v13, 1, 0);
    if (!(v16 & 1))
        return v14;
    return v11;
}
