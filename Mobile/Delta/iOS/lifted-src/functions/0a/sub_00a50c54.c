/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50c54..0xa50c70 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50c54_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_a50c54_0;


int sub_a50c54(st_a50c54_0 *a0, unsigned long a1)
{
    if (!a0->field_30)
    {
        a0->field_30 = a1;
        return 1;
    }
    return 0;
}
