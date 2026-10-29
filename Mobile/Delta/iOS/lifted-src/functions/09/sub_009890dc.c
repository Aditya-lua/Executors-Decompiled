/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9890dc..0x989124 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9890dc_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9890dc_0;


unsigned long long sub_9890dc(unsigned long long a0, st_9890dc_0 *a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    unsigned long long *iter;  // x9
    unsigned long long v2;  // x2
    unsigned long long v3;  // x11
    unsigned long long v4;  // x8

    if (!a2)
        return a0;
    v0 = 0;
    iter = &a1->field_8;
    do
    {
        v2 = a2;
        v3 = *iter;
        if (a0 <= v0)
        {
            *iter = 0;
            v4 = v3 + v0;
        }
        else
        {
            v4 = v3 + v0;
            if (v4 > a0)
                *iter = a0 - v0;
        }
    } while ((iter += 2, a2 = v2 - 1, v0 = v4, v2 != 1));
    return a0;
}
