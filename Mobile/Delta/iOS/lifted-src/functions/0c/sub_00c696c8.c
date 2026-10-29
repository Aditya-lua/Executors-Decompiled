/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc696c8..0xc69740 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c696c8_0 {
    char padding_0[8];
    struct st_c696c8_0 *field_8;
} st_c696c8_0;


st_c696c8_0 * sub_c696c8(long long a0, unsigned long a1)
{
    st_c696c8_0 *v3;  // x0
    st_c696c8_0 *v4;  // x20
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a6820c();
    if (!v3)
        return v3;
    if (!sub_a67b48(a0))
        return 0;
    v0 = a1;
    v4 = sub_a66b6c(v3, &v0);
    sub_a67bd0(a0);
    if (v4)
        return v4->field_8;
    return 0;
}
