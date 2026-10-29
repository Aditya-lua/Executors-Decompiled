/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29860..0x29964 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29860_0 {
    char field_0;
} st_29860_0;


long long sub_29860(void* a0, long long a1)
{
    long long v11;  // x0
    long long v12;  // x20
    long long v13;  // x8
    unsigned long v14;  // x9
    uint128_t v0;  // [bp-0x90]
    st_29860_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_29860_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x58], Other Possible Types: long long
    unsigned long v6;  // [bp-0x50]
    st_29860_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_29860_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_2916c();
    sub_29abc(&v3, v11, 17361641481138401521 * ((long long)a0[8] - *(long long *)a0 >> 3), a0);
    sub_2fb6c(v5, a1);
    v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 0x88);
    v8 = &v7;
    v7 = &v8;
    v12 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_30de8(a0, *(long long *)a0, (long long)a0[8], v12);
    v13 = *(long long *)a0;
    *(long long *)a0 = v12;
    v14 = (long long)a0[16];
    v0 = v5;
    *(uint128_t *)&a0[8] = v5;
    v5 = v13;
    v6 = v14;
    v3 = v13;
    v4 = v13;
    sub_30848(&v3);
    return (unsigned long long)v0;
}
