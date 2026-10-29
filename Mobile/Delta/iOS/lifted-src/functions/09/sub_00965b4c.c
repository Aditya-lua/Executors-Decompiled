/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x965b4c..0x965c08 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_965b4c_0 {
    char padding_0[720];
    uint128_t field_2d0;
    unsigned long long field_2e0;
    unsigned long long field_2e8;
    char padding_2f0[104];
    char field_358;
    char padding_359[63];
    unsigned int field_398;
} st_965b4c_0;


st_965b4c_0 * sub_965b4c(void)
{
    st_965b4c_0 *v2;  // x0
    st_965b4c_0 *v3;  // x20
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4120
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_95de6c(0x200000, 0))
        return 0;
    v2 = sub_a6bffc(928, "ssl/ssl_sess.c", 109);
    if (!v2)
        return v2;
    v2->field_358 = 0xff;
    v2->field_2d0 = 0x46c7cfe0000000000000000001;
    v3 = v2;
    v4 = sub_a7c2c0();
    v3->field_2e0 = v4;
    v5 = v4 + 304000000000;
    v6 = arm64g_calculate_condition(50, v4, 304000000000, 0);
    if (!(v6 & 1))
        v5 = 0xffffffffffffffff;
    v3->field_2e8 = v5;
    /* unsupported instruction */;
    v3->field_398 = 1;
    if (sub_a6a660())
        return v3;
    sub_a6c2e4(v3, "ssl/ssl_sess.c", 126);
    return 0;
}
