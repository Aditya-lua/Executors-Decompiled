/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12998..0x129dc (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12998_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_12998_0;


st_12998_0 * sub_12998(st_12998_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + v0 - a1 - 56 - 56 * (v0 - a1 - 56 >> 3) / 7 - (v0 - a1 - 56) - 56;
    return a0;
}
