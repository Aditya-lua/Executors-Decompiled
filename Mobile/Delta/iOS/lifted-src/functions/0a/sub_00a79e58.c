/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79e58..0xa79f54 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79e58_0 {
    char padding_0[32];
    long long field_20;
    char padding_28[32];
    char field_48;
} st_a79e58_0;


unsigned long long sub_a79e58(long long *a0)
{
    char v2;  // x0
    st_a79e58_0 *v3;  // x20
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned int v6;  // w0
    unsigned int v7;  // w21
    unsigned int v8;  // w20
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c(a0[10], 1);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        return 0;
    }
    v3 = (st_a79e58_0 *)v2;
    v4 = sub_a7c17c(*(long long *)(v2 + 32));
    if (!(unsigned int)v4)
        return v4;
    sub_a7c1b4(v3->field_20);
    if (v3->field_48 >> 1 & 1)
        return 1;
    v5 = sub_a7c198(a0[24]);
    if (!(unsigned int)v5)
        return v5;
    sub_a6c2e4(a0[22], "crypto/provider_core.c", 1373);
    a0[22] = 0;
    a0[23] = 0;
    sub_a7c1b4(a0[24]);
    v6 = sub_a4eb44(a0);
    v7 = sub_a302ec(a0) + v6;
    v8 = sub_a2d68c(a0);
    v9 = v7 + v8 + sub_ad7e14(a0) == 4;
    return v9;
}
