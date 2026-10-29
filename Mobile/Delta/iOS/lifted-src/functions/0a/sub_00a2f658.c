/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f658..0xa2f690 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f658_0 {
    struct st_a2f658_0 *field_0;
} st_a2f658_0;


st_a2f658_0 ** sub_a2f658(st_a2f658_0 **a0, st_a2f658_0 **a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_c66cd8();
        return 0;
    }
    else if (a1)
    {
        *(unsigned int *)a0 = (unsigned int)a1;
        return 1;
    }
    else
    {
        sub_c66c9c();
        return 0;
    }
}
