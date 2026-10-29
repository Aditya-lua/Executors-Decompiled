/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa89f4..0xaa8a3c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa89f4_0 {
    long long field_0;
    struct st_aa89f4_0 *field_8;
} st_aa89f4_0;


st_aa89f4_0 * sub_aa89f4(void)
{
    st_aa89f4_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (v2 && sub_a7c17c(v2->field_0))
    {
        sub_a7c1b4(v2->field_0);
        return v2->field_8;
    }
    return 0;
}
