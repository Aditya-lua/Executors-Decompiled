/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a62c..0x1a648 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a62c_0 {
    unsigned long long field_0;
    char field_8;
} st_1a62c_0;


st_1a62c_0 * sub_1a62c(st_1a62c_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = *a1;
    if (!(a0->field_8 & 1))
        a0->field_8 = 1;
    a0->field_0 = v0;
    return a0;
}
