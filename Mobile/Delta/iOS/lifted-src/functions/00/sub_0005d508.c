/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5d508..0x5d520 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5d508_0 {
    char padding_0[2120];
    unsigned long long field_848;
} st_5d508_0;

extern char g_f011d0;

long long sub_5d508(st_5d508_0 *a0, unsigned int a1)
{
    if (!a1)
        return &g_f011d0;
    return a0->field_848;
}
