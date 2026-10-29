/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966d78..0x966da0 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966d78_0 {
    char padding_0[736];
    unsigned long long field_2e0;
} st_966d78_0;


st_966d78_0 * sub_966d78(st_966d78_0 *a0)
{
    if (a0)
        a0 = (a0->field_2e0 >> 9) / 1953125;
    return a0;
}
