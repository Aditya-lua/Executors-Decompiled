/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4abf4..0x4ac64 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4abf4_0 {
    char padding_0[8];
    char *field_8;
    struct st_4abf4_1 *field_10;
} st_4abf4_0;

typedef struct st_4abf4_1 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
} st_4abf4_1;


char * sub_4abf4(st_4abf4_0 *a0, st_4abf4_1 *a1)
{
    char *v2;  // x8
    char *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v3 = sub_4ae58(a0);
        a0->field_8 = v3;
        return v3 - 40;
    }
    *(unsigned long long *)v2 = a1->field_0;
    *(int128_t *)&v2[8] = *(int128_t *)&(&a1->field_0)[1];
    *(long long *)&v2[24] = *(long long *)((char *)&a1->field_8 + 8);
    memset(a1, 0, 24);
    a0->field_8 = v2 + 40;
    return v2;
}
