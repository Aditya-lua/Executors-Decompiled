/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd9184..0xbd929c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd9184_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bd9184_2;

typedef struct st_bd9184_1 {
    unsigned long long field_0;
    struct st_bd9184_0 *field_8;
    unsigned long long field_10;
} st_bd9184_1;

typedef struct st_bd9184_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    uint128_t field_10;
    unsigned long long field_20;
} st_bd9184_0;


double sub_bd9184(st_bd9184_2 *a0, long long a1, long long a2, st_bd9184_1 *a3)
{
    st_bd9184_0 *v11;  // x8
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long iter;  // x24
    unsigned long long v15;  // x23
    uint128_t v0;  // [bp-0xa8], Other Possible Types: char
    unsigned long v1;  // [bp-0x98]
    st_bd9184_0 *v2;  // [bp-0x90]
    st_bd9184_0 *v3;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x70]
    uint128_t v7;  // [bp-0x68]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    sub_bd8948(&v0);
    v11 = a3->field_8;
    v12 = a3->field_10 * 40;
    v13 = (char *)v11 + v12;
    v2 = v11;
    v3 = v11;
    v4 = a3->field_0;
    v5 = v13;
    if (a3->field_10)
    {
        iter = v11 + 1;
        while (1)
        {
            v15 = v12;
            if (*(long long *)(iter - 32) == 0x8000000000000000)
                break;
            v6 = *(long long *)(iter - 32);
            v7 = *(int128_t *)(iter - 24);
            v8 = *(long long *)(iter - 8);
            sub_bd929c(a1 + 24, a2, *(int *)(iter - 40), &v6);
            iter += 40;
            v12 = v15 - 40;
            if (v15 == 40)
            {
                iter = v13;
                break;
            }
        }
        v3 = iter;
    }
    sub_be6f68(&v2);
    a0->field_0 = v0;
    a0->field_10 = v1;
    return *(unsigned long long *)&v0;
}
