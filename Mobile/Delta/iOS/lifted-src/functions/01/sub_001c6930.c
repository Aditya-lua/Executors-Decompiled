/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6930..0x1c69d8 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6930_0 {
    char padding_0[8];
    char *field_8;
    struct st_1c6930_1 *field_10;
} st_1c6930_0;

typedef struct st_1c6930_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
    unsigned long long field_50;
    char field_55;
} st_1c6930_1;


char * sub_1c6930(st_1c6930_0 *a0, st_1c6930_1 *a1)
{
    char *v2;  // x8
    uint128_t v3;  // q1
    unsigned long long v4;  // x9
    char *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v5 = sub_1c0994(a0);
        a0->field_8 = v5;
        return v5 - 96;
    }
    v3 = a1->field_10;
    *(uint128_t *)v2 = a1->field_0;
    *(uint128_t *)&v2[16] = v3;
    memset(v2 + 32, 0, 24);
    *(uint128_t *)&v2[32] = a1->field_20;
    *(unsigned long long *)&v2[48] = a1->field_30;
    memset(&a1->field_20, 0, 24);
    memset(v2 + 56, 0, 24);
    *(int128_t *)&v2[56] = *(int128_t *)&(&a1->field_30)[1];
    *(long long *)&v2[72] = *(long long *)((char *)&a1->field_38 + 8);
    memset(&(&a1->field_30)[1], 0, 24);
    v4 = a1->field_48;
    *(long long *)&v2[0x55] = *(long long *)((char *)&a1->field_48 + 5);
    *(unsigned long long *)&v2[80] = v4;
    a0->field_8 = v2 + 96;
    return v2;
}
