/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46d98..0x46ddc (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46d98_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_46d98_0;


st_46d98_0 * sub_46d98(st_46d98_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + v0 - a1 - 72 - 72 * (v0 - a1 - 72) / 72 - (v0 - a1 - 72) - 72;
    return a0;
}
