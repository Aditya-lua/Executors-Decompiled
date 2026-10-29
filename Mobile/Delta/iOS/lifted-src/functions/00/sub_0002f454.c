/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2f454..0x2f498 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2f454_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_2f454_0;


st_2f454_0 * sub_2f454(st_2f454_0 *a0, unsigned long a1)
{
    unsigned long v0;  // x8

    if (a0->field_10 != a1)
    {
        v0 = a0->field_10 - 264;
        a0->field_10 = v0 + v0 - a1 - 264 * (v0 - a1) / 264 - (v0 - a1);
    }
    return a0;
}
