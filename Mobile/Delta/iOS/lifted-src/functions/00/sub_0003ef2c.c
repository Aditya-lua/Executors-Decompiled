/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ef2c..0x3efac (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ef2c_0 {
    char padding_0[8];
    char *field_8;
    struct st_3ef2c_1 *field_10;
} st_3ef2c_0;

typedef struct st_3ef2c_1 {
    uint128_t field_0;
    unsigned short field_10;
    char padding_12[6];
    uint128_t field_18;
    unsigned long long field_28;
} st_3ef2c_1;


char * sub_3ef2c(st_3ef2c_0 *a0, st_3ef2c_1 *a1)
{
    char *v2;  // x8
    uint128_t v3;  // q0
    char *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v4 = sub_3b5f4(a0);
        a0->field_8 = v4;
        return v4 - 48;
    }
    v3 = a1->field_0;
    *(unsigned short *)&v2[16] = a1->field_10;
    *(uint128_t *)v2 = v3;
    memset(v2 + 24, 0, 24);
    *(int128_t *)&v2[24] = *(int128_t *)(a1->padding_12)[1];
    *(long long *)&v2[40] = *(long long *)((char *)&a1->field_18 + 8);
    memset((a1->padding_12)[1], 0, 24);
    a0->field_8 = v2 + 48;
    return v2;
}
