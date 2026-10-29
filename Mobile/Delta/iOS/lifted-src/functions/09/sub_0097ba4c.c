/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ba4c..0x97ba78 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ba4c_0 {
    struct st_97ba4c_0 *field_0;
} st_97ba4c_0;


st_97ba4c_0 ** sub_97ba4c(st_97ba4c_0 **a0, st_97ba4c_0 **a1)
{
    if (a1 && *a1)
        return 0;
    a0[1] = 0;
    a0[2] = 0;
    *a0 = a1;
    *(char *)&a0[3] = 0;
    return 1;
}
