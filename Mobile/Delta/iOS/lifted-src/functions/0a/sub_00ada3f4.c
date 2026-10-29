/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada3f4..0xada410 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada3f4_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_ada3f4_0;


st_ada3f4_0 * sub_ada3f4(st_ada3f4_0 *a0, unsigned long a1)
{
    if (!a0)
        return 0xffffffff;
    a0->field_10 = a1;
    return 0;
}
