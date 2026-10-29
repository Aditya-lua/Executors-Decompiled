/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f204c..0x9f20b4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f204c_0 {
    struct st_9f204c_0 *field_0;
    char padding_8[128];
    unsigned int field_88;
} st_9f204c_0;


st_9f204c_0 * sub_9f204c(void)
{
    st_9f204c_0 *v2;  // x0
    st_9f204c_0 *v3;  // x8
    st_9f204c_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(144, "crypto/cmac/cmac.c", 58);
    if (!v2)
        return v2;
    v3 = sub_a4bc70();
    v4 = v2;
    v4->field_0 = v3;
    if (!v3)
    {
        sub_a6c2e4(v4, "crypto/cmac/cmac.c", 62);
        return 0;
    }
    v4->field_88 = 0xffffffff;
    return v4;
}
