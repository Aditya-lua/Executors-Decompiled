/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b4f08..0x8b50a0 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b4f08_0 {
    char field_0;
} st_8b4f08_0;


void* * sub_8b4f08(void* *a0, unsigned long long *a1)
{
    void* v7;  // x1
    void* *v8;  // x0
    void* v17;  // x9
    void* v18;  // q2
    void* v19;  // q3
    void* *v20;  // x0
    void* v9;  // x8
    void* v10;  // x9
    long long v11;  // x9
    unsigned long long v12;  // x22
    unsigned long long v13;  // x23
    long long v14;  // x20
    void* v15;  // x8
    void* v16;  // x8
    st_8b4f08_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_8b4f08_0 *v1;  // [bp-0x78]
    st_8b4f08_0 *v2;  // [bp-0x70], Other Possible Types: void*
    void* v3;  // [bp-0x60]
    st_8b4f08_0 **v4;  // [bp-0x48], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = a0[1];
    v8 = a0;
    if (v7 == *v8)
    {
        v9 = a0[2];
        v10 = a0[3];
        if (v10 > v9)
        {
            v11 = (long long)((v10 ^ -v9) + (v10 + (-v9 | ~v10)) * 2 + 2) >> 3;
            v12 = (v11 + 1 + ((unsigned long long)(v11 + 1) >> 63)) * 4 & 0xfffffffffffffff8;
            v13 = v9 + v12;
            v2 = &v4;
            v4 = &v2;
            v14 = v13 - (v9 + v7 + (v9 + (-v7 | ~v9) + (-v7 & ~v9)) * 2 + 2);
            v8 = sub_13bbc(v14);
            v7 = v13 * 2 + v14 + (-v13 & ~v14) * 2 + (v14 + (-v13 | ~v14)) * 2 + 2;
            v15 = a0[2];
            a0[1] = v7;
            a0[2] = v15 + v12;
        }
        else
        {
            sub_ec54();
            v16 = a0[2];
            v17 = -a0[1];
            sub_159aa4(&v2, a0[1], (long long)((v16 ^ v17) + (v16 + (v17 | ~v16)) * 2 + 2) >> 3);
            v18 = (void*)*(int128_t *)a0;
            v19 = (void*)*(int128_t *)&a0[2];
            *(uint128_t *)a0 = (uint128_t)v2;
            *(uint128_t *)&a0[2] = (uint128_t)v3;
            v2 = v18;
            v3 = v19;
            v8 = sub_1089c(&v2);
            v7 = a0[1];
        }
    }
    v20 = v8;
    *(unsigned long long *)((char *)v7 - 8) = *a1;
    a0[1] = a0[1] - 8;
    return v20;
}
