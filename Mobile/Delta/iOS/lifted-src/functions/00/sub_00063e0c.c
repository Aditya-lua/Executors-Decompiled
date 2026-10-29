/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63e0c..0x63e3c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63e0c_0 {
    unsigned int field_0;
    char padding_4[2492];
    unsigned long long field_9c0;
} st_63e0c_0;


st_63e0c_0 * sub_63e0c(st_63e0c_0 *a0, unsigned int a1)
{
    unsigned long long idx;  // x8

    a0->field_0 = a1;
    idx = 1;
    do
    {
        a1 = (unsigned int)idx + 1812433253 * (a1 ^ a1 >> 30);
        (&a0->field_0)[idx] = a1;
        idx += 1;
    } while (idx != 624);
    a0->field_9c0 = 0;
    return a0;
}
