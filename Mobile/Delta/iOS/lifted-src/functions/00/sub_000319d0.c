/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x319d0..0x319f0 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_319d0_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_319d0_0;


double sub_319d0(st_319d0_0 *a0, unsigned long long i, uint128_t *a2)
{
    unsigned int *iter;  // x8
    unsigned long long v1;  // x1
    unsigned long v3;  // d0
    unsigned long v4;  // d0

    if (!i)
        return v4;
    iter = &a0->field_10;
    do
    {
        v1 = i;
        *(uint128_t *)((char *)iter - 16) = *a2;
        *iter = 0;
        iter += 6;
        i = v1 - 1;
    } while (i);
    return v3;
}
