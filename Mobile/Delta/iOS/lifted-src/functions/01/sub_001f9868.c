/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f9868..0x1f99d8 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f9868_1 {
    char padding_0[32];
    long long field_20;
} st_1f9868_1;

typedef struct st_1f9868_0 {
    char field_0;
} st_1f9868_0;


uint128_t * sub_1f9868(st_1f9868_1 **a0, unsigned long a1, uint128_t *a2, unsigned long a3)
{
    uint128_t *v10;  // x8
    unsigned int v11;  // w9
    uint128_t *v12;  // x9
    uint128_t *v13;  // x19
    st_1f9868_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1f9868_0 *v1;  // [bp-0x78]
    uint320_t v2;  // [bp-0x70], Other Possible Types: unsigned int
    uint128_t *v3;  // [bp-0x58]
    uint128_t *v4;  // [bp-0x50]
    uint128_t *v5;  // [bp-0x48]
    uint128_t *v6;  // [bp-0x40]
    uint128_t *v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    if (sub_1fd0fc() && v6)
    {
        *(double *)&v2 = 1.294417432573e-312;
        *(uint128_t *)((char *)&v2 + 24) = 1;
        *(uint128_t *)((char *)&v2 + 8) = 0x10000000000000001;
        sub_1f2e20(&v5, 0, 1);
        v10 = v5;
        *(unsigned long long *)&v10[2] = *(unsigned long long *)((void*)&v2 + 32);
        *v10 = *(uint128_t *)&v2;
        v10[1] = *(uint128_t *)((void*)&v2 + 16);
        *(uint128_t **)((char *)&v2 + 24) = a1 + (char *)v6 + 1;
        *(unsigned long long *)((char *)&v2 + 32) = 1;
        if (!a2)
            v11 = 2;
        else
            v11 = 3;
        *(unsigned int *)&v2 = 16;
        *(unsigned int *)((char *)&v2 + 16) = v11;
        sub_1f2e20();
        v12 = v5;
        *(unsigned long long *)&v12[2] = *(unsigned long long *)((void*)&v2 + 32);
        *v12 = *(uint128_t *)&v2;
        v12[1] = *(uint128_t *)((void*)&v2 + 16);
        v2 = 21;
        v3 = 0;
        v4 = 0;
        sub_1f0e7c(&v5, (char *)v6 + 1, &v2);
        sub_1f0b68(a0, 1, &v5);
        *a0->field_20 = (char *)v6 + 1;
        v13 = 1;
    }
    else
    {
        v13 = 0;
    }
    sub_1eccac(&v5);
    return v13;
}
