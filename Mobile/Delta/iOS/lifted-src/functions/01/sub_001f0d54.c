/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0d54..0x1f0e7c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0d54_0 {
    char field_0;
} st_1f0d54_0;


double sub_1f0d54(void* a0, unsigned long long a1)
{
    long long v11;  // x0
    long long v12;  // x20
    long long v13;  // x8
    unsigned long v14;  // x9
    unsigned long v15;  // d0
    st_1f0d54_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1f0d54_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68], Other Possible Types: long long
    long long v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x58]
    long long v5;  // [bp-0x58]
    unsigned long v6;  // [bp-0x50]
    st_1f0d54_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_1f0d54_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    if (a1 <= (unsigned long long)(((long long)a0[16] - (long long)a0[8] >> 3) * 12297829382473034411))
    {
        sub_1aab6c(a0);
        return v15;
    }
    v11 = sub_1e4b0(a0, a1 + 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 3));
    sub_16a40(&v2, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 3), a0);
    sub_1b82ec(&v2, a1);
    v8 = &v7;
    v7 = &v8;
    v12 = v3 + *(long long *)a0 - (long long)a0[8];
    sub_1f83bc(a0, *(long long *)a0, (long long)a0[8], v12);
    v13 = *(long long *)a0;
    *(long long *)a0 = v12;
    v14 = (long long)a0[16];
    *(uint128_t *)&a0[8] = v4;
    v5 = v13;
    v6 = v14;
    v2 = v13;
    v3 = v13;
    sub_1f268(&v2);
    return *(unsigned long long *)&v4;
}
