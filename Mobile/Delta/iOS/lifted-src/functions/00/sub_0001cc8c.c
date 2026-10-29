/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1cc8c..0x1ccd0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1cc8c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_1cc8c_0;


st_1cc8c_0 * sub_1cc8c(st_1cc8c_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + v0 - a1 - 36 - 36 * (v0 - a1 - 36) / 36 - (v0 - a1 - 36) - 36;
    return a0;
}
