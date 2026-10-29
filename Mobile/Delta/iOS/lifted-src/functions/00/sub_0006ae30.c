/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ae30..0x6ae44 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ae30_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_6ae30_0;

extern char g_e6a6d0;

st_6ae30_0 * sub_6ae30(st_6ae30_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_8;
    *a1 = &g_e6a6d0;
    a1[1] = v0;
    return a0;
}
