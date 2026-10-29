/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a078..0xa6a0ac (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6a078_0 {
    struct st_a6a078_0 *field_0;
} st_a6a078_0;


st_a6a078_0 ** sub_a6a078(void)
{
    st_a6a078_0 **v2;  // x0
    st_a6a078_0 **v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68358();
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    *v2 = v3;
    return v3 != 0;
}
