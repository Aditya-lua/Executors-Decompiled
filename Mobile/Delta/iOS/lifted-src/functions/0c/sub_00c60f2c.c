/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc60f2c..0xc60fd8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c60f2c_0 {
    struct st_c60f2c_0 *field_0;
    char padding_8[24];
    struct st_c60f2c_0 *field_20;
    unsigned long long field_28;
    char padding_30[96];
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[4];
    struct st_c60f2c_0 *field_a0;
    char padding_a8[8];
    unsigned int field_b0;
} st_c60f2c_0;

extern char g_9581bc;

st_c60f2c_0 * sub_c60f2c(unsigned long a0)
{
    st_c60f2c_0 *v2;  // x19
    st_c60f2c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 < 9)
        return 0;
    v2 = sub_a6bffc(184, "ssl/ssl_cert.c", 71);
    if (!v2)
        return v2;
    v2->field_28 = a0;
    v3 = sub_a6bffc(a0 * 40, "ssl/ssl_cert.c", 76);
    v2->field_20 = v3;
    if (v3)
    {
        v2->field_0 = v3;
        v2->field_90 = &g_9581bc;
        v2->field_98 = 2;
        v2->field_a0 = 0;
        /* unsupported instruction */;
        v2->field_b0 = 1;
        return v2;
    }
    sub_a6c2e4(v2, "ssl/ssl_cert.c", 78);
    return 0;
}
