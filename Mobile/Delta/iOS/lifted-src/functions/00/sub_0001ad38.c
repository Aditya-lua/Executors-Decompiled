/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ad38..0x1ae50 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ad38_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_1ad38_1;

typedef struct st_1ad38_0 {
    char field_0;
} st_1ad38_0;


long long sub_1ad38(void* a0, st_1ad38_1 *a1)
{
    long long v11;  // x0
    uint128_t v12;  // q0
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    uint128_t v0;  // [bp-0x90]
    st_1ad38_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_1ad38_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_1ad38_1 *v5;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x50]
    st_1ad38_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_1ad38_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_13bcc();
    sub_10900(&v3, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 4), a0);
    v12 = a1->field_0;
    v5->field_10 = a1->field_10;
    v5->field_0 = v12;
    sub_5c38((char *)&v5[1].field_0 + 4, (char *)&a1[1].field_0 + 4);
    v5 = _INSERT(CONCAT(v5, 0), 0, (char *)&v5[2].field_0 + 8);
    v8 = &v7;
    v7 = &v8;
    v13 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_1c650(a0, *(long long *)a0, (long long)a0[8], v13);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    v0 = v5;
    *(uint128_t *)&a0[8] = v5;
    v5 = v14;
    v6 = v15;
    v3 = v14;
    v4 = v14;
    sub_2123c(&v3);
    return (unsigned long long)v0;
}
