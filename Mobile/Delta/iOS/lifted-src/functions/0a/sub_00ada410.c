/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada410..0xada42c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada410_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_ada410_0;


st_ada410_0 * sub_ada410(st_ada410_0 *a0, unsigned long a1)
{
    if (!a0)
        return 0xffffffff;
    a0->field_20 = a1;
    return 0;
}
