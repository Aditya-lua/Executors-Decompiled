/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f484..0x7f500 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f484_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[8];
    long long field_38;
    unsigned long long field_40;
} st_7f484_0;


unsigned long long sub_7f484(st_7f484_0 *a0, unsigned long a1)
{
    unsigned long long v2;  // 4106
    unsigned long long v3;  // x0
    unsigned long long v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(int)a0->field_40)
    {
        v2 = arm64g_calculate_condition(130, sub_7df74(a0, 1), 120, 0);
        if (v2 & 1)
            return 0;
    }
    v3 = a0->field_18;
    v4 = v3 + a1;
    if (v4 <= a0->field_28)
    {
        a0->field_18 = v4;
        return v3;
    }
    *(char *)&a0->field_38 = 1;
    return 0;
}
