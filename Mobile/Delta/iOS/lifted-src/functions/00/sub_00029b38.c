/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29b38..0x29c50 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29b38_0 {
    char field_0;
} st_29b38_0;


unsigned long long sub_29b38(void* a0, long long a1)
{
    unsigned long v11;  // x0
    unsigned long long v12;  // x8
    long long v13;  // x0
    long long n;  // x2
    long long v15;  // x20
    long long v16;  // x8
    unsigned long long v17;  // x9
    uint128_t v0;  // [bp-0x90]
    st_29b38_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_29b38_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x58], Other Possible Types: long long
    unsigned long long v6;  // [bp-0x50]
    st_29b38_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_29b38_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = (long long)a0[8];
    if ((unsigned long long)(long long)a0[16] > v11)
    {
        v12 = sub_5c38(v11) + 24;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_1e4b0(a0, 1 + 12297829382473034411 * ((long long)(v11 - *(long long *)a0) >> 3));
        sub_16a40(&v3, v13, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 3), a0);
        sub_5c38(v5, a1);
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 24);
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
        sub_2db70(&v3);
        v12 = (unsigned long long)v0;
    }
    *(unsigned long long *)&a0[8] = v12;
    return v12 - 24;
}
