/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x318bc..0x319d0 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_318bc_0 {
    long long field_0;
    unsigned int *field_8;
    unsigned int *field_10;
} st_318bc_0;

typedef struct st_318bc_1 {
    char field_0;
} st_318bc_1;


unsigned int * sub_318bc(st_318bc_0 *a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int *v11;  // x8
    unsigned int *v12;  // x8
    long long v13;  // x0
    long long n;  // x2
    long long v15;  // x20
    long long v16;  // x8
    unsigned int *v17;  // x9
    uint128_t v0;  // [bp-0x90]
    st_318bc_1 **v1;  // [bp-0x78], Other Possible Types: char
    st_318bc_1 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    unsigned int *v5;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned int *v6;  // [bp-0x50]
    st_318bc_1 **v7;  // [bp-0x40], Other Possible Types: char
    st_318bc_1 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        *v11 = *a1;
        v11[1] = *a2;
        v12 = v11 + 2;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_10104(a0, ((char *)v11 - a0->field_0 >> 3) + 1);
        sub_22004(&v3, v13, (char *)a0->field_8 - a0->field_0 >> 3, a0);
        *v5 = *a1;
        v5[1] = *a2;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 2);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v15 = v4 - n;
        _memcpy(v15, a0->field_0, n);
        v16 = a0->field_0;
        a0->field_0 = v15;
        v17 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v16;
        v6 = v17;
        v3 = v16;
        v4 = v16;
        sub_13618(&v3);
        v12 = (unsigned long long)v0;
    }
    a0->field_8 = v12;
    return (char *)v12 - 8;
}
