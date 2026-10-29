/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4114..0x414c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4114_0 {
    struct st_4114_0 *field_0;
} st_4114_0;


st_4114_0 ** sub_4114(st_4114_0 **a0)
{
    st_4114_0 **v2;  // x0
    st_4114_0 **v3;  // x0
    st_4114_0 **v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!*a0)
        return a0;
    do
    {
        v3 = v2;
        v4 = *v3;
        operatordelete(v3);
        v2 = v4;
    } while (*v3);
    return a0;
}
