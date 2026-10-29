/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ed4c..0xa6ed9c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ed4c_1 {
    char padding_0[40];
    struct st_a6ed4c_0 *field_28;
} st_a6ed4c_1;

typedef struct st_a6ed4c_0 {
    struct st_a6ed4c_0 *field_0;
} st_a6ed4c_0;


st_a6ed4c_0 ** sub_a6ed4c(st_a6ed4c_1 *a0)
{
    st_a6ed4c_0 **v2;  // x0
    st_a6ed4c_0 **v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_28;
    if (v2)
    {
        do
        {
            v3 = v2;
            sub_a6c2e4();
            v2 = *v3;
        } while (*v3);
    }
    a0->field_28 = 0;
    return v2;
}
