/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2160c..0x21648 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2160c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_2160c_0;


st_2160c_0 * sub_2160c(st_2160c_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + v0 - a1 - 20 - 20 * (v0 - a1 - 20) / 20 - (v0 - a1 - 20) - 20;
    return a0;
}
