/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadc9ec..0xadca0c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adc9ec_0 {
    unsigned long long field_0;
} st_adc9ec_0;


long long sub_adc9ec(st_adc9ec_0 **a0, st_adc9ec_0 **a1)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // 4107
    unsigned long long v2;  // 4107

    if ((unsigned long long)*(long long *)*a1 <= (unsigned long long)*(long long *)*a0)
    {
        v0 = 0;
        v1 = arm64g_calculate_condition(148, *(long long *)*a0, *(long long *)*a1, 0);
        if (!(v1 & 1))
            return 1;
    }
    else
    {
        v0 = 0xffffffff;
        v2 = arm64g_calculate_condition(148, *(long long *)*a0, *(long long *)*a1, 0);
        if (!(v2 & 1))
            return 1;
    }
    return v0;
}
