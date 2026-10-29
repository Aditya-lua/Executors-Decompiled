/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b4d48..0x8b4f08 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b4d48_0 {
    char field_0;
} st_8b4d48_0;


void* sub_8b4d48(void* a0, unsigned long long *a1)
{
    void* v7;  // x1
    void* v8;  // x0
    unsigned long long v17;  // 4143
    unsigned long v18;  // x8
    void* v19;  // x9
    void* v20;  // q2
    uint128_t v21;  // q3
    void* v22;  // x0
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    unsigned long v11;  // x11
    long long v12;  // x9
    unsigned long long v13;  // x22
    unsigned long long v14;  // x23
    long long v15;  // x20
    unsigned long v16;  // x8
    st_8b4d48_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_8b4d48_0 *v1;  // [bp-0x78]
    st_8b4d48_0 *v2;  // [bp-0x70], Other Possible Types: void*
    uint128_t v3;  // [bp-0x60]
    st_8b4d48_0 **v4;  // [bp-0x48], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = (long long)a0[8];
    v8 = a0;
    if (v7 == *(long long *)v8)
    {
        v9 = (long long)a0[16];
        v10 = (long long)a0[24];
        if (v10 > v9)
        {
            v11 = v9 + 1;
            v12 = (long long)(v11 + ~v9 * 2 + v10 + 1) >> 3;
            v13 = (v12 + (v12 | 1) + (~v12 | 1) + 1 + (v12 + (v12 | 1) + (~v12 | 1) + 1 >> 63)) * 4 & 0xfffffffffffffff8;
            v14 = v9 + v13;
            v2 = &v4;
            v4 = &v2;
            v15 = v14 - (v9 + v7 + (v11 + (-v7 | ~v9) + (-v7 & ~v9)) * 2);
            v8 = sub_13bbc(v15);
            v7 = v14 * 2 + v15 + (-v14 & ~v15) * 2 + (v15 + (-v14 | ~v15)) * 2 + 2;
            v16 = (long long)a0[16];
            *(void* *)&a0[8] = v7;
            *(unsigned long long *)&a0[16] = v16 + v13;
        }
        else
        {
            v17 = arm64g_calculate_condition(18, v10 + v7 + (-v7 & ~v10) * 2 + (v10 + (-v7 | ~v10)) * 2, 2, 0);
            sub_ec54();
            v18 = (long long)a0[16];
            v19 = -(long long)a0[8];
            sub_159aa4(&v2, (long long)a0[8], (long long)((v18 ^ v19) + (v18 + (v19 | ~v18)) * 2 + 2) >> 3);
            v20 = (void*)*(int128_t *)a0;
            v21 = (int128_t)a0[16];
            *(uint128_t *)a0 = (uint128_t)v2;
            *(uint128_t *)&a0[16] = v3;
            v2 = v20;
            v3 = v21;
            v8 = sub_1089c(&v2);
            v7 = (long long)a0[8];
        }
    }
    v22 = v8;
    *(unsigned long long *)((char *)v7 - 8) = *a1;
    *(long long *)&a0[8] = (long long)a0[8] - 8;
    return v22;
}
