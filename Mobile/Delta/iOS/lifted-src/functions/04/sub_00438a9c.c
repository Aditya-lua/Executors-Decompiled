/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x438a9c..0x438ac4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_438a9c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_438a9c_0;

extern unsigned long long g_e80378;

st_438a9c_0 * sub_438a9c(st_438a9c_0 *a0)
{
    if (!a0->field_10)
        return a0;
    goto *((void *)(g_e80378 - 0xebdff100));
}
