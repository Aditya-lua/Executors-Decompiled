/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c65d4..0x1c6704 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c65d4_0 {
    char field_0;
} st_1c65d4_0;


long long sub_1c65d4(void* a0, long long a1)
{
    unsigned long v11;  // x21
    long long v12;  // x8
    long long v13;  // x0
    long long n;  // x2
    long long v16;  // x20
    long long v17;  // x8
    long long v18;  // x9
    uint128_t v0;  // [bp-0x90]
    st_1c65d4_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_1c65d4_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x58], Other Possible Types: long long
    long long v6;  // [bp-0x50]
    st_1c65d4_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_1c65d4_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = (long long)a0[8];
    if ((unsigned long long)(long long)a0[16] > v11)
    {
        sub_5c38(v11, a1);
        sub_5c38(v11 + 24, a1 + 24);
        v12 = v11 + 48;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_13bcc(a0, 1 + 12297829382473034411 * ((long long)(v11 - *(long long *)a0) >> 4));
        sub_10900(&v3, v13, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 4), a0);
        sub_5c38(sub_5c38(v5, a1) + 24, a1 + 24);
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 48);
        v8 = &v7;
        v7 = &v8;
        n = (long long)a0[8] - *(long long *)a0;
        v16 = v4 - n;
        _memcpy(v16, *(long long *)a0, n);
        v17 = *(long long *)a0;
        *(long long *)a0 = v16;
        v18 = (long long)a0[16];
        v0 = v5;
        *(uint128_t *)&a0[8] = v5;
        v5 = v17;
        v6 = v18;
        v3 = v17;
        v4 = v17;
        sub_1c3670(&v3);
        v12 = (unsigned long long)v0;
    }
    *(long long *)&a0[8] = v12;
    return v12 - 48;
}
