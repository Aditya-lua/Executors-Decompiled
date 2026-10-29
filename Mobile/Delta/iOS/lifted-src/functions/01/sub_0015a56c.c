/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15a56c..0x15a690 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15a56c_0 {
    char field_0;
} st_15a56c_0;


unsigned long long ** sub_15a56c(unsigned long long **a0, unsigned long long *a1)
{
    unsigned long long *v7;  // x1
    unsigned long long **v8;  // x0
    unsigned long long *v9;  // x8
    unsigned long long *v10;  // x9
    unsigned long long v11;  // x22
    unsigned long long *v12;  // x20
    unsigned long long *v13;  // x8
    unsigned long long *v14;  // q2
    unsigned long long *v15;  // q3
    unsigned long long **v16;  // x0
    st_15a56c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_15a56c_0 *v1;  // [bp-0x68]
    st_15a56c_0 *v2;  // [bp-0x60], Other Possible Types: unsigned long long *
    unsigned long long *v3;  // [bp-0x50]
    st_15a56c_0 **v4;  // [bp-0x38], Other Possible Types: char
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
            v11 = (((long long)(v10 - v9) >> 3) + 1 + (((long long)(v10 - v9) >> 3) + 1 >> 63)) * 4 & 0xfffffffffffffff8;
            v2 = &v4;
            v4 = &v2;
            v12 = (char *)v9 + v11 - v9 + (char *)v7;
            v8 = sub_13bbc(v12);
            v13 = a0[2];
            a0[1] = v12;
            a0[2] = (char *)v13 + v11;
            v7 = v12;
        }
        else
        {
            sub_ec54();
            sub_159aa4(&v2, a0[1], (long long)(a0[2] - a0[1]) >> 3);
            v14 = (unsigned long long *)*(int128_t *)a0;
            v15 = (unsigned long long *)*(int128_t *)&a0[2];
            *(uint128_t *)a0 = (uint128_t)v2;
            *(uint128_t *)&a0[2] = (uint128_t)v3;
            v2 = v14;
            v3 = v15;
            v8 = sub_1089c(&v2);
            v7 = a0[1];
        }
    }
    v16 = v8;
    *(unsigned long long *)((char *)v7 - 8) = *a1;
    a0[1] = (char *)v7 - 8;
    return v16;
}
