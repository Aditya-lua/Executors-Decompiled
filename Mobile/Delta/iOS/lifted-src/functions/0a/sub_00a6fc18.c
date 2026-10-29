/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6fc18..0xa6fc2c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6fc18_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_a6fc18_0;


int sub_a6fc18(st_a6fc18_0 *a0)
{
    unsigned long long v0;  // 4113

    if (a0)
    {
        v0 = arm64g_calculate_condition(2, a0->field_20, 1, 0);
        a0 = !(v0 & 1);
    }
    return (unsigned int)a0;
}
