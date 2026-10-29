/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b3b0..0x3b4b0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b3b0_0 {
    char field_0;
} st_3b3b0_0;


double sub_3b3b0(void* a0, long long a1)
{
    long long v11;  // x0
    long long n;  // x2
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    unsigned long v16;  // d0
    st_3b3b0_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_3b3b0_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58], Other Possible Types: long long
    long long v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x48]
    long long v5;  // [bp-0x48]
    unsigned long v6;  // [bp-0x40]
    st_3b3b0_0 **v7;  // [bp-0x30], Other Possible Types: char
    st_3b3b0_0 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)a1 <= (unsigned long long)((long long)a0[16] - (long long)a0[8] >> 4))
    {
        sub_2b448(a0);
        return v16;
    }
    v11 = sub_20b20(a0, a1 + ((long long)a0[8] - *(long long *)a0 >> 4));
    sub_1b298(&v2, v11, (long long)a0[8] - *(long long *)a0 >> 4, a0);
    sub_3f254(&v2, a1);
    v8 = &v7;
    v7 = &v8;
    n = (long long)a0[8] - *(long long *)a0;
    v13 = v3 - n;
    _memcpy(v13, *(long long *)a0, n);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    *(uint128_t *)&a0[8] = v4;
    v5 = v14;
    v6 = v15;
    v2 = v14;
    v3 = v14;
    sub_15f4c(&v2);
    return *(unsigned long long *)&v4;
}
