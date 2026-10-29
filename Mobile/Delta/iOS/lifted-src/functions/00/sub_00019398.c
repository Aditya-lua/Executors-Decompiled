/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19398..0x193d4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19398_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_19398_0;


st_19398_0 * sub_19398(st_19398_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + v0 - a1 - 24 - 24 * (v0 - a1 - 24) / 24 - (v0 - a1 - 24) - 24;
    return a0;
}
