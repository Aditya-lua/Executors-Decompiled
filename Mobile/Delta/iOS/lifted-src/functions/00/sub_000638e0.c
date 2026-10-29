/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x638e0..0x6397c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_638e0_0 {
    struct st_638e0_0 *field_0;
    struct st_638e0_0 *field_8;
} st_638e0_0;


st_638e0_0 * sub_638e0(st_638e0_0 **a0, st_638e0_0 **a1, long long a2)
{
    st_638e0_0 *v2;  // x8
    st_638e0_0 *v3;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    if (!a0[1])
    {
        *a1 = a0 + 1;
        return a0 + 1;
    }
    while (1)
    {
        v3 = v2;
        if (!sub_6926c(a0, a2, v2 + 2))
        {
            v2 = v3->field_8;
            if (!v3->field_8)
            {
                *a1 = v3;
                return &v3->field_8;
            }
        }
        else
        {
            v2 = v3->field_0;
            if (!v3->field_0)
            {
                *a1 = v3;
                return v3;
            }
        }
    }
}
