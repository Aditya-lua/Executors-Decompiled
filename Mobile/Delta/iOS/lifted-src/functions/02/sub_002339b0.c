/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2339b0..0x233a94 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2339b0_1 {
    char field_0;
    char padding_1[23];
    unsigned int field_18;
} st_2339b0_1;

typedef struct st_2339b0_0 {
    char field_0;
} st_2339b0_0;


long long sub_2339b0(void* a0, long long a1)
{
    long long v11;  // x0
    long long n;  // x2
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    uint128_t v0;  // [bp-0x80]
    st_2339b0_0 **v1;  // [bp-0x68], Other Possible Types: char
    st_2339b0_0 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    st_2339b0_1 *v5;  // [bp-0x48], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x40]
    st_2339b0_0 **v7;  // [bp-0x30], Other Possible Types: char
    st_2339b0_0 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_19300();
    sub_12854(&v3, v11, (long long)a0[8] - *(long long *)a0 >> 5, a0);
    v5->field_0 = 0;
    v5->field_18 = 0xffffffff;
    sub_234a74(v5, a1);
    v5 = _INSERT(CONCAT(v5, 0), 0, &v5[1].padding_1[3]);
    v8 = &v7;
    v7 = &v8;
    n = (long long)a0[8] - *(long long *)a0;
    v13 = v4 - n;
    _memcpy(v13, *(long long *)a0, n);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    v0 = v5;
    *(uint128_t *)&a0[8] = v5;
    v5 = v14;
    v6 = v15;
    v3 = v14;
    v4 = v14;
    sub_237bec(&v3);
    return (unsigned long long)v0;
}
