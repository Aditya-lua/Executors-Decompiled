/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b0148..0x8b02f0 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b0148_0 {
    char field_0;
} st_8b0148_0;


void* sub_8b0148(void* a0, unsigned long long *a1)
{
    unsigned long long *v7;  // x8
    void* v8;  // x0
    unsigned long long *v17;  // x8
    unsigned long v18;  // x9
    uint128_t v19;  // q2
    unsigned long long *v20;  // q3
    void* v21;  // x0
    unsigned long v9;  // x9
    unsigned long v10;  // x1
    unsigned long v11;  // x11
    long long v12;  // x9
    unsigned long v13;  // x22
    long long v14;  // x20
    unsigned long long v15;  // x8
    unsigned long long v16;  // 4133
    st_8b0148_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_8b0148_0 *v1;  // [bp-0x78]
    st_8b0148_0 *v2;  // [bp-0x70], Other Possible Types: uint128_t
    unsigned long long *v3;  // [bp-0x60]
    st_8b0148_0 **v4;  // [bp-0x48], Other Possible Types: char
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
            v11 = v10 + 2;
            v12 = (long long)(v11 + v9 + ~v9 * 2) >> 3;
            v13 = ((v12 + (v12 & 0xfffffffffffffffe) + (~v12 | 1) + 2) / 2 + ~((v12 + (v12 & 0xfffffffffffffffe) + (~v12 | 1) + 2) / 2) * 2) * 8 + 16;
            v14 = v10 + v13;
            v2 = &v4;
            v4 = &v2;
            v8 = sub_13bbc(v14);
            v15 = v14 + v11 + (char *)v7 + 2 * ~v10;
            v7 = v14 * 2 + v15 + (-v14 & ~v15) * 2 + (v15 + (-v14 | ~v15)) * 2 + 2;
            *(unsigned long *)&a0[8] = (long long)a0[8] + v13;
            *(unsigned long long **)&a0[16] = v7;
        }
        else
        {
            v16 = arm64g_calculate_condition(18, (-v9 ^ v7) + ((char *)v7 + (-v9 | ~v7)) * 2, 2, 0);
            sub_ec54();
            v17 = (long long)a0[16];
            v18 = -(long long)a0[8];
            sub_159aa4(&v2, (long long)a0[8], (long long)((v17 ^ v18) + ((char *)v17 + (v18 | ~v17)) * 2 + 2) >> 3);
            v19 = *(int128_t *)a0;
            v20 = (unsigned long long *)(int128_t)a0[16];
            *(uint128_t *)a0 = v2;
            *(uint128_t *)&a0[16] = (uint128_t)v3;
            v2 = v19;
            v3 = v20;
            v8 = sub_1089c(&v2);
            v7 = (long long)a0[16];
        }
    }
    v21 = v8;
    *v7 = *a1;
    *(long long *)&a0[16] = (long long)a0[16] + 8;
    return v21;
}
