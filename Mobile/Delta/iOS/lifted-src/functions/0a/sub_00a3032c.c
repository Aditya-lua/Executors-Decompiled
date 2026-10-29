/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3032c..0xa30350 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3032c_0 {
    struct st_a3032c_0 *field_0;
} st_a3032c_0;


st_a3032c_0 ** sub_a3032c(st_a3032c_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c66e28();
        return 0;
    }
    return *a0;
}
