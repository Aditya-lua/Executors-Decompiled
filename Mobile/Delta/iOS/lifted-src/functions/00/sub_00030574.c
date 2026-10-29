/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30574..0x30588 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30574_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_30574_0;


st_30574_0 * sub_30574(st_30574_0 *a0, unsigned long a1)
{
    if (a0->field_10 != a1)
        a0->field_10 = a1;
    return a0;
}
