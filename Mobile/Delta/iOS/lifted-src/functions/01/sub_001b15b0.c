/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b15b0..0x1b15c4 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b15b0_0 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_1b15b0_0 *field_18;
} st_1b15b0_0;

extern char g_e70198;

st_1b15b0_0 * sub_1b15b0(st_1b15b0_0 *a0)
{
    a0->field_0 = &g_e70198;
    a0->field_18 = a0;
    return a0;
}
