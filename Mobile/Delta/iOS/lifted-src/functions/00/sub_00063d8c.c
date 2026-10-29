/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63d8c..0x63dc4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63d8c_0 {
    struct st_63d8c_0 *field_0;
    struct st_63d8c_0 *field_8;
    struct st_63d8c_0 *field_10;
} st_63d8c_0;


st_63d8c_0 * sub_63d8c(st_63d8c_0 *a0)
{
    st_63d8c_0 *v0;  // x0
    st_63d8c_0 *v1;  // x8

    v0 = a0->field_10;
    if (!v0)
        return v0;
    v1 = v0->field_0;
    if (v1 != a0)
    {
        v0->field_8 = 0;
        if (!v1)
            return v0;
    }
    else
    {
        v0->field_0 = 0;
        if (!v0->field_8)
            return v0;
    }
}
