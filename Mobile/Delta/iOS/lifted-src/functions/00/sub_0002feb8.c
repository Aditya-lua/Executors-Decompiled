/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2feb8..0x2ff50 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2feb8_0 {
    char padding_0[8];
    char *field_8;
    struct st_2feb8_1 *field_10;
} st_2feb8_0;

typedef struct st_2feb8_1 {
    unsigned int field_0;
    char padding_4[4];
    uint128_t field_8;
    unsigned long long field_18;
    uint128_t field_20;
    unsigned long long field_30;
} st_2feb8_1;


char * sub_2feb8(st_2feb8_0 *a0, st_2feb8_1 *a1)
{
    char *v2;  // x8
    char *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v3 = sub_2baa8(a0);
        a0->field_8 = v3;
        return v3 - 56;
    }
    *(unsigned int *)v2 = a1->field_0;
    memset(v2 + 8, 0, 24);
    *(int128_t *)&v2[8] = *(int128_t *)(a1->padding_4)[1];
    *(long long *)&v2[24] = *(long long *)((char *)&a1->field_8 + 8);
    memset((a1->padding_4)[1], 0, 24);
    memset(v2 + 32, 0, 24);
    *(int128_t *)&v2[32] = *(int128_t *)&a1->field_18;
    *(long long *)&v2[48] = a1->field_20;
    memset(&a1->field_18, 0, 24);
    a0->field_8 = v2 + 56;
    return v2;
}
