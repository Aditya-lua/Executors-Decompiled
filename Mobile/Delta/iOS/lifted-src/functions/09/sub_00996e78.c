/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x996e78..0x996e84 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_996e78_0 {
    char padding_0[58];
    unsigned long long field_3a;
} st_996e78_0;


st_996e78_0 * sub_996e78(st_996e78_0 *a0, unsigned long long *a1)
{
    *(unsigned long long *)&(a0->padding_0)[1] = *a1;
    return a0;
}
