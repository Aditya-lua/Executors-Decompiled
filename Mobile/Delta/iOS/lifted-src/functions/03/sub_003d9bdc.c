/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d9bdc..0x3d9c14 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d9bdc_0 {
    unsigned long long field_0;
    char padding_8[2488];
    unsigned long long field_9c0;
} st_3d9bdc_0;


st_3d9bdc_0 * sub_3d9bdc(st_3d9bdc_0 *a0, unsigned long long a1)
{
    unsigned long long idx;  // x8

    a0->field_0 = a1;
    idx = 1;
    do
    {
        a1 = idx + 6364136223846793005 * (a1 ^ a1 >> 62);
        (&a0->field_0)[idx] = a1;
        idx += 1;
    } while (idx != 312);
    a0->field_9c0 = 0;
    return a0;
}
