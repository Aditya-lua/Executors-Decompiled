/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa368c8..0xa369bc (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a368c8_1 {
    char padding_0[704];
    unsigned int field_2c0;
} st_a368c8_1;

typedef struct st_a368c8_0 {
    char padding_0[256];
    unsigned long long field_100;
    char padding_108[248];
    unsigned int field_200;
    char padding_204[380];
    unsigned int field_380;
    unsigned int field_384;
} st_a368c8_0;


st_a368c8_0 * sub_a368c8(void)
{
    st_a368c8_0 *v2;  // x0
    unsigned int v3;  // w8
    st_a368c8_1 *v12;  // x9
    long long *v13;  // x20
    st_a368c8_0 *v14;  // x0
    unsigned long long v4;  // 4143
    unsigned int v5;  // w10
    unsigned long idx;  // x8
    unsigned int *v8;  // x9
    unsigned long long *v9;  // x11
    unsigned int v10;  // w10
    unsigned long long v11;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (!v2)
        return v2;
    v3 = v2->field_380 + 1;
    v4 = arm64g_calculate_condition(67, 0, v3, 0);
    if (v4 & 1)
        v5 = v3 & 15;
    else
        v5 = -(-v3 & 15);
    v2->field_380 = v5;
    if (v5 == v2->field_384)
        v2->field_384 = (char)(v5 + 1 - ((char)v5 + 1 + ((char)(__ROL__((char)v5 + 1, 21)) & 15) & 240));
    idx = v5;
    v8 = &v2->field_200;
    v9 = &v2->field_100;
    if (!(v8[v5] & 1))
    {
        v10 = 0;
        v11 = idx * 8;
        *(unsigned long long *)((char *)v9 + v11) = 0;
        *(unsigned long long *)&v2->padding_108[120 + v11] = 0;
    }
    else if (v9[idx])
    {
        *(char *)v9[idx] = 0;
        v10 = 1;
    }
    else
    {
        v12 = &v2->padding_0[4 * idx];
        *(unsigned int *)&v12->padding_0[64] = 0;
        *(unsigned int *)&v12->padding_0[0] = 0;
        v13 = &v2->padding_0[8 * idx];
        v13[16] = 0;
        v12->field_2c0 = 0xffffffff;
        sub_a6c2e4(v13[72], "crypto/err/err_local.h", 92);
        v13[72] = 0;
        v14 = sub_a6c2e4(v13[96], "crypto/err/err_local.h", 94);
        v13[96] = 0;
        return v14;
    }
    v8[idx] = v10;
    v12 = &v2->padding_0[4 * idx];
    *(unsigned int *)&v12->padding_0[64] = 0;
    *(unsigned int *)&v12->padding_0[0] = 0;
    v13 = &v2->padding_0[8 * idx];
    v13[16] = 0;
    v12->field_2c0 = 0xffffffff;
    sub_a6c2e4(v13[72], "crypto/err/err_local.h", 92);
    v13[72] = 0;
    v14 = sub_a6c2e4(v13[96], "crypto/err/err_local.h", 94);
    v13[96] = 0;
    return v14;
}
