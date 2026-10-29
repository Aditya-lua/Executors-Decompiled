/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167790..0x1678a0 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167790_0 {
    char field_0;
} st_167790_0;


unsigned long long sub_167790(void* a0, long long a1)
{
    unsigned long v11;  // x0
    unsigned long long v12;  // x0
    long long v13;  // x0
    long long n;  // x2
    long long v15;  // x20
    long long v16;  // x8
    unsigned long long v17;  // x9
    uint128_t v0;  // [bp-0x80]
    st_167790_0 **v1;  // [bp-0x68], Other Possible Types: char
    st_167790_0 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x48], Other Possible Types: long long
    unsigned long long v6;  // [bp-0x40]
    st_167790_0 **v7;  // [bp-0x30], Other Possible Types: char
    st_167790_0 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = (long long)a0[8];
    if ((unsigned long long)(long long)a0[16] <= v11)
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_20b20(a0, ((long long)(v11 - *(long long *)a0) >> 4) + 1);
        sub_1b298(&v3, v13, (long long)a0[8] - *(long long *)a0 >> 4, a0);
        sub_61070(v5, a1);
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 16);
        v8 = &v7;
        v7 = &v8;
        n = (long long)a0[8] - *(long long *)a0;
        v15 = v4 - n;
        _memcpy(v15, *(long long *)a0, n);
        v16 = *(long long *)a0;
        *(long long *)a0 = v15;
        v17 = (long long)a0[16];
        v0 = v5;
        *(uint128_t *)&a0[8] = v5;
        v5 = v16;
        v6 = v17;
        v3 = v16;
        v4 = v16;
        sub_168584(&v3);
        *(unsigned long long *)&a0[8] = v0;
        return (unsigned long long)v0 - 16;
    }
    v12 = sub_61070(v11);
    *(unsigned long long *)&a0[8] = v12 + 16;
    return v12 - 0;
}
