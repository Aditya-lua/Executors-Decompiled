/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe522c..0xbe52a4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be522c_0 {
    char padding_0[16];
    unsigned int field_10;
} st_be522c_0;


void sub_be522c(unsigned long long *a0, st_be522c_0 *a1)
{
    float v0;  // s0
    float v1;  // s1
    unsigned long long v2;  // 4149
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // 4116
    unsigned long long v5;  // 4144

    v0 = *(float *)&*(int *)*a0;
    if (!(a1->field_10 >> 28 & 1))
    {
        v1 = fabsf(v0);
        v2 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v1), 9.999999747378752e-05f)) >> 5 & 3 | v1 < 9.999999747378752e-05f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v1)) * 0x10000000, 0, 0);
        if (v2 & 1)
            v3 = (((((isnan(v0) ? 2 : v0 == 0.0f ? 2 : 0) | v0 < 0.0f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v0)) * 0x10000000;
        else
            v3 = 0x40000000;
        v4 = arm64g_calculate_condition(0, v3, 0, 0);
        v5 = arm64g_calculate_condition(160, (((((char)(CmpF(__float_as_int(v1), 1.0000000272564224e+16f)) >> 5 & 3 | v1 < 1.0000000272564224e+16f) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v1)) * 0x10000000, 0, 0);
    }
}
