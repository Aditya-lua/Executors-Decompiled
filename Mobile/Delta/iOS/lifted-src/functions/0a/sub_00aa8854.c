/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8854..0xaa8920 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa8854_0 {
    struct st_aa8854_0 *field_0;
    char padding_8[24];
    struct st_aa8854_0 *field_20;
} st_aa8854_0;


st_aa8854_0 * sub_aa8854(void)
{
    st_aa8854_0 *v2;  // x19
    st_aa8854_0 *v3;  // x0
    st_aa8854_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(104, "crypto/rand/rand_lib.c", 524);
    if (!v2)
        return v2;
    sub_a6afb8(0x40000, 0);
    v3 = sub_a6d9b4("fips", "crypto/rand/rand_lib.c", 537);
    v2->field_20 = v3;
    if (v3)
    {
        v4 = sub_a7c11c();
        v2->field_0 = v4;
        if (v4 && sub_a6b7dc(v2[1].padding_8, 0))
        {
            if (!sub_a6b7dc(v2 + 1, 0))
                sub_a7c240(v2[1].padding_8);
            else
                return v2;
        }
        sub_a7c1d0(v2->field_0);
    }
    sub_a6c2e4();
    sub_a6c2e4(v2, "crypto/rand/rand_lib.c", 562);
    return 0;
}
