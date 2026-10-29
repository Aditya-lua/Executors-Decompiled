/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b12c..0xb5b138 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b12c_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b5b12c_0;


st_b5b12c_0 * sub_b5b12c(st_b5b12c_0 *a0, unsigned long a1)
{
    if (a0)
        a0->field_18 = a1;
    return a0;
}
