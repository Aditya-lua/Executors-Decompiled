/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3f0c..0x1a3f20 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3f0c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_1a3f0c_0;

extern char g_e70410;

st_1a3f0c_0 * sub_1a3f0c(st_1a3f0c_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_8;
    *a1 = &g_e70410;
    a1[1] = v0;
    return a0;
}
