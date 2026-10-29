/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada3d8..0xada3f4 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada3d8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_ada3d8_0;


st_ada3d8_0 * sub_ada3d8(st_ada3d8_0 *a0, unsigned long a1)
{
    if (!a0)
        return 0xffffffff;
    a0->field_8 = a1;
    return 0;
}
