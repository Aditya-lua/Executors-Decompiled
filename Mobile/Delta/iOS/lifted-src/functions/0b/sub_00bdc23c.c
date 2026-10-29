/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdc23c..0xbdc2b4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdc23c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_bdc23c_0;


unsigned long long sub_bdc23c(st_bdc23c_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4106
    unsigned long long v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_bd041c(&a0[1].field_8);
    v3 = arm64g_calculate_condition(2, a0, 1, 0);
    if (v3 & 1)
        return v2;
    v4 = a0->field_8;
    a0->field_8 = v4 - 1;
    if (v4 == 1)
        return _free();
    return v2;
}
