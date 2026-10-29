/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c60..0x18ccc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18c60_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_18c60_1;

typedef struct st_18c60_0 {
    char padding_0[8];
    char *field_8;
    struct st_18c60_1 *field_10;
} st_18c60_0;


char * sub_18c60(st_18c60_0 *a0, st_18c60_1 *a1)
{
    char *v2;  // x20
    uint128_t v3;  // q0
    char *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v4 = sub_1ad38(a0);
        a0->field_8 = v4;
        return v4 - 48;
    }
    v3 = a1->field_0;
    *(unsigned int *)&v2[16] = a1->field_10;
    *(uint128_t *)v2 = v3;
    sub_5c38(v2 + 24, (char *)&a1[1].field_0 + 4);
    a0->field_8 = v2 + 48;
    return v2;
}
