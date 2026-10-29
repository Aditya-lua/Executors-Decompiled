/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6d93c..0xa6d9a8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6d93c_0 {
    struct st_a6d93c_0 *field_0;
} st_a6d93c_0;


st_a6d93c_0 ** sub_a6d93c(st_a6d93c_0 **a0)
{
    st_a6d93c_0 **v2;  // w20
    unsigned long long v3;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && *a0)
    {
        v2 = (st_a6d93c_0 **)(unsigned int)_closedir(*(long long *)*a0);
        _free(*a0);
        if (!v2)
            return 1;
        v3 = arm64g_calculate_condition(0x11, (unsigned long long)v2, 1, 0);
        if (!(v3 & 1))
            return 0;
    }
    *(unsigned int *)___error() = 22;
    return 0;
}
