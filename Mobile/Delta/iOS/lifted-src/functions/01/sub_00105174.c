/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x105174..0x105190 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_105174_0 {
    char padding_0[160];
    unsigned long long field_a0;
} st_105174_0;

extern st_105174_0 *g_f0d3d8;

long long sub_105174(void)
{
    goto *((void *)(g_f0d3d8->field_a0));
}
