/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ea2c..0xa6eaa0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ea2c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
} st_a6ea2c_0;


long long sub_a6ea2c(st_a6ea2c_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // 4154
    unsigned long long v3;  // x8
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(0x22, a1 - 8, 7, 0);
    if (v2 & 1)
        v3 = ~(0xffffffffffffffff << ((char)a1 * 8 & 63)) + a1;
    else
        v3 = 0xffffffffffffffff;
    a0->field_0 = 0;
    a0->field_8 = 0;
    a0->field_18 = 0;
    a0->field_20 = v3;
    a0->field_30 = a0->field_30 & 254;
    a0->field_10 = 0;
    v4 = sub_a6bffc();
    a0->field_28 = v4;
    return v4 != 0;
}
