/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6aee0..0x6aef4 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6aee0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_6aee0_0;

extern char g_e6a688;

st_6aee0_0 * sub_6aee0(st_6aee0_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_8;
    *a1 = &g_e6a688;
    a1[1] = v0;
    return a0;
}
