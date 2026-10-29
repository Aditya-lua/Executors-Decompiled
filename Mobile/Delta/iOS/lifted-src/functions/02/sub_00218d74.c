/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x218d74..0x218db0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_218d74_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_218d74_0;


st_218d74_0 * sub_218d74(st_218d74_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + v0 - a1 - 80 - 80 * (v0 - a1 - 80) / 80 - (v0 - a1 - 80) - 80;
    return a0;
}
