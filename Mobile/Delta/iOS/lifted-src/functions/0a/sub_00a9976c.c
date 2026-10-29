/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9976c..0xa99788 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9976c_0 {
    struct st_a9976c_0 *field_0;
} st_a9976c_0;


st_a9976c_0 ** sub_a9976c(void)
{
    st_a9976c_0 **v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99624();
    if (!v2)
        return v2;
    return *v2;
}
