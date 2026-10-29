/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8c5adc..0x8c5c6c (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8c5adc_0 {
    char field_0;
} st_8c5adc_0;


void* sub_8c5adc(void* a0, unsigned long long *a1)
{
    unsigned long long *v7;  // x8
    void* v8;  // x0
    unsigned long v17;  // x9
    uint128_t v18;  // q2
    unsigned long long *v19;  // q3
    void* v20;  // x0
    unsigned long v9;  // x10
    unsigned long v10;  // x1
    unsigned long long v11;  // x9
    unsigned long long v12;  // x22
    long long v13;  // x20
    unsigned long long v14;  // x8
    unsigned long long v15;  // 4133
    unsigned long long *v16;  // x8
    st_8c5adc_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_8c5adc_0 *v1;  // [bp-0x78]
    st_8c5adc_0 *v2;  // [bp-0x70], Other Possible Types: uint128_t
    unsigned long long *v3;  // [bp-0x60]
    st_8c5adc_0 **v4;  // [bp-0x48], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = (long long)a0[16];
    v8 = a0;
    if (v7 == (long long)v8[24])
    {
        v9 = *(long long *)a0;
        v10 = (long long)a0[8];
        if (v10 > v9)
        {
            v11 = ((long long)(v10 - v9) >> 3 ^ 2) + (v10 - v9 >> 2 & 4);
            v12 = (~v11 + v11 * 2 + (~v11 + v11 * 2 >> 63) >> 1) * 8;
            v13 = v10 - v12;
            v2 = &v4;
            v4 = &v2;
            v8 = sub_13bbc(v13);
            v14 = v13 + (char *)v7 + v10 + 2 * ~v10 + 2;
            v7 = v13 * 2 + v14 + (-v13 & ~v14) * 2 + (v14 + (-v13 | ~v14)) * 2 + 2;
            *(unsigned long long *)&a0[8] = (long long)a0[8] - v12;
            *(unsigned long long **)&a0[16] = v7;
        }
        else
        {
            v15 = arm64g_calculate_condition(18, (-v9 ^ v7) + ((char *)v7 + (-v9 | ~v7)) * 2, 2, 0);
            sub_ec54();
            v16 = (long long)a0[16];
            v17 = -(long long)a0[8];
            sub_159aa4(&v2, (long long)a0[8], (long long)((v16 ^ v17) + ((char *)v16 + (v17 | ~v16)) * 2 + 2) >> 3);
            v18 = *(int128_t *)a0;
            v19 = (unsigned long long *)(int128_t)a0[16];
            *(uint128_t *)a0 = v2;
            *(uint128_t *)&a0[16] = (uint128_t)v3;
            v2 = v18;
            v3 = v19;
            v8 = sub_1089c(&v2);
            v7 = (long long)a0[16];
        }
    }
    v20 = v8;
    *v7 = *a1;
    *(long long *)&a0[16] = (long long)a0[16] + 8;
    return v20;
}
