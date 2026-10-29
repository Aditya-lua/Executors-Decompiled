/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6fbc4..0xa6fc18 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6fbc4_0 {
    struct st_a6fbc4_0 *field_0;
    char padding_8[32];
    struct st_a6fbc4_0 *field_28;
} st_a6fbc4_0;


st_a6fbc4_0 * sub_a6fbc4(st_a6fbc4_0 *a0, st_a6fbc4_0 *a1)
{
    st_a6fbc4_0 *v2;  // x19
    st_a6fbc4_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (!v2)
    {
        return 0;
    }
    else if (a1)
    {
        if (!v2->field_0)
            return 0;
        do
        {
            v3 = v2;
            if (!_strcmp(a1))
                return v3;
        } while ((v2 = &v3->field_28, v3->field_28));
        return 0;
    }
    else
    {
        return 0;
    }
}
